package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.x */
public abstract class C41846x extends C41834l implements C41847y {
    /* renamed from: H0 */
    public static C41847y m169549H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        if (queryLocalInterface instanceof C41847y) {
            return (C41847y) queryLocalInterface;
        }
        return new C41845w(iBinder);
    }
}
