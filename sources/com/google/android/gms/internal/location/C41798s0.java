package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.location.s0 */
public final class C41798s0 extends C41800t0 {

    /* renamed from: t */
    public final /* synthetic */ PendingIntent f105918t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41798s0(C41802u0 u0Var, C40507i iVar, PendingIntent pendingIntent) {
        super(iVar);
        this.f105918t = pendingIntent;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo133872w(C40477a.C40479b bVar) throws RemoteException {
        ((C41811z) bVar).mo136258K0(this.f105918t);
        mo133793o(Status.f103184g);
    }
}
