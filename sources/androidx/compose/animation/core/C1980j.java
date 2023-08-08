package androidx.compose.animation.core;

import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.animation.core.j */
public final class C1980j {
    @C12579k
    /* renamed from: a */
    public static final C1976i<Float, C1983k> m8426a(float f, float f2, long j, long j2, boolean z) {
        return new C1976i(VectorConvertersKt.m8224i(C11377x.f28521a), Float.valueOf(f), C2000p.m8565a(f2), j, j2, z);
    }

    @C12579k
    /* renamed from: b */
    public static final <T, V extends C1997o> C1976i<T, V> m8427b(@C12579k C1945a1<T, V> a1Var, T t, T t2, long j, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
        T t3 = t2;
        return new C1976i(a1Var, t, (C1997o) a1Var.mo6792a().invoke(t2), j, j2, z);
    }

    /* renamed from: c */
    public static /* synthetic */ C1976i m8428c(float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        long j3 = Long.MIN_VALUE;
        long j4 = (i & 4) != 0 ? Long.MIN_VALUE : j;
        if ((i & 8) == 0) {
            j3 = j2;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return m8426a(f, f2, j4, j3, z);
    }

    /* renamed from: d */
    public static /* synthetic */ C1976i m8429d(C1945a1 a1Var, Object obj, Object obj2, long j, long j2, boolean z, int i, Object obj3) {
        return m8427b(a1Var, obj, obj2, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }

    @C12579k
    /* renamed from: e */
    public static final C1976i<Float, C1983k> m8430e(@C12579k C1976i<Float, C1983k> iVar, float f, float f2, long j, long j2, boolean z) {
        C1976i<Float, C1983k> iVar2 = iVar;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new C1976i(iVar.mo6847h(), Float.valueOf(f), C2000p.m8565a(f2), j, j2, z);
    }

    @C12579k
    /* renamed from: f */
    public static final <T, V extends C1997o> C1976i<T, V> m8431f(@C12579k C1976i<T, V> iVar, T t, @C12580l V v, long j, long j2, boolean z) {
        C1976i<T, V> iVar2 = iVar;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new C1976i(iVar.mo6847h(), t, v, j, j2, z);
    }

    /* renamed from: g */
    public static /* synthetic */ C1976i m8432g(C1976i iVar, float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ((Number) iVar.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((C1983k) iVar.mo6849k()).mo6872f();
        }
        float f3 = f2;
        if ((i & 4) != 0) {
            j = iVar.mo6846g();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = iVar.mo6845e();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = iVar.mo6850l();
        }
        return m8430e(iVar, f, f3, j3, j4, z);
    }

    /* renamed from: h */
    public static /* synthetic */ C1976i m8433h(C1976i iVar, Object obj, C1997o oVar, long j, long j2, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = iVar.getValue();
        }
        if ((i & 2) != 0) {
            oVar = C2000p.m8569e(iVar.mo6849k());
        }
        C1997o oVar2 = oVar;
        if ((i & 4) != 0) {
            j = iVar.mo6846g();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = iVar.mo6845e();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = iVar.mo6850l();
        }
        return m8431f(iVar, obj, oVar2, j3, j4, z);
    }

    @C12579k
    /* renamed from: i */
    public static final <T, V extends C1997o> V m8434i(@C12579k C1945a1<T, V> a1Var, T t) {
        Intrinsics.checkNotNullParameter(a1Var, "<this>");
        return C2000p.m8571g((C1997o) a1Var.mo6792a().invoke(t));
    }

    /* renamed from: j */
    public static final boolean m8435j(@C12579k C1976i<?, ?> iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (iVar.mo6845e() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }
}
