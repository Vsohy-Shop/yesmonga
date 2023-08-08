package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.customtabs.c */
public interface C0013c extends IInterface {

    /* renamed from: android.support.customtabs.c$a */
    public static class C0014a implements C0013c {
        public IBinder asBinder() {
            return null;
        }

        /* renamed from: b7 */
        public void mo30b7(C0005a aVar, String str, Bundle bundle) throws RemoteException {
        }

        /* renamed from: y2 */
        public void mo31y2(C0005a aVar, Bundle bundle) throws RemoteException {
        }
    }

    /* renamed from: android.support.customtabs.c$b */
    public static abstract class C0015b extends Binder implements C0013c {

        /* renamed from: n */
        public static final String f24n = "android.support.customtabs.IPostMessageService";

        /* renamed from: o */
        public static final int f25o = 2;

        /* renamed from: p */
        public static final int f26p = 3;

        /* renamed from: android.support.customtabs.c$b$a */
        public static class C0016a implements C0013c {

            /* renamed from: o */
            public static C0013c f27o;

            /* renamed from: n */
            public IBinder f28n;

            public C0016a(IBinder iBinder) {
                this.f28n = iBinder;
            }

            public IBinder asBinder() {
                return this.f28n;
            }

            /* renamed from: b7 */
            public void mo30b7(C0005a aVar, String str, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0015b.f24n);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f28n.transact(3, obtain, obtain2, 0) || C0015b.m68H0() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0015b.m68H0().mo30b7(aVar, str, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m0 */
            public String mo36m0() {
                return C0015b.f24n;
            }

            /* renamed from: y2 */
            public void mo31y2(C0005a aVar, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0015b.f24n);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f28n.transact(2, obtain, obtain2, 0) || C0015b.m68H0() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0015b.m68H0().mo31y2(aVar, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0015b() {
            attachInterface(this, f24n);
        }

        /* renamed from: H0 */
        public static C0013c m68H0() {
            return C0016a.f27o;
        }

        /* renamed from: O0 */
        public static boolean m69O0(C0013c cVar) {
            if (C0016a.f27o != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (cVar == null) {
                return false;
            } else {
                C0016a.f27o = cVar;
                return true;
            }
        }

        /* renamed from: m0 */
        public static C0013c m70m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f24n);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0013c)) {
                return new C0016a(iBinder);
            }
            return (C0013c) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 2
                r1 = 0
                r2 = 1
                java.lang.String r3 = "android.support.customtabs.IPostMessageService"
                if (r5 == r0) goto L_0x003d
                r0 = 3
                if (r5 == r0) goto L_0x0018
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x0014
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0014:
                r7.writeString(r3)
                return r2
            L_0x0018:
                r6.enforceInterface(r3)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0005a.C0007b.m19m0(r5)
                java.lang.String r8 = r6.readString()
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x0036
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0036:
                r4.mo30b7(r5, r8, r1)
                r7.writeNoException()
                return r2
            L_0x003d:
                r6.enforceInterface(r3)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0005a.C0007b.m19m0(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0057
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0057:
                r4.mo31y2(r5, r1)
                r7.writeNoException()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.C0013c.C0015b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: b7 */
    void mo30b7(C0005a aVar, String str, Bundle bundle) throws RemoteException;

    /* renamed from: y2 */
    void mo31y2(C0005a aVar, Bundle bundle) throws RemoteException;
}
