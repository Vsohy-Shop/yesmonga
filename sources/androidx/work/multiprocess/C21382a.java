package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.work.multiprocess.C21390c;

/* renamed from: androidx.work.multiprocess.a */
public interface C21382a extends IInterface {

    /* renamed from: g */
    public static final String f55125g = "androidx.work.multiprocess.IListenableWorkerImpl";

    /* renamed from: androidx.work.multiprocess.a$a */
    public static class C21383a implements C21382a {
        public IBinder asBinder() {
            return null;
        }

        /* renamed from: u2 */
        public void mo63791u2(byte[] bArr, C21390c cVar) throws RemoteException {
        }

        /* renamed from: x7 */
        public void mo63792x7(byte[] bArr, C21390c cVar) throws RemoteException {
        }
    }

    /* renamed from: androidx.work.multiprocess.a$b */
    public static abstract class C21384b extends Binder implements C21382a {

        /* renamed from: n */
        public static final int f55126n = 1;

        /* renamed from: o */
        public static final int f55127o = 2;

        /* renamed from: androidx.work.multiprocess.a$b$a */
        public static class C21385a implements C21382a {

            /* renamed from: n */
            public IBinder f55128n;

            public C21385a(IBinder iBinder) {
                this.f55128n = iBinder;
            }

            public IBinder asBinder() {
                return this.f55128n;
            }

            /* renamed from: m0 */
            public String mo63797m0() {
                return C21382a.f55125g;
            }

            /* renamed from: u2 */
            public void mo63791u2(byte[] bArr, C21390c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21382a.f55125g);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(cVar);
                    this.f55128n.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: x7 */
            public void mo63792x7(byte[] bArr, C21390c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21382a.f55125g);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(cVar);
                    this.f55128n.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C21384b() {
            attachInterface(this, C21382a.f55125g);
        }

        /* renamed from: m0 */
        public static C21382a m98618m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C21382a.f55125g);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21382a)) {
                return new C21385a(iBinder);
            }
            return (C21382a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(C21382a.f55125g);
            }
            if (i != 1598968902) {
                if (i == 1) {
                    mo63791u2(parcel.createByteArray(), C21390c.C21392b.m98658m0(parcel.readStrongBinder()));
                } else if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                } else {
                    mo63792x7(parcel.createByteArray(), C21390c.C21392b.m98658m0(parcel.readStrongBinder()));
                }
                return true;
            }
            parcel2.writeString(C21382a.f55125g);
            return true;
        }
    }

    /* renamed from: u2 */
    void mo63791u2(byte[] bArr, C21390c cVar) throws RemoteException;

    /* renamed from: x7 */
    void mo63792x7(byte[] bArr, C21390c cVar) throws RemoteException;
}
