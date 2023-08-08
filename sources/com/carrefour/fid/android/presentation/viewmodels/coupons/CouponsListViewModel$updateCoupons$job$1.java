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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel$updateCoupons$job$1", mo22502f = "CouponsListViewModel.kt", mo22503i = {}, mo22504l = {83, 84, 93, 101, 110}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCouponsListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/CouponsListViewModel$updateCoupons$job$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,214:1\n1549#2:215\n1620#2,3:216\n1179#2,2:219\n1253#2,4:221\n1747#2,3:230\n1747#2,3:233\n1747#2,3:236\n230#3,5:225\n*S KotlinDebug\n*F\n+ 1 CouponsListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/CouponsListViewModel$updateCoupons$job$1\n*L\n83#1:215\n83#1:216,3\n87#1:219,2\n87#1:221,4\n92#1:230,3\n97#1:233,3\n105#1:236,3\n91#1:225,5\n*E\n"})
public final class CouponsListViewModel$updateCoupons$job$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ List<CouponModel> $coupons;
    final /* synthetic */ boolean $isAnActivation;
    final /* synthetic */ boolean $isSwitchAllCoupons;
    Object L$0;
    int label;
    final /* synthetic */ CouponsListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListViewModel$updateCoupons$job$1(CouponsListViewModel couponsListViewModel, List<CouponModel> list, boolean z, boolean z2, C11045c<? super CouponsListViewModel$updateCoupons$job$1> cVar) {
        super(2, cVar);
        this.this$0 = couponsListViewModel;
        this.$coupons = list;
        this.$isAnActivation = z;
        this.$isSwitchAllCoupons = z2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CouponsListViewModel$updateCoupons$job$1(this.this$0, this.$coupons, this.$isAnActivation, this.$isSwitchAllCoupons, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0189 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01da  */
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
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L_0x003e
            if (r1 == r7) goto L_0x003a
            if (r1 == r6) goto L_0x002e
            if (r1 == r5) goto L_0x0027
            if (r1 == r4) goto L_0x0027
            if (r1 != r3) goto L_0x001f
            kotlin.C11661u0.m45747n(r15)
            goto L_0x01ee
        L_0x001f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0027:
            java.lang.Object r1 = r14.L$0
            kotlin.C11661u0.m45747n(r15)
            goto L_0x01d0
        L_0x002e:
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
        L_0x0037:
            r1 = r15
            goto L_0x00ea
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
            r14.label = r7
            java.lang.Object r15 = r15.mo23757h0(r1, r14)
            if (r15 != r0) goto L_0x007a
            return r0
        L_0x007a:
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r15 = r14.this$0
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase r15 = r15.f64135b
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
            boolean r2 = r14.$isAnActivation
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$a r9 = new com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$a
            r9.<init>(r1, r10, r2)
            r14.label = r6
            java.lang.Object r15 = r15.m172956invokegIAlus(r9, r14)
            if (r15 != r0) goto L_0x0037
            return r0
        L_0x00ea:
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r15 = r14.this$0
            boolean r2 = r14.$isAnActivation
            boolean r6 = r14.$isSwitchAllCoupons
            boolean r9 = kotlin.Result.m38710j(r1)
            if (r9 == 0) goto L_0x01d0
            r9 = r1
            com.carrefour.fid.android.domain.interactors.coupons.a r9 = (com.carrefour.fid.android.domain.interactors.coupons.C37643a) r9
            kotlinx.coroutines.flow.j r10 = r15.f64139f
        L_0x00fd:
            java.lang.Object r11 = r10.getValue()
            r12 = r11
            com.carrefour.fid.android.shared.type.e r12 = (com.carrefour.fid.android.shared.type.C28892e) r12
            com.carrefour.fid.android.shared.type.e$c r12 = new com.carrefour.fid.android.shared.type.e$c
            r12.<init>(r9)
            boolean r11 = r10.mo24216e(r11, r12)
            if (r11 == 0) goto L_0x00fd
            java.util.List r10 = r9.mo114618i()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r11 = r10 instanceof java.util.Collection
            if (r11 == 0) goto L_0x0124
            r11 = r10
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0124
        L_0x0122:
            r10 = r8
            goto L_0x0142
        L_0x0124:
            java.util.Iterator r10 = r10.iterator()
        L_0x0128:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0122
            java.lang.Object r11 = r10.next()
            com.carrefour.fid.android.presentation.models.CouponModel r11 = (com.carrefour.fid.android.presentation.models.CouponModel) r11
            com.carrefour.fid.android.presentation.models.CouponModel$State r11 = r11.mo121402R()
            com.carrefour.fid.android.presentation.models.CouponModel$State r12 = com.carrefour.fid.android.presentation.models.CouponModel.State.ERROR
            if (r11 != r12) goto L_0x013e
            r11 = r7
            goto L_0x013f
        L_0x013e:
            r11 = r8
        L_0x013f:
            if (r11 == 0) goto L_0x0128
            r10 = r7
        L_0x0142:
            if (r10 == 0) goto L_0x018a
            kotlinx.coroutines.channels.g r15 = r15.f64141h
            java.util.List r4 = r9.mo114618i()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r9 = r4 instanceof java.util.Collection
            if (r9 == 0) goto L_0x015d
            r9 = r4
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x015d
        L_0x015b:
            r7 = r8
            goto L_0x017a
        L_0x015d:
            java.util.Iterator r4 = r4.iterator()
        L_0x0161:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x015b
            java.lang.Object r9 = r4.next()
            com.carrefour.fid.android.presentation.models.CouponModel r9 = (com.carrefour.fid.android.presentation.models.CouponModel) r9
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r9 = r9.mo121403S()
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r10 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.INBASKET
            if (r9 != r10) goto L_0x0177
            r9 = r7
            goto L_0x0178
        L_0x0177:
            r9 = r8
        L_0x0178:
            if (r9 == 0) goto L_0x0161
        L_0x017a:
            com.carrefour.fid.android.presentation.ui.coupons.list.i$d r4 = new com.carrefour.fid.android.presentation.ui.coupons.list.i$d
            r4.<init>(r2, r6, r7)
            r14.L$0 = r1
            r14.label = r5
            java.lang.Object r15 = r15.mo23757h0(r4, r14)
            if (r15 != r0) goto L_0x01d0
            return r0
        L_0x018a:
            kotlinx.coroutines.channels.g r15 = r15.f64141h
            java.util.List r5 = r9.mo114618i()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r9 = r5 instanceof java.util.Collection
            if (r9 == 0) goto L_0x01a3
            r9 = r5
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x01a3
        L_0x01a1:
            r7 = r8
            goto L_0x01c0
        L_0x01a3:
            java.util.Iterator r5 = r5.iterator()
        L_0x01a7:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x01a1
            java.lang.Object r9 = r5.next()
            com.carrefour.fid.android.presentation.models.CouponModel r9 = (com.carrefour.fid.android.presentation.models.CouponModel) r9
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r9 = r9.mo121403S()
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r10 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.INBASKET
            if (r9 != r10) goto L_0x01bd
            r9 = r7
            goto L_0x01be
        L_0x01bd:
            r9 = r8
        L_0x01be:
            if (r9 == 0) goto L_0x01a7
        L_0x01c0:
            com.carrefour.fid.android.presentation.ui.coupons.list.i$e r5 = new com.carrefour.fid.android.presentation.ui.coupons.list.i$e
            r5.<init>(r2, r6, r7)
            r14.L$0 = r1
            r14.label = r4
            java.lang.Object r15 = r15.mo23757h0(r5, r14)
            if (r15 != r0) goto L_0x01d0
            return r0
        L_0x01d0:
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r15 = r14.this$0
            boolean r2 = r14.$isAnActivation
            java.lang.Throwable r4 = kotlin.Result.m38705e(r1)
            if (r4 == 0) goto L_0x01ee
            kotlinx.coroutines.channels.g r15 = r15.f64141h
            com.carrefour.fid.android.presentation.ui.coupons.list.i$c r5 = new com.carrefour.fid.android.presentation.ui.coupons.list.i$c
            r5.<init>(r4, r2, r8)
            r14.L$0 = r1
            r14.label = r3
            java.lang.Object r15 = r15.mo23757h0(r5, r14)
            if (r15 != r0) goto L_0x01ee
            return r0
        L_0x01ee:
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel$updateCoupons$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CouponsListViewModel$updateCoupons$job$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
