package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.autofill.C0861a;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.ad */
public final class C41139ad implements C41735z8 {

    /* renamed from: a */
    public final Context f104436a;

    public C41139ad(Context context) {
        this.f104436a = (Context) C40843u.m166202l(context);
    }

    /* renamed from: a */
    public final C41310hg<?> mo135005a(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        String networkOperatorName;
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
        TelephonyManager telephonyManager = (TelephonyManager) this.f104436a.getSystemService(C0861a.f2705e);
        C41431mg mgVar = C41431mg.f104800h;
        if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
            return mgVar;
        }
        return new C41599tg(networkOperatorName);
    }
}
