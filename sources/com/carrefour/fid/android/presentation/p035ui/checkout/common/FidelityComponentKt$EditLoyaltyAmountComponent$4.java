package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.FidelityComponentKt$EditLoyaltyAmountComponent$4 */
public final class FidelityComponentKt$EditLoyaltyAmountComponent$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ double $amountValidated;
    final /* synthetic */ boolean $hasError;
    final /* synthetic */ boolean $isEnable;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ String $number;
    final /* synthetic */ C11300l<String, C11079d2> $onValidate;
    final /* synthetic */ C11300l<String, C11079d2> $onValueChanged;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FidelityComponentKt$EditLoyaltyAmountComponent$4(C8767m mVar, boolean z, double d, boolean z2, String str, C11300l<? super String, C11079d2> lVar, C11300l<? super String, C11079d2> lVar2, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$hasError = z;
        this.$amountValidated = d;
        this.$isEnable = z2;
        this.$number = str;
        this.$onValidate = lVar;
        this.$onValueChanged = lVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        FidelityComponentKt.m104621a(this.$modifier, this.$hasError, this.$amountValidated, this.$isEnable, this.$number, this.$onValidate, this.$onValueChanged, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
