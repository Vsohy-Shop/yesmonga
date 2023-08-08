package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.core.e0 */
public interface C1961e0 extends C1968g<Float> {

    /* renamed from: androidx.compose.animation.core.e0$a */
    public static final class C1962a {
        @Deprecated
        /* renamed from: a */
        public static float m8331a(@C12579k C1961e0 e0Var, float f, float f2, float f3) {
            return C1961e0.super.mo6813c(f, f2, f3);
        }

        @Deprecated
        @C12579k
        /* renamed from: b */
        public static <V extends C1997o> C1974h1<V> m8332b(@C12579k C1961e0 e0Var, @C12579k C1945a1<Float, V> a1Var) {
            Intrinsics.checkNotNullParameter(a1Var, "converter");
            return C1961e0.super.mo6806a((C1945a1) a1Var);
        }
    }

    /* renamed from: c */
    float mo6813c(float f, float f2, float f3) {
        return mo6815e(mo6816f(f, f2, f3), f, f2, f3);
    }

    /* renamed from: d */
    float mo6814d(long j, float f, float f2, float f3);

    /* renamed from: e */
    float mo6815e(long j, float f, float f2, float f3);

    /* renamed from: f */
    long mo6816f(float f, float f2, float f3);

    @C12579k
    /* renamed from: a */
    <V extends C1997o> C1974h1<V> m8326a(@C12579k C1945a1<Float, V> a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "converter");
        return new C1974h1<>(this);
    }
}
