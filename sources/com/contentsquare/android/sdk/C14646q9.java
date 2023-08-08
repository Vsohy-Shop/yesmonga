package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14253cc;
import com.contentsquare.android.sdk.C14566o3;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.contentsquare.android.sdk.q9 */
public final class C14646q9 {

    /* renamed from: a */
    public static final Class<?> f36264a = m63154g();

    /* renamed from: b */
    public static final C14436j0<?, ?> f36265b = m63153f(false);

    /* renamed from: c */
    public static final C14436j0<?, ?> f36266c = m63153f(true);

    /* renamed from: d */
    public static final C14436j0<?, ?> f36267d = new C14786v1();

    /* renamed from: A */
    public static int m63117A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? C14235c1.m61195r0(i) + C14235c1.m61170d0(size * 4) : size * C14235c1.m61152A(i, 0);
    }

    /* renamed from: B */
    public static int m63118B(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: C */
    public static C14436j0<?, ?> m63119C() {
        return f36265b;
    }

    /* renamed from: D */
    public static void m63120D(int i, List<Integer> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35457x(i, list, z);
        }
    }

    /* renamed from: E */
    public static int m63121E(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? C14235c1.m61195r0(i) + C14235c1.m61170d0(size * 8) : size * C14235c1.m61177h(i, 0);
    }

    /* renamed from: F */
    public static int m63122F(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: G */
    public static C14436j0<?, ?> m63123G() {
        return f36266c;
    }

    /* renamed from: H */
    public static void m63124H(int i, List<Integer> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35430N(i, list, z);
        }
    }

    /* renamed from: I */
    public static int m63125I(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int J = m63126J(list);
        int r0 = C14235c1.m61195r0(i);
        return z ? r0 + C14235c1.m61170d0(J) : J + (size * r0);
    }

    /* renamed from: J */
    public static int m63126J(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14846x2) {
            C14846x2 x2Var = (C14846x2) list;
            i = 0;
            while (i2 < size) {
                i += C14235c1.m61163T(x2Var.mo36787H(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14235c1.m61163T(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    public static C14436j0<?, ?> m63127K() {
        return f36267d;
    }

    /* renamed from: L */
    public static void m63128L(int i, List<Long> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35450q(i, list, z);
        }
    }

    /* renamed from: M */
    public static int m63129M(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int N = m63130N(list);
        return z ? C14235c1.m61195r0(i) + C14235c1.m61170d0(N) : N + (list.size() * C14235c1.m61195r0(i));
    }

    /* renamed from: N */
    public static int m63130N(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14871y) {
            C14871y yVar = (C14871y) list;
            i = 0;
            while (i2 < size) {
                i += C14235c1.m61158G(yVar.mo36867H(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14235c1.m61158G(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static void m63131O(int i, List<Float> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35440g(i, list, z);
        }
    }

    /* renamed from: P */
    public static int m63132P(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Q = m63133Q(list);
        int r0 = C14235c1.m61195r0(i);
        return z ? r0 + C14235c1.m61170d0(Q) : Q + (size * r0);
    }

    /* renamed from: Q */
    public static int m63133Q(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14846x2) {
            C14846x2 x2Var = (C14846x2) list;
            i = 0;
            while (i2 < size) {
                i += C14235c1.m61188n0(x2Var.mo36787H(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14235c1.m61188n0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: R */
    public static void m63134R(int i, List<Integer> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35444k(i, list, z);
        }
    }

    /* renamed from: S */
    public static int m63135S(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int T = m63136T(list);
        int r0 = C14235c1.m61195r0(i);
        return z ? r0 + C14235c1.m61170d0(T) : T + (size * r0);
    }

    /* renamed from: T */
    public static int m63136T(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14871y) {
            C14871y yVar = (C14871y) list;
            i = 0;
            while (i2 < size) {
                i += C14235c1.m61176g0(yVar.mo36867H(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14235c1.m61176g0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static void m63137U(int i, List<Long> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35458y(i, list, z);
        }
    }

    /* renamed from: V */
    public static int m63138V(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int W = m63139W(list);
        int r0 = C14235c1.m61195r0(i);
        return z ? r0 + C14235c1.m61170d0(W) : W + (size * r0);
    }

    /* renamed from: W */
    public static int m63139W(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14846x2) {
            C14846x2 x2Var = (C14846x2) list;
            i = 0;
            while (i2 < size) {
                i += C14235c1.m61200v0(x2Var.mo36787H(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14235c1.m61200v0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: X */
    public static void m63140X(int i, List<Integer> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35449p(i, list, z);
        }
    }

    /* renamed from: Y */
    public static int m63141Y(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Z = m63142Z(list);
        int r0 = C14235c1.m61195r0(i);
        return z ? r0 + C14235c1.m61170d0(Z) : Z + (size * r0);
    }

    /* renamed from: Z */
    public static int m63142Z(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14871y) {
            C14871y yVar = (C14871y) list;
            i = 0;
            while (i2 < size) {
                i += C14235c1.m61186m0(yVar.mo36867H(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14235c1.m61186m0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m63143a(int i, Object obj, C14398h8 h8Var) {
        return obj instanceof C14704sa ? C14235c1.m61156E(i, (C14704sa) obj) : C14235c1.m61155D(i, (C14218ba) obj, h8Var);
    }

    /* renamed from: a0 */
    public static void m63144a0(int i, List<Long> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35455v(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m63145b(int i, List<C14719t0> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r0 = size * C14235c1.m61195r0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            r0 += C14235c1.m61196s(list.get(i2));
        }
        return r0;
    }

    /* renamed from: b0 */
    public static void m63146b0(int i, List<Integer> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35447n(i, list, z);
        }
    }

    /* renamed from: c */
    public static int m63147c(int i, List<C14218ba> list, C14398h8 h8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C14235c1.m61179j(i, list.get(i3), h8Var);
        }
        return i2;
    }

    /* renamed from: c0 */
    public static void m63148c0(int i, List<Long> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35451r(i, list, z);
        }
    }

    /* renamed from: d */
    public static int m63149d(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? C14235c1.m61195r0(i) + C14235c1.m61170d0(size) : size * C14235c1.m61187n(i, true);
    }

    /* renamed from: d0 */
    public static void m63150d0(int i, List<Integer> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35454u(i, list, z);
        }
    }

    /* renamed from: e */
    public static int m63151e(List<?> list) {
        return list.size();
    }

    /* renamed from: e0 */
    public static void m63152e0(int i, List<Long> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35426J(i, list, z);
        }
    }

    /* renamed from: f */
    public static C14436j0<?, ?> m63153f(boolean z) {
        try {
            Class<?> w = m63170w();
            if (w == null) {
                return null;
            }
            return (C14436j0) w.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static Class<?> m63154g() {
        try {
            return Class.forName("com.contentsquare.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static <UT, UB> UB m63155h(int i, int i2, UB ub, C14436j0<UT, UB> j0Var) {
        if (ub == null) {
            ub = j0Var.mo35563a();
        }
        j0Var.mo35574l(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: i */
    public static <UT, UB> UB m63156i(int i, List<Integer> list, C14566o3.C14570d<?> dVar, UB ub, C14436j0<UT, UB> j0Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.mo35920b(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m63155h(i, intValue, ub, j0Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.mo35920b(intValue2) == null) {
                    ub = m63155h(i, intValue2, ub, j0Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: j */
    public static <UT, UB> UB m63157j(int i, List<Integer> list, C14566o3.C14571e eVar, UB ub, C14436j0<UT, UB> j0Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.mo36035b(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m63155h(i, intValue, ub, j0Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.mo36035b(intValue2)) {
                    ub = m63155h(i, intValue2, ub, j0Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: k */
    public static void m63158k(int i, List<C14719t0> list, C14782uf ufVar) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35459z(i, list);
        }
    }

    /* renamed from: l */
    public static void m63159l(int i, List<?> list, C14782uf ufVar, C14398h8 h8Var) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35417A(i, list, h8Var);
        }
    }

    /* renamed from: m */
    public static void m63160m(int i, List<Boolean> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35419C(i, list, z);
        }
    }

    /* renamed from: n */
    public static <T, UT, UB> void m63161n(C14436j0<UT, UB> j0Var, T t, T t2) {
        j0Var.mo35579q(t, j0Var.mo35565c(j0Var.mo35573k(t), j0Var.mo35573k(t2)));
    }

    /* renamed from: o */
    public static <T, FT extends C14253cc.C14255b<FT>> void m63162o(C14517m3<FT> m3Var, T t, T t2) {
        C14253cc<FT> b = m3Var.mo35026b(t2);
        if (!b.mo34871t()) {
            m3Var.mo35033i(t).mo34863h(b);
        }
    }

    /* renamed from: p */
    public static <T> void m63163p(C14393h4 h4Var, T t, T t2, long j) {
        C14634q4.m63042l(t, j, h4Var.mo35484c(C14634q4.m63030T(t, j), C14634q4.m63030T(t2, j)));
    }

    /* renamed from: q */
    public static void m63164q(Class<?> cls) {
        Class<?> cls2;
        if (!C14359g4.class.isAssignableFrom(cls) && (cls2 = f36264a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* renamed from: r */
    public static boolean m63165r(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: s */
    public static int m63166s(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int r0 = C14235c1.m61195r0(i) * size;
        if (list instanceof C14308ec) {
            C14308ec ecVar = (C14308ec) list;
            while (i2 < size) {
                Object E = ecVar.mo35077E(i2);
                r0 += E instanceof C14719t0 ? C14235c1.m61196s((C14719t0) E) : C14235c1.m61197t((String) E);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                r0 += obj instanceof C14719t0 ? C14235c1.m61196s((C14719t0) obj) : C14235c1.m61197t((String) obj);
                i2++;
            }
        }
        return r0;
    }

    /* renamed from: t */
    public static int m63167t(int i, List<?> list, C14398h8 h8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r0 = C14235c1.m61195r0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            r0 += obj instanceof C14704sa ? C14235c1.m61194r((C14704sa) obj) : C14235c1.m61160I((C14218ba) obj, h8Var);
        }
        return r0;
    }

    /* renamed from: u */
    public static int m63168u(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v = m63169v(list);
        int r0 = C14235c1.m61195r0(i);
        return z ? r0 + C14235c1.m61170d0(v) : v + (size * r0);
    }

    /* renamed from: v */
    public static int m63169v(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14846x2) {
            C14846x2 x2Var = (C14846x2) list;
            i = 0;
            while (i2 < size) {
                i += C14235c1.m61169d(x2Var.mo36787H(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14235c1.m61169d(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: w */
    public static Class<?> m63170w() {
        try {
            return Class.forName("com.contentsquare.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: x */
    public static void m63171x(int i, List<String> list, C14782uf ufVar) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35418B(i, list);
        }
    }

    /* renamed from: y */
    public static void m63172y(int i, List<?> list, C14782uf ufVar, C14398h8 h8Var) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35420D(i, list, h8Var);
        }
    }

    /* renamed from: z */
    public static void m63173z(int i, List<Double> list, C14782uf ufVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ufVar.mo35456w(i, list, z);
        }
    }
}
