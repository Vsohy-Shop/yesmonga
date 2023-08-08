package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.PromoCodeComponentKt$PromoCodeComponent$1$1 */
public final class PromoCodeComponentKt$PromoCodeComponent$1$1 extends Lambda implements C11300l<Boolean, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $onAddPromoCodeClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PromoCodeComponentKt$PromoCodeComponent$1$1(C11289a<C11079d2> aVar) {
        super(1);
        this.$onAddPromoCodeClicked = aVar;
    }

    /* renamed from: a */
    public final void mo68832a(boolean z) {
        if (z) {
            this.$onAddPromoCodeClicked.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo68832a(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
