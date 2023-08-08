package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C41813a;
import com.google.android.gms.internal.maps.C41835m;

/* renamed from: com.google.android.gms.maps.internal.v */
public final class C30535v extends C41813a implements C30538w {
    public C30535v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IOnLocationChangeListener");
    }

    /* renamed from: T */
    public final void mo86228T(Location location) throws RemoteException {
        Parcel H0 = mo136322H0();
        C41835m.m169454d(H0, location);
        mo136323O0(2, H0);
    }
}
