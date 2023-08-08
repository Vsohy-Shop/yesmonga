package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p */
public final class C42116p extends C42011j implements C42065m {

    /* renamed from: c */
    public final List f106326c;

    /* renamed from: d */
    public final List f106327d;

    /* renamed from: e */
    public C41909d5 f106328e;

    public C42116p(C42116p pVar) {
        super(pVar.f106229a);
        ArrayList arrayList = new ArrayList(pVar.f106326c.size());
        this.f106326c = arrayList;
        arrayList.addAll(pVar.f106326c);
        ArrayList arrayList2 = new ArrayList(pVar.f106327d.size());
        this.f106327d = arrayList2;
        arrayList2.addAll(pVar.f106327d);
        this.f106328e = pVar.f106328e;
    }

    /* renamed from: a */
    public final C42133q mo136725a(C41909d5 d5Var, List list) {
        C41909d5 a = this.f106328e.mo136672a();
        for (int i = 0; i < this.f106326c.size(); i++) {
            if (i < list.size()) {
                a.mo136676e((String) this.f106326c.get(i), d5Var.mo136673b((C42133q) list.get(i)));
            } else {
                a.mo136676e((String) this.f106326c.get(i), C42133q.f106351H);
            }
        }
        for (C42133q qVar : this.f106327d) {
            C42133q b = a.mo136673b(qVar);
            if (b instanceof C42150r) {
                b = a.mo136673b(qVar);
            }
            if (b instanceof C41975h) {
                return ((C41975h) b).mo136889a();
            }
        }
        return C42133q.f106351H;
    }

    /* renamed from: e */
    public final C42133q mo136734e() {
        return new C42116p(this);
    }

    public C42116p(String str, List list, List list2, C41909d5 d5Var) {
        super(str);
        this.f106326c = new ArrayList();
        this.f106328e = d5Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f106326c.add(((C42133q) it.next()).mo136744k());
            }
        }
        this.f106327d = new ArrayList(list2);
    }
}
