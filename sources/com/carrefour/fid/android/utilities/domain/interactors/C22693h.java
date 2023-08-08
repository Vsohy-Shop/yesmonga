package com.carrefour.fid.android.utilities.domain.interactors;

import com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.utilities.domain.interactors.h */
public final class C22693h implements C10324h<UtilitiesSuggestionsUseCase> {

    /* renamed from: a */
    public final Provider<UtilitiesRepository> f58114a;

    public C22693h(Provider<UtilitiesRepository> provider) {
        this.f58114a = provider;
    }

    /* renamed from: a */
    public static C22693h m102749a(Provider<UtilitiesRepository> provider) {
        return new C22693h(provider);
    }

    /* renamed from: c */
    public static UtilitiesSuggestionsUseCase m102750c(UtilitiesRepository utilitiesRepository) {
        return new UtilitiesSuggestionsUseCase(utilitiesRepository);
    }

    /* renamed from: b */
    public UtilitiesSuggestionsUseCase get() {
        return m102750c(this.f58114a.get());
    }
}
