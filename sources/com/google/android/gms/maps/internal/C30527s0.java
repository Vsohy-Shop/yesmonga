package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41832j0;
import com.google.android.gms.internal.maps.C41834l;

/* renamed from: com.google.android.gms.maps.internal.s0 */
public abstract class C30527s0 extends C41834l implements C30530t0 {
    public C30527s0() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo85869j4(C41832j0.m169448H0(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
