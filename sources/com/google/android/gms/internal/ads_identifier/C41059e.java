package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads_identifier.e */
public abstract class C41059e extends C41056b implements C41060f {
    /* renamed from: m0 */
    public static C41060f m166924m0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof C41060f) {
            return (C41060f) queryLocalInterface;
        }
        return new C41058d(iBinder);
    }
}
