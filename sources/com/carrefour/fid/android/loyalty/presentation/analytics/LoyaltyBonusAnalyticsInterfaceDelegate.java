package com.carrefour.fid.android.loyalty.presentation.analytics;

import android.content.Context;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.cms.data.extension.DataPrimeCmsResponseKt;
import com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType;
import com.carrefour.fid.android.shared.constant.C28519b0;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28584q1;
import com.carrefour.fid.android.shared.constant.C28608x0;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.tracking.C28994a;
import com.google.firebase.installations.local.C33093b;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\u0016\u0010\u000b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\u0016\u0010\u000e\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyBonusAnalyticsInterfaceDelegate;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyBonusAnalyticsInterface;", "Lkotlin/d2;", "sendScreenView", "sendLoyaltyIgnoreBonusTag", "", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "listLoyalty", "sendSubscribeLoyaltyEvent", "primeList", "sendTagPrimeFid", "sendAppsFlyerTagPrime", "sendScreenViewBonus", "listPrimesSubscribe", "sendTagClickSubscribePrime", "prime", "sendTagPrimeAdded", "sendTagPrimeRemoved", "sendTagDisplayPopinPrimesFid", "sendTagPlusDinfoPopinPrimesFid", "sendTagClicOkPopinPrimesFid", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticManager", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "Lcom/carrefour/fid/android/analytics/data/appflyer/a;", "appsFlyerTrackingManager", "Lcom/carrefour/fid/android/analytics/data/appflyer/a;", "Lcom/carrefour/fid/android/tracking/a;", "audienceTrackingAdapter", "Lcom/carrefour/fid/android/tracking/a;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Lcom/carrefour/fid/android/analytics/data/analytics/a;Lcom/carrefour/fid/android/analytics/data/appflyer/a;Lcom/carrefour/fid/android/tracking/a;Landroid/content/Context;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLoyaltyBonusAnalyticsInterface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyBonusAnalyticsInterface.kt\ncom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyBonusAnalyticsInterfaceDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n766#2:207\n857#2,2:208\n1855#2,2:210\n766#2:212\n857#2,2:213\n766#2:215\n857#2,2:216\n*S KotlinDebug\n*F\n+ 1 LoyaltyBonusAnalyticsInterface.kt\ncom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyBonusAnalyticsInterfaceDelegate\n*L\n80#1:207\n80#1:208,2\n99#1:210,2\n108#1:212\n108#1:213,2\n113#1:215\n113#1:216,2\n*E\n"})
public final class LoyaltyBonusAnalyticsInterfaceDelegate implements LoyaltyBonusAnalyticsInterface {
    @C12579k
    private final C13783a analyticManager;
    @C12579k
    private final C13814a appsFlyerTrackingManager;
    @C12579k
    private final C28994a audienceTrackingAdapter;
    @C12579k
    private final Context context;

    @Inject
    public LoyaltyBonusAnalyticsInterfaceDelegate(@C12579k C13783a aVar, @C12579k C13814a aVar2, @C12579k C28994a aVar3, @C10255b @C12579k Context context2) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "appsFlyerTrackingManager");
        Intrinsics.checkNotNullParameter(aVar3, "audienceTrackingAdapter");
        Intrinsics.checkNotNullParameter(context2, C9175a.f24932Y);
        this.analyticManager = aVar;
        this.appsFlyerTrackingManager = aVar2;
        this.audienceTrackingAdapter = aVar3;
        this.context = context2;
    }

    public void sendAppsFlyerTagPrime(@C12579k List<DataPrimeCmsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "listLoyalty");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((DataPrimeCmsResponse) next).isSelected()) {
                arrayList.add(next);
            }
        }
        this.appsFlyerTrackingManager.mo32735i(this.context, C13814a.f33705Z, C10975r0.m41401k(C11078d1.m42659a(C13814a.f33682E0, CollectionsKt___CollectionsKt.m40639h3(arrayList, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C38297xd85bc2e.INSTANCE, 30, (Object) null))));
    }

    public void sendLoyaltyIgnoreBonusTag() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "mes-primes"), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70052t)), false, 2, (Object) null);
    }

    public void sendScreenView() {
        C13783a.m58667i(this.analyticManager, "fidelite", "mes-primes", (Map) null, false, false, false, 60, (Object) null);
    }

    public void sendScreenViewBonus() {
        C13783a.m58667i(this.analyticManager, "mes-primes", "primes", (Map) null, false, false, false, 60, (Object) null);
    }

    public void sendSubscribeLoyaltyEvent(@C12579k List<DataPrimeCmsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "listLoyalty");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((DataPrimeCmsResponse) next).isSelected()) {
                arrayList.add(next);
            }
        }
        String b = DataPrimeCmsResponseKt.m162990b(arrayList);
        Locale locale = Locale.FRANCE;
        Intrinsics.checkNotNullExpressionValue(locale, "FRANCE");
        String upperCase = b.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "fidelite"), C11078d1.m42659a("screen_name", "mes-primes"), C11078d1.m42659a(C28526d.f68929i, "fidelite"), C11078d1.m42659a(C28526d.f68933j, C28608x0.f70021O), C11078d1.m42659a(C28526d.f68937k, upperCase), C11078d1.m42659a("event_value", String.valueOf(arrayList.size())), C11078d1.m42659a("user_primeSize", String.valueOf(arrayList.size()))), false, 2, (Object) null);
    }

    public void sendTagClicOkPopinPrimesFid() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "primes"), C11078d1.m42659a("screen_name", "mes-primes"), C11078d1.m42659a(C28526d.f68929i, "navigation-clic"), C11078d1.m42659a(C28526d.f68933j, "ok"), C11078d1.m42659a(C28526d.f68937k, null)), false, 2, (Object) null);
    }

    public void sendTagClickSubscribePrime(@C12579k List<DataPrimeCmsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "listPrimesSubscribe");
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "primes"), C11078d1.m42659a("screen_name", "mes-primes"), C11078d1.m42659a(C28526d.f68929i, "primes"), C11078d1.m42659a(C28526d.f68933j, C28584q1.f69750d), C11078d1.m42659a("user_primeSize", String.valueOf(list.size()))), false, 2, (Object) null);
    }

    public void sendTagDisplayPopinPrimesFid() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "primes"), C11078d1.m42659a("screen_name", "mes-primes"), C11078d1.m42659a(C28526d.f68929i, "primes"), C11078d1.m42659a(C28526d.f68933j, C28519b0.f68737d), C11078d1.m42659a(C28526d.f68937k, C28584q1.C28585a.f69760b)), false, 2, (Object) null);
    }

    public void sendTagPlusDinfoPopinPrimesFid() {
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "primes"), C11078d1.m42659a("screen_name", "mes-primes"), C11078d1.m42659a(C28526d.f68929i, "navigation-clic"), C11078d1.m42659a(C28526d.f68933j, "sortie-site"), C11078d1.m42659a(C28526d.f68937k, "https://www.carrefour.fr/services/carte-carrefour/primes")), false, 2, (Object) null);
    }

    public void sendTagPrimeAdded(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "prime");
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "primes"), C11078d1.m42659a("screen_name", "mes-primes"), C11078d1.m42659a(C28526d.f68929i, "primes"), C11078d1.m42659a(C28526d.f68933j, C28584q1.f69753g), C11078d1.m42659a(C28526d.f68937k, StringKt.m118908Q(dataPrimeCmsResponse.getPrimeId()))), false, 2, (Object) null);
    }

    public void sendTagPrimeFid(@C12580l List<DataPrimeCmsResponse> list) {
        Integer num;
        String str;
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (DataPrimeCmsResponse dataPrimeCmsResponse : list) {
                String value = LoyaltyPrimeType.Companion.getFromId(dataPrimeCmsResponse.getPrimeId()).getValue();
                if (dataPrimeCmsResponse.isSelected()) {
                    str = "Oui";
                } else {
                    str = C13758b.f33444f;
                }
                hashMap.put(value, str);
            }
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((DataPrimeCmsResponse) next).isSelected()) {
                    arrayList.add(next);
                }
            }
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        hashMap.put(C13758b.f33421N, String.valueOf(num));
        this.audienceTrackingAdapter.mo32670e(hashMap);
    }

    public void sendTagPrimeRemoved(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "prime");
        C13783a.m58668o(this.analyticManager, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "primes"), C11078d1.m42659a("screen_name", "mes-primes"), C11078d1.m42659a(C28526d.f68929i, "primes"), C11078d1.m42659a(C28526d.f68933j, C28584q1.f69754h), C11078d1.m42659a(C28526d.f68937k, StringKt.m118908Q(dataPrimeCmsResponse.getPrimeId()))), false, 2, (Object) null);
    }
}
