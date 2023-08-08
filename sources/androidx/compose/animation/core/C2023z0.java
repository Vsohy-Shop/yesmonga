package androidx.compose.animation.core;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.animation.core.z0 */
public final class C2023z0<T> implements C2020y<T> {

    /* renamed from: d */
    public static final int f5653d = 0;

    /* renamed from: a */
    public final int f5654a;

    /* renamed from: b */
    public final int f5655b;
    @C12579k

    /* renamed from: c */
    public final C2022z f5656c;

    public C2023z0() {
        this(0, 0, (C2022z) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof C2023z0)) {
            return false;
        }
        C2023z0 z0Var = (C2023z0) obj;
        if (z0Var.f5654a == this.f5654a && z0Var.f5655b == this.f5655b && Intrinsics.areEqual((Object) z0Var.f5656c, (Object) this.f5656c)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final int mo7011h() {
        return this.f5655b;
    }

    public int hashCode() {
        return (((this.f5654a * 31) + this.f5656c.hashCode()) * 31) + this.f5655b;
    }

    /* renamed from: i */
    public final int mo7013i() {
        return this.f5654a;
    }

    @C12579k
    /* renamed from: j */
    public final C2022z mo7014j() {
        return this.f5656c;
    }

    @C12579k
    /* renamed from: k */
    public <V extends C1997o> C1999o1<V> m8682a(@C12579k C1945a1<T, V> a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "converter");
        return new C1999o1<>(this.f5654a, this.f5655b, this.f5656c);
    }

    public C2023z0(int i, int i2, @C12579k C2022z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "easing");
        this.f5654a = i;
        this.f5655b = i2;
        this.f5656c = zVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2023z0(int i, int i2, C2022z zVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? C1947b0.m8290b() : zVar);
    }
}
