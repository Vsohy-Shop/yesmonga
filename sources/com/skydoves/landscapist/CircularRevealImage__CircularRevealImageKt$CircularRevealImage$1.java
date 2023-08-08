package com.skydoves.landscapist;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class CircularRevealImage__CircularRevealImageKt$CircularRevealImage$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8734c $alignment;
    final /* synthetic */ float $alpha;
    final /* synthetic */ C15403w2 $bitmap;
    final /* synthetic */ Painter $bitmapPainter;
    final /* synthetic */ C35314a $circularReveal;
    final /* synthetic */ C15249k2 $colorFilter;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ C15541c $contentScale;
    final /* synthetic */ C8767m $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircularRevealImage__CircularRevealImageKt$CircularRevealImage$1(C15403w2 w2Var, C8767m mVar, Painter painter, C8734c cVar, C15541c cVar2, String str, float f, C15249k2 k2Var, C35314a aVar, int i, int i2) {
        super(2);
        this.$bitmap = w2Var;
        this.$modifier = mVar;
        this.$bitmapPainter = painter;
        this.$alignment = cVar;
        this.$contentScale = cVar2;
        this.$contentDescription = str;
        this.$alpha = f;
        this.$colorFilter = k2Var;
        this.$circularReveal = aVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C35316c.m145601a(this.$bitmap, this.$modifier, this.$bitmapPainter, this.$alignment, this.$contentScale, this.$contentDescription, this.$alpha, this.$colorFilter, this.$circularReveal, oVar, this.$$changed | 1, this.$$default);
    }
}
