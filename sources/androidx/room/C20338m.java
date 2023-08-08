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
@Repeatable(C20339a.class)
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.room.m */
public @interface C20338m {

    @C10862d(allowedTargets = {AnnotationTarget.CLASS})
    @Target({ElementType.TYPE})
    @C10861c(AnnotationRetention.BINARY)
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: androidx.room.m$a */
    public @interface C20339a {
        C20338m[] value();
    }

    String columnName();

    String tableName();
}
