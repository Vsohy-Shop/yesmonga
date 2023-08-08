package com.carrefour.fid.android.loyalty.presentation.analytics;

import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0002H&¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/analytics/InitSecretCodeAnalytics;", "", "Lkotlin/d2;", "sendScreenViewCreateSecretCode", "trackScreenActivateCard", "sendTagClickInitSecretCode", "trackClickActivateSuccess", "", "cardNumber", "sendTagCardCreated", "sendAirshipTagCardCreated", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface InitSecretCodeAnalytics {
    void sendAirshipTagCardCreated();

    void sendScreenViewCreateSecretCode();

    void sendTagCardCreated(@C12579k String str);

    void sendTagClickInitSecretCode();

    void trackClickActivateSuccess();

    void trackScreenActivateCard();
}
