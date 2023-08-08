package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10859a;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.f28075b, AnnotationTarget.f28074a, AnnotationTarget.f28082w, AnnotationTarget.f28083x, AnnotationTarget.f28084y, AnnotationTarget.f28081v, AnnotationTarget.f28078e, AnnotationTarget.f28072Y})
@C10861c(AnnotationRetention.f28067b)
@Documented
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@C10859a
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.annotation.v0 */
public @interface C0376v0 {
    int api() default 1;

    int value() default 1;
}
