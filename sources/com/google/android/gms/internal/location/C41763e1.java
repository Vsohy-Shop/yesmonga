package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.internal.C40599o;
import com.google.android.gms.location.C30358l;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.e1 */
public final class C41763e1 extends C41778j1 {

    /* renamed from: t */
    public final /* synthetic */ LocationRequest f105897t;

    /* renamed from: u */
    public final /* synthetic */ C30358l f105898u;

    /* renamed from: v */
    public final /* synthetic */ Looper f105899v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41763e1(C41784l1 l1Var, C40507i iVar, LocationRequest locationRequest, C30358l lVar, Looper looper) {
        super(iVar);
        this.f105897t = locationRequest;
        this.f105898u = lVar;
        this.f105899v = looper;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo133872w(C40477a.C40479b bVar) throws RemoteException {
        ((C41811z) bVar).mo136267x0(this.f105897t, C40599o.m165304a(this.f105898u, C41771h0.m169042a(this.f105899v), C30358l.class.getSimpleName()), new C41781k1(this));
    }
}
