package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.common.api.internal.m3 */
public final class C40591m3 extends C40549f2 {

    /* renamed from: b */
    public final C40513a0 f103486b;

    /* renamed from: c */
    public final C31049l f103487c;

    /* renamed from: d */
    public final C40650y f103488d;

    public C40591m3(int i, C40513a0 a0Var, C31049l lVar, C40650y yVar) {
        super(i);
        this.f103487c = lVar;
        this.f103486b = a0Var;
        this.f103488d = yVar;
        if (i == 2 && a0Var.mo133811c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo133904a(@C0359n0 Status status) {
        this.f103487c.mo87744d(this.f103488d.mo95924a(status));
    }

    /* renamed from: b */
    public final void mo133905b(@C0359n0 Exception exc) {
        this.f103487c.mo87744d(exc);
    }

    /* renamed from: c */
    public final void mo133906c(C40637v1 v1Var) throws DeadObjectException {
        try {
            this.f103486b.mo133810b(v1Var.mo134072s(), this.f103487c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo133904a(C40603o3.m165310e(e2));
        } catch (RuntimeException e3) {
            this.f103487c.mo87744d(e3);
        }
    }

    /* renamed from: d */
    public final void mo133907d(@C0359n0 C40559h0 h0Var, boolean z) {
        h0Var.mo133911d(this.f103487c, z);
    }

    /* renamed from: f */
    public final boolean mo133897f(C40637v1 v1Var) {
        return this.f103486b.mo133811c();
    }

    @C0363p0
    /* renamed from: g */
    public final Feature[] mo133898g(C40637v1 v1Var) {
        return this.f103486b.mo133813e();
    }
}
