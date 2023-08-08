package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.xb */
public final class C41690xb extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C41310hg<?> hgVar;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length <= 0 || length > 3) {
            z = false;
        } else {
            z = true;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41599tg);
        String k = hgVarArr[0].mo135863k();
        if (length == 1) {
            return new C41599tg(k);
        }
        String d = C41135a9.m167070d(hgVarArr[1]);
        if (length < 3) {
            hgVar = C41431mg.f104800h;
        } else {
            hgVar = hgVarArr[2];
        }
        int indexOf = k.indexOf(d);
        if (indexOf == -1) {
            return new C41599tg(k);
        }
        if (hgVar instanceof C41383kg) {
            hgVar = ((C41383kg) hgVar).mo135582i().mo135005a(g7Var, new C41599tg(d), new C41358jg(Double.valueOf((double) indexOf)), new C41599tg(k));
        }
        String d2 = C41135a9.m167070d(hgVar);
        String substring = k.substring(0, indexOf);
        String substring2 = k.substring(indexOf + d.length());
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + String.valueOf(d2).length() + String.valueOf(substring2).length());
        sb.append(substring);
        sb.append(d2);
        sb.append(substring2);
        return new C41599tg(sb.toString());
    }
}
