package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.C23843c;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$OnlineCoupons$1$1$2$1 */
public final class CouponsListStatefulKt$OnlineCoupons$1$1$2$1 extends Lambda implements C11300l<CouponModel, C11079d2> {
    final /* synthetic */ C11300l<C23843c, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$OnlineCoupons$1$1$2$1(C11300l<? super C23843c, C11079d2> lVar) {
        super(1);
        this.$actioner = lVar;
    }

    /* renamed from: a */
    public final void mo69799a(@C12579k CouponModel couponModel) {
        Intrinsics.checkNotNullParameter(couponModel, FirebaseAnalytics.C32532b.f78957j);
        this.$actioner.invoke(new C23843c.C23844a.C23847c(couponModel));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo69799a((CouponModel) obj);
        return C11079d2.f28267a;
    }
}
