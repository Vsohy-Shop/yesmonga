package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1;

import com.carrefour.fid.android.domain.models.product.Product;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$updateProductQuantity$1", mo22502f = "NonFoodCheckout1ViewModel.kt", mo22503i = {}, mo22504l = {147, 148, 155, 157}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NonFoodCheckout1ViewModel$updateProductQuantity$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ int $newQuantity;
    final /* synthetic */ Product $product;
    Object L$0;
    int label;
    final /* synthetic */ NonFoodCheckout1ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckout1ViewModel$updateProductQuantity$1(NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel, Product product, int i, C11045c<? super NonFoodCheckout1ViewModel$updateProductQuantity$1> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodCheckout1ViewModel;
        this.$product = product;
        this.$newQuantity = i;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodCheckout1ViewModel$updateProductQuantity$1(this.this$0, this.$product, this.$newQuantity, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0095  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 == r5) goto L_0x0032
            if (r1 == r4) goto L_0x0027
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00a9
        L_0x0019:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0021:
            java.lang.Object r1 = r9.L$0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x008d
        L_0x0027:
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
        L_0x0030:
            r1 = r10
            goto L_0x0071
        L_0x0032:
            kotlin.C11661u0.m45747n(r10)
            goto L_0x004a
        L_0x0036:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r10 = r9.this$0
            kotlinx.coroutines.channels.g r10 = r10.f63925r
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.s r1 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23567s.f59535a
            r9.label = r5
            java.lang.Object r10 = r10.mo23757h0(r1, r9)
            if (r10 != r0) goto L_0x004a
            return r0
        L_0x004a:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r10 = r9.this$0
            com.carrefour.fid.android.domain.interactors.product.u r10 = r10.f63910c
            com.carrefour.fid.android.domain.interactors.product.u$a r1 = new com.carrefour.fid.android.domain.interactors.product.u$a
            com.carrefour.fid.android.domain.models.product.Product r5 = r9.$product
            java.lang.String r5 = r5.mo118415P()
            int r6 = r9.$newQuantity
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r7 = r9.this$0
            java.lang.String r7 = r7.f63919l
            java.lang.String r7 = com.carrefour.fid.android.domain.models.basket.BasketReference.m156093b(r7)
            r8 = 0
            r1.<init>(r5, r6, r7, r8)
            r9.label = r4
            java.lang.Object r10 = r10.m172966invokegIAlus(r1, r9)
            if (r10 != r0) goto L_0x0030
            return r0
        L_0x0071:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r10 = r9.this$0
            boolean r4 = kotlin.Result.m38710j(r1)
            if (r4 == 0) goto L_0x008d
            r4 = r1
            kotlin.d2 r4 = (kotlin.C11079d2) r4
            kotlinx.coroutines.channels.g r10 = r10.f63925r
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.t r4 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23568t.f59537a
            r9.L$0 = r1
            r9.label = r3
            java.lang.Object r10 = r10.mo23757h0(r4, r9)
            if (r10 != r0) goto L_0x008d
            return r0
        L_0x008d:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r10 = r9.this$0
            java.lang.Throwable r3 = kotlin.Result.m38705e(r1)
            if (r3 == 0) goto L_0x00a9
            kotlinx.coroutines.channels.g r10 = r10.f63925r
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.r r4 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.r
            r4.<init>(r3)
            r9.L$0 = r1
            r9.label = r2
            java.lang.Object r10 = r10.mo23757h0(r4, r9)
            if (r10 != r0) goto L_0x00a9
            return r0
        L_0x00a9:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$updateProductQuantity$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodCheckout1ViewModel$updateProductQuantity$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
