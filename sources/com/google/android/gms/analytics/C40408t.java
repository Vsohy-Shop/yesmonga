package com.google.android.gms.analytics;

import com.google.android.gms.analytics.C40408t;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40979g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.analytics.t */
public class C40408t<T extends C40408t> {

    /* renamed from: a */
    public final C40372a0 f102985a;

    /* renamed from: b */
    public final C40405q f102986b;

    /* renamed from: c */
    public final List<C40406r> f102987c = new ArrayList();

    @C40974d0
    public C40408t(C40372a0 a0Var, C40979g gVar) {
        C40843u.m166202l(a0Var);
        this.f102985a = a0Var;
        C40405q qVar = new C40405q(this, gVar);
        qVar.mo133437h();
        this.f102986b = qVar;
    }

    /* renamed from: a */
    public void mo133416a(C40405q qVar) {
        throw null;
    }

    /* renamed from: b */
    public final C40372a0 mo133445b() {
        return this.f102985a;
    }

    /* renamed from: c */
    public final void mo133446c(C40405q qVar) {
        for (C40406r zza : this.f102987c) {
            zza.zza();
        }
    }
}
