package com.carrefour.fid.android.domain.interactors.luckycart;

import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.repositories.C38196e;
import com.carrefour.fid.android.performance.C38328d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.luckycart.d */
public final class C37710d implements C10324h<GetLuckyCartTicketUseCase> {

    /* renamed from: a */
    public final Provider<C38196e> f94593a;

    /* renamed from: b */
    public final Provider<C37807b> f94594b;

    /* renamed from: c */
    public final Provider<C38328d> f94595c;

    public C37710d(Provider<C38196e> provider, Provider<C37807b> provider2, Provider<C38328d> provider3) {
        this.f94593a = provider;
        this.f94594b = provider2;
        this.f94595c = provider3;
    }

    /* renamed from: a */
    public static C37710d m154517a(Provider<C38196e> provider, Provider<C37807b> provider2, Provider<C38328d> provider3) {
        return new C37710d(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static GetLuckyCartTicketUseCase m154518c(C38196e eVar, C37807b bVar, C38328d dVar) {
        return new GetLuckyCartTicketUseCase(eVar, bVar, dVar);
    }

    /* renamed from: b */
    public GetLuckyCartTicketUseCase get() {
        return m154518c(this.f94593a.get(), this.f94594b.get(), this.f94595c.get());
    }
}
