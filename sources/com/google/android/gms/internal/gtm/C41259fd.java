package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.fd */
public final class C41259fd implements C41735z8 {

    /* renamed from: a */
    public final Context f104594a;

    public C41259fd(Context context) {
        this.f104594a = context;
    }

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
        String string = Settings.Secure.getString(this.f104594a.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        return new C41599tg(string);
    }
}
