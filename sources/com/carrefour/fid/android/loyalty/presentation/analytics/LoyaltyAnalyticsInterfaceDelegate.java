package com.carrefour.fid.android.loyalty.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28519b0;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28584q1;
import com.carrefour.fid.android.shared.constant.C28608x0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAnalyticsInterfaceDelegate;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAnalyticsInterface;", "Lkotlin/d2;", "sendScreenViewNotLogged", "sendScreenViewLoyaltyCard", "sendScreenViewPassCard", "sendTagDisplayPopinPrimesFid", "", "eventLabel", "tagRescuePrimeCMS", "attachLoyaltyCardLater", "value", "sendTagClickGoToLogin", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticManager", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "<init>", "(Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class LoyaltyAnalyticsInterfaceDelegate implements LoyaltyAnalyticsInterface {
    @C12579k
    private final C13783a analyticManager;

    @Inject
    public LoyaltyAnalyticsInterfaceDelegate(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.analyticManager = aVar;
    }

    public void attachLoyaltyCardLater() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "rattacher-carte-crf"), C11078d1.m42659a(C28526d.f68929i, C28519b0.f68738e), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70027U), C11078d1.m42659a(C28526d.f68937k, C28608x0.f70030X)), false, 2, (Object) null);
    }

    public void sendScreenViewLoyaltyCard() {
        C13783a.m58667i(this.analyticManager, "fidelite", "aide-carte-crf", (Map) null, false, false, false, 60, (Object) null);
    }

    public void sendScreenViewNotLogged() {
        C13783a.m58667i(this.analyticManager, "fidelite", "me-connecter", (Map) null, false, false, false, 60, (Object) null);
    }

    public void sendScreenViewPassCard() {
        C13783a.m58667i(this.analyticManager, "fidelite", "aide-carte-pass", (Map) null, false, false, false, 60, (Object) null);
    }

    public void sendTagClickGoToLogin(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, str), C11078d1.m42659a("screen_name", "me-connecter"), C11078d1.m42659a(C28526d.f68929i, str), C11078d1.m42659a(C28526d.f68933j, "me-connecter")), false, 2, (Object) null);
    }

    public void sendTagDisplayPopinPrimesFid() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "primes"), C11078d1.m42659a("screen_name", "mes-primes"), C11078d1.m42659a(C28526d.f68929i, "primes"), C11078d1.m42659a(C28526d.f68933j, C28519b0.f68737d), C11078d1.m42659a(C28526d.f68937k, C28584q1.C28585a.f69760b)), false, 2, (Object) null);
    }

    public void tagRescuePrimeCMS(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "eventLabel");
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "primes"), C11078d1.m42659a("screen_name", "mes-primes"), C11078d1.m42659a(C28526d.f68933j, "service"), C11078d1.m42659a(C28526d.f68929i, "primes"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }
}
