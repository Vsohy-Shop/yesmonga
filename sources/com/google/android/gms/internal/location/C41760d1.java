package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.internal.C40599o;
import com.google.android.gms.location.C30358l;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.d1 */
public final class C41760d1 extends C41778j1 {

    /* renamed from: t */
    public final /* synthetic */ LocationRequest f105895t;

    /* renamed from: u */
    public final /* synthetic */ C30358l f105896u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41760d1(C41784l1 l1Var, C40507i iVar, LocationRequest locationRequest, C30358l lVar) {
        super(iVar);
        this.f105895t = locationRequest;
        this.f105896u = lVar;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo133872w(C40477a.C40479b bVar) throws RemoteException {
        ((C41811z) bVar).mo136267x0(this.f105895t, C40599o.m165304a(this.f105896u, C41771h0.m169043b(), C30358l.class.getSimpleName()), new C41781k1(this));
    }
}
