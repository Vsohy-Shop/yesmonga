package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails;

import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.C23939a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt$CouponButton$1$1 */
public final class CouponDetailsOverlayBottomSheetStatefulKt$CouponButton$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C23939a, C11079d2> $actioner;
    final /* synthetic */ Ref.ObjectRef<String> $couponStatus;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponDetailsOverlayBottomSheetStatefulKt$CouponButton$1$1(C11300l<? super C23939a, C11079d2> lVar, Ref.ObjectRef<String> objectRef) {
        super(0);
        this.$actioner = lVar;
        this.$couponStatus = objectRef;
    }

    public final void invoke() {
        this.$actioner.invoke(new C23939a.C23940a((String) this.$couponStatus.element));
    }
}
