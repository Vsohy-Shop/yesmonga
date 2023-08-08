package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.common.C41092a;
import com.google.android.gms.internal.common.C41108j;

/* renamed from: com.google.android.gms.dynamite.s */
public final class C41053s extends C41092a implements IInterface {
    public C41053s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: E8 */
    public final int mo134849E8(C41016d dVar, String str, boolean z) throws RemoteException {
        Parcel T6 = mo134905T6();
        C41108j.m166987f(T6, dVar);
        T6.writeString(str);
        C41108j.m166984c(T6, z);
        Parcel m0 = mo134907m0(3, T6);
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: F8 */
    public final int mo134850F8(C41016d dVar, String str, boolean z) throws RemoteException {
        Parcel T6 = mo134905T6();
        C41108j.m166987f(T6, dVar);
        T6.writeString(str);
        C41108j.m166984c(T6, z);
        Parcel m0 = mo134907m0(5, T6);
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: G8 */
    public final C41016d mo134851G8(C41016d dVar, String str, int i) throws RemoteException {
        Parcel T6 = mo134905T6();
        C41108j.m166987f(T6, dVar);
        T6.writeString(str);
        T6.writeInt(i);
        Parcel m0 = mo134907m0(2, T6);
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: H8 */
    public final C41016d mo134852H8(C41016d dVar, String str, int i, C41016d dVar2) throws RemoteException {
        Parcel T6 = mo134905T6();
        C41108j.m166987f(T6, dVar);
        T6.writeString(str);
        T6.writeInt(i);
        C41108j.m166987f(T6, dVar2);
        Parcel m0 = mo134907m0(8, T6);
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: I8 */
    public final C41016d mo134853I8(C41016d dVar, String str, int i) throws RemoteException {
        Parcel T6 = mo134905T6();
        C41108j.m166987f(T6, dVar);
        T6.writeString(str);
        T6.writeInt(i);
        Parcel m0 = mo134907m0(4, T6);
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: J8 */
    public final C41016d mo134854J8(C41016d dVar, String str, boolean z, long j) throws RemoteException {
        Parcel T6 = mo134905T6();
        C41108j.m166987f(T6, dVar);
        T6.writeString(str);
        C41108j.m166984c(T6, z);
        T6.writeLong(j);
        Parcel m0 = mo134907m0(7, T6);
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }

    /* renamed from: f */
    public final int mo134855f() throws RemoteException {
        Parcel m0 = mo134907m0(6, mo134905T6());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }
}
