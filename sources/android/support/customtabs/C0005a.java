package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.customtabs.a */
public interface C0005a extends IInterface {

    /* renamed from: android.support.customtabs.a$a */
    public static class C0006a implements C0005a {
        /* renamed from: E3 */
        public void mo3E3(String str, Bundle bundle) throws RemoteException {
        }

        /* renamed from: Q7 */
        public void mo4Q7(int i, Bundle bundle) throws RemoteException {
        }

        /* renamed from: S0 */
        public void mo5S0(String str, Bundle bundle) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        /* renamed from: h2 */
        public Bundle mo6h2(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        /* renamed from: o8 */
        public void mo7o8(Bundle bundle) throws RemoteException {
        }

        /* renamed from: s8 */
        public void mo8s8(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
        }
    }

    /* renamed from: android.support.customtabs.a$b */
    public static abstract class C0007b extends Binder implements C0005a {

        /* renamed from: n */
        public static final String f1n = "android.support.customtabs.ICustomTabsCallback";

        /* renamed from: o */
        public static final int f2o = 2;

        /* renamed from: p */
        public static final int f3p = 3;

        /* renamed from: q */
        public static final int f4q = 4;

        /* renamed from: r */
        public static final int f5r = 5;

        /* renamed from: s */
        public static final int f6s = 6;

        /* renamed from: t */
        public static final int f7t = 7;

        /* renamed from: android.support.customtabs.a$b$a */
        public static class C0008a implements C0005a {

            /* renamed from: o */
            public static C0005a f8o;

            /* renamed from: n */
            public IBinder f9n;

            public C0008a(IBinder iBinder) {
                this.f9n = iBinder;
            }

            /* renamed from: E3 */
            public void mo3E3(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0007b.f1n);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f9n.transact(3, obtain, obtain2, 0) || C0007b.m17H0() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0007b.m17H0().mo3E3(str, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Q7 */
            public void mo4Q7(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0007b.f1n);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f9n.transact(2, obtain, obtain2, 0) || C0007b.m17H0() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0007b.m17H0().mo4Q7(i, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: S0 */
            public void mo5S0(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0007b.f1n);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f9n.transact(5, obtain, obtain2, 0) || C0007b.m17H0() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0007b.m17H0().mo5S0(str, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f9n;
            }

            /* renamed from: h2 */
            public Bundle mo6h2(String str, Bundle bundle) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0007b.f1n);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f9n.transact(7, obtain, obtain2, 0) && C0007b.m17H0() != null) {
                        return C0007b.m17H0().mo6h2(str, bundle);
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

            /* renamed from: m0 */
            public String mo13m0() {
                return C0007b.f1n;
            }

            /* renamed from: o8 */
            public void mo7o8(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0007b.f1n);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f9n.transact(4, obtain, obtain2, 0) || C0007b.m17H0() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0007b.m17H0().mo7o8(bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s8 */
            public void mo8s8(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                int i2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0007b.f1n);
                    obtain.writeInt(i);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f9n.transact(6, obtain, obtain2, 0) || C0007b.m17H0() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0007b.m17H0().mo8s8(i, uri, z, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0007b() {
            attachInterface(this, f1n);
        }

        /* renamed from: H0 */
        public static C0005a m17H0() {
            return C0008a.f8o;
        }

        /* renamed from: O0 */
        public static boolean m18O0(C0005a aVar) {
            if (C0008a.f8o != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (aVar == null) {
                return false;
            } else {
                C0008a.f8o = aVar;
                return true;
            }
        }

        /* renamed from: m0 */
        public static C0005a m19m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f1n);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0005a)) {
                return new C0008a(iBinder);
            }
            return (C0005a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.customtabs.ICustomTabsCallback"
                if (r5 == r0) goto L_0x00e0
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 2: goto L_0x00c3;
                    case 3: goto L_0x00a6;
                    case 4: goto L_0x008d;
                    case 5: goto L_0x0070;
                    case 6: goto L_0x003c;
                    case 7: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0028
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0028:
                android.os.Bundle r5 = r4.mo6h2(r5, r3)
                r7.writeNoException()
                if (r5 == 0) goto L_0x0038
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x003b
            L_0x0038:
                r7.writeInt(r0)
            L_0x003b:
                return r1
            L_0x003c:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0052
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0053
            L_0x0052:
                r8 = r3
            L_0x0053:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x005a
                r0 = r1
            L_0x005a:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0069
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r2.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0069:
                r4.mo8s8(r5, r8, r0, r3)
                r7.writeNoException()
                return r1
            L_0x0070:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0086
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0086:
                r4.mo5S0(r5, r3)
                r7.writeNoException()
                return r1
            L_0x008d:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x009f
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x009f:
                r4.mo7o8(r3)
                r7.writeNoException()
                return r1
            L_0x00a6:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00bc
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00bc:
                r4.mo3E3(r5, r3)
                r7.writeNoException()
                return r1
            L_0x00c3:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00d9
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00d9:
                r4.mo4Q7(r5, r3)
                r7.writeNoException()
                return r1
            L_0x00e0:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.C0005a.C0007b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: E3 */
    void mo3E3(String str, Bundle bundle) throws RemoteException;

    /* renamed from: Q7 */
    void mo4Q7(int i, Bundle bundle) throws RemoteException;

    /* renamed from: S0 */
    void mo5S0(String str, Bundle bundle) throws RemoteException;

    /* renamed from: h2 */
    Bundle mo6h2(String str, Bundle bundle) throws RemoteException;

    /* renamed from: o8 */
    void mo7o8(Bundle bundle) throws RemoteException;

    /* renamed from: s8 */
    void mo8s8(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;
}
