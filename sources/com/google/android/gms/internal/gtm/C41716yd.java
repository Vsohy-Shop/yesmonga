package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.yd */
public final class C41716yd implements C41735z8 {
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
        int i = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder(16);
        sb.append("5.06-");
        sb.append(i);
        return new C41599tg(sb.toString());
    }
}
