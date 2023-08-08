package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.r */
public abstract class C41840r extends C41834l implements C41841s {
    /* renamed from: H0 */
    public static C41841s m169467H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (queryLocalInterface instanceof C41841s) {
            return (C41841s) queryLocalInterface;
        }
        return new C41839q(iBinder);
    }
}
