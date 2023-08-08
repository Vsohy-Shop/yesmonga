package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.n0 */
public class C42083n0 implements IInterface {

    /* renamed from: n */
    public final IBinder f106302n;

    /* renamed from: o */
    public final String f106303o;

    public C42083n0(IBinder iBinder, String str) {
        this.f106302n = iBinder;
        this.f106303o = str;
    }

    /* renamed from: H0 */
    public final Parcel mo137165H0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f106302n.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: O0 */
    public final void mo137166O0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f106302n.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f106302n;
    }

    /* renamed from: m0 */
    public final Parcel mo137168m0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f106303o);
        return obtain;
    }
}
