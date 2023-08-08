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
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.FidelityComponentKt$FidelityComponent$4 */
public final class FidelityComponentKt$FidelityComponent$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $amountAvailable;
    final /* synthetic */ double $amountValidated;
    final /* synthetic */ String $cardNumber;
    final /* synthetic */ boolean $hasError;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onUseAllLoyaltyAmountClicked;
    final /* synthetic */ C11300l<String, C11079d2> $onValidate;
    final /* synthetic */ boolean $useAllLoyaltyAmount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FidelityComponentKt$FidelityComponent$4(C8767m mVar, String str, String str2, boolean z, boolean z2, double d, C11300l<? super Boolean, C11079d2> lVar, C11300l<? super String, C11079d2> lVar2, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$cardNumber = str;
        this.$amountAvailable = str2;
        this.$useAllLoyaltyAmount = z;
        this.$hasError = z2;
        this.$amountValidated = d;
        this.$onUseAllLoyaltyAmountClicked = lVar;
        this.$onValidate = lVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        FidelityComponentKt.m104622b(this.$modifier, this.$cardNumber, this.$amountAvailable, this.$useAllLoyaltyAmount, this.$hasError, this.$amountValidated, this.$onUseAllLoyaltyAmountClicked, this.$onValidate, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
