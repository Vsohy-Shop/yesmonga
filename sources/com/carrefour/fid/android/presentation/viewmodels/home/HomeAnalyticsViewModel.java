package com.carrefour.fid.android.presentation.viewmodels.home;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.entities.AuthStateResponse;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13795g;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13808o;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.cms.presentation.models.SlideFooterCellModel;
import com.carrefour.fid.android.core.type.LoyaltyCardType;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.presentation.p035ui.orders.online.extension.C25198c;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28549i0;
import com.carrefour.fid.android.shared.constant.C28554j1;
import com.carrefour.fid.android.shared.constant.C28564m1;
import com.carrefour.fid.android.shared.constant.C28571n1;
import com.carrefour.fid.android.shared.constant.C28572o;
import com.carrefour.fid.android.shared.constant.C28609x1;
import com.carrefour.fid.android.shared.constant.C28612y1;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.carrefour.fid.android.shared.util.environment.C28912a;
import com.carrefour.fid.android.tracking.C28994a;
import com.google.firebase.installations.local.C33093b;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class HomeAnalyticsViewModel {

    /* renamed from: g */
    public static final int f64398g = 8;
    @C12579k

    /* renamed from: a */
    public final LoginRepository f64399a;
    @C12579k

    /* renamed from: b */
    public final C28994a f64400b;
    @C12579k

    /* renamed from: c */
    public final C13814a f64401c;
    @C12579k

    /* renamed from: d */
    public final C13783a f64402d;
    @C12579k

    /* renamed from: e */
    public final AppEnvironment f64403e;
    @C12580l

    /* renamed from: f */
    public final Context f64404f;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel$a */
    public /* synthetic */ class C26370a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.core.type.LoyaltyCardType[] r0 = com.carrefour.fid.android.core.type.LoyaltyCardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.core.type.LoyaltyCardType r1 = com.carrefour.fid.android.core.type.LoyaltyCardType.FID     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.core.type.LoyaltyCardType r1 = com.carrefour.fid.android.core.type.LoyaltyCardType.PASS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.core.type.LoyaltyCardType r1 = com.carrefour.fid.android.core.type.LoyaltyCardType.NOT_EXIST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel.C26370a.<clinit>():void");
        }
    }

    @Inject
    public HomeAnalyticsViewModel(@C12579k LoginRepository loginRepository, @C12579k C28994a aVar, @C12579k C13814a aVar2, @C12579k C13783a aVar3, @C12579k AppEnvironment appEnvironment, @C10255b @C12580l Context context) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(aVar, "audienceTrackingAdapter");
        Intrinsics.checkNotNullParameter(aVar2, "appsFlyerTrackingManager");
        Intrinsics.checkNotNullParameter(aVar3, "analyticManager");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        this.f64399a = loginRepository;
        this.f64400b = aVar;
        this.f64401c = aVar2;
        this.f64402d = aVar3;
        this.f64403e = appEnvironment;
        this.f64404f = context;
    }

    /* renamed from: A */
    public final void mo76680A() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69397v), C11078d1.m42659a(C28526d.f68929i, "home"), C11078d1.m42659a(C28526d.f68937k, "promos")), false, 2, (Object) null);
    }

    /* renamed from: B */
    public final void mo76681B() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "choix-slot"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a(C28526d.f68929i, "channel-switch"), C11078d1.m42659a(C28526d.f68933j, "toaster-information-slot-checkout"), C11078d1.m42659a(C28526d.f68937k, "LEX")), false, 2, (Object) null);
    }

    /* renamed from: C */
    public final void mo76682C() {
        this.f64402d.mo32711n(new C13812g(FirebaseEventKey.INTERACTION, "accueil", "home", new C13808o("channel-switch", "choix-slot")));
    }

    /* renamed from: D */
    public final void mo76683D(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "linkType");
        Intrinsics.checkNotNullParameter(str2, "title");
        C13783a aVar = this.f64402d;
        C13783a.m58668o(aVar, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68929i, C28549i0.f69394s), C11078d1.m42659a(C28526d.f68933j, "clic"), C11078d1.m42659a(C28526d.f68937k, str + C33093b.f80279g + str2)), false, 2, (Object) null);
    }

    /* renamed from: E */
    public final void mo76684E(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a(C28526d.f68933j, "select-content"), C11078d1.m42659a(C28526d.f68929i, C28526d.f69000z2), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: F */
    public final void mo76685F(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a(C28526d.f68933j, "view-promotion"), C11078d1.m42659a(C28526d.f68929i, C28526d.f69000z2), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: G */
    public final void mo76686G() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a(C28526d.f68933j, "affichage"), C11078d1.m42659a(C28526d.f68929i, C28572o.f69644c)), false, 2, (Object) null);
    }

    /* renamed from: H */
    public final void mo76687H() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a(C28526d.f68933j, "clic"), C11078d1.m42659a(C28526d.f68929i, C28572o.f69644c), C11078d1.m42659a(C28526d.f68937k, C28572o.f69646e)), false, 2, (Object) null);
    }

    /* renamed from: I */
    public final void mo76688I(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "eventLabel");
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "primes"), C11078d1.m42659a("screen_name", "mes-primes"), C11078d1.m42659a(C28526d.f68933j, "service"), C11078d1.m42659a(C28526d.f68929i, "primes"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: J */
    public final void mo76689J(@C12579k List<SlideFooterCellModel> list) {
        List<SlideFooterCellModel> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "listTitleSlideModel");
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68929i, C28549i0.f69394s), C11078d1.m42659a(C28526d.f68933j, "affichage"), C11078d1.m42659a(C28526d.f68937k, CollectionsKt___CollectionsKt.m40639h3(list2, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, HomeAnalyticsViewModel$tagScreenSlideFooter$1.f64405f, 30, (Object) null))), false, 2, (Object) null);
    }

    /* renamed from: K */
    public final void mo76690K(int i) {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68929i, "home"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69393r), C11078d1.m42659a(C28526d.f68937k, String.valueOf(i))), false, 2, (Object) null);
    }

    /* renamed from: L */
    public final void mo76691L() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68933j, "onboarding"), C11078d1.m42659a(C28526d.f68929i, "channel-switch"), C11078d1.m42659a(C28526d.f68937k, C28549i0.f69371E)), false, 2, (Object) null);
    }

    /* renamed from: M */
    public final void mo76692M() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68933j, "onboarding"), C11078d1.m42659a(C28526d.f68929i, "channel-switch"), C11078d1.m42659a(C28526d.f68937k, "drive")), false, 2, (Object) null);
    }

    /* renamed from: a */
    public final Pair<String, String> mo76693a() {
        String str;
        if (Intrinsics.areEqual((Object) this.f64403e.mo84161H(), (Object) C28912a.C28914b.f70835f)) {
            str = C28571n1.f69635d;
        } else {
            str = C28571n1.f69636e;
        }
        return C11078d1.m42659a(C28564m1.f69569c, str);
    }

    /* renamed from: b */
    public final AuthStateResponse mo76694b() {
        return this.f64399a.mo31354f();
    }

    @C12580l
    /* renamed from: c */
    public final Object mo76695c(@C12580l C38162k kVar, @C12579k C11045c<? super C11079d2> cVar) {
        String str;
        String str2;
        StoreService f;
        StoreService f2;
        String H;
        C38163l e;
        Pair[] pairArr = new Pair[4];
        String str3 = null;
        if (kVar == null || (e = kVar.mo119352e()) == null) {
            str = null;
        } else {
            str = e.mo119393w();
        }
        String str4 = "";
        if (str == null) {
            str = str4;
        }
        pairArr[0] = C11078d1.m42659a("user_storeID", str);
        if (!(kVar == null || (f2 = kVar.mo119354f()) == null || (H = f2.mo119164H()) == null)) {
            str3 = StringKt.m118908Q(H);
        }
        if (str3 != null) {
            str4 = str3;
        }
        pairArr[1] = C11078d1.m42659a("user_storeFormat", str4);
        if (kVar == null || (f = kVar.mo119354f()) == null || (str2 = f.mo119180X()) == null) {
            str2 = "STORE_VIRTUEL";
        }
        pairArr[2] = C11078d1.m42659a("cart_storeService", str2);
        pairArr[3] = mo76693a();
        Map W = C10977s0.m41456W(pairArr);
        C13783a.m58667i(this.f64402d, "home", "accueil", W, false, false, false, 56, (Object) null);
        this.f64402d.mo32708k(W);
        return C11079d2.f28267a;
    }

    /* renamed from: d */
    public final void mo76696d(@C12580l List<OrdersOnlineItemModel> list) {
        boolean z;
        Collection collection = list;
        boolean z2 = false;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            OrdersOnlineItemModel f = C25198c.m108896f(list);
            List<OrdersOnlineItemModel> h = C25198c.m108898h(list);
            Map j0 = C10977s0.m41469j0(C11078d1.m42659a(C13758b.f33428U, String.valueOf(h.size())));
            if (h.isEmpty()) {
                z2 = true;
            }
            if (!z2 && f != null) {
                j0.put(C13758b.f33427T, String.valueOf(f.mo73491w()));
                OrdersOnlineItemModel d = C25198c.m108894d(list);
                if (d != null) {
                    j0.put(C13758b.f33431X, C25198c.m108897g(d, C28932h.f70920g));
                    j0.put(C13758b.f33433Z, C28932h.f70914a.mo84215F(d.mo73372d()));
                }
                OrdersOnlineItemModel e = C25198c.m108895e(list);
                if (e != null) {
                    j0.put(C13758b.f33432Y, C25198c.m108897g(e, C28932h.f70920g));
                    j0.put(C13758b.f33435a0, C28932h.f70914a.mo84215F(e.mo73372d()));
                }
                if (h.size() == 1) {
                    j0.put(C13758b.f33437b0, "Oui");
                    Context context = this.f64404f;
                    if (context != null) {
                        this.f64401c.mo32735i(context, C13814a.f33685H0, C10977s0.m41492z());
                    }
                }
            }
            this.f64400b.mo32670e(j0);
        }
    }

    /* renamed from: e */
    public final void mo76697e() {
        boolean z;
        if (C13181d.m57146e(mo76694b())) {
            if (this.f64399a.mo31353e().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo76699g();
            }
        }
    }

    /* renamed from: f */
    public final void mo76698f() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68929i, "home"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69457x)), false, 2, (Object) null);
    }

    /* renamed from: g */
    public final void mo76699g() {
        Map W = C10977s0.m41456W(C11078d1.m42659a(C13758b.f33441d0, this.f64399a.mo31352d()), C11078d1.m42659a(C13758b.f33443e0, this.f64399a.mo31353e()));
        C28994a aVar = this.f64400b;
        aVar.mo32670e(W);
        aVar.mo32668c(this.f64399a.mo31352d());
    }

    /* renamed from: h */
    public final void mo76700h(int i) {
        Map map;
        if (i == 0) {
            map = C10975r0.m41401k(C11078d1.m42659a("user_newCustomer", "0"));
        } else if (i != 1) {
            map = C10975r0.m41401k(C11078d1.m42659a("user_newCustomer", "2"));
        } else {
            map = C10975r0.m41401k(C11078d1.m42659a("user_newCustomer", "1"));
        }
        this.f64402d.mo32708k(map);
    }

    /* renamed from: i */
    public final void mo76701i() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69373G), C11078d1.m42659a(C28526d.f68929i, C28549i0.f69374H)), false, 2, (Object) null);
    }

    /* renamed from: j */
    public final void mo76702j() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68929i, "home"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69397v), C11078d1.m42659a(C28526d.f68937k, "catalogues")), false, 2, (Object) null);
    }

    /* renamed from: k */
    public final void mo76703k() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68933j, "choisir-magasin"), C11078d1.m42659a(C28526d.f68929i, "home")), false, 2, (Object) null);
    }

    /* renamed from: l */
    public final void mo76704l() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69386k), C11078d1.m42659a(C28526d.f68929i, "home")), false, 2, (Object) null);
    }

    /* renamed from: m */
    public final void mo76705m() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69385j), C11078d1.m42659a(C28526d.f68929i, "home")), false, 2, (Object) null);
    }

    /* renamed from: n */
    public final void mo76706n(@C12579k LoyaltyCardType loyaltyCardType) {
        String str;
        Intrinsics.checkNotNullParameter(loyaltyCardType, "loyaltyCardType");
        int i = C26370a.$EnumSwitchMapping$0[loyaltyCardType.ordinal()];
        if (i == 1) {
            str = C28549i0.f69382g;
        } else if (i == 2) {
            str = C28549i0.f69381f;
        } else if (i == 3) {
            str = C28549i0.f69383h;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68933j, str), C11078d1.m42659a(C28526d.f68929i, "home")), false, 2, (Object) null);
    }

    /* renamed from: o */
    public final void mo76707o() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68937k, "recommande-pour-vous"), C11078d1.m42659a(C28526d.f68929i, "home"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69397v)), false, 2, (Object) null);
    }

    /* renamed from: p */
    public final void mo76708p() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68933j, C28612y1.f70083d), C11078d1.m42659a(C28526d.f68929i, "home")), false, 2, (Object) null);
    }

    /* renamed from: q */
    public final void mo76709q() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69384i), C11078d1.m42659a(C28526d.f68929i, "home")), false, 2, (Object) null);
    }

    /* renamed from: r */
    public final void mo76710r(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "contentId");
        this.f64402d.mo32711n(new C13812g(FirebaseEventKey.INTERACTION, "accueil", "home", new C13795g("home", C28526d.f68874V2, str)));
    }

    /* renamed from: s */
    public final void mo76711s() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68929i, "home"), C11078d1.m42659a(C28526d.f68933j, "mes-achats-frequents")), false, 2, (Object) null);
    }

    /* renamed from: t */
    public final void mo76712t() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68929i, "home"), C11078d1.m42659a(C28526d.f68933j, "mes-listes")), false, 2, (Object) null);
    }

    /* renamed from: u */
    public final void mo76713u() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69387l), C11078d1.m42659a(C28526d.f68929i, "home")), false, 2, (Object) null);
    }

    /* renamed from: v */
    public final void mo76714v() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68933j, C28609x1.f70060b), C11078d1.m42659a(C28526d.f68929i, "home")), false, 2, (Object) null);
    }

    /* renamed from: w */
    public final void mo76715w() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68929i, "home"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69388m), C11078d1.m42659a(C28526d.f68937k, C28549i0.f69390o)), false, 2, (Object) null);
    }

    /* renamed from: x */
    public final void mo76716x() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69388m), C11078d1.m42659a(C28526d.f68929i, "home"), C11078d1.m42659a(C28526d.f68937k, "affichage")), false, 2, (Object) null);
    }

    /* renamed from: y */
    public final void mo76717y() {
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69388m), C11078d1.m42659a(C28526d.f68929i, "home"), C11078d1.m42659a(C28526d.f68937k, C28549i0.f69391p)), false, 2, (Object) null);
    }

    /* renamed from: z */
    public final void mo76718z(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "storeId");
        C13783a.m58668o(this.f64402d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68929i, "home"), C11078d1.m42659a(C28526d.f68933j, "itineraire"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }
}
