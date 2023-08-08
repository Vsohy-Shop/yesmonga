package androidx.compose.animation.core;

import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.core.x */
public final class C2017x {
    /* renamed from: a */
    public static final float m8654a(@C12579k C2013v<Float> vVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        return ((C1983k) vVar.mo6990a(VectorConvertersKt.m8224i(C11377x.f28521a)).mo6820d(C2000p.m8565a(f), C2000p.m8565a(f2))).mo6872f();
    }

    /* renamed from: b */
    public static final <T, V extends C1997o> T m8655b(@C12579k C2013v<T> vVar, @C12579k C1945a1<T, V> a1Var, T t, T t2) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
        return a1Var.mo6793b().invoke(vVar.mo6990a(a1Var).mo6820d((C1997o) a1Var.mo6792a().invoke(t), (C1997o) a1Var.mo6792a().invoke(t2)));
    }

    @C12579k
    /* renamed from: c */
    public static final <T> C2013v<T> m8656c(float f, float f2) {
        return m8658e(new C1973h0(f, f2));
    }

    /* renamed from: d */
    public static /* synthetic */ C2013v m8657d(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.1f;
        }
        return m8656c(f, f2);
    }

    @C12579k
    /* renamed from: e */
    public static final <T> C2013v<T> m8658e(@C12579k C1965f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        return new C2015w(f0Var);
    }
}
