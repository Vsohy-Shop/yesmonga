package com.contentsquare.android.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.kf */
public class C14486kf {

    /* renamed from: a */
    public C14507le f35824a = null;

    /* renamed from: d */
    public static void m62428d(C14507le leVar, C14507le leVar2, long j, List<C14374ga> list) {
        boolean z;
        if (leVar.mo35837H() != leVar2.mo35837H()) {
            list.add(new C14435j(j, leVar.mo35837H()));
            list.add(new C14230bg(j, leVar2.mo35834E(), leVar2.mo35833D(), leVar2));
            return;
        }
        if (C14507le.f35873y.mo35880e(leVar, leVar2)) {
            list.add(new C14912z(j, leVar2.mo35837H(), leVar2));
        }
        List<C14507le> x = leVar2.mo35872x();
        List<C14507le> x2 = leVar.mo35872x();
        m62430f(x2, x, list, j);
        for (C14507le next : x2) {
            Iterator<C14507le> it = x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                C14507le next2 = it.next();
                if (next.mo35837H() == next2.mo35837H()) {
                    m62428d(next, next2, j, list);
                    z = false;
                    break;
                }
            }
            if (z) {
                list.add(new C14435j(j, next.mo35837H()));
            }
        }
    }

    /* renamed from: e */
    public static void m62429e(C14507le leVar, List<C14374ga> list, long j) {
        list.add(new C14230bg(j, -1, -1, leVar));
    }

    /* renamed from: f */
    public static void m62430f(List<C14507le> list, List<C14507le> list2, List<C14374ga> list3, long j) {
        boolean z;
        for (C14507le next : list2) {
            Iterator<C14507le> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo35837H() == next.mo35837H()) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                list3.add(new C14230bg(j, next.mo35834E(), next.mo35833D(), next));
            }
        }
    }

    /* renamed from: a */
    public List<C14374ga> mo35780a(C14507le leVar, long j) {
        List<C14374ga> b = mo35781b(this.f35824a, leVar, j);
        C14507le leVar2 = this.f35824a;
        this.f35824a = leVar;
        if (leVar2 != null) {
            C14507le.f35873y.mo35878c(leVar2);
        }
        return b;
    }

    /* renamed from: b */
    public List<C14374ga> mo35781b(C14507le leVar, C14507le leVar2, long j) {
        ArrayList arrayList = new ArrayList();
        if (leVar == null) {
            m62429e(leVar2, arrayList, j);
        } else {
            m62428d(leVar, leVar2, j, arrayList);
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo35782c() {
        C14507le leVar = this.f35824a;
        if (leVar != null) {
            C14507le.f35873y.mo35878c(leVar);
            this.f35824a = null;
        }
    }
}
