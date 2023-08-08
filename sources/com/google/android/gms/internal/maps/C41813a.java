package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.maps.a */
public class C41813a implements IInterface {

    /* renamed from: n */
    public final IBinder f105980n;

    /* renamed from: o */
    public final String f105981o;

    public C41813a(IBinder iBinder, String str) {
        this.f105980n = iBinder;
        this.f105981o = str;
    }

    /* renamed from: H0 */
    public final Parcel mo136322H0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f105981o);
        return obtain;
    }

    /* renamed from: O0 */
    public final void mo136323O0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f105980n.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f105980n;
    }

    /* renamed from: m0 */
    public final Parcel mo136325m0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f105980n.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
