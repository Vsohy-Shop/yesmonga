package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderSelfCareComponentKt$OrderSelfCareComponent$2$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<SelfCareType, C11079d2> $onClick;
    final /* synthetic */ SelfCareType $selfCareType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderSelfCareComponentKt$OrderSelfCareComponent$2$1(C11300l<? super SelfCareType, C11079d2> lVar, SelfCareType selfCareType) {
        super(0);
        this.$onClick = lVar;
        this.$selfCareType = selfCareType;
    }

    public final void invoke() {
        this.$onClick.invoke(this.$selfCareType);
    }
}
