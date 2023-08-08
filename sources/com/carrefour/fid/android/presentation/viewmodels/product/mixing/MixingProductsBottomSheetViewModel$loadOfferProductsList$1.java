package com.carrefour.fid.android.presentation.viewmodels.product.mixing;

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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.product.mixing.MixingProductsBottomSheetViewModel$loadOfferProductsList$1", mo22502f = "MixingProductsBottomSheetViewModel.kt", mo22503i = {}, mo22504l = {102, 99, 111}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nMixingProductsBottomSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MixingProductsBottomSheetViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/product/mixing/MixingProductsBottomSheetViewModel$loadOfferProductsList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n766#2:132\n857#2,2:133\n1549#2:135\n1620#2,3:136\n*S KotlinDebug\n*F\n+ 1 MixingProductsBottomSheetViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/product/mixing/MixingProductsBottomSheetViewModel$loadOfferProductsList$1\n*L\n108#1:132\n108#1:133,2\n110#1:135\n110#1:136,3\n*E\n"})
public final class MixingProductsBottomSheetViewModel$loadOfferProductsList$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $facilityServiceId;
    final /* synthetic */ List<String> $gtinsList;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MixingProductsBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MixingProductsBottomSheetViewModel$loadOfferProductsList$1(MixingProductsBottomSheetViewModel mixingProductsBottomSheetViewModel, List<String> list, String str, C11045c<? super MixingProductsBottomSheetViewModel$loadOfferProductsList$1> cVar) {
        super(2, cVar);
        this.this$0 = mixingProductsBottomSheetViewModel;
        this.$gtinsList = list;
        this.$facilityServiceId = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new MixingProductsBottomSheetViewModel$loadOfferProductsList$1(this.this$0, this.$gtinsList, this.$facilityServiceId, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 == r4) goto L_0x002c
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            java.lang.Object r0 = r9.L$1
            com.carrefour.fid.android.presentation.viewmodels.product.mixing.MixingProductsBottomSheetViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.product.mixing.MixingProductsBottomSheetViewModel) r0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00ed
        L_0x001a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0022:
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x0074
        L_0x002c:
            java.lang.Object r1 = r9.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r9.L$0
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase r5 = (com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase) r5
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0059
        L_0x0038:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.presentation.viewmodels.product.mixing.MixingProductsBottomSheetViewModel r10 = r9.this$0
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase r5 = r10.f66158b
            java.util.List<java.lang.String> r10 = r9.$gtinsList
            if (r10 != 0) goto L_0x0049
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0049:
            r1 = r10
            com.carrefour.fid.android.presentation.viewmodels.product.mixing.MixingProductsBottomSheetViewModel r10 = r9.this$0
            r9.L$0 = r5
            r9.L$1 = r1
            r9.label = r4
            java.lang.Object r10 = r10.mo79163k0(r9)
            if (r10 != r0) goto L_0x0059
            return r0
        L_0x0059:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            java.lang.String r6 = r9.$facilityServiceId
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a r7 = new com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a
            r7.<init>(r1, r10, r6)
            r10 = 0
            r9.L$0 = r10
            r9.L$1 = r10
            r9.label = r3
            java.lang.Object r10 = r5.m172988invokegIAlus(r7, r9)
            if (r10 != r0) goto L_0x0074
            return r0
        L_0x0074:
            com.carrefour.fid.android.presentation.viewmodels.product.mixing.MixingProductsBottomSheetViewModel r1 = r9.this$0
            java.lang.Throwable r3 = kotlin.Result.m38705e(r10)
            if (r3 == 0) goto L_0x0084
            com.carrefour.fid.android.presentation.viewmodels.offer.state.b$b r5 = new com.carrefour.fid.android.presentation.viewmodels.offer.state.b$b
            r5.<init>(r3)
            com.carrefour.fid.android.presentation.viewmodels.offer.state.C26630a.m113214a(r1, r5)
        L_0x0084:
            com.carrefour.fid.android.presentation.viewmodels.product.mixing.MixingProductsBottomSheetViewModel r1 = r9.this$0
            boolean r3 = kotlin.Result.m38710j(r10)
            if (r3 == 0) goto L_0x00f0
            r3 = r10
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x009a:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00b8
            java.lang.Object r6 = r3.next()
            r7 = r6
            com.carrefour.fid.android.domain.models.OfferProductDomain r7 = (com.carrefour.fid.android.domain.models.OfferProductDomain) r7
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r7 = r7.mo116016A()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r8 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            if (r7 != r8) goto L_0x00b1
            r7 = r4
            goto L_0x00b2
        L_0x00b1:
            r7 = 0
        L_0x00b2:
            if (r7 == 0) goto L_0x009a
            r5.add(r6)
            goto L_0x009a
        L_0x00b8:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.C10978t.m41495Y(r5, r4)
            r3.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x00c7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00db
            java.lang.Object r5 = r4.next()
            com.carrefour.fid.android.domain.models.OfferProductDomain r5 = (com.carrefour.fid.android.domain.models.OfferProductDomain) r5
            com.carrefour.fid.android.presentation.models.OfferProductModel r5 = com.carrefour.fid.android.domain.extension.C37507h.m153956h(r5)
            r3.add(r5)
            goto L_0x00c7
        L_0x00db:
            com.carrefour.fid.android.domain.interactors.offer.b r4 = r1.f66157a
            r9.L$0 = r10
            r9.L$1 = r1
            r9.label = r2
            java.lang.Object r10 = r4.mo114793a(r3, r9)
            if (r10 != r0) goto L_0x00ec
            return r0
        L_0x00ec:
            r0 = r1
        L_0x00ed:
            r0.mo79167o0()
        L_0x00f0:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.product.mixing.MixingProductsBottomSheetViewModel$loadOfferProductsList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((MixingProductsBottomSheetViewModel$loadOfferProductsList$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
