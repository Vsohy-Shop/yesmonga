package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.common.C41107i;
import com.google.android.gms.internal.common.C41108j;

/* renamed from: com.google.android.gms.common.internal.m2 */
public abstract class C40789m2 extends C41107i implements C40794n2 {
    public C40789m2() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: H0 */
    public static C40794n2 m165968H0(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof C40794n2) {
            return (C40794n2) queryLocalInterface;
        }
        return new C40784l2(iBinder);
    }

    /* renamed from: m0 */
    public final boolean mo134408m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C41016d e = mo134450e();
            parcel2.writeNoException();
            C41108j.m166987f(parcel2, e);
        } else if (i != 2) {
            return false;
        } else {
            int d = mo134449d();
            parcel2.writeNoException();
            parcel2.writeInt(d);
        }
        return true;
    }
}
