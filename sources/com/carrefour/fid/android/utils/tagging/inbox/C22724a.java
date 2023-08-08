package com.carrefour.fid.android.utils.tagging.inbox;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.domain.interactors.service.C37835r;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.C12074o0;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.ApplicationScope"})
@C10338r
/* renamed from: com.carrefour.fid.android.utils.tagging.inbox.a */
public final class C22724a implements C10324h<AudienceTrackingManager> {

    /* renamed from: a */
    public final Provider<C12074o0> f58228a;

    /* renamed from: b */
    public final Provider<AccountRepository> f58229b;

    /* renamed from: c */
    public final Provider<C37835r> f58230c;

    /* renamed from: d */
    public final Provider<C28994a> f58231d;

    public C22724a(Provider<C12074o0> provider, Provider<AccountRepository> provider2, Provider<C37835r> provider3, Provider<C28994a> provider4) {
        this.f58228a = provider;
        this.f58229b = provider2;
        this.f58230c = provider3;
        this.f58231d = provider4;
    }

    /* renamed from: a */
    public static C22724a m102900a(Provider<C12074o0> provider, Provider<AccountRepository> provider2, Provider<C37835r> provider3, Provider<C28994a> provider4) {
        return new C22724a(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static AudienceTrackingManager m102901c(C12074o0 o0Var, AccountRepository accountRepository, C37835r rVar, C28994a aVar) {
        return new AudienceTrackingManager(o0Var, accountRepository, rVar, aVar);
    }

    /* renamed from: b */
    public AudienceTrackingManager get() {
        return m102901c(this.f58228a.get(), this.f58229b.get(), this.f58230c.get(), this.f58231d.get());
    }
}
