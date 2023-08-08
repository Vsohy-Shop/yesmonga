package kotlin.jvm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.CONSTRUCTOR})
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@C10861c(AnnotationRetention.SOURCE)
@Retention(RetentionPolicy.SOURCE)
/* renamed from: kotlin.jvm.t */
public @interface C11392t {
    Class<? extends Throwable>[] exceptionClasses();
}
