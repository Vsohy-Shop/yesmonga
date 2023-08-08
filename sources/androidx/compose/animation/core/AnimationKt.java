package androidx.compose.animation.core;

import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class AnimationKt {

    /* renamed from: a */
    public static final long f5302a = 1000000;

    @C12579k
    /* renamed from: a */
    public static final C2011u<Float, C1983k> m7990a(@C12579k C1965f0 f0Var, float f, float f2) {
        Intrinsics.checkNotNullParameter(f0Var, "animationSpec");
        return new C2011u<>(C2017x.m8658e(f0Var), VectorConvertersKt.m8224i(C11377x.f28521a), Float.valueOf(f), C2000p.m8565a(f2));
    }

    /* renamed from: b */
    public static /* synthetic */ C2011u m7991b(C1965f0 f0Var, float f, float f2, int i, Object obj) {
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return m7990a(f0Var, f, f2);
    }

    @C12579k
    /* renamed from: c */
    public static final <T, V extends C1997o> C2021y0<T, V> m7992c(@C12579k C1968g<T> gVar, @C12579k C1945a1<T, V> a1Var, T t, T t2, T t3) {
        Intrinsics.checkNotNullParameter(gVar, "animationSpec");
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
        return new C2021y0(gVar, a1Var, t, t2, (C1997o) a1Var.mo6792a().invoke(t3));
    }

    @C12579k
    /* renamed from: d */
    public static final <V extends C1997o> C2021y0<V, V> m7993d(@C12579k C1953c1<V> c1Var, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(c1Var, "<this>");
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return new C2021y0(c1Var, VectorConvertersKt.m8216a(AnimationKt$createAnimation$1.f5303f, AnimationKt$createAnimation$2.f5304f), v, v2, v3);
    }

    /* renamed from: e */
    public static final long m7994e(@C12579k C1950c<?, ?> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.mo6797d() / 1000000;
    }

    /* renamed from: f */
    public static final <T, V extends C1997o> T m7995f(@C12579k C1950c<T, V> cVar, long j) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.mo6798e().mo6793b().invoke(cVar.mo6795b(j));
    }
}
