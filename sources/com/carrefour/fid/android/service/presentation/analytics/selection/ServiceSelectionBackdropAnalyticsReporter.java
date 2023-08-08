package com.carrefour.fid.android.service.presentation.analytics.selection;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/analytics/selection/ServiceSelectionBackdropAnalyticsReporter;", "", "Lkotlin/d2;", "sendScreenView", "tagDrivePressed", "tagDeliveryPressed", "tagDelivery1hPressed", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticManager", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "<init>", "(Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ServiceSelectionBackdropAnalyticsReporter {
    @C12579k
    private final C13783a analyticManager;

    @Inject
    public ServiceSelectionBackdropAnalyticsReporter(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.analyticManager = aVar;
    }

    public final void sendScreenView() {
        C13783a.m58667i(this.analyticManager, "channel-switch", "backdrop-set-service", (Map) null, false, false, false, 60, (Object) null);
    }

    public final void tagDelivery1hPressed() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "channel-switch"), C11078d1.m42659a("screen_name", "backdrop-set-service"), C11078d1.m42659a(C28526d.f68933j, "backdrop-set-service"), C11078d1.m42659a(C28526d.f68929i, "channel-switch"), C11078d1.m42659a(C28526d.f68937k, C28526d.f68905c3)), false, 2, (Object) null);
    }

    public final void tagDeliveryPressed() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "channel-switch"), C11078d1.m42659a("screen_name", "backdrop-set-service"), C11078d1.m42659a(C28526d.f68933j, "backdrop-set-service"), C11078d1.m42659a(C28526d.f68929i, "channel-switch"), C11078d1.m42659a(C28526d.f68937k, C28526d.f68900b3)), false, 2, (Object) null);
    }

    public final void tagDrivePressed() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "channel-switch"), C11078d1.m42659a("screen_name", "backdrop-set-service"), C11078d1.m42659a(C28526d.f68933j, "backdrop-set-service"), C11078d1.m42659a(C28526d.f68929i, "channel-switch"), C11078d1.m42659a(C28526d.f68937k, "drive")), false, 2, (Object) null);
    }
}
