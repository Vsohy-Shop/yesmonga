package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C41750a0;
import com.google.android.gms.internal.location.C41794q0;

/* renamed from: com.google.android.gms.location.t0 */
public abstract class C30386t0 extends C41750a0 implements C30392v0 {
    public C30386t0() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: H0 */
    public static C30392v0 m122213H0(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof C30392v0) {
            return (C30392v0) queryLocalInterface;
        }
        return new C30383s0(iBinder);
    }

    /* renamed from: m0 */
    public final boolean mo85751m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo85755y5((LocationResult) C41794q0.m169120b(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo85754j2((LocationAvailability) C41794q0.m169120b(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
