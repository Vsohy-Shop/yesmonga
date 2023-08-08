package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.analytics.C23943a;
import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayCouponDetailsBottomSheetViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetFragment$onViewCreated$1$1 */
public final class CouponDetailsOverlayBottomSheetFragment$onViewCreated$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ CouponDetailsOverlayBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponDetailsOverlayBottomSheetFragment$onViewCreated$1$1(CouponDetailsOverlayBottomSheetFragment couponDetailsOverlayBottomSheetFragment) {
        super(2);
        this.this$0 = couponDetailsOverlayBottomSheetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-931645950, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetFragment.onViewCreated.<anonymous>.<anonymous> (CouponDetailsOverlayBottomSheetFragment.kt:37)");
            }
            OverlayCouponDetailsBottomSheetViewModel R0 = this.this$0.mo70044T0();
            C23943a S0 = this.this$0.mo70043S0();
            final CouponDetailsOverlayBottomSheetFragment couponDetailsOverlayBottomSheetFragment = this.this$0;
            CouponDetailsOverlayBottomSheetStatefulKt.m105789c(R0, S0, new C11289a<C11079d2>() {
                public final void invoke() {
                    couponDetailsOverlayBottomSheetFragment.dismiss();
                }
            }, oVar, 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
