package com.skydoves.landscapist.glide;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.request.C22560g;
import com.skydoves.landscapist.C35334h;
import com.skydoves.landscapist.palette.BitmapPalette;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class GlideImage__GlideImageKt$GlideImage$21 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ BitmapPalette $bitmapPalette;
    final /* synthetic */ C22090i<Drawable> $builder;
    final /* synthetic */ C11306r<C2362h, C35334h, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ Object $recomposeKey;
    final /* synthetic */ C22560g<Drawable> $requestListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlideImage__GlideImageKt$GlideImage$21(Object obj, C22090i<Drawable> iVar, C8767m mVar, C22560g<Drawable> gVar, BitmapPalette bitmapPalette, C11306r<? super C2362h, ? super C35334h, ? super C8592o, ? super Integer, C11079d2> rVar, int i, int i2) {
        super(2);
        this.$recomposeKey = obj;
        this.$builder = iVar;
        this.$modifier = mVar;
        this.$requestListener = gVar;
        this.$bitmapPalette = bitmapPalette;
        this.$content = rVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        GlideImage__GlideImageKt.m145614e(this.$recomposeKey, this.$builder, this.$modifier, this.$requestListener, this.$bitmapPalette, this.$content, oVar, this.$$changed | 1, this.$$default);
    }
}
