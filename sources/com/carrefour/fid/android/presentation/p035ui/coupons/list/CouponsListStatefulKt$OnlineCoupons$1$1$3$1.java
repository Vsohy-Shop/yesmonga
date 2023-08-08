package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.C23843c;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$OnlineCoupons$1$1$3$1 */
public final class CouponsListStatefulKt$OnlineCoupons$1$1$3$1 extends Lambda implements C11304p<CouponModel, Boolean, C11079d2> {
    final /* synthetic */ C11300l<C23843c, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$OnlineCoupons$1$1$3$1(C11300l<? super C23843c, C11079d2> lVar) {
        super(2);
        this.$actioner = lVar;
    }

    /* renamed from: a */
    public final void mo69800a(@C12579k CouponModel couponModel, boolean z) {
        Intrinsics.checkNotNullParameter(couponModel, FirebaseAnalytics.C32532b.f78957j);
        this.$actioner.invoke(new C23843c.C23844a.C23845a(couponModel, z));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo69800a((CouponModel) obj, ((Boolean) obj2).booleanValue());
        return C11079d2.f28267a;
    }
}
