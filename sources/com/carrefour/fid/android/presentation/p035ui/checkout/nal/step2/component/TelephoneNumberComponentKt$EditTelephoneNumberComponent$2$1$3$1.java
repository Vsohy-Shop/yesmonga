package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TelephoneNumberComponentKt$EditTelephoneNumberComponent$2$1$3$1 */
public final class TelephoneNumberComponentKt$EditTelephoneNumberComponent$2$1$3$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $hasError;
    final /* synthetic */ C8700z0<String> $number;
    final /* synthetic */ C11300l<String, C11079d2> $onValidate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TelephoneNumberComponentKt$EditTelephoneNumberComponent$2$1$3$1(C8700z0<String> z0Var, C11300l<? super String, C11079d2> lVar, C8700z0<Boolean> z0Var2) {
        super(0);
        this.$number = z0Var;
        this.$onValidate = lVar;
        this.$hasError = z0Var2;
    }

    public final void invoke() {
        if (TelephoneNumberComponentKt.m105061l(this.$number.getValue())) {
            this.$onValidate.invoke(this.$number.getValue());
            this.$hasError.setValue(Boolean.FALSE);
            return;
        }
        this.$hasError.setValue(Boolean.TRUE);
    }
}
