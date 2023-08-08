package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p072a.C40034a;
import com.google.android.p072a.C40035b;
import com.google.android.p072a.C40036c;

/* renamed from: com.google.android.finsky.externalreferrer.a */
public interface C40327a extends IInterface {

    /* renamed from: com.google.android.finsky.externalreferrer.a$a */
    public static abstract class C40328a extends C40035b implements C40327a {

        /* renamed from: com.google.android.finsky.externalreferrer.a$a$a */
        public static class C40329a extends C40034a implements C40327a {
            public C40329a(IBinder iBinder) {
                super(iBinder);
            }

            /* renamed from: H */
            public final Bundle mo132989H(Bundle bundle) throws RemoteException {
                Parcel m0 = mo132539m0();
                C40036c.m163043b(m0, bundle);
                Parcel H0 = mo132537H0(m0);
                Bundle bundle2 = (Bundle) C40036c.m163042a(H0, Bundle.CREATOR);
                H0.recycle();
                return bundle2;
            }
        }

        /* renamed from: H0 */
        public static C40327a m163846H0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof C40327a) {
                return (C40327a) queryLocalInterface;
            }
            return new C40329a(iBinder);
        }

        /* renamed from: m0 */
        public final boolean mo132541m0(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Bundle H = mo132989H((Bundle) C40036c.m163042a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            C40036c.m163044c(parcel2, H);
            return true;
        }
    }

    /* renamed from: H */
    Bundle mo132989H(Bundle bundle) throws RemoteException;
}
