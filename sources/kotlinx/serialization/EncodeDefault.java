package kotlinx.serialization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.C11076d0;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.PROPERTY})
@Target({})
@C12200d
@Retention(RetentionPolicy.RUNTIME)
public @interface EncodeDefault {

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Lkotlinx/serialization/EncodeDefault$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "kotlinx-serialization-core"}, mo22517k = 1, mo22518mv = {1, 6, 0})
    @C12200d
    public enum Mode {
        ALWAYS,
        NEVER
    }

    Mode mode() default Mode.ALWAYS;
}
