package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41834l;

/* renamed from: com.google.android.gms.maps.internal.h2 */
public abstract class C30490h2 extends C41834l implements C30494i2 {
    public C30490h2() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo86005Y1(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
