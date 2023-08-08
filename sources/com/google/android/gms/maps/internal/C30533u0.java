package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41819d;
import com.google.android.gms.internal.maps.C41834l;

/* renamed from: com.google.android.gms.maps.internal.u0 */
public abstract class C30533u0 extends C41834l implements C30536v0 {
    public C30533u0() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo85970K2(C41819d.m169294H0(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
