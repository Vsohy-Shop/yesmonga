package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.z1 */
public final class C32109z1 extends C32064k1 implements C32030a2 {
    public C32109z1(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    /* renamed from: F0 */
    public final void mo92726F0(Bundle bundle) throws RemoteException {
        Parcel m0 = mo92783m0();
        C32070m1.m129881b(m0, bundle);
        mo92781H0(4, m0);
    }

    /* renamed from: K0 */
    public final void mo92727K0(Bundle bundle) throws RemoteException {
        Parcel m0 = mo92783m0();
        C32070m1.m129881b(m0, bundle);
        mo92781H0(3, m0);
    }

    /* renamed from: s7 */
    public final void mo92728s7(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel m0 = mo92783m0();
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129881b(m0, bundle2);
        mo92781H0(2, m0);
    }
}
