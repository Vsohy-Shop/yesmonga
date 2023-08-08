package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.gtm.wb */
public final class C41666wb extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        String str;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length == 1) {
            z = true;
        } else if (length == 2) {
            z = true;
            length = 2;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41599tg);
        String k = hgVarArr[0].mo135863k();
        if (length < 2) {
            str = "";
        } else {
            str = C41135a9.m167070d(hgVarArr[1]);
        }
        Matcher matcher = Pattern.compile(str).matcher(k);
        if (!matcher.find()) {
            return C41431mg.f104799g;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C41599tg(matcher.group()));
        return new C41503pg(arrayList);
    }
}
