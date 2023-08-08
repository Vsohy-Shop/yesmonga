package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.d */
public abstract class C41819d extends C41834l implements C41821e {
    /* renamed from: H0 */
    public static C41821e m169294H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        if (queryLocalInterface instanceof C41821e) {
            return (C41821e) queryLocalInterface;
        }
        return new C41817c(iBinder);
    }
}
