package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.common.a */
public class C41092a implements IInterface {

    /* renamed from: n */
    public final IBinder f104380n;

    /* renamed from: o */
    public final String f104381o;

    public C41092a(IBinder iBinder, String str) {
        this.f104380n = iBinder;
        this.f104381o = str;
    }

    /* renamed from: H0 */
    public final void mo134903H0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f104380n.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: O0 */
    public final void mo134904O0(int i, Parcel parcel) throws RemoteException {
        try {
            this.f104380n.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: T6 */
    public final Parcel mo134905T6() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f104381o);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f104380n;
    }

    /* renamed from: m0 */
    public final Parcel mo134907m0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f104380n.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
