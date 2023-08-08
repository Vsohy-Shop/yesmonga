package okio;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
@Target({ElementType.TYPE, ElementType.METHOD})
@C10861c(AnnotationRetention.BINARY)
@RequiresOptIn(level = RequiresOptIn.Level.ERROR, message = "okio's FileSystem is unstable and subject to change")
@Retention(RetentionPolicy.CLASS)
/* renamed from: okio.s */
public @interface C12519s {
}
