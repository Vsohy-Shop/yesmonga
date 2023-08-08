package com.carrefour.fid.android.loyalty.presentation.analytics;

import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.loyalty.core.type.CardType;
import java.util.List;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\n\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\u0004H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u0004H&J\b\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0015\u001a\u00020\u0004H&J\b\u0010\u0016\u001a\u00020\u0004H&J\b\u0010\u0017\u001a\u00020\u0004H&¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyDetailAnalytics;", "", "", "eventLabel", "Lkotlin/d2;", "tagRescuePrimeCMS", "", "Lcom/carrefour/fid/android/cms/domain/models/LoyaltyBonus;", "primeFisList", "sendTagPrimeFidList", "sendTagScreenView", "sendTagCancelClearData", "Lcom/carrefour/fid/android/loyalty/core/type/CardType;", "cardType", "sendTagConfirmClearData", "sendTagOnServiceStationsClick", "sendTagClickLoyaltyCardButton", "sendTagClickModifySecretCode", "", "couponNumber", "sendCouponsTracking", "sendDetachedCardTracking", "tagChallengeFid", "tagChallengeFidClick", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface LoyaltyDetailAnalytics {
    void sendCouponsTracking(int i);

    void sendDetachedCardTracking();

    void sendTagCancelClearData();

    void sendTagClickLoyaltyCardButton();

    void sendTagClickModifySecretCode();

    void sendTagConfirmClearData(@C12579k CardType cardType);

    void sendTagOnServiceStationsClick();

    void sendTagPrimeFidList(@C12579k List<LoyaltyBonus> list);

    void sendTagScreenView();

    void tagChallengeFid();

    void tagChallengeFidClick();

    void tagRescuePrimeCMS(@C12579k String str);
}
