package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import com.carrefour.fid.android.presentation.models.CouponModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsFlowRowKt$CouponsFlowRow$1$1$1 */
public final class CouponsFlowRowKt$CouponsFlowRow$1$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ CouponModel $coupon;
    final /* synthetic */ C11300l<CouponModel, C11079d2> $onCouponClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsFlowRowKt$CouponsFlowRow$1$1$1(C11300l<? super CouponModel, C11079d2> lVar, CouponModel couponModel) {
        super(0);
        this.$onCouponClicked = lVar;
        this.$coupon = couponModel;
    }

    public final void invoke() {
        this.$onCouponClicked.invoke(this.$coupon);
    }
}
