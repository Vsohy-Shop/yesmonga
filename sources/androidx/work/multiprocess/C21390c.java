package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.work.multiprocess.c */
public interface C21390c extends IInterface {

    /* renamed from: i */
    public static final String f55141i = "androidx.work.multiprocess.IWorkManagerImplCallback";

    /* renamed from: androidx.work.multiprocess.c$a */
    public static class C21391a implements C21390c {
        /* renamed from: B0 */
        public void mo63813B0(String str) throws RemoteException {
        }

        /* renamed from: U7 */
        public void mo63814U7(byte[] bArr) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }
    }

    /* renamed from: androidx.work.multiprocess.c$b */
    public static abstract class C21392b extends Binder implements C21390c {

        /* renamed from: n */
        public static final int f55142n = 1;

        /* renamed from: o */
        public static final int f55143o = 2;

        /* renamed from: androidx.work.multiprocess.c$b$a */
        public static class C21393a implements C21390c {

            /* renamed from: n */
            public IBinder f55144n;

            public C21393a(IBinder iBinder) {
                this.f55144n = iBinder;
            }

            /* renamed from: B0 */
            public void mo63813B0(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21390c.f55141i);
                    obtain.writeString(str);
                    this.f55144n.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: U7 */
            public void mo63814U7(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21390c.f55141i);
                    obtain.writeByteArray(bArr);
                    this.f55144n.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f55144n;
            }

            /* renamed from: m0 */
            public String mo63819m0() {
                return C21390c.f55141i;
            }
        }

        public C21392b() {
            attachInterface(this, C21390c.f55141i);
        }

        /* renamed from: m0 */
        public static C21390c m98658m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C21390c.f55141i);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21390c)) {
                return new C21393a(iBinder);
            }
            return (C21390c) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(C21390c.f55141i);
            }
            if (i != 1598968902) {
                if (i == 1) {
                    mo63814U7(parcel.createByteArray());
                } else if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                } else {
                    mo63813B0(parcel.readString());
                }
                return true;
            }
            parcel2.writeString(C21390c.f55141i);
            return true;
        }
    }

    /* renamed from: B0 */
    void mo63813B0(String str) throws RemoteException;

    /* renamed from: U7 */
    void mo63814U7(byte[] bArr) throws RemoteException;
}
