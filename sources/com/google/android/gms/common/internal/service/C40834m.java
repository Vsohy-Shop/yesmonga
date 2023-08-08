package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.C41064a;
import com.google.android.gms.internal.base.C41066c;

/* renamed from: com.google.android.gms.common.internal.service.m */
public final class C40834m extends C41064a implements IInterface {
    public C40834m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    /* renamed from: E8 */
    public final void mo134503E8(C40833l lVar) throws RemoteException {
        Parcel m0 = mo134870m0();
        C41066c.m166939e(m0, lVar);
        mo134868T6(1, m0);
    }
}
