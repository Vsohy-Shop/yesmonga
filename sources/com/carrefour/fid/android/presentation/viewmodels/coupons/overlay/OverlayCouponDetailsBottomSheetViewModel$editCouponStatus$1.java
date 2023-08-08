package com.carrefour.fid.android.presentation.viewmodels.coupons.overlay;

import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.data.entities.coupons.CouponType;
import com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase;
import com.carrefour.fid.android.domain.models.DiscountType;
import com.carrefour.fid.android.presentation.models.CouponDetailModel;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.Facility;
import com.carrefour.fid.android.presentation.models.Image;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayCouponDetailsBottomSheetViewModel$editCouponStatus$1", mo22502f = "OverlayCouponDetailsBottomSheetViewModel.kt", mo22503i = {}, mo22504l = {39}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nOverlayCouponDetailsBottomSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayCouponDetailsBottomSheetViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayCouponDetailsBottomSheetViewModel$editCouponStatus$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,65:1\n230#2,5:66\n230#2,5:71\n230#2,5:76\n230#2,5:81\n*S KotlinDebug\n*F\n+ 1 OverlayCouponDetailsBottomSheetViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayCouponDetailsBottomSheetViewModel$editCouponStatus$1\n*L\n38#1:66,5\n47#1:71,5\n50#1:76,5\n52#1:81,5\n*E\n"})
public final class OverlayCouponDetailsBottomSheetViewModel$editCouponStatus$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $status;
    int label;
    final /* synthetic */ OverlayCouponDetailsBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverlayCouponDetailsBottomSheetViewModel$editCouponStatus$1(OverlayCouponDetailsBottomSheetViewModel overlayCouponDetailsBottomSheetViewModel, String str, C11045c<? super OverlayCouponDetailsBottomSheetViewModel$editCouponStatus$1> cVar) {
        super(2, cVar);
        this.this$0 = overlayCouponDetailsBottomSheetViewModel;
        this.$status = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new OverlayCouponDetailsBottomSheetViewModel$editCouponStatus$1(this.this$0, this.$status, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11940j f0 = this.this$0.f64279c;
            do {
                value4 = f0.getValue();
                C28892e eVar = (C28892e) value4;
            } while (!f0.mo24216e(value4, C28892e.C28894b.f70781b));
            UpdateCouponDetailsUseCase d0 = this.this$0.f64277a;
            UpdateCouponDetailsUseCase.C37638a aVar = new UpdateCouponDetailsUseCase.C37638a(this.$status, this.this$0.f64278b.mo121361e().mo121392H(), this.this$0.f64278b.mo121361e().mo121407W(), this.this$0.f64278b.mo121363f());
            this.label = 1;
            Object c = d0.m172954invokegIAlus(aVar, this);
            if (c == h) {
                return h;
            }
            obj2 = c;
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        OverlayCouponDetailsBottomSheetViewModel overlayCouponDetailsBottomSheetViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            CouponStatus couponStatus = (CouponStatus) obj2;
            C11940j f02 = overlayCouponDetailsBottomSheetViewModel.f64279c;
            do {
                value2 = f02.getValue();
                C28892e eVar2 = (C28892e) value2;
            } while (!f02.mo24216e(value2, new C28892e.C28895c(C11079d2.f28267a)));
            CouponDetailModel d = CouponDetailModel.m159006d((CouponDetailModel) overlayCouponDetailsBottomSheetViewModel.f64280d.getValue(), CouponModel.m159022x(((CouponDetailModel) overlayCouponDetailsBottomSheetViewModel.f64280d.getValue()).mo121361e(), 0, (String) null, (String) null, (String) null, (CouponType) null, (String) null, (String) null, 0, (String) null, (List) null, (String) null, (Double) null, (DiscountType) null, (String) null, couponStatus, (Image) null, (List) null, (String) null, (Facility) null, (String) null, (CouponModel.State) null, (String) null, 4177919, (Object) null), 0, 2, (Object) null);
            C11940j e0 = overlayCouponDetailsBottomSheetViewModel.f64280d;
            do {
                value3 = e0.getValue();
                CouponDetailModel couponDetailModel = (CouponDetailModel) value3;
            } while (!e0.mo24216e(value3, d));
        }
        OverlayCouponDetailsBottomSheetViewModel overlayCouponDetailsBottomSheetViewModel2 = this.this$0;
        Throwable e = Result.m38705e(obj2);
        if (e != null) {
            C11940j f03 = overlayCouponDetailsBottomSheetViewModel2.f64279c;
            do {
                value = f03.getValue();
                C28892e eVar3 = (C28892e) value;
            } while (!f03.mo24216e(value, new C28892e.C28893a(e)));
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((OverlayCouponDetailsBottomSheetViewModel$editCouponStatus$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
