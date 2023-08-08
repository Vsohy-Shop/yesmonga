package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.base.C41064a;
import com.google.android.gms.internal.base.C41066c;

/* renamed from: com.google.android.gms.common.internal.t0 */
public final class C40841t0 extends C41064a implements IInterface {
    public C40841t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* renamed from: E8 */
    public final C41016d mo134505E8(C41016d dVar, zax zax) throws RemoteException {
        Parcel m0 = mo134870m0();
        C41066c.m166939e(m0, dVar);
        C41066c.m166938d(m0, zax);
        Parcel H0 = mo134866H0(2, m0);
        C41016d H02 = C41016d.C41017a.m166799H0(H0.readStrongBinder());
        H0.recycle();
        return H02;
    }
}
