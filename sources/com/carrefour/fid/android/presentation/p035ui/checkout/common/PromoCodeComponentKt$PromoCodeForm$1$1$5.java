package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.p004ui.focus.C15068j;
import androidx.compose.p004ui.platform.C15991w3;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.PromoCodeComponentKt$PromoCodeForm$1$1$5 */
public final class PromoCodeComponentKt$PromoCodeForm$1$1$5 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8700z0<String> $couponCode$delegate;
    final /* synthetic */ C15068j $focus;
    final /* synthetic */ C15991w3 $keyboard;
    final /* synthetic */ C11300l<String, C11079d2> $onCodeValidation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PromoCodeComponentKt$PromoCodeForm$1$1$5(C15991w3 w3Var, C15068j jVar, C11300l<? super String, C11079d2> lVar, C8700z0<String> z0Var) {
        super(0);
        this.$keyboard = w3Var;
        this.$focus = jVar;
        this.$onCodeValidation = lVar;
        this.$couponCode$delegate = z0Var;
    }

    public final void invoke() {
        C15991w3 w3Var = this.$keyboard;
        if (w3Var != null) {
            w3Var.mo45850c();
        }
        C15068j.m64745h(this.$focus, false, 1, (Object) null);
        this.$onCodeValidation.invoke(PromoCodeComponentKt.m104637f(this.$couponCode$delegate));
    }
}
