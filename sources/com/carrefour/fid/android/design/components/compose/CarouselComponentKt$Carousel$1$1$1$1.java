package com.carrefour.fid.android.design.components.compose;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CarouselComponentKt$Carousel$1$1$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<Integer, C11079d2> $onImageClick;
    final /* synthetic */ int $page;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselComponentKt$Carousel$1$1$1$1(C11300l<? super Integer, C11079d2> lVar, int i) {
        super(0);
        this.$onImageClick = lVar;
        this.$page = i;
    }

    public final void invoke() {
        this.$onImageClick.invoke(Integer.valueOf(this.$page));
    }
}
