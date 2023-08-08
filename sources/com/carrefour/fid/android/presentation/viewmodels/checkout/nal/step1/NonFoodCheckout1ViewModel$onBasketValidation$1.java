package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$onBasketValidation$1", mo22502f = "NonFoodCheckout1ViewModel.kt", mo22503i = {}, mo22504l = {179, 180, 185, 187}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NonFoodCheckout1ViewModel$onBasketValidation$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ NonFoodCheckout1ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckout1ViewModel$onBasketValidation$1(NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel, C11045c<? super NonFoodCheckout1ViewModel$onBasketValidation$1> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodCheckout1ViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodCheckout1ViewModel$onBasketValidation$1(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r5) goto L_0x0033
            if (r1 == r4) goto L_0x0028
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            kotlin.C11661u0.m45747n(r8)
            goto L_0x00d2
        L_0x0019:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0021:
            java.lang.Object r1 = r7.L$0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x00b6
        L_0x0028:
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
        L_0x0031:
            r1 = r8
            goto L_0x0065
        L_0x0033:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x004b
        L_0x0037:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r8 = r7.this$0
            kotlinx.coroutines.channels.g r8 = r8.f63925r
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.v r1 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23570v.f59541a
            r7.label = r5
            java.lang.Object r8 = r8.mo23757h0(r1, r7)
            if (r8 != r0) goto L_0x004b
            return r0
        L_0x004b:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r8 = r7.this$0
            com.carrefour.fid.android.domain.interactors.basket.f r8 = r8.f63913f
            com.carrefour.fid.android.domain.interactors.basket.f$a r1 = new com.carrefour.fid.android.domain.interactors.basket.f$a
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r5 = r7.this$0
            java.lang.String r5 = r5.f63919l
            r1.<init>(r5)
            r7.label = r4
            java.lang.Object r8 = r8.m172966invokegIAlus(r1, r7)
            if (r8 != r0) goto L_0x0031
            return r0
        L_0x0065:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r8 = r7.this$0
            boolean r4 = kotlin.Result.m38710j(r1)
            if (r4 == 0) goto L_0x00b6
            r4 = r1
            kotlin.d2 r4 = (kotlin.C11079d2) r4
            kotlinx.coroutines.flow.j r4 = r8.f63921n
            java.lang.Object r4 = r4.getValue()
            com.carrefour.fid.android.shared.type.e r4 = (com.carrefour.fid.android.shared.type.C28892e) r4
            java.lang.Object r4 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r4)
            com.carrefour.fid.android.domain.interactors.basket.d r4 = (com.carrefour.fid.android.domain.interactors.basket.C37562d) r4
            if (r4 == 0) goto L_0x0096
            java.util.Map r4 = r4.mo114370j()
            if (r4 == 0) goto L_0x0096
            java.util.Collection r4 = r4.values()
            if (r4 == 0) goto L_0x0096
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = kotlin.collections.C10978t.m41497a0(r4)
            if (r4 != 0) goto L_0x009a
        L_0x0096:
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x009a:
            java.util.HashMap r4 = com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159581c(r4)
            kotlinx.coroutines.channels.g r5 = r8.f63925r
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.w r6 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.w
            java.lang.String r8 = r8.f63919l
            r6.<init>(r8, r4)
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r5.mo23757h0(r6, r7)
            if (r8 != r0) goto L_0x00b6
            return r0
        L_0x00b6:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r8 = r7.this$0
            java.lang.Throwable r3 = kotlin.Result.m38705e(r1)
            if (r3 == 0) goto L_0x00d2
            kotlinx.coroutines.channels.g r8 = r8.f63925r
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.u r4 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.u
            r4.<init>(r3)
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = r8.mo23757h0(r4, r7)
            if (r8 != r0) goto L_0x00d2
            return r0
        L_0x00d2:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$onBasketValidation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodCheckout1ViewModel$onBasketValidation$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
