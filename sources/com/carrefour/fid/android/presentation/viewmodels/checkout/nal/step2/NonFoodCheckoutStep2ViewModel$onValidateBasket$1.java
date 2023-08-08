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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$onValidateBasket$1", mo22502f = "NonFoodCheckoutStep2ViewModel.kt", mo22503i = {}, mo22504l = {182, 191, 193}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nNonFoodCheckoutStep2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel$onValidateBasket$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,704:1\n230#2,5:705\n230#2,5:710\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel$onValidateBasket$1\n*L\n181#1:705,5\n195#1:710,5\n*E\n"})
public final class NonFoodCheckoutStep2ViewModel$onValidateBasket$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ViewModel$onValidateBasket$1(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, C11045c<? super NonFoodCheckoutStep2ViewModel$onValidateBasket$1> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodCheckoutStep2ViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodCheckoutStep2ViewModel$onValidateBasket$1(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f4  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 == r5) goto L_0x0027
            if (r2 == r4) goto L_0x0020
            if (r2 != r3) goto L_0x0018
            kotlin.C11661u0.m45747n(r21)
            goto L_0x0106
        L_0x0018:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0020:
            java.lang.Object r2 = r0.L$0
            kotlin.C11661u0.m45747n(r21)
            goto L_0x00ec
        L_0x0027:
            kotlin.C11661u0.m45747n(r21)
            r2 = r21
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.mo21858l()
            goto L_0x00cd
        L_0x0034:
            kotlin.C11661u0.m45747n(r21)
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r2 = r0.this$0
            kotlinx.coroutines.flow.j r6 = r2.f63975y
            java.lang.Object r6 = r6.getValue()
            com.carrefour.fid.android.shared.type.e r6 = (com.carrefour.fid.android.shared.type.C28892e) r6
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r7 = r0.this$0
            kotlinx.coroutines.flow.j r7 = r7.mo75982M0()
            java.lang.Object r7 = r7.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r7 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r7
            com.carrefour.fid.android.shared.type.e r7 = r7.mo76128n()
            boolean r2 = r2.mo76005i1(r6, r7)
            if (r2 != 0) goto L_0x005c
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x005c:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r2 = r0.this$0
            kotlinx.coroutines.flow.j r2 = r2.f63974x
            java.lang.Object r2 = r2.getValue()
            com.carrefour.fid.android.shared.type.e r2 = (com.carrefour.fid.android.shared.type.C28892e) r2
            java.lang.Object r2 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r2)
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2
            if (r2 != 0) goto L_0x0073
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0073:
            com.carrefour.fid.android.domain.models.BasketDomain r8 = com.carrefour.fid.android.domain.extension.C37498a.m153932b(r2)
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r2 = r0.this$0
            kotlinx.coroutines.flow.j r2 = r2.mo75982M0()
        L_0x007d:
            java.lang.Object r6 = r2.getValue()
            r9 = r6
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r9 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r9
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 1
            r17 = 0
            r18 = 191(0xbf, float:2.68E-43)
            r19 = 0
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r7 = com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.m111921j(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r6 = r2.mo24216e(r6, r7)
            if (r6 == 0) goto L_0x007d
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r2 = r0.this$0
            com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase r2 = r2.f63958h
            com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$a r15 = new com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$a
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r6 = r0.this$0
            java.lang.String r7 = r6.mo75973D0(r8)
            r9 = 0
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r6 = r0.this$0
            boolean r10 = r6.f63968r
            r11 = 0
            r12 = 0
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r6 = r0.this$0
            com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$a$a r13 = r6.mo75974E0()
            r14 = 48
            r16 = 0
            r6 = r15
            r3 = r15
            r15 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.label = r5
            java.lang.Object r2 = r2.m172946invokegIAlus(r3, r0)
            if (r2 != r1) goto L_0x00cd
            return r1
        L_0x00cd:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r3 = r0.this$0
            boolean r5 = kotlin.Result.m38710j(r2)
            if (r5 == 0) goto L_0x00ec
            r5 = r2
            com.carrefour.fid.android.presentation.models.PaymentConfirmationModel r5 = (com.carrefour.fid.android.presentation.models.PaymentConfirmationModel) r5
            kotlinx.coroutines.channels.g r3 = r3.f63972v
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$f r6 = new com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$f
            r6.<init>(r5)
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r3 = r3.mo23757h0(r6, r0)
            if (r3 != r1) goto L_0x00ec
            return r1
        L_0x00ec:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r3 = r0.this$0
            java.lang.Throwable r4 = kotlin.Result.m38705e(r2)
            if (r4 == 0) goto L_0x0106
            kotlinx.coroutines.channels.g r3 = r3.f63972v
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$e r4 = com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a.C26182e.f64030a
            r0.L$0 = r2
            r6 = 3
            r0.label = r6
            java.lang.Object r2 = r3.mo23757h0(r4, r0)
            if (r2 != r1) goto L_0x0106
            return r1
        L_0x0106:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r1 = r0.this$0
            kotlinx.coroutines.flow.j r3 = r1.mo75982M0()
        L_0x010c:
            java.lang.Object r1 = r3.getValue()
            r4 = r1
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r4 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 191(0xbf, float:2.68E-43)
            r14 = 0
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r2 = com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.m111921j(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = r3.mo24216e(r1, r2)
            if (r1 == 0) goto L_0x010c
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$onValidateBasket$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodCheckoutStep2ViewModel$onValidateBasket$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
