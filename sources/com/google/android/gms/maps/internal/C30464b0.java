package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41834l;
import com.google.android.gms.internal.maps.C41835m;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.maps.internal.b0 */
public abstract class C30464b0 extends C41834l implements C30468c0 {
    public C30464b0() {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo86100g0((LatLng) C41835m.m169451a(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
