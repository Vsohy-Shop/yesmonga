package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.foundation.text.C2775j;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.FidelityComponentKt$EditLoyaltyAmountComponent$3$1$1$1 */
public final class FidelityComponentKt$EditLoyaltyAmountComponent$3$1$1$1 extends Lambda implements C11300l<C2775j, C11079d2> {
    final /* synthetic */ String $number;
    final /* synthetic */ C11300l<String, C11079d2> $onValidate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FidelityComponentKt$EditLoyaltyAmountComponent$3$1$1$1(C11300l<? super String, C11079d2> lVar, String str) {
        super(1);
        this.$onValidate = lVar;
        this.$number = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C2775j) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C2775j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "$this$$receiver");
        this.$onValidate.invoke(this.$number);
    }
}
