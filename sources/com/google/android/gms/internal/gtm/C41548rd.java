package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.gtm.rd */
public final class C41548rd implements C41735z8 {
    /* renamed from: a */
    public final C41310hg<?> mo135005a(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2 = true;
        if (hgVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVarArr.length != 0) {
            z2 = false;
        }
        C40843u.m166191a(z2);
        return new C41599tg(Locale.getDefault().getCountry());
    }
}
