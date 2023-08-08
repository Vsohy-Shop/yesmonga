package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.hg */
public final class C41992hg extends C42011j {

    /* renamed from: c */
    public final C42064lg f106198c;

    public C41992hg(C42064lg lgVar) {
        super("internal.registerCallback");
        this.f106198c = lgVar;
    }

    /* renamed from: a */
    public final C42133q mo136725a(C41909d5 d5Var, List list) {
        int i;
        C41928e6.m169810h(this.f106229a, 3, list);
        String k = d5Var.mo136673b((C42133q) list.get(0)).mo136744k();
        C42133q b = d5Var.mo136673b((C42133q) list.get(1));
        if (b instanceof C42116p) {
            C42133q b2 = d5Var.mo136673b((C42133q) list.get(2));
            if (b2 instanceof C42082n) {
                C42082n nVar = (C42082n) b2;
                if (nVar.mo136746r("type")) {
                    String k2 = nVar.mo136728I0("type").mo136744k();
                    if (nVar.mo136746r("priority")) {
                        i = C41928e6.m169804b(nVar.mo136728I0("priority").mo136743j().doubleValue());
                    } else {
                        i = 1000;
                    }
                    this.f106198c.mo137127a(k, i, (C42116p) b, k2);
                    return C42133q.f106351H;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
