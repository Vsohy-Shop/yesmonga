package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41834l;
import com.google.android.gms.internal.maps.C41846x;

/* renamed from: com.google.android.gms.maps.internal.l2 */
public abstract class C30506l2 extends C41834l implements C30510m2 {
    public C30506l2() {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo86210W0(C41846x.m169549H0(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
