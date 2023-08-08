package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.common.api.internal.k3 */
public final class C40581k3 extends C40603o3 {

    /* renamed from: b */
    public final C40538e.C40539a f103476b;

    public C40581k3(int i, C40538e.C40539a aVar) {
        super(i);
        this.f103476b = (C40538e.C40539a) C40843u.m166203m(aVar, "Null methods are not runnable.");
    }

    /* renamed from: a */
    public final void mo133904a(@C0359n0 Status status) {
        try {
            this.f103476b.mo85730b(status);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: b */
    public final void mo133905b(@C0359n0 Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f103476b.mo85730b(new Status(10, simpleName + ": " + localizedMessage));
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: c */
    public final void mo133906c(C40637v1 v1Var) throws DeadObjectException {
        try {
            this.f103476b.mo133870A(v1Var.mo134072s());
        } catch (RuntimeException e) {
            mo133905b(e);
        }
    }

    /* renamed from: d */
    public final void mo133907d(@C0359n0 C40559h0 h0Var, boolean z) {
        h0Var.mo133910c(this.f103476b, z);
    }
}
