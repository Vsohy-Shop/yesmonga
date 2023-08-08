package com.carrefour.fid.android.presentation.viewmodels.coupons;

import com.carrefour.fid.android.presentation.models.CouponModel;
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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel$burnCoupons$job$1", mo22502f = "CouponsListViewModel.kt", mo22503i = {}, mo22504l = {178, 179, 188, 190, 193}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCouponsListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/CouponsListViewModel$burnCoupons$job$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,214:1\n1549#2:215\n1620#2,3:216\n1179#2,2:219\n1253#2,4:221\n1747#2,3:230\n230#3,5:225\n*S KotlinDebug\n*F\n+ 1 CouponsListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/CouponsListViewModel$burnCoupons$job$1\n*L\n178#1:215\n178#1:216,3\n182#1:219,2\n182#1:221,4\n187#1:230,3\n185#1:225,5\n*E\n"})
public final class CouponsListViewModel$burnCoupons$job$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ List<CouponModel> $coupons;
    Object L$0;
    int label;
    final /* synthetic */ CouponsListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListViewModel$burnCoupons$job$1(CouponsListViewModel couponsListViewModel, List<CouponModel> list, C11045c<? super CouponsListViewModel$burnCoupons$job$1> cVar) {
        super(2, cVar);
        this.this$0 = couponsListViewModel;
        this.$coupons = list;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CouponsListViewModel$burnCoupons$job$1(this.this$0, this.$coupons, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0168  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r14.label
            r2 = 10
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L_0x003e
            if (r1 == r8) goto L_0x003a
            if (r1 == r6) goto L_0x002e
            if (r1 == r5) goto L_0x0027
            if (r1 == r4) goto L_0x0027
            if (r1 != r3) goto L_0x001f
            kotlin.C11661u0.m45747n(r15)
            goto L_0x017c
        L_0x001f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0027:
            java.lang.Object r1 = r14.L$0
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0160
        L_0x002e:
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
        L_0x0037:
            r1 = r15
            goto L_0x00e8
        L_0x003a:
            kotlin.C11661u0.m45747n(r15)
            goto L_0x007a
        L_0x003e:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r15 = r14.this$0
            kotlinx.coroutines.channels.g r15 = r15.f64141h
            java.util.List<com.carrefour.fid.android.presentation.models.CouponModel> r1 = r14.$coupons
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = kotlin.collections.C10978t.m41495Y(r1, r2)
            r9.<init>(r10)
            java.util.Iterator r1 = r1.iterator()
        L_0x0058:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x006c
            java.lang.Object r10 = r1.next()
            com.carrefour.fid.android.presentation.models.CouponModel r10 = (com.carrefour.fid.android.presentation.models.CouponModel) r10
            java.lang.String r10 = r10.mo121396L()
            r9.add(r10)
            goto L_0x0058
        L_0x006c:
            com.carrefour.fid.android.presentation.ui.coupons.list.i$f r1 = new com.carrefour.fid.android.presentation.ui.coupons.list.i$f
            r1.<init>(r9)
            r14.label = r8
            java.lang.Object r15 = r15.mo23757h0(r1, r14)
            if (r15 != r0) goto L_0x007a
            return r0
        L_0x007a:
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r15 = r14.this$0
            com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase r15 = r15.f64137d
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r1 = r14.this$0
            kotlinx.coroutines.flow.j r1 = r1.f64139f
            java.lang.Object r1 = r1.getValue()
            com.carrefour.fid.android.shared.type.e r1 = (com.carrefour.fid.android.shared.type.C28892e) r1
            java.lang.Object r1 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r1)
            com.carrefour.fid.android.domain.interactors.coupons.a r1 = (com.carrefour.fid.android.domain.interactors.coupons.C37643a) r1
            if (r1 != 0) goto L_0x0097
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        L_0x0097:
            java.util.List<com.carrefour.fid.android.presentation.models.CouponModel> r9 = r14.$coupons
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            int r2 = kotlin.collections.C10978t.m41495Y(r9, r2)
            int r2 = kotlin.collections.C10975r0.m41400j(r2)
            r10 = 16
            int r2 = kotlin.ranges.C11479u.m44447u(r2, r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r2)
            java.util.Iterator r2 = r9.iterator()
        L_0x00b2:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x00da
            java.lang.Object r9 = r2.next()
            com.carrefour.fid.android.presentation.models.CouponModel r9 = (com.carrefour.fid.android.presentation.models.CouponModel) r9
            java.lang.String r11 = r9.mo121396L()
            long r12 = r9.mo121392H()
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.C11064a.m42621g(r12)
            kotlin.Pair r9 = kotlin.C11078d1.m42659a(r11, r9)
            java.lang.Object r11 = r9.mo21849e()
            java.lang.Object r9 = r9.mo21851f()
            r10.put(r11, r9)
            goto L_0x00b2
        L_0x00da:
            com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$a
            r2.<init>(r1, r10)
            r14.label = r6
            java.lang.Object r15 = r15.m172953invokegIAlus(r2, r14)
            if (r15 != r0) goto L_0x0037
            return r0
        L_0x00e8:
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r15 = r14.this$0
            boolean r2 = kotlin.Result.m38710j(r1)
            if (r2 == 0) goto L_0x0160
            r2 = r1
            com.carrefour.fid.android.domain.interactors.coupons.a r2 = (com.carrefour.fid.android.domain.interactors.coupons.C37643a) r2
            kotlinx.coroutines.flow.j r6 = r15.f64139f
        L_0x00f7:
            java.lang.Object r9 = r6.getValue()
            r10 = r9
            com.carrefour.fid.android.shared.type.e r10 = (com.carrefour.fid.android.shared.type.C28892e) r10
            com.carrefour.fid.android.shared.type.e$c r10 = new com.carrefour.fid.android.shared.type.e$c
            r10.<init>(r2)
            boolean r9 = r6.mo24216e(r9, r10)
            if (r9 == 0) goto L_0x00f7
            java.util.List r2 = r2.mo114618i()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r6 = r2 instanceof java.util.Collection
            if (r6 == 0) goto L_0x011e
            r6 = r2
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x011e
        L_0x011c:
            r2 = r7
            goto L_0x013c
        L_0x011e:
            java.util.Iterator r2 = r2.iterator()
        L_0x0122:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x011c
            java.lang.Object r6 = r2.next()
            com.carrefour.fid.android.presentation.models.CouponModel r6 = (com.carrefour.fid.android.presentation.models.CouponModel) r6
            com.carrefour.fid.android.presentation.models.CouponModel$State r6 = r6.mo121402R()
            com.carrefour.fid.android.presentation.models.CouponModel$State r9 = com.carrefour.fid.android.presentation.models.CouponModel.State.ERROR
            if (r6 != r9) goto L_0x0138
            r6 = r8
            goto L_0x0139
        L_0x0138:
            r6 = r7
        L_0x0139:
            if (r6 == 0) goto L_0x0122
            r2 = r8
        L_0x013c:
            if (r2 == 0) goto L_0x014f
            kotlinx.coroutines.channels.g r15 = r15.f64141h
            com.carrefour.fid.android.presentation.ui.coupons.list.i$b r2 = com.carrefour.fid.android.presentation.p035ui.coupons.list.C23886i.C23888b.f60056a
            r14.L$0 = r1
            r14.label = r5
            java.lang.Object r15 = r15.mo23757h0(r2, r14)
            if (r15 != r0) goto L_0x0160
            return r0
        L_0x014f:
            kotlinx.coroutines.channels.g r15 = r15.f64141h
            com.carrefour.fid.android.presentation.ui.coupons.list.i$a r2 = com.carrefour.fid.android.presentation.p035ui.coupons.list.C23886i.C23887a.f60054a
            r14.L$0 = r1
            r14.label = r4
            java.lang.Object r15 = r15.mo23757h0(r2, r14)
            if (r15 != r0) goto L_0x0160
            return r0
        L_0x0160:
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r15 = r14.this$0
            java.lang.Throwable r2 = kotlin.Result.m38705e(r1)
            if (r2 == 0) goto L_0x017c
            kotlinx.coroutines.channels.g r15 = r15.f64141h
            com.carrefour.fid.android.presentation.ui.coupons.list.i$c r4 = new com.carrefour.fid.android.presentation.ui.coupons.list.i$c
            r4.<init>(r2, r8, r7)
            r14.L$0 = r1
            r14.label = r3
            java.lang.Object r15 = r15.mo23757h0(r4, r14)
            if (r15 != r0) goto L_0x017c
            return r0
        L_0x017c:
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel$burnCoupons$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CouponsListViewModel$burnCoupons$job$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
