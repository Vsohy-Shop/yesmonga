package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.h */
public abstract class C41770h extends C41750a0 implements C41773i {
    public C41770h() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* renamed from: m0 */
    public final boolean mo85751m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo85699m8((zzaa) C41794q0.m169120b(parcel, zzaa.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo85698d();
        }
        return true;
    }
}
