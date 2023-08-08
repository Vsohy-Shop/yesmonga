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

@C10862d(allowedTargets = {AnnotationTarget.f28075b, AnnotationTarget.f28082w, AnnotationTarget.f28083x, AnnotationTarget.f28084y, AnnotationTarget.f28081v, AnnotationTarget.f28078e, AnnotationTarget.f28080g})
@C10861c(AnnotationRetention.f28067b)
@Documented
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@C10859a
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.annotation.x0 */
public @interface C0380x0 {

    @C10862d(allowedTargets = {AnnotationTarget.f28078e, AnnotationTarget.f28082w, AnnotationTarget.f28083x, AnnotationTarget.f28084y, AnnotationTarget.f28080g})
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.annotation.x0$a */
    public @interface C0381a {
        C0380x0 value() default @C0380x0;
    }

    @C10862d(allowedTargets = {AnnotationTarget.f28078e, AnnotationTarget.f28082w, AnnotationTarget.f28083x, AnnotationTarget.f28084y, AnnotationTarget.f28080g})
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.annotation.x0$b */
    public @interface C0382b {
        C0380x0 value() default @C0380x0;
    }

    String[] allOf() default {};

    String[] anyOf() default {};

    boolean conditional() default false;

    String value() default "";
}
