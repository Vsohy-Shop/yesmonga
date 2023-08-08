package com.google.android.gms.internal.gtm;

import android.net.Uri;
import com.google.android.gms.common.internal.C40843u;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.oe */
public final class C41477oe extends C41159b9 {

    /* renamed from: a */
    public final C41228e6 f104839a;

    public C41477oe(C41228e6 e6Var) {
        this.f104839a = e6Var;
    }

    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C41431mg mgVar;
        boolean z2;
        C41431mg mgVar2;
        String str;
        boolean z3 = true;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C41310hg<?> hgVar = hgVarArr[0];
        C40843u.m166191a(!(hgVar instanceof C41431mg));
        if (length > 1) {
            mgVar = hgVarArr[1];
        } else {
            mgVar = C41431mg.f104800h;
        }
        C41431mg mgVar3 = C41431mg.f104800h;
        if (mgVar == mgVar3 || (mgVar instanceof C41503pg)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40843u.m166191a(z2);
        if (length > 2) {
            mgVar2 = hgVarArr[2];
        } else {
            mgVar2 = mgVar3;
        }
        if (mgVar2 != mgVar3 && (mgVar2 instanceof C41431mg)) {
            z3 = false;
        }
        C40843u.m166191a(z3);
        Uri.Builder buildUpon = Uri.parse(C41135a9.m167070d(hgVar)).buildUpon();
        if (mgVar != mgVar3) {
            for (C41310hg next : ((C41503pg) mgVar).mo135719k()) {
                C40843u.m166191a(next instanceof C41527qg);
                for (Map.Entry next2 : ((C41527qg) next).mo135785i().entrySet()) {
                    buildUpon.appendQueryParameter(((String) next2.getKey()).toString(), C41135a9.m167070d(C41623ug.m168491c(g7Var, (C41310hg) next2.getValue())));
                }
            }
        }
        String uri = buildUpon.build().toString();
        C41431mg mgVar4 = C41431mg.f104800h;
        if (mgVar2 == mgVar4) {
            ((C41708y5) this.f104839a).mo135337a(uri, (String) null, (String) null, (Map<String, String>) null, (String) null);
            String valueOf = String.valueOf(uri);
            if (valueOf.length() != 0) {
                str = "SendPixel: url = ".concat(valueOf);
            } else {
                str = new String("SendPixel: url = ");
            }
            C41493p6.m168152d(str);
        } else {
            String d = C41135a9.m167070d(mgVar2);
            ((C41708y5) this.f104839a).mo135337a(uri, (String) null, d, (Map<String, String>) null, (String) null);
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 30 + String.valueOf(d).length());
            sb.append("SendPixel: url = ");
            sb.append(uri);
            sb.append(", uniqueId = ");
            sb.append(d);
            C41493p6.m168152d(sb.toString());
        }
        return mgVar4;
    }
}
