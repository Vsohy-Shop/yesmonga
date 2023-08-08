package androidx.core.graphics;

import android.graphics.PointF;
import androidx.annotation.C0359n0;
import androidx.core.util.C18001r;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.core.graphics.s0 */
public final class C17639s0 {

    /* renamed from: a */
    public final PointF f46007a;

    /* renamed from: b */
    public final float f46008b;

    /* renamed from: c */
    public final PointF f46009c;

    /* renamed from: d */
    public final float f46010d;

    public C17639s0(@C0359n0 PointF pointF, float f, @C0359n0 PointF pointF2, float f2) {
        this.f46007a = (PointF) C18001r.m81776m(pointF, "start == null");
        this.f46008b = f;
        this.f46009c = (PointF) C18001r.m81776m(pointF2, "end == null");
        this.f46010d = f2;
    }

    @C0359n0
    /* renamed from: a */
    public PointF mo52067a() {
        return this.f46009c;
    }

    /* renamed from: b */
    public float mo52068b() {
        return this.f46010d;
    }

    @C0359n0
    /* renamed from: c */
    public PointF mo52069c() {
        return this.f46007a;
    }

    /* renamed from: d */
    public float mo52070d() {
        return this.f46008b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17639s0)) {
            return false;
        }
        C17639s0 s0Var = (C17639s0) obj;
        if (Float.compare(this.f46008b, s0Var.f46008b) != 0 || Float.compare(this.f46010d, s0Var.f46010d) != 0 || !this.f46007a.equals(s0Var.f46007a) || !this.f46009c.equals(s0Var.f46009c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f46007a.hashCode() * 31;
        float f = this.f46008b;
        int i2 = 0;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.f46009c.hashCode()) * 31;
        float f2 = this.f46010d;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "PathSegment{start=" + this.f46007a + ", startFraction=" + this.f46008b + ", end=" + this.f46009c + ", endFraction=" + this.f46010d + C12361b.f30259j;
    }
}
