package com.skydoves.landscapist;

import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class ImageLoad__ImageLoadKt$ImageLoad$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11306r<C2362h, C35334h, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C11300l<C11045c<? super C11907e<? extends C35334h>>, Object> $executeImageRequest;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ T $recomposeKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageLoad__ImageLoadKt$ImageLoad$3(T t, C11300l<? super C11045c<? super C11907e<? extends C35334h>>, ? extends Object> lVar, C8767m mVar, C11306r<? super C2362h, ? super C35334h, ? super C8592o, ? super Integer, C11079d2> rVar, int i, int i2) {
        super(2);
        this.$recomposeKey = t;
        this.$executeImageRequest = lVar;
        this.$modifier = mVar;
        this.$content = rVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C35320g.m145609a(this.$recomposeKey, this.$executeImageRequest, this.$modifier, this.$content, oVar, this.$$changed | 1, this.$$default);
    }
}
