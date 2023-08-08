package com.carrefour.fid.android.presentation.viewmodels.loyalty.details;

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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchCoupons$1", mo22502f = "LoyaltyDetailViewModel.kt", mo22503i = {1}, mo22504l = {227, 229, 231, 246, 248}, mo22505m = "invokeSuspend", mo22506n = {"cardFidNum"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLoyaltyDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyDetailViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/loyalty/details/LoyaltyDetailViewModel$fetchCoupons$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,409:1\n1549#2:410\n1620#2,3:411\n766#2:414\n857#2,2:415\n*S KotlinDebug\n*F\n+ 1 LoyaltyDetailViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/loyalty/details/LoyaltyDetailViewModel$fetchCoupons$1\n*L\n240#1:410\n240#1:411,3\n241#1:414\n241#1:415,2\n*E\n"})
public final class LoyaltyDetailViewModel$fetchCoupons$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LoyaltyDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyDetailViewModel$fetchCoupons$1(LoyaltyDetailViewModel loyaltyDetailViewModel, C11045c<? super LoyaltyDetailViewModel$fetchCoupons$1> cVar) {
        super(2, cVar);
        this.this$0 = loyaltyDetailViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LoyaltyDetailViewModel$fetchCoupons$1(this.this$0, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b1, code lost:
        if (r7 != false) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013f  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x0047
            if (r1 == r7) goto L_0x0043
            if (r1 == r6) goto L_0x003b
            if (r1 == r5) goto L_0x0030
            if (r1 == r4) goto L_0x0029
            if (r1 != r3) goto L_0x0021
            java.lang.Object r0 = r9.L$1
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0137
        L_0x0021:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0029:
            java.lang.Object r1 = r9.L$0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x011f
        L_0x0030:
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
        L_0x0039:
            r1 = r10
            goto L_0x0086
        L_0x003b:
            java.lang.Object r1 = r9.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0070
        L_0x0043:
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0055
        L_0x0047:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r10 = r9.this$0
            r9.label = r7
            java.lang.Object r10 = r10.mo77224F0(r9)
            if (r10 != r0) goto L_0x0055
            return r0
        L_0x0055:
            com.carrefour.fid.android.domain.models.account.UserCards r10 = (com.carrefour.fid.android.domain.models.account.UserCards) r10
            if (r10 == 0) goto L_0x013f
            java.lang.String r1 = r10.mo116763k()
            if (r1 != 0) goto L_0x0061
            goto L_0x013f
        L_0x0061:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r10 = r9.this$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$f r8 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26568f.f64923a
            r9.L$0 = r1
            r9.label = r6
            java.lang.Object r10 = r10.mo77239U0(r8, r9)
            if (r10 != r0) goto L_0x0070
            return r0
        L_0x0070:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r10 = r9.this$0
            com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase r10 = r10.f64884j
            com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase$a r6 = new com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase$a
            r6.<init>(r1)
            r9.L$0 = r2
            r9.label = r5
            java.lang.Object r10 = r10.m172950invokegIAlus(r6, r9)
            if (r10 != r0) goto L_0x0039
            return r0
        L_0x0086:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r10 = r9.this$0
            boolean r5 = kotlin.Result.m38710j(r1)
            if (r5 == 0) goto L_0x011f
            r5 = r1
            com.carrefour.fid.android.domain.models.c r5 = (com.carrefour.fid.android.domain.models.C37974c) r5
            java.util.List r6 = r5.mo117041h()
            r8 = 0
            if (r6 == 0) goto L_0x00a0
            boolean r6 = r6.isEmpty()
            if (r6 != r7) goto L_0x00a0
            r6 = r7
            goto L_0x00a1
        L_0x00a0:
            r6 = r8
        L_0x00a1:
            if (r6 == 0) goto L_0x00b4
            java.util.List r6 = r5.mo117040g()
            if (r6 == 0) goto L_0x00b0
            boolean r6 = r6.isEmpty()
            if (r6 != r7) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r7 = r8
        L_0x00b1:
            if (r7 == 0) goto L_0x00b4
            goto L_0x010c
        L_0x00b4:
            java.util.List r5 = r5.mo117040g()
            if (r5 == 0) goto L_0x0100
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r2 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r5, r6)
            r2.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x00cb:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00df
            java.lang.Object r6 = r5.next()
            com.carrefour.fid.android.domain.models.d r6 = (com.carrefour.fid.android.domain.models.C38015d) r6
            com.carrefour.fid.android.presentation.models.CouponModel r6 = com.carrefour.fid.android.presentation.models.extension.C38465d.m159623b(r6)
            r2.add(r6)
            goto L_0x00cb
        L_0x00df:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00e8:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00ff
            java.lang.Object r6 = r2.next()
            r7 = r6
            com.carrefour.fid.android.presentation.models.CouponModel r7 = (com.carrefour.fid.android.presentation.models.CouponModel) r7
            boolean r7 = r7.mo121385A()
            if (r7 == 0) goto L_0x00e8
            r5.add(r6)
            goto L_0x00e8
        L_0x00ff:
            r2 = r5
        L_0x0100:
            if (r2 != 0) goto L_0x0106
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0106:
            java.util.Collection r2 = (java.util.Collection) r2
            int r8 = r2.size()
        L_0x010c:
            r10.sendCouponsTracking(r8)
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$d r2 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$d
            r2.<init>(r8)
            r9.L$0 = r1
            r9.label = r4
            java.lang.Object r10 = r10.mo77239U0(r2, r9)
            if (r10 != r0) goto L_0x011f
            return r0
        L_0x011f:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r10 = r9.this$0
            java.lang.Throwable r2 = kotlin.Result.m38705e(r1)
            if (r2 == 0) goto L_0x013c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$e r2 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26567e.f64921a
            r9.L$0 = r1
            r9.L$1 = r10
            r9.label = r3
            java.lang.Object r1 = r10.mo77239U0(r2, r9)
            if (r1 != r0) goto L_0x0136
            return r0
        L_0x0136:
            r0 = r10
        L_0x0137:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$b r10 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26579i.C26581b.f64943a
            r0.emitEvent(r10)
        L_0x013c:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x013f:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchCoupons$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((LoyaltyDetailViewModel$fetchCoupons$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
