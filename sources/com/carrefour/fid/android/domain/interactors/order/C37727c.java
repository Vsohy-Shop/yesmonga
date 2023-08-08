package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.domain.repositories.C38192a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.order.c */
public final class C37727c implements C10324h<AppSetAdditionalOrderContextUseCase> {

    /* renamed from: a */
    public final Provider<C38192a> f94709a;

    public C37727c(Provider<C38192a> provider) {
        this.f94709a = provider;
    }

    /* renamed from: a */
    public static C37727c m154655a(Provider<C38192a> provider) {
        return new C37727c(provider);
    }

    /* renamed from: c */
    public static AppSetAdditionalOrderContextUseCase m154656c(C38192a aVar) {
        return new AppSetAdditionalOrderContextUseCase(aVar);
    }

    /* renamed from: b */
    public AppSetAdditionalOrderContextUseCase get() {
        return m154656c(this.f94709a.get());
    }
}
