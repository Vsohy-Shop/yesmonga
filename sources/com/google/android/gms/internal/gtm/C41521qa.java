package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.qa */
public final class C41521qa extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C40843u.m166191a(true);
        if (hgVarArr.length == 3) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[1] instanceof C41599tg);
        C40843u.m166191a(hgVarArr[2] instanceof C41503pg);
        C41310hg<?> hgVar = hgVarArr[0];
        String k = hgVarArr[1].mo135863k();
        List<C41310hg<?>> k2 = hgVarArr[2].mo135719k();
        if (hgVar.mo135441h(k)) {
            C41310hg<?> b = hgVar.mo135435b(k);
            if (b instanceof C41383kg) {
                return ((C41383kg) b).mo135582i().mo135005a(g7Var, (C41310hg[]) k2.toArray(new C41310hg[k2.size()]));
            }
            StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 35);
            sb.append("Apply TypeError: ");
            sb.append(k);
            sb.append(" is not a function");
            throw new IllegalArgumentException(sb.toString());
        } else if (hgVar.mo135440g(k)) {
            C41735z8 a = hgVar.mo135434a(k);
            k2.add(0, hgVar);
            return a.mo135005a(g7Var, (C41310hg[]) k2.toArray(new C41310hg[k2.size()]));
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(k).length() + 40);
            sb2.append("Apply TypeError: object has no ");
            sb2.append(k);
            sb2.append(" property");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
