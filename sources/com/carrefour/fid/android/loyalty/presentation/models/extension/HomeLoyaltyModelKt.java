package com.carrefour.fid.android.loyalty.presentation.models.extension;

import com.carrefour.fid.android.loyalty.C38285R;
import com.carrefour.fid.android.loyalty.presentation.models.CardTypeModel;
import com.carrefour.fid.android.loyalty.presentation.models.LoyaltyBenefitModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00018F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\n"}, mo22516d2 = {"getListBenefitForFidCard", "", "Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitModel;", "getGetListBenefitForFidCard", "()Ljava/util/List;", "getListBenefitForPassCard", "getGetListBenefitForPassCard", "getLoyaltyCardList", "Lcom/carrefour/fid/android/loyalty/presentation/models/CardTypeModel;", "getGetLoyaltyCardList", "loyalty_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HomeLoyaltyModelKt {
    @C12579k
    public static final List<LoyaltyBenefitModel> getGetListBenefitForFidCard() {
        return CollectionsKt__CollectionsKt.m40448L(new LoyaltyBenefitModel(C38285R.C38287drawable.ic_icon_carte_fid, C38285R.string.loyalty_card_carrefour_text_information_carrefour), new LoyaltyBenefitModel(C38285R.C38287drawable.ic_clubs_deep_bleu, C38285R.string.loyalty_card_cagnotte_text), new LoyaltyBenefitModel(C38285R.C38287drawable.ic_percentage, C38285R.string.loyalty_card_prime_fid_reductions), new LoyaltyBenefitModel(C38285R.C38287drawable.ic_carrefour_free, C38285R.string.loyalty_free_card_text));
    }

    @C12579k
    public static final List<LoyaltyBenefitModel> getGetListBenefitForPassCard() {
        return CollectionsKt__CollectionsKt.m40448L(new LoyaltyBenefitModel(C38285R.C38287drawable.ic_icon_carte_fid, C38285R.string.carte_pass_benefits_and_more), new LoyaltyBenefitModel(C38285R.C38287drawable.ic_percentage, C38285R.string.carte_pass_reductions), new LoyaltyBenefitModel(C38285R.C38287drawable.ic_icon_carte_pass, C38285R.string.carte_pass_journee), new LoyaltyBenefitModel(C38285R.C38287drawable.ic_card, C38285R.string.carte_pass_subscribe_to_credit_card));
    }

    @C12579k
    public static final List<CardTypeModel> getGetLoyaltyCardList() {
        return CollectionsKt__CollectionsKt.m40448L(new CardTypeModel(C38285R.C38287drawable.ic_carte_fidelite, C38285R.string.carte_fid_title), new CardTypeModel(C38285R.C38287drawable.carte_pass_premium, C38285R.string.carte_pass_title));
    }
}
