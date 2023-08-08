package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.customtabs.trusted.b */
public interface C0021b extends IInterface {

    /* renamed from: android.support.customtabs.trusted.b$a */
    public static class C0022a implements C0021b {
        /* renamed from: G5 */
        public Bundle mo43G5() throws RemoteException {
            return null;
        }

        /* renamed from: I7 */
        public void mo44I7(Bundle bundle) throws RemoteException {
        }

        /* renamed from: Q3 */
        public Bundle mo45Q3(Bundle bundle) throws RemoteException {
            return null;
        }

        public IBinder asBinder() {
            return null;
        }

        /* renamed from: j3 */
        public Bundle mo46j3() throws RemoteException {
            return null;
        }

        /* renamed from: l7 */
        public int mo47l7() throws RemoteException {
            return 0;
        }

        /* renamed from: p7 */
        public Bundle mo48p7(Bundle bundle) throws RemoteException {
            return null;
        }

        /* renamed from: s2 */
        public Bundle mo49s2(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
            return null;
        }
    }

    /* renamed from: android.support.customtabs.trusted.b$b */
    public static abstract class C0023b extends Binder implements C0021b {

        /* renamed from: n */
        public static final String f33n = "android.support.customtabs.trusted.ITrustedWebActivityService";

        /* renamed from: o */
        public static final int f34o = 6;

        /* renamed from: p */
        public static final int f35p = 2;

        /* renamed from: q */
        public static final int f36q = 3;

        /* renamed from: r */
        public static final int f37r = 5;

        /* renamed from: s */
        public static final int f38s = 4;

        /* renamed from: t */
        public static final int f39t = 7;

        /* renamed from: u */
        public static final int f40u = 9;

        /* renamed from: android.support.customtabs.trusted.b$b$a */
        public static class C0024a implements C0021b {

            /* renamed from: o */
            public static C0021b f41o;

            /* renamed from: n */
            public IBinder f42n;

            public C0024a(IBinder iBinder) {
                this.f42n = iBinder;
            }

            /* renamed from: G5 */
            public Bundle mo43G5() throws RemoteException {
                Bundle bundle;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0023b.f33n);
                    if (!this.f42n.transact(5, obtain, obtain2, 0) && C0023b.m95H0() != null) {
                        return C0023b.m95H0().mo43G5();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: I7 */
            public void mo44I7(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0023b.f33n);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f42n.transact(3, obtain, obtain2, 0) || C0023b.m95H0() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0023b.m95H0().mo44I7(bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Q3 */
            public Bundle mo45Q3(Bundle bundle) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0023b.f33n);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f42n.transact(2, obtain, obtain2, 0) && C0023b.m95H0() != null) {
                        return C0023b.m95H0().mo45Q3(bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f42n;
            }

            /* renamed from: j3 */
            public Bundle mo46j3() throws RemoteException {
                Bundle bundle;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0023b.f33n);
                    if (!this.f42n.transact(7, obtain, obtain2, 0) && C0023b.m95H0() != null) {
                        return C0023b.m95H0().mo46j3();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l7 */
            public int mo47l7() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0023b.f33n);
                    if (!this.f42n.transact(4, obtain, obtain2, 0) && C0023b.m95H0() != null) {
                        return C0023b.m95H0().mo47l7();
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m0 */
            public String mo54m0() {
                return C0023b.f33n;
            }

            /* renamed from: p7 */
            public Bundle mo48p7(Bundle bundle) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0023b.f33n);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f42n.transact(6, obtain, obtain2, 0) && C0023b.m95H0() != null) {
                        return C0023b.m95H0().mo48p7(bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s2 */
            public Bundle mo49s2(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0023b.f33n);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f42n.transact(9, obtain, obtain2, 0) && C0023b.m95H0() != null) {
                        return C0023b.m95H0().mo49s2(str, bundle, iBinder);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0023b() {
            attachInterface(this, f33n);
        }

        /* renamed from: H0 */
        public static C0021b m95H0() {
            return C0024a.f41o;
        }

        /* renamed from: O0 */
        public static boolean m96O0(C0021b bVar) {
            if (C0024a.f41o != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (bVar == null) {
                return false;
            } else {
                C0024a.f41o = bVar;
                return true;
            }
        }

        /* renamed from: m0 */
        public static C0021b m97m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f33n);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0021b)) {
                return new C0024a(iBinder);
            }
            return (C0021b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) throws android.os.RemoteException {
            /*
                r5 = this;
                r0 = 9
                r1 = 0
                r2 = 0
                r3 = 1
                java.lang.String r4 = "android.support.customtabs.trusted.ITrustedWebActivityService"
                if (r6 == r0) goto L_0x00bb
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r6 == r0) goto L_0x00b7
                switch(r6) {
                    case 2: goto L_0x0091;
                    case 3: goto L_0x0078;
                    case 4: goto L_0x006a;
                    case 5: goto L_0x0053;
                    case 6: goto L_0x002d;
                    case 7: goto L_0x0016;
                    default: goto L_0x0011;
                }
            L_0x0011:
                boolean r6 = super.onTransact(r6, r7, r8, r9)
                return r6
            L_0x0016:
                r7.enforceInterface(r4)
                android.os.Bundle r6 = r5.mo46j3()
                r8.writeNoException()
                if (r6 == 0) goto L_0x0029
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x002c
            L_0x0029:
                r8.writeInt(r2)
            L_0x002c:
                return r3
            L_0x002d:
                r7.enforceInterface(r4)
                int r6 = r7.readInt()
                if (r6 == 0) goto L_0x003f
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r6.createFromParcel(r7)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x003f:
                android.os.Bundle r6 = r5.mo48p7(r1)
                r8.writeNoException()
                if (r6 == 0) goto L_0x004f
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x0052
            L_0x004f:
                r8.writeInt(r2)
            L_0x0052:
                return r3
            L_0x0053:
                r7.enforceInterface(r4)
                android.os.Bundle r6 = r5.mo43G5()
                r8.writeNoException()
                if (r6 == 0) goto L_0x0066
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x0069
            L_0x0066:
                r8.writeInt(r2)
            L_0x0069:
                return r3
            L_0x006a:
                r7.enforceInterface(r4)
                int r6 = r5.mo47l7()
                r8.writeNoException()
                r8.writeInt(r6)
                return r3
            L_0x0078:
                r7.enforceInterface(r4)
                int r6 = r7.readInt()
                if (r6 == 0) goto L_0x008a
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r6.createFromParcel(r7)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x008a:
                r5.mo44I7(r1)
                r8.writeNoException()
                return r3
            L_0x0091:
                r7.enforceInterface(r4)
                int r6 = r7.readInt()
                if (r6 == 0) goto L_0x00a3
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r6.createFromParcel(r7)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x00a3:
                android.os.Bundle r6 = r5.mo45Q3(r1)
                r8.writeNoException()
                if (r6 == 0) goto L_0x00b3
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x00b6
            L_0x00b3:
                r8.writeInt(r2)
            L_0x00b6:
                return r3
            L_0x00b7:
                r8.writeString(r4)
                return r3
            L_0x00bb:
                r7.enforceInterface(r4)
                java.lang.String r6 = r7.readString()
                int r9 = r7.readInt()
                if (r9 == 0) goto L_0x00d1
                android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r7)
                r1 = r9
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x00d1:
                android.os.IBinder r7 = r7.readStrongBinder()
                android.os.Bundle r6 = r5.mo49s2(r6, r1, r7)
                r8.writeNoException()
                if (r6 == 0) goto L_0x00e5
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x00e8
            L_0x00e5:
                r8.writeInt(r2)
            L_0x00e8:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.trusted.C0021b.C0023b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: G5 */
    Bundle mo43G5() throws RemoteException;

    /* renamed from: I7 */
    void mo44I7(Bundle bundle) throws RemoteException;

    /* renamed from: Q3 */
    Bundle mo45Q3(Bundle bundle) throws RemoteException;

    /* renamed from: j3 */
    Bundle mo46j3() throws RemoteException;

    /* renamed from: l7 */
    int mo47l7() throws RemoteException;

    /* renamed from: p7 */
    Bundle mo48p7(Bundle bundle) throws RemoteException;

    /* renamed from: s2 */
    Bundle mo49s2(String str, Bundle bundle, IBinder iBinder) throws RemoteException;
}
