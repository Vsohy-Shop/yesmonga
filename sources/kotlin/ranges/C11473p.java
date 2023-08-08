package kotlin.ranges;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.ranges.p */
public final class C11473p implements C11475r<Double> {

    /* renamed from: a */
    public final double f28614a;

    /* renamed from: b */
    public final double f28615b;

    public C11473p(double d, double d2) {
        this.f28614a = d;
        this.f28615b = d2;
    }

    /* renamed from: a */
    public boolean mo23078a(double d) {
        return d >= this.f28614a && d < this.f28615b;
    }

    @C12579k
    /* renamed from: b */
    public Double mo23010h() {
        return Double.valueOf(this.f28615b);
    }

    @C12579k
    /* renamed from: c */
    public Double getStart() {
        return Double.valueOf(this.f28614a);
    }

    /* renamed from: d */
    public final boolean mo23081d(double d, double d2) {
        return d <= d2;
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo23006e(Comparable comparable) {
        return mo23078a(((Number) comparable).doubleValue());
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof C11473p)) {
            return false;
        }
        if (!isEmpty() || !((C11473p) obj).isEmpty()) {
            C11473p pVar = (C11473p) obj;
            if (this.f28614a == pVar.f28614a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (this.f28615b == pVar.f28615b) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f28614a) * 31) + Double.hashCode(this.f28615b);
    }

    public boolean isEmpty() {
        return this.f28614a >= this.f28615b;
    }

    @C12579k
    public String toString() {
        return this.f28614a + "..<" + this.f28615b;
    }
}
