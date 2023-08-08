package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$4$1 */
public final class DeliveryChoiceComponentKt$ServiceSetComponentFactory$4$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<Boolean, C11079d2> $onInfoClicked;
    final /* synthetic */ C27934i $serviceSet;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliveryChoiceComponentKt$ServiceSetComponentFactory$4$1(C11300l<? super Boolean, C11079d2> lVar, C27934i iVar) {
        super(0);
        this.$onInfoClicked = lVar;
        this.$serviceSet = iVar;
    }

    public final void invoke() {
        this.$onInfoClicked.invoke(Boolean.valueOf(this.$serviceSet.mo81355q()));
    }
}
