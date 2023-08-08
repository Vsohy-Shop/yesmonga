package com.google.android.p072a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.a.b */
public class C40035b extends Binder implements IInterface {
    public C40035b() {
        attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final IBinder asBinder() {
        return this;
    }

    /* renamed from: m0 */
    public boolean mo132541m0(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        throw null;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo132541m0(i, parcel, parcel2);
    }
}
