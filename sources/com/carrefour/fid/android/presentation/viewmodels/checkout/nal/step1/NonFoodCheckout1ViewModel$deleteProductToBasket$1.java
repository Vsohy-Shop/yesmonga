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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$deleteProductToBasket$1", mo22502f = "NonFoodCheckout1ViewModel.kt", mo22503i = {}, mo22504l = {131, 132, 138, 140}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NonFoodCheckout1ViewModel$deleteProductToBasket$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Product $product;
    Object L$0;
    int label;
    final /* synthetic */ NonFoodCheckout1ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckout1ViewModel$deleteProductToBasket$1(NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel, Product product, C11045c<? super NonFoodCheckout1ViewModel$deleteProductToBasket$1> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodCheckout1ViewModel;
        this.$product = product;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodCheckout1ViewModel$deleteProductToBasket$1(this.this$0, this.$product, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 == r5) goto L_0x0032
            if (r1 == r4) goto L_0x0027
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            kotlin.C11661u0.m45747n(r9)
            goto L_0x00a7
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0021:
            java.lang.Object r1 = r8.L$0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x008b
        L_0x0027:
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
        L_0x0030:
            r1 = r9
            goto L_0x006f
        L_0x0032:
            kotlin.C11661u0.m45747n(r9)
            goto L_0x004a
        L_0x0036:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r9 = r8.this$0
            kotlinx.coroutines.channels.g r9 = r9.f63925r
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.l r1 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23560l.f59527a
            r8.label = r5
            java.lang.Object r9 = r9.mo23757h0(r1, r8)
            if (r9 != r0) goto L_0x004a
            return r0
        L_0x004a:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r9 = r8.this$0
            com.carrefour.fid.android.domain.interactors.product.c r9 = r9.f63912e
            com.carrefour.fid.android.domain.interactors.product.c$a r1 = new com.carrefour.fid.android.domain.interactors.product.c$a
            com.carrefour.fid.android.domain.models.product.Product r5 = r8.$product
            java.lang.String r5 = r5.mo118415P()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r6 = r8.this$0
            java.lang.String r6 = r6.f63919l
            java.lang.String r6 = com.carrefour.fid.android.domain.models.basket.BasketReference.m156093b(r6)
            r7 = 0
            r1.<init>(r5, r6, r7)
            r8.label = r4
            java.lang.Object r9 = r9.m172966invokegIAlus(r1, r8)
            if (r9 != r0) goto L_0x0030
            return r0
        L_0x006f:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r9 = r8.this$0
            boolean r4 = kotlin.Result.m38710j(r1)
            if (r4 == 0) goto L_0x008b
            r4 = r1
            kotlin.d2 r4 = (kotlin.C11079d2) r4
            kotlinx.coroutines.channels.g r9 = r9.f63925r
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.m r4 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23561m.f59529a
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = r9.mo23757h0(r4, r8)
            if (r9 != r0) goto L_0x008b
            return r0
        L_0x008b:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r9 = r8.this$0
            java.lang.Throwable r3 = kotlin.Result.m38705e(r1)
            if (r3 == 0) goto L_0x00a7
            kotlinx.coroutines.channels.g r9 = r9.f63925r
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.k r4 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.k
            r4.<init>(r3)
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r9 = r9.mo23757h0(r4, r8)
            if (r9 != r0) goto L_0x00a7
            return r0
        L_0x00a7:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$deleteProductToBasket$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodCheckout1ViewModel$deleteProductToBasket$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
