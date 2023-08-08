package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.presentation.models.CouponDetailsResult;
import com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCouponsListStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/CouponsListStatefulKt$CouponsListStateful$8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,661:1\n1#2:662\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$8 */
public final class CouponsListStatefulKt$CouponsListStateful$8 extends Lambda implements C11300l<CouponDetailsResult, C11079d2> {
    final /* synthetic */ C8700z0<CouponDetailsResult> $lastUpdatedCouponFromDetails;
    final /* synthetic */ CouponsListViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$CouponsListStateful$8(C8700z0<CouponDetailsResult> z0Var, CouponsListViewModel couponsListViewModel) {
        super(1);
        this.$lastUpdatedCouponFromDetails = z0Var;
        this.$viewModel = couponsListViewModel;
    }

    /* renamed from: a */
    public final void mo69777a(@C12580l CouponDetailsResult couponDetailsResult) {
        if (!Intrinsics.areEqual((Object) couponDetailsResult, (Object) this.$lastUpdatedCouponFromDetails.getValue())) {
            this.$lastUpdatedCouponFromDetails.setValue(couponDetailsResult);
            CouponDetailsResult value = this.$lastUpdatedCouponFromDetails.getValue();
            if (value != null) {
                this.$viewModel.mo76264q0(value);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo69777a((CouponDetailsResult) obj);
        return C11079d2.f28267a;
    }
}
