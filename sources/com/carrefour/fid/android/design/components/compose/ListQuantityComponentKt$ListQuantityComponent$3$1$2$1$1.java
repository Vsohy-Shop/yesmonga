package com.carrefour.fid.android.design.components.compose;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ListQuantityComponentKt$ListQuantityComponent$3$1$2$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ int $currentIndex;
    final /* synthetic */ C11300l<Integer, C11079d2> $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListQuantityComponentKt$ListQuantityComponent$3$1$2$1$1(C11300l<? super Integer, C11079d2> lVar, int i) {
        super(0);
        this.$onClick = lVar;
        this.$currentIndex = i;
    }

    public final void invoke() {
        this.$onClick.invoke(Integer.valueOf(this.$currentIndex));
    }
}
