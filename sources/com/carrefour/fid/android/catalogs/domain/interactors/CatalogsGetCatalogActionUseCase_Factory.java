package com.carrefour.fid.android.catalogs.domain.interactors;

import android.content.Context;
import com.carrefour.fid.android.domain.interactors.account.C37518d;
import com.carrefour.fid.android.domain.interactors.criteo.C37668h;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
public final class CatalogsGetCatalogActionUseCase_Factory implements C10324h<CatalogsGetCatalogActionUseCase> {
    private final Provider<AppEnvironment> appEnvironmentProvider;
    private final Provider<Context> contextProvider;
    private final Provider<C37832c> getFavoriteStoreProvider;
    private final Provider<C37878e> getUSerInfoUseCaseProvider;
    private final Provider<C37518d> getUserUidIamUseCaseProvider;
    private final Provider<C37668h> isCriteoPrivacyAcceptedUseCaseProvider;
    private final Provider<C37886i> isUserConnectedUseCaseProvider;
    private final Provider<C38328d> performanceProvider;
    private final Provider<C37807b> remoteConfigUseCaseProvider;

    public CatalogsGetCatalogActionUseCase_Factory(Provider<Context> provider, Provider<C37832c> provider2, Provider<C37807b> provider3, Provider<AppEnvironment> provider4, Provider<C37886i> provider5, Provider<C37668h> provider6, Provider<C37518d> provider7, Provider<C37878e> provider8, Provider<C38328d> provider9) {
        this.contextProvider = provider;
        this.getFavoriteStoreProvider = provider2;
        this.remoteConfigUseCaseProvider = provider3;
        this.appEnvironmentProvider = provider4;
        this.isUserConnectedUseCaseProvider = provider5;
        this.isCriteoPrivacyAcceptedUseCaseProvider = provider6;
        this.getUserUidIamUseCaseProvider = provider7;
        this.getUSerInfoUseCaseProvider = provider8;
        this.performanceProvider = provider9;
    }

    public static CatalogsGetCatalogActionUseCase_Factory create(Provider<Context> provider, Provider<C37832c> provider2, Provider<C37807b> provider3, Provider<AppEnvironment> provider4, Provider<C37886i> provider5, Provider<C37668h> provider6, Provider<C37518d> provider7, Provider<C37878e> provider8, Provider<C38328d> provider9) {
        return new CatalogsGetCatalogActionUseCase_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static CatalogsGetCatalogActionUseCase newInstance(Context context, C37832c cVar, C37807b bVar, AppEnvironment appEnvironment, C37886i iVar, C37668h hVar, C37518d dVar, C37878e eVar, C38328d dVar2) {
        return new CatalogsGetCatalogActionUseCase(context, cVar, bVar, appEnvironment, iVar, hVar, dVar, eVar, dVar2);
    }

    public CatalogsGetCatalogActionUseCase get() {
        return newInstance(this.contextProvider.get(), this.getFavoriteStoreProvider.get(), this.remoteConfigUseCaseProvider.get(), this.appEnvironmentProvider.get(), this.isUserConnectedUseCaseProvider.get(), this.isCriteoPrivacyAcceptedUseCaseProvider.get(), this.getUserUidIamUseCaseProvider.get(), this.getUSerInfoUseCaseProvider.get(), this.performanceProvider.get());
    }
}
