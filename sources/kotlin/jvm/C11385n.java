package kotlin.jvm;

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

@C10862d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.TYPE})
@C10861c(AnnotationRetention.BINARY)
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@C10859a
@Retention(RetentionPolicy.CLASS)
/* renamed from: kotlin.jvm.n */
public @interface C11385n {
    boolean suppress() default true;
}
