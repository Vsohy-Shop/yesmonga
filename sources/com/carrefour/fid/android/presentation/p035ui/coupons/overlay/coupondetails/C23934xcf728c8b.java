package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.analytics.C23943a;
import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayCouponDetailsBottomSheetViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt$CouponDetailsOverlayBottomSheetStateful$2 */
public final class C23934xcf728c8b extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C23943a $couponAnalytics;
    final /* synthetic */ C11289a<C11079d2> $onCloseBottomSheetClick;
    final /* synthetic */ OverlayCouponDetailsBottomSheetViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23934xcf728c8b(OverlayCouponDetailsBottomSheetViewModel overlayCouponDetailsBottomSheetViewModel, C23943a aVar, C11289a<C11079d2> aVar2, int i) {
        super(2);
        this.$viewModel = overlayCouponDetailsBottomSheetViewModel;
        this.$couponAnalytics = aVar;
        this.$onCloseBottomSheetClick = aVar2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CouponDetailsOverlayBottomSheetStatefulKt.m105789c(this.$viewModel, this.$couponAnalytics, this.$onCloseBottomSheetClick, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
