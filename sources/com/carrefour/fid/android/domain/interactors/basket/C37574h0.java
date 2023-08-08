package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.basket.h0 */
public final class C37574h0 implements C10324h<ShowPreparationFeesUseCase> {

    /* renamed from: a */
    public final Provider<C37823k> f94339a;

    public C37574h0(Provider<C37823k> provider) {
        this.f94339a = provider;
    }

    /* renamed from: a */
    public static C37574h0 m154129a(Provider<C37823k> provider) {
        return new C37574h0(provider);
    }

    /* renamed from: c */
    public static ShowPreparationFeesUseCase m154130c(C37823k kVar) {
        return new ShowPreparationFeesUseCase(kVar);
    }

    /* renamed from: b */
    public ShowPreparationFeesUseCase get() {
        return m154130c(this.f94339a.get());
    }
}
