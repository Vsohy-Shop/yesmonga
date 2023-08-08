package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.maps.f */
public final class C41823f extends C41813a implements C41827h {
    public C41823f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    /* renamed from: F1 */
    public final boolean mo136393F1(C41827h hVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, hVar);
        Parcel m0 = mo136325m0(8, H0);
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: M */
    public final boolean mo136394M() throws RemoteException {
        Parcel m0 = mo136325m0(7, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: Z5 */
    public final void mo136395Z5(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(10, H0);
    }

    /* renamed from: e */
    public final float mo136396e() throws RemoteException {
        Parcel m0 = mo136325m0(13, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: f */
    public final float mo136397f() throws RemoteException {
        Parcel m0 = mo136325m0(5, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: g5 */
    public final void mo136398g5(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(4, H0);
    }

    /* renamed from: h */
    public final String mo136399h() throws RemoteException {
        Parcel m0 = mo136325m0(3, mo136322H0());
        String readString = m0.readString();
        m0.recycle();
        return readString;
    }

    /* renamed from: j */
    public final void mo136400j() throws RemoteException {
        mo136323O0(2, mo136322H0());
    }

    /* renamed from: k */
    public final void mo136401k() throws RemoteException {
        mo136323O0(1, mo136322H0());
    }

    /* renamed from: l6 */
    public final void mo136402l6(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(12, H0);
    }

    /* renamed from: n0 */
    public final void mo136403n0(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(6, H0);
    }

    /* renamed from: o */
    public final int mo136404o() throws RemoteException {
        Parcel m0 = mo136325m0(9, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: u */
    public final boolean mo136405u() throws RemoteException {
        Parcel m0 = mo136325m0(11, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }
}
