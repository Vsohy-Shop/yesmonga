package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.g1 */
public final class C41769g1 extends C41778j1 {

    /* renamed from: t */
    public final /* synthetic */ LocationRequest f105904t;

    /* renamed from: u */
    public final /* synthetic */ PendingIntent f105905u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41769g1(C41784l1 l1Var, C40507i iVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(iVar);
        this.f105904t = locationRequest;
        this.f105905u = pendingIntent;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo133872w(C40477a.C40479b bVar) throws RemoteException {
        ((C41811z) bVar).mo136269z0(this.f105904t, this.f105905u, new C41781k1(this));
    }
}
