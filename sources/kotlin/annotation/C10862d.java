package kotlin.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@C10862d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Documented
@Target({ElementType.ANNOTATION_TYPE})
@C10859a
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kotlin.annotation.d */
public @interface C10862d {
    AnnotationTarget[] allowedTargets();
}
