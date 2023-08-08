package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.n1 */
public final class C32073n1 extends C32064k1 implements C32079p1 {
    public C32073n1(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* renamed from: P5 */
    public final void mo92798P5(String str, Bundle bundle, C32085r1 r1Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, r1Var);
        mo92781H0(2, m0);
    }

    /* renamed from: p5 */
    public final void mo92799p5(String str, Bundle bundle, C32085r1 r1Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, r1Var);
        mo92781H0(3, m0);
    }
}
