package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* renamed from: com.google.android.gms.internal.maps.i */
public final class C41829i extends C41813a implements C41833k {
    public C41829i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    /* renamed from: B3 */
    public final Tile mo86583B3(int i, int i2, int i3) throws RemoteException {
        Parcel H0 = mo136322H0();
        H0.writeInt(i);
        H0.writeInt(i2);
        H0.writeInt(i3);
        Parcel m0 = mo136325m0(1, H0);
        Tile tile = (Tile) C41835m.m169451a(m0, Tile.CREATOR);
        m0.recycle();
        return tile;
    }
}
