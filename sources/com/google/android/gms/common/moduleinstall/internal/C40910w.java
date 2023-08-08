package com.google.android.gms.common.moduleinstall.internal;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C40520b0;
import com.google.android.gms.common.api.internal.C40599o;
import com.google.android.gms.common.moduleinstall.C40876a;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.C31049l;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.w */
public final class C40910w extends C40886a {

    /* renamed from: n */
    public final /* synthetic */ AtomicReference f104078n;

    /* renamed from: o */
    public final /* synthetic */ C31049l f104079o;

    /* renamed from: p */
    public final /* synthetic */ C40876a f104080p;

    /* renamed from: q */
    public final /* synthetic */ C40887a0 f104081q;

    public C40910w(C40887a0 a0Var, AtomicReference atomicReference, C31049l lVar, C40876a aVar) {
        this.f104081q = a0Var;
        this.f104078n = atomicReference;
        this.f104079o = lVar;
        this.f104080p = aVar;
    }

    /* renamed from: e7 */
    public final void mo134592e7(Status status, @C0363p0 ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f104078n.set(moduleInstallResponse);
        }
        C40520b0.m164939d(status, null, this.f104079o);
        if (!status.mo133655p0() || (moduleInstallResponse != null && moduleInstallResponse.mo134556W())) {
            this.f104081q.mo133725s(C40599o.m165306c(this.f104080p, C40876a.class.getSimpleName()), 27306);
        }
    }
}
