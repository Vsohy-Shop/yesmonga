package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.work.multiprocess.C21390c;

/* renamed from: androidx.work.multiprocess.b */
public interface C21386b extends IInterface {

    /* renamed from: h */
    public static final String f55129h = "androidx.work.multiprocess.IWorkManagerImpl";

    /* renamed from: androidx.work.multiprocess.b$a */
    public static class C21387a implements C21386b {
        /* renamed from: A3 */
        public void mo63798A3(String str, C21390c cVar) throws RemoteException {
        }

        /* renamed from: C1 */
        public void mo63799C1(byte[] bArr, C21390c cVar) throws RemoteException {
        }

        /* renamed from: I1 */
        public void mo63800I1(C21390c cVar) throws RemoteException {
        }

        /* renamed from: O6 */
        public void mo63801O6(byte[] bArr, C21390c cVar) throws RemoteException {
        }

        /* renamed from: Q4 */
        public void mo63802Q4(byte[] bArr, C21390c cVar) throws RemoteException {
        }

        /* renamed from: S7 */
        public void mo63803S7(byte[] bArr, C21390c cVar) throws RemoteException {
        }

        /* renamed from: Z4 */
        public void mo63804Z4(byte[] bArr, C21390c cVar) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        /* renamed from: i8 */
        public void mo63805i8(String str, C21390c cVar) throws RemoteException {
        }

        /* renamed from: n1 */
        public void mo63806n1(String str, C21390c cVar) throws RemoteException {
        }

        /* renamed from: q4 */
        public void mo63807q4(String str, byte[] bArr, C21390c cVar) throws RemoteException {
        }
    }

    /* renamed from: androidx.work.multiprocess.b$b */
    public static abstract class C21388b extends Binder implements C21386b {

        /* renamed from: n */
        public static final int f55130n = 1;

        /* renamed from: o */
        public static final int f55131o = 2;

        /* renamed from: p */
        public static final int f55132p = 3;

        /* renamed from: q */
        public static final int f55133q = 4;

        /* renamed from: r */
        public static final int f55134r = 5;

        /* renamed from: s */
        public static final int f55135s = 6;

        /* renamed from: t */
        public static final int f55136t = 7;

        /* renamed from: u */
        public static final int f55137u = 8;

        /* renamed from: v */
        public static final int f55138v = 9;

        /* renamed from: w */
        public static final int f55139w = 10;

        /* renamed from: androidx.work.multiprocess.b$b$a */
        public static class C21389a implements C21386b {

            /* renamed from: n */
            public IBinder f55140n;

            public C21389a(IBinder iBinder) {
                this.f55140n = iBinder;
            }

            /* renamed from: A3 */
            public void mo63798A3(String str, C21390c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21386b.f55129h);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(cVar);
                    this.f55140n.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: C1 */
            public void mo63799C1(byte[] bArr, C21390c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21386b.f55129h);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(cVar);
                    this.f55140n.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: I1 */
            public void mo63800I1(C21390c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21386b.f55129h);
                    obtain.writeStrongInterface(cVar);
                    this.f55140n.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: O6 */
            public void mo63801O6(byte[] bArr, C21390c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21386b.f55129h);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(cVar);
                    this.f55140n.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: Q4 */
            public void mo63802Q4(byte[] bArr, C21390c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21386b.f55129h);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(cVar);
                    this.f55140n.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: S7 */
            public void mo63803S7(byte[] bArr, C21390c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21386b.f55129h);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(cVar);
                    this.f55140n.transact(10, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: Z4 */
            public void mo63804Z4(byte[] bArr, C21390c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21386b.f55129h);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(cVar);
                    this.f55140n.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f55140n;
            }

            /* renamed from: i8 */
            public void mo63805i8(String str, C21390c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21386b.f55129h);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(cVar);
                    this.f55140n.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: m0 */
            public String mo63812m0() {
                return C21386b.f55129h;
            }

            /* renamed from: n1 */
            public void mo63806n1(String str, C21390c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21386b.f55129h);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(cVar);
                    this.f55140n.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: q4 */
            public void mo63807q4(String str, byte[] bArr, C21390c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C21386b.f55129h);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(cVar);
                    this.f55140n.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C21388b() {
            attachInterface(this, C21386b.f55129h);
        }

        /* renamed from: m0 */
        public static C21386b m98642m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C21386b.f55129h);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21386b)) {
                return new C21389a(iBinder);
            }
            return (C21386b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(C21386b.f55129h);
            }
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        mo63799C1(parcel.createByteArray(), C21390c.C21392b.m98658m0(parcel.readStrongBinder()));
                        break;
                    case 2:
                        mo63807q4(parcel.readString(), parcel.createByteArray(), C21390c.C21392b.m98658m0(parcel.readStrongBinder()));
                        break;
                    case 3:
                        mo63804Z4(parcel.createByteArray(), C21390c.C21392b.m98658m0(parcel.readStrongBinder()));
                        break;
                    case 4:
                        mo63798A3(parcel.readString(), C21390c.C21392b.m98658m0(parcel.readStrongBinder()));
                        break;
                    case 5:
                        mo63805i8(parcel.readString(), C21390c.C21392b.m98658m0(parcel.readStrongBinder()));
                        break;
                    case 6:
                        mo63806n1(parcel.readString(), C21390c.C21392b.m98658m0(parcel.readStrongBinder()));
                        break;
                    case 7:
                        mo63800I1(C21390c.C21392b.m98658m0(parcel.readStrongBinder()));
                        break;
                    case 8:
                        mo63801O6(parcel.createByteArray(), C21390c.C21392b.m98658m0(parcel.readStrongBinder()));
                        break;
                    case 9:
                        mo63802Q4(parcel.createByteArray(), C21390c.C21392b.m98658m0(parcel.readStrongBinder()));
                        break;
                    case 10:
                        mo63803S7(parcel.createByteArray(), C21390c.C21392b.m98658m0(parcel.readStrongBinder()));
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
                return true;
            }
            parcel2.writeString(C21386b.f55129h);
            return true;
        }
    }

    /* renamed from: A3 */
    void mo63798A3(String str, C21390c cVar) throws RemoteException;

    /* renamed from: C1 */
    void mo63799C1(byte[] bArr, C21390c cVar) throws RemoteException;

    /* renamed from: I1 */
    void mo63800I1(C21390c cVar) throws RemoteException;

    /* renamed from: O6 */
    void mo63801O6(byte[] bArr, C21390c cVar) throws RemoteException;

    /* renamed from: Q4 */
    void mo63802Q4(byte[] bArr, C21390c cVar) throws RemoteException;

    /* renamed from: S7 */
    void mo63803S7(byte[] bArr, C21390c cVar) throws RemoteException;

    /* renamed from: Z4 */
    void mo63804Z4(byte[] bArr, C21390c cVar) throws RemoteException;

    /* renamed from: i8 */
    void mo63805i8(String str, C21390c cVar) throws RemoteException;

    /* renamed from: n1 */
    void mo63806n1(String str, C21390c cVar) throws RemoteException;

    /* renamed from: q4 */
    void mo63807q4(String str, byte[] bArr, C21390c cVar) throws RemoteException;
}
