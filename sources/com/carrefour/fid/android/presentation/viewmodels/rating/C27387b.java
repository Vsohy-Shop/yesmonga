package com.carrefour.fid.android.presentation.viewmodels.rating;

import com.carrefour.fid.android.catalogs.core.datastore.CatalogPreferencesStorage;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.domain.interactors.rating.GetRatingUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.rating.b */
public final class C27387b implements C10324h<RatingViewModel> {

    /* renamed from: a */
    public final Provider<GetRatingUseCase> f66459a;

    /* renamed from: b */
    public final Provider<AppPreferencesStorage> f66460b;

    /* renamed from: c */
    public final Provider<CatalogPreferencesStorage> f66461c;

    public C27387b(Provider<GetRatingUseCase> provider, Provider<AppPreferencesStorage> provider2, Provider<CatalogPreferencesStorage> provider3) {
        this.f66459a = provider;
        this.f66460b = provider2;
        this.f66461c = provider3;
    }

    /* renamed from: a */
    public static C27387b m115387a(Provider<GetRatingUseCase> provider, Provider<AppPreferencesStorage> provider2, Provider<CatalogPreferencesStorage> provider3) {
        return new C27387b(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static RatingViewModel m115388c(GetRatingUseCase getRatingUseCase, AppPreferencesStorage appPreferencesStorage, CatalogPreferencesStorage catalogPreferencesStorage) {
        return new RatingViewModel(getRatingUseCase, appPreferencesStorage, catalogPreferencesStorage);
    }

    /* renamed from: b */
    public RatingViewModel get() {
        return m115388c(this.f66459a.get(), this.f66460b.get(), this.f66461c.get());
    }
}
