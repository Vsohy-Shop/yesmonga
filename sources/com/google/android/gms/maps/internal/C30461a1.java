package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41834l;
import com.google.android.gms.internal.maps.C41835m;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

/* renamed from: com.google.android.gms.maps.internal.a1 */
public abstract class C30461a1 extends C41834l implements C30465b1 {
    public C30461a1() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo86099r0((StreetViewPanoramaOrientation) C41835m.m169451a(parcel, StreetViewPanoramaOrientation.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
