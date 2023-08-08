package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.maps.i0 */
public final class C41830i0 extends C41813a implements C41815b {
    public C41830i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    /* renamed from: I */
    public final void mo136326I(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(13, H0);
    }

    /* renamed from: J0 */
    public final void mo136327J0(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(17, H0);
    }

    /* renamed from: N1 */
    public final void mo136328N1(List<PatternItem> list) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeTypedList(list);
        mo136323O0(25, H0);
    }

    /* renamed from: O */
    public final void mo136329O(int i) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeInt(i);
        mo136323O0(11, H0);
    }

    /* renamed from: S2 */
    public final void mo136330S2(int i) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeInt(i);
        mo136323O0(9, H0);
    }

    /* renamed from: Y0 */
    public final boolean mo136331Y0(C41815b bVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, bVar);
        Parcel m0 = mo136325m0(19, H0);
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: b4 */
    public final void mo136332b4(List list) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeList(list);
        mo136323O0(5, H0);
    }

    /* renamed from: e */
    public final float mo136333e() throws RemoteException {
        Parcel m0 = mo136325m0(8, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: e0 */
    public final void mo136334e0(List<LatLng> list) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeTypedList(list);
        mo136323O0(3, H0);
    }

    /* renamed from: f */
    public final float mo136335f() throws RemoteException {
        Parcel m0 = mo136325m0(14, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: f0 */
    public final void mo136336f0(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(15, H0);
    }

    /* renamed from: h */
    public final int mo136337h() throws RemoteException {
        Parcel m0 = mo136325m0(10, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: j */
    public final int mo136338j() throws RemoteException {
        Parcel m0 = mo136325m0(24, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: j0 */
    public final void mo136339j0(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(7, H0);
    }

    /* renamed from: k */
    public final int mo136340k() throws RemoteException {
        Parcel m0 = mo136325m0(20, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: m1 */
    public final void mo136341m1(int i) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeInt(i);
        mo136323O0(23, H0);
    }

    /* renamed from: n */
    public final void mo136342n(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(21, H0);
    }

    /* renamed from: o */
    public final int mo136343o() throws RemoteException {
        Parcel m0 = mo136325m0(12, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: o6 */
    public final void mo136344o6(C41016d dVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        mo136323O0(27, H0);
    }

    /* renamed from: p */
    public final C41016d mo136345p() throws RemoteException {
        Parcel m0 = mo136325m0(28, mo136322H0());
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: q */
    public final List mo136346q() throws RemoteException {
        Parcel m0 = mo136325m0(6, mo136322H0());
        ArrayList b = C41835m.m169452b(m0);
        m0.recycle();
        return b;
    }

    /* renamed from: r */
    public final List<LatLng> mo136347r() throws RemoteException {
        Parcel m0 = mo136325m0(4, mo136322H0());
        ArrayList<LatLng> createTypedArrayList = m0.createTypedArrayList(LatLng.CREATOR);
        m0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: s */
    public final List<PatternItem> mo136348s() throws RemoteException {
        Parcel m0 = mo136325m0(26, mo136322H0());
        ArrayList<PatternItem> createTypedArrayList = m0.createTypedArrayList(PatternItem.CREATOR);
        m0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: t */
    public final String mo136349t() throws RemoteException {
        Parcel m0 = mo136325m0(2, mo136322H0());
        String readString = m0.readString();
        m0.recycle();
        return readString;
    }

    /* renamed from: u */
    public final void mo136350u() throws RemoteException {
        mo136323O0(1, mo136322H0());
    }

    /* renamed from: w */
    public final boolean mo136351w() throws RemoteException {
        Parcel m0 = mo136325m0(18, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: x */
    public final boolean mo136352x() throws RemoteException {
        Parcel m0 = mo136325m0(16, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: y */
    public final boolean mo136353y() throws RemoteException {
        Parcel m0 = mo136325m0(22, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }
}
