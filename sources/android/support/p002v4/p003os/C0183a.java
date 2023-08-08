package android.support.p002v4.p003os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.a */
public interface C0183a extends IInterface {

    /* renamed from: b */
    public static final String f626b = "android.support.v4.os.IResultReceiver";

    /* renamed from: android.support.v4.os.a$a */
    public static class C0184a implements C0183a {
        /* renamed from: U4 */
        public void mo682U4(int i, Bundle bundle) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }
    }

    /* renamed from: android.support.v4.os.a$b */
    public static abstract class C0185b extends Binder implements C0183a {

        /* renamed from: n */
        public static final int f627n = 1;

        /* renamed from: android.support.v4.os.a$b$a */
        public static class C0186a implements C0183a {

            /* renamed from: n */
            public IBinder f628n;

            public C0186a(IBinder iBinder) {
                this.f628n = iBinder;
            }

            /* renamed from: U4 */
            public void mo682U4(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0183a.f626b);
                    obtain.writeInt(i);
                    C0187c.m1181d(obtain, bundle, 0);
                    this.f628n.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f628n;
            }

            /* renamed from: m0 */
            public String mo688m0() {
                return C0183a.f626b;
            }
        }

        public C0185b() {
            attachInterface(this, C0183a.f626b);
        }

        /* renamed from: m0 */
        public static C0183a m1175m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0183a.f626b);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0183a)) {
                return new C0186a(iBinder);
            }
            return (C0183a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(C0183a.f626b);
            }
            if (i == 1598968902) {
                parcel2.writeString(C0183a.f626b);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                mo682U4(parcel.readInt(), (Bundle) C0187c.m1180c(parcel, Bundle.CREATOR));
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.os.a$c */
    public static class C0187c {
        /* renamed from: c */
        public static <T> T m1180c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static <T extends Parcelable> void m1181d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: U4 */
    void mo682U4(int i, Bundle bundle) throws RemoteException;
}
