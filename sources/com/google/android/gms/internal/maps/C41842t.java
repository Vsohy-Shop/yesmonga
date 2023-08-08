package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.maps.t */
public final class C41842t extends C41813a implements C41844v {
    public C41842t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    /* renamed from: D */
    public final boolean mo136445D() throws RemoteException {
        Parcel m0 = mo136325m0(16, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: F */
    public final boolean mo136446F() throws RemoteException {
        Parcel m0 = mo136325m0(20, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: J2 */
    public final boolean mo136447J2(C41844v vVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, vVar);
        Parcel m0 = mo136325m0(17, H0);
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: O */
    public final void mo136448O(int i) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeInt(i);
        mo136323O0(11, H0);
    }

    /* renamed from: R2 */
    public final void mo136449R2(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(7, H0);
    }

    /* renamed from: V5 */
    public final void mo136450V5(LatLng latLng) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLng);
        mo136323O0(3, H0);
    }

    /* renamed from: e */
    public final double mo136451e() throws RemoteException {
        Parcel m0 = mo136325m0(6, mo136322H0());
        double readDouble = m0.readDouble();
        m0.recycle();
        return readDouble;
    }

    /* renamed from: e0 */
    public final void mo136452e0(List<PatternItem> list) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeTypedList(list);
        mo136323O0(21, H0);
    }

    /* renamed from: f */
    public final float mo136453f() throws RemoteException {
        Parcel m0 = mo136325m0(8, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: f2 */
    public final void mo136454f2(int i) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeInt(i);
        mo136323O0(9, H0);
    }

    /* renamed from: h */
    public final int mo136455h() throws RemoteException {
        Parcel m0 = mo136325m0(12, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: j */
    public final int mo136456j() throws RemoteException {
        Parcel m0 = mo136325m0(10, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: j0 */
    public final void mo136457j0(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(13, H0);
    }

    /* renamed from: k */
    public final int mo136458k() throws RemoteException {
        Parcel m0 = mo136325m0(18, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: n */
    public final void mo136459n(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(19, H0);
    }

    /* renamed from: o */
    public final float mo136460o() throws RemoteException {
        Parcel m0 = mo136325m0(14, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: p */
    public final C41016d mo136461p() throws RemoteException {
        Parcel m0 = mo136325m0(24, mo136322H0());
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: p4 */
    public final void mo136462p4(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(15, H0);
    }

    /* renamed from: q */
    public final String mo136463q() throws RemoteException {
        Parcel m0 = mo136325m0(2, mo136322H0());
        String readString = m0.readString();
        m0.recycle();
        return readString;
    }

    /* renamed from: q0 */
    public final void mo136464q0(C41016d dVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        mo136323O0(23, H0);
    }

    /* renamed from: r */
    public final List<PatternItem> mo136465r() throws RemoteException {
        Parcel m0 = mo136325m0(22, mo136322H0());
        ArrayList<PatternItem> createTypedArrayList = m0.createTypedArrayList(PatternItem.CREATOR);
        m0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: s */
    public final void mo136466s() throws RemoteException {
        mo136323O0(1, mo136322H0());
    }

    /* renamed from: t */
    public final LatLng mo136467t() throws RemoteException {
        Parcel m0 = mo136325m0(4, mo136322H0());
        LatLng latLng = (LatLng) C41835m.m169451a(m0, LatLng.CREATOR);
        m0.recycle();
        return latLng;
    }

    /* renamed from: z7 */
    public final void mo136468z7(double d) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeDouble(d);
        mo136323O0(5, H0);
    }
}
