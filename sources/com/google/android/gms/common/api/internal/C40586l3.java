package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.common.api.internal.l3 */
public final class C40586l3 extends C40556g3 {

    /* renamed from: c */
    public final C40602o2 f103481c;

    public C40586l3(C40602o2 o2Var, C31049l lVar) {
        super(3, lVar);
        this.f103481c = o2Var;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo133907d(@C0359n0 C40559h0 h0Var, boolean z) {
    }

    /* renamed from: f */
    public final boolean mo133897f(C40637v1 v1Var) {
        return this.f103481c.f103518a.mo134031f();
    }

    @C0363p0
    /* renamed from: g */
    public final Feature[] mo133898g(C40637v1 v1Var) {
        return this.f103481c.f103518a.mo134029c();
    }

    /* renamed from: h */
    public final void mo133908h(C40637v1 v1Var) throws RemoteException {
        this.f103481c.f103518a.mo134013d(v1Var.mo134072s(), this.f103374b);
        C40592n.C40593a b = this.f103481c.f103518a.mo134028b();
        if (b != null) {
            v1Var.mo134073u().put(b, this.f103481c);
        }
    }
}
