package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40785m;
import com.google.android.gms.internal.base.C41064a;
import com.google.android.gms.internal.base.C41066c;

/* renamed from: com.google.android.gms.signin.internal.f */
public final class C30986f extends C41064a implements IInterface {
    public C30986f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: E8 */
    public final void mo87665E8(int i) throws RemoteException {
        Parcel m0 = mo134870m0();
        m0.writeInt(i);
        mo134867O0(7, m0);
    }

    /* renamed from: F8 */
    public final void mo87666F8(C40785m mVar, int i, boolean z) throws RemoteException {
        Parcel m0 = mo134870m0();
        C41066c.m166939e(m0, mVar);
        m0.writeInt(i);
        C41066c.m166937c(m0, z);
        mo134867O0(9, m0);
    }

    /* renamed from: G8 */
    public final void mo87667G8(zai zai, C30985e eVar) throws RemoteException {
        Parcel m0 = mo134870m0();
        C41066c.m166938d(m0, zai);
        C41066c.m166939e(m0, eVar);
        mo134867O0(12, m0);
    }
}
