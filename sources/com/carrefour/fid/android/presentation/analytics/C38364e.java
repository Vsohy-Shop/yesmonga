package com.carrefour.fid.android.presentation.analytics;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.C23962a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28557k0;
import com.carrefour.fid.android.shared.constant.C28595t;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.analytics.e */
public final class C38364e implements C38366g {

    /* renamed from: b */
    public static final int f97147b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f97148a;

    @Inject
    public C38364e(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f97148a = aVar;
    }

    /* renamed from: a */
    public void mo121200a() {
        C13783a.m58668o(this.f97148a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "coupons-mag"), C11078d1.m42659a(C28526d.f68906d, "coupons"), C11078d1.m42659a(C28526d.f68929i, "coupons-mag"), C11078d1.m42659a(C28526d.f68933j, C28595t.f69873j)), false, 2, (Object) null);
    }

    /* renamed from: b */
    public void mo121201b() {
        C13783a.m58668o(this.f97148a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "coupons-mag"), C11078d1.m42659a(C28526d.f68906d, "coupons"), C11078d1.m42659a(C28526d.f68929i, "coupons-mag"), C11078d1.m42659a(C28526d.f68933j, C28595t.f69879p)), false, 2, (Object) null);
    }

    /* renamed from: c */
    public void mo121202c(boolean z) {
        String str;
        C13783a aVar = this.f97148a;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "fiche-coupon");
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "coupons");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "coupons-mag");
        if (z) {
            str = C28595t.f69870g;
        } else {
            str = C28595t.f69871h;
        }
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, str);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: d */
    public void mo121203d() {
        C13783a.m58668o(this.f97148a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "coupons-mag"), C11078d1.m42659a(C28526d.f68906d, "coupons"), C11078d1.m42659a(C28526d.f68929i, "coupons-mag"), C11078d1.m42659a(C28526d.f68933j, C28595t.f69882s)), false, 2, (Object) null);
    }

    /* renamed from: e */
    public void mo121204e() {
        C13783a.m58668o(this.f97148a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "coupons-mag"), C11078d1.m42659a(C28526d.f68906d, "coupons"), C11078d1.m42659a(C28526d.f68929i, "coupons-mag"), C11078d1.m42659a(C28526d.f68933j, C28595t.f69883t)), false, 2, (Object) null);
    }

    /* renamed from: f */
    public void mo121205f() {
        C13783a.m58668o(this.f97148a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "coupons-mag"), C11078d1.m42659a(C28526d.f68906d, "coupons"), C11078d1.m42659a(C28526d.f68929i, "coupons-mag"), C11078d1.m42659a(C28526d.f68933j, C28595t.f69874k)), false, 2, (Object) null);
    }

    /* renamed from: g */
    public void mo121206g() {
        C13783a.m58667i(this.f97148a, "coupons", "fiche-coupon", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: h */
    public void mo121207h() {
        C13783a.m58667i(this.f97148a, "coupons", "coupons-online", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: i */
    public void mo121208i(boolean z) {
        String str;
        C13783a aVar = this.f97148a;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "coupons-mag");
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "coupons");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "coupons-mag");
        if (z) {
            str = C28595t.f69880q;
        } else {
            str = C28595t.f69881r;
        }
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, str);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: j */
    public void mo121209j() {
        C13783a.m58667i(this.f97148a, "coupons", "eligible-scan", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: k */
    public void mo121210k() {
        C13783a.m58667i(this.f97148a, "hub-promo", "eligible-scan", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: l */
    public void mo121211l(@C12579k C23962a aVar) {
        String str;
        Intrinsics.checkNotNullParameter(aVar, "couponType");
        if (aVar instanceof C23962a.C23966d) {
            str = C28557k0.f69477c;
        } else if (aVar instanceof C23962a.C23964b) {
            str = C28557k0.f69479e;
        } else {
            return;
        }
        C13783a.m58667i(this.f97148a, "hub-promo", str, (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: m */
    public void mo121212m() {
        C13783a.m58667i(this.f97148a, "coupons", "coupons-mag", (Map) null, false, false, false, 60, (Object) null);
    }
}
