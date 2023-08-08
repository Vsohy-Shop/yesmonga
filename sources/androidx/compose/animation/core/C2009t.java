package androidx.compose.animation.core;

import androidx.compose.runtime.C8585m0;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.animation.core.t */
public final class C2009t implements C2022z {

    /* renamed from: e */
    public static final int f5609e = 0;

    /* renamed from: a */
    public final float f5610a;

    /* renamed from: b */
    public final float f5611b;

    /* renamed from: c */
    public final float f5612c;

    /* renamed from: d */
    public final float f5613d;

    public C2009t(float f, float f2, float f3, float f4) {
        boolean z;
        this.f5610a = f;
        this.f5611b = f2;
        this.f5612c = f3;
        this.f5613d = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.').toString());
        }
    }

    /* renamed from: a */
    public float mo6791a(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            float f3 = 1.0f;
            if (f < 1.0f) {
                while (true) {
                    float f4 = (f2 + f3) / ((float) 2);
                    float b = mo6976b(this.f5610a, this.f5612c, f4);
                    if (Math.abs(f - b) < 0.001f) {
                        return mo6976b(this.f5611b, this.f5613d, f4);
                    }
                    if (b < f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
            }
        }
        return f;
    }

    /* renamed from: b */
    public final float mo6976b(float f, float f2, float f3) {
        float f4 = (float) 3;
        float f5 = ((float) 1) - f3;
        return (f * f4 * f5 * f5 * f3) + (f4 * f2 * f5 * f3 * f3) + (f3 * f3 * f3);
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!(obj instanceof C2009t)) {
            return false;
        }
        C2009t tVar = (C2009t) obj;
        if (this.f5610a == tVar.f5610a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f5611b == tVar.f5611b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f5612c == tVar.f5612c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.f5613d == tVar.f5613d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f5610a) * 31) + Float.hashCode(this.f5611b)) * 31) + Float.hashCode(this.f5612c)) * 31) + Float.hashCode(this.f5613d);
    }
}
