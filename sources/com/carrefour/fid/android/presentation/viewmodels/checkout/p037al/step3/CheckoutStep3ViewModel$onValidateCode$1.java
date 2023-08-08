package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3;

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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$onValidateCode$1", mo22502f = "CheckoutStep3ViewModel.kt", mo22503i = {0, 1}, mo22504l = {289, 294, 302}, mo22505m = "invokeSuspend", mo22506n = {"loyaltyState", "loyaltyState"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStep3ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep3ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/CheckoutStep3ViewModel$onValidateCode$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,472:1\n230#2,5:473\n230#2,5:478\n230#2,5:483\n*S KotlinDebug\n*F\n+ 1 CheckoutStep3ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/CheckoutStep3ViewModel$onValidateCode$1\n*L\n288#1:473,5\n292#1:478,5\n299#1:483,5\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$onValidateCode$1 */
public final class CheckoutStep3ViewModel$onValidateCode$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $code;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CheckoutStep3ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ViewModel$onValidateCode$1(CheckoutStep3ViewModel checkoutStep3ViewModel, String str, C11045c<? super CheckoutStep3ViewModel$onValidateCode$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStep3ViewModel;
        this.$code = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutStep3ViewModel$onValidateCode$1(this.this$0, this.$code, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d7  */
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
            if (r1 == 0) goto L_0x003e
            if (r1 == r6) goto L_0x002f
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            kotlin.C11661u0.m45747n(r12)
            goto L_0x010d
        L_0x0018:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0020:
            java.lang.Object r1 = r11.L$2
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r1
            java.lang.Object r3 = r11.L$1
            java.lang.Object r7 = r11.L$0
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.a r7 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.C26132a) r7
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00c7
        L_0x002f:
            java.lang.Object r1 = r11.L$0
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.a r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.C26132a) r1
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            r7 = r1
            goto L_0x008d
        L_0x003e:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r12 = r11.this$0
            kotlinx.coroutines.flow.u r12 = r12.mo75849z0()
            java.lang.Object r12 = r12.getValue()
            com.carrefour.fid.android.shared.type.e r12 = (com.carrefour.fid.android.shared.type.C28892e) r12
            java.lang.Object r12 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r12)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.a r12 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.C26132a) r12
            if (r12 != 0) goto L_0x0058
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        L_0x0058:
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r1 = r11.this$0
            kotlinx.coroutines.flow.j r1 = r1.f63810M
        L_0x005e:
            java.lang.Object r7 = r1.getValue()
            r8 = r7
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r8 = (com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a) r8
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r8 = com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a.m111733d(r8, r5, r6, r6, r4)
            boolean r7 = r1.mo24216e(r7, r8)
            if (r7 == 0) goto L_0x005e
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r1 = r11.this$0
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase r1 = r1.f63819g
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$Param r7 = new com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$Param
            java.lang.String r8 = r12.mo75917k()
            java.lang.String r9 = r11.$code
            r7.<init>(r8, r9)
            r11.L$0 = r12
            r11.label = r6
            java.lang.Object r1 = r1.m173058invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase.Param) r7, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>>) r11)
            if (r1 != r0) goto L_0x008b
            return r0
        L_0x008b:
            r7 = r12
            r12 = r1
        L_0x008d:
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r1 = r11.this$0
            boolean r8 = kotlin.Result.m38710j(r12)
            if (r8 == 0) goto L_0x00cf
            r8 = r12
            java.lang.String r8 = (java.lang.String) r8
            kotlinx.coroutines.flow.j r8 = r1.f63810M
        L_0x009c:
            java.lang.Object r9 = r8.getValue()
            r10 = r9
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r10 = (com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a) r10
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r10 = new com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a
            r10.<init>(r5, r5)
            boolean r9 = r8.mo24216e(r9, r10)
            if (r9 == 0) goto L_0x009c
            r1.mo75840W0()
            kotlinx.coroutines.channels.g r8 = r1.f63803F
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$c r9 = com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.event.C26122a.C26125c.f63867a
            r11.L$0 = r7
            r11.L$1 = r12
            r11.L$2 = r1
            r11.label = r3
            java.lang.Object r3 = r8.mo23757h0(r9, r11)
            if (r3 != r0) goto L_0x00c6
            return r0
        L_0x00c6:
            r3 = r12
        L_0x00c7:
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.analytics.a r12 = r1.mo75846w0()
            r12.mo75867f()
            r12 = r3
        L_0x00cf:
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r1 = r11.this$0
            java.lang.Throwable r3 = kotlin.Result.m38705e(r12)
            if (r3 == 0) goto L_0x010d
            kotlinx.coroutines.flow.j r8 = r1.f63810M
        L_0x00db:
            java.lang.Object r9 = r8.getValue()
            r10 = r9
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r10 = (com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a) r10
            com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a r10 = new com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a
            r10.<init>(r6, r5)
            boolean r9 = r8.mo24216e(r9, r10)
            if (r9 == 0) goto L_0x00db
            boolean r3 = r3 instanceof com.carrefour.fid.android.loyalty.core.p061io.OTPLoyaltyBlockedCardThrowable
            if (r3 == 0) goto L_0x010d
            kotlinx.coroutines.channels.g r1 = r1.f63803F
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$b r3 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$b
            java.lang.String r5 = r7.mo75917k()
            r3.<init>(r5)
            r11.L$0 = r12
            r11.L$1 = r4
            r11.L$2 = r4
            r11.label = r2
            java.lang.Object r12 = r1.mo23757h0(r3, r11)
            if (r12 != r0) goto L_0x010d
            return r0
        L_0x010d:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$onValidateCode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStep3ViewModel$onValidateCode$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
