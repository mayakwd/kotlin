// KOTLIN_CONFIGURATION_FLAGS: +JVM.EMIT_JVM_TYPE_ANNOTATIONS
// RENDER_ANNOTATIONS
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
package foo

@Target(AnnotationTarget.TYPE)
annotation class TypeAnn(val name: String)

@Target(AnnotationTarget.TYPE)
annotation class ClassTypeAnn(val name: String)

@Target(AnnotationTarget.TYPE)
@Retention(AnnotationRetention.BINARY)
annotation class TypeAnnBinary

@Target(AnnotationTarget.TYPE)
@Retention(AnnotationRetention.SOURCE)
annotation class TypeAnnSource

@Target( AnnotationTarget.TYPE_PARAMETER)
annotation class TypeParameterAnn(val name: String)

@Target(AnnotationTarget.TYPE_PARAMETER)
@Retention(AnnotationRetention.BINARY)
annotation class TypeParameterAnnBinary

@Target(AnnotationTarget.TYPE_PARAMETER)
@Retention(AnnotationRetention.SOURCE)
annotation class TypeParameterAnnSource

interface Generic<Z>
class B<Y>

class Kotlin {

    fun <@TypeParameterAnn("TP1") @TypeParameterAnnBinary @TypeParameterAnnSource T, @TypeParameterAnn("TP2") @TypeParameterAnnBinary @TypeParameterAnnSource T2> foo() {
    }

    fun <T> foo2(s: @TypeAnn("1") @TypeAnnBinary @TypeAnnSource T): @TypeAnn("2") @TypeAnnBinary @TypeAnnSource T? {
        return null
    }

    fun <Y, T: @TypeAnn("Generic") @TypeAnnBinary @TypeAnnSource Generic<@TypeAnn("Generic Argument") @TypeAnnBinary @TypeAnnSource Y>> foo3() {
    }

    fun <Y, T: @TypeAnn("Generic") Generic<@TypeAnn("Generic Argument") Y>> foo4() where T : @ClassTypeAnn("Any") Any {

    }
}
