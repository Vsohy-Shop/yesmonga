package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* renamed from: com.google.maps.android.e */
public class C33870e {
    /* renamed from: a */
    public static double m136404a(LatLng latLng, LatLng latLng2) {
        return m136413j(Math.toRadians(latLng.f73028a), Math.toRadians(latLng.f73029b), Math.toRadians(latLng2.f73028a), Math.toRadians(latLng2.f73029b));
    }

    /* renamed from: b */
    public static double m136405b(List<LatLng> list) {
        return Math.abs(m136411h(list));
    }

    /* renamed from: c */
    public static double m136406c(LatLng latLng, LatLng latLng2) {
        return m136404a(latLng, latLng2) * 6371009.0d;
    }

    /* renamed from: d */
    public static double m136407d(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.f73028a);
        double radians2 = Math.toRadians(latLng.f73029b);
        double radians3 = Math.toRadians(latLng2.f73028a);
        double radians4 = Math.toRadians(latLng2.f73029b) - radians2;
        return C33748b.m135682k(Math.toDegrees(Math.atan2(Math.sin(radians4) * Math.cos(radians3), (Math.cos(radians) * Math.sin(radians3)) - ((Math.sin(radians) * Math.cos(radians3)) * Math.cos(radians4)))), -180.0d, 180.0d);
    }

    /* renamed from: e */
    public static double m136408e(List<LatLng> list) {
        double d = 0.0d;
        if (list.size() < 2) {
            return 0.0d;
        }
        LatLng latLng = null;
        for (LatLng next : list) {
            if (latLng != null) {
                d += m136413j(Math.toRadians(latLng.f73028a), Math.toRadians(latLng.f73029b), Math.toRadians(next.f73028a), Math.toRadians(next.f73029b));
            }
            latLng = next;
        }
        return d * 6371009.0d;
    }

    /* renamed from: f */
    public static LatLng m136409f(LatLng latLng, double d, double d2) {
        double d3 = d / 6371009.0d;
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(latLng.f73028a);
        double radians3 = Math.toRadians(latLng.f73029b);
        double cos = Math.cos(d3);
        double sin = Math.sin(d3);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (cos * sin2) + (Math.cos(radians) * cos2);
        return new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(cos2 * Math.sin(radians), cos - (sin2 * cos3))));
    }

    /* renamed from: g */
    public static LatLng m136410g(LatLng latLng, double d, double d2) {
        LatLng latLng2 = latLng;
        double radians = Math.toRadians(d2);
        double d3 = d / 6371009.0d;
        double cos = Math.cos(d3);
        double sin = Math.sin(d3) * Math.cos(radians);
        double sin2 = Math.sin(d3) * Math.sin(radians);
        double sin3 = Math.sin(Math.toRadians(latLng2.f73028a));
        double d4 = cos * cos;
        double d5 = sin * sin;
        double d6 = ((d5 * d4) + (d4 * d4)) - ((d4 * sin3) * sin3);
        if (d6 < 0.0d) {
            return null;
        }
        double d7 = sin * sin3;
        double d8 = d4 + d5;
        double sqrt = (d7 + Math.sqrt(d6)) / d8;
        double d9 = (sin3 - (sin * sqrt)) / cos;
        double atan2 = Math.atan2(d9, sqrt);
        if (atan2 < -1.5707963267948966d || atan2 > 1.5707963267948966d) {
            atan2 = Math.atan2(d9, (d7 - Math.sqrt(d6)) / d8);
        }
        if (atan2 < -1.5707963267948966d || atan2 > 1.5707963267948966d) {
            return null;
        }
        return new LatLng(Math.toDegrees(atan2), Math.toDegrees(Math.toRadians(latLng2.f73029b) - Math.atan2(sin2, (cos * Math.cos(atan2)) - (sin * Math.sin(atan2)))));
    }

    /* renamed from: h */
    public static double m136411h(List<LatLng> list) {
        return m136412i(list, 6371009.0d);
    }

    /* renamed from: i */
    public static double m136412i(List<LatLng> list, double d) {
        int size = list.size();
        double d2 = 0.0d;
        if (size < 3) {
            return 0.0d;
        }
        LatLng latLng = list.get(size - 1);
        double tan = Math.tan((1.5707963267948966d - Math.toRadians(latLng.f73028a)) / 2.0d);
        double radians = Math.toRadians(latLng.f73029b);
        double d3 = tan;
        double d4 = radians;
        for (LatLng next : list) {
            double tan2 = Math.tan((1.5707963267948966d - Math.toRadians(next.f73028a)) / 2.0d);
            double radians2 = Math.toRadians(next.f73029b);
            d2 += m136415l(tan2, radians2, d3, d4);
            d3 = tan2;
            d4 = radians2;
        }
        return d2 * d * d;
    }

    /* renamed from: j */
    public static double m136413j(double d, double d2, double d3, double d4) {
        return C33748b.m135672a(C33748b.m135675d(d, d3, d2 - d4));
    }

    /* renamed from: k */
    public static LatLng m136414k(LatLng latLng, LatLng latLng2, double d) {
        LatLng latLng3 = latLng;
        LatLng latLng4 = latLng2;
        double radians = Math.toRadians(latLng3.f73028a);
        double radians2 = Math.toRadians(latLng3.f73029b);
        double radians3 = Math.toRadians(latLng4.f73028a);
        double radians4 = Math.toRadians(latLng4.f73029b);
        double cos = Math.cos(radians);
        double cos2 = Math.cos(radians3);
        double a = m136404a(latLng, latLng2);
        double sin = Math.sin(a);
        if (sin < 1.0E-6d) {
            double d2 = latLng3.f73028a;
            double d3 = d2 + ((latLng4.f73028a - d2) * d);
            double d4 = latLng3.f73029b;
            return new LatLng(d3, d4 + ((latLng4.f73029b - d4) * d));
        }
        double sin2 = Math.sin((1.0d - d) * a) / sin;
        double sin3 = Math.sin(a * d) / sin;
        double d5 = cos * sin2;
        double d6 = cos2 * sin3;
        double d7 = sin3;
        double cos3 = (Math.cos(radians2) * d5) + (Math.cos(radians4) * d6);
        double sin4 = (d5 * Math.sin(radians2)) + (d6 * Math.sin(radians4));
        return new LatLng(Math.toDegrees(Math.atan2((sin2 * Math.sin(radians)) + (Math.sin(radians3) * d7), Math.sqrt((cos3 * cos3) + (sin4 * sin4)))), Math.toDegrees(Math.atan2(sin4, cos3)));
    }

    /* renamed from: l */
    public static double m136415l(double d, double d2, double d3, double d4) {
        double d5 = d2 - d4;
        double d6 = d * d3;
        return Math.atan2(Math.sin(d5) * d6, (d6 * Math.cos(d5)) + 1.0d) * 2.0d;
    }
}
