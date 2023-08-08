package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.room.y */
public interface C20410y extends IInterface {

    /* renamed from: e */
    public static final String f52634e = "androidx.room.IMultiInstanceInvalidationCallback";

    /* renamed from: androidx.room.y$a */
    public static class C20411a implements C20410y {
        /* renamed from: H1 */
        public void mo61107H1(String[] strArr) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }
    }

    /* renamed from: androidx.room.y$b */
    public static abstract class C20412b extends Binder implements C20410y {

        /* renamed from: n */
        public static final int f52635n = 1;

        /* renamed from: androidx.room.y$b$a */
        public static class C20413a implements C20410y {

            /* renamed from: n */
            public IBinder f52636n;

            public C20413a(IBinder iBinder) {
                this.f52636n = iBinder;
            }

            /* renamed from: H1 */
            public void mo61107H1(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C20410y.f52634e);
                    obtain.writeStringArray(strArr);
                    this.f52636n.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f52636n;
            }

            /* renamed from: m0 */
            public String mo61262m0() {
                return C20410y.f52634e;
            }
        }

        public C20412b() {
            attachInterface(this, C20410y.f52634e);
        }

        /* renamed from: m0 */
        public static C20410y m95216m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C20410y.f52634e);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20410y)) {
                return new C20413a(iBinder);
            }
            return (C20410y) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(C20410y.f52634e);
            }
            if (i == 1598968902) {
                parcel2.writeString(C20410y.f52634e);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                mo61107H1(parcel.createStringArray());
                return true;
            }
        }
    }

    /* renamed from: H1 */
    void mo61107H1(String[] strArr) throws RemoteException;
}
