package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.gtm.jl */
public final class C41363jl {

    /* renamed from: a */
    public static final Class<?> f104722a;

    /* renamed from: b */
    public static final C41724yl<?, ?> f104723b = m167800C(false);

    /* renamed from: c */
    public static final C41724yl<?, ?> f104724c = m167800C(true);

    /* renamed from: d */
    public static final C41724yl<?, ?> f104725d = new C41148am();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f104722a = cls;
    }

    /* renamed from: A */
    public static int m167798A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C41144ai.m167094d(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m167799B(int i, List<Long> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135093l(i, list, z);
        }
    }

    /* renamed from: C */
    public static C41724yl<?, ?> m167800C(boolean z) {
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
            return (C41724yl) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m167801D(List<?> list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m167802E(int i, List<zztd> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c = size * C41144ai.m167093c(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            c += C41144ai.m167085B(list.get(i2));
        }
        return c;
    }

    /* renamed from: F */
    public static int m167803F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m167804G(list) + (size * C41144ai.m167093c(i));
    }

    /* renamed from: G */
    public static int m167804G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            i = 0;
            while (i2 < size) {
                i += C41144ai.m167088E(njVar.mo135668h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C41144ai.m167088E(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m167805H(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C41144ai.m167094d(i << 3) + 4);
    }

    /* renamed from: I */
    public static int m167806I(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m167807J(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C41144ai.m167094d(i << 3) + 8);
    }

    /* renamed from: K */
    public static int m167808K(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m167809L(int i, List<C41627uk> list, C41315hl hlVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C41144ai.m167086C(i, list.get(i3), hlVar);
        }
        return i2;
    }

    /* renamed from: M */
    public static int m167810M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m167811N(list) + (size * C41144ai.m167093c(i));
    }

    /* renamed from: N */
    public static int m167811N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            i = 0;
            while (i2 < size) {
                i += C41144ai.m167088E(njVar.mo135668h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C41144ai.m167088E(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static int m167812O(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m167813P(list) + (list.size() * C41144ai.m167093c(i));
    }

    /* renamed from: P */
    public static int m167813P(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41362jk) {
            C41362jk jkVar = (C41362jk) list;
            i = 0;
            while (i2 < size) {
                i += C41144ai.m167095e(jkVar.mo135522h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C41144ai.m167095e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m167814Q(int i, Object obj, C41315hl hlVar) {
        if (!(obj instanceof C41146ak)) {
            return C41144ai.m167094d(i << 3) + C41144ai.m167091a((C41627uk) obj, hlVar);
        }
        int d = C41144ai.m167094d(i << 3);
        int a = ((C41146ak) obj).mo135033a();
        return d + C41144ai.m167094d(a) + a;
    }

    /* renamed from: R */
    public static int m167815R(int i, List<?> list, C41315hl hlVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c = C41144ai.m167093c(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C41146ak) {
                i2 = C41144ai.m167089F((C41146ak) obj);
            } else {
                i2 = C41144ai.m167091a((C41627uk) obj, hlVar);
            }
            c += i2;
        }
        return c;
    }

    /* renamed from: S */
    public static int m167816S(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m167817T(list) + (size * C41144ai.m167093c(i));
    }

    /* renamed from: T */
    public static int m167817T(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            i = 0;
            while (i2 < size) {
                int h = njVar.mo135668h(i2);
                i += C41144ai.m167094d((h >> 31) ^ (h + h));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + C41144ai.m167094d((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m167818U(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m167819V(list) + (size * C41144ai.m167093c(i));
    }

    /* renamed from: V */
    public static int m167819V(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41362jk) {
            C41362jk jkVar = (C41362jk) list;
            i = 0;
            while (i2 < size) {
                long h = jkVar.mo135522h(i2);
                i += C41144ai.m167095e((h >> 63) ^ (h + h));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + C41144ai.m167095e((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static int m167820W(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int c = C41144ai.m167093c(i) * size;
        if (list instanceof C41194ck) {
            C41194ck ckVar = (C41194ck) list;
            while (i4 < size) {
                Object m = ckVar.mo135129m(i4);
                if (m instanceof zztd) {
                    i3 = C41144ai.m167085B((zztd) m);
                } else {
                    i3 = C41144ai.m167092b((String) m);
                }
                c += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zztd) {
                    i2 = C41144ai.m167085B((zztd) obj);
                } else {
                    i2 = C41144ai.m167092b((String) obj);
                }
                c += i2;
                i4++;
            }
        }
        return c;
    }

    /* renamed from: X */
    public static int m167821X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m167822Y(list) + (size * C41144ai.m167093c(i));
    }

    /* renamed from: Y */
    public static int m167822Y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            i = 0;
            while (i2 < size) {
                i += C41144ai.m167094d(njVar.mo135668h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C41144ai.m167094d(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    public static int m167823Z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m167825a0(list) + (size * C41144ai.m167093c(i));
    }

    /* renamed from: a */
    public static C41724yl<?, ?> m167824a() {
        return f104724c;
    }

    /* renamed from: a0 */
    public static int m167825a0(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41362jk) {
            C41362jk jkVar = (C41362jk) list;
            i = 0;
            while (i2 < size) {
                i += C41144ai.m167095e(jkVar.mo135522h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C41144ai.m167095e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C41724yl<?, ?> m167826b() {
        return f104725d;
    }

    /* renamed from: b0 */
    public static C41724yl<?, ?> m167827b0() {
        return f104723b;
    }

    /* renamed from: c */
    public static <UT, UB> UB m167828c(int i, List<Integer> list, C41530qj qjVar, UB ub, C41724yl<UT, UB> ylVar) {
        if (qjVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (qjVar.mo135344l(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m167829d(i, intValue, ub, ylVar);
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
                if (!qjVar.mo135344l(intValue2)) {
                    ub = m167829d(i, intValue2, ub, ylVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: d */
    public static <UT, UB> UB m167829d(int i, int i2, UB ub, C41724yl<UT, UB> ylVar) {
        if (ub == null) {
            ub = ylVar.mo135044f();
        }
        ylVar.mo135050l(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: e */
    public static <T, FT extends C41145aj<FT>> void m167830e(C41697xi<FT> xiVar, T t, T t2) {
        C41169bj<FT> b = xiVar.mo136047b(t2);
        if (!b.f104470a.isEmpty()) {
            xiVar.mo136048c(t).mo135114h(b);
        }
    }

    /* renamed from: f */
    public static <T, UT, UB> void m167831f(C41724yl<UT, UB> ylVar, T t, T t2) {
        ylVar.mo135053o(t, ylVar.mo135043e(ylVar.mo135042d(t), ylVar.mo135042d(t2)));
    }

    /* renamed from: g */
    public static void m167832g(Class<?> cls) {
        Class<?> cls2;
        if (!C41410lj.class.isAssignableFrom(cls) && (cls2 = f104722a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static boolean m167833h(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* renamed from: i */
    public static <T> void m167834i(C41507pk pkVar, T t, T t2, long j) {
        C41340im.m167766x(t, j, C41507pk.m168195c(C41340im.m167753k(t, j), C41340im.m167753k(t2, j)));
    }

    /* renamed from: j */
    public static void m167835j(int i, List<Boolean> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135095o(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m167836k(int i, List<zztd> list, C41168bi biVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135097q(i, list);
        }
    }

    /* renamed from: l */
    public static void m167837l(int i, List<Double> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135099s(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m167838m(int i, List<Integer> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135102v(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m167839n(int i, List<Integer> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135104x(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m167840o(int i, List<Long> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135106z(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m167841p(int i, List<Float> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135071B(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m167842q(int i, List<?> list, C41168bi biVar, C41315hl hlVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                biVar.mo135072C(i, list.get(i2), hlVar);
            }
        }
    }

    /* renamed from: r */
    public static void m167843r(int i, List<Integer> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135074E(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m167844s(int i, List<Long> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135076G(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m167845t(int i, List<?> list, C41168bi biVar, C41315hl hlVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                biVar.mo135077H(i, list.get(i2), hlVar);
            }
        }
    }

    /* renamed from: u */
    public static void m167846u(int i, List<Integer> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135080K(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m167847v(int i, List<Long> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135082a(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m167848w(int i, List<Integer> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135084c(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m167849x(int i, List<Long> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135086e(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m167850y(int i, List<String> list, C41168bi biVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135089h(i, list);
        }
    }

    /* renamed from: z */
    public static void m167851z(int i, List<Integer> list, C41168bi biVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            biVar.mo135091j(i, list, z);
        }
    }
}
