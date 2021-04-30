// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR

class C<T>(val t: T) {
    override fun hashCode(): Int = t as Int
}

inline class IC<TT>(val c: C<TT>) {
    fun foo(): Int = c.hashCode()
}

fun box(): String {
    val ic = IC<Int>(C(42))

    if (ic.foo() != 42) return "FAIL"
    return "OK"
}