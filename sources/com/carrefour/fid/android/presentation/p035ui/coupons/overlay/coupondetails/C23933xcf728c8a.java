package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails;

import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.analytics.C23943a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt$CouponDetailsOverlayBottomSheetStateful$1 */
public final class C23933xcf728c8a extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C23943a $couponAnalytics;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23933xcf728c8a(C23943a aVar) {
        super(0);
        this.$couponAnalytics = aVar;
    }

    public final void invoke() {
        this.$couponAnalytics.sendScreenView();
    }
}
