package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.CLASS})
@Target({ElementType.TYPE})
@C10861c(AnnotationRetention.BINARY)
@Repeatable(C20360a.class)
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.room.q1 */
public @interface C20359q1 {

    @C10862d(allowedTargets = {AnnotationTarget.CLASS})
    @Target({ElementType.TYPE})
    @C10861c(AnnotationRetention.BINARY)
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: androidx.room.q1$a */
    public @interface C20360a {
        C20359q1[] value();
    }

    String fromTableName();

    String toTableName();
}
