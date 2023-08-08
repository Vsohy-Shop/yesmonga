package kotlin.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@C10862d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kotlin.annotation.c */
public @interface C10861c {
    AnnotationRetention value() default AnnotationRetention.RUNTIME;
}
