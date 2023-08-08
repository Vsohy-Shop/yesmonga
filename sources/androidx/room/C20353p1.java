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
@Repeatable(C20354a.class)
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.room.p1 */
public @interface C20353p1 {

    @C10862d(allowedTargets = {AnnotationTarget.CLASS})
    @Target({ElementType.TYPE})
    @C10861c(AnnotationRetention.BINARY)
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: androidx.room.p1$a */
    public @interface C20354a {
        C20353p1[] value();
    }

    String fromColumnName();

    String tableName();

    String toColumnName();
}
