package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.a */
public class C38533a implements IInterface {

    /* renamed from: n */
    public final IBinder f97678n;

    /* renamed from: o */
    public final String f97679o;

    public C38533a(IBinder iBinder, String str) {
        this.f97678n = iBinder;
        this.f97679o = str;
    }

    /* renamed from: H0 */
    public final Parcel mo122190H0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f97678n.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: O0 */
    public final void mo122191O0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f97678n.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f97678n;
    }

    /* renamed from: m0 */
    public final Parcel mo122193m0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f97679o);
        return obtain;
    }
}
