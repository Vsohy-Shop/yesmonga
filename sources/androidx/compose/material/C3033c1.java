package androidx.compose.material;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.material.c1 */
public final class C3033c1 {

    /* renamed from: d */
    public static final int f8094d = 0;

    /* renamed from: a */
    public final float f8095a;

    /* renamed from: b */
    public final float f8096b;

    /* renamed from: c */
    public final float f8097c;

    public C3033c1(float f, float f2, float f3) {
        this.f8095a = f;
        this.f8096b = f2;
        this.f8097c = f3;
    }

    /* renamed from: a */
    public final float mo10727a(float f) {
        float f2;
        boolean z;
        if (f < 0.0f) {
            f2 = this.f8096b;
        } else {
            f2 = this.f8097c;
        }
        if (f2 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0.0f;
        }
        return (this.f8095a / f2) * ((float) Math.sin((double) ((C11479u.m44331H(f / this.f8095a, -1.0f, 1.0f) * 3.1415927f) / ((float) 2))));
    }

    /* renamed from: b */
    public final float mo10728b() {
        return this.f8095a;
    }

    /* renamed from: c */
    public final float mo10729c() {
        return this.f8097c;
    }

    /* renamed from: d */
    public final float mo10730d() {
        return this.f8096b;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3033c1)) {
            return false;
        }
        C3033c1 c1Var = (C3033c1) obj;
        if (this.f8095a == c1Var.f8095a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f8096b == c1Var.f8096b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f8097c == c1Var.f8097c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f8095a) * 31) + Float.hashCode(this.f8096b)) * 31) + Float.hashCode(this.f8097c);
    }

    @C12579k
    public String toString() {
        return "ResistanceConfig(basis=" + this.f8095a + ", factorAtMin=" + this.f8096b + ", factorAtMax=" + this.f8097c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3033c1(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? 10.0f : f2, (i & 4) != 0 ? 10.0f : f3);
    }
}
