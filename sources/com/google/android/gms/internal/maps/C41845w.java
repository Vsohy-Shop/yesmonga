package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.google.android.gms.internal.maps.w */
public final class C41845w extends C41813a implements C41847y {
    public C41845w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    /* renamed from: C7 */
    public final void mo136469C7(float f, float f2) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        H0.writeFloat(f2);
        mo136323O0(6, H0);
    }

    /* renamed from: D */
    public final boolean mo136470D() throws RemoteException {
        Parcel m0 = mo136325m0(23, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: M4 */
    public final void mo136471M4(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(15, H0);
    }

    /* renamed from: N0 */
    public final void mo136472N0(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(11, H0);
    }

    /* renamed from: N4 */
    public final void mo136473N4(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(13, H0);
    }

    /* renamed from: P */
    public final boolean mo136474P() throws RemoteException {
        Parcel m0 = mo136325m0(16, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: U1 */
    public final void mo136475U1(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(17, H0);
    }

    /* renamed from: c0 */
    public final void mo136476c0(C41016d dVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        mo136323O0(21, H0);
    }

    /* renamed from: d1 */
    public final void mo136477d1(LatLngBounds latLngBounds) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLngBounds);
        mo136323O0(9, H0);
    }

    /* renamed from: e */
    public final float mo136478e() throws RemoteException {
        Parcel m0 = mo136325m0(12, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: f */
    public final float mo136479f() throws RemoteException {
        Parcel m0 = mo136325m0(8, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: h */
    public final float mo136480h() throws RemoteException {
        Parcel m0 = mo136325m0(7, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: h3 */
    public final void mo136481h3(LatLng latLng) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLng);
        mo136323O0(3, H0);
    }

    /* renamed from: i7 */
    public final void mo136482i7(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(5, H0);
    }

    /* renamed from: j */
    public final float mo136483j() throws RemoteException {
        Parcel m0 = mo136325m0(14, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: k */
    public final int mo136484k() throws RemoteException {
        Parcel m0 = mo136325m0(20, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: n */
    public final void mo136485n(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(22, H0);
    }

    /* renamed from: o */
    public final float mo136486o() throws RemoteException {
        Parcel m0 = mo136325m0(18, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: p */
    public final C41016d mo136487p() throws RemoteException {
        Parcel m0 = mo136325m0(25, mo136322H0());
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: q */
    public final LatLngBounds mo136488q() throws RemoteException {
        Parcel m0 = mo136325m0(10, mo136322H0());
        LatLngBounds latLngBounds = (LatLngBounds) C41835m.m169451a(m0, LatLngBounds.CREATOR);
        m0.recycle();
        return latLngBounds;
    }

    /* renamed from: q0 */
    public final void mo136489q0(C41016d dVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        mo136323O0(24, H0);
    }

    /* renamed from: r */
    public final String mo136490r() throws RemoteException {
        Parcel m0 = mo136325m0(2, mo136322H0());
        String readString = m0.readString();
        m0.recycle();
        return readString;
    }

    /* renamed from: s */
    public final void mo136491s() throws RemoteException {
        mo136323O0(1, mo136322H0());
    }

    /* renamed from: t */
    public final LatLng mo136492t() throws RemoteException {
        Parcel m0 = mo136325m0(4, mo136322H0());
        LatLng latLng = (LatLng) C41835m.m169451a(m0, LatLng.CREATOR);
        m0.recycle();
        return latLng;
    }

    /* renamed from: v4 */
    public final boolean mo136493v4(C41847y yVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, yVar);
        Parcel m0 = mo136325m0(19, H0);
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }
}
