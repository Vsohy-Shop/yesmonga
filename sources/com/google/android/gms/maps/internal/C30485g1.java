package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.maps.C41813a;
import com.google.android.gms.internal.maps.C41835m;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: com.google.android.gms.maps.internal.g1 */
public final class C30485g1 extends C41813a implements C30479f {
    public C30485g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    /* renamed from: b2 */
    public final C41016d mo86132b2(LatLng latLng) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLng);
        Parcel m0 = mo136325m0(2, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: n4 */
    public final LatLng mo86133n4(C41016d dVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        Parcel m0 = mo136325m0(1, H0);
        LatLng latLng = (LatLng) C41835m.m169451a(m0, LatLng.CREATOR);
        m0.recycle();
        return latLng;
    }

    /* renamed from: z2 */
    public final VisibleRegion mo86134z2() throws RemoteException {
        Parcel m0 = mo136325m0(3, mo136322H0());
        VisibleRegion visibleRegion = (VisibleRegion) C41835m.m169451a(m0, VisibleRegion.CREATOR);
        m0.recycle();
        return visibleRegion;
    }
}
