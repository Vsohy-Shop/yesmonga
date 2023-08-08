package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$onValidatePayment$1", mo22502f = "CheckoutStep3ViewModel.kt", mo22503i = {}, mo22504l = {359, 361, 363}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$onValidatePayment$1 */
public final class CheckoutStep3ViewModel$onValidatePayment$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ boolean $postOrderSubstitutionEnabled;
    Object L$0;
    int label;
    final /* synthetic */ CheckoutStep3ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ViewModel$onValidatePayment$1(CheckoutStep3ViewModel checkoutStep3ViewModel, boolean z, C11045c<? super CheckoutStep3ViewModel$onValidatePayment$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStep3ViewModel;
        this.$postOrderSubstitutionEnabled = z;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutStep3ViewModel$onValidatePayment$1(this.this$0, this.$postOrderSubstitutionEnabled, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r4) goto L_0x0020
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001a:
            java.lang.Object r0 = r7.L$0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0082
        L_0x0020:
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0049
        L_0x002a:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r8 = r7.this$0
            kotlinx.coroutines.flow.j r8 = r8.f63801D
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            r8.setValue(r1)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r8 = r7.this$0
            com.carrefour.fid.android.domain.interactors.basket.l0 r8 = r8.f63816d
            r7.label = r4
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r7)
            if (r8 != r0) goto L_0x0049
            return r0
        L_0x0049:
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r1 = r7.this$0
            boolean r4 = r7.$postOrderSubstitutionEnabled
            boolean r5 = kotlin.Result.m38710j(r8)
            if (r5 == 0) goto L_0x0093
            r5 = r8
            com.carrefour.fid.android.domain.models.basket.Basket r5 = (com.carrefour.fid.android.domain.models.basket.Basket) r5
            com.carrefour.fid.android.presentation.ui.checkout.al.q r6 = r1.f63829q
            boolean r6 = r6.mo68495j()
            if (r6 != 0) goto L_0x0084
            com.carrefour.fid.android.domain.models.basket.BasketSlot r6 = r5.mo116826K()
            boolean r6 = r6.mo117001l()
            if (r6 == 0) goto L_0x0070
            boolean r6 = com.carrefour.fid.android.domain.models.basket.extension.C37972a.m156173d(r5)
            if (r6 == 0) goto L_0x0084
        L_0x0070:
            kotlinx.coroutines.channels.g r1 = r1.f63803F
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$i r2 = com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.event.C26122a.C26131i.f63880a
            r7.L$0 = r8
            r7.label = r3
            java.lang.Object r1 = r1.mo23757h0(r2, r7)
            if (r1 != r0) goto L_0x0081
            return r0
        L_0x0081:
            r0 = r8
        L_0x0082:
            r8 = r0
            goto L_0x0093
        L_0x0084:
            com.carrefour.fid.android.domain.models.BasketDomain r3 = com.carrefour.fid.android.domain.extension.C37498a.m153932b(r5)
            r7.L$0 = r8
            r7.label = r2
            java.lang.Object r1 = r1.mo75845v0(r3, r4, r7)
            if (r1 != r0) goto L_0x0081
            return r0
        L_0x0093:
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r0 = r7.this$0
            java.lang.Throwable r8 = kotlin.Result.m38705e(r8)
            if (r8 == 0) goto L_0x00a7
            kotlinx.coroutines.flow.j r0 = r0.f63836x
            com.carrefour.fid.android.shared.type.e$a r1 = new com.carrefour.fid.android.shared.type.e$a
            r1.<init>(r8)
            r0.setValue(r1)
        L_0x00a7:
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r8 = r7.this$0
            kotlinx.coroutines.flow.j r8 = r8.f63801D
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r0)
            r8.setValue(r0)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r8 = r7.this$0
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.analytics.a r8 = r8.mo75846w0()
            r8.mo75870i()
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$onValidatePayment$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStep3ViewModel$onValidatePayment$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
