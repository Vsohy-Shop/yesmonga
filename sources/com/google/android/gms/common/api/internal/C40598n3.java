package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.common.api.internal.n3 */
public final class C40598n3 extends C40556g3 {

    /* renamed from: c */
    public final C40592n.C40593a f103514c;

    public C40598n3(C40592n.C40593a aVar, C31049l lVar) {
        super(4, lVar);
        this.f103514c = aVar;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo133907d(@C0359n0 C40559h0 h0Var, boolean z) {
    }

    /* renamed from: f */
    public final boolean mo133897f(C40637v1 v1Var) {
        C40602o2 o2Var = (C40602o2) v1Var.mo134073u().get(this.f103514c);
        if (o2Var == null || !o2Var.f103518a.mo134031f()) {
            return false;
        }
        return true;
    }

    @C0363p0
    /* renamed from: g */
    public final Feature[] mo133898g(C40637v1 v1Var) {
        C40602o2 o2Var = (C40602o2) v1Var.mo134073u().get(this.f103514c);
        if (o2Var == null) {
            return null;
        }
        return o2Var.f103518a.mo134029c();
    }

    /* renamed from: h */
    public final void mo133908h(C40637v1 v1Var) throws RemoteException {
        C40602o2 o2Var = (C40602o2) v1Var.mo134073u().remove(this.f103514c);
        if (o2Var != null) {
            o2Var.f103519b.mo133845b(v1Var.mo134072s(), this.f103374b);
            o2Var.f103518a.mo134027a();
            return;
        }
        this.f103374b.mo87745e(Boolean.FALSE);
    }
}
