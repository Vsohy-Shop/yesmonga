package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.common.C41092a;

/* renamed from: com.google.android.gms.common.internal.l2 */
public final class C40784l2 extends C41092a implements C40794n2 {
    public C40784l2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: d */
    public final int mo134449d() throws RemoteException {
        Parcel m0 = mo134907m0(2, mo134905T6());
        int readInt = m0.readInt();
        m0.recycle();
        return readInt;
    }

    /* renamed from: e */
    public final C41016d mo134450e() throws RemoteException {
        Parcel m0 = mo134907m0(1, mo134905T6());
        C41016d H0 = C41016d.C41017a.m166799H0(m0.readStrongBinder());
        m0.recycle();
        return H0;
    }
}
