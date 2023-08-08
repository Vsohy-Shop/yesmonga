package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.k1 */
public class C32064k1 implements IInterface {

    /* renamed from: n */
    public final IBinder f78275n;

    /* renamed from: o */
    public final String f78276o;

    public C32064k1(IBinder iBinder, String str) {
        this.f78275n = iBinder;
        this.f78276o = str;
    }

    /* renamed from: H0 */
    public final void mo92781H0(int i, Parcel parcel) throws RemoteException {
        try {
            this.f78275n.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f78275n;
    }

    /* renamed from: m0 */
    public final Parcel mo92783m0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f78276o);
        return obtain;
    }
}
