package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.core.p */
public final class C2000p {
    @C12579k
    /* renamed from: a */
    public static final C1983k m8565a(float f) {
        return new C1983k(f);
    }

    @C12579k
    /* renamed from: b */
    public static final C1986l m8566b(float f, float f2) {
        return new C1986l(f, f2);
    }

    @C12579k
    /* renamed from: c */
    public static final C1989m m8567c(float f, float f2, float f3) {
        return new C1989m(f, f2, f3);
    }

    @C12579k
    /* renamed from: d */
    public static final C1994n m8568d(float f, float f2, float f3, float f4) {
        return new C1994n(f, f2, f3, f4);
    }

    @C12579k
    /* renamed from: e */
    public static final <T extends C1997o> T m8569e(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        T g = m8571g(t);
        int b = g.mo6867b();
        for (int i = 0; i < b; i++) {
            g.mo6870e(i, t.mo6866a(i));
        }
        return g;
    }

    /* renamed from: f */
    public static final <T extends C1997o> void m8570f(@C12579k T t, @C12579k T t2) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(t2, "source");
        int b = t.mo6867b();
        for (int i = 0; i < b; i++) {
            t.mo6870e(i, t2.mo6866a(i));
        }
    }

    @C12579k
    /* renamed from: g */
    public static final <T extends C1997o> T m8571g(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        T c = t.mo6868c();
        Intrinsics.checkNotNull(c, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return c;
    }
}
