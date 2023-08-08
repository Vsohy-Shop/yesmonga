package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.common.api.internal.g3 */
public abstract class C40556g3 extends C40549f2 {

    /* renamed from: b */
    public final C31049l f103374b;

    public C40556g3(int i, C31049l lVar) {
        super(i);
        this.f103374b = lVar;
    }

    /* renamed from: a */
    public final void mo133904a(@C0359n0 Status status) {
        this.f103374b.mo87744d(new ApiException(status));
    }

    /* renamed from: b */
    public final void mo133905b(@C0359n0 Exception exc) {
        this.f103374b.mo87744d(exc);
    }

    /* renamed from: c */
    public final void mo133906c(C40637v1 v1Var) throws DeadObjectException {
        try {
            mo133908h(v1Var);
        } catch (DeadObjectException e) {
            mo133904a(C40603o3.m165310e(e));
            throw e;
        } catch (RemoteException e2) {
            mo133904a(C40603o3.m165310e(e2));
        } catch (RuntimeException e3) {
            this.f103374b.mo87744d(e3);
        }
    }

    /* renamed from: d */
    public void mo133907d(@C0359n0 C40559h0 h0Var, boolean z) {
    }

    /* renamed from: h */
    public abstract void mo133908h(C40637v1 v1Var) throws RemoteException;
}
