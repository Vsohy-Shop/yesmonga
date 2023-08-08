package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.b0 */
public class C0462b0 {

    /* renamed from: d */
    public static C0462b0 f1141d = null;

    /* renamed from: e */
    public static final int f1142e = 0;

    /* renamed from: f */
    public static final int f1143f = 1;

    /* renamed from: g */
    public static final float f1144g = 0.017453292f;

    /* renamed from: h */
    public static final float f1145h = 9.0E-4f;

    /* renamed from: i */
    public static final float f1146i = -0.10471976f;

    /* renamed from: j */
    public static final float f1147j = 0.0334196f;

    /* renamed from: k */
    public static final float f1148k = 3.49066E-4f;

    /* renamed from: l */
    public static final float f1149l = 5.236E-6f;

    /* renamed from: m */
    public static final float f1150m = 0.4092797f;

    /* renamed from: n */
    public static final long f1151n = 946728000000L;

    /* renamed from: a */
    public long f1152a;

    /* renamed from: b */
    public long f1153b;

    /* renamed from: c */
    public int f1154c;

    /* renamed from: b */
    public static C0462b0 m1988b() {
        if (f1141d == null) {
            f1141d = new C0462b0();
        }
        return f1141d;
    }

    /* renamed from: a */
    public void mo1366a(long j, double d, double d2) {
        float f = ((float) (j - f1151n)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        double sin = (Math.sin(d3) * 0.03341960161924362d) + d3 + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double round = ((double) (((float) Math.round(((double) (f - 9.0E-4f)) - d4)) + 9.0E-4f)) + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * sin) * -0.0069d);
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(asin))) / (Math.cos(d5) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f1154c = 1;
            this.f1152a = -1;
            this.f1153b = -1;
        } else if (sin2 <= -1.0d) {
            this.f1154c = 0;
            this.f1152a = -1;
            this.f1153b = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin2) / 6.283185307179586d));
            this.f1152a = Math.round((round + acos) * 8.64E7d) + f1151n;
            long round2 = Math.round((round - acos) * 8.64E7d) + f1151n;
            this.f1153b = round2;
            if (round2 >= j || this.f1152a <= j) {
                this.f1154c = 1;
            } else {
                this.f1154c = 0;
            }
        }
    }
}
