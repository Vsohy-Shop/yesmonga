package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41826g0;
import com.google.android.gms.internal.maps.C41834l;
import com.google.android.gms.internal.maps.C41835m;

/* renamed from: com.google.android.gms.maps.internal.f0 */
public abstract class C30480f0 extends C41834l implements C30484g0 {
    public C30480f0() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean l = mo86157l(C41826g0.m169373H0(parcel.readStrongBinder()));
        parcel2.writeNoException();
        C41835m.m169453c(parcel2, l);
        return true;
    }
}
