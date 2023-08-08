package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.d0 */
public abstract class C41820d0 extends C41834l implements C41822e0 {
    /* renamed from: H0 */
    public static C41822e0 m169295H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
        if (queryLocalInterface instanceof C41822e0) {
            return (C41822e0) queryLocalInterface;
        }
        return new C41818c0(iBinder);
    }
}
