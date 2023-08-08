package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: android.support.customtabs.b */
public interface C0009b extends IInterface {

    /* renamed from: android.support.customtabs.b$a */
    public static class C0010a implements C0009b {
        /* renamed from: B7 */
        public boolean mo14B7(C0005a aVar) throws RemoteException {
            return false;
        }

        /* renamed from: L1 */
        public boolean mo15L1(C0005a aVar, Uri uri, int i, Bundle bundle) throws RemoteException {
            return false;
        }

        /* renamed from: L6 */
        public boolean mo16L6(long j) throws RemoteException {
            return false;
        }

        /* renamed from: T7 */
        public boolean mo17T7(C0005a aVar, Uri uri) throws RemoteException {
            return false;
        }

        /* renamed from: W3 */
        public boolean mo18W3(C0005a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        public IBinder asBinder() {
            return null;
        }

        /* renamed from: k2 */
        public Bundle mo19k2(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        /* renamed from: q1 */
        public boolean mo20q1(C0005a aVar, int i, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        /* renamed from: q5 */
        public boolean mo21q5(C0005a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        /* renamed from: r7 */
        public int mo22r7(C0005a aVar, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        /* renamed from: v3 */
        public boolean mo23v3(C0005a aVar, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        /* renamed from: z3 */
        public boolean mo24z3(C0005a aVar, Bundle bundle) throws RemoteException {
            return false;
        }
    }

    /* renamed from: android.support.customtabs.b$b */
    public static abstract class C0011b extends Binder implements C0009b {

        /* renamed from: n */
        public static final String f10n = "android.support.customtabs.ICustomTabsService";

        /* renamed from: o */
        public static final int f11o = 2;

        /* renamed from: p */
        public static final int f12p = 3;

        /* renamed from: q */
        public static final int f13q = 10;

        /* renamed from: r */
        public static final int f14r = 4;

        /* renamed from: s */
        public static final int f15s = 5;

        /* renamed from: t */
        public static final int f16t = 6;

        /* renamed from: u */
        public static final int f17u = 7;

        /* renamed from: v */
        public static final int f18v = 11;

        /* renamed from: w */
        public static final int f19w = 8;

        /* renamed from: x */
        public static final int f20x = 9;

        /* renamed from: y */
        public static final int f21y = 12;

        /* renamed from: android.support.customtabs.b$b$a */
        public static class C0012a implements C0009b {

            /* renamed from: o */
            public static C0009b f22o;

            /* renamed from: n */
            public IBinder f23n;

            public C0012a(IBinder iBinder) {
                this.f23n = iBinder;
            }

            /* renamed from: B7 */
            public boolean mo14B7(C0005a aVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0011b.f10n);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    if (!this.f23n.transact(3, obtain, obtain2, 0) && C0011b.m49H0() != null) {
                        return C0011b.m49H0().mo14B7(aVar);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: L1 */
            public boolean mo15L1(C0005a aVar, Uri uri, int i, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0011b.f10n);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f23n.transact(12, obtain, obtain2, 0) && C0011b.m49H0() != null) {
                        return C0011b.m49H0().mo15L1(aVar, uri, i, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: L6 */
            public boolean mo16L6(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0011b.f10n);
                    obtain.writeLong(j);
                    boolean z = false;
                    if (!this.f23n.transact(2, obtain, obtain2, 0) && C0011b.m49H0() != null) {
                        return C0011b.m49H0().mo16L6(j);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: T7 */
            public boolean mo17T7(C0005a aVar, Uri uri) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0011b.f10n);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f23n.transact(7, obtain, obtain2, 0) && C0011b.m49H0() != null) {
                        return C0011b.m49H0().mo17T7(aVar, uri);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: W3 */
            public boolean mo18W3(C0005a aVar, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0011b.f10n);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f23n.transact(6, obtain, obtain2, 0) && C0011b.m49H0() != null) {
                        return C0011b.m49H0().mo18W3(aVar, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f23n;
            }

            /* renamed from: k2 */
            public Bundle mo19k2(String str, Bundle bundle) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0011b.f10n);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f23n.transact(5, obtain, obtain2, 0) && C0011b.m49H0() != null) {
                        return C0011b.m49H0().mo19k2(str, bundle);
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
            public String mo29m0() {
                return C0011b.f10n;
            }

            /* renamed from: q1 */
            public boolean mo20q1(C0005a aVar, int i, Uri uri, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0011b.f10n);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f23n.transact(9, obtain, obtain2, 0) && C0011b.m49H0() != null) {
                        return C0011b.m49H0().mo20q1(aVar, i, uri, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q5 */
            public boolean mo21q5(C0005a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0011b.f10n);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    if (!this.f23n.transact(4, obtain, obtain2, 0) && C0011b.m49H0() != null) {
                        return C0011b.m49H0().mo21q5(aVar, uri, bundle, list);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r7 */
            public int mo22r7(C0005a aVar, String str, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0011b.f10n);
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
                    if (!this.f23n.transact(8, obtain, obtain2, 0) && C0011b.m49H0() != null) {
                        return C0011b.m49H0().mo22r7(aVar, str, bundle);
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

            /* renamed from: v3 */
            public boolean mo23v3(C0005a aVar, Uri uri, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0011b.f10n);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f23n.transact(11, obtain, obtain2, 0) && C0011b.m49H0() != null) {
                        return C0011b.m49H0().mo23v3(aVar, uri, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: z3 */
            public boolean mo24z3(C0005a aVar, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0011b.f10n);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f23n.transact(10, obtain, obtain2, 0) && C0011b.m49H0() != null) {
                        return C0011b.m49H0().mo24z3(aVar, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0011b() {
            attachInterface(this, f10n);
        }

        /* renamed from: H0 */
        public static C0009b m49H0() {
            return C0012a.f22o;
        }

        /* renamed from: O0 */
        public static boolean m50O0(C0009b bVar) {
            if (C0012a.f22o != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (bVar == null) {
                return false;
            } else {
                C0012a.f22o = bVar;
                return true;
            }
        }

        /* renamed from: m0 */
        public static C0009b m51m0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f10n);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0009b)) {
                return new C0012a(iBinder);
            }
            return (C0009b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.net.Uri} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v34 */
        /* JADX WARNING: type inference failed for: r0v35 */
        /* JADX WARNING: type inference failed for: r0v36 */
        /* JADX WARNING: type inference failed for: r0v37 */
        /* JADX WARNING: type inference failed for: r0v38 */
        /* JADX WARNING: type inference failed for: r0v39 */
        /* JADX WARNING: type inference failed for: r0v40 */
        /* JADX WARNING: type inference failed for: r0v41 */
        /* JADX WARNING: type inference failed for: r0v42 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.customtabs.ICustomTabsService"
                if (r5 == r0) goto L_0x01dd
                r0 = 0
                switch(r5) {
                    case 2: goto L_0x01cb;
                    case 3: goto L_0x01b5;
                    case 4: goto L_0x017b;
                    case 5: goto L_0x0150;
                    case 6: goto L_0x012b;
                    case 7: goto L_0x0106;
                    case 8: goto L_0x00dd;
                    case 9: goto L_0x00a4;
                    case 10: goto L_0x007f;
                    case 11: goto L_0x004a;
                    case 12: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0011:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0005a.C0007b.m19m0(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x002b
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x002c
            L_0x002b:
                r8 = r0
            L_0x002c:
                int r2 = r6.readInt()
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x003f
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x003f:
                boolean r5 = r4.mo15L1(r5, r8, r2, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x004a:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0005a.C0007b.m19m0(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0064
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0065
            L_0x0064:
                r8 = r0
            L_0x0065:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0074
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0074:
                boolean r5 = r4.mo23v3(r5, r8, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x007f:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0005a.C0007b.m19m0(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0099
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0099:
                boolean r5 = r4.mo24z3(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00a4:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0005a.C0007b.m19m0(r5)
                int r8 = r6.readInt()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00c2
                android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r6)
                android.net.Uri r2 = (android.net.Uri) r2
                goto L_0x00c3
            L_0x00c2:
                r2 = r0
            L_0x00c3:
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x00d2
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00d2:
                boolean r5 = r4.mo20q1(r5, r8, r2, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00dd:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0005a.C0007b.m19m0(r5)
                java.lang.String r8 = r6.readString()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00fb
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00fb:
                int r5 = r4.mo22r7(r5, r8, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0106:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0005a.C0007b.m19m0(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0120
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x0120:
                boolean r5 = r4.mo17T7(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x012b:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0005a.C0007b.m19m0(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0145
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0145:
                boolean r5 = r4.mo18W3(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0150:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0166
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0166:
                android.os.Bundle r5 = r4.mo19k2(r5, r0)
                r7.writeNoException()
                if (r5 == 0) goto L_0x0176
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x017a
            L_0x0176:
                r5 = 0
                r7.writeInt(r5)
            L_0x017a:
                return r1
            L_0x017b:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0005a.C0007b.m19m0(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0195
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0196
            L_0x0195:
                r8 = r0
            L_0x0196:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x01a4
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x01a4:
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.util.ArrayList r6 = r6.createTypedArrayList(r2)
                boolean r5 = r4.mo21q5(r5, r8, r0, r6)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01b5:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0005a.C0007b.m19m0(r5)
                boolean r5 = r4.mo14B7(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01cb:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                boolean r5 = r4.mo16L6(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01dd:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.C0009b.C0011b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: B7 */
    boolean mo14B7(C0005a aVar) throws RemoteException;

    /* renamed from: L1 */
    boolean mo15L1(C0005a aVar, Uri uri, int i, Bundle bundle) throws RemoteException;

    /* renamed from: L6 */
    boolean mo16L6(long j) throws RemoteException;

    /* renamed from: T7 */
    boolean mo17T7(C0005a aVar, Uri uri) throws RemoteException;

    /* renamed from: W3 */
    boolean mo18W3(C0005a aVar, Bundle bundle) throws RemoteException;

    /* renamed from: k2 */
    Bundle mo19k2(String str, Bundle bundle) throws RemoteException;

    /* renamed from: q1 */
    boolean mo20q1(C0005a aVar, int i, Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: q5 */
    boolean mo21q5(C0005a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    /* renamed from: r7 */
    int mo22r7(C0005a aVar, String str, Bundle bundle) throws RemoteException;

    /* renamed from: v3 */
    boolean mo23v3(C0005a aVar, Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: z3 */
    boolean mo24z3(C0005a aVar, Bundle bundle) throws RemoteException;
}
