package com.carrefour.fid.android.account.presentation.viewmodels.address;

import com.carrefour.fid.android.account.domain.events.C13239a;
import com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetVerificationDQEAddressUseCase;
import com.carrefour.fid.android.account.presentation.analytics.C13287b;
import com.carrefour.fid.android.domain.interactors.service.C37811a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.MainImmediateDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.a */
public final class C13633a implements C10324h<AccountAddressViewModel> {

    /* renamed from: a */
    public final Provider<GetDQEAddressSuggestionsUseCase> f33182a;

    /* renamed from: b */
    public final Provider<GetVerificationDQEAddressUseCase> f33183b;

    /* renamed from: c */
    public final Provider<UpdateAndCheckUserAddressUseCase> f33184c;

    /* renamed from: d */
    public final Provider<C37811a> f33185d;

    /* renamed from: e */
    public final Provider<C13239a> f33186e;

    /* renamed from: f */
    public final Provider<C13287b> f33187f;

    /* renamed from: g */
    public final Provider<CoroutineDispatcher> f33188g;

    public C13633a(Provider<GetDQEAddressSuggestionsUseCase> provider, Provider<GetVerificationDQEAddressUseCase> provider2, Provider<UpdateAndCheckUserAddressUseCase> provider3, Provider<C37811a> provider4, Provider<C13239a> provider5, Provider<C13287b> provider6, Provider<CoroutineDispatcher> provider7) {
        this.f33182a = provider;
        this.f33183b = provider2;
        this.f33184c = provider3;
        this.f33185d = provider4;
        this.f33186e = provider5;
        this.f33187f = provider6;
        this.f33188g = provider7;
    }

    /* renamed from: a */
    public static C13633a m58353a(Provider<GetDQEAddressSuggestionsUseCase> provider, Provider<GetVerificationDQEAddressUseCase> provider2, Provider<UpdateAndCheckUserAddressUseCase> provider3, Provider<C37811a> provider4, Provider<C13239a> provider5, Provider<C13287b> provider6, Provider<CoroutineDispatcher> provider7) {
        return new C13633a(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: c */
    public static AccountAddressViewModel m58354c(GetDQEAddressSuggestionsUseCase getDQEAddressSuggestionsUseCase, GetVerificationDQEAddressUseCase getVerificationDQEAddressUseCase, UpdateAndCheckUserAddressUseCase updateAndCheckUserAddressUseCase, C37811a aVar, C13239a aVar2, C13287b bVar, CoroutineDispatcher coroutineDispatcher) {
        return new AccountAddressViewModel(getDQEAddressSuggestionsUseCase, getVerificationDQEAddressUseCase, updateAndCheckUserAddressUseCase, aVar, aVar2, bVar, coroutineDispatcher);
    }

    /* renamed from: b */
    public AccountAddressViewModel get() {
        return m58354c(this.f33182a.get(), this.f33183b.get(), this.f33184c.get(), this.f33185d.get(), this.f33186e.get(), this.f33187f.get(), this.f33188g.get());
    }
}
