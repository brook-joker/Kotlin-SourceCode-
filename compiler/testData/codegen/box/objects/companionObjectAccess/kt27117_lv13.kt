// LANGUAGE_VERSION: 1.3
// IGNORE_BACKEND: JS_IR

inline fun on(body: () -> Any) = body().toString()

class A {
    fun test() = foo()

    private companion object {
        private fun foo() = on { this }

        override fun toString() = "OK"
    }
}


fun box() = A().test()