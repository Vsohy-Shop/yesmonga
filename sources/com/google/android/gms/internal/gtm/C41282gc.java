package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.gtm.gc */
public final class C41282gc extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z = true;
        C40843u.m166191a(true);
        if (hgVarArr.length != 1) {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41599tg);
        return new C41599tg(hgVarArr[0].mo135863k().toUpperCase(Locale.ENGLISH));
    }
}
