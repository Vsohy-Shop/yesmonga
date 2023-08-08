package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.C20410y;

/* renamed from: androidx.room.z */
public interface C20417z extends IInterface {

    /* renamed from: f */
    public static final String f52649f = "androidx.room.IMultiInstanceInvalidationService";

    /* renamed from: androidx.room.z$a */
    public static class C20418a implements C20417z {
        /* renamed from: G4 */
        public void mo60884G4(int i, String[] strArr) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        /* renamed from: c6 */
        public int mo60885c6(C20410y yVar, String str) throws RemoteException {
            return 0;
        }

        /* renamed from: x8 */
        public void mo60886x8(C20410y yVar, int i) throws RemoteException {
        }
    }

    /* renamed from: androidx.room.z$b */
    public static abstract class C20419b extends Binder implements C20417z {

        /* renamed from: n */
        public static final int f52650n = 1;

        /* renamed from: o */
        public static final int f52651o = 2;

        /* renamed from: p */
        public static final int f52652p = 3;

        /* renamed from: androidx.room.z$b$a */
        public static class C20420a implements C20417z {

            /* renamed from: n */
            public IBinder f52653n;

            public C20420a(IBinder iBinder) {
                this.f52653n = iBinder;
            }

            /* renamed from: G4 */
            public void mo60884G4(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C20417z.f52649f);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f52653n.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f52653n;
            }

            /* renamed from: c6 */
            public int mo60885c6(C20410y yVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C20417z.f52649f);
                    obtain.writeStrongInterface(yVar);
                    obtain.writeString(str);
                    this.f52653n.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m0 */
            public String mo61278m0() {
                return C20417z.f52649f;
            }

            /* renamed from: x8 */
            public void mo60886x8(C20410y yVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C20417z.f52649f);
                    obtain.writeStrongInterface(yVar);
                    obtain.writeInt(i);
                    this.f52653n.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C20419b() {
            attachInterface(this, C20417z.f52649f);
        }

        /* renamed from: m0 */
        public static C20417z m95242m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C20417z.f52649f);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20417z)) {
                return new C20420a(iBinder);
            }
            return (C20417z) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(C20417z.f52649f);
            }
            if (i != 1598968902) {
                if (i == 1) {
                    int c6 = mo60885c6(C20410y.C20412b.m95216m0(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(c6);
                } else if (i == 2) {
                    mo60886x8(C20410y.C20412b.m95216m0(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                } else if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                } else {
                    mo60884G4(parcel.readInt(), parcel.createStringArray());
                }
                return true;
            }
            parcel2.writeString(C20417z.f52649f);
            return true;
        }
    }

    /* renamed from: G4 */
    void mo60884G4(int i, String[] strArr) throws RemoteException;

    /* renamed from: c6 */
    int mo60885c6(C20410y yVar, String str) throws RemoteException;

    /* renamed from: x8 */
    void mo60886x8(C20410y yVar, int i) throws RemoteException;
}
