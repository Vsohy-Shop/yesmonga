package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.gtm.r */
public class C41534r implements IInterface {

    /* renamed from: n */
    public final IBinder f104914n;

    /* renamed from: o */
    public final String f104915o;

    public C41534r(IBinder iBinder, String str) {
        this.f104914n = iBinder;
        this.f104915o = str;
    }

    /* renamed from: H0 */
    public final Parcel mo135789H0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f104914n.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: O0 */
    public final void mo135790O0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f104914n.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: T6 */
    public final void mo135791T6(int i, Parcel parcel) throws RemoteException {
        try {
            this.f104914n.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f104914n;
    }

    /* renamed from: m0 */
    public final Parcel mo135793m0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f104915o);
        return obtain;
    }
}
