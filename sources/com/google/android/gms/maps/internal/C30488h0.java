package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41826g0;
import com.google.android.gms.internal.maps.C41834l;

/* renamed from: com.google.android.gms.maps.internal.h0 */
public abstract class C30488h0 extends C41834l implements C30492i0 {
    public C30488h0() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo86185z6(C41826g0.m169373H0(parcel.readStrongBinder()));
        } else if (i == 2) {
            mo86183l(C41826g0.m169373H0(parcel.readStrongBinder()));
        } else if (i != 3) {
            return false;
        } else {
            mo86184t0(C41826g0.m169373H0(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
