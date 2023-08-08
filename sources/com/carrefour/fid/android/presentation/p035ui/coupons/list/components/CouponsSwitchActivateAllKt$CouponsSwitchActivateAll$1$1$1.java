package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsSwitchActivateAllKt$CouponsSwitchActivateAll$1$1$1 */
public final class CouponsSwitchActivateAllKt$CouponsSwitchActivateAll$1$1$1 extends Lambda implements C11300l<Boolean, C11079d2> {
    final /* synthetic */ C11300l<Boolean, C11079d2> $onAllCouponsSwitchClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsSwitchActivateAllKt$CouponsSwitchActivateAll$1$1$1(C11300l<? super Boolean, C11079d2> lVar) {
        super(1);
        this.$onAllCouponsSwitchClicked = lVar;
    }

    /* renamed from: a */
    public final void mo69912a(boolean z) {
        this.$onAllCouponsSwitchClicked.invoke(Boolean.valueOf(z));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo69912a(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
