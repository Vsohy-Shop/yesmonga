package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.f28075b})
@Target({ElementType.ANNOTATION_TYPE})
@C10861c(AnnotationRetention.f28066a)
@Retention(RetentionPolicy.SOURCE)
/* renamed from: androidx.annotation.e0 */
public @interface C0332e0 {
    boolean flag() default false;

    boolean open() default false;

    int[] value() default {};
}
