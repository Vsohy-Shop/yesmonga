package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.maps.C41813a;
import com.google.android.gms.internal.maps.C41835m;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.google.android.gms.maps.internal.n0 */
public final class C30512n0 extends C41813a implements C30459a {
    public C30512n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    /* renamed from: E4 */
    public final C41016d mo86011E4(LatLng latLng, float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLng);
        H0.writeFloat(f);
        Parcel m0 = mo136325m0(9, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: F4 */
    public final C41016d mo86012F4(float f, float f2) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        H0.writeFloat(f2);
        Parcel m0 = mo136325m0(3, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: P7 */
    public final C41016d mo86013P7() throws RemoteException {
        Parcel m0 = mo136325m0(2, mo136322H0());
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: U6 */
    public final C41016d mo86014U6(float f, int i, int i2) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        H0.writeInt(i);
        H0.writeInt(i2);
        Parcel m0 = mo136325m0(6, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: X0 */
    public final C41016d mo86015X0(LatLngBounds latLngBounds, int i) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLngBounds);
        H0.writeInt(i);
        Parcel m0 = mo136325m0(10, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: Y5 */
    public final C41016d mo86016Y5(LatLng latLng) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLng);
        Parcel m0 = mo136325m0(8, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: c1 */
    public final C41016d mo86017c1(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        Parcel m0 = mo136325m0(5, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: n2 */
    public final C41016d mo86018n2() throws RemoteException {
        Parcel m0 = mo136325m0(1, mo136322H0());
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: r3 */
    public final C41016d mo86019r3(LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLngBounds);
        H0.writeInt(i);
        H0.writeInt(i2);
        H0.writeInt(i3);
        Parcel m0 = mo136325m0(11, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: u4 */
    public final C41016d mo86020u4(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        Parcel m0 = mo136325m0(4, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: y3 */
    public final C41016d mo86021y3(CameraPosition cameraPosition) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, cameraPosition);
        Parcel m0 = mo136325m0(7, H0);
        C41016d H02 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }
}
