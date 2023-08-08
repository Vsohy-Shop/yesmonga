package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.C30440d;
import com.google.android.gms.maps.internal.C30538w;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.y0 */
public final class C30632y0 implements C30440d.C30441a {

    /* renamed from: a */
    public final /* synthetic */ C30538w f73180a;

    public C30632y0(C30449f1 f1Var, C30538w wVar) {
        this.f73180a = wVar;
    }

    public final void onLocationChanged(Location location) {
        try {
            this.f73180a.mo86228T(location);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
