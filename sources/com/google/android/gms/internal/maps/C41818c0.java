package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.maps.c0 */
public final class C41818c0 extends C41813a implements C41822e0 {
    public C41818c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    }

    /* renamed from: Z6 */
    public final boolean mo136388Z6(C41822e0 e0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, e0Var);
        Parcel m0 = mo136325m0(4, H0);
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: e */
    public final int mo136389e() throws RemoteException {
        Parcel m0 = mo136325m0(5, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final String mo136390f() throws RemoteException {
        Parcel m0 = mo136325m0(1, mo136322H0());
        String readString = m0.readString();
        m0.recycle();
        return readString;
    }

    /* renamed from: h */
    public final void mo136391h() throws RemoteException {
        mo136323O0(3, mo136322H0());
    }

    /* renamed from: o */
    public final String mo136392o() throws RemoteException {
        Parcel m0 = mo136325m0(2, mo136322H0());
        String readString = m0.readString();
        m0.recycle();
        return readString;
    }
}
