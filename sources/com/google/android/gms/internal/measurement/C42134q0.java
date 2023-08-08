package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.q0 */
public final class C42134q0 extends C42083n0 implements C42168s0 {
    public C42134q0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: F6 */
    public final Bundle mo137229F6(Bundle bundle) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, bundle);
        Parcel H0 = mo137165H0(1, m0);
        Bundle bundle2 = (Bundle) C42117p0.m170701a(H0, Bundle.CREATOR);
        H0.recycle();
        return bundle2;
    }
}
