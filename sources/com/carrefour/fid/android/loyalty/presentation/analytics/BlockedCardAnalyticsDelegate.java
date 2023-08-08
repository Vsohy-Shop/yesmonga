package com.carrefour.fid.android.loyalty.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28608x0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/analytics/BlockedCardAnalyticsDelegate;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/BlockedCardAnalytics;", "Lkotlin/d2;", "sendScreenView", "sendTagOnRetryClick", "sendTagOnInitSecretCodeClick", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticManager", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "<init>", "(Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BlockedCardAnalyticsDelegate implements BlockedCardAnalytics {
    @C12579k
    private final C13783a analyticManager;

    @Inject
    public BlockedCardAnalyticsDelegate(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.analyticManager = aVar;
    }

    public void sendScreenView() {
        C13783a.m58667i(this.analyticManager, "fidelite", "carte-fidelite-bloquee", (Map) null, false, false, false, 60, (Object) null);
    }

    public void sendTagOnInitSecretCodeClick() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "carte-fidelite-bloquee"), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70046n)), false, 2, (Object) null);
    }

    public void sendTagOnRetryClick() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "carte-fidelite-bloquee"), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70045m)), false, 2, (Object) null);
    }
}
