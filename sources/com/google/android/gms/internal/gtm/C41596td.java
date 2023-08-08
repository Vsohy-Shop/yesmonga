package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.td */
public final class C41596td implements C41735z8 {

    /* renamed from: a */
    public final Context f105015a;

    public C41596td(Context context) {
        this.f105015a = (Context) C40843u.m166202l(context);
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
        String string = Settings.Secure.getString(this.f105015a.getContentResolver(), "android_id");
        if (string != null) {
            return new C41599tg(string);
        }
        return C41431mg.f104800h;
    }
}
