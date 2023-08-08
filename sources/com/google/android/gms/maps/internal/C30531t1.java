package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.maps.C41813a;
import com.google.android.gms.internal.maps.C41814a0;
import com.google.android.gms.internal.maps.C41815b;
import com.google.android.gms.internal.maps.C41816b0;
import com.google.android.gms.internal.maps.C41819d;
import com.google.android.gms.internal.maps.C41821e;
import com.google.android.gms.internal.maps.C41825g;
import com.google.android.gms.internal.maps.C41826g0;
import com.google.android.gms.internal.maps.C41827h;
import com.google.android.gms.internal.maps.C41828h0;
import com.google.android.gms.internal.maps.C41832j0;
import com.google.android.gms.internal.maps.C41835m;
import com.google.android.gms.internal.maps.C41843u;
import com.google.android.gms.internal.maps.C41844v;
import com.google.android.gms.internal.maps.C41846x;
import com.google.android.gms.internal.maps.C41847y;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* renamed from: com.google.android.gms.maps.internal.t1 */
public final class C30531t1 extends C41813a implements C30463b {
    public C30531t1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* renamed from: A1 */
    public final C41844v mo86024A1(CircleOptions circleOptions) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, circleOptions);
        Parcel m0 = mo136325m0(35, H0);
        C41844v H02 = C41843u.m169499H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: A4 */
    public final void mo86025A4(C30462a2 a2Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, a2Var);
        mo136323O0(27, H0);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: A7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.C30495j mo86026A7() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 25
            android.os.Parcel r1 = r4.mo136322H0()
            android.os.Parcel r0 = r4.mo136325m0(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.C30495j
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.maps.internal.j r1 = (com.google.android.gms.maps.internal.C30495j) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.maps.internal.m1 r2 = new com.google.android.gms.maps.internal.m1
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.C30531t1.mo86026A7():com.google.android.gms.maps.internal.j");
    }

    /* renamed from: B5 */
    public final void mo86027B5(C30478e2 e2Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, e2Var);
        mo136323O0(98, H0);
    }

    /* renamed from: B8 */
    public final Location mo86028B8() throws RemoteException {
        Parcel m0 = mo136325m0(23, mo136322H0());
        Location location = (Location) C41835m.m169451a(m0, Location.CREATOR);
        m0.recycle();
        return location;
    }

    /* renamed from: C8 */
    public final void mo86029C8(C30460a0 a0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, a0Var);
        mo136323O0(42, H0);
    }

    /* renamed from: G */
    public final void mo86030G(Bundle bundle) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, bundle);
        mo136323O0(81, H0);
    }

    /* renamed from: H3 */
    public final void mo86031H3(C30484g0 g0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, g0Var);
        mo136323O0(30, H0);
    }

    /* renamed from: H6 */
    public final void mo86032H6(C30544y yVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, yVar);
        mo136323O0(28, H0);
    }

    /* renamed from: H7 */
    public final boolean mo86033H7() throws RemoteException {
        Parcel m0 = mo136325m0(40, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: I2 */
    public final C41847y mo86034I2(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, groundOverlayOptions);
        Parcel m0 = mo136325m0(12, H0);
        C41847y H02 = C41846x.m169549H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: K */
    public final void mo86035K(C30476e0 e0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, e0Var);
        mo136323O0(53, H0);
    }

    /* renamed from: L2 */
    public final void mo86036L2(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(93, H0);
    }

    /* renamed from: M3 */
    public final void mo86037M3(C30510m2 m2Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, m2Var);
        mo136323O0(83, H0);
    }

    /* renamed from: M6 */
    public final boolean mo86038M6() throws RemoteException {
        Parcel m0 = mo136325m0(17, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: N */
    public final void mo86039N() throws RemoteException {
        mo136323O0(82, mo136322H0());
    }

    /* renamed from: N2 */
    public final void mo86040N2(C30486g2 g2Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, g2Var);
        mo136323O0(97, H0);
    }

    /* renamed from: N7 */
    public final void mo86041N7(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(51, H0);
    }

    /* renamed from: O4 */
    public final C41828h0 mo86042O4(MarkerOptions markerOptions) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, markerOptions);
        Parcel m0 = mo136325m0(11, H0);
        C41828h0 H02 = C41826g0.m169373H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: R1 */
    public final boolean mo86043R1() throws RemoteException {
        Parcel m0 = mo136325m0(21, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: R5 */
    public final void mo86044R5(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeInt(i);
        H0.writeInt(i2);
        H0.writeInt(i3);
        H0.writeInt(i4);
        mo136323O0(39, H0);
    }

    /* renamed from: T1 */
    public final void mo86045T1(C30518p0 p0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, p0Var);
        mo136323O0(107, H0);
    }

    /* renamed from: T4 */
    public final void mo86046T4(String str) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeString(str);
        mo136323O0(61, H0);
    }

    /* renamed from: T5 */
    public final void mo86047T5(C30467c cVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, cVar);
        mo136323O0(24, H0);
    }

    /* renamed from: V1 */
    public final void mo86048V1(C30530t0 t0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, t0Var);
        mo136323O0(85, H0);
    }

    /* renamed from: V6 */
    public final void mo86049V6(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(18, H0);
    }

    /* renamed from: W1 */
    public final void mo86050W1(C30537v1 v1Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, v1Var);
        mo136323O0(33, H0);
    }

    /* renamed from: W5 */
    public final void mo86051W5(C30492i0 i0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, i0Var);
        mo136323O0(31, H0);
    }

    /* renamed from: X6 */
    public final void mo86052X6(float f) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeFloat(f);
        mo136323O0(92, H0);
    }

    /* renamed from: Y2 */
    public final void mo86053Y2(int i) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeInt(i);
        mo136323O0(16, H0);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Y3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.C30479f mo86054Y3() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 26
            android.os.Parcel r1 = r4.mo136322H0()
            android.os.Parcel r0 = r4.mo136325m0(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IProjectionDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.C30479f
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.maps.internal.f r1 = (com.google.android.gms.maps.internal.C30479f) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.maps.internal.g1 r2 = new com.google.android.gms.maps.internal.g1
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.C30531t1.mo86054Y3():com.google.android.gms.maps.internal.f");
    }

    /* renamed from: Z3 */
    public final void mo86055Z3(C30508m0 m0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, m0Var);
        mo136323O0(36, H0);
    }

    /* renamed from: a */
    public final void mo86056a() throws RemoteException {
        mo136323O0(102, mo136322H0());
    }

    /* renamed from: a5 */
    public final void mo86057a5(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(41, H0);
    }

    /* renamed from: b */
    public final void mo86058b() throws RemoteException {
        mo136323O0(101, mo136322H0());
    }

    /* renamed from: b8 */
    public final C41821e mo86059b8(PolylineOptions polylineOptions) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, polylineOptions);
        Parcel m0 = mo136325m0(9, H0);
        C41821e H02 = C41819d.m169294H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: c */
    public final void mo86060c() throws RemoteException {
        mo136323O0(57, mo136322H0());
    }

    /* renamed from: c3 */
    public final boolean mo86061c3() throws RemoteException {
        Parcel m0 = mo136325m0(19, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: c8 */
    public final void mo86062c8(C30468c0 c0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, c0Var);
        mo136323O0(29, H0);
    }

    public final void clear() throws RemoteException {
        mo136323O0(14, mo136322H0());
    }

    /* renamed from: d3 */
    public final void mo86064d3(C30524r0 r0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, r0Var);
        mo136323O0(80, H0);
    }

    /* renamed from: d5 */
    public final float mo86065d5() throws RemoteException {
        Parcel m0 = mo136325m0(3, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }

    /* renamed from: f1 */
    public final void mo86066f1(C30520q qVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, qVar);
        mo136323O0(32, H0);
    }

    /* renamed from: f7 */
    public final void mo86067f7(C30502k2 k2Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, k2Var);
        mo136323O0(89, H0);
    }

    /* renamed from: f8 */
    public final void mo86068f8(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        mo136323O0(22, H0);
    }

    /* renamed from: g */
    public final void mo86069g() throws RemoteException {
        mo136323O0(55, mo136322H0());
    }

    /* renamed from: g2 */
    public final CameraPosition mo86070g2() throws RemoteException {
        Parcel m0 = mo136325m0(1, mo136322H0());
        CameraPosition cameraPosition = (CameraPosition) C41835m.m169451a(m0, CameraPosition.CREATOR);
        m0.recycle();
        return cameraPosition;
    }

    /* renamed from: h1 */
    public final void mo86071h1(C30493i1 i1Var, C41016d dVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, i1Var);
        C41835m.m169456f(H0, dVar);
        mo136323O0(38, H0);
    }

    /* renamed from: h5 */
    public final void mo86072h5(C41016d dVar, C30522q1 q1Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        C41835m.m169456f(H0, q1Var);
        mo136323O0(6, H0);
    }

    /* renamed from: h6 */
    public final void mo86073h6(C30470c2 c2Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, c2Var);
        mo136323O0(99, H0);
    }

    /* renamed from: h8 */
    public final boolean mo86074h8() throws RemoteException {
        Parcel m0 = mo136325m0(59, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: i */
    public final void mo86075i(Bundle bundle) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, bundle);
        mo136323O0(54, H0);
    }

    /* renamed from: i3 */
    public final C41815b mo86076i3(PolygonOptions polygonOptions) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, polygonOptions);
        Parcel m0 = mo136325m0(10, H0);
        C41815b H02 = C41832j0.m169448H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: i6 */
    public final void mo86077i6(C41016d dVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        mo136323O0(4, H0);
    }

    /* renamed from: k1 */
    public final void mo86078k1(C30493i1 i1Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, i1Var);
        mo136323O0(71, H0);
    }

    /* renamed from: k8 */
    public final void mo86079k8(C30536v0 v0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, v0Var);
        mo136323O0(87, H0);
    }

    /* renamed from: l4 */
    public final void mo86080l4(C41016d dVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        mo136323O0(5, H0);
    }

    /* renamed from: m */
    public final void mo86081m(Bundle bundle) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, bundle);
        Parcel m0 = mo136325m0(60, H0);
        if (m0.readInt() != 0) {
            bundle.readFromParcel(m0);
        }
        m0.recycle();
    }

    /* renamed from: m7 */
    public final void mo86082m7() throws RemoteException {
        mo136323O0(94, mo136322H0());
    }

    /* renamed from: o3 */
    public final void mo86083o3(C30532u uVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, uVar);
        mo136323O0(84, H0);
    }

    public final void onLowMemory() throws RemoteException {
        mo136323O0(58, mo136322H0());
    }

    /* renamed from: q2 */
    public final void mo86085q2(C30494i2 i2Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, i2Var);
        mo136323O0(96, H0);
    }

    /* renamed from: r4 */
    public final void mo86086r4() throws RemoteException {
        mo136323O0(8, mo136322H0());
    }

    /* renamed from: s1 */
    public final void mo86087s1(C30526s sVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, sVar);
        mo136323O0(86, H0);
    }

    /* renamed from: s5 */
    public final int mo86088s5() throws RemoteException {
        Parcel m0 = mo136325m0(15, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: t6 */
    public final boolean mo86089t6(MapStyleOptions mapStyleOptions) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, mapStyleOptions);
        Parcel m0 = mo136325m0(91, H0);
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: t8 */
    public final C41827h mo86090t8(TileOverlayOptions tileOverlayOptions) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, tileOverlayOptions);
        Parcel m0 = mo136325m0(13, H0);
        C41827h H02 = C41825g.m169372H0(m0.readStrongBinder());
        m0.recycle();
        return H02;
    }

    /* renamed from: u8 */
    public final C41816b0 mo86091u8() throws RemoteException {
        Parcel m0 = mo136325m0(44, mo136322H0());
        C41816b0 H0 = C41814a0.m169226H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: v */
    public final void mo86092v() throws RemoteException {
        mo136323O0(56, mo136322H0());
    }

    /* renamed from: v5 */
    public final boolean mo86093v5(boolean z) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169453c(H0, z);
        Parcel m0 = mo136325m0(20, H0);
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: v6 */
    public final void mo86094v6(C41016d dVar, int i, C30522q1 q1Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, dVar);
        H0.writeInt(i);
        C41835m.m169456f(H0, q1Var);
        mo136323O0(7, H0);
    }

    /* renamed from: w1 */
    public final void mo86095w1(LatLngBounds latLngBounds) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, latLngBounds);
        mo136323O0(95, H0);
    }

    /* renamed from: x1 */
    public final void mo86096x1(C30514o oVar) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, oVar);
        mo136323O0(45, H0);
    }

    /* renamed from: y1 */
    public final void mo86097y1(C30500k0 k0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, k0Var);
        mo136323O0(37, H0);
    }

    /* renamed from: z4 */
    public final float mo86098z4() throws RemoteException {
        Parcel m0 = mo136325m0(2, mo136322H0());
        float readFloat = m0.readFloat();
        m0.recycle();
        return readFloat;
    }
}
