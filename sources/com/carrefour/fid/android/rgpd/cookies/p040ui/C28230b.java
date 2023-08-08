package com.carrefour.fid.android.rgpd.cookies.p040ui;

import com.carrefour.fid.android.presentation.viewmodels.account.home.C25805g;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.rgpd.cookies.ui.b */
public final class C28230b implements C10158g<CookiesTracersPolicyFragment> {

    /* renamed from: a */
    public final Provider<C25805g> f68361a;

    public C28230b(Provider<C25805g> provider) {
        this.f68361a = provider;
    }

    /* renamed from: a */
    public static C10158g<CookiesTracersPolicyFragment> m118169a(Provider<C25805g> provider) {
        return new C28230b(provider);
    }

    @C10326j("com.carrefour.fid.android.rgpd.cookies.ui.CookiesTracersPolicyFragment.viewModel")
    /* renamed from: c */
    public static void m118170c(CookiesTracersPolicyFragment cookiesTracersPolicyFragment, C25805g gVar) {
        cookiesTracersPolicyFragment.f68359f = gVar;
    }

    /* renamed from: b */
    public void injectMembers(CookiesTracersPolicyFragment cookiesTracersPolicyFragment) {
        m118170c(cookiesTracersPolicyFragment, this.f68361a.get());
    }
}
