package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.n */
public abstract class C41787n extends C41750a0 implements C41789o {
    public C41787n() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    /* renamed from: m0 */
    public final boolean mo85751m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo136221Q1((LocationSettingsResult) C41794q0.m169120b(parcel, LocationSettingsResult.CREATOR));
        return true;
    }
}
