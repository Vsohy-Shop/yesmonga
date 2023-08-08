package com.google.android.p072a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.a.a */
public class C40034a implements IInterface {

    /* renamed from: n */
    public final IBinder f102053n;

    /* renamed from: o */
    public final String f102054o = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public C40034a(IBinder iBinder) {
        this.f102053n = iBinder;
    }

    /* renamed from: H0 */
    public final Parcel mo132537H0(Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f102053n.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f102053n;
    }

    /* renamed from: m0 */
    public final Parcel mo132539m0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f102054o);
        return obtain;
    }
}
