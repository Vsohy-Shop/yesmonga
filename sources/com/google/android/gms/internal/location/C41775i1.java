package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;

/* renamed from: com.google.android.gms.internal.location.i1 */
public final class C41775i1 extends C41778j1 {

    /* renamed from: t */
    public final /* synthetic */ PendingIntent f105907t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41775i1(C41784l1 l1Var, C40507i iVar, PendingIntent pendingIntent) {
        super(iVar);
        this.f105907t = pendingIntent;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo133872w(C40477a.C40479b bVar) throws RemoteException {
        ((C41811z) bVar).mo136249B0(this.f105907t, new C41781k1(this));
    }
}
