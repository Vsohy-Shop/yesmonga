package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.C41558s;
import com.google.android.gms.internal.gtm.C41582t;

/* renamed from: com.google.android.gms.tagmanager.m */
public abstract class C31013m extends C41558s implements C31014n {
    public C31013m() {
        super("com.google.android.gms.tagmanager.IMeasurementEventListener");
    }

    /* renamed from: m0 */
    public final boolean mo87701m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo87702E(parcel.readString(), parcel.readString(), (Bundle) C41582t.m168360a(parcel, Bundle.CREATOR), parcel.readLong());
        parcel2.writeNoException();
        return true;
    }
}
