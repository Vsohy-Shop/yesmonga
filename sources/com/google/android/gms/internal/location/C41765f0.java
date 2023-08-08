package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C30325d1;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;

/* renamed from: com.google.android.gms.internal.location.f0 */
public final class C41765f0 extends C30325d1<LocationSettingsResult> {

    /* renamed from: t */
    public final /* synthetic */ LocationSettingsRequest f105900t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41765f0(C41768g0 g0Var, C40507i iVar, LocationSettingsRequest locationSettingsRequest, String str) {
        super(iVar);
        this.f105900t = locationSettingsRequest;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C40669r mo133688k(Status status) {
        return new LocationSettingsResult(status, (LocationSettingsStates) null);
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo133872w(C40477a.C40479b bVar) throws RemoteException {
        ((C41811z) bVar).mo136254G0(this.f105900t, this, (String) null);
    }
}
