package com.google.android.gms.internal.gtm;

import com.carrefour.fid.android.data.cache.C36380c;
import com.google.android.gms.common.util.C40974d0;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.r6 */
public final class C41541r6 implements C41542r7 {

    /* renamed from: a */
    public final /* synthetic */ C41589t6 f104922a;

    public C41541r6(C41589t6 t6Var) {
        this.f104922a = t6Var;
    }

    /* renamed from: a */
    public final void mo135800a(C41180c6 c6Var) {
        this.f104922a.mo135851n(c6Var.mo135161b());
        long b = c6Var.mo135161b();
        StringBuilder sb = new StringBuilder(57);
        sb.append("Permanent failure dispatching hitId: ");
        sb.append(b);
        C41493p6.m168152d(sb.toString());
    }

    /* renamed from: b */
    public final void mo135801b(C41180c6 c6Var) {
        long a = c6Var.mo135160a();
        if (a == 0) {
            C41589t6.m168402k(this.f104922a, c6Var.mo135161b(), this.f104922a.f105004f.mo134768a());
        } else if (a + C36380c.f89987j < this.f104922a.f105004f.mo134768a()) {
            this.f104922a.mo135851n(c6Var.mo135161b());
            long b = c6Var.mo135161b();
            StringBuilder sb = new StringBuilder(47);
            sb.append("Giving up on failed hitId: ");
            sb.append(b);
            C41493p6.m168152d(sb.toString());
        }
    }
}
