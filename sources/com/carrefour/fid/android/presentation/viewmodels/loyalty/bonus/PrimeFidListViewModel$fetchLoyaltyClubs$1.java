package com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus;

import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$fetchLoyaltyClubs$1", mo22502f = "PrimeFidListViewModel.kt", mo22503i = {3}, mo22504l = {279, 287, 287, 312, 293}, mo22505m = "invokeSuspend", mo22506n = {"listPrime"}, mo22507s = {"L$1"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPrimeFidListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimeFidListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/PrimeFidListViewModel$fetchLoyaltyClubs$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,394:1\n766#2:395\n857#2,2:396\n1747#2,3:398\n*S KotlinDebug\n*F\n+ 1 PrimeFidListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/PrimeFidListViewModel$fetchLoyaltyClubs$1\n*L\n304#1:395\n304#1:396,2\n312#1:398,3\n*E\n"})
public final class PrimeFidListViewModel$fetchLoyaltyClubs$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ List<DataPrimeCmsResponse> $cmsPrimeList;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PrimeFidListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrimeFidListViewModel$fetchLoyaltyClubs$1(PrimeFidListViewModel primeFidListViewModel, List<DataPrimeCmsResponse> list, C11045c<? super PrimeFidListViewModel$fetchLoyaltyClubs$1> cVar) {
        super(2, cVar);
        this.this$0 = primeFidListViewModel;
        this.$cmsPrimeList = list;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PrimeFidListViewModel$fetchLoyaltyClubs$1(this.this$0, this.$cmsPrimeList, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0108, code lost:
        if (r2 == null) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015e  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r7) goto L_0x004f
            if (r2 == r6) goto L_0x0045
            if (r2 == r5) goto L_0x0038
            if (r2 == r4) goto L_0x002a
            if (r2 != r3) goto L_0x0022
            java.lang.Object r1 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r1 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel) r1
            kotlin.C11661u0.m45747n(r18)
            goto L_0x017d
        L_0x0022:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002a:
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel) r2
            kotlin.C11661u0.m45747n(r18)
            r8 = r1
            goto L_0x014c
        L_0x0038:
            kotlin.C11661u0.m45747n(r18)
            r2 = r18
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.mo21858l()
            goto L_0x00b5
        L_0x0045:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase r2 = (com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase) r2
            kotlin.C11661u0.m45747n(r18)
            r6 = r18
            goto L_0x00a2
        L_0x004f:
            kotlin.C11661u0.m45747n(r18)
            r2 = r18
            goto L_0x0079
        L_0x0055:
            kotlin.C11661u0.m45747n(r18)
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r2 = r0.this$0
            boolean r2 = r2.mo77096J0()
            if (r2 != 0) goto L_0x006e
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r1 = r0.this$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a r2 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$a$b r3 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26523a.C26525b.f64824a
            r2.<init>(r3)
            r1.emitEvent(r2)
            goto L_0x0187
        L_0x006e:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r2 = r0.this$0
            r0.label = r7
            java.lang.Object r2 = r2.mo77093G0(r0)
            if (r2 != r1) goto L_0x0079
            return r1
        L_0x0079:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x008f
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r1 = r0.this$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a r2 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$a$a r3 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26523a.C26524a.f64822a
            r2.<init>(r3)
            r1.emitEvent(r2)
            goto L_0x0187
        L_0x008f:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r2 = r0.this$0
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase r2 = r2.f64799c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r8 = r0.this$0
            r0.L$0 = r2
            r0.label = r6
            java.lang.Object r6 = r8.mo77090C0(r7, r0)
            if (r6 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            java.lang.String r6 = (java.lang.String) r6
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase$Params r8 = new com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase$Params
            r8.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r2 = r2.m173046invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase.Params) r8, (kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.loyalty.data.models.entities.ClubsResponse>>>) r0)
            if (r2 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r5 = r0.this$0
            java.util.List<com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse> r6 = r0.$cmsPrimeList
            java.lang.Throwable r8 = kotlin.Result.m38705e(r2)
            r9 = 0
            if (r8 != 0) goto L_0x015e
            java.util.List r2 = (java.util.List) r2
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$c r10 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.m112942g0(r5)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 14
            r16 = 0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$c r3 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26532c.m113001j(r10, r11, r12, r13, r14, r15, r16)
            r5.publishState(r3)
            if (r6 == 0) goto L_0x010a
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r3 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00e4:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x0104
            java.lang.Object r10 = r2.next()
            r11 = r10
            com.carrefour.fid.android.loyalty.data.models.entities.ClubsResponse r11 = (com.carrefour.fid.android.loyalty.data.models.entities.ClubsResponse) r11
            java.lang.String r11 = r11.getUnsubscribeDate()
            int r11 = r11.length()
            if (r11 != 0) goto L_0x00fd
            r11 = r7
            goto L_0x00fe
        L_0x00fd:
            r11 = r9
        L_0x00fe:
            if (r11 == 0) goto L_0x00e4
            r8.add(r10)
            goto L_0x00e4
        L_0x0104:
            java.util.List r2 = r3.filterPrimesFidList(r8, r6)
            if (r2 != 0) goto L_0x0112
        L_0x010a:
            if (r6 != 0) goto L_0x0111
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0112
        L_0x0111:
            r2 = r6
        L_0x0112:
            r5.f64808l = r2
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r6 = r3 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0127
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0127
        L_0x0125:
            r7 = r9
            goto L_0x013d
        L_0x0127:
            java.util.Iterator r3 = r3.iterator()
        L_0x012b:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0125
            java.lang.Object r6 = r3.next()
            com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse r6 = (com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse) r6
            boolean r6 = r6.isSelected()
            if (r6 == 0) goto L_0x012b
        L_0x013d:
            r0.L$0 = r5
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r3 = r5.mo77101O0(r7, r0)
            if (r3 != r1) goto L_0x014a
            return r1
        L_0x014a:
            r8 = r2
            r2 = r5
        L_0x014c:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$c r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.m112942g0(r2)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 12
            r12 = 0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26532c.m113001j(r6, r7, r8, r9, r10, r11, r12)
            r2.publishState(r1)
            goto L_0x0187
        L_0x015e:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$c r10 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.m112942g0(r5)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 14
            r16 = 0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$c r2 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26532c.m113001j(r10, r11, r12, r13, r14, r15, r16)
            r5.publishState(r2)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r2 = r5.mo77101O0(r9, r0)
            if (r2 != r1) goto L_0x017c
            return r1
        L_0x017c:
            r1 = r5
        L_0x017d:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a r2 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$a$c r3 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26523a.C26526c.f64826a
            r2.<init>(r3)
            r1.emitEvent(r2)
        L_0x0187:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$fetchLoyaltyClubs$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PrimeFidListViewModel$fetchLoyaltyClubs$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
