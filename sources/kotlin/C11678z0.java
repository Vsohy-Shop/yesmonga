package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.CLASS})
@Target({ElementType.TYPE})
@C11665v0(version = "1.8")
@C10861c(AnnotationRetention.BINARY)
@C11433r
@Retention(RetentionPolicy.CLASS)
/* renamed from: kotlin.z0 */
public @interface C11678z0 {
    Class<? extends Annotation> markerClass();
}
