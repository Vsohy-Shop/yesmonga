package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutBasketContainAlcoholCheckboxKt$CheckoutBasketContainAlcoholCheckbox$1$1$1 */
public final class C23243xacc9e1c2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ boolean $isChecked;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onCheckedChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23243xacc9e1c2(C11300l<? super Boolean, C11079d2> lVar, boolean z) {
        super(0);
        this.$onCheckedChange = lVar;
        this.$isChecked = z;
    }

    public final void invoke() {
        this.$onCheckedChange.invoke(Boolean.valueOf(!this.$isChecked));
    }
}
