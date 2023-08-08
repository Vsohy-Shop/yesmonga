package kotlin.ranges;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.ranges.q */
public final class C11474q implements C11475r<Float> {

    /* renamed from: a */
    public final float f28616a;

    /* renamed from: b */
    public final float f28617b;

    public C11474q(float f, float f2) {
        this.f28616a = f;
        this.f28617b = f2;
    }

    /* renamed from: a */
    public boolean mo23085a(float f) {
        return f >= this.f28616a && f < this.f28617b;
    }

    @C12579k
    /* renamed from: b */
    public Float mo23010h() {
        return Float.valueOf(this.f28617b);
    }

    @C12579k
    /* renamed from: c */
    public Float getStart() {
        return Float.valueOf(this.f28616a);
    }

    /* renamed from: d */
    public final boolean mo23088d(float f, float f2) {
        return f <= f2;
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo23006e(Comparable comparable) {
        return mo23085a(((Number) comparable).floatValue());
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof C11474q)) {
            return false;
        }
        if (!isEmpty() || !((C11474q) obj).isEmpty()) {
            C11474q qVar = (C11474q) obj;
            if (this.f28616a == qVar.f28616a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (this.f28617b == qVar.f28617b) {
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
        return (Float.hashCode(this.f28616a) * 31) + Float.hashCode(this.f28617b);
    }

    public boolean isEmpty() {
        return this.f28616a >= this.f28617b;
    }

    @C12579k
    public String toString() {
        return this.f28616a + "..<" + this.f28617b;
    }
}
