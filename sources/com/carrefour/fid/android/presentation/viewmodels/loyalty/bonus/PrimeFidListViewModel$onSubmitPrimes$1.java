package com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus;

import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$onSubmitPrimes$1", mo22502f = "PrimeFidListViewModel.kt", mo22503i = {}, mo22504l = {113, 111, 135}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PrimeFidListViewModel$onSubmitPrimes$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ List<DataPrimeCmsResponse> $primes;
    final /* synthetic */ List<DataPrimeCmsResponse> $selectedPrimes;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PrimeFidListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrimeFidListViewModel$onSubmitPrimes$1(PrimeFidListViewModel primeFidListViewModel, List<DataPrimeCmsResponse> list, List<DataPrimeCmsResponse> list2, C11045c<? super PrimeFidListViewModel$onSubmitPrimes$1> cVar) {
        super(2, cVar);
        this.this$0 = primeFidListViewModel;
        this.$selectedPrimes = list;
        this.$primes = list2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PrimeFidListViewModel$onSubmitPrimes$1(this.this$0, this.$selectedPrimes, this.$primes, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009f  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r13.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 == r5) goto L_0x0035
            if (r1 == r4) goto L_0x002b
            if (r1 != r3) goto L_0x0023
            java.lang.Object r0 = r13.L$2
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel) r0
            java.lang.Object r1 = r13.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r13.L$0
            kotlin.Result r2 = (kotlin.Result) r2
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00b3
        L_0x0023:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x002b:
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x006c
        L_0x0035:
            java.lang.Object r1 = r13.L$0
            com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase r1 = (com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase) r1
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0054
        L_0x003d:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r14 = r13.this$0
            com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase r1 = r14.f64797a
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r14 = r13.this$0
            r13.L$0 = r1
            r13.label = r5
            r6 = 0
            java.lang.Object r14 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.m112938D0(r14, r6, r13, r5, r2)
            if (r14 != r0) goto L_0x0054
            return r0
        L_0x0054:
            java.lang.String r14 = (java.lang.String) r14
            java.util.List<com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse> r5 = r13.$selectedPrimes
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase$Params r7 = new com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase$Params
            r7.<init>(r14, r5, r6)
            r13.L$0 = r2
            r13.label = r4
            java.lang.Object r14 = r1.m173068invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase.Params) r7, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>>) r13)
            if (r14 != r0) goto L_0x006c
            return r0
        L_0x006c:
            kotlin.Result r14 = kotlin.Result.m38701a(r14)
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r1 = r13.this$0
            java.util.List<com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse> r2 = r13.$primes
            java.util.List<com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse> r4 = r13.$selectedPrimes
            java.lang.Object r5 = r14.mo21858l()
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$c r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.m112942g0(r1)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 11
            r12 = 0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$c r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26532c.m113001j(r6, r7, r8, r9, r10, r11, r12)
            r1.publishState(r6)
            boolean r5 = kotlin.Result.m38709i(r5)
            if (r5 == 0) goto L_0x009f
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a r14 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$a$c r0 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26523a.C26526c.f64826a
            r14.<init>(r0)
            r1.emitEvent(r14)
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        L_0x009f:
            r1.f64808l = r2
            r13.L$0 = r14
            r13.L$1 = r4
            r13.L$2 = r1
            r13.label = r3
            java.lang.Object r14 = r1.mo77091E0(r13)
            if (r14 != r0) goto L_0x00b1
            return r0
        L_0x00b1:
            r0 = r1
            r1 = r4
        L_0x00b3:
            java.lang.String r14 = (java.lang.String) r14
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$d r2 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$d
            r2.<init>(r1, r14)
            r0.emitEvent(r2)
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$onSubmitPrimes$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PrimeFidListViewModel$onSubmitPrimes$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
