package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.dynamic.C41016d;

/* renamed from: com.google.android.gms.maps.internal.i */
public interface C30491i extends IInterface {
    /* renamed from: T0 */
    void mo86172T0(C30481f1 f1Var) throws RemoteException;

    /* renamed from: a */
    void mo86173a() throws RemoteException;

    /* renamed from: b */
    void mo86174b() throws RemoteException;

    /* renamed from: c */
    void mo86175c() throws RemoteException;

    /* renamed from: g */
    void mo86176g() throws RemoteException;

    @C0359n0
    C41016d getView() throws RemoteException;

    /* renamed from: i */
    void mo86178i(@C0359n0 Bundle bundle) throws RemoteException;

    /* renamed from: m */
    void mo86179m(@C0359n0 Bundle bundle) throws RemoteException;

    void onLowMemory() throws RemoteException;

    /* renamed from: v */
    void mo86181v() throws RemoteException;

    @C0359n0
    /* renamed from: z0 */
    C30483g mo86182z0() throws RemoteException;
}
