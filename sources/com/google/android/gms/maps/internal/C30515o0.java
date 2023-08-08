package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41834l;
import com.google.android.gms.internal.maps.C41835m;

/* renamed from: com.google.android.gms.maps.internal.o0 */
public abstract class C30515o0 extends C41834l implements C30518p0 {
    public C30515o0() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo86213l2((Location) C41835m.m169451a(parcel, Location.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
