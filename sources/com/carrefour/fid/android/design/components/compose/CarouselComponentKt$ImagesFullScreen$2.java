package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CarouselComponentKt$ImagesFullScreen$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $currentIndex;
    final /* synthetic */ C11300l<Integer, C11079d2> $onImageClick;
    final /* synthetic */ List<String> $urls;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselComponentKt$ImagesFullScreen$2(List<String> list, int i, C11300l<? super Integer, C11079d2> lVar, int i2, int i3) {
        super(2);
        this.$urls = list;
        this.$currentIndex = i;
        this.$onImageClick = lVar;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CarouselComponentKt.m151352e(this.$urls, this.$currentIndex, this.$onImageClick, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
