package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41826g0;
import com.google.android.gms.internal.maps.C41834l;

/* renamed from: com.google.android.gms.maps.internal.r */
public abstract class C30523r extends C41834l implements C30526s {
    public C30523r() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo86226l(C41826g0.m169373H0(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
