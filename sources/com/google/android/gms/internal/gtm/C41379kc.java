package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.gtm.kc */
public final class C41379kc extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        C41310hg hgVar;
        C40843u.m166191a(true);
        if (hgVarArr.length > 0) {
            hgVar = (C41310hg) C40843u.m166202l(hgVarArr[0]);
        } else {
            hgVar = C41431mg.f104800h;
        }
        try {
            return new C41599tg(C41330ic.m167704c(C41135a9.m167070d(hgVar), ""));
        } catch (UnsupportedEncodingException unused) {
            return C41431mg.f104800h;
        }
    }
}
