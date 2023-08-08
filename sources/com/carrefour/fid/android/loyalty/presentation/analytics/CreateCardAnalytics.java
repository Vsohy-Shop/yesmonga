package com.carrefour.fid.android.loyalty.presentation.analytics;

import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0002H&¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/analytics/CreateCardAnalytics;", "", "Lkotlin/d2;", "sendScreenView", "sendTagClickAttachCardFid", "sendTagClickAttachCardPass", "sendTagClickCreateCardFid", "sendTagClickCreateCardPass", "sendTagClickAcceptCGU", "sendTagClickDenyCGU", "sendTagClickSeeCGU", "sendTagCardCreated", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface CreateCardAnalytics {
    void sendScreenView();

    void sendTagCardCreated();

    void sendTagClickAcceptCGU();

    void sendTagClickAttachCardFid();

    void sendTagClickAttachCardPass();

    void sendTagClickCreateCardFid();

    void sendTagClickCreateCardPass();

    void sendTagClickDenyCGU();

    void sendTagClickSeeCGU();
}
