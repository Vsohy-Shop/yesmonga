package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.maps.C41813a;
import com.google.android.gms.internal.maps.C41835m;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;

/* renamed from: com.google.android.gms.maps.internal.j1 */
public final class C30497j1 extends C41813a implements C30483g {
    public C30497j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    }

    /* renamed from: C2 */
    public final void mo86135C2(LatLng latLng, int i, StreetViewSource streetViewSource) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLng);
        H0.writeInt(i);
        C41835m.m169454d(H0, streetViewSource);
        mo136323O0(22, H0);
    }

    /* renamed from: C3 */
    public final void mo86136C3(LatLng latLng, int i) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLng);
        H0.writeInt(i);
        mo136323O0(13, H0);
    }

    /* renamed from: C5 */
    public final void mo86137C5(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(2, H0);
    }

    /* renamed from: D1 */
    public final boolean mo86138D1() throws RemoteException {
        Parcel m0 = mo136325m0(8, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: D4 */
    public final C41016d mo86139D4(StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, streetViewPanoramaOrientation);
        Parcel m0 = mo136325m0(19, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: E1 */
    public final void mo86140E1(LatLng latLng) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLng);
        mo136323O0(12, H0);
    }

    /* renamed from: G1 */
    public final void mo86141G1(String str) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeString(str);
        mo136323O0(11, H0);
    }

    /* renamed from: J7 */
    public final StreetViewPanoramaOrientation mo86142J7(C41016d dVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        Parcel m0 = mo136325m0(18, H0);
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) C41835m.m169451a(m0, StreetViewPanoramaOrientation.CREATOR);
        m0.recycle();
        return streetViewPanoramaOrientation;
    }

    /* renamed from: M1 */
    public final void mo86143M1(LatLng latLng, StreetViewSource streetViewSource) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLng);
        C41835m.m169454d(H0, streetViewSource);
        mo136323O0(21, H0);
    }

    /* renamed from: N3 */
    public final void mo86144N3(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(3, H0);
    }

    /* renamed from: S4 */
    public final void mo86145S4(C30548z0 z0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, z0Var);
        mo136323O0(15, H0);
    }

    /* renamed from: U2 */
    public final void mo86146U2(C30542x0 x0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, x0Var);
        mo136323O0(16, H0);
    }

    /* renamed from: X4 */
    public final boolean mo86147X4() throws RemoteException {
        Parcel m0 = mo136325m0(6, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: c2 */
    public final StreetViewPanoramaLocation mo86148c2() throws RemoteException {
        Parcel m0 = mo136325m0(14, mo136322H0());
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) C41835m.m169451a(m0, StreetViewPanoramaLocation.CREATOR);
        m0.recycle();
        return streetViewPanoramaLocation;
    }

    /* renamed from: g7 */
    public final void mo86149g7(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, streetViewPanoramaCamera);
        H0.writeLong(j);
        mo136323O0(9, H0);
    }

    /* renamed from: j5 */
    public final boolean mo86150j5() throws RemoteException {
        Parcel m0 = mo136325m0(7, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: k4 */
    public final StreetViewPanoramaCamera mo86151k4() throws RemoteException {
        Parcel m0 = mo136325m0(10, mo136322H0());
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) C41835m.m169451a(m0, StreetViewPanoramaCamera.CREATOR);
        m0.recycle();
        return streetViewPanoramaCamera;
    }

    /* renamed from: p6 */
    public final void mo86152p6(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(1, H0);
    }

    /* renamed from: t2 */
    public final void mo86153t2(C30473d1 d1Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, d1Var);
        mo136323O0(20, H0);
    }

    /* renamed from: u0 */
    public final boolean mo86154u0() throws RemoteException {
        Parcel m0 = mo136325m0(5, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: w7 */
    public final void mo86155w7(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(4, H0);
    }

    /* renamed from: x6 */
    public final void mo86156x6(C30465b1 b1Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, b1Var);
        mo136323O0(17, H0);
    }
}
