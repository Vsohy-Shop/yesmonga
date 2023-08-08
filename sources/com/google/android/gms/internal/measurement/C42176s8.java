package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.s8 */
public final class C42176s8 extends C42011j {

    /* renamed from: c */
    public final C41885c f106404c;

    public C42176s8(C41885c cVar) {
        super("internal.eventLogger");
        this.f106404c = cVar;
    }

    /* renamed from: a */
    public final C42133q mo136725a(C41909d5 d5Var, List list) {
        Map map;
        C41928e6.m169810h(this.f106229a, 3, list);
        String k = d5Var.mo136673b((C42133q) list.get(0)).mo136744k();
        long a = (long) C41928e6.m169803a(d5Var.mo136673b((C42133q) list.get(1)).mo136743j().doubleValue());
        C42133q b = d5Var.mo136673b((C42133q) list.get(2));
        if (b instanceof C42082n) {
            map = C41928e6.m169809g((C42082n) b);
        } else {
            map = new HashMap();
        }
        this.f106404c.mo136645e(k, a, map);
        return C42133q.f106351H;
    }
}
