package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* renamed from: com.google.maps.android.c */
public class C33749c {

    /* renamed from: a */
    public static final double f81887a = 0.1d;

    /* renamed from: a */
    public static boolean m135683a(double d, double d2, List<LatLng> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return false;
        }
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(d2);
        LatLng latLng = list.get(size - 1);
        double radians3 = Math.toRadians(latLng.f73028a);
        double radians4 = Math.toRadians(latLng.f73029b);
        int i = 0;
        double d3 = radians3;
        for (LatLng next : list) {
            double k = C33748b.m135682k(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
            if (radians == d3 && k == 0.0d) {
                return true;
            }
            double radians5 = Math.toRadians(next.f73028a);
            double radians6 = Math.toRadians(next.f73029b);
            if (m135689g(d3, radians5, C33748b.m135682k(radians6 - radians4, -3.141592653589793d, 3.141592653589793d), radians, k, z)) {
                i++;
            }
            d3 = radians5;
            radians4 = radians6;
        }
        if ((i & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m135684b(LatLng latLng, List<LatLng> list, boolean z) {
        return m135683a(latLng.f73028a, latLng.f73029b, list, z);
    }

    /* renamed from: c */
    public static List<LatLng> m135685c(String str) {
        int i;
        int i2;
        int i3;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i7 = 0;
            int i8 = 1;
            while (true) {
                i = i4 + 1;
                int charAt = (str.charAt(i4) - '?') - 1;
                i8 += charAt << i7;
                i7 += 5;
                if (charAt < 31) {
                    break;
                }
                i4 = i;
            }
            if ((i8 & 1) != 0) {
                i2 = ~(i8 >> 1);
            } else {
                i2 = i8 >> 1;
            }
            int i9 = i2 + i5;
            int i10 = 0;
            int i11 = 1;
            while (true) {
                i3 = i + 1;
                int charAt2 = (str.charAt(i) - '?') - 1;
                i11 += charAt2 << i10;
                i10 += 5;
                if (charAt2 < 31) {
                    break;
                }
                i = i3;
            }
            int i12 = i11 & 1;
            int i13 = i11 >> 1;
            if (i12 != 0) {
                i13 = ~i13;
            }
            i6 += i13;
            arrayList.add(new LatLng(((double) i9) * 1.0E-5d, ((double) i6) * 1.0E-5d));
            i5 = i9;
            i4 = i3;
        }
        return arrayList;
    }

    /* renamed from: d */
    public static double m135686d(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        LatLng latLng4 = latLng;
        LatLng latLng5 = latLng2;
        LatLng latLng6 = latLng3;
        if (latLng2.equals(latLng3)) {
            return C33870e.m136406c(latLng6, latLng4);
        }
        double radians = Math.toRadians(latLng4.f73028a);
        double radians2 = Math.toRadians(latLng4.f73029b);
        double radians3 = Math.toRadians(latLng5.f73028a);
        double radians4 = Math.toRadians(latLng5.f73029b);
        double radians5 = Math.toRadians(latLng6.f73028a);
        double radians6 = Math.toRadians(latLng6.f73029b);
        double cos = Math.cos(radians3);
        double d = radians5 - radians3;
        double d2 = (radians6 - radians4) * cos;
        double d3 = (((radians - radians3) * d) + (((radians2 - radians4) * cos) * d2)) / ((d * d) + (d2 * d2));
        if (d3 <= 0.0d) {
            return C33870e.m136406c(latLng, latLng2);
        }
        if (d3 >= 1.0d) {
            return C33870e.m136406c(latLng4, latLng6);
        }
        double d4 = latLng5.f73028a;
        double d5 = d4 + ((latLng6.f73028a - d4) * d3);
        double d6 = latLng5.f73029b;
        return C33870e.m136406c(latLng4, new LatLng(d5, d6 + (d3 * (latLng6.f73029b - d6))));
    }

    /* renamed from: e */
    public static String m135687e(List<LatLng> list) {
        StringBuffer stringBuffer = new StringBuffer();
        long j = 0;
        long j2 = 0;
        for (LatLng next : list) {
            long round = Math.round(next.f73028a * 100000.0d);
            long round2 = Math.round(next.f73029b * 100000.0d);
            m135688f(round - j, stringBuffer);
            m135688f(round2 - j2, stringBuffer);
            j = round;
            j2 = round2;
        }
        return stringBuffer.toString();
    }

    /* renamed from: f */
    public static void m135688f(long j, StringBuffer stringBuffer) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long j2 = j << 1;
        if (i < 0) {
            j2 = ~j2;
        }
        while (j2 >= 32) {
            stringBuffer.append(Character.toChars((int) ((32 | (31 & j2)) + 63)));
            j2 >>= 5;
        }
        stringBuffer.append(Character.toChars((int) (j2 + 63)));
    }

    /* renamed from: g */
    public static boolean m135689g(double d, double d2, double d3, double d4, double d5, boolean z) {
        if ((d5 >= 0.0d && d5 >= d3) || ((d5 < 0.0d && d5 < d3) || d4 <= -1.5707963267948966d || d <= -1.5707963267948966d || d2 <= -1.5707963267948966d || d >= 1.5707963267948966d || d2 >= 1.5707963267948966d || d3 <= -3.141592653589793d)) {
            return false;
        }
        double d6 = (((d3 - d5) * d) + (d2 * d5)) / d3;
        if (d >= 0.0d && d2 >= 0.0d && d4 < d6) {
            return false;
        }
        if ((d <= 0.0d && d2 <= 0.0d && d4 >= d6) || d4 >= 1.5707963267948966d) {
            return true;
        }
        if (z) {
            if (Math.tan(d4) < m135703u(d, d2, d3, d5)) {
                return false;
            }
        } else if (C33748b.m135678g(d4) < m135700r(d, d2, d3, d5)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m135690h(List<LatLng> list) {
        return list.get(0).equals(list.get(list.size() - 1));
    }

    /* renamed from: i */
    public static boolean m135691i(LatLng latLng, List<LatLng> list, boolean z) {
        return m135692j(latLng, list, z, 0.1d);
    }

    /* renamed from: j */
    public static boolean m135692j(LatLng latLng, List<LatLng> list, boolean z, double d) {
        return m135693k(latLng, list, true, z, d);
    }

    /* renamed from: k */
    public static boolean m135693k(LatLng latLng, List<LatLng> list, boolean z, boolean z2, double d) {
        return m135697o(latLng, list, z, z2, d) >= 0;
    }

    /* renamed from: l */
    public static boolean m135694l(LatLng latLng, List<LatLng> list, boolean z) {
        return m135695m(latLng, list, z, 0.1d);
    }

    /* renamed from: m */
    public static boolean m135695m(LatLng latLng, List<LatLng> list, boolean z, double d) {
        return m135693k(latLng, list, false, z, d);
    }

    /* renamed from: n */
    public static boolean m135696n(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = C33748b.m135675d(d, d5, d2 - d6);
        if (d8 <= d7) {
            return true;
        }
        double d9 = C33748b.m135675d(d3, d5, d4 - d6);
        if (d9 <= d7) {
            return true;
        }
        double e = C33748b.m135676e(C33748b.m135680i(d8) * m135702t(d, d2, d3, d4, d5, d6));
        if (e > d7) {
            return false;
        }
        double d10 = C33748b.m135675d(d, d3, d2 - d4);
        double d11 = ((1.0d - (d10 * 2.0d)) * e) + d10;
        if (d8 > d11 || d9 > d11) {
            return false;
        }
        if (d10 < 0.74d) {
            return true;
        }
        double d12 = 1.0d - (2.0d * e);
        if (C33748b.m135681j((d8 - e) / d12, (d9 - e) / d12) > 0.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static int m135697o(LatLng latLng, List<LatLng> list, boolean z, boolean z2, double d) {
        List<LatLng> list2;
        int i;
        char c;
        LatLng latLng2 = latLng;
        int size = list.size();
        if (size == 0) {
            return -1;
        }
        double d2 = d / 6371009.0d;
        double c2 = C33748b.m135674c(d2);
        double radians = Math.toRadians(latLng2.f73028a);
        double radians2 = Math.toRadians(latLng2.f73029b);
        if (z) {
            i = size - 1;
            list2 = list;
        } else {
            list2 = list;
            i = 0;
        }
        LatLng latLng3 = list2.get(i);
        double radians3 = Math.toRadians(latLng3.f73028a);
        double radians4 = Math.toRadians(latLng3.f73029b);
        if (z2) {
            int i2 = 0;
            double d3 = radians3;
            double d4 = radians4;
            for (LatLng next : list) {
                double radians5 = Math.toRadians(next.f73028a);
                double radians6 = Math.toRadians(next.f73029b);
                if (m135696n(d3, d4, radians5, radians6, radians, radians2, c2)) {
                    return Math.max(0, i2 - 1);
                }
                i2++;
                d3 = radians5;
                d4 = radians6;
            }
            return -1;
        }
        double d5 = radians - d2;
        double d6 = radians + d2;
        double g = C33748b.m135678g(radians3);
        double g2 = C33748b.m135678g(radians);
        double[] dArr = new double[3];
        int i3 = 0;
        for (LatLng next2 : list) {
            double d7 = g2;
            double radians7 = Math.toRadians(next2.f73028a);
            double g3 = C33748b.m135678g(radians7);
            double radians8 = Math.toRadians(next2.f73029b);
            if (Math.max(radians3, radians7) < d5 || Math.min(radians3, radians7) > d6) {
                c = 3;
            } else {
                double k = C33748b.m135682k(radians8 - radians4, -3.141592653589793d, 3.141592653589793d);
                double k2 = C33748b.m135682k(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
                dArr[0] = k2;
                dArr[1] = k2 + 6.283185307179586d;
                dArr[2] = k2 - 6.283185307179586d;
                c = 3;
                for (int i4 = 0; i4 < 3; i4++) {
                    double d8 = dArr[i4];
                    double d9 = g3 - g;
                    double d10 = (k * k) + (d9 * d9);
                    double d11 = 0.0d;
                    if (d10 > 0.0d) {
                        d11 = C33748b.m135673b(((d8 * k) + ((d7 - g) * d9)) / d10, 0.0d, 1.0d);
                    }
                    if (C33748b.m135675d(radians, C33748b.m135677f(g + (d11 * d9)), d8 - (d11 * k)) < c2) {
                        return Math.max(0, i3 - 1);
                    }
                }
                continue;
            }
            i3++;
            radians3 = radians7;
            g2 = d7;
            g = g3;
            char c3 = c;
            radians4 = radians8;
        }
        return -1;
    }

    /* renamed from: p */
    public static int m135698p(LatLng latLng, List<LatLng> list, boolean z) {
        return m135699q(latLng, list, z, 0.1d);
    }

    /* renamed from: q */
    public static int m135699q(LatLng latLng, List<LatLng> list, boolean z, double d) {
        return m135697o(latLng, list, false, z, d);
    }

    /* renamed from: r */
    public static double m135700r(double d, double d2, double d3, double d4) {
        return ((C33748b.m135678g(d) * (d3 - d4)) + (C33748b.m135678g(d2) * d4)) / d3;
    }

    /* renamed from: s */
    public static List<LatLng> m135701s(List<LatLng> list, double d) {
        LatLng latLng;
        List<LatLng> list2 = list;
        int size = list.size();
        if (size >= 1) {
            double d2 = 0.0d;
            if (d > 0.0d) {
                boolean h = m135690h(list);
                if (h) {
                    latLng = list2.get(list.size() - 1);
                    list2.remove(list.size() - 1);
                    list2.add(new LatLng(latLng.f73028a + 1.0E-11d, latLng.f73029b + 1.0E-11d));
                } else {
                    latLng = null;
                }
                Stack stack = new Stack();
                double[] dArr = new double[size];
                int i = 0;
                dArr[0] = 1.0d;
                int i2 = size - 1;
                dArr[i2] = 1.0d;
                if (size > 2) {
                    stack.push(new int[]{0, i2});
                    int i3 = 0;
                    while (stack.size() > 0) {
                        int[] iArr = (int[]) stack.pop();
                        double d3 = d2;
                        for (int i4 = iArr[0] + 1; i4 < iArr[1]; i4++) {
                            double d4 = m135686d(list2.get(i4), list2.get(iArr[0]), list2.get(iArr[1]));
                            if (d4 > d3) {
                                d3 = d4;
                                i3 = i4;
                            }
                        }
                        if (d3 > d) {
                            dArr[i3] = d3;
                            stack.push(new int[]{iArr[0], i3});
                            stack.push(new int[]{i3, iArr[1]});
                        }
                        d2 = 0.0d;
                    }
                }
                if (h) {
                    list2.remove(list.size() - 1);
                    list2.add(latLng);
                }
                ArrayList arrayList = new ArrayList();
                for (LatLng next : list) {
                    if (dArr[i] != 0.0d) {
                        arrayList.add(next);
                    }
                    i++;
                }
                return arrayList;
            }
            throw new IllegalArgumentException("Tolerance must be greater than zero");
        }
        throw new IllegalArgumentException("Polyline must have at least 1 point");
    }

    /* renamed from: t */
    public static double m135702t(double d, double d2, double d3, double d4, double d5, double d6) {
        double sin = Math.sin(d);
        double cos = Math.cos(d3);
        double cos2 = Math.cos(d5);
        double d7 = d6 - d2;
        double d8 = d4 - d2;
        double sin2 = Math.sin(d7) * cos2;
        double sin3 = Math.sin(d8) * cos;
        double d9 = sin * 2.0d;
        double sin4 = Math.sin(d5 - d) + (cos2 * d9 * C33748b.m135674c(d7));
        double sin5 = Math.sin(d3 - d) + (d9 * cos * C33748b.m135674c(d8));
        double d10 = ((sin2 * sin2) + (sin4 * sin4)) * ((sin3 * sin3) + (sin5 * sin5));
        if (d10 <= 0.0d) {
            return 1.0d;
        }
        return ((sin2 * sin5) - (sin4 * sin3)) / Math.sqrt(d10);
    }

    /* renamed from: u */
    public static double m135703u(double d, double d2, double d3, double d4) {
        return ((Math.tan(d) * Math.sin(d3 - d4)) + (Math.tan(d2) * Math.sin(d4))) / Math.sin(d3);
    }
}
