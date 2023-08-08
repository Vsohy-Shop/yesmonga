package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.f1 */
public final class C41941f1 extends C42083n0 implements C41977h1 {
    public C41941f1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: s6 */
    public final void mo136499s6(Bundle bundle) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, bundle);
        mo137166O0(1, m0);
    }
}
