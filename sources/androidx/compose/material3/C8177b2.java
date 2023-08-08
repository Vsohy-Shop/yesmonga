package androidx.compose.material3;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.material3.b2 */
public final class C8177b2 {

    /* renamed from: a */
    public final float f20007a;

    /* renamed from: b */
    public final float f20008b;

    /* renamed from: c */
    public final float f20009c;

    public C8177b2(float f, float f2, float f3) {
        this.f20007a = f;
        this.f20008b = f2;
        this.f20009c = f3;
    }

    /* renamed from: a */
    public final float mo12465a(float f) {
        float f2;
        boolean z;
        if (f < 0.0f) {
            f2 = this.f20008b;
        } else {
            f2 = this.f20009c;
        }
        if (f2 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0.0f;
        }
        return (this.f20007a / f2) * ((float) Math.sin((double) ((C11479u.m44331H(f / this.f20007a, -1.0f, 1.0f) * 3.1415927f) / ((float) 2))));
    }

    /* renamed from: b */
    public final float mo12466b() {
        return this.f20007a;
    }

    /* renamed from: c */
    public final float mo12467c() {
        return this.f20009c;
    }

    /* renamed from: d */
    public final float mo12468d() {
        return this.f20008b;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8177b2)) {
            return false;
        }
        C8177b2 b2Var = (C8177b2) obj;
        if (this.f20007a == b2Var.f20007a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f20008b == b2Var.f20008b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f20009c == b2Var.f20009c) {
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
        return (((Float.hashCode(this.f20007a) * 31) + Float.hashCode(this.f20008b)) * 31) + Float.hashCode(this.f20009c);
    }

    @C12579k
    public String toString() {
        return "ResistanceConfig(basis=" + this.f20007a + ", factorAtMin=" + this.f20008b + ", factorAtMax=" + this.f20009c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8177b2(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? 10.0f : f2, (i & 4) != 0 ? 10.0f : f3);
    }
}
