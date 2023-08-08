package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.u */
public abstract class C41843u extends C41834l implements C41844v {
    /* renamed from: H0 */
    public static C41844v m169499H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        if (queryLocalInterface instanceof C41844v) {
            return (C41844v) queryLocalInterface;
        }
        return new C41842t(iBinder);
    }
}
