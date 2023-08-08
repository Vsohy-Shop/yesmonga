package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.r4 */
public final class C39032r4 {

    /* renamed from: a */
    public static final Class<?> f98932a;

    /* renamed from: b */
    public static final C38918f5<?, ?> f98933b = m160754C(false);

    /* renamed from: c */
    public static final C38918f5<?, ?> f98934c = m160754C(true);

    /* renamed from: d */
    public static final C38918f5<?, ?> f98935d = new C38948i5();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f98932a = cls;
    }

    /* renamed from: A */
    public static int m160752A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C39056u1.m160858d(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m160753B(int i, List<Long> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123087l(i, list, z);
        }
    }

    /* renamed from: C */
    public static C38918f5<?, ?> m160754C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C38918f5) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m160755D(List<?> list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m160756E(int i, List<zzdc> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c = size * C39056u1.m160857c(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            c += C39056u1.m160849B(list.get(i2));
        }
        return c;
    }

    /* renamed from: F */
    public static int m160757F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m160758G(list) + (size * C39056u1.m160857c(i));
    }

    /* renamed from: G */
    public static int m160758G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C39012p2) {
            C39012p2 p2Var = (C39012p2) list;
            i = 0;
            while (i2 < size) {
                i += C39056u1.m160852E(p2Var.mo123000h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C39056u1.m160852E(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m160759H(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C39056u1.m160858d(i << 3) + 4);
    }

    /* renamed from: I */
    public static int m160760I(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m160761J(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C39056u1.m160858d(i << 3) + 8);
    }

    /* renamed from: K */
    public static int m160762K(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m160763L(int i, List<C39076w3> list, C39014p4 p4Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C39056u1.m160850C(i, list.get(i3), p4Var);
        }
        return i2;
    }

    /* renamed from: M */
    public static int m160764M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m160765N(list) + (size * C39056u1.m160857c(i));
    }

    /* renamed from: N */
    public static int m160765N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C39012p2) {
            C39012p2 p2Var = (C39012p2) list;
            i = 0;
            while (i2 < size) {
                i += C39056u1.m160852E(p2Var.mo123000h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C39056u1.m160852E(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static int m160766O(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m160767P(list) + (list.size() * C39056u1.m160857c(i));
    }

    /* renamed from: P */
    public static int m160767P(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C38986m3) {
            C38986m3 m3Var = (C38986m3) list;
            i = 0;
            while (i2 < size) {
                i += C39056u1.m160859e(m3Var.mo122961h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C39056u1.m160859e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m160768Q(int i, Object obj, C39014p4 p4Var) {
        if (!(obj instanceof C38886c3)) {
            return C39056u1.m160858d(i << 3) + C39056u1.m160855a((C39076w3) obj, p4Var);
        }
        int d = C39056u1.m160858d(i << 3);
        int a = ((C38886c3) obj).mo122807a();
        return d + C39056u1.m160858d(a) + a;
    }

    /* renamed from: R */
    public static int m160769R(int i, List<?> list, C39014p4 p4Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c = C39056u1.m160857c(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C38886c3) {
                i2 = C39056u1.m160853F((C38886c3) obj);
            } else {
                i2 = C39056u1.m160855a((C39076w3) obj, p4Var);
            }
            c += i2;
        }
        return c;
    }

    /* renamed from: S */
    public static int m160770S(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m160771T(list) + (size * C39056u1.m160857c(i));
    }

    /* renamed from: T */
    public static int m160771T(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C39012p2) {
            C39012p2 p2Var = (C39012p2) list;
            i = 0;
            while (i2 < size) {
                int h = p2Var.mo123000h(i2);
                i += C39056u1.m160858d((h >> 31) ^ (h + h));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + C39056u1.m160858d((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m160772U(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m160773V(list) + (size * C39056u1.m160857c(i));
    }

    /* renamed from: V */
    public static int m160773V(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C38986m3) {
            C38986m3 m3Var = (C38986m3) list;
            i = 0;
            while (i2 < size) {
                long h = m3Var.mo122961h(i2);
                i += C39056u1.m160859e((h >> 63) ^ (h + h));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + C39056u1.m160859e((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static int m160774W(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int c = C39056u1.m160857c(i) * size;
        if (list instanceof C38906e3) {
            C38906e3 e3Var = (C38906e3) list;
            while (i4 < size) {
                Object m = e3Var.mo122843m(i4);
                if (m instanceof zzdc) {
                    i3 = C39056u1.m160849B((zzdc) m);
                } else {
                    i3 = C39056u1.m160856b((String) m);
                }
                c += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzdc) {
                    i2 = C39056u1.m160849B((zzdc) obj);
                } else {
                    i2 = C39056u1.m160856b((String) obj);
                }
                c += i2;
                i4++;
            }
        }
        return c;
    }

    /* renamed from: X */
    public static int m160775X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m160776Y(list) + (size * C39056u1.m160857c(i));
    }

    /* renamed from: Y */
    public static int m160776Y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C39012p2) {
            C39012p2 p2Var = (C39012p2) list;
            i = 0;
            while (i2 < size) {
                i += C39056u1.m160858d(p2Var.mo123000h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C39056u1.m160858d(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    public static int m160777Z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m160779a0(list) + (size * C39056u1.m160857c(i));
    }

    /* renamed from: a */
    public static C38918f5<?, ?> m160778a() {
        return f98934c;
    }

    /* renamed from: a0 */
    public static int m160779a0(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C38986m3) {
            C38986m3 m3Var = (C38986m3) list;
            i = 0;
            while (i2 < size) {
                i += C39056u1.m160859e(m3Var.mo122961h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C39056u1.m160859e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C38918f5<?, ?> m160780b() {
        return f98935d;
    }

    /* renamed from: b0 */
    public static C38918f5<?, ?> m160781b0() {
        return f98933b;
    }

    /* renamed from: c */
    public static <UT, UB> UB m160782c(int i, List<Integer> list, C39039s2 s2Var, UB ub, C38918f5<UT, UB> f5Var) {
        if (s2Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (s2Var.mo99095l(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m160783d(i, intValue, ub, f5Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!s2Var.mo99095l(intValue2)) {
                    ub = m160783d(i, intValue2, ub, f5Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: d */
    public static <UT, UB> UB m160783d(int i, int i2, UB ub, C38918f5<UT, UB> f5Var) {
        if (ub == null) {
            ub = f5Var.mo122888e();
        }
        f5Var.mo122889f(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: e */
    public static <T, FT extends C38895d2<FT>> void m160784e(C38865a2<FT> a2Var, T t, T t2) {
        C38905e2<FT> b = a2Var.mo122778b(t2);
        if (!b.f98835a.isEmpty()) {
            a2Var.mo122779c(t).mo122866h(b);
        }
    }

    /* renamed from: f */
    public static <T, UT, UB> void m160785f(C38918f5<UT, UB> f5Var, T t, T t2) {
        f5Var.mo122891h(t, f5Var.mo122887d(f5Var.mo122886c(t), f5Var.mo122886c(t2)));
    }

    /* renamed from: g */
    public static void m160786g(Class<?> cls) {
        Class<?> cls2;
        if (!C39003o2.class.isAssignableFrom(cls) && (cls2 = f98932a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static boolean m160787h(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* renamed from: i */
    public static <T> void m160788i(C39031r3 r3Var, T t, T t2, long j) {
        C39024q5.m160734x(t, j, C39031r3.m160751b(C39024q5.m160721k(t, j), C39024q5.m160721k(t2, j)));
    }

    /* renamed from: j */
    public static void m160789j(int i, List<Boolean> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123089o(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m160790k(int i, List<zzdc> list, C39065v1 v1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123091q(i, list);
        }
    }

    /* renamed from: l */
    public static void m160791l(int i, List<Double> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123093s(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m160792m(int i, List<Integer> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123096v(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m160793n(int i, List<Integer> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123098x(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m160794o(int i, List<Long> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123100z(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m160795p(int i, List<Float> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123065B(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m160796q(int i, List<?> list, C39065v1 v1Var, C39014p4 p4Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                v1Var.mo123066C(i, list.get(i2), p4Var);
            }
        }
    }

    /* renamed from: r */
    public static void m160797r(int i, List<Integer> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123068E(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m160798s(int i, List<Long> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123070G(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m160799t(int i, List<?> list, C39065v1 v1Var, C39014p4 p4Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                v1Var.mo123071H(i, list.get(i2), p4Var);
            }
        }
    }

    /* renamed from: u */
    public static void m160800u(int i, List<Integer> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123074K(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m160801v(int i, List<Long> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123076a(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m160802w(int i, List<Integer> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123078c(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m160803x(int i, List<Long> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123080e(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m160804y(int i, List<String> list, C39065v1 v1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123083h(i, list);
        }
    }

    /* renamed from: z */
    public static void m160805z(int i, List<Integer> list, C39065v1 v1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            v1Var.mo123085j(i, list, z);
        }
    }
}
