package kotlin.ranges;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.ranges.d */
public final class C11455d implements C11457f<Double> {

    /* renamed from: a */
    public final double f28586a;

    /* renamed from: b */
    public final double f28587b;

    public C11455d(double d, double d2) {
        this.f28586a = d;
        this.f28587b = d2;
    }

    /* renamed from: a */
    public boolean mo23023a(double d) {
        return d >= this.f28586a && d <= this.f28587b;
    }

    @C12579k
    /* renamed from: b */
    public Double mo23013q() {
        return Double.valueOf(this.f28587b);
    }

    @C12579k
    /* renamed from: c */
    public Double getStart() {
        return Double.valueOf(this.f28586a);
    }

    /* renamed from: d */
    public boolean mo23026d(double d, double d2) {
        return d <= d2;
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo23006e(Comparable comparable) {
        return mo23023a(((Number) comparable).doubleValue());
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof C11455d)) {
            return false;
        }
        if (!isEmpty() || !((C11455d) obj).isEmpty()) {
            C11455d dVar = (C11455d) obj;
            if (this.f28586a == dVar.f28586a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (this.f28587b == dVar.f28587b) {
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
        return (Double.hashCode(this.f28586a) * 31) + Double.hashCode(this.f28587b);
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo23029i(Comparable comparable, Comparable comparable2) {
        return mo23026d(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    public boolean isEmpty() {
        return this.f28586a > this.f28587b;
    }

    @C12579k
    public String toString() {
        return this.f28586a + ".." + this.f28587b;
    }
}
