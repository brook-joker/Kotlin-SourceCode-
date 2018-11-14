// !WITH_NEW_INFERENCE
//For testing error messages text see DiagnosticMessageTest.testFunctionPlaceholder
package a

class A<T, R>
fun <T, R> foo(a: A<T, R>) = a
fun <T, R> bar(f: (T) -> R) = f

fun test() {
    <!OI;TYPE_INFERENCE_PARAMETER_CONSTRAINT_ERROR!>foo<!> <!TYPE_MISMATCH!>{ <!UNRESOLVED_REFERENCE!>it<!> }<!>
    <!OI;TYPE_INFERENCE_PARAMETER_CONSTRAINT_ERROR!>foo<!> <!TYPE_MISMATCH!>{ <!OI;CANNOT_INFER_PARAMETER_TYPE!>x<!> -> <!OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>x<!>}<!>
    <!OI;TYPE_INFERENCE_PARAMETER_CONSTRAINT_ERROR!>foo<!> <!TYPE_MISMATCH!>{ x: Int -> x}<!>

    <!OI;TYPE_INFERENCE_NO_INFORMATION_FOR_PARAMETER!>bar<!> { <!OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>it<!> <!NI;DEBUG_INFO_UNRESOLVED_WITH_TARGET, NI;UNRESOLVED_REFERENCE_WRONG_RECEIVER, OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>+<!> 1 }
    <!OI;TYPE_INFERENCE_NO_INFORMATION_FOR_PARAMETER!>bar<!> { <!OI;CANNOT_INFER_PARAMETER_TYPE!>x<!> -> <!OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>x<!> <!NI;DEBUG_INFO_UNRESOLVED_WITH_TARGET, NI;UNRESOLVED_REFERENCE_WRONG_RECEIVER, OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>+<!> 1}
    bar { x: Int -> x + 1}
}