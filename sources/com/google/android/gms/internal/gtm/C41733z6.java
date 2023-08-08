package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.z6 */
public final class C41733z6 implements C41475oc {

    /* renamed from: a */
    public final /* synthetic */ C41205d7 f105320a;

    public /* synthetic */ C41733z6(C41205d7 d7Var, C41709y6 y6Var) {
        this.f105320a = d7Var;
    }

    /* renamed from: a */
    public final Object mo135062a(String str, Map<String, Object> map) {
        String str2;
        try {
            this.f105320a.f104520e.mo87699F2(str, map);
            return null;
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2 = "Error calling customEvaluator proxy:".concat(valueOf);
            } else {
                str2 = new String("Error calling customEvaluator proxy:");
            }
            C41493p6.m168149a(str2);
            return null;
        }
    }
}
