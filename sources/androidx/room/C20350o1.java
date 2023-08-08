package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION})
@Target({ElementType.FIELD, ElementType.METHOD})
@C10861c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.room.o1 */
public @interface C20350o1 {
    C20309f0 associateBy() default @C20309f0(Object.class);

    Class<?> entity() default Object.class;

    String entityColumn();

    String parentColumn();

    String[] projection() default {};
}
