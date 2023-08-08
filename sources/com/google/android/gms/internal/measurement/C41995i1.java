package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.i1 */
public final class C41995i1 extends C42083n0 implements C42031k1 {
    public C41995i1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: E */
    public final void mo137013E(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString(str);
        m0.writeString(str2);
        C42117p0.m170704d(m0, bundle);
        m0.writeLong(j);
        mo137166O0(1, m0);
    }

    /* renamed from: e */
    public final int mo137014e() throws RemoteException {
        Parcel H0 = mo137165H0(2, mo137168m0());
        int readInt = H0.readInt();
        H0.recycle();
        return readInt;
    }
}
