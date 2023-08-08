package com.carrefour.fid.android.loyalty.presentation.analytics;

import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\u0002H&¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/analytics/AttachCardAnalytics;", "", "Lkotlin/d2;", "sendTagScreenView", "trackActiveFidPopIn", "trackTerminalCardPopIn", "contactCustomerService", "attachLoyaltyCardLater", "sendTagPutCardNumberScan", "sendTagClickValidCardNumber", "", "typeCard", "sendTagValidationAttachCard", "sendTagClickFindCardNumber", "sendTagPutCardNumberEdt", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface AttachCardAnalytics {
    void attachLoyaltyCardLater();

    void contactCustomerService();

    void sendTagClickFindCardNumber();

    void sendTagClickValidCardNumber();

    void sendTagPutCardNumberEdt();

    void sendTagPutCardNumberScan();

    void sendTagScreenView();

    void sendTagValidationAttachCard(int i);

    void trackActiveFidPopIn();

    void trackTerminalCardPopIn();
}
