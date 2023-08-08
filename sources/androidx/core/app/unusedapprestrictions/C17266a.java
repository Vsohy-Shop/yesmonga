package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.core.app.unusedapprestrictions.a */
public interface C17266a extends IInterface {

    /* renamed from: c */
    public static final String f45568c = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";

    /* renamed from: androidx.core.app.unusedapprestrictions.a$a */
    public static class C17267a implements C17266a {
        public IBinder asBinder() {
            return null;
        }

        /* renamed from: o4 */
        public void mo51731o4(boolean z, boolean z2) throws RemoteException {
        }
    }

    /* renamed from: androidx.core.app.unusedapprestrictions.a$b */
    public static abstract class C17268b extends Binder implements C17266a {

        /* renamed from: n */
        public static final int f45569n = 1;

        /* renamed from: androidx.core.app.unusedapprestrictions.a$b$a */
        public static class C17269a implements C17266a {

            /* renamed from: n */
            public IBinder f45570n;

            public C17269a(IBinder iBinder) {
                this.f45570n = iBinder;
            }

            public IBinder asBinder() {
                return this.f45570n;
            }

            /* renamed from: m0 */
            public String mo51736m0() {
                return C17266a.f45568c;
            }

            /* renamed from: o4 */
            public void mo51731o4(boolean z, boolean z2) throws RemoteException {
                int i;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C17266a.f45568c);
                    int i2 = 0;
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (z2) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.f45570n.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C17268b() {
            attachInterface(this, C17266a.f45568c);
        }

        /* renamed from: m0 */
        public static C17266a m79661m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C17266a.f45568c);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C17266a)) {
                return new C17269a(iBinder);
            }
            return (C17266a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(C17266a.f45568c);
            }
            if (i == 1598968902) {
                parcel2.writeString(C17266a.f45568c);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                mo51731o4(z, z2);
                return true;
            }
        }
    }

    /* renamed from: o4 */
    void mo51731o4(boolean z, boolean z2) throws RemoteException;
}
