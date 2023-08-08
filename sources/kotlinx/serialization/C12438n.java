package kotlinx.serialization;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.PROPERTY, AnnotationTarget.CLASS})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kotlinx.serialization.n */
public @interface C12438n {
    String value();
}
