package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.maps.C41815b;
import com.google.android.gms.internal.maps.C41816b0;
import com.google.android.gms.internal.maps.C41821e;
import com.google.android.gms.internal.maps.C41827h;
import com.google.android.gms.internal.maps.C41828h0;
import com.google.android.gms.internal.maps.C41844v;
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
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.maps.internal.b */
public interface C30463b extends IInterface {
    /* renamed from: A1 */
    C41844v mo86024A1(CircleOptions circleOptions) throws RemoteException;

    /* renamed from: A4 */
    void mo86025A4(@Nullable C30462a2 a2Var) throws RemoteException;

    @C0359n0
    /* renamed from: A7 */
    C30495j mo86026A7() throws RemoteException;

    /* renamed from: B5 */
    void mo86027B5(@Nullable C30478e2 e2Var) throws RemoteException;

    @C0359n0
    /* renamed from: B8 */
    Location mo86028B8() throws RemoteException;

    /* renamed from: C8 */
    void mo86029C8(@Nullable C30460a0 a0Var) throws RemoteException;

    /* renamed from: G */
    void mo86030G(@C0359n0 Bundle bundle) throws RemoteException;

    /* renamed from: H3 */
    void mo86031H3(@Nullable C30484g0 g0Var) throws RemoteException;

    /* renamed from: H6 */
    void mo86032H6(@Nullable C30544y yVar) throws RemoteException;

    /* renamed from: H7 */
    boolean mo86033H7() throws RemoteException;

    /* renamed from: I2 */
    C41847y mo86034I2(GroundOverlayOptions groundOverlayOptions) throws RemoteException;

    /* renamed from: K */
    void mo86035K(C30476e0 e0Var) throws RemoteException;

    /* renamed from: L2 */
    void mo86036L2(float f) throws RemoteException;

    /* renamed from: M3 */
    void mo86037M3(@Nullable C30510m2 m2Var) throws RemoteException;

    /* renamed from: M6 */
    boolean mo86038M6() throws RemoteException;

    /* renamed from: N */
    void mo86039N() throws RemoteException;

    /* renamed from: N2 */
    void mo86040N2(@Nullable C30486g2 g2Var) throws RemoteException;

    /* renamed from: N7 */
    void mo86041N7(boolean z) throws RemoteException;

    /* renamed from: O4 */
    C41828h0 mo86042O4(MarkerOptions markerOptions) throws RemoteException;

    /* renamed from: R1 */
    boolean mo86043R1() throws RemoteException;

    /* renamed from: R5 */
    void mo86044R5(int i, int i2, int i3, int i4) throws RemoteException;

    /* renamed from: T1 */
    void mo86045T1(@Nullable C30518p0 p0Var) throws RemoteException;

    /* renamed from: T4 */
    void mo86046T4(@Nullable String str) throws RemoteException;

    /* renamed from: T5 */
    void mo86047T5(@Nullable C30467c cVar) throws RemoteException;

    /* renamed from: V1 */
    void mo86048V1(@Nullable C30530t0 t0Var) throws RemoteException;

    /* renamed from: V6 */
    void mo86049V6(boolean z) throws RemoteException;

    /* renamed from: W1 */
    void mo86050W1(@Nullable C30537v1 v1Var) throws RemoteException;

    /* renamed from: W5 */
    void mo86051W5(@Nullable C30492i0 i0Var) throws RemoteException;

    /* renamed from: X6 */
    void mo86052X6(float f) throws RemoteException;

    /* renamed from: Y2 */
    void mo86053Y2(int i) throws RemoteException;

    @C0359n0
    /* renamed from: Y3 */
    C30479f mo86054Y3() throws RemoteException;

    /* renamed from: Z3 */
    void mo86055Z3(@Nullable C30508m0 m0Var) throws RemoteException;

    /* renamed from: a */
    void mo86056a() throws RemoteException;

    /* renamed from: a5 */
    void mo86057a5(boolean z) throws RemoteException;

    /* renamed from: b */
    void mo86058b() throws RemoteException;

    /* renamed from: b8 */
    C41821e mo86059b8(PolylineOptions polylineOptions) throws RemoteException;

    /* renamed from: c */
    void mo86060c() throws RemoteException;

    /* renamed from: c3 */
    boolean mo86061c3() throws RemoteException;

    /* renamed from: c8 */
    void mo86062c8(@Nullable C30468c0 c0Var) throws RemoteException;

    void clear() throws RemoteException;

    /* renamed from: d3 */
    void mo86064d3(@Nullable C30524r0 r0Var) throws RemoteException;

    /* renamed from: d5 */
    float mo86065d5() throws RemoteException;

    /* renamed from: f1 */
    void mo86066f1(@Nullable C30520q qVar) throws RemoteException;

    /* renamed from: f7 */
    void mo86067f7(@Nullable C30502k2 k2Var) throws RemoteException;

    /* renamed from: f8 */
    void mo86068f8(boolean z) throws RemoteException;

    /* renamed from: g */
    void mo86069g() throws RemoteException;

    @C0359n0
    /* renamed from: g2 */
    CameraPosition mo86070g2() throws RemoteException;

    /* renamed from: h1 */
    void mo86071h1(C30493i1 i1Var, @Nullable C41016d dVar) throws RemoteException;

    /* renamed from: h5 */
    void mo86072h5(C41016d dVar, @Nullable C30522q1 q1Var) throws RemoteException;

    /* renamed from: h6 */
    void mo86073h6(@Nullable C30470c2 c2Var) throws RemoteException;

    /* renamed from: h8 */
    boolean mo86074h8() throws RemoteException;

    /* renamed from: i */
    void mo86075i(@C0359n0 Bundle bundle) throws RemoteException;

    /* renamed from: i3 */
    C41815b mo86076i3(PolygonOptions polygonOptions) throws RemoteException;

    /* renamed from: i6 */
    void mo86077i6(@C0359n0 C41016d dVar) throws RemoteException;

    /* renamed from: k1 */
    void mo86078k1(C30493i1 i1Var) throws RemoteException;

    /* renamed from: k8 */
    void mo86079k8(@Nullable C30536v0 v0Var) throws RemoteException;

    /* renamed from: l4 */
    void mo86080l4(@C0359n0 C41016d dVar) throws RemoteException;

    /* renamed from: m */
    void mo86081m(@C0359n0 Bundle bundle) throws RemoteException;

    /* renamed from: m7 */
    void mo86082m7() throws RemoteException;

    /* renamed from: o3 */
    void mo86083o3(@Nullable C30532u uVar) throws RemoteException;

    void onLowMemory() throws RemoteException;

    /* renamed from: q2 */
    void mo86085q2(@Nullable C30494i2 i2Var) throws RemoteException;

    /* renamed from: r4 */
    void mo86086r4() throws RemoteException;

    /* renamed from: s1 */
    void mo86087s1(@Nullable C30526s sVar) throws RemoteException;

    /* renamed from: s5 */
    int mo86088s5() throws RemoteException;

    /* renamed from: t6 */
    boolean mo86089t6(@Nullable MapStyleOptions mapStyleOptions) throws RemoteException;

    /* renamed from: t8 */
    C41827h mo86090t8(TileOverlayOptions tileOverlayOptions) throws RemoteException;

    /* renamed from: u8 */
    C41816b0 mo86091u8() throws RemoteException;

    /* renamed from: v */
    void mo86092v() throws RemoteException;

    /* renamed from: v5 */
    boolean mo86093v5(boolean z) throws RemoteException;

    /* renamed from: v6 */
    void mo86094v6(C41016d dVar, int i, @Nullable C30522q1 q1Var) throws RemoteException;

    /* renamed from: w1 */
    void mo86095w1(@Nullable LatLngBounds latLngBounds) throws RemoteException;

    /* renamed from: x1 */
    void mo86096x1(@Nullable C30514o oVar) throws RemoteException;

    /* renamed from: y1 */
    void mo86097y1(@Nullable C30500k0 k0Var) throws RemoteException;

    /* renamed from: z4 */
    float mo86098z4() throws RemoteException;
}
