package kotlin;

import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;

@C11363r0({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
/* renamed from: kotlin.q0 */
public class C11430q0 extends C11418p0 {
    @C11110f
    /* renamed from: c */
    public static final void m44033c(boolean z) {
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @C11110f
    /* renamed from: d */
    public static final void m44034d(boolean z, C11289a<? extends Object> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "lazyMessage");
        if (!z) {
            throw new IllegalStateException(aVar.invoke().toString());
        }
    }

    @C11110f
    /* renamed from: e */
    public static final <T> T m44035e(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @C11110f
    /* renamed from: f */
    public static final <T> T m44036f(T t, C11289a<? extends Object> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "lazyMessage");
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(aVar.invoke().toString());
    }

    @C11110f
    /* renamed from: g */
    public static final Void m44037g(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "message");
        throw new IllegalStateException(obj.toString());
    }

    @C11110f
    /* renamed from: h */
    public static final void m44038h(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @C11110f
    /* renamed from: i */
    public static final void m44039i(boolean z, C11289a<? extends Object> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "lazyMessage");
        if (!z) {
            throw new IllegalArgumentException(aVar.invoke().toString());
        }
    }

    @C11110f
    /* renamed from: j */
    public static final <T> T m44040j(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @C11110f
    /* renamed from: k */
    public static final <T> T m44041k(T t, C11289a<? extends Object> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "lazyMessage");
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(aVar.invoke().toString());
    }
}
