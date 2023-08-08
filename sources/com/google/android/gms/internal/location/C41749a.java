package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.a */
public class C41749a implements IInterface {

    /* renamed from: n */
    public final IBinder f105888n;

    /* renamed from: o */
    public final String f105889o;

    public C41749a(IBinder iBinder, String str) {
        this.f105888n = iBinder;
        this.f105889o = str;
    }

    /* renamed from: H0 */
    public final Parcel mo136177H0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f105888n.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: O0 */
    public final void mo136178O0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f105888n.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f105888n;
    }

    /* renamed from: m0 */
    public final Parcel mo136180m0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f105889o);
        return obtain;
    }
}
