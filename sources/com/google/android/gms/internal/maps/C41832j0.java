package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.j0 */
public abstract class C41832j0 extends C41834l implements C41815b {
    /* renamed from: H0 */
    public static C41815b m169448H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (queryLocalInterface instanceof C41815b) {
            return (C41815b) queryLocalInterface;
        }
        return new C41830i0(iBinder);
    }
}
