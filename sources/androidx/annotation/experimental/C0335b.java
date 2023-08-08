package androidx.annotation.experimental;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.f28074a, AnnotationTarget.f28077d, AnnotationTarget.f28079f, AnnotationTarget.f28080g, AnnotationTarget.f28081v, AnnotationTarget.f28082w, AnnotationTarget.f28083x, AnnotationTarget.f28084y, AnnotationTarget.f28072Y, AnnotationTarget.f28073Z})
@C11395k(message = "This annotation has been replaced by `@OptIn`", replaceWith = @C11587t0(expression = "OptIn", imports = {"androidx.annotation.OptIn"}))
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@C10861c(AnnotationRetention.f28067b)
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.annotation.experimental.b */
public @interface C0335b {
    Class<? extends Annotation>[] markerClass();
}
