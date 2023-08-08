package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import androidx.datastore.preferences.protobuf.C18909y0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.z2 */
public final class C18922z2 {

    /* renamed from: a */
    public static final Class<?> f48150a = m88276D();

    /* renamed from: b */
    public static final C18888v3<?, ?> f48151b = m88280F(false);

    /* renamed from: c */
    public static final C18888v3<?, ?> f48152c = m88280F(true);

    /* renamed from: d */
    public static final C18888v3<?, ?> f48153d = new C18906x3();

    /* renamed from: e */
    public static final int f48154e = 40;

    /* renamed from: A */
    public static int m88270A(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18852r1) {
            C18852r1 r1Var = (C18852r1) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m84499b1(r1Var.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m84499b1(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: A0 */
    public static void m88271A0(int i, String str, Writer writer) throws IOException {
        if (str != null && !str.isEmpty()) {
            writer.mo54230f(i, str);
        }
    }

    /* renamed from: B */
    public static <UT, UB> UB m88272B(int i, List<Integer> list, C18753i1.C18757d<?> dVar, UB ub, C18888v3<UT, UB> v3Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.mo53931a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m88292Q(i, intValue, ub, v3Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.mo53931a(intValue2) == null) {
                    ub = m88292Q(i, intValue2, ub, v3Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B0 */
    public static void m88273B0(int i, List<String> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54229e(i, list);
        }
    }

    /* renamed from: C */
    public static <UT, UB> UB m88274C(int i, List<Integer> list, C18753i1.C18758e eVar, UB ub, C18888v3<UT, UB> v3Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.mo53933a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m88292Q(i, intValue, ub, v3Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.mo53933a(intValue2)) {
                    ub = m88292Q(i, intValue2, ub, v3Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: C0 */
    public static void m88275C0(int i, int i2, Writer writer) throws IOException {
        if (i2 != 0) {
            writer.mo54240p(i, i2);
        }
    }

    /* renamed from: D */
    public static Class<?> m88276D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D0 */
    public static void m88277D0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54236l(i, list, z);
        }
    }

    /* renamed from: E */
    public static Object m88278E(Class<?> cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + m88293R(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return C18923z3.m88370Q(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: E0 */
    public static void m88279E0(int i, long j, Writer writer) throws IOException {
        if (j != 0) {
            writer.mo54231g(i, j);
        }
    }

    /* renamed from: F */
    public static C18888v3<?, ?> m88280F(boolean z) {
        try {
            Class<?> G = m88282G();
            if (G == null) {
                return null;
            }
            return (C18888v3) G.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: F0 */
    public static void m88281F0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54243s(i, list, z);
        }
    }

    /* renamed from: G */
    public static Class<?> m88282G() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: H */
    public static <T, FT extends C18909y0.C18912c<FT>> void m88283H(C18844q0<FT> q0Var, T t, T t2) {
        C18909y0<FT> c = q0Var.mo55344c(t2);
        if (!c.mo55608C()) {
            q0Var.mo55345d(t).mo55613J(c);
        }
    }

    /* renamed from: I */
    public static <T> void m88284I(C18881u1 u1Var, T t, T t2, long j) {
        C18923z3.m88413q0(t, j, u1Var.mo55446a(C18923z3.m88368O(t, j), C18923z3.m88368O(t2, j)));
    }

    /* renamed from: J */
    public static <T, UT, UB> void m88285J(C18888v3<UT, UB> v3Var, T t, T t2) {
        v3Var.mo55471p(t, v3Var.mo55466k(v3Var.mo55462g(t), v3Var.mo55462g(t2)));
    }

    /* renamed from: K */
    public static C18888v3<?, ?> m88286K() {
        return f48151b;
    }

    /* renamed from: L */
    public static C18888v3<?, ?> m88287L() {
        return f48152c;
    }

    /* renamed from: M */
    public static void m88288M(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f48150a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: N */
    public static boolean m88289N(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: O */
    public static boolean m88290O(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = (long) i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    /* renamed from: P */
    public static boolean m88291P(C18865t0[] t0VarArr) {
        if (t0VarArr.length == 0) {
            return false;
        }
        return m88290O(t0VarArr[0].mo55394h0(), t0VarArr[t0VarArr.length - 1].mo55394h0(), t0VarArr.length);
    }

    /* renamed from: Q */
    public static <UT, UB> UB m88292Q(int i, int i2, UB ub, C18888v3<UT, UB> v3Var) {
        if (ub == null) {
            ub = v3Var.mo55469n();
        }
        v3Var.mo55460e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: R */
    public static String m88293R(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ('a' > charAt || charAt > 'z') {
                if ('A' > charAt || charAt > 'Z') {
                    if ('0' <= charAt && charAt <= '9') {
                        sb.append(charAt);
                    }
                    z = true;
                } else if (i != 0 || z) {
                    sb.append(charAt);
                } else {
                    sb.append((char) (charAt + ' '));
                }
            } else if (z) {
                sb.append((char) (charAt - ' '));
            } else {
                sb.append(charAt);
            }
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: S */
    public static C18888v3<?, ?> m88294S() {
        return f48153d;
    }

    /* renamed from: T */
    public static void m88295T(int i, boolean z, Writer writer) throws IOException {
        if (z) {
            writer.mo54249y(i, true);
        }
    }

    /* renamed from: U */
    public static void m88296U(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54209D(i, list, z);
        }
    }

    /* renamed from: V */
    public static void m88297V(int i, ByteString byteString, Writer writer) throws IOException {
        if (byteString != null && !byteString.isEmpty()) {
            writer.mo54220O(i, byteString);
        }
    }

    /* renamed from: W */
    public static void m88298W(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54218M(i, list);
        }
    }

    /* renamed from: X */
    public static void m88299X(int i, double d, Writer writer) throws IOException {
        if (Double.compare(d, 0.0d) != 0) {
            writer.mo54241q(i, d);
        }
    }

    /* renamed from: Y */
    public static void m88300Y(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54216K(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m88301Z(int i, int i2, Writer writer) throws IOException {
        if (i2 != 0) {
            writer.mo54214I(i, i2);
        }
    }

    /* renamed from: a */
    public static int m88302a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m84492X0(i) + CodedOutputStream.m84472D0(size);
        }
        return size * CodedOutputStream.m84496a0(i, true);
    }

    /* renamed from: a0 */
    public static void m88303a0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54239o(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m88304b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m88305b0(int i, int i2, Writer writer) throws IOException {
        if (i2 != 0) {
            writer.mo54227c(i, i2);
        }
    }

    /* renamed from: c */
    public static int m88306c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = size * CodedOutputStream.m84492X0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            X0 += CodedOutputStream.m84507h0(list.get(i2));
        }
        return X0;
    }

    /* renamed from: c0 */
    public static void m88307c0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54235k(i, list, z);
        }
    }

    /* renamed from: d */
    public static int m88308d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m88310e(list);
        if (z) {
            return CodedOutputStream.m84492X0(i) + CodedOutputStream.m84472D0(e);
        }
        return e + (size * CodedOutputStream.m84492X0(i));
    }

    /* renamed from: d0 */
    public static void m88309d0(int i, long j, Writer writer) throws IOException {
        if (j != 0) {
            writer.mo54244t(i, j);
        }
    }

    /* renamed from: e */
    public static int m88310e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18744h1) {
            C18744h1 h1Var = (C18744h1) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m84514l0(h1Var.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m84514l0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m88311e0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54207B(i, list, z);
        }
    }

    /* renamed from: f */
    public static int m88312f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m84492X0(i) + CodedOutputStream.m84472D0(size * 4);
        }
        return size * CodedOutputStream.m84516m0(i, 0);
    }

    /* renamed from: f0 */
    public static void m88313f0(int i, float f, Writer writer) throws IOException {
        if (Float.compare(f, 0.0f) != 0) {
            writer.mo54211F(i, f);
        }
    }

    /* renamed from: g */
    public static int m88314g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: g0 */
    public static void m88315g0(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54225a(i, list, z);
        }
    }

    /* renamed from: h */
    public static int m88316h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m84492X0(i) + CodedOutputStream.m84472D0(size * 8);
        }
        return size * CodedOutputStream.m84520o0(i, 0);
    }

    /* renamed from: h0 */
    public static void m88317h0(int i, List<?> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54228d(i, list);
        }
    }

    /* renamed from: i */
    public static int m88318i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: i0 */
    public static void m88319i0(int i, List<?> list, Writer writer, C18905x2 x2Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54219N(i, list, x2Var);
        }
    }

    /* renamed from: j */
    public static int m88320j(int i, List<C18920z1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m84527s0(i, list.get(i3));
        }
        return i2;
    }

    /* renamed from: j0 */
    public static void m88321j0(int i, int i2, Writer writer) throws IOException {
        if (i2 != 0) {
            writer.mo54233i(i, i2);
        }
    }

    /* renamed from: k */
    public static int m88322k(int i, List<C18920z1> list, C18905x2 x2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m84528t0(i, list.get(i3), x2Var);
        }
        return i2;
    }

    /* renamed from: k0 */
    public static void m88323k0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54232h(i, list, z);
        }
    }

    /* renamed from: l */
    public static int m88324l(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = m88326m(list);
        if (z) {
            return CodedOutputStream.m84492X0(i) + CodedOutputStream.m84472D0(m);
        }
        return m + (size * CodedOutputStream.m84492X0(i));
    }

    /* renamed from: l0 */
    public static void m88325l0(int i, long j, Writer writer) throws IOException {
        if (j != 0) {
            writer.mo54248x(i, j);
        }
    }

    /* renamed from: m */
    public static int m88326m(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18744h1) {
            C18744h1 h1Var = (C18744h1) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m84532x0(h1Var.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m84532x0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m0 */
    public static void m88327m0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54215J(i, list, z);
        }
    }

    /* renamed from: n */
    public static int m88328n(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int o = m88330o(list);
        if (z) {
            return CodedOutputStream.m84492X0(i) + CodedOutputStream.m84472D0(o);
        }
        return o + (list.size() * CodedOutputStream.m84492X0(i));
    }

    /* renamed from: n0 */
    public static void m88329n0(int i, List<?> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                ((C18797l1) it.next()).mo54934o(writer, i);
            }
        }
    }

    /* renamed from: o */
    public static int m88330o(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18852r1) {
            C18852r1 r1Var = (C18852r1) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m84534z0(r1Var.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m84534z0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o0 */
    public static void m88331o0(int i, Object obj, Writer writer) throws IOException {
        if (obj != null) {
            writer.mo54247w(i, obj);
        }
    }

    /* renamed from: p */
    public static int m88332p(int i, Object obj, C18905x2 x2Var) {
        if (obj instanceof C18797l1) {
            return CodedOutputStream.m84470B0(i, (C18797l1) obj);
        }
        return CodedOutputStream.m84475G0(i, (C18920z1) obj, x2Var);
    }

    /* renamed from: p0 */
    public static void m88333p0(int i, List<?> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54246v(i, list);
        }
    }

    /* renamed from: q */
    public static int m88334q(int i, List<?> list) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.m84492X0(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C18797l1) {
                i2 = CodedOutputStream.m84471C0((C18797l1) obj);
            } else {
                i2 = CodedOutputStream.m84476H0((C18920z1) obj);
            }
            X0 += i2;
        }
        return X0;
    }

    /* renamed from: q0 */
    public static void m88335q0(int i, List<?> list, Writer writer, C18905x2 x2Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54224S(i, list, x2Var);
        }
    }

    /* renamed from: r */
    public static int m88336r(int i, List<?> list, C18905x2 x2Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.m84492X0(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C18797l1) {
                i2 = CodedOutputStream.m84471C0((C18797l1) obj);
            } else {
                i2 = CodedOutputStream.m84477I0((C18920z1) obj, x2Var);
            }
            X0 += i2;
        }
        return X0;
    }

    /* renamed from: r0 */
    public static void m88337r0(int i, int i2, Writer writer) throws IOException {
        if (i2 != 0) {
            writer.mo54250z(i, i2);
        }
    }

    /* renamed from: s */
    public static int m88338s(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = m88340t(list);
        if (z) {
            return CodedOutputStream.m84492X0(i) + CodedOutputStream.m84472D0(t);
        }
        return t + (size * CodedOutputStream.m84492X0(i));
    }

    /* renamed from: s0 */
    public static void m88339s0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54208C(i, list, z);
        }
    }

    /* renamed from: t */
    public static int m88340t(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18744h1) {
            C18744h1 h1Var = (C18744h1) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m84487S0(h1Var.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m84487S0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: t0 */
    public static void m88341t0(int i, long j, Writer writer) throws IOException {
        if (j != 0) {
            writer.mo54234j(i, j);
        }
    }

    /* renamed from: u */
    public static int m88342u(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v = m88344v(list);
        if (z) {
            return CodedOutputStream.m84492X0(i) + CodedOutputStream.m84472D0(v);
        }
        return v + (size * CodedOutputStream.m84492X0(i));
    }

    /* renamed from: u0 */
    public static void m88343u0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54242r(i, list, z);
        }
    }

    /* renamed from: v */
    public static int m88344v(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18852r1) {
            C18852r1 r1Var = (C18852r1) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m84489U0(r1Var.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m84489U0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: v0 */
    public static void m88345v0(int i, int i2, Writer writer) throws IOException {
        if (i2 != 0) {
            writer.mo54217L(i, i2);
        }
    }

    /* renamed from: w */
    public static int m88346w(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.m84492X0(i) * size;
        if (list instanceof C18818n1) {
            C18818n1 n1Var = (C18818n1) list;
            while (i4 < size) {
                Object g0 = n1Var.mo55034g0(i4);
                if (g0 instanceof ByteString) {
                    i3 = CodedOutputStream.m84507h0((ByteString) g0);
                } else {
                    i3 = CodedOutputStream.m84491W0((String) g0);
                }
                X0 += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof ByteString) {
                    i2 = CodedOutputStream.m84507h0((ByteString) obj);
                } else {
                    i2 = CodedOutputStream.m84491W0((String) obj);
                }
                X0 += i2;
                i4++;
            }
        }
        return X0;
    }

    /* renamed from: w0 */
    public static void m88347w0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54213H(i, list, z);
        }
    }

    /* renamed from: x */
    public static int m88348x(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = m88350y(list);
        if (z) {
            return CodedOutputStream.m84492X0(i) + CodedOutputStream.m84472D0(y);
        }
        return y + (size * CodedOutputStream.m84492X0(i));
    }

    /* renamed from: x0 */
    public static void m88349x0(int i, long j, Writer writer) throws IOException {
        if (j != 0) {
            writer.mo54238n(i, j);
        }
    }

    /* renamed from: y */
    public static int m88350y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18744h1) {
            C18744h1 h1Var = (C18744h1) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m84495Z0(h1Var.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m84495Z0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: y0 */
    public static void m88351y0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo54237m(i, list, z);
        }
    }

    /* renamed from: z */
    public static int m88352z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A = m88270A(list);
        if (z) {
            return CodedOutputStream.m84492X0(i) + CodedOutputStream.m84472D0(A);
        }
        return A + (size * CodedOutputStream.m84492X0(i));
    }

    /* renamed from: z0 */
    public static void m88353z0(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            m88271A0(i, (String) obj, writer);
        } else {
            m88297V(i, (ByteString) obj, writer);
        }
    }
}
