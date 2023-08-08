package com.google.android.gms.internal.gtm;

import com.carrefour.fid.android.airship.util.C13758b;
import com.google.android.gms.common.internal.C40843u;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.internal.gtm.je */
public final class C41356je extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length == 2) {
            z = true;
        } else if (length == 3) {
            z = true;
            length = 3;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        String d = C41135a9.m167070d(hgVarArr[0]);
        String d2 = C41135a9.m167070d(hgVarArr[1]);
        int i = 64;
        if (length >= 3 && C13758b.f33436b.equalsIgnoreCase(C41135a9.m167070d(hgVarArr[2]))) {
            i = 66;
        }
        try {
            return new C41334ig(Boolean.valueOf(Pattern.compile(d2, i).matcher(d).find()));
        } catch (PatternSyntaxException unused) {
            return new C41334ig(Boolean.FALSE);
        }
    }
}
