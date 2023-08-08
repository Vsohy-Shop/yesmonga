package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.core.i1 */
public final class C1978i1<V extends C1997o> implements C1963e1<V> {
    @C12579k

    /* renamed from: a */
    public final C1965f0 f5510a;

    /* renamed from: b */
    public V f5511b;

    /* renamed from: c */
    public V f5512c;

    /* renamed from: d */
    public V f5513d;

    /* renamed from: e */
    public final float f5514e;

    public C1978i1(@C12579k C1965f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "floatDecaySpec");
        this.f5510a = f0Var;
        this.f5514e = f0Var.mo6838a();
    }

    /* renamed from: a */
    public float mo6817a() {
        return this.f5514e;
    }

    @C12579k
    /* renamed from: b */
    public V mo6818b(long j, @C12579k V v, @C12579k V v2) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "initialVelocity");
        if (this.f5512c == null) {
            this.f5512c = C2000p.m8571g(v);
        }
        V v3 = this.f5512c;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v3 = null;
        }
        int b = v3.mo6867b();
        for (int i = 0; i < b; i++) {
            V v4 = this.f5512c;
            if (v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v4 = null;
            }
            v4.mo6870e(i, this.f5510a.mo6839b(j, v.mo6866a(i), v2.mo6866a(i)));
        }
        V v5 = this.f5512c;
        if (v5 != null) {
            return v5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    /* renamed from: c */
    public long mo6819c(@C12579k V v, @C12579k V v2) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "initialVelocity");
        if (this.f5512c == null) {
            this.f5512c = C2000p.m8571g(v);
        }
        V v3 = this.f5512c;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v3 = null;
        }
        int b = v3.mo6867b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, this.f5510a.mo6840c(v.mo6866a(i), v2.mo6866a(i)));
        }
        return j;
    }

    @C12579k
    /* renamed from: d */
    public V mo6820d(@C12579k V v, @C12579k V v2) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "initialVelocity");
        if (this.f5513d == null) {
            this.f5513d = C2000p.m8571g(v);
        }
        V v3 = this.f5513d;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            v3 = null;
        }
        int b = v3.mo6867b();
        for (int i = 0; i < b; i++) {
            V v4 = this.f5513d;
            if (v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                v4 = null;
            }
            v4.mo6870e(i, this.f5510a.mo6841d(v.mo6866a(i), v2.mo6866a(i)));
        }
        V v5 = this.f5513d;
        if (v5 != null) {
            return v5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetVector");
        return null;
    }

    @C12579k
    /* renamed from: e */
    public V mo6821e(long j, @C12579k V v, @C12579k V v2) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "initialVelocity");
        if (this.f5511b == null) {
            this.f5511b = C2000p.m8571g(v);
        }
        V v3 = this.f5511b;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v3 = null;
        }
        int b = v3.mo6867b();
        for (int i = 0; i < b; i++) {
            V v4 = this.f5511b;
            if (v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v4 = null;
            }
            v4.mo6870e(i, this.f5510a.mo6842e(j, v.mo6866a(i), v2.mo6866a(i)));
        }
        V v5 = this.f5511b;
        if (v5 != null) {
            return v5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @C12579k
    /* renamed from: f */
    public final C1965f0 mo6859f() {
        return this.f5510a;
    }
}
