package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C41092a;
import com.google.android.gms.internal.common.C41108j;

/* renamed from: com.google.android.gms.common.internal.j2 */
public final class C40776j2 extends C41092a implements C40785m {
    public C40776j2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account zzb() throws RemoteException {
        Parcel m0 = mo134907m0(2, mo134905T6());
        Account account = (Account) C41108j.m166982a(m0, Account.CREATOR);
        m0.recycle();
        return account;
    }
}
