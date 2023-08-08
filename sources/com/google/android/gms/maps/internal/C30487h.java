package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.maps.internal.h */
public interface C30487h extends IInterface {
    /* renamed from: L */
    void mo86158L() throws RemoteException;

    /* renamed from: P6 */
    void mo86159P6(@C0359n0 C41016d dVar, @Nullable StreetViewPanoramaOptions streetViewPanoramaOptions, @Nullable Bundle bundle) throws RemoteException;

    /* renamed from: T0 */
    void mo86160T0(C30481f1 f1Var) throws RemoteException;

    /* renamed from: a */
    void mo86161a() throws RemoteException;

    /* renamed from: b */
    void mo86162b() throws RemoteException;

    /* renamed from: c */
    void mo86163c() throws RemoteException;

    /* renamed from: g */
    void mo86164g() throws RemoteException;

    /* renamed from: i */
    void mo86165i(@C0359n0 Bundle bundle) throws RemoteException;

    /* renamed from: m */
    void mo86166m(@C0359n0 Bundle bundle) throws RemoteException;

    void onLowMemory() throws RemoteException;

    /* renamed from: v */
    void mo86168v() throws RemoteException;

    /* renamed from: x0 */
    boolean mo86169x0() throws RemoteException;

    @C0359n0
    /* renamed from: y0 */
    C41016d mo86170y0(@C0359n0 C41016d dVar, @C0359n0 C41016d dVar2, @C0359n0 Bundle bundle) throws RemoteException;

    @C0359n0
    /* renamed from: z0 */
    C30483g mo86171z0() throws RemoteException;
}
