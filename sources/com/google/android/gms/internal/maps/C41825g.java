package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.g */
public abstract class C41825g extends C41834l implements C41827h {
    /* renamed from: H0 */
    public static C41827h m169372H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        if (queryLocalInterface instanceof C41827h) {
            return (C41827h) queryLocalInterface;
        }
        return new C41823f(iBinder);
    }
}
