package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.FidelityComponentKt$FidelityComponent$3$4$1$1 */
public final class FidelityComponentKt$FidelityComponent$3$4$1$1 extends Lambda implements C11300l<Boolean, C11079d2> {
    final /* synthetic */ C8700z0<String> $number;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onUseAllLoyaltyAmountClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FidelityComponentKt$FidelityComponent$3$4$1$1(C11300l<? super Boolean, C11079d2> lVar, C8700z0<String> z0Var) {
        super(1);
        this.$onUseAllLoyaltyAmountClicked = lVar;
        this.$number = z0Var;
    }

    /* renamed from: a */
    public final void mo68823a(boolean z) {
        this.$onUseAllLoyaltyAmountClicked.invoke(Boolean.valueOf(z));
        this.$number.setValue("");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo68823a(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
