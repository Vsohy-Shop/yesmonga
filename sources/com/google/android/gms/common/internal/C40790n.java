package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.internal.common.C41107i;

/* renamed from: com.google.android.gms.common.internal.n */
public interface C40790n extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.n$a */
    public static abstract class C40791a extends C41107i implements C40790n {
        public C40791a() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @C0359n0
        /* renamed from: H0 */
        public static C40790n m165970H0(@C0359n0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof C40790n) {
                return (C40790n) queryLocalInterface;
            }
            return new C40780k2(iBinder);
        }

        /* renamed from: m0 */
        public final boolean mo134408m0(int i, @C0359n0 Parcel parcel, @C0359n0 Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel() throws RemoteException;
}
