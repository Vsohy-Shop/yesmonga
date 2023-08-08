package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.maps.C41834l;

/* renamed from: com.google.android.gms.maps.internal.l0 */
public abstract class C30504l0 extends C41834l implements C30508m0 {
    public C30504l0() {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo86209a3(C41016d.C41017a.m166799H0(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
