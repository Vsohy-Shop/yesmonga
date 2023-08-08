package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C41750a0;

/* renamed from: com.google.android.gms.location.q0 */
public class C30377q0 extends C41750a0 implements C30380r0 {
    /* renamed from: H0 */
    public static C30380r0 m122203H0(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if (queryLocalInterface instanceof C30380r0) {
            return (C30380r0) queryLocalInterface;
        }
        return new C30373p0(iBinder);
    }

    /* renamed from: m0 */
    public final boolean mo85751m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
