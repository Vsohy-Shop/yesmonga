package kotlin.ranges;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.ranges.e */
public final class C11456e implements C11457f<Float> {

    /* renamed from: a */
    public final float f28588a;

    /* renamed from: b */
    public final float f28589b;

    public C11456e(float f, float f2) {
        this.f28588a = f;
        this.f28589b = f2;
    }

    /* renamed from: a */
    public boolean mo23031a(float f) {
        return f >= this.f28588a && f <= this.f28589b;
    }

    @C12579k
    /* renamed from: b */
    public Float mo23013q() {
        return Float.valueOf(this.f28589b);
    }

    @C12579k
    /* renamed from: c */
    public Float getStart() {
        return Float.valueOf(this.f28588a);
    }

    /* renamed from: d */
    public boolean mo23034d(float f, float f2) {
        return f <= f2;
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo23006e(Comparable comparable) {
        return mo23031a(((Number) comparable).floatValue());
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof C11456e)) {
            return false;
        }
        if (!isEmpty() || !((C11456e) obj).isEmpty()) {
            C11456e eVar = (C11456e) obj;
            if (this.f28588a == eVar.f28588a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (this.f28589b == eVar.f28589b) {
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
        return (Float.hashCode(this.f28588a) * 31) + Float.hashCode(this.f28589b);
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo23029i(Comparable comparable, Comparable comparable2) {
        return mo23034d(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public boolean isEmpty() {
        return this.f28588a > this.f28589b;
    }

    @C12579k
    public String toString() {
        return this.f28588a + ".." + this.f28589b;
    }
}
