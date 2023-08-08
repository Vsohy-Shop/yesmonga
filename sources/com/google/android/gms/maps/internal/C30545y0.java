package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41834l;
import com.google.android.gms.internal.maps.C41835m;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

/* renamed from: com.google.android.gms.maps.internal.y0 */
public abstract class C30545y0 extends C41834l implements C30548z0 {
    public C30545y0() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo86233R4((StreetViewPanoramaLocation) C41835m.m169451a(parcel, StreetViewPanoramaLocation.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
