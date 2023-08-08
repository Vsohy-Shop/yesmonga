package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.domain.models.product.detail.C38110e;
import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel$onAddToCartClicked$1", mo22502f = "NonFoodProductDetailsViewModel.kt", mo22503i = {}, mo22504l = {77, 80, 82, 93, 95}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NonFoodProductDetailsViewModel$onAddToCartClicked$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ boolean $hasMultipleOffers;
    final /* synthetic */ boolean $isHomeDeliveryNal;
    final /* synthetic */ OfferDetail $offer;
    final /* synthetic */ C38110e $product;
    final /* synthetic */ int $quantity;
    Object L$0;
    int label;
    final /* synthetic */ NonFoodProductDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsViewModel$onAddToCartClicked$1(NonFoodProductDetailsViewModel nonFoodProductDetailsViewModel, OfferDetail offerDetail, int i, boolean z, boolean z2, C38110e eVar, C11045c<? super NonFoodProductDetailsViewModel$onAddToCartClicked$1> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodProductDetailsViewModel;
        this.$offer = offerDetail;
        this.$quantity = i;
        this.$isHomeDeliveryNal = z;
        this.$hasMultipleOffers = z2;
        this.$product = eVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodProductDetailsViewModel$onAddToCartClicked$1(this.this$0, this.$offer, this.$quantity, this.$isHomeDeliveryNal, this.$hasMultipleOffers, this.$product, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r14.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x003e
            if (r1 == r6) goto L_0x003a
            if (r1 == r5) goto L_0x0036
            if (r1 == r4) goto L_0x002b
            if (r1 == r3) goto L_0x0024
            if (r1 != r2) goto L_0x001c
            kotlin.C11661u0.m45747n(r15)
            goto L_0x00ed
        L_0x001c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0024:
            java.lang.Object r1 = r14.L$0
            kotlin.C11661u0.m45747n(r15)
            goto L_0x00c3
        L_0x002b:
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
        L_0x0034:
            r1 = r15
            goto L_0x00a7
        L_0x0036:
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0078
        L_0x003a:
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0064
        L_0x003e:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r15 = r14.this$0
            java.lang.String r15 = r15.f68084e
            if (r15 != 0) goto L_0x0067
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r15 = r14.this$0
            kotlinx.coroutines.channels.g r15 = r15.f68087h
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.a$b r1 = new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.a$b
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r3 = "Gtin not provided"
            r2.<init>(r3)
            r1.<init>(r2)
            r14.label = r6
            java.lang.Object r15 = r15.mo23757h0(r1, r14)
            if (r15 != r0) goto L_0x0064
            return r0
        L_0x0064:
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        L_0x0067:
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r15 = r14.this$0
            kotlinx.coroutines.channels.g r15 = r15.f68087h
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.a$c r1 = com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28131a.C28134c.f68136a
            r14.label = r5
            java.lang.Object r15 = r15.mo23757h0(r1, r14)
            if (r15 != r0) goto L_0x0078
            return r0
        L_0x0078:
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r15 = r14.this$0
            com.carrefour.fid.android.domain.interactors.basket.o0 r15 = r15.f68083d
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r1 = r14.$offer
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r6 = r1.mo118706x()
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r1 = r14.this$0
            java.lang.String r9 = r1.f68084e
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r1 = r14.$offer
            java.lang.String r12 = r1.mo118705w()
            com.carrefour.fid.android.domain.interactors.basket.o0$a r1 = new com.carrefour.fid.android.domain.interactors.basket.o0$a
            int r7 = r14.$quantity
            r8 = 1
            boolean r10 = r14.$isHomeDeliveryNal
            boolean r11 = r14.$hasMultipleOffers
            r13 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.label = r4
            java.lang.Object r15 = r15.m172966invokegIAlus(r1, r14)
            if (r15 != r0) goto L_0x0034
            return r0
        L_0x00a7:
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r15 = r14.this$0
            java.lang.Throwable r4 = kotlin.Result.m38705e(r1)
            if (r4 == 0) goto L_0x00c3
            kotlinx.coroutines.channels.g r15 = r15.f68087h
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.a$b r5 = new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.a$b
            r5.<init>(r4)
            r14.L$0 = r1
            r14.label = r3
            java.lang.Object r15 = r15.mo23757h0(r5, r14)
            if (r15 != r0) goto L_0x00c3
            return r0
        L_0x00c3:
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r15 = r14.this$0
            boolean r4 = r14.$isHomeDeliveryNal
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r5 = r14.$offer
            com.carrefour.fid.android.domain.models.product.detail.e r6 = r14.$product
            int r7 = r14.$quantity
            boolean r8 = r14.$hasMultipleOffers
            boolean r3 = kotlin.Result.m38710j(r1)
            if (r3 == 0) goto L_0x00ed
            r3 = r1
            kotlin.d2 r3 = (kotlin.C11079d2) r3
            kotlinx.coroutines.channels.g r15 = r15.f68087h
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.a$a r9 = new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.a$a
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r14.L$0 = r1
            r14.label = r2
            java.lang.Object r15 = r15.mo23757h0(r9, r14)
            if (r15 != r0) goto L_0x00ed
            return r0
        L_0x00ed:
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel$onAddToCartClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodProductDetailsViewModel$onAddToCartClicked$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
