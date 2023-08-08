package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.maps.z */
public final class C41848z extends C41813a implements C41816b0 {
    public C41848z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    /* renamed from: e */
    public final int mo136354e() throws RemoteException {
        Parcel m0 = mo136325m0(1, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final int mo136355f() throws RemoteException {
        Parcel m0 = mo136325m0(2, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: h */
    public final List<IBinder> mo136356h() throws RemoteException {
        Parcel m0 = mo136325m0(3, mo136322H0());
        ArrayList<IBinder> createBinderArrayList = m0.createBinderArrayList();
        m0.recycle();
        return createBinderArrayList;
    }

    /* renamed from: k */
    public final boolean mo136357k() throws RemoteException {
        Parcel m0 = mo136325m0(4, mo136322H0());
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: m5 */
    public final boolean mo136358m5(C41816b0 b0Var) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169456f(H0, b0Var);
        Parcel m0 = mo136325m0(5, H0);
        boolean g = C41835m.m169457g(m0);
        m0.recycle();
        return g;
    }

    /* renamed from: o */
    public final int mo136359o() throws RemoteException {
        Parcel m0 = mo136325m0(6, mo136322H0());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }
}
