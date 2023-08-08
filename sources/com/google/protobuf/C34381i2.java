package com.google.protobuf;

import com.google.protobuf.C34425o0;
import com.google.protobuf.C34471v0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.i2 */
public final class C34381i2 {

    /* renamed from: a */
    public static final Class<?> f83286a = m139312D();

    /* renamed from: b */
    public static final C34501x2<?, ?> f83287b = m139316F(false);

    /* renamed from: c */
    public static final C34501x2<?, ?> f83288c = m139316F(true);

    /* renamed from: d */
    public static final C34501x2<?, ?> f83289d = new C34511z2();

    /* renamed from: e */
    public static final int f83290e = 40;

    /* renamed from: A */
    public static int m139306A(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C34351d1) {
            C34351d1 d1Var = (C34351d1) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m137373b1(d1Var.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m137373b1(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: A0 */
    public static void m139307A0(int i, String str, Writer writer) throws IOException {
        if (str != null && !str.isEmpty()) {
            writer.mo100811f(i, str);
        }
    }

    /* renamed from: B */
    public static <UT, UB> UB m139308B(int i, List<Integer> list, C34471v0.C34475d<?> dVar, UB ub, C34501x2<UT, UB> x2Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.mo93187a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m139328Q(i, intValue, ub, x2Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.mo93187a(intValue2) == null) {
                    ub = m139328Q(i, intValue2, ub, x2Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B0 */
    public static void m139309B0(int i, List<String> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100810e(i, list);
        }
    }

    /* renamed from: C */
    public static <UT, UB> UB m139310C(int i, List<Integer> list, C34471v0.C34476e eVar, UB ub, C34501x2<UT, UB> x2Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.mo93189a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m139328Q(i, intValue, ub, x2Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.mo93189a(intValue2)) {
                    ub = m139328Q(i, intValue2, ub, x2Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: C0 */
    public static void m139311C0(int i, int i2, Writer writer) throws IOException {
        if (i2 != 0) {
            writer.mo100821p(i, i2);
        }
    }

    /* renamed from: D */
    public static Class<?> m139312D() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D0 */
    public static void m139313D0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100817l(i, list, z);
        }
    }

    /* renamed from: E */
    public static Object m139314E(Class<?> cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + m139329R(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return C34341c3.m138969S(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: E0 */
    public static void m139315E0(int i, long j, Writer writer) throws IOException {
        if (j != 0) {
            writer.mo100812g(i, j);
        }
    }

    /* renamed from: F */
    public static C34501x2<?, ?> m139316F(boolean z) {
        try {
            Class<?> G = m139318G();
            if (G == null) {
                return null;
            }
            return (C34501x2) G.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: F0 */
    public static void m139317F0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100824s(i, list, z);
        }
    }

    /* renamed from: G */
    public static Class<?> m139318G() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: H */
    public static <T, FT extends C34425o0.C34428c<FT>> void m139319H(C34374h0<FT> h0Var, T t, T t2) {
        C34425o0<FT> c = h0Var.mo101126c(t2);
        if (!c.mo101381C()) {
            h0Var.mo101127d(t).mo101386J(c);
        }
    }

    /* renamed from: I */
    public static <T> void m139320I(C34371g1 g1Var, T t, T t2, long j) {
        C34341c3.m139016t0(t, j, g1Var.mo101106a(C34341c3.m138967Q(t, j), C34341c3.m138967Q(t2, j)));
    }

    /* renamed from: J */
    public static <T, UT, UB> void m139321J(C34501x2<UT, UB> x2Var, T t, T t2) {
        x2Var.mo101690p(t, x2Var.mo101685k(x2Var.mo101681g(t), x2Var.mo101681g(t2)));
    }

    /* renamed from: K */
    public static C34501x2<?, ?> m139322K() {
        return f83287b;
    }

    /* renamed from: L */
    public static C34501x2<?, ?> m139323L() {
        return f83288c;
    }

    /* renamed from: M */
    public static void m139324M(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f83286a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: N */
    public static boolean m139325N(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: O */
    public static boolean m139326O(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = (long) i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    /* renamed from: P */
    public static boolean m139327P(C34400k0[] k0VarArr) {
        if (k0VarArr.length == 0) {
            return false;
        }
        return m139326O(k0VarArr[0].mo101220h0(), k0VarArr[k0VarArr.length - 1].mo101220h0(), k0VarArr.length);
    }

    /* renamed from: Q */
    public static <UT, UB> UB m139328Q(int i, int i2, UB ub, C34501x2<UT, UB> x2Var) {
        if (ub == null) {
            ub = x2Var.mo101688n();
        }
        x2Var.mo101679e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: R */
    public static String m139329R(String str, boolean z) {
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
    public static C34501x2<?, ?> m139330S() {
        return f83289d;
    }

    /* renamed from: T */
    public static void m139331T(int i, boolean z, Writer writer) throws IOException {
        if (z) {
            writer.mo100830y(i, true);
        }
    }

    /* renamed from: U */
    public static void m139332U(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100790D(i, list, z);
        }
    }

    /* renamed from: V */
    public static void m139333V(int i, ByteString byteString, Writer writer) throws IOException {
        if (byteString != null && !byteString.isEmpty()) {
            writer.mo100802P(i, byteString);
        }
    }

    /* renamed from: W */
    public static void m139334W(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100799M(i, list);
        }
    }

    /* renamed from: X */
    public static void m139335X(int i, double d, Writer writer) throws IOException {
        if (Double.compare(d, 0.0d) != 0) {
            writer.mo100822q(i, d);
        }
    }

    /* renamed from: Y */
    public static void m139336Y(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100797K(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m139337Z(int i, int i2, Writer writer) throws IOException {
        if (i2 != 0) {
            writer.mo100795I(i, i2);
        }
    }

    /* renamed from: a */
    public static int m139338a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m137366X0(i) + CodedOutputStream.m137346D0(size);
        }
        return size * CodedOutputStream.m137370a0(i, true);
    }

    /* renamed from: a0 */
    public static void m139339a0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100820o(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m139340b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m139341b0(int i, int i2, Writer writer) throws IOException {
        if (i2 != 0) {
            writer.mo100808c(i, i2);
        }
    }

    /* renamed from: c */
    public static int m139342c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = size * CodedOutputStream.m137366X0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            X0 += CodedOutputStream.m137381h0(list.get(i2));
        }
        return X0;
    }

    /* renamed from: c0 */
    public static void m139343c0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100816k(i, list, z);
        }
    }

    /* renamed from: d */
    public static int m139344d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m139346e(list);
        if (z) {
            return CodedOutputStream.m137366X0(i) + CodedOutputStream.m137346D0(e);
        }
        return e + (size * CodedOutputStream.m137366X0(i));
    }

    /* renamed from: d0 */
    public static void m139345d0(int i, long j, Writer writer) throws IOException {
        if (j != 0) {
            writer.mo100825t(i, j);
        }
    }

    /* renamed from: e */
    public static int m139346e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C34467u0) {
            C34467u0 u0Var = (C34467u0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m137388l0(u0Var.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m137388l0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m139347e0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100788B(i, list, z);
        }
    }

    /* renamed from: f */
    public static int m139348f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m137366X0(i) + CodedOutputStream.m137346D0(size * 4);
        }
        return size * CodedOutputStream.m137390m0(i, 0);
    }

    /* renamed from: f0 */
    public static void m139349f0(int i, float f, Writer writer) throws IOException {
        if (Float.compare(f, 0.0f) != 0) {
            writer.mo100792F(i, f);
        }
    }

    /* renamed from: g */
    public static int m139350g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: g0 */
    public static void m139351g0(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100806a(i, list, z);
        }
    }

    /* renamed from: h */
    public static int m139352h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m137366X0(i) + CodedOutputStream.m137346D0(size * 8);
        }
        return size * CodedOutputStream.m137394o0(i, 0);
    }

    /* renamed from: h0 */
    public static void m139353h0(int i, List<?> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100809d(i, list);
        }
    }

    /* renamed from: i */
    public static int m139354i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: i0 */
    public static void m139355i0(int i, List<?> list, Writer writer, C34372g2 g2Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100803Q(i, list, g2Var);
        }
    }

    /* renamed from: j */
    public static int m139356j(int i, List<C34412l1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m137401s0(i, list.get(i3));
        }
        return i2;
    }

    /* renamed from: j0 */
    public static void m139357j0(int i, int i2, Writer writer) throws IOException {
        if (i2 != 0) {
            writer.mo100814i(i, i2);
        }
    }

    /* renamed from: k */
    public static int m139358k(int i, List<C34412l1> list, C34372g2 g2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m137402t0(i, list.get(i3), g2Var);
        }
        return i2;
    }

    /* renamed from: k0 */
    public static void m139359k0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100813h(i, list, z);
        }
    }

    /* renamed from: l */
    public static int m139360l(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = m139362m(list);
        if (z) {
            return CodedOutputStream.m137366X0(i) + CodedOutputStream.m137346D0(m);
        }
        return m + (size * CodedOutputStream.m137366X0(i));
    }

    /* renamed from: l0 */
    public static void m139361l0(int i, long j, Writer writer) throws IOException {
        if (j != 0) {
            writer.mo100829x(i, j);
        }
    }

    /* renamed from: m */
    public static int m139362m(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C34467u0) {
            C34467u0 u0Var = (C34467u0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m137406x0(u0Var.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m137406x0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m0 */
    public static void m139363m0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100796J(i, list, z);
        }
    }

    /* renamed from: n */
    public static int m139364n(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int o = m139366o(list);
        if (z) {
            return CodedOutputStream.m137366X0(i) + CodedOutputStream.m137346D0(o);
        }
        return o + (list.size() * CodedOutputStream.m137366X0(i));
    }

    /* renamed from: n0 */
    public static void m139365n0(int i, List<?> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                ((C34503y0) it.next()).mo101705o(writer, i);
            }
        }
    }

    /* renamed from: o */
    public static int m139366o(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C34351d1) {
            C34351d1 d1Var = (C34351d1) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m137408z0(d1Var.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m137408z0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o0 */
    public static void m139367o0(int i, Object obj, Writer writer) throws IOException {
        if (obj != null) {
            writer.mo100828w(i, obj);
        }
    }

    /* renamed from: p */
    public static int m139368p(int i, Object obj, C34372g2 g2Var) {
        if (obj instanceof C34503y0) {
            return CodedOutputStream.m137344B0(i, (C34503y0) obj);
        }
        return CodedOutputStream.m137349G0(i, (C34412l1) obj, g2Var);
    }

    /* renamed from: p0 */
    public static void m139369p0(int i, List<?> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100827v(i, list);
        }
    }

    /* renamed from: q */
    public static int m139370q(int i, List<?> list) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.m137366X0(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C34503y0) {
                i2 = CodedOutputStream.m137345C0((C34503y0) obj);
            } else {
                i2 = CodedOutputStream.m137350H0((C34412l1) obj);
            }
            X0 += i2;
        }
        return X0;
    }

    /* renamed from: q0 */
    public static void m139371q0(int i, List<?> list, Writer writer, C34372g2 g2Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100800N(i, list, g2Var);
        }
    }

    /* renamed from: r */
    public static int m139372r(int i, List<?> list, C34372g2 g2Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.m137366X0(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C34503y0) {
                i2 = CodedOutputStream.m137345C0((C34503y0) obj);
            } else {
                i2 = CodedOutputStream.m137351I0((C34412l1) obj, g2Var);
            }
            X0 += i2;
        }
        return X0;
    }

    /* renamed from: r0 */
    public static void m139373r0(int i, int i2, Writer writer) throws IOException {
        if (i2 != 0) {
            writer.mo100831z(i, i2);
        }
    }

    /* renamed from: s */
    public static int m139374s(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = m139376t(list);
        if (z) {
            return CodedOutputStream.m137366X0(i) + CodedOutputStream.m137346D0(t);
        }
        return t + (size * CodedOutputStream.m137366X0(i));
    }

    /* renamed from: s0 */
    public static void m139375s0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100789C(i, list, z);
        }
    }

    /* renamed from: t */
    public static int m139376t(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C34467u0) {
            C34467u0 u0Var = (C34467u0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m137361S0(u0Var.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m137361S0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: t0 */
    public static void m139377t0(int i, long j, Writer writer) throws IOException {
        if (j != 0) {
            writer.mo100815j(i, j);
        }
    }

    /* renamed from: u */
    public static int m139378u(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v = m139380v(list);
        if (z) {
            return CodedOutputStream.m137366X0(i) + CodedOutputStream.m137346D0(v);
        }
        return v + (size * CodedOutputStream.m137366X0(i));
    }

    /* renamed from: u0 */
    public static void m139379u0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100823r(i, list, z);
        }
    }

    /* renamed from: v */
    public static int m139380v(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C34351d1) {
            C34351d1 d1Var = (C34351d1) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m137363U0(d1Var.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m137363U0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: v0 */
    public static void m139381v0(int i, int i2, Writer writer) throws IOException {
        if (i2 != 0) {
            writer.mo100798L(i, i2);
        }
    }

    /* renamed from: w */
    public static int m139382w(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.m137366X0(i) * size;
        if (list instanceof C34324a1) {
            C34324a1 a1Var = (C34324a1) list;
            while (i4 < size) {
                Object g0 = a1Var.mo100871g0(i4);
                if (g0 instanceof ByteString) {
                    i3 = CodedOutputStream.m137381h0((ByteString) g0);
                } else {
                    i3 = CodedOutputStream.m137365W0((String) g0);
                }
                X0 += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof ByteString) {
                    i2 = CodedOutputStream.m137381h0((ByteString) obj);
                } else {
                    i2 = CodedOutputStream.m137365W0((String) obj);
                }
                X0 += i2;
                i4++;
            }
        }
        return X0;
    }

    /* renamed from: w0 */
    public static void m139383w0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100794H(i, list, z);
        }
    }

    /* renamed from: x */
    public static int m139384x(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = m139386y(list);
        if (z) {
            return CodedOutputStream.m137366X0(i) + CodedOutputStream.m137346D0(y);
        }
        return y + (size * CodedOutputStream.m137366X0(i));
    }

    /* renamed from: x0 */
    public static void m139385x0(int i, long j, Writer writer) throws IOException {
        if (j != 0) {
            writer.mo100819n(i, j);
        }
    }

    /* renamed from: y */
    public static int m139386y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C34467u0) {
            C34467u0 u0Var = (C34467u0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m137369Z0(u0Var.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m137369Z0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: y0 */
    public static void m139387y0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.mo100818m(i, list, z);
        }
    }

    /* renamed from: z */
    public static int m139388z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A = m139306A(list);
        if (z) {
            return CodedOutputStream.m137366X0(i) + CodedOutputStream.m137346D0(A);
        }
        return A + (size * CodedOutputStream.m137366X0(i));
    }

    /* renamed from: z0 */
    public static void m139389z0(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            m139307A0(i, (String) obj, writer);
        } else {
            m139333V(i, (ByteString) obj, writer);
        }
    }
}
