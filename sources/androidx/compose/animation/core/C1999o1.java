package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.o1 */
public final class C1999o1<V extends C1997o> implements C1966f1<V> {

    /* renamed from: e */
    public static final int f5579e = 8;

    /* renamed from: a */
    public final int f5580a;

    /* renamed from: b */
    public final int f5581b;
    @C12579k

    /* renamed from: c */
    public final C2022z f5582c;
    @C12579k

    /* renamed from: d */
    public final C1974h1<V> f5583d;

    public C1999o1() {
        this(0, 0, (C2022z) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public int mo6843e() {
        return this.f5581b;
    }

    /* renamed from: g */
    public int mo6844g() {
        return this.f5580a;
    }

    @C12579k
    /* renamed from: j */
    public V mo6804j(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return this.f5583d.mo6804j(j, v, v2, v3);
    }

    @C12579k
    /* renamed from: m */
    public V mo6805m(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return this.f5583d.mo6805m(j, v, v2, v3);
    }

    @C12579k
    /* renamed from: n */
    public final C2022z mo6950n() {
        return this.f5582c;
    }

    public C1999o1(int i, int i2, @C12579k C2022z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "easing");
        this.f5580a = i;
        this.f5581b = i2;
        this.f5582c = zVar;
        this.f5583d = new C1974h1<>((C1961e0) new C1981j0(mo6844g(), mo6843e(), zVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1999o1(int i, int i2, C2022z zVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? C1947b0.m8290b() : zVar);
    }
}
