package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.b */
public final class C32032b extends C32064k1 implements C32041d {
    public C32032b(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* renamed from: R3 */
    public final void mo92729R3(String str, Bundle bundle, C32056i iVar) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, iVar);
        mo92781H0(2, m0);
    }
}
