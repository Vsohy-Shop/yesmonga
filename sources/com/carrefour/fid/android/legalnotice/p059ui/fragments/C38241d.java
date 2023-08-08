package com.carrefour.fid.android.legalnotice.p059ui.fragments;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.legalnotice.ui.fragments.d */
public final class C38241d implements C10158g<LegalNoticeFragment> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f96908a;

    /* renamed from: b */
    public final Provider<LoginRepository> f96909b;

    public C38241d(Provider<AppEnvironment> provider, Provider<LoginRepository> provider2) {
        this.f96908a = provider;
        this.f96909b = provider2;
    }

    /* renamed from: a */
    public static C10158g<LegalNoticeFragment> m158533a(Provider<AppEnvironment> provider, Provider<LoginRepository> provider2) {
        return new C38241d(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.legalnotice.ui.fragments.LegalNoticeFragment.environment")
    /* renamed from: b */
    public static void m158534b(LegalNoticeFragment legalNoticeFragment, AppEnvironment appEnvironment) {
        legalNoticeFragment.f96889f = appEnvironment;
    }

    @C10326j("com.carrefour.fid.android.legalnotice.ui.fragments.LegalNoticeFragment.loginRepository")
    /* renamed from: c */
    public static void m158535c(LegalNoticeFragment legalNoticeFragment, LoginRepository loginRepository) {
        legalNoticeFragment.f96890g = loginRepository;
    }

    /* renamed from: d */
    public void injectMembers(LegalNoticeFragment legalNoticeFragment) {
        m158534b(legalNoticeFragment, this.f96908a.get());
        m158535c(legalNoticeFragment, this.f96909b.get());
    }
}
