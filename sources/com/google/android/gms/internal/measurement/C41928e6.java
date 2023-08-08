package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e6 */
public final class C41928e6 {
    /* renamed from: a */
    public static double m169803a(double d) {
        int i;
        int i2;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || i == 0) {
            return d;
        }
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        return ((double) i2) * Math.floor(Math.abs(d));
    }

    /* renamed from: b */
    public static int m169804b(double d) {
        int i;
        int i2;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        return (int) ((long) ((((double) i2) * Math.floor(Math.abs(d))) % 4.294967296E9d));
    }

    /* renamed from: c */
    public static int m169805c(C41909d5 d5Var) {
        int b = m169804b(d5Var.mo136675d("runtime.counter").mo136743j().doubleValue() + 1.0d);
        if (b <= 1000000) {
            d5Var.mo136678g("runtime.counter", new C41993i(Double.valueOf((double) b)));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m169806d(double d) {
        return ((long) m169804b(d)) & 4294967295L;
    }

    /* renamed from: e */
    public static zzbl m169807e(String str) {
        zzbl zzbl = null;
        if (str != null && !str.isEmpty()) {
            zzbl = zzbl.m171300b(Integer.parseInt(str));
        }
        if (zzbl != null) {
            return zzbl;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    /* renamed from: f */
    public static Object m169808f(C42133q qVar) {
        if (C42133q.f106352I.equals(qVar)) {
            return null;
        }
        if (C42133q.f106351H.equals(qVar)) {
            return "";
        }
        if (qVar instanceof C42082n) {
            return m169809g((C42082n) qVar);
        }
        if (qVar instanceof C41939f) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((C41939f) qVar).iterator();
            while (it.hasNext()) {
                Object f = m169808f((C42133q) it.next());
                if (f != null) {
                    arrayList.add(f);
                }
            }
            return arrayList;
        } else if (!qVar.mo136743j().isNaN()) {
            return qVar.mo136743j();
        } else {
            return qVar.mo136744k();
        }
    }

    /* renamed from: g */
    public static Map m169809g(C42082n nVar) {
        HashMap hashMap = new HashMap();
        for (String str : nVar.mo137161a()) {
            Object f = m169808f(nVar.mo136728I0(str));
            if (f != null) {
                hashMap.put(str, f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m169810h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: i */
    public static void m169811i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: j */
    public static void m169812j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: k */
    public static boolean m169813k(C42133q qVar) {
        if (qVar == null) {
            return false;
        }
        Double j = qVar.mo136743j();
        if (j.isNaN() || j.doubleValue() < 0.0d || !j.equals(Double.valueOf(Math.floor(j.doubleValue())))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m169814l(C42133q qVar, C42133q qVar2) {
        if (!qVar.getClass().equals(qVar2.getClass())) {
            return false;
        }
        if ((qVar instanceof C42218v) || (qVar instanceof C42099o)) {
            return true;
        }
        if (qVar instanceof C41993i) {
            if (Double.isNaN(qVar.mo136743j().doubleValue()) || Double.isNaN(qVar2.mo136743j().doubleValue())) {
                return false;
            }
            return qVar.mo136743j().equals(qVar2.mo136743j());
        } else if (qVar instanceof C42201u) {
            return qVar.mo136744k().equals(qVar2.mo136744k());
        } else {
            if (qVar instanceof C41957g) {
                return qVar.mo136738h().equals(qVar2.mo136738h());
            }
            if (qVar == qVar2) {
                return true;
            }
            return false;
        }
    }
}
