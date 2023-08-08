package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.account.C37523i;
import com.carrefour.fid.android.domain.interactors.basket.C37578j0;
import com.carrefour.fid.android.domain.interactors.user.C37875c;
import com.carrefour.fid.android.domain.interactors.user.C37884g;
import com.carrefour.fid.android.service.domain.interactors.ApplyPendingServiceSelectionUseCase;
import com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase;
import com.carrefour.fid.android.service.domain.interactors.GetPendingServiceSelectionUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class DeliverySummaryViewModel_Factory implements C10324h<DeliverySummaryViewModel> {
    private final Provider<ApplyPendingServiceSelectionUseCase> applyPendingServiceSelectionUseCaseProvider;
    private final Provider<GetMinimumOrderAmountUseCase> getMinimumOrderAmountUseCaseProvider;
    private final Provider<GetPendingServiceSelectionUseCase> getPendingServiceSelectionUseCaseProvider;
    private final Provider<C37875c> getUserAddressUseCaseProvider;
    private final Provider<C37884g> getUserPhoneUseCaseProvider;
    private final Provider<C19456p0> savedStateHandleProvider;
    private final Provider<C37578j0> switchFacilityServiceInBasketUseCaseProvider;
    private final Provider<C37523i> updateUserAddressUseCaseProvider;

    public DeliverySummaryViewModel_Factory(Provider<GetPendingServiceSelectionUseCase> provider, Provider<C37875c> provider2, Provider<C37884g> provider3, Provider<C37578j0> provider4, Provider<ApplyPendingServiceSelectionUseCase> provider5, Provider<C37523i> provider6, Provider<GetMinimumOrderAmountUseCase> provider7, Provider<C19456p0> provider8) {
        this.getPendingServiceSelectionUseCaseProvider = provider;
        this.getUserAddressUseCaseProvider = provider2;
        this.getUserPhoneUseCaseProvider = provider3;
        this.switchFacilityServiceInBasketUseCaseProvider = provider4;
        this.applyPendingServiceSelectionUseCaseProvider = provider5;
        this.updateUserAddressUseCaseProvider = provider6;
        this.getMinimumOrderAmountUseCaseProvider = provider7;
        this.savedStateHandleProvider = provider8;
    }

    public static DeliverySummaryViewModel_Factory create(Provider<GetPendingServiceSelectionUseCase> provider, Provider<C37875c> provider2, Provider<C37884g> provider3, Provider<C37578j0> provider4, Provider<ApplyPendingServiceSelectionUseCase> provider5, Provider<C37523i> provider6, Provider<GetMinimumOrderAmountUseCase> provider7, Provider<C19456p0> provider8) {
        return new DeliverySummaryViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static DeliverySummaryViewModel newInstance(GetPendingServiceSelectionUseCase getPendingServiceSelectionUseCase, C37875c cVar, C37884g gVar, C37578j0 j0Var, ApplyPendingServiceSelectionUseCase applyPendingServiceSelectionUseCase, C37523i iVar, GetMinimumOrderAmountUseCase getMinimumOrderAmountUseCase, C19456p0 p0Var) {
        return new DeliverySummaryViewModel(getPendingServiceSelectionUseCase, cVar, gVar, j0Var, applyPendingServiceSelectionUseCase, iVar, getMinimumOrderAmountUseCase, p0Var);
    }

    public DeliverySummaryViewModel get() {
        return newInstance(this.getPendingServiceSelectionUseCaseProvider.get(), this.getUserAddressUseCaseProvider.get(), this.getUserPhoneUseCaseProvider.get(), this.switchFacilityServiceInBasketUseCaseProvider.get(), this.applyPendingServiceSelectionUseCaseProvider.get(), this.updateUserAddressUseCaseProvider.get(), this.getMinimumOrderAmountUseCaseProvider.get(), this.savedStateHandleProvider.get());
    }
}
