// !DIAGNOSTICS: -MUST_BE_INITIALIZED_OR_BE_ABSTRACT -TYPE_PARAMETER_OF_PROPERTY_NOT_USED_IN_RECEIVER
class My {
    fun <<!CYCLIC_GENERIC_UPPER_BOUND!>T: T?<!>> foo() {}
    val <<!CYCLIC_GENERIC_UPPER_BOUND!>T: T?<!>> prop: T
}