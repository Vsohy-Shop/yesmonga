package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41814a0;
import com.google.android.gms.internal.maps.C41834l;

/* renamed from: com.google.android.gms.maps.internal.n */
public abstract class C30511n extends C41834l implements C30514o {
    public C30511n() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb();
        } else if (i != 2) {
            return false;
        } else {
            mo86211f3(C41814a0.m169226H0(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
