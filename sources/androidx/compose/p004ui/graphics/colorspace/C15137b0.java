package androidx.compose.p004ui.graphics.colorspace;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.colorspace.b0 */
public final class C15137b0 {

    /* renamed from: a */
    public final float f37400a;

    /* renamed from: b */
    public final float f37401b;

    public C15137b0(float f, float f2) {
        this.f37400a = f;
        this.f37401b = f2;
    }

    /* renamed from: d */
    public static /* synthetic */ C15137b0 m65400d(C15137b0 b0Var, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = b0Var.f37400a;
        }
        if ((i & 2) != 0) {
            f2 = b0Var.f37401b;
        }
        return b0Var.mo42575c(f, f2);
    }

    /* renamed from: a */
    public final float mo42573a() {
        return this.f37400a;
    }

    /* renamed from: b */
    public final float mo42574b() {
        return this.f37401b;
    }

    @C12579k
    /* renamed from: c */
    public final C15137b0 mo42575c(float f, float f2) {
        return new C15137b0(f, f2);
    }

    /* renamed from: e */
    public final float mo42576e() {
        return this.f37400a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15137b0)) {
            return false;
        }
        C15137b0 b0Var = (C15137b0) obj;
        return Float.compare(this.f37400a, b0Var.f37400a) == 0 && Float.compare(this.f37401b, b0Var.f37401b) == 0;
    }

    /* renamed from: f */
    public final float mo42578f() {
        return this.f37401b;
    }

    @C12579k
    /* renamed from: g */
    public final float[] mo42579g() {
        float f = this.f37400a;
        float f2 = this.f37401b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public int hashCode() {
        return (Float.hashCode(this.f37400a) * 31) + Float.hashCode(this.f37401b);
    }

    @C12579k
    public String toString() {
        return "WhitePoint(x=" + this.f37400a + ", y=" + this.f37401b + ')';
    }

    public C15137b0(float f, float f2, float f3) {
        this(f, f2, f3, f + f2 + f3);
    }

    public C15137b0(float f, float f2, float f3, float f4) {
        this(f / f4, f2 / f4);
    }
}
