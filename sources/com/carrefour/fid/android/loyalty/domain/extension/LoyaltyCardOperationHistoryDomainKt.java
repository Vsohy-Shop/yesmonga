package com.carrefour.fid.android.loyalty.domain.extension;

import com.carrefour.fid.android.loyalty.data.models.entities.BenefitsResponse;
import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyCardOperationHistoryResponse;
import com.carrefour.fid.android.loyalty.domain.models.BenefitsDomain;
import com.carrefour.fid.android.loyalty.domain.models.LoyaltyCardOperationHistoryDomain;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, mo22516d2 = {"toDomain", "Lcom/carrefour/fid/android/loyalty/domain/models/BenefitsDomain;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/BenefitsResponse;", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyCardOperationHistoryDomain;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyCardOperationHistoryResponse;", "loyalty_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LoyaltyCardOperationHistoryDomainKt {
    @C12579k
    public static final LoyaltyCardOperationHistoryDomain toDomain(@C12579k LoyaltyCardOperationHistoryResponse loyaltyCardOperationHistoryResponse) {
        Intrinsics.checkNotNullParameter(loyaltyCardOperationHistoryResponse, "<this>");
        String loyaltyTransactionDate = loyaltyCardOperationHistoryResponse.getLoyaltyTransactionDate();
        String locality = loyaltyCardOperationHistoryResponse.getLocality();
        BenefitsResponse benefits = loyaltyCardOperationHistoryResponse.getBenefits();
        return new LoyaltyCardOperationHistoryDomain(loyaltyTransactionDate, locality, benefits != null ? toDomain(benefits) : null);
    }

    @C12579k
    public static final BenefitsDomain toDomain(@C12579k BenefitsResponse benefitsResponse) {
        Intrinsics.checkNotNullParameter(benefitsResponse, "<this>");
        return new BenefitsDomain(benefitsResponse.getAcquiredBenefits(), benefitsResponse.getUsedBenefits());
    }
}
