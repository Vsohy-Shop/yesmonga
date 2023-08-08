package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.g0 */
public abstract class C41826g0 extends C41834l implements C41828h0 {
    /* renamed from: H0 */
    public static C41828h0 m169373H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof C41828h0) {
            return (C41828h0) queryLocalInterface;
        }
        return new C41824f0(iBinder);
    }
}
