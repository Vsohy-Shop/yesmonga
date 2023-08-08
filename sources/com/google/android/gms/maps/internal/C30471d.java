package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.maps.GoogleMapOptions;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.maps.internal.d */
public interface C30471d extends IInterface {
    @C0359n0
    /* renamed from: A */
    C30463b mo86102A() throws RemoteException;

    /* renamed from: G */
    void mo86103G(@C0359n0 Bundle bundle) throws RemoteException;

    /* renamed from: K */
    void mo86104K(C30476e0 e0Var) throws RemoteException;

    /* renamed from: L */
    void mo86105L() throws RemoteException;

    /* renamed from: N */
    void mo86106N() throws RemoteException;

    /* renamed from: a */
    void mo86107a() throws RemoteException;

    /* renamed from: b */
    void mo86108b() throws RemoteException;

    /* renamed from: c */
    void mo86109c() throws RemoteException;

    /* renamed from: g */
    void mo86110g() throws RemoteException;

    /* renamed from: i */
    void mo86111i(@C0359n0 Bundle bundle) throws RemoteException;

    /* renamed from: m */
    void mo86112m(@C0359n0 Bundle bundle) throws RemoteException;

    void onLowMemory() throws RemoteException;

    /* renamed from: q6 */
    void mo86114q6(@C0359n0 C41016d dVar, @Nullable GoogleMapOptions googleMapOptions, @C0359n0 Bundle bundle) throws RemoteException;

    /* renamed from: v */
    void mo86115v() throws RemoteException;

    /* renamed from: x0 */
    boolean mo86116x0() throws RemoteException;

    @C0359n0
    /* renamed from: y0 */
    C41016d mo86117y0(@C0359n0 C41016d dVar, @C0359n0 C41016d dVar2, @C0359n0 Bundle bundle) throws RemoteException;
}
