package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.internal.C40599o;
import com.google.android.gms.location.C30354k;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.f1 */
public final class C41766f1 extends C41778j1 {

    /* renamed from: t */
    public final /* synthetic */ LocationRequest f105901t;

    /* renamed from: u */
    public final /* synthetic */ C30354k f105902u;

    /* renamed from: v */
    public final /* synthetic */ Looper f105903v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41766f1(C41784l1 l1Var, C40507i iVar, LocationRequest locationRequest, C30354k kVar, Looper looper) {
        super(iVar);
        this.f105901t = locationRequest;
        this.f105902u = kVar;
        this.f105903v = looper;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo133872w(C40477a.C40479b bVar) throws RemoteException {
        ((C41811z) bVar).mo136266w0(zzba.m169191M((String) null, this.f105901t), C40599o.m165304a(this.f105902u, C41771h0.m169042a(this.f105903v), C30354k.class.getSimpleName()), new C41781k1(this));
    }
}
