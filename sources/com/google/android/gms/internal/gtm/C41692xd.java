package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.internal.gtm.xd */
public final class C41692xd extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C41431mg mgVar;
        C41431mg mgVar2;
        int i = 1;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length >= 2) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C41431mg mgVar3 = hgVarArr[0];
        C41431mg mgVar4 = C41431mg.f104800h;
        if (mgVar3 == mgVar4 || hgVarArr[1] == mgVar4) {
            return mgVar4;
        }
        String d = C41135a9.m167070d(mgVar3);
        String d2 = C41135a9.m167070d(hgVarArr[1]);
        int i2 = 64;
        if (length > 2 && (mgVar2 = hgVarArr[2]) != mgVar4 && C41135a9.m167073g(mgVar2)) {
            i2 = 66;
        }
        if (length > 3 && (mgVar = hgVarArr[3]) != mgVar4) {
            if (!(mgVar instanceof C41358jg)) {
                return mgVar4;
            }
            double a = C41135a9.m167067a(mgVar);
            if (Double.isInfinite(a) || a < 0.0d) {
                return mgVar4;
            }
            i = (int) a;
        }
        try {
            Matcher matcher = Pattern.compile(d2, i2).matcher(d);
            String str = null;
            if (matcher.find() && matcher.groupCount() >= i) {
                str = matcher.group(i);
            }
            if (str == null) {
                return mgVar4;
            }
            return new C41599tg(str);
        } catch (PatternSyntaxException unused) {
            return C41431mg.f104800h;
        }
    }
}
