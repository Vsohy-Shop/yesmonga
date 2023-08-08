package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$checkFidCode$1", mo22502f = "CheckoutStepTwoAdditionalOderViewModel.kt", mo22503i = {1, 2}, mo22504l = {122, 123, 129}, mo22505m = "invokeSuspend", mo22506n = {"loyaltyCardNumber", "loyaltyCardNumber"}, mo22507s = {"L$2", "L$2"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStepTwoAdditionalOderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStepTwoAdditionalOderViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutStepTwoAdditionalOderViewModel$checkFidCode$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,509:1\n230#2,5:510\n230#2,5:515\n230#2,5:520\n*S KotlinDebug\n*F\n+ 1 CheckoutStepTwoAdditionalOderViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutStepTwoAdditionalOderViewModel$checkFidCode$1\n*L\n121#1:510,5\n137#1:515,5\n146#1:520,5\n*E\n"})
public final class CheckoutStepTwoAdditionalOderViewModel$checkFidCode$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $code;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ CheckoutStepTwoAdditionalOderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStepTwoAdditionalOderViewModel$checkFidCode$1(CheckoutStepTwoAdditionalOderViewModel checkoutStepTwoAdditionalOderViewModel, String str, C11045c<? super CheckoutStepTwoAdditionalOderViewModel$checkFidCode$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStepTwoAdditionalOderViewModel;
        this.$code = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutStepTwoAdditionalOderViewModel$checkFidCode$1(this.this$0, this.$code, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e3  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0049
            if (r1 == r6) goto L_0x003e
            if (r1 == r3) goto L_0x002a
            if (r1 != r2) goto L_0x0022
            java.lang.Object r0 = r11.L$3
            java.lang.Object r1 = r11.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.L$1
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r2
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00ca
        L_0x0022:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x002a:
            java.lang.Object r1 = r11.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r11.L$1
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r3 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r3
            java.lang.Object r7 = r11.L$0
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x00a3
        L_0x003e:
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
        L_0x0047:
            r7 = r12
            goto L_0x0077
        L_0x0049:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r12 = r11.this$0
            kotlinx.coroutines.flow.j r12 = r12.f65350k
        L_0x0052:
            java.lang.Object r1 = r12.getValue()
            r7 = r1
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r7 = (com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a) r7
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r7 = com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a.m111733d(r7, r5, r6, r6, r4)
            boolean r1 = r12.mo24216e(r1, r7)
            if (r1 == 0) goto L_0x0052
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r12 = r11.this$0
            com.carrefour.fid.android.domain.interactors.loyalty.b r12 = r12.f65344e
            com.carrefour.fid.android.domain.interactors.loyalty.b$a r1 = new com.carrefour.fid.android.domain.interactors.loyalty.b$a
            r1.<init>(r5, r6, r4)
            r11.label = r6
            java.lang.Object r12 = r12.m172966invokegIAlus(r1, r11)
            if (r12 != r0) goto L_0x0047
            return r0
        L_0x0077:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r12 = r11.this$0
            java.lang.String r1 = r11.$code
            boolean r8 = kotlin.Result.m38710j(r7)
            if (r8 == 0) goto L_0x010f
            r8 = r7
            com.carrefour.fid.android.domain.models.loyalty.b r8 = (com.carrefour.fid.android.domain.models.loyalty.C38045b) r8
            java.lang.String r8 = r8.mo117869h()
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase r9 = r12.f65345f
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$Param r10 = new com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$Param
            r10.<init>(r8, r1)
            r11.L$0 = r7
            r11.L$1 = r12
            r11.L$2 = r8
            r11.label = r3
            java.lang.Object r1 = r9.m173058invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase.Param) r10, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>>) r11)
            if (r1 != r0) goto L_0x00a0
            return r0
        L_0x00a0:
            r3 = r12
            r12 = r1
            r1 = r8
        L_0x00a3:
            boolean r8 = kotlin.Result.m38710j(r12)
            if (r8 == 0) goto L_0x00dd
            r8 = r12
            java.lang.String r8 = (java.lang.String) r8
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$e r8 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26945a.C26950e.f65632a
            r3.emitEvent(r8)
            java.lang.String r8 = r3.f65352m
            if (r8 == 0) goto L_0x00cf
            r11.L$0 = r7
            r11.L$1 = r3
            r11.L$2 = r1
            r11.L$3 = r12
            r11.label = r2
            java.lang.Object r2 = r3.mo77868O0(r8, r11)
            if (r2 != r0) goto L_0x00c8
            return r0
        L_0x00c8:
            r0 = r12
            r2 = r3
        L_0x00ca:
            r2.f65352m = r4
            r12 = r0
            r3 = r2
        L_0x00cf:
            boolean r0 = r3.f65353n
            if (r0 == 0) goto L_0x00dd
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$h r0 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26945a.C26953h.f65638a
            r3.emitEvent(r0)
            r3.f65353n = r5
        L_0x00dd:
            java.lang.Throwable r12 = kotlin.Result.m38705e(r12)
            if (r12 == 0) goto L_0x010f
            kotlinx.coroutines.flow.j r0 = r3.f65350k
        L_0x00e7:
            java.lang.Object r2 = r0.getValue()
            r7 = r2
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r7 = (com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a) r7
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r7 = r7.mo75934c(r6, r5)
            boolean r2 = r0.mo24216e(r2, r7)
            if (r2 == 0) goto L_0x00e7
            boolean r12 = r12 instanceof com.carrefour.fid.android.loyalty.core.p061io.OTPLoyaltyBlockedCardThrowable
            if (r12 == 0) goto L_0x0104
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$d r12 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$d
            r12.<init>(r1)
            r3.emitEvent(r12)
        L_0x0104:
            boolean r12 = r3.f65353n
            if (r12 == 0) goto L_0x010f
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$b r12 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26945a.C26947b.f65626a
            r3.emitEvent(r12)
        L_0x010f:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r12 = r11.this$0
            kotlinx.coroutines.flow.j r1 = r12.f65350k
        L_0x0115:
            java.lang.Object r12 = r1.getValue()
            r0 = r12
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a) r0
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r0 = com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a.m111733d(r0, r5, r5, r6, r4)
            boolean r12 = r1.mo24216e(r12, r0)
            if (r12 == 0) goto L_0x0115
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$checkFidCode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStepTwoAdditionalOderViewModel$checkFidCode$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
