package com.carrefour.fid.android.presentation.viewmodels.coupons.overlay;

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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel$loadOfferProductsList$1", mo22502f = "OverlayProductsBottomSheetViewModel.kt", mo22503i = {}, mo22504l = {120, 117, 126, 128}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nOverlayProductsBottomSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayProductsBottomSheetViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayProductsBottomSheetViewModel$loadOfferProductsList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n766#2:162\n857#2,2:163\n1549#2:165\n1620#2,3:166\n*S KotlinDebug\n*F\n+ 1 OverlayProductsBottomSheetViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayProductsBottomSheetViewModel$loadOfferProductsList$1\n*L\n125#1:162\n125#1:163,2\n127#1:165\n127#1:166,3\n*E\n"})
public final class OverlayProductsBottomSheetViewModel$loadOfferProductsList$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ List<String> $gtinsList;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OverlayProductsBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverlayProductsBottomSheetViewModel$loadOfferProductsList$1(OverlayProductsBottomSheetViewModel overlayProductsBottomSheetViewModel, List<String> list, C11045c<? super OverlayProductsBottomSheetViewModel$loadOfferProductsList$1> cVar) {
        super(2, cVar);
        this.this$0 = overlayProductsBottomSheetViewModel;
        this.$gtinsList = list;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new OverlayProductsBottomSheetViewModel$loadOfferProductsList$1(this.this$0, this.$gtinsList, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6 A[LOOP:1: B:41:0x00f0->B:43:0x00f6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0114 A[RETURN] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r14.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0045
            if (r1 == r6) goto L_0x0037
            if (r1 == r4) goto L_0x002d
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0115
        L_0x001a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0022:
            java.lang.Object r1 = r14.L$1
            com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel r1 = (com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel) r1
            java.lang.Object r3 = r14.L$0
            kotlin.C11661u0.m45747n(r15)
            goto L_0x00dd
        L_0x002d:
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
            goto L_0x0089
        L_0x0037:
            java.lang.Object r1 = r14.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r7 = r14.L$0
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase r7 = (com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase) r7
            kotlin.C11661u0.m45747n(r15)
        L_0x0042:
            r8 = r1
            r1 = r7
            goto L_0x006d
        L_0x0045:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel r15 = r14.this$0
            com.carrefour.fid.android.presentation.viewmodels.offer.state.b$c r1 = com.carrefour.fid.android.presentation.viewmodels.offer.state.C26631b.C26634c.f65039c
            com.carrefour.fid.android.presentation.viewmodels.offer.state.C26630a.m113214a(r15, r1)
            com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel r15 = r14.this$0
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase r7 = r15.f64284b
            java.util.List<java.lang.String> r15 = r14.$gtinsList
            if (r15 != 0) goto L_0x005d
            java.util.List r15 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x005d:
            r1 = r15
            com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel r15 = r14.this$0
            r14.L$0 = r7
            r14.L$1 = r1
            r14.label = r6
            java.lang.Object r15 = r15.mo76492h0(r14)
            if (r15 != r0) goto L_0x0042
            return r0
        L_0x006d:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r9 = r15.booleanValue()
            r10 = 0
            r11 = 4
            r12 = 0
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a r15 = new com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a
            r7 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            r14.L$0 = r5
            r14.L$1 = r5
            r14.label = r4
            java.lang.Object r15 = r1.m172988invokegIAlus(r15, r14)
            if (r15 != r0) goto L_0x0089
            return r0
        L_0x0089:
            com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel r1 = r14.this$0
            java.lang.Throwable r4 = kotlin.Result.m38705e(r15)
            if (r4 == 0) goto L_0x0099
            com.carrefour.fid.android.presentation.viewmodels.offer.state.b$b r7 = new com.carrefour.fid.android.presentation.viewmodels.offer.state.b$b
            r7.<init>(r4)
            com.carrefour.fid.android.presentation.viewmodels.offer.state.C26630a.m113214a(r1, r7)
        L_0x0099:
            com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel r1 = r14.this$0
            boolean r4 = kotlin.Result.m38710j(r15)
            if (r4 == 0) goto L_0x0115
            r4 = r15
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00af:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x00cd
            java.lang.Object r8 = r4.next()
            r9 = r8
            com.carrefour.fid.android.domain.models.OfferProductDomain r9 = (com.carrefour.fid.android.domain.models.OfferProductDomain) r9
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r9 = r9.mo116016A()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r10 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            if (r9 != r10) goto L_0x00c6
            r9 = r6
            goto L_0x00c7
        L_0x00c6:
            r9 = 0
        L_0x00c7:
            if (r9 == 0) goto L_0x00af
            r7.add(r8)
            goto L_0x00af
        L_0x00cd:
            r14.L$0 = r15
            r14.L$1 = r1
            r14.label = r3
            java.lang.Object r3 = r1.mo76496l0(r7, r14)
            if (r3 != r0) goto L_0x00da
            return r0
        L_0x00da:
            r13 = r3
            r3 = r15
            r15 = r13
        L_0x00dd:
            java.util.List r15 = (java.util.List) r15
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r15, r6)
            r4.<init>(r6)
            java.util.Iterator r15 = r15.iterator()
        L_0x00f0:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L_0x0104
            java.lang.Object r6 = r15.next()
            com.carrefour.fid.android.domain.models.OfferProductDomain r6 = (com.carrefour.fid.android.domain.models.OfferProductDomain) r6
            com.carrefour.fid.android.presentation.models.OfferProductModel r6 = com.carrefour.fid.android.domain.extension.C37507h.m153956h(r6)
            r4.add(r6)
            goto L_0x00f0
        L_0x0104:
            com.carrefour.fid.android.domain.interactors.offer.b r15 = r1.f64283a
            r14.L$0 = r3
            r14.L$1 = r5
            r14.label = r2
            java.lang.Object r15 = r15.mo114793a(r4, r14)
            if (r15 != r0) goto L_0x0115
            return r0
        L_0x0115:
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel$loadOfferProductsList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((OverlayProductsBottomSheetViewModel$loadOfferProductsList$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
