package com.carrefour.fid.android.design.components.compose;

import com.carrefour.fid.android.design.libs.pager.PagerState;
import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CarouselComponentKt$ImagesFullScreen$1$3 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ PagerState $fullScreenCarouselState;
    final /* synthetic */ C11300l<Integer, C11079d2> $onImageClick;
    final /* synthetic */ C12074o0 $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselComponentKt$ImagesFullScreen$1$3(C11300l<? super Integer, C11079d2> lVar, C12074o0 o0Var, PagerState pagerState) {
        super(0);
        this.$onImageClick = lVar;
        this.$scope = o0Var;
        this.$fullScreenCarouselState = pagerState;
    }

    public final void invoke() {
        C11300l<Integer, C11079d2> lVar = this.$onImageClick;
        if (lVar != null) {
            C12074o0 o0Var = this.$scope;
            PagerState pagerState = this.$fullScreenCarouselState;
            C12079p0.m48265f(o0Var, (CancellationException) null, 1, (Object) null);
            lVar.invoke(Integer.valueOf(pagerState.mo114114s()));
        }
    }
}
