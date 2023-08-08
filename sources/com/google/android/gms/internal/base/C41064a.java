package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.base.a */
public class C41064a implements IInterface {

    /* renamed from: n */
    public final IBinder f104348n;

    /* renamed from: o */
    public final String f104349o;

    public C41064a(IBinder iBinder, String str) {
        this.f104348n = iBinder;
        this.f104349o = str;
    }

    /* renamed from: H0 */
    public final Parcel mo134866H0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f104348n.transact(2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: O0 */
    public final void mo134867O0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f104348n.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: T6 */
    public final void mo134868T6(int i, Parcel parcel) throws RemoteException {
        try {
            this.f104348n.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f104348n;
    }

    /* renamed from: m0 */
    public final Parcel mo134870m0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f104349o);
        return obtain;
    }
}
