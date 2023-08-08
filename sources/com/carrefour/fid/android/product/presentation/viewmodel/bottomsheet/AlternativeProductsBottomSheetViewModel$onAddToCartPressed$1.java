package com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet;

import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
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

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel$onAddToCartPressed$1", mo22502f = "AlternativeProductsBottomSheetViewModel.kt", mo22503i = {}, mo22504l = {87, 88, 89}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAlternativeProductsBottomSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlternativeProductsBottomSheetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/bottomsheet/AlternativeProductsBottomSheetViewModel$onAddToCartPressed$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public final class AlternativeProductsBottomSheetViewModel$onAddToCartPressed$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ PlpOffer $offer;
    Object L$0;
    int label;
    final /* synthetic */ AlternativeProductsBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlternativeProductsBottomSheetViewModel$onAddToCartPressed$1(AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel, PlpOffer plpOffer, C11045c<? super AlternativeProductsBottomSheetViewModel$onAddToCartPressed$1> cVar) {
        super(2, cVar);
        this.this$0 = alternativeProductsBottomSheetViewModel;
        this.$offer = plpOffer;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AlternativeProductsBottomSheetViewModel$onAddToCartPressed$1(this.this$0, this.$offer, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r4) goto L_0x0023
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0079
        L_0x0015:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001d:
            java.lang.Object r1 = r8.L$0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x005d
        L_0x0023:
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0049
        L_0x002d:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel r9 = r8.this$0
            com.carrefour.fid.android.domain.interactors.basket.n0 r9 = r9.f68069d
            com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel r1 = r8.this$0
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r5 = r8.$offer
            r6 = 0
            r7 = 0
            com.carrefour.fid.android.domain.interactors.basket.n0$a r1 = com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel.m117663r0(r1, r5, r6, r4, r7)
            r8.label = r4
            java.lang.Object r9 = r9.m172966invokegIAlus(r1, r8)
            if (r9 != r0) goto L_0x0049
            return r0
        L_0x0049:
            r1 = r9
            com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel r9 = r8.this$0
            java.lang.Throwable r4 = kotlin.Result.m38705e(r1)
            if (r4 == 0) goto L_0x005d
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = r9.mo81689n0(r4, r8)
            if (r9 != r0) goto L_0x005d
            return r0
        L_0x005d:
            com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel r9 = r8.this$0
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r3 = r8.$offer
            boolean r4 = kotlin.Result.m38710j(r1)
            if (r4 == 0) goto L_0x0079
            r4 = r1
            com.carrefour.fid.android.domain.models.basket.Basket r4 = (com.carrefour.fid.android.domain.models.basket.Basket) r4
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r3 = r3.mo118819v()
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r9 = r9.mo81688m0(r4, r3, r8)
            if (r9 != r0) goto L_0x0079
            return r0
        L_0x0079:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel$onAddToCartPressed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AlternativeProductsBottomSheetViewModel$onAddToCartPressed$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
