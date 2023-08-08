package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.a */
public class C29984a implements IInterface {

    /* renamed from: n */
    public final IBinder f71701n;

    /* renamed from: o */
    public final String f71702o;

    public C29984a(IBinder iBinder, String str) {
        this.f71701n = iBinder;
        this.f71702o = str;
    }

    /* renamed from: H0 */
    public final Parcel mo85029H0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f71701n.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: O0 */
    public final void mo85030O0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f71701n.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f71701n;
    }

    /* renamed from: m0 */
    public final Parcel mo85032m0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f71702o);
        return obtain;
    }
}
