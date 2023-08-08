package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.n1 */
public final class C1996n1<V extends C1997o> implements C1970g1<V> {

    /* renamed from: d */
    public static final int f5570d = 8;

    /* renamed from: a */
    public final float f5571a;

    /* renamed from: b */
    public final float f5572b;

    /* renamed from: c */
    public final /* synthetic */ C1974h1<V> f5573c;

    public C1996n1(float f, float f2, C2003q qVar) {
        this.f5571a = f;
        this.f5572b = f2;
        this.f5573c = new C1974h1<>(qVar);
    }

    /* renamed from: a */
    public boolean mo6801a() {
        return this.f5573c.mo6801a();
    }

    /* renamed from: b */
    public long mo6802b(@C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return this.f5573c.mo6802b(v, v2, v3);
    }

    @C12579k
    /* renamed from: f */
    public V mo6803f(@C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return this.f5573c.mo6803f(v, v2, v3);
    }

    @C12579k
    /* renamed from: j */
    public V mo6804j(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return this.f5573c.mo6804j(j, v, v2, v3);
    }

    @C12579k
    /* renamed from: m */
    public V mo6805m(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return this.f5573c.mo6805m(j, v, v2, v3);
    }

    /* renamed from: n */
    public final float mo6941n() {
        return this.f5571a;
    }

    /* renamed from: o */
    public final float mo6942o() {
        return this.f5572b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1996n1(float f, float f2, C1997o oVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : oVar);
    }

    public C1996n1(float f, float f2, @C12580l V v) {
        this(f, f2, C1957d1.m8316d(v, f, f2));
    }
}
