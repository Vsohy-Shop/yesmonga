package com.carrefour.fid.android.domain.models.remoteconfig;

import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b$\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/remoteconfig/RemoteConfigTag;", "", "", "value", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "e", "f", "g", "v", "w", "x", "y", "z", "X", "Y", "Z", "E0", "F0", "G0", "H0", "I0", "J0", "K0", "L0", "M0", "N0", "O0", "P0", "Q0", "R0", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum RemoteConfigTag {
    AdditionalOrder("app_feature_additional_order"),
    AntiInflation("app_feature_anti_inflation"),
    BasketBuilder("app_feature_basket_builder"),
    BasketFrequentPurchasesSuggestion("app_feature_basket_frequent_purchases_suggestion"),
    CheckoutOnSitePayment("app_feature_checkout_onsite_payment"),
    Criteo("app_feature_criteo"),
    CriteoFlagship("app_feature_criteo_flagship"),
    DriveSlotShift("app_feature_drive_slot_shift"),
    FrequentSales("app_feature_frequent_purchases"),
    GazStation("app_feature_gas_station"),
    LuckyCartProducts("app_feature_luckycart"),
    LuckyCartGame("app_feature_lucky_cart_jeu_roulette"),
    ArsenalBottomBanner("app_feature_jeu_arsenal"),
    ArsenalJOBanner("app_feature_club_sport_jo_arsenal"),
    ArsenalTopBanner("app_feature_jeux_arsenal_home_top"),
    Stickers("app_feature_vignettes_arsenal"),
    ReturnableBag("app_feature_returnable_bag"),
    MemoToBasket("app_feature_memo_to_basket"),
    MixingProductsTag("app_feature_products_mix"),
    OrderHistoryOnline("app_feature_order_history_online"),
    OrderHistoryOffline("app_feature_order_history_offline"),
    OrderOfflineBill("app_feature_offline_bill"),
    Substitution("app_feature_substitution"),
    PostOrderSubstitution("app_feature_post_order_substitution"),
    SearchWithList("app_feature_search_with_list"),
    HomePageCmsBanner("app_feature_home_banner_cms"),
    WebViewCatalog("app_feature_webview_catalog"),
    OmrLad("app_feature_omr_lad"),
    OmrDrive("app_feature_omr_drive");
    
    @C12579k
    private final String value;

    /* access modifiers changed from: public */
    RemoteConfigTag(String str) {
        this.value = str;
    }

    @C12579k
    /* renamed from: q */
    public final String mo119009q() {
        return this.value;
    }
}
