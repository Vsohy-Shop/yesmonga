package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.C17266a;

/* renamed from: androidx.core.app.unusedapprestrictions.b */
public interface C17270b extends IInterface {

    /* renamed from: d */
    public static final String f45571d = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";

    /* renamed from: androidx.core.app.unusedapprestrictions.b$a */
    public static class C17271a implements C17270b {
        public IBinder asBinder() {
            return null;
        }

        /* renamed from: e6 */
        public void mo51737e6(C17266a aVar) throws RemoteException {
        }
    }

    /* renamed from: androidx.core.app.unusedapprestrictions.b$b */
    public static abstract class C17272b extends Binder implements C17270b {

        /* renamed from: n */
        public static final int f45572n = 1;

        /* renamed from: androidx.core.app.unusedapprestrictions.b$b$a */
        public static class C17273a implements C17270b {

            /* renamed from: n */
            public IBinder f45573n;

            public C17273a(IBinder iBinder) {
                this.f45573n = iBinder;
            }

            public IBinder asBinder() {
                return this.f45573n;
            }

            /* renamed from: e6 */
            public void mo51737e6(C17266a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C17270b.f45571d);
                    obtain.writeStrongInterface(aVar);
                    this.f45573n.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: m0 */
            public String mo51742m0() {
                return C17270b.f45571d;
            }
        }

        public C17272b() {
            attachInterface(this, C17270b.f45571d);
        }

        /* renamed from: m0 */
        public static C17270b m79666m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C17270b.f45571d);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C17270b)) {
                return new C17273a(iBinder);
            }
            return (C17270b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(C17270b.f45571d);
            }
            if (i == 1598968902) {
                parcel2.writeString(C17270b.f45571d);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                mo51737e6(C17266a.C17268b.m79661m0(parcel.readStrongBinder()));
                return true;
            }
        }
    }

    /* renamed from: e6 */
    void mo51737e6(C17266a aVar) throws RemoteException;
}
