package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.ValidatePaymentComponentKt$ValidatePaymentComponent$2 */
public final class ValidatePaymentComponentKt$ValidatePaymentComponent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onCgvClicked;
    final /* synthetic */ C11289a<C11079d2> $onValidate;
    final /* synthetic */ String $text;
    final /* synthetic */ double $totalAmount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidatePaymentComponentKt$ValidatePaymentComponent$2(C8767m mVar, double d, boolean z, boolean z2, String str, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$totalAmount = d;
        this.$isLoading = z;
        this.$isEnabled = z2;
        this.$text = str;
        this.$onValidate = aVar;
        this.$onCgvClicked = aVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ValidatePaymentComponentKt.m104655a(this.$modifier, this.$totalAmount, this.$isLoading, this.$isEnabled, this.$text, this.$onValidate, this.$onCgvClicked, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
