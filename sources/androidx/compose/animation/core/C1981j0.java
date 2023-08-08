package androidx.compose.animation.core;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.j0 */
public final class C1981j0 implements C1961e0 {

    /* renamed from: d */
    public static final int f5515d = 0;

    /* renamed from: a */
    public final int f5516a;

    /* renamed from: b */
    public final int f5517b;
    @C12579k

    /* renamed from: c */
    public final C2022z f5518c;

    public C1981j0() {
        this(0, 0, (C2022z) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public float mo6814d(long j, float f, float f2, float f3) {
        float f4;
        long h = mo6860h(j / 1000000);
        int i = this.f5516a;
        if (i == 0) {
            f4 = 1.0f;
        } else {
            f4 = ((float) h) / ((float) i);
        }
        return VectorConvertersKt.m8226k(f, f2, this.f5518c.mo6791a(C11479u.m44331H(f4, 0.0f, 1.0f)));
    }

    /* renamed from: e */
    public float mo6815e(long j, float f, float f2, float f3) {
        long h = mo6860h(j / 1000000);
        int i = (h > 0 ? 1 : (h == 0 ? 0 : -1));
        if (i < 0) {
            return 0.0f;
        }
        if (i == 0) {
            return f3;
        }
        return (mo6814d(h * 1000000, f, f2, f3) - mo6814d((h - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }

    /* renamed from: f */
    public long mo6816f(float f, float f2, float f3) {
        return ((long) (this.f5517b + this.f5516a)) * 1000000;
    }

    /* renamed from: h */
    public final long mo6860h(long j) {
        return C11479u.m44340K(j - ((long) this.f5517b), 0, (long) this.f5516a);
    }

    /* renamed from: i */
    public final int mo6861i() {
        return this.f5517b;
    }

    /* renamed from: j */
    public final int mo6862j() {
        return this.f5516a;
    }

    public C1981j0(int i, int i2, @C12579k C2022z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "easing");
        this.f5516a = i;
        this.f5517b = i2;
        this.f5518c = zVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1981j0(int i, int i2, C2022z zVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? C1947b0.m8290b() : zVar);
    }
}
