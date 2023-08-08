package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.maps.c */
public final class C41817c extends C41813a implements C41821e {
    public C41817c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    /* renamed from: A0 */
    public final void mo136360A0(C41016d dVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        mo136323O0(27, H0);
    }

    /* renamed from: G2 */
    public final void mo136361G2(Cap cap) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, cap);
        mo136323O0(21, H0);
    }

    /* renamed from: H2 */
    public final void mo136362H2(int i) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeInt(i);
        mo136323O0(23, H0);
    }

    /* renamed from: I */
    public final void mo136363I(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(9, H0);
    }

    /* renamed from: L7 */
    public final boolean mo136364L7(C41821e eVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, eVar);
        Parcel m0 = mo136325m0(15, H0);
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: O */
    public final void mo136365O(int i) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeInt(i);
        mo136323O0(7, H0);
    }

    /* renamed from: P4 */
    public final void mo136366P4(List<PatternItem> list) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeTypedList(list);
        mo136323O0(25, H0);
    }

    /* renamed from: Z2 */
    public final void mo136367Z2(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(11, H0);
    }

    /* renamed from: e */
    public final float mo136368e() throws RemoteException {
        Parcel m0 = mo136325m0(6, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: f */
    public final float mo136369f() throws RemoteException {
        Parcel m0 = mo136325m0(10, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: h */
    public final int mo136370h() throws RemoteException {
        Parcel m0 = mo136325m0(24, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: j */
    public final int mo136371j() throws RemoteException {
        Parcel m0 = mo136325m0(16, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: k */
    public final C41016d mo136372k() throws RemoteException {
        Parcel m0 = mo136325m0(28, mo136322H0());
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: n */
    public final void mo136373n(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(17, H0);
    }

    /* renamed from: o */
    public final int mo136374o() throws RemoteException {
        Parcel m0 = mo136325m0(8, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: p */
    public final Cap mo136375p() throws RemoteException {
        Parcel m0 = mo136325m0(22, mo136322H0());
        Cap cap = (Cap) C41835m.m169451a(m0, Cap.CREATOR);
        m0.recycle();
        return cap;
    }

    /* renamed from: p2 */
    public final void mo136376p2(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(13, H0);
    }

    /* renamed from: q */
    public final String mo136377q() throws RemoteException {
        Parcel m0 = mo136325m0(2, mo136322H0());
        String readString = m0.readString();
        m0.recycle();
        return readString;
    }

    /* renamed from: r */
    public final List<PatternItem> mo136378r() throws RemoteException {
        Parcel m0 = mo136325m0(26, mo136322H0());
        ArrayList<PatternItem> createTypedArrayList = m0.createTypedArrayList(PatternItem.CREATOR);
        m0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: s */
    public final List<LatLng> mo136379s() throws RemoteException {
        Parcel m0 = mo136325m0(4, mo136322H0());
        ArrayList<LatLng> createTypedArrayList = m0.createTypedArrayList(LatLng.CREATOR);
        m0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: t */
    public final Cap mo136380t() throws RemoteException {
        Parcel m0 = mo136325m0(20, mo136322H0());
        Cap cap = (Cap) C41835m.m169451a(m0, Cap.CREATOR);
        m0.recycle();
        return cap;
    }

    /* renamed from: t3 */
    public final void mo136381t3(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(5, H0);
    }

    /* renamed from: t4 */
    public final void mo136382t4(List<LatLng> list) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeTypedList(list);
        mo136323O0(3, H0);
    }

    /* renamed from: u */
    public final void mo136383u() throws RemoteException {
        mo136323O0(1, mo136322H0());
    }

    /* renamed from: w */
    public final boolean mo136384w() throws RemoteException {
        Parcel m0 = mo136325m0(14, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: x */
    public final boolean mo136385x() throws RemoteException {
        Parcel m0 = mo136325m0(12, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: y */
    public final boolean mo136386y() throws RemoteException {
        Parcel m0 = mo136325m0(18, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: y7 */
    public final void mo136387y7(Cap cap) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, cap);
        mo136323O0(19, H0);
    }
}
