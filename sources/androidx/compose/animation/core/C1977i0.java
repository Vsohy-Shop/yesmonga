package androidx.compose.animation.core;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.i0 */
public final class C1977i0 implements C1961e0 {

    /* renamed from: e */
    public static final int f5505e = 8;

    /* renamed from: a */
    public final float f5506a;

    /* renamed from: b */
    public final float f5507b;

    /* renamed from: c */
    public final float f5508c;
    @C12579k

    /* renamed from: d */
    public final C2010t0 f5509d;

    public C1977i0() {
        this(0.0f, 0.0f, 0.0f, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public float mo6813c(float f, float f2, float f3) {
        return 0.0f;
    }

    /* renamed from: d */
    public float mo6814d(long j, float f, float f2, float f3) {
        this.f5509d.mo6985g(f2);
        return C1995n0.m8535h(this.f5509d.mo6987i(f, f3, j / 1000000));
    }

    /* renamed from: e */
    public float mo6815e(long j, float f, float f2, float f3) {
        this.f5509d.mo6985g(f2);
        return C1995n0.m8536i(this.f5509d.mo6987i(f, f3, j / 1000000));
    }

    /* renamed from: f */
    public long mo6816f(float f, float f2, float f3) {
        float d = this.f5509d.mo6982d();
        float b = this.f5509d.mo6980b();
        float f4 = f - f2;
        float f5 = this.f5508c;
        return SpringEstimationKt.m8060c(d, b, f3 / f5, f4 / f5, 1.0f) * 1000000;
    }

    /* renamed from: h */
    public final float mo6857h() {
        return this.f5506a;
    }

    /* renamed from: i */
    public final float mo6858i() {
        return this.f5507b;
    }

    public C1977i0(float f, float f2, float f3) {
        this.f5506a = f;
        this.f5507b = f2;
        this.f5508c = f3;
        C2010t0 t0Var = new C2010t0(1.0f);
        t0Var.mo6984f(f);
        t0Var.mo6986h(f2);
        this.f5509d = t0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1977i0(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : f3);
    }
}
