package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.lg */
public final class C42064lg {

    /* renamed from: a */
    public final TreeMap f106288a = new TreeMap();

    /* renamed from: b */
    public final TreeMap f106289b = new TreeMap();

    /* renamed from: c */
    public static final int m170508c(C41909d5 d5Var, C42116p pVar, C42133q qVar) {
        C42133q a = pVar.mo136725a(d5Var, Collections.singletonList(qVar));
        if (a instanceof C41993i) {
            return C41928e6.m169804b(a.mo136743j().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo137127a(String str, int i, C42116p pVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f106289b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f106288a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), pVar);
    }

    /* renamed from: b */
    public final void mo137128b(C41909d5 d5Var, C41885c cVar) {
        C42143q9 q9Var = new C42143q9(cVar);
        for (Integer num : this.f106288a.keySet()) {
            C41867b b = cVar.mo136641b().clone();
            int c = m170508c(d5Var, (C42116p) this.f106288a.get(num), q9Var);
            if (c == 2 || c == -1) {
                cVar.mo136646f(b);
            }
        }
        for (Integer num2 : this.f106289b.keySet()) {
            m170508c(d5Var, (C42116p) this.f106289b.get(num2), q9Var);
        }
    }
}
