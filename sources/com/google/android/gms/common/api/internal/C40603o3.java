package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.o3 */
public abstract class C40603o3 {

    /* renamed from: a */
    public final int f103521a;

    public C40603o3(int i) {
        this.f103521a = i;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m165310e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo133904a(@C0359n0 Status status);

    /* renamed from: b */
    public abstract void mo133905b(@C0359n0 Exception exc);

    /* renamed from: c */
    public abstract void mo133906c(C40637v1 v1Var) throws DeadObjectException;

    /* renamed from: d */
    public abstract void mo133907d(@C0359n0 C40559h0 h0Var, boolean z);
}
