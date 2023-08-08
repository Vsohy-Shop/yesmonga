package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.a0 */
public abstract class C41814a0 extends C41834l implements C41816b0 {
    /* renamed from: H0 */
    public static C41816b0 m169226H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        if (queryLocalInterface instanceof C41816b0) {
            return (C41816b0) queryLocalInterface;
        }
        return new C41848z(iBinder);
    }
}
