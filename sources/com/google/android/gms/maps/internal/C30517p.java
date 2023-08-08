package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41826g0;
import com.google.android.gms.internal.maps.C41834l;

/* renamed from: com.google.android.gms.maps.internal.p */
public abstract class C30517p extends C41834l implements C30520q {
    public C30517p() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo86214l(C41826g0.m169373H0(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
