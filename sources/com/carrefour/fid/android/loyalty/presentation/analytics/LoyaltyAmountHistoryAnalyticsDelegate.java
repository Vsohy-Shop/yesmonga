package com.carrefour.fid.android.loyalty.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAmountHistoryAnalyticsDelegate;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAmountHistoryAnalytics;", "Lkotlin/d2;", "sendScreenView", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticManager", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "<init>", "(Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class LoyaltyAmountHistoryAnalyticsDelegate implements LoyaltyAmountHistoryAnalytics {
    @C12579k
    private final C13783a analyticManager;

    @Inject
    public LoyaltyAmountHistoryAnalyticsDelegate(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.analyticManager = aVar;
    }

    public void sendScreenView() {
        C13783a.m58667i(this.analyticManager, "fidelite", "ma-cagnotte", (Map) null, false, false, false, 60, (Object) null);
    }
}
