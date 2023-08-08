package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.cloudmessaging.b */
public interface C40438b extends IInterface {

    /* renamed from: j */
    public static final String f103057j = "com.google.android.gms.iid.IMessengerCompat";

    /* renamed from: k */
    public static final int f103058k = 1;

    /* renamed from: com.google.android.gms.cloudmessaging.b$a */
    public static class C40439a extends Binder implements C40438b {
        /* renamed from: F5 */
        public void mo133540F5(@C0359n0 Message message) throws RemoteException {
            throw null;
        }

        @C0359n0
        public IBinder asBinder() {
            throw null;
        }

        public boolean onTransact(int i, @C0359n0 Parcel parcel, @C0363p0 Parcel parcel2, int i2) throws RemoteException {
            throw null;
        }
    }

    /* renamed from: com.google.android.gms.cloudmessaging.b$b */
    public static class C40440b implements C40438b {

        /* renamed from: n */
        public final IBinder f103059n;

        public C40440b(@C0359n0 IBinder iBinder) {
            this.f103059n = iBinder;
        }

        /* renamed from: F5 */
        public void mo133540F5(@C0359n0 Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(C40438b.f103057j);
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f103059n.transact(1, obtain, (Parcel) null, 1);
            } finally {
                obtain.recycle();
            }
        }

        @C0359n0
        public IBinder asBinder() {
            return this.f103059n;
        }
    }

    /* renamed from: F5 */
    void mo133540F5(@C0359n0 Message message) throws RemoteException;
}
