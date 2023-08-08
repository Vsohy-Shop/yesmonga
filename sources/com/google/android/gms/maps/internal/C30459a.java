package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.google.android.gms.maps.internal.a */
public interface C30459a extends IInterface {
    @C0359n0
    /* renamed from: E4 */
    C41016d mo86011E4(@C0359n0 LatLng latLng, float f) throws RemoteException;

    @C0359n0
    /* renamed from: F4 */
    C41016d mo86012F4(float f, float f2) throws RemoteException;

    @C0359n0
    /* renamed from: P7 */
    C41016d mo86013P7() throws RemoteException;

    @C0359n0
    /* renamed from: U6 */
    C41016d mo86014U6(float f, int i, int i2) throws RemoteException;

    @C0359n0
    /* renamed from: X0 */
    C41016d mo86015X0(@C0359n0 LatLngBounds latLngBounds, int i) throws RemoteException;

    @C0359n0
    /* renamed from: Y5 */
    C41016d mo86016Y5(@C0359n0 LatLng latLng) throws RemoteException;

    @C0359n0
    /* renamed from: c1 */
    C41016d mo86017c1(float f) throws RemoteException;

    @C0359n0
    /* renamed from: n2 */
    C41016d mo86018n2() throws RemoteException;

    @C0359n0
    /* renamed from: r3 */
    C41016d mo86019r3(@C0359n0 LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException;

    @C0359n0
    /* renamed from: u4 */
    C41016d mo86020u4(float f) throws RemoteException;

    @C0359n0
    /* renamed from: y3 */
    C41016d mo86021y3(@C0359n0 CameraPosition cameraPosition) throws RemoteException;
}
