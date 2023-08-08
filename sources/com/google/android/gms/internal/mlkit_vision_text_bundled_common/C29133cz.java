package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29096bz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.cz */
public final class C29133cz<T extends C29096bz<T>> {

    /* renamed from: d */
    public static final C29133cz f71191d = new C29133cz(true);

    /* renamed from: a */
    public final C29245g<T, Object> f71192a = new m10(16);

    /* renamed from: b */
    public boolean f71193b;

    /* renamed from: c */
    public boolean f71194c;

    public C29133cz() {
    }

    /* renamed from: a */
    public static int m120261a(zbaay zbaay, int i, Object obj) {
        int e = C29686ry.m121014e(i);
        if (zbaay == zbaay.GROUP) {
            C29909xz.m121351i((x00) obj);
            e += e;
        }
        return e + m120262b(zbaay, obj);
    }

    /* renamed from: b */
    public static int m120262b(zbaay zbaay, Object obj) {
        zbaay zbaay2 = zbaay.DOUBLE;
        zbaaz zbaaz = zbaaz.INT;
        switch (zbaay.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i = C29686ry.f71444d;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i2 = C29686ry.f71444d;
                return 4;
            case 2:
                return C29686ry.m121016g(((Long) obj).longValue());
            case 3:
                return C29686ry.m121016g(((Long) obj).longValue());
            case 4:
                return C29686ry.m121009J(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i3 = C29686ry.f71444d;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i4 = C29686ry.f71444d;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i5 = C29686ry.f71444d;
                return 1;
            case 8:
                if (obj instanceof zbwp) {
                    return C29686ry.m121006G((zbwp) obj);
                }
                return C29686ry.m121013d((String) obj);
            case 9:
                return C29686ry.m121008I((x00) obj);
            case 10:
                if (obj instanceof b00) {
                    return C29686ry.m121010a((b00) obj);
                }
                return C29686ry.m121011b((x00) obj);
            case 11:
                if (obj instanceof zbwp) {
                    return C29686ry.m121006G((zbwp) obj);
                }
                return C29686ry.m121005F((byte[]) obj);
            case 12:
                return C29686ry.m121015f(((Integer) obj).intValue());
            case 13:
                if (obj instanceof C29576oz) {
                    return C29686ry.m121009J(((C29576oz) obj).mo84762i());
                }
                return C29686ry.m121009J(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i6 = C29686ry.f71444d;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i7 = C29686ry.f71444d;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return C29686ry.m121015f((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return C29686ry.m121016g((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: c */
    public static int m120263c(C29096bz<?> bzVar, Object obj) {
        zbaay k0 = bzVar.mo84542k0();
        int i = bzVar.mo84541i();
        if (!bzVar.mo84539S0()) {
            return m120261a(k0, i, obj);
        }
        int i2 = 0;
        if (bzVar.mo84538M0()) {
            for (Object b : (List) obj) {
                i2 += m120262b(k0, b);
            }
            return C29686ry.m121014e(i) + i2 + C29686ry.m121015f(i2);
        }
        for (Object a : (List) obj) {
            i2 += m120261a(k0, i, a);
        }
        return i2;
    }

    /* renamed from: f */
    public static <T extends C29096bz<T>> C29133cz<T> m120264f() {
        return f71191d;
    }

    /* renamed from: l */
    public static void m120265l(C29686ry ryVar, zbaay zbaay, int i, Object obj) throws IOException {
        if (zbaay != zbaay.GROUP) {
            ryVar.mo84765A(i, zbaay.mo84925i());
            zbaaz zbaaz = zbaaz.INT;
            switch (zbaay.ordinal()) {
                case 0:
                    ryVar.mo84779t(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    ryVar.mo84777r(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    ryVar.mo84769E(((Long) obj).longValue());
                    return;
                case 3:
                    ryVar.mo84769E(((Long) obj).longValue());
                    return;
                case 4:
                    ryVar.mo84781v(((Integer) obj).intValue());
                    return;
                case 5:
                    ryVar.mo84779t(((Long) obj).longValue());
                    return;
                case 6:
                    ryVar.mo84777r(((Integer) obj).intValue());
                    return;
                case 7:
                    ryVar.mo84772m(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                    return;
                case 8:
                    if (obj instanceof zbwp) {
                        ryVar.mo84775p((zbwp) obj);
                        return;
                    } else {
                        ryVar.mo84785z((String) obj);
                        return;
                    }
                case 9:
                    ((x00) obj).mo84732f(ryVar);
                    return;
                case 10:
                    ryVar.mo84783x((x00) obj);
                    return;
                case 11:
                    if (obj instanceof zbwp) {
                        ryVar.mo84775p((zbwp) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    C29612py pyVar = (C29612py) ryVar;
                    pyVar.mo84767C(length);
                    pyVar.mo84770K(bArr, 0, length);
                    return;
                case 12:
                    ryVar.mo84767C(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof C29576oz) {
                        ryVar.mo84781v(((C29576oz) obj).mo84762i());
                        return;
                    } else {
                        ryVar.mo84781v(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    ryVar.mo84777r(((Integer) obj).intValue());
                    return;
                case 15:
                    ryVar.mo84779t(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    ryVar.mo84767C((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    ryVar.mo84769E((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        } else {
            x00 x00 = (x00) obj;
            C29909xz.m121351i(x00);
            ryVar.mo84765A(i, 3);
            x00.mo84732f(ryVar);
            ryVar.mo84765A(i, 4);
        }
    }

    /* renamed from: o */
    public static Object m120266o(Object obj) {
        if (obj instanceof c10) {
            return ((c10) obj).mo84553z();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: q */
    public static <T extends C29096bz<T>> boolean m120267q(Map.Entry<T, Object> entry) {
        C29096bz bzVar = (C29096bz) entry.getKey();
        if (bzVar.mo84543x() == zbaaz.MESSAGE) {
            if (bzVar.mo84539S0()) {
                for (x00 h : (List) entry.getValue()) {
                    if (!h.mo84648h()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof x00) {
                    if (!((x00) value).mo84648h()) {
                        return false;
                    }
                } else if (value instanceof b00) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: r */
    public static final int m120268r(Map.Entry<T, Object> entry) {
        int f;
        int f2;
        C29096bz bzVar = (C29096bz) entry.getKey();
        Object value = entry.getValue();
        if (bzVar.mo84543x() != zbaaz.MESSAGE || bzVar.mo84539S0() || bzVar.mo84538M0()) {
            return m120263c(bzVar, value);
        }
        if (value instanceof b00) {
            int i = ((C29096bz) entry.getKey()).mo84541i();
            int f3 = C29686ry.m121015f(8);
            int a = ((b00) value).mo84549a();
            f = f3 + f3 + C29686ry.m121015f(16) + C29686ry.m121015f(i);
            f2 = C29686ry.m121015f(24) + C29686ry.m121015f(a) + a;
        } else {
            int i2 = ((C29096bz) entry.getKey()).mo84541i();
            int f4 = C29686ry.m121015f(8);
            f = f4 + f4 + C29686ry.m121015f(16) + C29686ry.m121015f(i2);
            f2 = C29686ry.m121015f(24) + C29686ry.m121011b((x00) value);
        }
        return f + f2;
    }

    /* renamed from: s */
    public static final void m120269s(T t, Object obj) {
        boolean z;
        zbaay k0 = t.mo84542k0();
        C29909xz.m121347e(obj);
        zbaay zbaay = zbaay.DOUBLE;
        zbaaz zbaaz = zbaaz.INT;
        switch (k0.mo84924g().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zbwp) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof C29576oz)) {
                    return;
                }
            case 8:
                if ((obj instanceof x00) || (obj instanceof b00)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.mo84541i()), t.mo84542k0().mo84924g(), obj.getClass().getName()}));
    }

    /* renamed from: d */
    public final int mo84562d() {
        int i = 0;
        for (int i2 = 0; i2 < this.f71192a.mo84616b(); i2++) {
            i += m120268r(this.f71192a.mo84624h(i2));
        }
        for (Map.Entry<T, Object> r : this.f71192a.mo84617c()) {
            i += m120268r(r);
        }
        return i;
    }

    /* renamed from: e */
    public final C29133cz<T> clone() {
        C29133cz<T> czVar = new C29133cz<>();
        for (int i = 0; i < this.f71192a.mo84616b(); i++) {
            Map.Entry<T, Object> h = this.f71192a.mo84624h(i);
            czVar.mo84570k((C29096bz) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f71192a.mo84617c()) {
            czVar.mo84570k((C29096bz) next.getKey(), next.getValue());
        }
        czVar.f71194c = this.f71194c;
        return czVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29133cz)) {
            return false;
        }
        return this.f71192a.equals(((C29133cz) obj).f71192a);
    }

    /* renamed from: g */
    public final Object mo84565g(T t) {
        Object obj = this.f71192a.get(t);
        if (!(obj instanceof b00)) {
            return obj;
        }
        b00 b00 = (b00) obj;
        throw null;
    }

    /* renamed from: h */
    public final Iterator<Map.Entry<T, Object>> mo84566h() {
        if (this.f71194c) {
            return new a00(this.f71192a.entrySet().iterator());
        }
        return this.f71192a.entrySet().iterator();
    }

    public final int hashCode() {
        return this.f71192a.hashCode();
    }

    /* renamed from: i */
    public final void mo84568i() {
        if (!this.f71193b) {
            this.f71192a.mo84615a();
            this.f71193b = true;
        }
    }

    /* renamed from: j */
    public final void mo84569j(C29133cz<T> czVar) {
        for (int i = 0; i < czVar.f71192a.mo84616b(); i++) {
            mo84573p(czVar.f71192a.mo84624h(i));
        }
        for (Map.Entry<T, Object> p : czVar.f71192a.mo84617c()) {
            mo84573p(p);
        }
    }

    /* renamed from: k */
    public final void mo84570k(T t, Object obj) {
        if (!t.mo84539S0()) {
            m120269s(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m120269s(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof b00) {
            this.f71194c = true;
        }
        this.f71192a.put(t, obj);
    }

    /* renamed from: m */
    public final boolean mo84571m() {
        return this.f71193b;
    }

    /* renamed from: n */
    public final boolean mo84572n() {
        for (int i = 0; i < this.f71192a.mo84616b(); i++) {
            if (!m120267q(this.f71192a.mo84624h(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> q : this.f71192a.mo84617c()) {
            if (!m120267q(q)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public final void mo84573p(Map.Entry<T, Object> entry) {
        Object obj;
        C29096bz bzVar = (C29096bz) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof b00) {
            b00 b00 = (b00) value;
            throw null;
        } else if (bzVar.mo84539S0()) {
            Object g = mo84565g(bzVar);
            if (g == null) {
                g = new ArrayList();
            }
            for (Object o : (List) value) {
                ((List) g).add(m120266o(o));
            }
            this.f71192a.put(bzVar, g);
        } else if (bzVar.mo84543x() == zbaaz.MESSAGE) {
            Object g2 = mo84565g(bzVar);
            if (g2 == null) {
                this.f71192a.put(bzVar, m120266o(value));
                return;
            }
            if (g2 instanceof c10) {
                obj = bzVar.mo84544y0((c10) g2, (c10) value);
            } else {
                obj = bzVar.mo84540g2(((x00) g2).mo84728c(), (x00) value).mo84645D2();
            }
            this.f71192a.put(bzVar, obj);
        } else {
            this.f71192a.put(bzVar, m120266o(value));
        }
    }

    public C29133cz(boolean z) {
        mo84568i();
        mo84568i();
    }
}
