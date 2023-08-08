package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.hd */
public final class C41307hd implements C41735z8 {

    /* renamed from: a */
    public final String f104656a = Build.MANUFACTURER;

    /* renamed from: b */
    public final String f104657b = Build.MODEL;

    /* renamed from: a */
    public final C41310hg<?> mo135005a(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2 = false;
        if (hgVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVarArr.length == 0) {
            z2 = true;
        }
        C40843u.m166191a(z2);
        String str = this.f104656a;
        String str2 = this.f104657b;
        if (!str2.startsWith(str) && !str.equals("unknown")) {
            StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            str2 = sb.toString();
        }
        return new C41599tg(str2);
    }
}
