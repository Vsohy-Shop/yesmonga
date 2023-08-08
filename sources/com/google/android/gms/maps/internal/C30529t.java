package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41826g0;
import com.google.android.gms.internal.maps.C41834l;

/* renamed from: com.google.android.gms.maps.internal.t */
public abstract class C30529t extends C41834l implements C30532u {
    public C30529t() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo86227l(C41826g0.m169373H0(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
