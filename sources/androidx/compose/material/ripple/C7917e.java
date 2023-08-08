package androidx.compose.material.ripple;

import androidx.compose.runtime.C8585m0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.material.ripple.e */
public final class C7917e {

    /* renamed from: e */
    public static final int f19033e = 0;

    /* renamed from: a */
    public final float f19034a;

    /* renamed from: b */
    public final float f19035b;

    /* renamed from: c */
    public final float f19036c;

    /* renamed from: d */
    public final float f19037d;

    public C7917e(float f, float f2, float f3, float f4) {
        this.f19034a = f;
        this.f19035b = f2;
        this.f19036c = f3;
        this.f19037d = f4;
    }

    /* renamed from: a */
    public final float mo11051a() {
        return this.f19034a;
    }

    /* renamed from: b */
    public final float mo11052b() {
        return this.f19035b;
    }

    /* renamed from: c */
    public final float mo11053c() {
        return this.f19036c;
    }

    /* renamed from: d */
    public final float mo11054d() {
        return this.f19037d;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7917e)) {
            return false;
        }
        C7917e eVar = (C7917e) obj;
        if (this.f19034a == eVar.f19034a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f19035b == eVar.f19035b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f19036c == eVar.f19036c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.f19037d == eVar.f19037d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f19034a) * 31) + Float.hashCode(this.f19035b)) * 31) + Float.hashCode(this.f19036c)) * 31) + Float.hashCode(this.f19037d);
    }

    @C12579k
    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f19034a + ", focusedAlpha=" + this.f19035b + ", hoveredAlpha=" + this.f19036c + ", pressedAlpha=" + this.f19037d + ')';
    }
}
