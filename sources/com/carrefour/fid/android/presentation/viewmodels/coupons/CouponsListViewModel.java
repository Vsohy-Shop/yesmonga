package com.carrefour.fid.android.presentation.viewmodels.coupons;

import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.coupons.C37643a;
import com.carrefour.fid.android.domain.interactors.coupons.C37653k;
import com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase;
import com.carrefour.fid.android.presentation.models.CouponDetailsResult;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.FilterResult;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.C23886i;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.type.C28897f;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11948r;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010\n\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u0014\u0010\u0013\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\u0015\u001a\u00020\u0014H\u0002R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0)8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u0010;\u001a\b\u0012\u0004\u0012\u000202068\u0000X\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0014018\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u00104R\u0018\u0010@\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R \u0010G\u001a\b\u0012\u0004\u0012\u00020B0A8\u0000X\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006L"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/coupons/CouponsListViewModel;", "Landroidx/lifecycle/v0;", "Lkotlin/d2;", "m0", "", "Lcom/carrefour/fid/android/presentation/models/CouponModel;", "coupons", "", "isAnActivation", "isSwitchAllCoupons", "r0", "Lcom/carrefour/fid/android/presentation/models/FilterResult;", "filterResult", "s0", "", "n0", "Lcom/carrefour/fid/android/presentation/models/CouponDetailsResult;", "detailsResult", "q0", "k0", "Lkotlinx/coroutines/c2;", "l0", "Lcom/carrefour/fid/android/domain/interactors/coupons/GetAvailableCouponsUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/coupons/GetAvailableCouponsUseCase;", "getAvailableCouponsUseCase", "Lcom/carrefour/fid/android/domain/interactors/coupons/UpdateCouponsUseCase;", "b", "Lcom/carrefour/fid/android/domain/interactors/coupons/UpdateCouponsUseCase;", "updateCouponsUseCase", "Lcom/carrefour/fid/android/domain/interactors/coupons/k;", "c", "Lcom/carrefour/fid/android/domain/interactors/coupons/k;", "updateCouponFromDetailsUseCase", "Lcom/carrefour/fid/android/domain/interactors/coupons/PrintCouponsUseCase;", "d", "Lcom/carrefour/fid/android/domain/interactors/coupons/PrintCouponsUseCase;", "printCouponsUseCase", "e", "Z", "isOnlineOnly", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/shared/type/e;", "Lcom/carrefour/fid/android/domain/interactors/coupons/a;", "f", "Lkotlinx/coroutines/flow/j;", "_couponContentState", "g", "_filterResult", "Lkotlinx/coroutines/channels/g;", "Lcom/carrefour/fid/android/presentation/ui/coupons/list/i;", "h", "Lkotlinx/coroutines/channels/g;", "_sideEffect", "Lkotlinx/coroutines/flow/e;", "i", "Lkotlinx/coroutines/flow/e;", "o0", "()Lkotlinx/coroutines/flow/e;", "sideEffect", "j", "_couponsJobQueue", "k", "Lkotlinx/coroutines/c2;", "jobQueue", "Lkotlinx/coroutines/flow/u;", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/d;", "l", "Lkotlinx/coroutines/flow/u;", "p0", "()Lkotlinx/coroutines/flow/u;", "state", "Landroidx/lifecycle/p0;", "savedStateHandle", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/coupons/GetAvailableCouponsUseCase;Lcom/carrefour/fid/android/domain/interactors/coupons/UpdateCouponsUseCase;Lcom/carrefour/fid/android/domain/interactors/coupons/k;Lcom/carrefour/fid/android/domain/interactors/coupons/PrintCouponsUseCase;Landroidx/lifecycle/p0;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCouponsListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/CouponsListViewModel\n+ 2 NavArguments.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/NavArgumentsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n7#2:215\n230#3,5:216\n1774#4,4:221\n*S KotlinDebug\n*F\n+ 1 CouponsListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/CouponsListViewModel\n*L\n41#1:215\n125#1:216,5\n129#1:221,4\n*E\n"})
public final class CouponsListViewModel extends C19476v0 {
    @C12579k

    /* renamed from: a */
    public final GetAvailableCouponsUseCase f64134a;
    @C12579k

    /* renamed from: b */
    public final UpdateCouponsUseCase f64135b;
    @C12579k

    /* renamed from: c */
    public final C37653k f64136c;
    @C12579k

    /* renamed from: d */
    public final PrintCouponsUseCase f64137d;

    /* renamed from: e */
    public final boolean f64138e;
    @C12579k

    /* renamed from: f */
    public final C11940j<C28892e<C37643a>> f64139f;
    @C12579k

    /* renamed from: g */
    public final C11940j<FilterResult> f64140g;
    @C12579k

    /* renamed from: h */
    public final C11744g<C23886i> f64141h;
    @C12579k

    /* renamed from: i */
    public final C11907e<C23886i> f64142i;
    @C12579k

    /* renamed from: j */
    public final C11744g<C11723c2> f64143j = C11748i.m46625d(Integer.MAX_VALUE, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
    @C12580l

    /* renamed from: k */
    public C11723c2 f64144k;
    @C12579k

    /* renamed from: l */
    public final C11952u<C26221d> f64145l;

    @Inject
    public CouponsListViewModel(@C12579k GetAvailableCouponsUseCase getAvailableCouponsUseCase, @C12579k UpdateCouponsUseCase updateCouponsUseCase, @C12579k C37653k kVar, @C12579k PrintCouponsUseCase printCouponsUseCase, @C12579k C19456p0 p0Var) {
        Intrinsics.checkNotNullParameter(getAvailableCouponsUseCase, "getAvailableCouponsUseCase");
        Intrinsics.checkNotNullParameter(updateCouponsUseCase, "updateCouponsUseCase");
        Intrinsics.checkNotNullParameter(kVar, "updateCouponFromDetailsUseCase");
        Intrinsics.checkNotNullParameter(printCouponsUseCase, "printCouponsUseCase");
        Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
        this.f64134a = getAvailableCouponsUseCase;
        this.f64135b = updateCouponsUseCase;
        this.f64136c = kVar;
        this.f64137d = printCouponsUseCase;
        Object h = p0Var.mo57648h(C26236h.f64162a);
        Intrinsics.checkNotNull(h);
        this.f64138e = ((Boolean) h).booleanValue();
        C11940j<C28892e<C37643a>> a = C11953v.m47628a(C28892e.C28896d.f70785b);
        this.f64139f = a;
        C11940j<FilterResult> a2 = C11953v.m47628a(null);
        this.f64140g = a2;
        C11744g<C23886i> d = C11748i.m46625d(-2, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this.f64141h = d;
        this.f64142i = C11909g.m47490s1(d);
        this.f64145l = C11909g.m47392O1(C11909g.m47357D(a, a2, new CouponsListViewModel$state$1(this, (C11045c<? super CouponsListViewModel$state$1>) null)), C19500w0.m90846a(this), C11948r.f29534a.mo24272c(), new C26221d((C28892e) null, false, (FilterResult) null, 7, (DefaultConstructorMarker) null));
        mo76260m0();
        this.f64144k = mo76259l0();
    }

    /* renamed from: k0 */
    public final void mo76258k0(@C12579k List<CouponModel> list) {
        Intrinsics.checkNotNullParameter(list, "coupons");
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CouponsListViewModel$burnCoupons$1(this, C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, CoroutineStart.LAZY, new CouponsListViewModel$burnCoupons$job$1(this, list, (C11045c<? super CouponsListViewModel$burnCoupons$job$1>) null), 1, (Object) null), (C11045c<? super CouponsListViewModel$burnCoupons$1>) null), 3, (Object) null);
    }

    /* renamed from: l0 */
    public final C11723c2 mo76259l0() {
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CouponsListViewModel$consumeJobQueue$1(this, (C11045c<? super CouponsListViewModel$consumeJobQueue$1>) null), 3, (Object) null);
    }

    /* renamed from: m0 */
    public final void mo76260m0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CouponsListViewModel$getAvailableCoupons$1(this, (C11045c<? super CouponsListViewModel$getAvailableCoupons$1>) null), 3, (Object) null);
    }

    /* renamed from: n0 */
    public final int mo76261n0() {
        int i;
        C37643a aVar = (C37643a) C28897f.m119478b(this.f64139f.getValue());
        int i2 = 0;
        if (aVar == null) {
            return 0;
        }
        Iterable<CouponModel> j = aVar.mo114619j();
        if (!(j instanceof Collection) || !((Collection) j).isEmpty()) {
            i = 0;
            for (CouponModel isSelected : j) {
                if (isSelected.isSelected() && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.m40458V();
                }
            }
        } else {
            i = 0;
        }
        Iterable<CouponModel> i3 = aVar.mo114618i();
        if (!(i3 instanceof Collection) || !((Collection) i3).isEmpty()) {
            for (CouponModel isSelected2 : i3) {
                if (isSelected2.isSelected() && (i2 = i2 + 1) < 0) {
                    CollectionsKt__CollectionsKt.m40458V();
                }
            }
        }
        return i + i2;
    }

    @C12579k
    /* renamed from: o0 */
    public final C11907e<C23886i> mo76262o0() {
        return this.f64142i;
    }

    @C12579k
    /* renamed from: p0 */
    public final C11952u<C26221d> mo76263p0() {
        return this.f64145l;
    }

    /* renamed from: q0 */
    public final void mo76264q0(@C12579k CouponDetailsResult couponDetailsResult) {
        Intrinsics.checkNotNullParameter(couponDetailsResult, "detailsResult");
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CouponsListViewModel$updateCouponFromDetails$1(this, couponDetailsResult, (C11045c<? super CouponsListViewModel$updateCouponFromDetails$1>) null), 3, (Object) null);
    }

    /* renamed from: r0 */
    public final void mo76265r0(@C12579k List<CouponModel> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "coupons");
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CouponsListViewModel$updateCoupons$1(this, C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, CoroutineStart.LAZY, new CouponsListViewModel$updateCoupons$job$1(this, list, z, z2, (C11045c<? super CouponsListViewModel$updateCoupons$job$1>) null), 1, (Object) null), (C11045c<? super CouponsListViewModel$updateCoupons$1>) null), 3, (Object) null);
    }

    /* renamed from: s0 */
    public final void mo76266s0(@C12580l FilterResult filterResult) {
        FilterResult value;
        C11940j<FilterResult> jVar = this.f64140g;
        do {
            value = jVar.getValue();
            FilterResult filterResult2 = value;
        } while (!jVar.mo24216e(value, filterResult));
    }
}
