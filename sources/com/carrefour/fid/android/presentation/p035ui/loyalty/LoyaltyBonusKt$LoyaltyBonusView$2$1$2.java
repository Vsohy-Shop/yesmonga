package com.carrefour.fid.android.presentation.p035ui.loyalty;

import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$LoyaltyBonusView$2$1$2 */
public final class LoyaltyBonusKt$LoyaltyBonusView$2$1$2 extends Lambda implements C11289a<String> {
    final /* synthetic */ LoyaltyBonus $clubFamillePrime;
    final /* synthetic */ boolean $familyBonusAvailable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyBonusKt$LoyaltyBonusView$2$1$2(boolean z, LoyaltyBonus loyaltyBonus) {
        super(0);
        this.$familyBonusAvailable = z;
        this.$clubFamillePrime = loyaltyBonus;
    }

    @C12579k
    public final String invoke() {
        if (this.$familyBonusAvailable) {
            return this.$clubFamillePrime.getImageUrl();
        }
        return this.$clubFamillePrime.getImageOffUrl();
    }
}
