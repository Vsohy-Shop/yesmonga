package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails;

import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.C23939a;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.analytics.C23943a;
import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayCouponDetailsBottomSheetViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt$CouponDetailsOverlayBottomSheetStateful$actioner$1 */
public final class C23935xf69c54f7 extends Lambda implements C11300l<C23939a, C11079d2> {
    final /* synthetic */ C23943a $couponAnalytics;
    final /* synthetic */ C11289a<C11079d2> $onCloseBottomSheetClick;
    final /* synthetic */ OverlayCouponDetailsBottomSheetViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23935xf69c54f7(C11289a<C11079d2> aVar, OverlayCouponDetailsBottomSheetViewModel overlayCouponDetailsBottomSheetViewModel, C23943a aVar2) {
        super(1);
        this.$onCloseBottomSheetClick = aVar;
        this.$viewModel = overlayCouponDetailsBottomSheetViewModel;
        this.$couponAnalytics = aVar2;
    }

    /* renamed from: a */
    public final void mo70061a(@C12579k C23939a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        if (Intrinsics.areEqual((Object) aVar, (Object) C23939a.C23942c.f60111a)) {
            this.$onCloseBottomSheetClick.invoke();
        } else if (aVar instanceof C23939a.C23940a) {
            C23939a.C23940a aVar2 = (C23939a.C23940a) aVar;
            this.$viewModel.mo76487g0(aVar2.mo70073d());
            this.$couponAnalytics.mo70078c(Intrinsics.areEqual((Object) aVar2.mo70073d(), (Object) CouponStatus.LOADEDTOCARD.getType()));
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C23939a.C23941b.f60109a)) {
            this.$couponAnalytics.mo70077a();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo70061a((C23939a) obj);
        return C11079d2.f28267a;
    }
}
