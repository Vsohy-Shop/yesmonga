package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.common.internal.h1 */
public final class C40767h1 implements C40798p {

    /* renamed from: n */
    public final IBinder f103874n;

    public C40767h1(IBinder iBinder) {
        this.f103874n = iBinder;
    }

    /* renamed from: N5 */
    public final void mo134409N5(C40795o oVar, @C0363p0 GetServiceRequest getServiceRequest) throws RemoteException {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (oVar != null) {
                iBinder = oVar.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                C40863z1.m166220a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f103874n.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f103874n;
    }
}
