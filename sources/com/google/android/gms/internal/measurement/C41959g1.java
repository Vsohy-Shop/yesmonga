package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.g1 */
public abstract class C41959g1 extends C42100o0 implements C41977h1 {
    public C41959g1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: m0 */
    public final boolean mo87178m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        C42117p0.m170703c(parcel);
        mo136499s6((Bundle) C42117p0.m170701a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
