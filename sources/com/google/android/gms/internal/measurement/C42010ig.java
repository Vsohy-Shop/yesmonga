package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.ig */
public final class C42010ig extends C42011j {

    /* renamed from: c */
    public final C42294z7 f106227c;

    /* renamed from: d */
    public final Map f106228d = new HashMap();

    public C42010ig(C42294z7 z7Var) {
        super("require");
        this.f106227c = z7Var;
    }

    /* renamed from: a */
    public final C42133q mo136725a(C41909d5 d5Var, List list) {
        C42133q qVar;
        C41928e6.m169810h("require", 1, list);
        String k = d5Var.mo136673b((C42133q) list.get(0)).mo136744k();
        if (this.f106228d.containsKey(k)) {
            return (C42133q) this.f106228d.get(k);
        }
        C42294z7 z7Var = this.f106227c;
        if (z7Var.f106581a.containsKey(k)) {
            try {
                qVar = (C42133q) ((Callable) z7Var.f106581a.get(k)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(k)));
            }
        } else {
            qVar = C42133q.f106351H;
        }
        if (qVar instanceof C42011j) {
            this.f106228d.put(k, (C42011j) qVar);
        }
        return qVar;
    }
}
