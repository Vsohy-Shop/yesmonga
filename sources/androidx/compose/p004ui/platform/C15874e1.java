package androidx.compose.p004ui.platform;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.e1 */
public final class C15874e1 implements C15880f1<Float> {

    /* renamed from: a */
    public final float f39527a;

    /* renamed from: b */
    public final float f39528b;

    public C15874e1(float f, float f2) {
        this.f39527a = f;
        this.f39528b = f2;
    }

    /* renamed from: a */
    public boolean mo45711a(float f) {
        return f >= this.f39527a && f < this.f39528b;
    }

    @C12579k
    /* renamed from: b */
    public Float mo45718h() {
        return Float.valueOf(this.f39528b);
    }

    @C12579k
    /* renamed from: c */
    public Float getStart() {
        return Float.valueOf(this.f39527a);
    }

    /* renamed from: d */
    public final boolean mo45714d(float f, float f2) {
        return f <= f2;
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo45715e(Comparable comparable) {
        return mo45711a(((Number) comparable).floatValue());
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof C15874e1)) {
            return false;
        }
        if (!isEmpty() || !((C15874e1) obj).isEmpty()) {
            C15874e1 e1Var = (C15874e1) obj;
            if (this.f39527a == e1Var.f39527a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (this.f39528b == e1Var.f39528b) {
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
        return (Float.hashCode(this.f39527a) * 31) + Float.hashCode(this.f39528b);
    }

    public boolean isEmpty() {
        return this.f39527a >= this.f39528b;
    }

    @C12579k
    public String toString() {
        return this.f39527a + "..<" + this.f39528b;
    }
}
