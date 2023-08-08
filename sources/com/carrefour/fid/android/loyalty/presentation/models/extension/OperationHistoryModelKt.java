package com.carrefour.fid.android.loyalty.presentation.models.extension;

import com.carrefour.fid.android.loyalty.domain.models.BenefitsDomain;
import com.carrefour.fid.android.loyalty.domain.models.LoyaltyCardOperationHistoryDomain;
import com.carrefour.fid.android.loyalty.presentation.models.BenefitsModel;
import com.carrefour.fid.android.loyalty.presentation.models.OperationHistoryModel;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, mo22516d2 = {"toModel", "Lcom/carrefour/fid/android/loyalty/presentation/models/BenefitsModel;", "Lcom/carrefour/fid/android/loyalty/domain/models/BenefitsDomain;", "Lcom/carrefour/fid/android/loyalty/presentation/models/OperationHistoryModel;", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyCardOperationHistoryDomain;", "loyalty_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OperationHistoryModelKt {
    @C12579k
    public static final OperationHistoryModel toModel(@C12579k LoyaltyCardOperationHistoryDomain loyaltyCardOperationHistoryDomain) {
        Intrinsics.checkNotNullParameter(loyaltyCardOperationHistoryDomain, "<this>");
        String loyaltyTransactionDate = loyaltyCardOperationHistoryDomain.getLoyaltyTransactionDate();
        String locality = loyaltyCardOperationHistoryDomain.getLocality();
        BenefitsDomain benefits = loyaltyCardOperationHistoryDomain.getBenefits();
        return new OperationHistoryModel(loyaltyTransactionDate, locality, benefits != null ? toModel(benefits) : null);
    }

    @C12579k
    public static final BenefitsModel toModel(@C12579k BenefitsDomain benefitsDomain) {
        Intrinsics.checkNotNullParameter(benefitsDomain, "<this>");
        return new BenefitsModel(benefitsDomain.getAcquiredBenefits(), benefitsDomain.getUsedBenefits());
    }
}
