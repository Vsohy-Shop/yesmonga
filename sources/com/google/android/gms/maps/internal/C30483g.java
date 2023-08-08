package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.maps.internal.g */
public interface C30483g extends IInterface {
    /* renamed from: C2 */
    void mo86135C2(@C0359n0 LatLng latLng, int i, @Nullable StreetViewSource streetViewSource) throws RemoteException;

    /* renamed from: C3 */
    void mo86136C3(@C0359n0 LatLng latLng, int i) throws RemoteException;

    /* renamed from: C5 */
    void mo86137C5(boolean z) throws RemoteException;

    /* renamed from: D1 */
    boolean mo86138D1() throws RemoteException;

    @C0363p0
    /* renamed from: D4 */
    C41016d mo86139D4(@C0359n0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException;

    /* renamed from: E1 */
    void mo86140E1(@C0359n0 LatLng latLng) throws RemoteException;

    /* renamed from: G1 */
    void mo86141G1(@C0359n0 String str) throws RemoteException;

    @C0359n0
    /* renamed from: J7 */
    StreetViewPanoramaOrientation mo86142J7(@C0359n0 C41016d dVar) throws RemoteException;

    /* renamed from: M1 */
    void mo86143M1(@C0359n0 LatLng latLng, @Nullable StreetViewSource streetViewSource) throws RemoteException;

    /* renamed from: N3 */
    void mo86144N3(boolean z) throws RemoteException;

    /* renamed from: S4 */
    void mo86145S4(@Nullable C30548z0 z0Var) throws RemoteException;

    /* renamed from: U2 */
    void mo86146U2(@Nullable C30542x0 x0Var) throws RemoteException;

    /* renamed from: X4 */
    boolean mo86147X4() throws RemoteException;

    @C0359n0
    /* renamed from: c2 */
    StreetViewPanoramaLocation mo86148c2() throws RemoteException;

    /* renamed from: g7 */
    void mo86149g7(@C0359n0 StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws RemoteException;

    /* renamed from: j5 */
    boolean mo86150j5() throws RemoteException;

    @C0359n0
    /* renamed from: k4 */
    StreetViewPanoramaCamera mo86151k4() throws RemoteException;

    /* renamed from: p6 */
    void mo86152p6(boolean z) throws RemoteException;

    /* renamed from: t2 */
    void mo86153t2(@Nullable C30473d1 d1Var) throws RemoteException;

    /* renamed from: u0 */
    boolean mo86154u0() throws RemoteException;

    /* renamed from: w7 */
    void mo86155w7(boolean z) throws RemoteException;

    /* renamed from: x6 */
    void mo86156x6(@Nullable C30465b1 b1Var) throws RemoteException;
}
