package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.maps.C41826g0;
import com.google.android.gms.internal.maps.C41834l;
import com.google.android.gms.internal.maps.C41835m;

/* renamed from: com.google.android.gms.maps.internal.u1 */
public abstract class C30534u1 extends C41834l implements C30537v1 {
    public C30534u1() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C41016d t0 = mo86230t0(C41826g0.m169373H0(parcel.readStrongBinder()));
            parcel2.writeNoException();
            C41835m.m169456f(parcel2, t0);
        } else if (i != 2) {
            return false;
        } else {
            C41016d l = mo86229l(C41826g0.m169373H0(parcel.readStrongBinder()));
            parcel2.writeNoException();
            C41835m.m169456f(parcel2, l);
        }
        return true;
    }
}
