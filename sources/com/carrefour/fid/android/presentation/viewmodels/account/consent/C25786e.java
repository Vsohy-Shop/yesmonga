package com.carrefour.fid.android.presentation.viewmodels.account.consent;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.domain.models.consent.ChoiceOptIn;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import com.carrefour.fid.android.shared.constant.C28513a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28564m1;
import com.carrefour.fid.android.shared.extension.C28767m;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.tracking.C28994a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountConsentsAnalyticsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountConsentsAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountConsentsAnalyticsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1855#2,2:138\n*S KotlinDebug\n*F\n+ 1 AccountConsentsAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountConsentsAnalyticsViewModel\n*L\n97#1:138,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.e */
public final class C25786e {

    /* renamed from: c */
    public static final int f63152c = 8;
    @C12579k

    /* renamed from: a */
    public final C28994a f63153a;
    @C12579k

    /* renamed from: b */
    public final C13783a f63154b;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.e$a */
    public /* synthetic */ class C25787a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.domain.models.consent.ConsentName[] r0 = com.carrefour.fid.android.domain.models.consent.ConsentName.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_CARREFOUR_EMAIL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_CARREFOUR_SMS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_FID_EMAIL     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_FID_SMS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.consent.C25786e.C25787a.<clinit>():void");
        }
    }

    @Inject
    public C25786e(@C12579k C28994a aVar, @C12579k C13783a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "audienceTrackingAdapter");
        Intrinsics.checkNotNullParameter(aVar2, "mAnalyticManager");
        this.f63153a = aVar;
        this.f63154b = aVar2;
    }

    /* renamed from: a */
    public final void mo74851a(boolean z) {
        String str;
        C13783a aVar = this.f63154b;
        Pair[] pairArr = new Pair[1];
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        pairArr[0] = C11078d1.m42659a(C28564m1.f69582p, str);
        aVar.mo32708k(C10977s0.m41446M(pairArr));
    }

    /* renamed from: b */
    public final void mo74852b(boolean z) {
        String str;
        C13783a aVar = this.f63154b;
        Pair[] pairArr = new Pair[1];
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        pairArr[0] = C11078d1.m42659a(C28564m1.f69586t, str);
        aVar.mo32708k(C10977s0.m41446M(pairArr));
    }

    /* renamed from: c */
    public final void mo74853c(boolean z) {
        String str;
        C13783a aVar = this.f63154b;
        Pair[] pairArr = new Pair[1];
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        pairArr[0] = C11078d1.m42659a(C28564m1.f69585s, str);
        aVar.mo32708k(C10977s0.m41446M(pairArr));
    }

    /* renamed from: d */
    public final String mo74854d(ConsentOptIn consentOptIn) {
        return consentOptIn.mo117324f() == ChoiceOptIn.ACCEPTED ? C13758b.f33436b : C13758b.f33438c;
    }

    /* renamed from: e */
    public final void mo74855e(boolean z) {
        C13783a aVar = this.f63154b;
        int a = C28767m.m119074a(z);
        C13783a.m58668o(aVar, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "notifications"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "modifier-consentement"), C11078d1.m42659a(C28526d.f68937k, "user-courrier-" + a)), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo74856f(@C12579k List<ConsentOptIn> list) {
        Intrinsics.checkNotNullParameter(list, "consentOptIns");
        mo74859i(list);
    }

    /* renamed from: g */
    public final void mo74857g() {
        this.f63153a.mo32669d("app_went_consent", C10975r0.m41401k(C11078d1.m42659a(C13758b.f33407C0, C28932h.f70914a.mo84245o())));
        C13783a.m58667i(this.f63154b, "mon-compte", "notifications", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: h */
    public final void mo74858h() {
        C13783a.m58668o(this.f63154b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "notifications"), C11078d1.m42659a(C28526d.f68933j, C28513a.f68675m), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68937k, C28513a.f68671i)), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo74859i(List<ConsentOptIn> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ConsentOptIn consentOptIn : list) {
            switch (C25787a.$EnumSwitchMapping$0[consentOptIn.mo117326h().ordinal()]) {
                case 1:
                    linkedHashMap.put(C13758b.f33474u, mo74854d(consentOptIn));
                    break;
                case 2:
                    linkedHashMap.put(C13758b.f33476v, mo74854d(consentOptIn));
                    break;
                case 3:
                    linkedHashMap.put(C13758b.f33402A, mo74854d(consentOptIn));
                    break;
                case 4:
                    linkedHashMap.put(C13758b.f33404B, mo74854d(consentOptIn));
                    break;
                case 5:
                    linkedHashMap.put(C13758b.f33482y, mo74854d(consentOptIn));
                    break;
                case 6:
                    linkedHashMap.put(C13758b.f33484z, mo74854d(consentOptIn));
                    break;
            }
        }
        this.f63153a.mo32670e(linkedHashMap);
    }
}
