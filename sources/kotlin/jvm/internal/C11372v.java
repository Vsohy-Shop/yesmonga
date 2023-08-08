package kotlin.jvm.internal;

import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.v */
public final class C11372v extends C11340k0<double[]> {
    @C12579k

    /* renamed from: d */
    public final double[] f28513d;

    public C11372v(int i) {
        super(i);
        this.f28513d = new double[i];
    }

    /* renamed from: h */
    public final void mo22864h(double d) {
        double[] dArr = this.f28513d;
        int b = mo22791b();
        mo22792e(b + 1);
        dArr[b] = d;
    }

    /* renamed from: i */
    public int mo22769c(@C12579k double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @C12579k
    /* renamed from: j */
    public final double[] mo22866j() {
        return (double[]) mo22794g(this.f28513d, new double[mo22793f()]);
    }
}
