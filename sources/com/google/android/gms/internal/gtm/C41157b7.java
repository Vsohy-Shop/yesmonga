package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.b7 */
public final class C41157b7 implements C41475oc {

    /* renamed from: a */
    public final /* synthetic */ C41205d7 f104456a;

    public /* synthetic */ C41157b7(C41205d7 d7Var, C41133a7 a7Var) {
        this.f104456a = d7Var;
    }

    /* renamed from: a */
    public final Object mo135062a(String str, Map<String, Object> map) {
        String str2;
        try {
            return this.f104456a.f104520e.mo87700e2(str, map);
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
