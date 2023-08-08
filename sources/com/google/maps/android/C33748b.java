package com.google.maps.android;

/* renamed from: com.google.maps.android.b */
public class C33748b {

    /* renamed from: a */
    public static final double f81886a = 6371009.0d;

    /* renamed from: a */
    public static double m135672a(double d) {
        return Math.asin(Math.sqrt(d)) * 2.0d;
    }

    /* renamed from: b */
    public static double m135673b(double d, double d2, double d3) {
        return d < d2 ? d2 : d > d3 ? d3 : d;
    }

    /* renamed from: c */
    public static double m135674c(double d) {
        double sin = Math.sin(d * 0.5d);
        return sin * sin;
    }

    /* renamed from: d */
    public static double m135675d(double d, double d2, double d3) {
        return m135674c(d - d2) + (m135674c(d3) * Math.cos(d) * Math.cos(d2));
    }

    /* renamed from: e */
    public static double m135676e(double d) {
        double d2 = d * d;
        return (d2 / (Math.sqrt(1.0d - d2) + 1.0d)) * 0.5d;
    }

    /* renamed from: f */
    public static double m135677f(double d) {
        return (Math.atan(Math.exp(d)) * 2.0d) - 1.5707963267948966d;
    }

    /* renamed from: g */
    public static double m135678g(double d) {
        return Math.log(Math.tan((d * 0.5d) + 0.7853981633974483d));
    }

    /* renamed from: h */
    public static double m135679h(double d, double d2) {
        return ((d % d2) + d2) % d2;
    }

    /* renamed from: i */
    public static double m135680i(double d) {
        return Math.sqrt(d * (1.0d - d)) * 2.0d;
    }

    /* renamed from: j */
    public static double m135681j(double d, double d2) {
        double sqrt = Math.sqrt((1.0d - d) * d);
        double sqrt2 = Math.sqrt((1.0d - d2) * d2);
        return ((sqrt + sqrt2) - (((sqrt * d2) + (sqrt2 * d)) * 2.0d)) * 2.0d;
    }

    /* renamed from: k */
    public static double m135682k(double d, double d2, double d3) {
        return (d < d2 || d >= d3) ? m135679h(d - d2, d3 - d2) + d2 : d;
    }
}
