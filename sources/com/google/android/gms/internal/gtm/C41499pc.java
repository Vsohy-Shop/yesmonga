package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.pc */
public final class C41499pc extends C41159b9 {

    /* renamed from: a */
    public final C41475oc f104872a;

    public C41499pc(C41475oc ocVar) {
        this.f104872a = ocVar;
    }

    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C41431mg mgVar;
        C40843u.m166202l(hgVarArr);
        int length = hgVarArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41599tg);
        String k = hgVarArr[0].mo135863k();
        HashMap hashMap = new HashMap();
        if (length >= 2 && (mgVar = hgVarArr[1]) != C41431mg.f104800h) {
            C40843u.m166191a(mgVar instanceof C41527qg);
            for (Map.Entry next : hgVarArr[1].mo135785i().entrySet()) {
                C40843u.m166208r(!(next.getValue() instanceof C41551rg));
                C40843u.m166208r(!C41623ug.m168497i((C41310hg) next.getValue()));
                hashMap.put((String) next.getKey(), ((C41310hg) next.getValue()).mo135436c());
            }
        }
        return C41623ug.m168490b(this.f104872a.mo135062a(k, hashMap));
    }
}
