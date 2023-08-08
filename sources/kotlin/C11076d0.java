package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;
import kotlin.jvm.C11314h;

@C10862d(allowedTargets = {AnnotationTarget.CLASS})
@C11665v0(version = "1.3")
@C10861c(AnnotationRetention.RUNTIME)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kotlin.d0 */
public @interface C11076d0 {

    /* renamed from: kotlin.d0$a */
    public static final class C11077a {
        @C11395k(level = DeprecationLevel.WARNING, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        /* renamed from: a */
        public static /* synthetic */ void m42656a() {
        }

        @C11665v0(version = "1.2")
        /* renamed from: b */
        public static /* synthetic */ void m42657b() {
        }

        @C11665v0(version = "1.1")
        /* renamed from: c */
        public static /* synthetic */ void m42658c() {
        }
    }

    @C11314h(name = "bv")
    /* renamed from: bv */
    int[] mo22514bv() default {1, 0, 3};

    @C11314h(name = "d1")
    /* renamed from: d1 */
    String[] mo22515d1() default {};

    @C11314h(name = "d2")
    /* renamed from: d2 */
    String[] mo22516d2() default {};

    @C11314h(name = "k")
    /* renamed from: k */
    int mo22517k() default 1;

    @C11314h(name = "mv")
    /* renamed from: mv */
    int[] mo22518mv() default {};

    @C11314h(name = "pn")
    /* renamed from: pn */
    String mo22519pn() default "";

    @C11314h(name = "xi")
    /* renamed from: xi */
    int mo22520xi() default 0;

    @C11314h(name = "xs")
    /* renamed from: xs */
    String mo22521xs() default "";
}
