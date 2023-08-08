package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.PromoCodeComponentKt$PromoCodeComponent$3 */
public final class PromoCodeComponentKt$PromoCodeComponent$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $currentCouponCode;
    final /* synthetic */ String $errorMessage;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ C11289a<C11079d2> $onAddPromoCodeClicked;
    final /* synthetic */ C11289a<C11079d2> $onCodeRemove;
    final /* synthetic */ C11300l<String, C11079d2> $onCodeValidation;
    final /* synthetic */ C11289a<C11079d2> $onFocusTextField;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PromoCodeComponentKt$PromoCodeComponent$3(String str, String str2, boolean z, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, int i) {
        super(2);
        this.$currentCouponCode = str;
        this.$errorMessage = str2;
        this.$isLoading = z;
        this.$onCodeValidation = lVar;
        this.$onCodeRemove = aVar;
        this.$onFocusTextField = aVar2;
        this.$onAddPromoCodeClicked = aVar3;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        PromoCodeComponentKt.m104635d(this.$currentCouponCode, this.$errorMessage, this.$isLoading, this.$onCodeValidation, this.$onCodeRemove, this.$onFocusTextField, this.$onAddPromoCodeClicked, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
