package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C41750a0;
import com.google.android.gms.internal.location.C41794q0;

/* renamed from: com.google.android.gms.location.x0 */
public abstract class C30398x0 extends C41750a0 implements C30401y0 {
    public C30398x0() {
        super("com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: H0 */
    public static C30401y0 m122227H0(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof C30401y0) {
            return (C30401y0) queryLocalInterface;
        }
        return new C30395w0(iBinder);
    }

    /* renamed from: m0 */
    public final boolean mo85751m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo85757T((Location) C41794q0.m169120b(parcel, Location.CREATOR));
        return true;
    }
}
