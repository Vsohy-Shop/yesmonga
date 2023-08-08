package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40785m;

/* renamed from: com.google.android.gms.common.internal.a */
public class C40729a extends C40785m.C40786a {
    @C0363p0
    @C40473a
    /* renamed from: O0 */
    public static Account m165753O0(@C0359n0 C40785m mVar) {
        Account account = null;
        if (mVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = mVar.zzb();
            } catch (RemoteException unused) {
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }

    public final boolean equals(@C0363p0 Object obj) {
        throw null;
    }

    @C0359n0
    public final Account zzb() {
        throw null;
    }
}
