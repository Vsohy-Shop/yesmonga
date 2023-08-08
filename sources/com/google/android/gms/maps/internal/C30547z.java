package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41834l;

/* renamed from: com.google.android.gms.maps.internal.z */
public abstract class C30547z extends C41834l implements C30460a0 {
    public C30547z() {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
