package com.contentsquare.android.sdk;

import java.util.ArrayList;

/* renamed from: com.contentsquare.android.sdk.gc */
public final class C14377gc {

    /* renamed from: com.contentsquare.android.sdk.gc$a */
    public static final class C14378a extends C14869xe implements C14325f5 {

        /* renamed from: w */
        public final C14501lb[] f35555w;

        public C14378a(int i, C14501lb... lbVarArr) {
            super(i);
            this.f35555w = lbVarArr;
        }

        /* renamed from: a */
        public void mo34402a() {
            mo36860g();
        }

        /* renamed from: h */
        public void mo35377h() {
            for (C14501lb d : this.f35555w) {
                d.mo34979d(this);
            }
        }

        /* renamed from: i */
        public void mo35378i() {
            for (C14501lb c : this.f35555w) {
                c.mo34978c(this);
            }
        }
    }

    /* renamed from: a */
    public static C14501lb m61914a(int i, C14501lb... lbVarArr) {
        if (lbVarArr.length == 0) {
            return new C14378a(i, new C14501lb[0]);
        }
        if (lbVarArr.length == 1) {
            C14378a aVar = lbVarArr[0];
            if (aVar instanceof C14378a) {
                C14378a aVar2 = aVar;
                if (aVar2.f36884c == 0) {
                    return new C14378a(i, aVar2.f35555w);
                }
            }
            return new C14378a(i, aVar);
        }
        ArrayList arrayList = new ArrayList();
        for (C14378a aVar3 : lbVarArr) {
            if (aVar3 instanceof C14378a) {
                C14378a aVar4 = aVar3;
                if (aVar4.f36884c == 0) {
                    for (C14501lb lbVar : aVar4.f35555w) {
                        if (!arrayList.contains(lbVar)) {
                            arrayList.add(lbVar);
                        }
                    }
                }
            }
            if (!arrayList.contains(aVar3)) {
                arrayList.add(aVar3);
            }
        }
        return new C14378a(i, (C14501lb[]) arrayList.toArray(new C14501lb[arrayList.size()]));
    }
}
