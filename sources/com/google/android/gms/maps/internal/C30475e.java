package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.dynamic.C41016d;

/* renamed from: com.google.android.gms.maps.internal.e */
public interface C30475e extends IInterface {
    @C0359n0
    /* renamed from: A */
    C30463b mo86118A() throws RemoteException;

    /* renamed from: G */
    void mo86119G(@C0359n0 Bundle bundle) throws RemoteException;

    /* renamed from: K */
    void mo86120K(C30476e0 e0Var) throws RemoteException;

    /* renamed from: N */
    void mo86121N() throws RemoteException;

    /* renamed from: a */
    void mo86122a() throws RemoteException;

    /* renamed from: b */
    void mo86123b() throws RemoteException;

    /* renamed from: c */
    void mo86124c() throws RemoteException;

    /* renamed from: g */
    void mo86125g() throws RemoteException;

    @C0359n0
    C41016d getView() throws RemoteException;

    /* renamed from: i */
    void mo86127i(@C0359n0 Bundle bundle) throws RemoteException;

    /* renamed from: m */
    void mo86128m(@C0359n0 Bundle bundle) throws RemoteException;

    void onLowMemory() throws RemoteException;

    /* renamed from: v */
    void mo86130v() throws RemoteException;
}
