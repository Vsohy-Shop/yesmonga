package com.carrefour.fid.android.presentation.viewmodels.coupons.overlay;

import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase;
import com.carrefour.fid.android.presentation.models.CouponDetailModel;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.nav.C23954a;
import com.carrefour.fid.android.shared.type.C28892e;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11948r;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayCouponDetailsBottomSheetViewModel;", "Landroidx/lifecycle/v0;", "", "status", "Lkotlin/d2;", "g0", "Lcom/carrefour/fid/android/presentation/models/CouponModel;", "i0", "Lcom/carrefour/fid/android/domain/interactors/coupons/UpdateCouponDetailsUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/coupons/UpdateCouponDetailsUseCase;", "updateCouponDetailsUseCase", "Lcom/carrefour/fid/android/presentation/models/CouponDetailModel;", "b", "Lcom/carrefour/fid/android/presentation/models/CouponDetailModel;", "selectedCoupon", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/shared/type/e;", "c", "Lkotlinx/coroutines/flow/j;", "_couponDetailsStatus", "d", "_couponDetailModel", "Lkotlinx/coroutines/flow/u;", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/d;", "e", "Lkotlinx/coroutines/flow/u;", "h0", "()Lkotlinx/coroutines/flow/u;", "state", "Landroidx/lifecycle/p0;", "savedStateHandle", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/coupons/UpdateCouponDetailsUseCase;Landroidx/lifecycle/p0;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nOverlayCouponDetailsBottomSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayCouponDetailsBottomSheetViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayCouponDetailsBottomSheetViewModel\n+ 2 NavArguments.kt\ncom/carrefour/fid/android/presentation/ui/coupons/overlay/coupondetails/nav/NavArgumentsKt\n*L\n1#1,65:1\n7#2:66\n*S KotlinDebug\n*F\n+ 1 OverlayCouponDetailsBottomSheetViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayCouponDetailsBottomSheetViewModel\n*L\n25#1:66\n*E\n"})
public final class OverlayCouponDetailsBottomSheetViewModel extends C19476v0 {
    @C12579k

    /* renamed from: a */
    public final UpdateCouponDetailsUseCase f64277a;
    @C12579k

    /* renamed from: b */
    public final CouponDetailModel f64278b;
    @C12579k

    /* renamed from: c */
    public final C11940j<C28892e<C11079d2>> f64279c;
    @C12579k

    /* renamed from: d */
    public final C11940j<CouponDetailModel> f64280d;
    @C12579k

    /* renamed from: e */
    public final C11952u<C26313d> f64281e;

    @Inject
    public OverlayCouponDetailsBottomSheetViewModel(@C12579k UpdateCouponDetailsUseCase updateCouponDetailsUseCase, @C12579k C19456p0 p0Var) {
        Intrinsics.checkNotNullParameter(updateCouponDetailsUseCase, "updateCouponDetailsUseCase");
        Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
        this.f64277a = updateCouponDetailsUseCase;
        Object h = p0Var.mo57648h(C23954a.f60133a);
        Intrinsics.checkNotNull(h);
        CouponDetailModel couponDetailModel = (CouponDetailModel) h;
        this.f64278b = couponDetailModel;
        C11940j<C28892e<C11079d2>> a = C11953v.m47628a(C28892e.C28896d.f70785b);
        this.f64279c = a;
        C11940j<CouponDetailModel> a2 = C11953v.m47628a(couponDetailModel);
        this.f64280d = a2;
        this.f64281e = C11909g.m47392O1(C11909g.m47357D(a, a2, new OverlayCouponDetailsBottomSheetViewModel$state$1((C11045c<? super OverlayCouponDetailsBottomSheetViewModel$state$1>) null)), C19500w0.m90846a(this), C11948r.f29534a.mo24272c(), new C26313d((C28892e) null, (CouponModel) null, 3, (DefaultConstructorMarker) null));
    }

    /* renamed from: g0 */
    public final void mo76487g0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "status");
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new OverlayCouponDetailsBottomSheetViewModel$editCouponStatus$1(this, str, (C11045c<? super OverlayCouponDetailsBottomSheetViewModel$editCouponStatus$1>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: h0 */
    public final C11952u<C26313d> mo76488h0() {
        return this.f64281e;
    }

    @C12580l
    /* renamed from: i0 */
    public final CouponModel mo76489i0() {
        if (this.f64278b.mo121361e().mo121403S() == this.f64280d.getValue().mo121361e().mo121403S()) {
            return null;
        }
        return this.f64280d.getValue().mo121361e();
    }
}
