package androidx.constraintlayout.core.motion.utils;

/* renamed from: androidx.constraintlayout.core.motion.utils.n */
public class C16702n extends C16680d {

    /* renamed from: s */
    public static final boolean f42041s = false;

    /* renamed from: p */
    public double f42042p;

    /* renamed from: q */
    public double f42043q;

    /* renamed from: r */
    public double f42044r;

    public C16702n(String str) {
        this.f41938a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f42042p = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.f42043q = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    /* renamed from: a */
    public double mo48998a(double d) {
        return mo49070e(d);
    }

    /* renamed from: b */
    public double mo48999b(double d) {
        return mo49069d(d);
    }

    /* renamed from: d */
    public final double mo49069d(double d) {
        double d2 = this.f42043q;
        if (d < d2) {
            double d3 = this.f42042p;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * ((d3 * (d2 - d)) + d));
        }
        double d4 = this.f42042p;
        return (((d2 - 1.0d) * d4) * (d2 - 1.0d)) / (((((-d4) * (d2 - d)) - d) + 1.0d) * ((((-d4) * (d2 - d)) - d) + 1.0d));
    }

    /* renamed from: e */
    public final double mo49070e(double d) {
        double d2 = this.f42043q;
        if (d < d2) {
            return (d2 * d) / (d + (this.f42042p * (d2 - d)));
        }
        return ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.f42042p * (d2 - d)));
    }
}
