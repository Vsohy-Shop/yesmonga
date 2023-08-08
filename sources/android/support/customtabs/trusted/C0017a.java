package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.customtabs.trusted.a */
public interface C0017a extends IInterface {

    /* renamed from: android.support.customtabs.trusted.a$a */
    public static class C0018a implements C0017a {
        public IBinder asBinder() {
            return null;
        }

        /* renamed from: l8 */
        public void mo37l8(String str, Bundle bundle) throws RemoteException {
        }
    }

    /* renamed from: android.support.customtabs.trusted.a$b */
    public static abstract class C0019b extends Binder implements C0017a {

        /* renamed from: n */
        public static final String f29n = "android.support.customtabs.trusted.ITrustedWebActivityCallback";

        /* renamed from: o */
        public static final int f30o = 2;

        /* renamed from: android.support.customtabs.trusted.a$b$a */
        public static class C0020a implements C0017a {

            /* renamed from: o */
            public static C0017a f31o;

            /* renamed from: n */
            public IBinder f32n;

            public C0020a(IBinder iBinder) {
                this.f32n = iBinder;
            }

            public IBinder asBinder() {
                return this.f32n;
            }

            /* renamed from: l8 */
            public void mo37l8(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0019b.f29n);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f32n.transact(2, obtain, obtain2, 0) || C0019b.m76H0() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0019b.m76H0().mo37l8(str, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m0 */
            public String mo42m0() {
                return C0019b.f29n;
            }
        }

        public C0019b() {
            attachInterface(this, f29n);
        }

        /* renamed from: H0 */
        public static C0017a m76H0() {
            return C0020a.f31o;
        }

        /* renamed from: O0 */
        public static boolean m77O0(C0017a aVar) {
            if (C0020a.f31o != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (aVar == null) {
                return false;
            } else {
                C0020a.f31o = aVar;
                return true;
            }
        }

        /* renamed from: m0 */
        public static C0017a m78m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f29n);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0017a)) {
                return new C0020a(iBinder);
            }
            return (C0017a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i == 2) {
                parcel.enforceInterface(f29n);
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                mo37l8(readString, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f29n);
                return true;
            }
        }
    }

    /* renamed from: l8 */
    void mo37l8(String str, Bundle bundle) throws RemoteException;
}
