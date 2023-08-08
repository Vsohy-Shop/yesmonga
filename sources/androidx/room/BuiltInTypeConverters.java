package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.C11076d0;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {})
@Target({})
@C10861c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
public @interface BuiltInTypeConverters {

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo22516d2 = {"Landroidx/room/BuiltInTypeConverters$State;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "room-common"}, mo22517k = 1, mo22518mv = {1, 7, 1})
    public enum State {
        ENABLED,
        DISABLED,
        INHERITED
    }

    State enums() default State.INHERITED;

    State uuid() default State.INHERITED;
}
