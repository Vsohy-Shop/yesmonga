package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$removePromoCode$1", mo22502f = "NonFoodCheckoutStep2ViewModel.kt", mo22503i = {}, mo22504l = {636, 637}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NonFoodCheckoutStep2ViewModel$removePromoCode$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ViewModel$removePromoCode$1(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, C11045c<? super NonFoodCheckoutStep2ViewModel$removePromoCode$1> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodCheckoutStep2ViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodCheckoutStep2ViewModel$removePromoCode$1(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r0 = r5.L$0
            kotlin.C11661u0.m45747n(r6)
            goto L_0x005b
        L_0x0014:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001c:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x003e
        L_0x0026:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r6 = r5.this$0
            com.carrefour.fid.android.domain.interactors.basket.c0 r6 = r6.f63963m
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r1 = r5.this$0
            java.lang.String r1 = r1.mo75984O0()
            r5.label = r3
            java.lang.Object r6 = r6.m172966invokegIAlus(r1, r5)
            if (r6 != r0) goto L_0x003e
            return r0
        L_0x003e:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r1 = r5.this$0
            java.lang.Throwable r3 = kotlin.Result.m38705e(r6)
            if (r3 == 0) goto L_0x005c
            kotlinx.coroutines.channels.g r1 = r1.f63972v
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$g r4 = new com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$g
            r4.<init>(r3)
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r1 = r1.mo23757h0(r4, r5)
            if (r1 != r0) goto L_0x005a
            return r0
        L_0x005a:
            r0 = r6
        L_0x005b:
            r6 = r0
        L_0x005c:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r0 = r5.this$0
            boolean r1 = kotlin.Result.m38710j(r6)
            if (r1 == 0) goto L_0x006a
            kotlin.d2 r6 = (kotlin.C11079d2) r6
            r6 = 0
            r0.mo76008l1(r6)
        L_0x006a:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$removePromoCode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodCheckoutStep2ViewModel$removePromoCode$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
