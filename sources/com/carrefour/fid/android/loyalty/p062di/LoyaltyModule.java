package com.carrefour.fid.android.loyalty.p062di;

import com.carrefour.fid.android.domain.interactors.loyalty.C37696a;
import com.carrefour.fid.android.domain.interactors.loyalty.C37697b;
import com.carrefour.fid.android.domain.interactors.loyalty.C37699c;
import com.carrefour.fid.android.domain.interactors.loyalty.C37700d;
import com.carrefour.fid.android.domain.interactors.loyalty.C37701e;
import com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.FidelityHasCardFidUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardNumberUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardsUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.hasValidFidCardUseCaseImpl;
import dagger.C10147a;
import dagger.C10159h;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C10159h
@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001R\u0018\u0010\u0006\u001a\u00020\u0003*\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00020\b*\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0010\u001a\u00020\r*\u00020\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00118gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\u00168gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/di/LoyaltyModule;", "", "Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyGetLoyaltyCardNumberUseCase;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/b;", "getBindGetLoyaltyCardNumberUseCase", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyGetLoyaltyCardNumberUseCase;)Lcom/carrefour/fid/android/domain/interactors/loyalty/b;", "bindGetLoyaltyCardNumberUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityHasCardFidUseCase;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/d;", "getBindHasCardFidUseCase", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityHasCardFidUseCase;)Lcom/carrefour/fid/android/domain/interactors/loyalty/d;", "bindHasCardFidUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityGetCardFidAndBalanceNonFoodUseCase;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/a;", "getBindGetCardFidAndBalanceNonFoodUseCase", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityGetCardFidAndBalanceNonFoodUseCase;)Lcom/carrefour/fid/android/domain/interactors/loyalty/a;", "bindGetCardFidAndBalanceNonFoodUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyGetLoyaltyCardsUseCase;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/c;", "getBindGetLoyaltyCardsUseCase", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyGetLoyaltyCardsUseCase;)Lcom/carrefour/fid/android/domain/interactors/loyalty/c;", "bindGetLoyaltyCardsUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/hasValidFidCardUseCaseImpl;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/e;", "getBindHasValidFidCardFromUserInfo", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/hasValidFidCardUseCaseImpl;)Lcom/carrefour/fid/android/domain/interactors/loyalty/e;", "bindHasValidFidCardFromUserInfo", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.loyalty.di.LoyaltyModule */
public interface LoyaltyModule {
    @C10147a
    @C12579k
    C37696a getBindGetCardFidAndBalanceNonFoodUseCase(@C12579k FidelityGetCardFidAndBalanceNonFoodUseCase fidelityGetCardFidAndBalanceNonFoodUseCase);

    @C10147a
    @C12579k
    C37697b getBindGetLoyaltyCardNumberUseCase(@C12579k LoyaltyGetLoyaltyCardNumberUseCase loyaltyGetLoyaltyCardNumberUseCase);

    @C10147a
    @C12579k
    C37699c getBindGetLoyaltyCardsUseCase(@C12579k LoyaltyGetLoyaltyCardsUseCase loyaltyGetLoyaltyCardsUseCase);

    @C10147a
    @C12579k
    C37700d getBindHasCardFidUseCase(@C12579k FidelityHasCardFidUseCase fidelityHasCardFidUseCase);

    @C10147a
    @C12579k
    C37701e getBindHasValidFidCardFromUserInfo(@C12579k hasValidFidCardUseCaseImpl hasvalidfidcardusecaseimpl);
}
