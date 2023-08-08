package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.FUNCTION})
@Target({ElementType.METHOD})
@C10861c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.room.b0 */
public @interface C20282b0 {
    Class<?> entity() default Object.class;

    @C20335l0
    int onConflict() default 3;
}
