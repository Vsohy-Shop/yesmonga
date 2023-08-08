package androidx.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.f28074a, AnnotationTarget.f28077d, AnnotationTarget.f28079f, AnnotationTarget.f28080g, AnnotationTarget.f28081v, AnnotationTarget.f28082w, AnnotationTarget.f28083x, AnnotationTarget.f28084y, AnnotationTarget.f28072Y, AnnotationTarget.f28073Z})
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE})
@C10861c(AnnotationRetention.f28067b)
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.annotation.r0 */
public @interface C0368r0 {
    Class<? extends Annotation>[] markerClass();
}
