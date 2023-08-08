package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.motion.utils.d */
public class C16680d {

    /* renamed from: b */
    public static C16680d f41924b = new C16680d();

    /* renamed from: c */
    public static final String f41925c = "cubic(0.4, 0.0, 0.2, 1)";

    /* renamed from: d */
    public static final String f41926d = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* renamed from: e */
    public static final String f41927e = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* renamed from: f */
    public static final String f41928f = "cubic(1, 1, 0, 0)";

    /* renamed from: g */
    public static final String f41929g = "cubic(0.36, 0, 0.66, -0.56)";

    /* renamed from: h */
    public static final String f41930h = "cubic(0.34, 1.56, 0.64, 1)";

    /* renamed from: i */
    public static final String f41931i = "decelerate";

    /* renamed from: j */
    public static final String f41932j = "accelerate";

    /* renamed from: k */
    public static final String f41933k = "standard";

    /* renamed from: l */
    public static final String f41934l = "linear";

    /* renamed from: m */
    public static final String f41935m = "anticipate";

    /* renamed from: n */
    public static final String f41936n = "overshoot";

    /* renamed from: o */
    public static String[] f41937o = {f41933k, f41932j, f41931i, f41934l};

    /* renamed from: a */
    public String f41938a = "identity";

    /* renamed from: c */
    public static C16680d m76169c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C16681a(str);
        }
        if (str.startsWith("spline")) {
            return new C16709q(str);
        }
        if (str.startsWith("Schlick")) {
            return new C16702n(str);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals(f41932j)) {
                    c = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals(f41931i)) {
                    c = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals(f41935m)) {
                    c = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals(f41934l)) {
                    c = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals(f41936n)) {
                    c = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals(f41933k)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C16681a(f41926d);
            case 1:
                return new C16681a(f41927e);
            case 2:
                return new C16681a(f41929g);
            case 3:
                return new C16681a(f41928f);
            case 4:
                return new C16681a(f41930h);
            case 5:
                return new C16681a(f41925c);
            default:
                PrintStream printStream = System.err;
                printStream.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f41937o));
                return f41924b;
        }
    }

    /* renamed from: a */
    public double mo48998a(double d) {
        return d;
    }

    /* renamed from: b */
    public double mo48999b(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f41938a;
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.d$a */
    public static class C16681a extends C16680d {

        /* renamed from: t */
        public static double f41939t = 0.01d;

        /* renamed from: u */
        public static double f41940u = 1.0E-4d;

        /* renamed from: p */
        public double f41941p;

        /* renamed from: q */
        public double f41942q;

        /* renamed from: r */
        public double f41943r;

        /* renamed from: s */
        public double f41944s;

        public C16681a(String str) {
            this.f41938a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f41941p = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.f41942q = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f41943r = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.f41944s = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        /* renamed from: a */
        public double mo48998a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f41939t) {
                d2 *= 0.5d;
                if (mo49003f(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double f = mo49003f(d4);
            double d5 = d3 + d2;
            double f2 = mo49003f(d5);
            double g = mo49004g(d4);
            return (((mo49004g(d5) - g) * (d - f)) / (f2 - f)) + g;
        }

        /* renamed from: b */
        public double mo48999b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f41940u) {
                d2 *= 0.5d;
                if (mo49003f(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double f = mo49003f(d4);
            double d5 = d3 + d2;
            return (mo49004g(d5) - mo49004g(d4)) / (mo49003f(d5) - f);
        }

        /* renamed from: d */
        public final double mo49001d(double d) {
            double d2 = 1.0d - d;
            double d3 = this.f41941p;
            double d4 = this.f41943r;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        /* renamed from: e */
        public final double mo49002e(double d) {
            double d2 = 1.0d - d;
            double d3 = this.f41942q;
            double d4 = this.f41944s;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        /* renamed from: f */
        public final double mo49003f(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f41941p * d2 * d3 * d) + (this.f41943r * d3 * d * d) + (d * d * d);
        }

        /* renamed from: g */
        public final double mo49004g(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f41942q * d2 * d3 * d) + (this.f41944s * d3 * d * d) + (d * d * d);
        }

        /* renamed from: h */
        public void mo49005h(double d, double d2, double d3, double d4) {
            this.f41941p = d;
            this.f41942q = d2;
            this.f41943r = d3;
            this.f41944s = d4;
        }

        public C16681a(double d, double d2, double d3, double d4) {
            mo49005h(d, d2, d3, d4);
        }
    }
}
