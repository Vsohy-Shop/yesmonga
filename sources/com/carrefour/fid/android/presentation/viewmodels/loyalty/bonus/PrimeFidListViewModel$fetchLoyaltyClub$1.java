package com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus;

import com.carrefour.fid.android.cms.domain.interactors.GetCmsPrimeFidListUseCase;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a;
import java.util.Collection;
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
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$fetchLoyaltyClub$1", mo22502f = "PrimeFidListViewModel.kt", mo22503i = {}, mo22504l = {231, 243, 234}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PrimeFidListViewModel$fetchLoyaltyClub$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ boolean $withLoyaltyClub;
    Object L$0;
    int label;
    final /* synthetic */ PrimeFidListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrimeFidListViewModel$fetchLoyaltyClub$1(PrimeFidListViewModel primeFidListViewModel, boolean z, C11045c<? super PrimeFidListViewModel$fetchLoyaltyClub$1> cVar) {
        super(2, cVar);
        this.this$0 = primeFidListViewModel;
        this.$withLoyaltyClub = z;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PrimeFidListViewModel$fetchLoyaltyClub$1(this.this$0, this.$withLoyaltyClub, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        PrimeFidListViewModel primeFidListViewModel;
        PrimeFidListViewModel primeFidListViewModel2;
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C11661u0.m45747n(obj);
            GetCmsPrimeFidListUseCase j0 = this.this$0.f64798b;
            this.label = 1;
            obj2 = j0.m173127invokeIoAF18A(this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else if (i == 2) {
            primeFidListViewModel2 = (PrimeFidListViewModel) this.L$0;
            C11661u0.m45747n(obj);
            primeFidListViewModel2.emitEvent(new C26522a.C26527b.C26528a(C26522a.C26523a.C26526c.f64826a));
            return C11079d2.f28267a;
        } else if (i == 3) {
            primeFidListViewModel = (PrimeFidListViewModel) this.L$0;
            C11661u0.m45747n(obj);
            primeFidListViewModel.emitEvent(new C26522a.C26527b.C26528a(C26522a.C26523a.C26526c.f64826a));
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PrimeFidListViewModel primeFidListViewModel3 = this.this$0;
        boolean z2 = this.$withLoyaltyClub;
        if (Result.m38705e(obj2) == null) {
            List list = (List) obj2;
            Collection collection = list;
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (z) {
                this.L$0 = primeFidListViewModel3;
                this.label = 2;
                if (primeFidListViewModel3.mo77101O0(false, this) == h) {
                    return h;
                }
                primeFidListViewModel2 = primeFidListViewModel3;
                primeFidListViewModel2.emitEvent(new C26522a.C26527b.C26528a(C26522a.C26523a.C26526c.f64826a));
                return C11079d2.f28267a;
            }
            primeFidListViewModel3.f64808l = list;
            if (z2) {
                primeFidListViewModel3.mo77089B0(list);
            } else {
                primeFidListViewModel3.publishState(C26522a.C26532c.m113001j(PrimeFidListViewModel.m112942g0(primeFidListViewModel3), false, list, false, false, 12, (Object) null));
            }
            return C11079d2.f28267a;
        }
        this.L$0 = primeFidListViewModel3;
        this.label = 3;
        if (primeFidListViewModel3.mo77101O0(false, this) == h) {
            return h;
        }
        primeFidListViewModel = primeFidListViewModel3;
        primeFidListViewModel.emitEvent(new C26522a.C26527b.C26528a(C26522a.C26523a.C26526c.f64826a));
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PrimeFidListViewModel$fetchLoyaltyClub$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
