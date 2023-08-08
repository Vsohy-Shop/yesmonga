package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41834l;
import com.google.android.gms.internal.maps.C41835m;
import com.google.android.gms.maps.model.PointOfInterest;

/* renamed from: com.google.android.gms.maps.internal.q0 */
public abstract class C30521q0 extends C41834l implements C30524r0 {
    public C30521q0() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo85998j1((PointOfInterest) C41835m.m169451a(parcel, PointOfInterest.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
