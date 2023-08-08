package com.carrefour.fid.android.loyalty.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType;
import com.carrefour.fid.android.shared.constant.C28519b0;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28564m1;
import com.carrefour.fid.android.shared.constant.C28608x0;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/analytics/AttachCardAnalyticsDelegate;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/AttachCardAnalytics;", "Lkotlin/d2;", "sendTagScreenView", "trackActiveFidPopIn", "trackTerminalCardPopIn", "contactCustomerService", "attachLoyaltyCardLater", "sendTagPutCardNumberScan", "sendTagClickValidCardNumber", "", "typeCard", "sendTagValidationAttachCard", "sendTagClickFindCardNumber", "sendTagPutCardNumberEdt", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticManager", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "<init>", "(Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class AttachCardAnalyticsDelegate implements AttachCardAnalytics {
    @C12579k
    private final C13783a analyticManager;

    @Inject
    public AttachCardAnalyticsDelegate(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.analyticManager = aVar;
    }

    public void attachLoyaltyCardLater() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "rattacher-carte-crf"), C11078d1.m42659a(C28526d.f68929i, C28519b0.f68738e), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70027U), C11078d1.m42659a(C28526d.f68937k, C28608x0.f70030X)), false, 2, (Object) null);
    }

    public void contactCustomerService() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "rattacher-carte-crf"), C11078d1.m42659a(C28526d.f68929i, C28519b0.f68738e), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70027U), C11078d1.m42659a(C28526d.f68937k, C28608x0.f70029W)), false, 2, (Object) null);
    }

    public void sendTagClickFindCardNumber() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", StringKt.m118908Q("rattacher-carte-crf")), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70047o)), false, 2, (Object) null);
    }

    public void sendTagClickValidCardNumber() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", StringKt.m118908Q("rattacher-carte-crf")), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70007A)), false, 2, (Object) null);
    }

    public void sendTagPutCardNumberEdt() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", StringKt.m118908Q("rattacher-carte-crf")), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70008B)), false, 2, (Object) null);
    }

    public void sendTagPutCardNumberScan() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", StringKt.m118908Q("rattacher-carte-crf")), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70017K)), false, 2, (Object) null);
    }

    public void sendTagScreenView() {
        C13783a.m58667i(this.analyticManager, "fidelite", "rattacher-carte-crf", (Map) null, false, false, false, 60, (Object) null);
    }

    public void sendTagValidationAttachCard(int i) {
        this.analyticManager.mo32700a();
        if (i == LoyaltyCardType.FID.getType()) {
            this.analyticManager.mo32708k(C10977s0.m41446M(C11078d1.m42659a(C28564m1.f69572f, "1")));
        } else if (i == LoyaltyCardType.PASS.getType()) {
            this.analyticManager.mo32708k(C10977s0.m41446M(C11078d1.m42659a(C28564m1.f69573g, "1")));
        }
    }

    public void trackActiveFidPopIn() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "rattacher-carte-crf"), C11078d1.m42659a(C28526d.f68929i, C28519b0.f68737d), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70023Q)), false, 2, (Object) null);
    }

    public void trackTerminalCardPopIn() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "rattacher-carte-crf"), C11078d1.m42659a(C28526d.f68929i, C28519b0.f68738e), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70027U), C11078d1.m42659a(C28526d.f68937k, "affichage")), false, 2, (Object) null);
    }
}
