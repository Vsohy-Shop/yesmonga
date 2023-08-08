package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.location.r0 */
public final class C41796r0 extends C41800t0 {

    /* renamed from: t */
    public final /* synthetic */ long f105916t;

    /* renamed from: u */
    public final /* synthetic */ PendingIntent f105917u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41796r0(C41802u0 u0Var, C40507i iVar, long j, PendingIntent pendingIntent) {
        super(iVar);
        this.f105916t = j;
        this.f105917u = pendingIntent;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo133872w(C40477a.C40479b bVar) throws RemoteException {
        ((C41811z) bVar).mo136255H0(this.f105916t, this.f105917u);
        mo133793o(Status.f103184g);
    }
}
