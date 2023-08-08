package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.common.C41092a;
import com.google.android.gms.internal.common.C41108j;

/* renamed from: com.google.android.gms.dynamite.t */
public final class C41054t extends C41092a implements IInterface {
    public C41054t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: E8 */
    public final C41016d mo134856E8(C41016d dVar, String str, int i, C41016d dVar2) throws RemoteException {
        Parcel T6 = mo134905T6();
        C41108j.m166987f(T6, dVar);
        T6.writeString(str);
        T6.writeInt(i);
        C41108j.m166987f(T6, dVar2);
        Parcel m0 = mo134907m0(2, T6);
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: F8 */
    public final C41016d mo134857F8(C41016d dVar, String str, int i, C41016d dVar2) throws RemoteException {
        Parcel T6 = mo134905T6();
        C41108j.m166987f(T6, dVar);
        T6.writeString(str);
        T6.writeInt(i);
        C41108j.m166987f(T6, dVar2);
        Parcel m0 = mo134907m0(3, T6);
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }
}
