package com.carrefour.fid.android.account.presentation.viewmodels.signin;

import com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase;
import com.carrefour.fid.android.account.presentation.analytics.SignInAnalyticsInterfaceDelegate;
import com.carrefour.fid.android.domain.interactors.basket.C37587n;
import com.carrefour.fid.android.domain.interactors.consent.C37629a;
import com.carrefour.fid.android.domain.interactors.loyalty.C37701e;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.signin.a */
public final class C13700a implements C10324h<SignInViewModel> {

    /* renamed from: a */
    public final Provider<GetLoginUseCase> f33313a;

    /* renamed from: b */
    public final Provider<C37878e> f33314b;

    /* renamed from: c */
    public final Provider<C37629a> f33315c;

    /* renamed from: d */
    public final Provider<C37587n> f33316d;

    /* renamed from: e */
    public final Provider<SignInAnalyticsInterfaceDelegate> f33317e;

    /* renamed from: f */
    public final Provider<C28994a> f33318f;

    /* renamed from: g */
    public final Provider<C37701e> f33319g;

    public C13700a(Provider<GetLoginUseCase> provider, Provider<C37878e> provider2, Provider<C37629a> provider3, Provider<C37587n> provider4, Provider<SignInAnalyticsInterfaceDelegate> provider5, Provider<C28994a> provider6, Provider<C37701e> provider7) {
        this.f33313a = provider;
        this.f33314b = provider2;
        this.f33315c = provider3;
        this.f33316d = provider4;
        this.f33317e = provider5;
        this.f33318f = provider6;
        this.f33319g = provider7;
    }

    /* renamed from: a */
    public static C13700a m58554a(Provider<GetLoginUseCase> provider, Provider<C37878e> provider2, Provider<C37629a> provider3, Provider<C37587n> provider4, Provider<SignInAnalyticsInterfaceDelegate> provider5, Provider<C28994a> provider6, Provider<C37701e> provider7) {
        return new C13700a(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: c */
    public static SignInViewModel m58555c(GetLoginUseCase getLoginUseCase, C37878e eVar, C37629a aVar, C37587n nVar, SignInAnalyticsInterfaceDelegate signInAnalyticsInterfaceDelegate, C28994a aVar2, C37701e eVar2) {
        return new SignInViewModel(getLoginUseCase, eVar, aVar, nVar, signInAnalyticsInterfaceDelegate, aVar2, eVar2);
    }

    /* renamed from: b */
    public SignInViewModel get() {
        return m58555c(this.f33313a.get(), this.f33314b.get(), this.f33315c.get(), this.f33316d.get(), this.f33317e.get(), this.f33318f.get(), this.f33319g.get());
    }
}
