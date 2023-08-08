package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.layout.t0 */
public final class C2409t0 {

    /* renamed from: a */
    public float f6354a;

    /* renamed from: b */
    public boolean f6355b;
    @C12580l

    /* renamed from: c */
    public C2380m f6356c;

    public C2409t0() {
        this(0.0f, false, (C2380m) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ C2409t0 m10644e(C2409t0 t0Var, float f, boolean z, C2380m mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = t0Var.f6354a;
        }
        if ((i & 2) != 0) {
            z = t0Var.f6355b;
        }
        if ((i & 4) != 0) {
            mVar = t0Var.f6356c;
        }
        return t0Var.mo8185d(f, z, mVar);
    }

    /* renamed from: a */
    public final float mo8182a() {
        return this.f6354a;
    }

    /* renamed from: b */
    public final boolean mo8183b() {
        return this.f6355b;
    }

    @C12580l
    /* renamed from: c */
    public final C2380m mo8184c() {
        return this.f6356c;
    }

    @C12579k
    /* renamed from: d */
    public final C2409t0 mo8185d(float f, boolean z, @C12580l C2380m mVar) {
        return new C2409t0(f, z, mVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2409t0)) {
            return false;
        }
        C2409t0 t0Var = (C2409t0) obj;
        return Float.compare(this.f6354a, t0Var.f6354a) == 0 && this.f6355b == t0Var.f6355b && Intrinsics.areEqual((Object) this.f6356c, (Object) t0Var.f6356c);
    }

    @C12580l
    /* renamed from: f */
    public final C2380m mo8187f() {
        return this.f6356c;
    }

    /* renamed from: g */
    public final boolean mo8188g() {
        return this.f6355b;
    }

    /* renamed from: h */
    public final float mo8189h() {
        return this.f6354a;
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.f6354a) * 31;
        boolean z = this.f6355b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        C2380m mVar = this.f6356c;
        return i + (mVar == null ? 0 : mVar.hashCode());
    }

    /* renamed from: i */
    public final void mo8191i(@C12580l C2380m mVar) {
        this.f6356c = mVar;
    }

    /* renamed from: j */
    public final void mo8192j(boolean z) {
        this.f6355b = z;
    }

    /* renamed from: k */
    public final void mo8193k(float f) {
        this.f6354a = f;
    }

    @C12579k
    public String toString() {
        return "RowColumnParentData(weight=" + this.f6354a + ", fill=" + this.f6355b + ", crossAxisAlignment=" + this.f6356c + ')';
    }

    public C2409t0(float f, boolean z, @C12580l C2380m mVar) {
        this.f6354a = f;
        this.f6355b = z;
        this.f6356c = mVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2409t0(float f, boolean z, C2380m mVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : mVar);
    }
}
