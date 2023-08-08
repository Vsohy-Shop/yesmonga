package kotlin.coroutines.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.C11665v0;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10862d;
import kotlin.jvm.C11314h;

@C10862d(allowedTargets = {AnnotationTarget.CLASS})
@Target({ElementType.TYPE})
@C11665v0(version = "1.3")
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kotlin.coroutines.jvm.internal.d */
public @interface C11067d {
    @C11314h(name = "c")
    /* renamed from: c */
    String mo22501c() default "";

    @C11314h(name = "f")
    /* renamed from: f */
    String mo22502f() default "";

    @C11314h(name = "i")
    /* renamed from: i */
    int[] mo22503i() default {};

    @C11314h(name = "l")
    /* renamed from: l */
    int[] mo22504l() default {};

    @C11314h(name = "m")
    /* renamed from: m */
    String mo22505m() default "";

    @C11314h(name = "n")
    /* renamed from: n */
    String[] mo22506n() default {};

    @C11314h(name = "s")
    /* renamed from: s */
    String[] mo22507s() default {};

    @C11314h(name = "v")
    /* renamed from: v */
    int mo22508v() default 1;
}
