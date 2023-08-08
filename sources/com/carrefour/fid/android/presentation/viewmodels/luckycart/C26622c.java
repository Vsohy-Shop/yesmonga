package com.carrefour.fid.android.presentation.viewmodels.luckycart;

import com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.luckycart.c */
public final class C26622c implements C10324h<LuckyCartViewModel> {

    /* renamed from: a */
    public final Provider<GetLuckyCartTicketUseCase> f65029a;

    public C26622c(Provider<GetLuckyCartTicketUseCase> provider) {
        this.f65029a = provider;
    }

    /* renamed from: a */
    public static C26622c m113201a(Provider<GetLuckyCartTicketUseCase> provider) {
        return new C26622c(provider);
    }

    /* renamed from: c */
    public static LuckyCartViewModel m113202c(GetLuckyCartTicketUseCase getLuckyCartTicketUseCase) {
        return new LuckyCartViewModel(getLuckyCartTicketUseCase);
    }

    /* renamed from: b */
    public LuckyCartViewModel get() {
        return m113202c(this.f65029a.get());
    }
}
