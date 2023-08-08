package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.internal.maps.f0 */
public final class C41824f0 extends C41813a implements C41828h0 {
    public C41824f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    /* renamed from: A0 */
    public final void mo136406A0(C41016d dVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        mo136323O0(29, H0);
    }

    /* renamed from: A2 */
    public final void mo136407A2(float f, float f2) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        H0.writeFloat(f2);
        mo136323O0(24, H0);
    }

    /* renamed from: I */
    public final void mo136408I(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(27, H0);
    }

    /* renamed from: J0 */
    public final void mo136409J0(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(20, H0);
    }

    /* renamed from: J4 */
    public final void mo136410J4(LatLng latLng) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLng);
        mo136323O0(3, H0);
    }

    /* renamed from: N0 */
    public final void mo136411N0(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(25, H0);
    }

    /* renamed from: P */
    public final void mo136412P() throws RemoteException {
        mo136323O0(11, mo136322H0());
    }

    /* renamed from: S */
    public final boolean mo136413S() throws RemoteException {
        Parcel m0 = mo136325m0(13, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: W6 */
    public final boolean mo136414W6(C41828h0 h0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, h0Var);
        Parcel m0 = mo136325m0(16, H0);
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: X */
    public final boolean mo136415X() throws RemoteException {
        Parcel m0 = mo136325m0(15, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: c0 */
    public final void mo136416c0(C41016d dVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        mo136323O0(18, H0);
    }

    /* renamed from: e */
    public final float mo136417e() throws RemoteException {
        Parcel m0 = mo136325m0(26, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: f */
    public final float mo136418f() throws RemoteException {
        Parcel m0 = mo136325m0(23, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: f0 */
    public final void mo136419f0(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(14, H0);
    }

    /* renamed from: h */
    public final int mo136420h() throws RemoteException {
        Parcel m0 = mo136325m0(17, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: j */
    public final C41016d mo136421j() throws RemoteException {
        Parcel m0 = mo136325m0(30, mo136322H0());
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: k */
    public final LatLng mo136422k() throws RemoteException {
        Parcel m0 = mo136325m0(4, mo136322H0());
        LatLng latLng = (LatLng) C41835m.m169451a(m0, LatLng.CREATOR);
        m0.recycle();
        return latLng;
    }

    /* renamed from: n8 */
    public final void mo136423n8(float f, float f2) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        H0.writeFloat(f2);
        mo136323O0(19, H0);
    }

    /* renamed from: o */
    public final float mo136424o() throws RemoteException {
        Parcel m0 = mo136325m0(28, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: p */
    public final String mo136425p() throws RemoteException {
        Parcel m0 = mo136325m0(2, mo136322H0());
        String readString = m0.readString();
        m0.recycle();
        return readString;
    }

    /* renamed from: q */
    public final String mo136426q() throws RemoteException {
        Parcel m0 = mo136325m0(6, mo136322H0());
        String readString = m0.readString();
        m0.recycle();
        return readString;
    }

    /* renamed from: r */
    public final void mo136427r() throws RemoteException {
        mo136323O0(12, mo136322H0());
    }

    /* renamed from: s */
    public final void mo136428s() throws RemoteException {
        mo136323O0(1, mo136322H0());
    }

    /* renamed from: t */
    public final String mo136429t() throws RemoteException {
        Parcel m0 = mo136325m0(8, mo136322H0());
        String readString = m0.readString();
        m0.recycle();
        return readString;
    }

    /* renamed from: t7 */
    public final void mo136430t7(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(9, H0);
    }

    /* renamed from: v1 */
    public final void mo136431v1(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(22, H0);
    }

    /* renamed from: v7 */
    public final void mo136432v7(String str) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeString(str);
        mo136323O0(5, H0);
    }

    /* renamed from: w */
    public final boolean mo136433w() throws RemoteException {
        Parcel m0 = mo136325m0(10, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: w6 */
    public final void mo136434w6(String str) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeString(str);
        mo136323O0(7, H0);
    }

    /* renamed from: x */
    public final boolean mo136435x() throws RemoteException {
        Parcel m0 = mo136325m0(21, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }
}
