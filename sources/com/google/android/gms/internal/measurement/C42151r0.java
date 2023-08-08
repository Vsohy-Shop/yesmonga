package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.r0 */
public abstract class C42151r0 extends C42100o0 implements C42168s0 {
    /* renamed from: H0 */
    public static C42168s0 m170775H0(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof C42168s0) {
            return (C42168s0) queryLocalInterface;
        }
        return new C42134q0(iBinder);
    }
}
