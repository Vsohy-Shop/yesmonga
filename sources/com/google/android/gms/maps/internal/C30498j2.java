package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41834l;
import com.google.android.gms.internal.maps.C41843u;

/* renamed from: com.google.android.gms.maps.internal.j2 */
public abstract class C30498j2 extends C41834l implements C30502k2 {
    public C30498j2() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo85867R7(C41843u.m169499H0(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
