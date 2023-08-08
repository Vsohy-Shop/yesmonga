package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41834l;
import com.google.android.gms.internal.maps.C41835m;

/* renamed from: com.google.android.gms.maps.internal.j0 */
public abstract class C30496j0 extends C41834l implements C30500k0 {
    public C30496j0() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zzb = zzb();
        parcel2.writeNoException();
        C41835m.m169453c(parcel2, zzb);
        return true;
    }
}
