package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.y */
public final class C41809y extends C41787n {

    /* renamed from: n */
    public C40538e.C40540b<LocationSettingsResult> f105932n;

    public C41809y(C40538e.C40540b<LocationSettingsResult> bVar) {
        boolean z;
        if (bVar != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166192b(z, "listener can't be null.");
        this.f105932n = bVar;
    }

    /* renamed from: Q1 */
    public final void mo136221Q1(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.f105932n.mo85669a(locationSettingsResult);
        this.f105932n = null;
    }
}
