package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class l10 {

    /* renamed from: a */
    public static final Class<?> f71332a;

    /* renamed from: b */
    public static final C29355j<?, ?> f71333b = m120654C(false);

    /* renamed from: c */
    public static final C29355j<?, ?> f71334c = m120654C(true);

    /* renamed from: d */
    public static final C29355j<?, ?> f71335d = new C29429l();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f71332a = cls;
    }

    /* renamed from: A */
    public static int m120652A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C29686ry.m121015f(i << 3) + 1);
    }

    /* renamed from: B */
    public static <T> void m120653B(s00 s00, T t, T t2, long j) {
        C29725t.m121152x(t, j, s00.m121058b(C29725t.m121139k(t, j), C29725t.m121139k(t2, j)));
    }

    /* renamed from: C */
    public static C29355j<?, ?> m120654C(boolean z) {
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
            return (C29355j) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m120655D(List<?> list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m120656E(int i, List<zbwp> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * C29686ry.m121014e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += C29686ry.m121006G(list.get(i2));
        }
        return e;
    }

    /* renamed from: F */
    public static int m120657F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m120658G(list) + (size * C29686ry.m121014e(i));
    }

    /* renamed from: G */
    public static int m120658G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C29539nz) {
            C29539nz nzVar = (C29539nz) list;
            i = 0;
            while (i2 < size) {
                i += C29686ry.m121009J(nzVar.mo84747h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C29686ry.m121009J(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m120659H(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C29686ry.m121015f(i << 3) + 4);
    }

    /* renamed from: I */
    public static int m120660I(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m120661J(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C29686ry.m121015f(i << 3) + 8);
    }

    /* renamed from: K */
    public static int m120662K(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m120663L(int i, List<x00> list, j10 j10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C29686ry.m121007H(i, list.get(i3), j10);
        }
        return i2;
    }

    /* renamed from: M */
    public static int m120664M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m120665N(list) + (size * C29686ry.m121014e(i));
    }

    /* renamed from: N */
    public static int m120665N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C29539nz) {
            C29539nz nzVar = (C29539nz) list;
            i = 0;
            while (i2 < size) {
                i += C29686ry.m121009J(nzVar.mo84747h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C29686ry.m121009J(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static int m120666O(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m120667P(list) + (list.size() * C29686ry.m121014e(i));
    }

    /* renamed from: P */
    public static int m120667P(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l00) {
            l00 l00 = (l00) list;
            i = 0;
            while (i2 < size) {
                i += C29686ry.m121016g(l00.mo84705h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C29686ry.m121016g(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m120668Q(int i, Object obj, j10 j10) {
        if (!(obj instanceof c00)) {
            return C29686ry.m121015f(i << 3) + C29686ry.m121012c((x00) obj, j10);
        }
        int f = C29686ry.m121015f(i << 3);
        int a = ((c00) obj).mo84549a();
        return f + C29686ry.m121015f(a) + a;
    }

    /* renamed from: R */
    public static int m120669R(int i, List<?> list, j10 j10) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = C29686ry.m121014e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof c00) {
                i2 = C29686ry.m121010a((c00) obj);
            } else {
                i2 = C29686ry.m121012c((x00) obj, j10);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: S */
    public static int m120670S(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m120671T(list) + (size * C29686ry.m121014e(i));
    }

    /* renamed from: T */
    public static int m120671T(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C29539nz) {
            C29539nz nzVar = (C29539nz) list;
            i = 0;
            while (i2 < size) {
                int h = nzVar.mo84747h(i2);
                i += C29686ry.m121015f((h >> 31) ^ (h + h));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + C29686ry.m121015f((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m120672U(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m120673V(list) + (size * C29686ry.m121014e(i));
    }

    /* renamed from: V */
    public static int m120673V(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l00) {
            l00 l00 = (l00) list;
            i = 0;
            while (i2 < size) {
                long h = l00.mo84705h(i2);
                i += C29686ry.m121016g((h >> 63) ^ (h + h));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + C29686ry.m121016g((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static int m120674W(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = C29686ry.m121014e(i) * size;
        if (list instanceof e00) {
            e00 e00 = (e00) list;
            while (i4 < size) {
                Object c3 = e00.mo84576c3(i4);
                if (c3 instanceof zbwp) {
                    i3 = C29686ry.m121006G((zbwp) c3);
                } else {
                    i3 = C29686ry.m121013d((String) c3);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zbwp) {
                    i2 = C29686ry.m121006G((zbwp) obj);
                } else {
                    i2 = C29686ry.m121013d((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: X */
    public static int m120675X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m120676Y(list) + (size * C29686ry.m121014e(i));
    }

    /* renamed from: Y */
    public static int m120676Y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C29539nz) {
            C29539nz nzVar = (C29539nz) list;
            i = 0;
            while (i2 < size) {
                i += C29686ry.m121015f(nzVar.mo84747h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C29686ry.m121015f(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    public static int m120677Z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m120679a0(list) + (size * C29686ry.m121014e(i));
    }

    /* renamed from: a */
    public static C29355j<?, ?> m120678a() {
        return f71334c;
    }

    /* renamed from: a0 */
    public static int m120679a0(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l00) {
            l00 l00 = (l00) list;
            i = 0;
            while (i2 < size) {
                i += C29686ry.m121016g(l00.mo84705h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C29686ry.m121016g(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C29355j<?, ?> m120680b() {
        return f71335d;
    }

    /* renamed from: b0 */
    public static C29355j<?, ?> m120681b0() {
        return f71333b;
    }

    /* renamed from: c */
    public static <UT, UB> UB m120682c(int i, List<Integer> list, C29650qz qzVar, UB ub, C29355j<UT, UB> jVar) {
        if (qzVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (qzVar.mo84506a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m120683d(i, intValue, ub, jVar);
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
                if (!qzVar.mo84506a(intValue2)) {
                    ub = m120683d(i, intValue2, ub, jVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: d */
    public static <UT, UB> UB m120683d(int i, int i2, UB ub, C29355j<UT, UB> jVar) {
        if (ub == null) {
            ub = jVar.mo84682e();
        }
        jVar.mo84684g(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: e */
    public static <T, FT extends C29096bz<FT>> void m120684e(C29945yy<FT> yyVar, T t, T t2) {
        C29133cz<FT> b = yyVar.mo84918b(t2);
        if (!b.f71192a.isEmpty()) {
            yyVar.mo84919c(t).mo84569j(b);
        }
    }

    /* renamed from: f */
    public static <T, UT, UB> void m120685f(C29355j<UT, UB> jVar, T t, T t2) {
        jVar.mo84687j(t, jVar.mo84681d(jVar.mo84680c(t), jVar.mo84680c(t2)));
    }

    /* renamed from: g */
    public static void m120686g(Class<?> cls) {
        Class<?> cls2;
        if (!C29502mz.class.isAssignableFrom(cls) && (cls2 = f71332a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static void m120687h(int i, List<Boolean> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84872u(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m120688i(int i, List<zbwp> list, C29947z zVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84849J(i, list);
        }
    }

    /* renamed from: j */
    public static void m120689j(int i, List<Double> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84864m(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m120690k(int i, List<Integer> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84868q(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m120691l(int i, List<Integer> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84853b(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m120692m(int i, List<Long> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84857f(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m120693n(int i, List<Float> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84845F(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m120694o(int i, List<?> list, C29947z zVar, j10 j10) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C29723sy) zVar).mo84855d(i, list.get(i2), j10);
            }
        }
    }

    /* renamed from: p */
    public static void m120695p(int i, List<Integer> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84874w(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m120696q(int i, List<Long> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84841B(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m120697r(int i, List<?> list, C29947z zVar, j10 j10) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C29723sy) zVar).mo84870s(i, list.get(i2), j10);
            }
        }
    }

    /* renamed from: s */
    public static void m120698s(int i, List<Integer> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84871t(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m120699t(int i, List<Long> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84840A(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m120700u(int i, List<Integer> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84863l(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m120701v(int i, List<Long> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84861j(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m120702w(int i, List<String> list, C29947z zVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84862k(i, list);
        }
    }

    /* renamed from: x */
    public static void m120703x(int i, List<Integer> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84860i(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m120704y(int i, List<Long> list, C29947z zVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zVar.mo84847H(i, list, z);
        }
    }

    /* renamed from: z */
    public static boolean m120705z(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }
}
