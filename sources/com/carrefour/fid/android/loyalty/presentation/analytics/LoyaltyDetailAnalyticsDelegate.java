package com.carrefour.fid.android.loyalty.presentation.analytics;

import com.carrefour.fid.android.airship.util.C13757a;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.cms.data.extension.DataPrimeCmsResponseKt;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.loyalty.core.type.CardType;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28564m1;
import com.carrefour.fid.android.shared.constant.C28572o;
import com.carrefour.fid.android.shared.constant.C28584q1;
import com.carrefour.fid.android.shared.constant.C28608x0;
import com.carrefour.fid.android.shared.constant.C28609x1;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.tracking.C28994a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0002R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyDetailAnalyticsDelegate;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyDetailAnalytics;", "", "eventLabel", "Lkotlin/d2;", "tagRescuePrimeCMS", "", "Lcom/carrefour/fid/android/cms/domain/models/LoyaltyBonus;", "primeFisList", "sendTagPrimeFidList", "sendTagScreenView", "sendTagCancelClearData", "Lcom/carrefour/fid/android/loyalty/core/type/CardType;", "cardType", "sendTagConfirmClearData", "sendTagOnServiceStationsClick", "sendTagClickLoyaltyCardButton", "sendTagClickModifySecretCode", "", "couponNumber", "sendCouponsTracking", "sendDetachedCardTracking", "tagChallengeFid", "tagChallengeFidClick", "opCode", "tagArsenalDisplayed", "id", "tagArsenalClick", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticManager", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "Lcom/carrefour/fid/android/tracking/a;", "audienceTrackingAdapter", "Lcom/carrefour/fid/android/tracking/a;", "<init>", "(Lcom/carrefour/fid/android/analytics/data/analytics/a;Lcom/carrefour/fid/android/tracking/a;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLoyaltyDetailAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyDetailAnalytics.kt\ncom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyDetailAnalyticsDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n766#2:226\n857#2,2:227\n*S KotlinDebug\n*F\n+ 1 LoyaltyDetailAnalytics.kt\ncom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyDetailAnalyticsDelegate\n*L\n65#1:226\n65#1:227,2\n*E\n"})
public final class LoyaltyDetailAnalyticsDelegate implements LoyaltyDetailAnalytics {
    @C12579k
    private final C13783a analyticManager;
    @C12579k
    private final C28994a audienceTrackingAdapter;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.loyalty.core.type.CardType[] r0 = com.carrefour.fid.android.loyalty.core.type.CardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.loyalty.core.type.CardType r1 = com.carrefour.fid.android.loyalty.core.type.CardType.FID     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.loyalty.core.type.CardType r1 = com.carrefour.fid.android.loyalty.core.type.CardType.PASS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyDetailAnalyticsDelegate.WhenMappings.<clinit>():void");
        }
    }

    @Inject
    public LoyaltyDetailAnalyticsDelegate(@C12579k C13783a aVar, @C12579k C28994a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "audienceTrackingAdapter");
        this.analyticManager = aVar;
        this.audienceTrackingAdapter = aVar2;
    }

    public void sendCouponsTracking(int i) {
        this.audienceTrackingAdapter.mo32670e(C10975r0.m41401k(C11078d1.m42659a(C13758b.f33405B0, String.valueOf(i))));
    }

    public void sendDetachedCardTracking() {
        this.audienceTrackingAdapter.mo32670e(C10975r0.m41401k(C11078d1.m42659a(C13758b.f33481x0, C13757a.f33401b)));
    }

    public void sendTagCancelClearData() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "mon-profil"), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70010D), C11078d1.m42659a(C28526d.f68937k, "ko")), false, 2, (Object) null);
    }

    public void sendTagClickLoyaltyCardButton() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "mon-profil"), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70013G)), false, 2, (Object) null);
    }

    public void sendTagClickModifySecretCode() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "mon-profil"), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70014H)), false, 2, (Object) null);
    }

    public void sendTagConfirmClearData(@C12579k CardType cardType) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        int i = WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()];
        if (i == 1) {
            this.analyticManager.mo32708k(C10977s0.m41446M(C11078d1.m42659a(C28564m1.f69572f, "0")));
        } else if (i == 2) {
            this.analyticManager.mo32708k(C10977s0.m41446M(C11078d1.m42659a(C28564m1.f69573g, "0")));
        }
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "mon-profil"), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70010D), C11078d1.m42659a(C28526d.f68937k, "ok")), false, 2, (Object) null);
    }

    public void sendTagOnServiceStationsClick() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "mon-profil"), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28609x1.f70060b)), false, 2, (Object) null);
    }

    public void sendTagPrimeFidList(@C12579k List<LoyaltyBonus> list) {
        Intrinsics.checkNotNullParameter(list, "primeFisList");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((LoyaltyBonus) next).isSelected()) {
                arrayList.add(next);
            }
        }
        C13783a aVar = this.analyticManager;
        String upperCase = DataPrimeCmsResponseKt.m162989a(arrayList).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        aVar.mo32708k(C10977s0.m41456W(C11078d1.m42659a("user_primeSize", String.valueOf(arrayList.size())), C11078d1.m42659a(C28584q1.f69752f, StringKt.m118906O(C11622t.replace$default(upperCase, "PRIME ", "", false, 4, (Object) null)))));
    }

    public void sendTagScreenView() {
        C13783a.m58667i(this.analyticManager, "fidelite", "mon-profil", (Map) null, false, false, false, 60, (Object) null);
    }

    public final void tagArsenalClick(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a(C28526d.f68933j, "select-content"), C11078d1.m42659a(C28526d.f68929i, C28526d.f69000z2), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    public final void tagArsenalDisplayed(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "opCode");
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a(C28526d.f68933j, "view-promotion"), C11078d1.m42659a(C28526d.f68929i, C28526d.f69000z2), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    public void tagChallengeFid() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "mon-profil"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a(C28526d.f68933j, "affichage"), C11078d1.m42659a(C28526d.f68929i, C28572o.f69644c)), false, 2, (Object) null);
    }

    public void tagChallengeFidClick() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "mon-profil"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a(C28526d.f68933j, "clic"), C11078d1.m42659a(C28526d.f68929i, C28572o.f69644c), C11078d1.m42659a(C28526d.f68937k, C28572o.f69646e)), false, 2, (Object) null);
    }

    public void tagRescuePrimeCMS(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "eventLabel");
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "primes"), C11078d1.m42659a("screen_name", "mes-primes"), C11078d1.m42659a(C28526d.f68933j, "service"), C11078d1.m42659a(C28526d.f68929i, "primes"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }
}
