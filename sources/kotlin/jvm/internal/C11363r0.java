package kotlin.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.C11665v0;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.CLASS})
@Target({ElementType.TYPE})
@C11665v0(version = "1.8")
@C10861c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
/* renamed from: kotlin.jvm.internal.r0 */
public @interface C11363r0 {
    String[] value();
}
