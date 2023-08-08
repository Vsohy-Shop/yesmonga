package android.support.p002v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: android.support.v4.app.a */
public interface C0025a extends IInterface {

    /* renamed from: a */
    public static final String f43a = "android.support.v4.app.INotificationSideChannel";

    /* renamed from: android.support.v4.app.a$a */
    public static class C0026a implements C0025a {
        /* renamed from: a6 */
        public void mo55a6(String str) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        /* renamed from: n3 */
        public void mo56n3(String str, int i, String str2) throws RemoteException {
        }

        /* renamed from: q8 */
        public void mo57q8(String str, int i, String str2, Notification notification) throws RemoteException {
        }
    }

    /* renamed from: android.support.v4.app.a$b */
    public static abstract class C0027b extends Binder implements C0025a {

        /* renamed from: n */
        public static final int f44n = 1;

        /* renamed from: o */
        public static final int f45o = 2;

        /* renamed from: p */
        public static final int f46p = 3;

        /* renamed from: android.support.v4.app.a$b$a */
        public static class C0028a implements C0025a {

            /* renamed from: n */
            public IBinder f47n;

            public C0028a(IBinder iBinder) {
                this.f47n = iBinder;
            }

            /* renamed from: a6 */
            public void mo55a6(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0025a.f43a);
                    obtain.writeString(str);
                    this.f47n.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f47n;
            }

            /* renamed from: m0 */
            public String mo62m0() {
                return C0025a.f43a;
            }

            /* renamed from: n3 */
            public void mo56n3(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0025a.f43a);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f47n.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: q8 */
            public void mo57q8(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0025a.f43a);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    C0029c.m120d(obtain, notification, 0);
                    this.f47n.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0027b() {
            attachInterface(this, C0025a.f43a);
        }

        /* renamed from: m0 */
        public static C0025a m112m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0025a.f43a);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0025a)) {
                return new C0028a(iBinder);
            }
            return (C0025a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(C0025a.f43a);
            }
            if (i != 1598968902) {
                if (i == 1) {
                    mo57q8(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) C0029c.m119c(parcel, Notification.CREATOR));
                } else if (i == 2) {
                    mo56n3(parcel.readString(), parcel.readInt(), parcel.readString());
                } else if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                } else {
                    mo55a6(parcel.readString());
                }
                return true;
            }
            parcel2.writeString(C0025a.f43a);
            return true;
        }
    }

    /* renamed from: android.support.v4.app.a$c */
    public static class C0029c {
        /* renamed from: c */
        public static <T> T m119c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static <T extends Parcelable> void m120d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: a6 */
    void mo55a6(String str) throws RemoteException;

    /* renamed from: n3 */
    void mo56n3(String str, int i, String str2) throws RemoteException;

    /* renamed from: q8 */
    void mo57q8(String str, int i, String str2, Notification notification) throws RemoteException;
}
