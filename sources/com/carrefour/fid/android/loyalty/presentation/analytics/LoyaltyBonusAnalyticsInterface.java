package com.carrefour.fid.android.loyalty.presentation.analytics;

import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import java.util.List;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0018\u0010\u000b\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&J\u0016\u0010\f\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\u000e\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0002H&J\b\u0010\u0013\u001a\u00020\u0002H&J\b\u0010\u0014\u001a\u00020\u0002H&¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyBonusAnalyticsInterface;", "", "Lkotlin/d2;", "sendScreenView", "sendScreenViewBonus", "sendLoyaltyIgnoreBonusTag", "", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "listLoyalty", "sendSubscribeLoyaltyEvent", "primeList", "sendTagPrimeFid", "sendAppsFlyerTagPrime", "listPrimesSubscribe", "sendTagClickSubscribePrime", "prime", "sendTagPrimeAdded", "sendTagPrimeRemoved", "sendTagDisplayPopinPrimesFid", "sendTagPlusDinfoPopinPrimesFid", "sendTagClicOkPopinPrimesFid", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface LoyaltyBonusAnalyticsInterface {
    void sendAppsFlyerTagPrime(@C12579k List<DataPrimeCmsResponse> list);

    void sendLoyaltyIgnoreBonusTag();

    void sendScreenView();

    void sendScreenViewBonus();

    void sendSubscribeLoyaltyEvent(@C12579k List<DataPrimeCmsResponse> list);

    void sendTagClicOkPopinPrimesFid();

    void sendTagClickSubscribePrime(@C12579k List<DataPrimeCmsResponse> list);

    void sendTagDisplayPopinPrimesFid();

    void sendTagPlusDinfoPopinPrimesFid();

    void sendTagPrimeAdded(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse);

    void sendTagPrimeFid(@C12580l List<DataPrimeCmsResponse> list);

    void sendTagPrimeRemoved(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse);
}
