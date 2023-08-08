package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k */
public final /* synthetic */ class C42029k {
    /* renamed from: a */
    public static C42133q m170426a(C42065m mVar, C42133q qVar, C41909d5 d5Var, List list) {
        if (mVar.mo136746r(qVar.mo136744k())) {
            C42133q I0 = mVar.mo136728I0(qVar.mo136744k());
            if (I0 instanceof C42011j) {
                return ((C42011j) I0).mo136725a(d5Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{qVar.mo136744k()}));
        } else if ("hasOwnProperty".equals(qVar.mo136744k())) {
            C41928e6.m169810h("hasOwnProperty", 1, list);
            if (mVar.mo136746r(d5Var.mo136673b((C42133q) list.get(0)).mo136744k())) {
                return C42133q.f106356M;
            }
            return C42133q.f106357N;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{qVar.mo136744k()}));
        }
    }

    /* renamed from: b */
    public static Iterator m170427b(Map map) {
        return new C42047l(map.keySet().iterator());
    }
}
