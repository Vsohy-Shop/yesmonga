package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* renamed from: com.google.android.gms.internal.maps.j */
public abstract class C41831j extends C41834l implements C41833k {
    public C41831j() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    /* renamed from: H0 */
    public static C41833k m169446H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        if (queryLocalInterface instanceof C41833k) {
            return (C41833k) queryLocalInterface;
        }
        return new C41829i(iBinder);
    }

    /* renamed from: m0 */
    public final boolean mo86023m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Tile B3 = mo86583B3(parcel.readInt(), parcel.readInt(), parcel.readInt());
        parcel2.writeNoException();
        C41835m.m169455e(parcel2, B3);
        return true;
    }
}
