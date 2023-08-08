package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.jb */
public final class C42023jb {

    /* renamed from: a */
    public static final Class f106238a;

    /* renamed from: b */
    public static final C42281yb f106239b = m170411x(false);

    /* renamed from: c */
    public static final C42281yb f106240c = m170411x(true);

    /* renamed from: d */
    public static final C42281yb f106241d = new C41862ac();

    /* renamed from: e */
    public static final /* synthetic */ int f106242e = 0;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f106238a = cls;
    }

    /* renamed from: A */
    public static int m170364A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m170365B(list) + (size * C42295z8.m171215y(i << 3));
    }

    /* renamed from: B */
    public static int m170365B(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C42194t9) {
            C42194t9 t9Var = (C42194t9) list;
            i = 0;
            while (i2 < size) {
                i += C42295z8.m171212v(t9Var.mo137316h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C42295z8.m171212v(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: C */
    public static int m170366C(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C42295z8.m171215y(i << 3) + 4);
    }

    /* renamed from: D */
    public static int m170367D(List list) {
        return list.size() * 4;
    }

    /* renamed from: E */
    public static int m170368E(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C42295z8.m171215y(i << 3) + 8);
    }

    /* renamed from: F */
    public static int m170369F(List list) {
        return list.size() * 8;
    }

    /* renamed from: G */
    public static int m170370G(int i, List list, C41987hb hbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C42295z8.m171211u(i, (C42246wa) list.get(i3), hbVar);
        }
        return i2;
    }

    /* renamed from: H */
    public static int m170371H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m170372I(list) + (size * C42295z8.m171215y(i << 3));
    }

    /* renamed from: I */
    public static int m170372I(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C42194t9) {
            C42194t9 t9Var = (C42194t9) list;
            i = 0;
            while (i2 < size) {
                i += C42295z8.m171212v(t9Var.mo137316h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C42295z8.m171212v(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: J */
    public static int m170373J(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m170374K(list) + (list.size() * C42295z8.m171215y(i << 3));
    }

    /* renamed from: K */
    public static int m170374K(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C42058la) {
            C42058la laVar = (C42058la) list;
            i = 0;
            while (i2 < size) {
                i += C42295z8.m171216z(laVar.mo137116l(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C42295z8.m171216z(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: L */
    public static int m170375L(int i, Object obj, C41987hb hbVar) {
        if (obj instanceof C41896ca) {
            int i2 = C42295z8.f106584d;
            int a = ((C41896ca) obj).mo136659a();
            return C42295z8.m171215y(i << 3) + C42295z8.m171215y(a) + a;
        }
        return C42295z8.m171215y(i << 3) + C42295z8.m171213w((C42246wa) obj, hbVar);
    }

    /* renamed from: M */
    public static int m170376M(int i, List list, C41987hb hbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = C42295z8.m171215y(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C41896ca) {
                int a = ((C41896ca) obj).mo136659a();
                y += C42295z8.m171215y(a) + a;
            } else {
                y += C42295z8.m171213w((C42246wa) obj, hbVar);
            }
        }
        return y;
    }

    /* renamed from: N */
    public static int m170377N(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m170378O(list) + (size * C42295z8.m171215y(i << 3));
    }

    /* renamed from: O */
    public static int m170378O(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C42194t9) {
            C42194t9 t9Var = (C42194t9) list;
            i = 0;
            while (i2 < size) {
                int h = t9Var.mo137316h(i2);
                i += C42295z8.m171215y((h >> 31) ^ (h + h));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + C42295z8.m171215y((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: P */
    public static int m170379P(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m170380Q(list) + (size * C42295z8.m171215y(i << 3));
    }

    /* renamed from: Q */
    public static int m170380Q(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C42058la) {
            C42058la laVar = (C42058la) list;
            i = 0;
            while (i2 < size) {
                long l = laVar.mo137116l(i2);
                i += C42295z8.m171216z((l >> 63) ^ (l + l));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + C42295z8.m171216z((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: R */
    public static int m170381R(int i, List list) {
        int x;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = C42295z8.f106584d;
        boolean z = list instanceof C41932ea;
        int y = C42295z8.m171215y(i << 3) * size;
        if (z) {
            C41932ea eaVar = (C41932ea) list;
            while (i2 < size) {
                Object m = eaVar.mo136698m(i2);
                if (m instanceof zzka) {
                    int i4 = ((zzka) m).mo137593i();
                    y += C42295z8.m171215y(i4) + i4;
                } else {
                    y += C42295z8.m171214x((String) m);
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzka) {
                    int i5 = ((zzka) obj).mo137593i();
                    x = y + C42295z8.m171215y(i5) + i5;
                } else {
                    x = y + C42295z8.m171214x((String) obj);
                }
                i2++;
            }
        }
        return y;
    }

    /* renamed from: S */
    public static int m170382S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m170383T(list) + (size * C42295z8.m171215y(i << 3));
    }

    /* renamed from: T */
    public static int m170383T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C42194t9) {
            C42194t9 t9Var = (C42194t9) list;
            i = 0;
            while (i2 < size) {
                i += C42295z8.m171215y(t9Var.mo137316h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C42295z8.m171215y(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m170384U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m170385V(list) + (size * C42295z8.m171215y(i << 3));
    }

    /* renamed from: V */
    public static int m170385V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C42058la) {
            C42058la laVar = (C42058la) list;
            i = 0;
            while (i2 < size) {
                i += C42295z8.m171216z(laVar.mo137116l(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C42295z8.m171216z(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static C42281yb m170386W() {
        return f106239b;
    }

    /* renamed from: X */
    public static C42281yb m170387X() {
        return f106240c;
    }

    /* renamed from: a */
    public static C42281yb m170388a() {
        return f106241d;
    }

    /* renamed from: b */
    public static Object m170389b(Object obj, int i, int i2, Object obj2, C42281yb ybVar) {
        if (obj2 == null) {
            obj2 = ybVar.mo136574c(obj);
        }
        ybVar.mo136577f(obj2, i, (long) i2);
        return obj2;
    }

    /* renamed from: c */
    public static void m170390c(C42281yb ybVar, Object obj, Object obj2) {
        ybVar.mo136579h(obj, ybVar.mo136576e(ybVar.mo136575d(obj), ybVar.mo136575d(obj2)));
    }

    /* renamed from: d */
    public static void m170391d(Class cls) {
        Class cls2;
        if (!C42177s9.class.isAssignableFrom(cls) && (cls2 = f106238a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: e */
    public static void m170392e(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136543g(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m170393f(int i, List list, C42112oc ocVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136538b(i, list);
        }
    }

    /* renamed from: g */
    public static void m170394g(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136532F(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m170395h(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136562z(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m170396i(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136560x(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m170397j(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136548l(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m170398k(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136553q(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m170399l(int i, List list, C42112oc ocVar, C41987hb hbVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C41859a9) ocVar).mo136537a(i, list.get(i2), hbVar);
            }
        }
    }

    /* renamed from: m */
    public static void m170400m(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136544h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m170401n(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136530D(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m170402o(int i, List list, C42112oc ocVar, C41987hb hbVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C41859a9) ocVar).mo136547k(i, list.get(i2), hbVar);
            }
        }
    }

    /* renamed from: p */
    public static void m170403p(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136531E(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m170404q(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136556t(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m170405r(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136529C(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m170406s(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136535I(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m170407t(int i, List list, C42112oc ocVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136527A(i, list);
        }
    }

    /* renamed from: u */
    public static void m170408u(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136559w(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m170409v(int i, List list, C42112oc ocVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ocVar.mo136550n(i, list, z);
        }
    }

    /* renamed from: w */
    public static boolean m170410w(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* renamed from: x */
    public static C42281yb m170411x(boolean z) {
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
            return (C42281yb) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: y */
    public static int m170412y(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C42295z8.m171215y(i << 3) + 1);
    }

    /* renamed from: z */
    public static int m170413z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = size * C42295z8.m171215y(i << 3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = ((zzka) list.get(i2)).mo137593i();
            y += C42295z8.m171215y(i3) + i3;
        }
        return y;
    }
}
