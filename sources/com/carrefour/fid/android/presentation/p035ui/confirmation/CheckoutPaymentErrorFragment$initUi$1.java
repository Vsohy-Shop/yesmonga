package com.carrefour.fid.android.presentation.p035ui.confirmation;

import android.view.View;
import androidx.fragment.app.C19232h;
import androidx.lifecycle.C19501x;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment$initUi$1", mo22502f = "CheckoutPaymentErrorFragment.kt", mo22503i = {0, 1}, mo22504l = {61, 65}, mo22505m = "invokeSuspend", mo22506n = {"it", "it"}, mo22507s = {"L$2", "L$2"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment$initUi$1 */
public final class CheckoutPaymentErrorFragment$initUi$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ CheckoutPaymentErrorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutPaymentErrorFragment$initUi$1(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment, C11045c<? super CheckoutPaymentErrorFragment$initUi$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutPaymentErrorFragment;
    }

    /* renamed from: k */
    public static final void m105345k(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment, View view) {
        view.setEnabled(false);
        C19232h activity = checkoutPaymentErrorFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* renamed from: l */
    public static final void m105346l(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment, View view) {
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(checkoutPaymentErrorFragment), (CoroutineContext) null, (CoroutineStart) null, new CheckoutPaymentErrorFragment$initUi$1$1$2$1$1(checkoutPaymentErrorFragment, (C11045c<? super CheckoutPaymentErrorFragment$initUi$1$1$2$1$1>) null), 3, (Object) null);
    }

    /* renamed from: m */
    public static final void m105347m(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment, View view) {
        checkoutPaymentErrorFragment.mo69576c1();
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutPaymentErrorFragment$initUi$1(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0141  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r14.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0064
            if (r1 == r3) goto L_0x003c
            if (r1 != r2) goto L_0x0034
            int r0 = r14.I$1
            int r1 = r14.I$0
            java.lang.Object r2 = r14.L$6
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.Object r3 = r14.L$5
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r5 = r14.L$4
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment r5 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment) r5
            java.lang.Object r6 = r14.L$3
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.lang.Object r7 = r14.L$2
            com.carrefour.fid.android.core.type.PaymentErrorType r7 = (com.carrefour.fid.android.core.type.PaymentErrorType) r7
            java.lang.Object r8 = r14.L$1
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment r8 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment) r8
            java.lang.Object r9 = r14.L$0
            com.carrefour.fid.android.core.type.PaymentErrorType r9 = (com.carrefour.fid.android.core.type.PaymentErrorType) r9
            kotlin.C11661u0.m45747n(r15)
            goto L_0x00fe
        L_0x0034:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x003c:
            int r1 = r14.I$1
            int r5 = r14.I$0
            java.lang.Object r6 = r14.L$7
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.Object r7 = r14.L$6
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment r7 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment) r7
            java.lang.Object r8 = r14.L$5
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment r8 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment) r8
            java.lang.Object r9 = r14.L$4
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            java.lang.Object r10 = r14.L$3
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            java.lang.Object r11 = r14.L$2
            com.carrefour.fid.android.core.type.PaymentErrorType r11 = (com.carrefour.fid.android.core.type.PaymentErrorType) r11
            java.lang.Object r12 = r14.L$1
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment r12 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment) r12
            java.lang.Object r13 = r14.L$0
            com.carrefour.fid.android.core.type.PaymentErrorType r13 = (com.carrefour.fid.android.core.type.PaymentErrorType) r13
            kotlin.C11661u0.m45747n(r15)
            goto L_0x00b4
        L_0x0064:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment r15 = r14.this$0
            com.carrefour.fid.android.presentation.ui.confirmation.p r15 = r15.mo69573Z0()
            com.carrefour.fid.android.core.type.PaymentErrorType r11 = r15.mo69628h()
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment r7 = r14.this$0
            com.carrefour.fid.android.databinding.h1 r15 = com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment.m105321T0(r7)
            android.widget.TextView r6 = r15.f90937j
            com.carrefour.fid.android.core.type.PaymentErrorType r15 = com.carrefour.fid.android.core.type.PaymentErrorType.PAYMENT_GENERIC_ERROR
            if (r11 != r15) goto L_0x0088
            int r15 = r11.mo108573w()
            java.lang.String r15 = r7.getString(r15)
            r5 = r7
            r7 = r11
            goto L_0x00c6
        L_0x0088:
            int r1 = r11.mo108573w()
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r15 = r7.mo69575b1()
            r14.L$0 = r11
            r14.L$1 = r7
            r14.L$2 = r11
            r14.L$3 = r9
            r14.L$4 = r9
            r14.L$5 = r7
            r14.L$6 = r7
            r14.L$7 = r6
            r14.I$0 = r4
            r14.I$1 = r1
            r14.label = r3
            java.lang.Object r15 = r15.mo76179A0(r14)
            if (r15 != r0) goto L_0x00af
            return r0
        L_0x00af:
            r5 = r4
            r8 = r7
            r12 = r8
            r10 = r9
            r13 = r11
        L_0x00b4:
            r9[r5] = r15
            java.lang.String r15 = r8.getString(r1, r10)
            java.lang.String r1 = "getString(it.title, chec…ViewModel.getFirstName())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
            android.text.SpannableString r15 = r7.mo69572Y0(r15)
            r7 = r11
            r5 = r12
            r11 = r13
        L_0x00c6:
            r6.setText(r15)
            com.carrefour.fid.android.databinding.h1 r15 = com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment.m105321T0(r5)
            android.widget.TextView r15 = r15.f90936i
            int r1 = r7.mo108572r()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r6 = r5.mo69575b1()
            r14.L$0 = r11
            r14.L$1 = r5
            r14.L$2 = r7
            r14.L$3 = r3
            r14.L$4 = r5
            r14.L$5 = r15
            r14.L$6 = r3
            r8 = 0
            r14.L$7 = r8
            r14.I$0 = r4
            r14.I$1 = r1
            r14.label = r2
            java.lang.Object r2 = r6.mo76183E0(r14)
            if (r2 != r0) goto L_0x00f7
            return r0
        L_0x00f7:
            r0 = r1
            r6 = r3
            r1 = r4
            r8 = r5
            r3 = r15
            r15 = r2
            r2 = r6
        L_0x00fe:
            r6[r1] = r15
            java.lang.String r15 = r5.getString(r0, r2)
            r3.setText(r15)
            com.carrefour.fid.android.databinding.h1 r15 = com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment.m105321T0(r8)
            android.widget.ImageView r15 = r15.f90931d
            com.carrefour.fid.android.core.type.PaymentErrorType r0 = com.carrefour.fid.android.core.type.PaymentErrorType.TECHNICAL_ERROR
            java.lang.String r1 = "CBPASS"
            if (r7 != r0) goto L_0x0118
            int r2 = r7.mo108571q()
            goto L_0x012e
        L_0x0118:
            com.carrefour.fid.android.presentation.ui.confirmation.p r2 = r8.mo69573Z0()
            java.lang.String r2 = r2.mo69630i()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r2 == 0) goto L_0x012a
            r2 = 2131231036(0x7f08013c, float:1.8078142E38)
            goto L_0x012e
        L_0x012a:
            int r2 = r7.mo108571q()
        L_0x012e:
            r15.setImageResource(r2)
            com.carrefour.fid.android.databinding.h1 r15 = com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment.m105321T0(r8)
            android.widget.Button r15 = r15.f90929b
            com.carrefour.fid.android.core.type.PaymentErrorType r2 = com.carrefour.fid.android.core.type.PaymentErrorType.PAYMENT_GENERIC_ERROR
            r3 = 8
            if (r7 != r2) goto L_0x0141
            r15.setVisibility(r3)
            goto L_0x014c
        L_0x0141:
            r15.setVisibility(r4)
            com.carrefour.fid.android.presentation.ui.confirmation.m r5 = new com.carrefour.fid.android.presentation.ui.confirmation.m
            r5.<init>(r8)
            r15.setOnClickListener(r5)
        L_0x014c:
            com.carrefour.fid.android.databinding.h1 r15 = com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment.m105321T0(r8)
            android.widget.TextView r15 = r15.f90935h
            if (r7 == r0) goto L_0x015b
            if (r7 != r2) goto L_0x0157
            goto L_0x015b
        L_0x0157:
            r15.setVisibility(r3)
            goto L_0x0166
        L_0x015b:
            r15.setVisibility(r4)
            com.carrefour.fid.android.presentation.ui.confirmation.n r2 = new com.carrefour.fid.android.presentation.ui.confirmation.n
            r2.<init>(r8)
            r15.setOnClickListener(r2)
        L_0x0166:
            com.carrefour.fid.android.databinding.h1 r15 = com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment.m105321T0(r8)
            androidx.constraintlayout.widget.Group r15 = r15.f90930c
            if (r7 != r0) goto L_0x0170
        L_0x016e:
            r4 = r3
            goto L_0x017e
        L_0x0170:
            com.carrefour.fid.android.presentation.ui.confirmation.p r0 = r8.mo69573Z0()
            java.lang.String r0 = r0.mo69630i()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x016e
        L_0x017e:
            r15.setVisibility(r4)
            com.carrefour.fid.android.databinding.h1 r15 = com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment.m105321T0(r8)
            android.widget.ImageView r15 = r15.f90933f
            com.carrefour.fid.android.presentation.ui.confirmation.o r0 = new com.carrefour.fid.android.presentation.ui.confirmation.o
            r0.<init>(r8)
            r15.setOnClickListener(r0)
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment$initUi$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutPaymentErrorFragment$initUi$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
