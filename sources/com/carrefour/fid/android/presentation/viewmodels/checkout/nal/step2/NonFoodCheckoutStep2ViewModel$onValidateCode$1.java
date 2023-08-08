package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$onValidateCode$1", mo22502f = "NonFoodCheckoutStep2ViewModel.kt", mo22503i = {0, 1}, mo22504l = {652, 657, 662}, mo22505m = "invokeSuspend", mo22506n = {"cardFid", "cardFid"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nNonFoodCheckoutStep2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel$onValidateCode$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,704:1\n230#2,5:705\n230#2,5:710\n230#2,5:715\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel$onValidateCode$1\n*L\n651#1:705,5\n655#1:710,5\n659#1:715,5\n*E\n"})
public final class NonFoodCheckoutStep2ViewModel$onValidateCode$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $code;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ViewModel$onValidateCode$1(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, String str, C11045c<? super NonFoodCheckoutStep2ViewModel$onValidateCode$1> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodCheckoutStep2ViewModel;
        this.$code = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodCheckoutStep2ViewModel$onValidateCode$1(this.this$0, this.$code, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ce  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r12.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 == r6) goto L_0x002b
            if (r1 == r4) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0102
        L_0x0018:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0020:
            java.lang.Object r1 = r12.L$1
            java.lang.Object r4 = r12.L$0
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$a r4 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.C26192a) r4
            kotlin.C11661u0.m45747n(r13)
            goto L_0x00c5
        L_0x002b:
            java.lang.Object r1 = r12.L$0
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$a r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.C26192a) r1
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            r11 = r1
            r1 = r13
            r13 = r11
            goto L_0x008d
        L_0x003c:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r13 = r12.this$0
            kotlinx.coroutines.flow.j r13 = r13.mo75982M0()
            java.lang.Object r13 = r13.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r13 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r13
            com.carrefour.fid.android.shared.type.e r13 = r13.mo76125k()
            java.lang.Object r13 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r13)
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$a r13 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.C26192a) r13
            if (r13 != 0) goto L_0x005a
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x005a:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r1 = r12.this$0
            kotlinx.coroutines.flow.j r1 = r1.f63943A
        L_0x0060:
            java.lang.Object r7 = r1.getValue()
            r8 = r7
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r8 = (com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a) r8
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r8 = com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a.m111733d(r8, r5, r6, r6, r2)
            boolean r7 = r1.mo24216e(r7, r8)
            if (r7 == 0) goto L_0x0060
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r1 = r12.this$0
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase r1 = r1.f63964n
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$Param r7 = new com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$Param
            java.lang.String r8 = r13.mo76146k()
            java.lang.String r9 = r12.$code
            r7.<init>(r8, r9)
            r12.L$0 = r13
            r12.label = r6
            java.lang.Object r1 = r1.m173058invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase.Param) r7, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>>) r12)
            if (r1 != r0) goto L_0x008d
            return r0
        L_0x008d:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r7 = r12.this$0
            boolean r8 = kotlin.Result.m38710j(r1)
            if (r8 == 0) goto L_0x00c6
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            kotlinx.coroutines.flow.j r8 = r7.f63943A
        L_0x009c:
            java.lang.Object r9 = r8.getValue()
            r10 = r9
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r10 = (com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a) r10
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r10 = new com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a
            r10.<init>(r5, r5)
            boolean r9 = r8.mo24216e(r9, r10)
            if (r9 == 0) goto L_0x009c
            r7.mo75993X0()
            kotlinx.coroutines.channels.g r7 = r7.f63972v
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$b r8 = com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a.C26179b.f64021a
            r12.L$0 = r13
            r12.L$1 = r1
            r12.label = r4
            java.lang.Object r4 = r7.mo23757h0(r8, r12)
            if (r4 != r0) goto L_0x00c4
            return r0
        L_0x00c4:
            r4 = r13
        L_0x00c5:
            r13 = r4
        L_0x00c6:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r4 = r12.this$0
            java.lang.Throwable r7 = kotlin.Result.m38705e(r1)
            if (r7 == 0) goto L_0x0102
            kotlinx.coroutines.flow.j r8 = r4.f63943A
        L_0x00d2:
            java.lang.Object r9 = r8.getValue()
            r10 = r9
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r10 = (com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a) r10
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r10 = new com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a
            r10.<init>(r6, r5)
            boolean r9 = r8.mo24216e(r9, r10)
            if (r9 == 0) goto L_0x00d2
            boolean r5 = r7 instanceof com.carrefour.fid.android.loyalty.core.p061io.OTPLoyaltyBlockedCardThrowable
            if (r5 == 0) goto L_0x0102
            kotlinx.coroutines.channels.g r4 = r4.f63972v
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$a r5 = new com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$a
            java.lang.String r13 = r13.mo76146k()
            r5.<init>(r13)
            r12.L$0 = r1
            r12.L$1 = r2
            r12.label = r3
            java.lang.Object r13 = r4.mo23757h0(r5, r12)
            if (r13 != r0) goto L_0x0102
            return r0
        L_0x0102:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$onValidateCode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodCheckoutStep2ViewModel$onValidateCode$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
