package com.carrefour.fid.android.loyalty.presentation.analytics;

import android.content.Context;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28608x0;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/analytics/SuccessCreateCardAnalyticsDelegate;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/SuccessCreateCardAnalytics;", "Lkotlin/d2;", "sendTagScreenView", "sendTagOnClickGo", "sendAppsFlyerTagCardCreation", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticManager", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "Lcom/carrefour/fid/android/analytics/data/appflyer/a;", "appsFlyerTrackingManager", "Lcom/carrefour/fid/android/analytics/data/appflyer/a;", "<init>", "(Landroid/content/Context;Lcom/carrefour/fid/android/analytics/data/analytics/a;Lcom/carrefour/fid/android/analytics/data/appflyer/a;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class SuccessCreateCardAnalyticsDelegate implements SuccessCreateCardAnalytics {
    @C12579k
    private final C13783a analyticManager;
    @C12579k
    private final C13814a appsFlyerTrackingManager;
    @C12579k
    private final Context context;

    @Inject
    public SuccessCreateCardAnalyticsDelegate(@C10255b @C12579k Context context2, @C12579k C13783a aVar, @C12579k C13814a aVar2) {
        Intrinsics.checkNotNullParameter(context2, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "appsFlyerTrackingManager");
        this.context = context2;
        this.analyticManager = aVar;
        this.appsFlyerTrackingManager = aVar2;
    }

    public void sendAppsFlyerTagCardCreation() {
        this.appsFlyerTrackingManager.mo32735i(this.context, C13814a.f33684G0, C10977s0.m41456W(C11078d1.m42659a(C13814a.f33684G0, "Oui"), C11078d1.m42659a(C13814a.f33683F0, "1")));
    }

    public void sendTagOnClickGo() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "felicitations-carte-crf"), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70020N)), false, 2, (Object) null);
    }

    public void sendTagScreenView() {
        C13783a.m58667i(this.analyticManager, "fidelite", "felicitations-carte-crf", (Map) null, false, false, false, 60, (Object) null);
    }
}
