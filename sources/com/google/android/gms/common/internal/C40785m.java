package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.internal.common.C41107i;
import com.google.android.gms.internal.common.C41108j;

/* renamed from: com.google.android.gms.common.internal.m */
public interface C40785m extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    public static abstract class C40786a extends C41107i implements C40785m {
        public C40786a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @C0359n0
        /* renamed from: H0 */
        public static C40785m m165965H0(@C0359n0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C40785m) {
                return (C40785m) queryLocalInterface;
            }
            return new C40776j2(iBinder);
        }

        /* renamed from: m0 */
        public final boolean mo134408m0(int i, @C0359n0 Parcel parcel, @C0359n0 Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            Account zzb = zzb();
            parcel2.writeNoException();
            C41108j.m166986e(parcel2, zzb);
            return true;
        }
    }

    @C0359n0
    Account zzb() throws RemoteException;
}
