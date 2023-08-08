package com.carrefour.fid.android.presentation.viewmodels.coupons.overlay;

import com.carrefour.fid.android.presentation.models.CouponDetailModel;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayCouponDetailsBottomSheetViewModel$state$1", mo22502f = "OverlayCouponDetailsBottomSheetViewModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/type/e;", "Lkotlin/d2;", "status", "Lcom/carrefour/fid/android/presentation/models/CouponDetailModel;", "couponDetail", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/d;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OverlayCouponDetailsBottomSheetViewModel$state$1 extends SuspendLambda implements C11305q<C28892e<? extends C11079d2>, CouponDetailModel, C11045c<? super C26313d>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public OverlayCouponDetailsBottomSheetViewModel$state$1(C11045c<? super OverlayCouponDetailsBottomSheetViewModel$state$1> cVar) {
        super(3, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C28892e<C11079d2> eVar, @C12579k CouponDetailModel couponDetailModel, @C12580l C11045c<? super C26313d> cVar) {
        OverlayCouponDetailsBottomSheetViewModel$state$1 overlayCouponDetailsBottomSheetViewModel$state$1 = new OverlayCouponDetailsBottomSheetViewModel$state$1(cVar);
        overlayCouponDetailsBottomSheetViewModel$state$1.L$0 = eVar;
        overlayCouponDetailsBottomSheetViewModel$state$1.L$1 = couponDetailModel;
        return overlayCouponDetailsBottomSheetViewModel$state$1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return new C26313d((C28892e) this.L$0, ((CouponDetailModel) this.L$1).mo121361e());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
