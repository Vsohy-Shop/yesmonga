package com.carrefour.fid.android.presentation.viewmodels.coupons;

import com.carrefour.fid.android.presentation.models.CouponDetailsResult;
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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel$updateCouponFromDetails$1", mo22502f = "CouponsListViewModel.kt", mo22503i = {}, mo22504l = {135, 136, 147, 155, 164}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCouponsListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/CouponsListViewModel$updateCouponFromDetails$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n230#2,5:215\n1#3:220\n1747#4,3:221\n*S KotlinDebug\n*F\n+ 1 CouponsListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/CouponsListViewModel$updateCouponFromDetails$1\n*L\n142#1:215,5\n146#1:221,3\n*E\n"})
public final class CouponsListViewModel$updateCouponFromDetails$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ CouponDetailsResult $detailsResult;
    Object L$0;
    int label;
    final /* synthetic */ CouponsListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListViewModel$updateCouponFromDetails$1(CouponsListViewModel couponsListViewModel, CouponDetailsResult couponDetailsResult, C11045c<? super CouponsListViewModel$updateCouponFromDetails$1> cVar) {
        super(2, cVar);
        this.this$0 = couponsListViewModel;
        this.$detailsResult = couponDetailsResult;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CouponsListViewModel$updateCouponFromDetails$1(this.this$0, this.$detailsResult, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0140  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 == r8) goto L_0x003a
            if (r2 == r7) goto L_0x002e
            if (r2 == r6) goto L_0x0027
            if (r2 == r5) goto L_0x0027
            if (r2 != r4) goto L_0x001f
            kotlin.C11661u0.m45747n(r18)
            goto L_0x017b
        L_0x001f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0027:
            java.lang.Object r2 = r0.L$0
            kotlin.C11661u0.m45747n(r18)
            goto L_0x0136
        L_0x002e:
            kotlin.C11661u0.m45747n(r18)
            r2 = r18
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.mo21858l()
            goto L_0x008c
        L_0x003a:
            kotlin.C11661u0.m45747n(r18)
            goto L_0x005f
        L_0x003e:
            kotlin.C11661u0.m45747n(r18)
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r2 = r0.this$0
            kotlinx.coroutines.channels.g r2 = r2.f64141h
            com.carrefour.fid.android.presentation.ui.coupons.list.i$f r10 = new com.carrefour.fid.android.presentation.ui.coupons.list.i$f
            com.carrefour.fid.android.presentation.models.CouponDetailsResult r11 = r0.$detailsResult
            java.lang.String r11 = r11.mo121375e()
            java.util.List r11 = kotlin.collections.C10976s.m41419k(r11)
            r10.<init>(r11)
            r0.label = r8
            java.lang.Object r2 = r2.mo23757h0(r10, r0)
            if (r2 != r1) goto L_0x005f
            return r1
        L_0x005f:
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r2 = r0.this$0
            com.carrefour.fid.android.domain.interactors.coupons.k r2 = r2.f64136c
            com.carrefour.fid.android.domain.interactors.coupons.k$a r10 = new com.carrefour.fid.android.domain.interactors.coupons.k$a
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r11 = r0.this$0
            kotlinx.coroutines.flow.j r11 = r11.f64139f
            java.lang.Object r11 = r11.getValue()
            com.carrefour.fid.android.shared.type.e r11 = (com.carrefour.fid.android.shared.type.C28892e) r11
            java.lang.Object r11 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r11)
            com.carrefour.fid.android.domain.interactors.coupons.a r11 = (com.carrefour.fid.android.domain.interactors.coupons.C37643a) r11
            if (r11 != 0) goto L_0x007e
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x007e:
            com.carrefour.fid.android.presentation.models.CouponDetailsResult r12 = r0.$detailsResult
            r10.<init>(r11, r12)
            r0.label = r7
            java.lang.Object r2 = r2.m172957invokegIAlus(r10, r0)
            if (r2 != r1) goto L_0x008c
            return r1
        L_0x008c:
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r7 = r0.this$0
            com.carrefour.fid.android.presentation.models.CouponDetailsResult r10 = r0.$detailsResult
            boolean r11 = kotlin.Result.m38710j(r2)
            if (r11 == 0) goto L_0x0136
            r11 = r2
            com.carrefour.fid.android.domain.interactors.coupons.a r11 = (com.carrefour.fid.android.domain.interactors.coupons.C37643a) r11
            kotlinx.coroutines.flow.j r12 = r7.f64139f
        L_0x009d:
            java.lang.Object r13 = r12.getValue()
            r14 = r13
            com.carrefour.fid.android.shared.type.e r14 = (com.carrefour.fid.android.shared.type.C28892e) r14
            com.carrefour.fid.android.shared.type.e$c r14 = new com.carrefour.fid.android.shared.type.e$c
            r14.<init>(r11)
            boolean r13 = r12.mo24216e(r13, r14)
            if (r13 == 0) goto L_0x009d
            com.carrefour.fid.android.data.entities.coupons.CouponStatus$a r12 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.Companion
            java.util.EnumSet r12 = r12.mo110931c()
            com.carrefour.fid.android.data.entities.coupons.CouponStatus[] r13 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.values()
            int r14 = r13.length
            r15 = r9
        L_0x00bb:
            if (r15 >= r14) goto L_0x00d4
            r16 = r13[r15]
            java.lang.String r3 = r16.getType()
            java.lang.String r8 = r10.mo121377f()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r8)
            if (r3 == 0) goto L_0x00d0
            r3 = r16
            goto L_0x00d5
        L_0x00d0:
            int r15 = r15 + 1
            r8 = 1
            goto L_0x00bb
        L_0x00d4:
            r3 = 0
        L_0x00d5:
            boolean r3 = r12.contains(r3)
            java.util.List r8 = r11.mo114618i()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r10 = r8 instanceof java.util.Collection
            if (r10 == 0) goto L_0x00ee
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x00ee
        L_0x00ec:
            r8 = r9
            goto L_0x010c
        L_0x00ee:
            java.util.Iterator r8 = r8.iterator()
        L_0x00f2:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00ec
            java.lang.Object r10 = r8.next()
            com.carrefour.fid.android.presentation.models.CouponModel r10 = (com.carrefour.fid.android.presentation.models.CouponModel) r10
            com.carrefour.fid.android.presentation.models.CouponModel$State r10 = r10.mo121402R()
            com.carrefour.fid.android.presentation.models.CouponModel$State r11 = com.carrefour.fid.android.presentation.models.CouponModel.State.ERROR
            if (r10 != r11) goto L_0x0108
            r10 = 1
            goto L_0x0109
        L_0x0108:
            r10 = r9
        L_0x0109:
            if (r10 == 0) goto L_0x00f2
            r8 = 1
        L_0x010c:
            if (r8 == 0) goto L_0x0122
            kotlinx.coroutines.channels.g r5 = r7.f64141h
            com.carrefour.fid.android.presentation.ui.coupons.list.i$d r7 = new com.carrefour.fid.android.presentation.ui.coupons.list.i$d
            r7.<init>(r3, r9, r9)
            r0.L$0 = r2
            r0.label = r6
            java.lang.Object r3 = r5.mo23757h0(r7, r0)
            if (r3 != r1) goto L_0x0136
            return r1
        L_0x0122:
            kotlinx.coroutines.channels.g r6 = r7.f64141h
            com.carrefour.fid.android.presentation.ui.coupons.list.i$e r7 = new com.carrefour.fid.android.presentation.ui.coupons.list.i$e
            r7.<init>(r3, r9, r9)
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r3 = r6.mo23757h0(r7, r0)
            if (r3 != r1) goto L_0x0136
            return r1
        L_0x0136:
            com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel r3 = r0.this$0
            com.carrefour.fid.android.presentation.models.CouponDetailsResult r5 = r0.$detailsResult
            java.lang.Throwable r6 = kotlin.Result.m38705e(r2)
            if (r6 == 0) goto L_0x017b
            kotlinx.coroutines.channels.g r3 = r3.f64141h
            com.carrefour.fid.android.data.entities.coupons.CouponStatus$a r7 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.Companion
            java.util.EnumSet r7 = r7.mo110931c()
            com.carrefour.fid.android.data.entities.coupons.CouponStatus[] r8 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.values()
            int r10 = r8.length
            r11 = r9
        L_0x0150:
            if (r11 >= r10) goto L_0x0166
            r12 = r8[r11]
            java.lang.String r13 = r12.getType()
            java.lang.String r14 = r5.mo121377f()
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x0163
            goto L_0x0167
        L_0x0163:
            int r11 = r11 + 1
            goto L_0x0150
        L_0x0166:
            r12 = 0
        L_0x0167:
            boolean r5 = r7.contains(r12)
            com.carrefour.fid.android.presentation.ui.coupons.list.i$c r7 = new com.carrefour.fid.android.presentation.ui.coupons.list.i$c
            r7.<init>(r6, r5, r9)
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r2 = r3.mo23757h0(r7, r0)
            if (r2 != r1) goto L_0x017b
            return r1
        L_0x017b:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel$updateCouponFromDetails$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CouponsListViewModel$updateCouponFromDetails$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
