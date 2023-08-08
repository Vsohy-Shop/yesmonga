package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.location.GeofencingRequest;

/* renamed from: com.google.android.gms.internal.location.c */
public final class C41755c extends C41761e {

    /* renamed from: t */
    public final /* synthetic */ GeofencingRequest f105892t;

    /* renamed from: u */
    public final /* synthetic */ PendingIntent f105893u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41755c(C41764f fVar, C40507i iVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(iVar);
        this.f105892t = geofencingRequest;
        this.f105893u = pendingIntent;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo133872w(C40477a.C40479b bVar) throws RemoteException {
        ((C41811z) bVar).mo136260M0(this.f105892t, this.f105893u, this);
    }
}
