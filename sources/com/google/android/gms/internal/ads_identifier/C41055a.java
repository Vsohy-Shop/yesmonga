package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads_identifier.a */
public class C41055a implements IInterface {

    /* renamed from: n */
    public final IBinder f104344n;

    /* renamed from: o */
    public final String f104345o = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public C41055a(IBinder iBinder, String str) {
        this.f104344n = iBinder;
    }

    /* renamed from: H0 */
    public final Parcel mo134858H0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f104344n.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f104344n;
    }

    /* renamed from: m0 */
    public final Parcel mo134860m0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f104345o);
        return obtain;
    }
}
