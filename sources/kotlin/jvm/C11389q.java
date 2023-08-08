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

@C10862d(allowedTargets = {AnnotationTarget.CLASS})
@Documented
@Target({ElementType.TYPE})
@C10861c(AnnotationRetention.RUNTIME)
@C10859a
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kotlin.jvm.q */
public @interface C11389q {
    String value();
}
