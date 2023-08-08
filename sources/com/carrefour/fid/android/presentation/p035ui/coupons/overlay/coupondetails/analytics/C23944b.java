package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28595t;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.analytics.b */
public final class C23944b implements C23943a {
    @C12579k

    /* renamed from: a */
    public C13783a f60113a;

    @Inject
    public C23944b(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f60113a = aVar;
    }

    /* renamed from: a */
    public void mo70077a() {
        C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "coupons-mag"), C11078d1.m42659a(C28526d.f68906d, "coupons"), C11078d1.m42659a(C28526d.f68929i, "coupons-mag"), C11078d1.m42659a(C28526d.f68933j, C28595t.f69873j));
    }

    /* renamed from: c */
    public void mo70078c(boolean z) {
        String str;
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
        C10977s0.m41456W(pairArr);
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f60113a, "coupons", "fiche-coupon", (Map) null, false, false, false, 60, (Object) null);
    }
}
