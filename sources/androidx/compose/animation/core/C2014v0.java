package androidx.compose.animation.core;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.animation.core.v0 */
public final class C2014v0<T> implements C1956d0<T> {

    /* renamed from: d */
    public static final int f5633d = 0;

    /* renamed from: a */
    public final float f5634a;

    /* renamed from: b */
    public final float f5635b;
    @C12580l

    /* renamed from: c */
    public final T f5636c;

    public C2014v0() {
        this(0.0f, 0.0f, (Object) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof C2014v0)) {
            return false;
        }
        C2014v0 v0Var = (C2014v0) obj;
        if (v0Var.f5634a == this.f5634a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (v0Var.f5635b == this.f5635b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !Intrinsics.areEqual((Object) v0Var.f5636c, (Object) this.f5636c)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final float mo6992h() {
        return this.f5634a;
    }

    public int hashCode() {
        T t = this.f5636c;
        return ((((t != null ? t.hashCode() : 0) * 31) + Float.hashCode(this.f5634a)) * 31) + Float.hashCode(this.f5635b);
    }

    /* renamed from: i */
    public final float mo6994i() {
        return this.f5635b;
    }

    @C12580l
    /* renamed from: j */
    public final T mo6995j() {
        return this.f5636c;
    }

    @C12579k
    /* renamed from: k */
    public <V extends C1997o> C1996n1<V> m8637a(@C12579k C1945a1<T, V> a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "converter");
        return new C1996n1<>(this.f5634a, this.f5635b, C1972h.m8377b(a1Var, this.f5636c));
    }

    public C2014v0(float f, float f2, @C12580l T t) {
        this.f5634a = f;
        this.f5635b = f2;
        this.f5636c = t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2014v0(float f, float f2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }
}
