package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tagmanager.C31016p;

/* renamed from: com.google.android.gms.internal.gtm.v7 */
public final class C41638v7 extends C31016p {

    /* renamed from: n */
    public final /* synthetic */ C41375k8 f105154n;

    public C41638v7(C41375k8 k8Var) {
        this.f105154n = k8Var;
    }

    /* renamed from: E */
    public final void mo87703E(String str, String str2, Bundle bundle, long j) throws RemoteException {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append(str);
        sb.append("+gtm");
        this.f105154n.f104753e.execute(new C41614u7(this, str2, bundle, sb.toString(), j, str));
    }
}
