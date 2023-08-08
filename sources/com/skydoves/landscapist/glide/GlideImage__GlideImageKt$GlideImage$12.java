package com.skydoves.landscapist.glide;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.runtime.C8592o;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.C35344n;
import com.skydoves.landscapist.glide.C35326d;
import com.skydoves.landscapist.palette.BitmapPalette;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class GlideImage__GlideImageKt$GlideImage$12 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8734c $alignment;
    final /* synthetic */ float $alpha;
    final /* synthetic */ BitmapPalette $bitmapPalette;
    final /* synthetic */ C35314a $circularReveal;
    final /* synthetic */ C15249k2 $colorFilter;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ C15541c $contentScale;
    final /* synthetic */ C11306r<C2362h, C35326d.C35327a, C8592o, Integer, C11079d2> $failure;
    final /* synthetic */ Object $imageModel;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ int $previewPlaceholder;
    final /* synthetic */ C11304p<C8592o, Integer, C22090i<Drawable>> $requestBuilder;
    final /* synthetic */ C22560g<Drawable> $requestListener;
    final /* synthetic */ C11304p<C8592o, Integer, C22561h> $requestOptions;
    final /* synthetic */ C35344n $shimmerParams;
    final /* synthetic */ C11306r<C2362h, C35326d.C35330d, C8592o, Integer, C11079d2> $success;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlideImage__GlideImageKt$GlideImage$12(Object obj, C8767m mVar, C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>> pVar, C11304p<? super C8592o, ? super Integer, ? extends C22561h> pVar2, C22560g<Drawable> gVar, C8734c cVar, C15541c cVar2, String str, float f, C15249k2 k2Var, C35314a aVar, C35344n nVar, BitmapPalette bitmapPalette, int i, C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2> rVar, C11306r<? super C2362h, ? super C35326d.C35327a, ? super C8592o, ? super Integer, C11079d2> rVar2, int i2, int i3, int i4) {
        super(2);
        this.$imageModel = obj;
        this.$modifier = mVar;
        this.$requestBuilder = pVar;
        this.$requestOptions = pVar2;
        this.$requestListener = gVar;
        this.$alignment = cVar;
        this.$contentScale = cVar2;
        this.$contentDescription = str;
        this.$alpha = f;
        this.$colorFilter = k2Var;
        this.$circularReveal = aVar;
        this.$shimmerParams = nVar;
        this.$bitmapPalette = bitmapPalette;
        this.$previewPlaceholder = i;
        this.$success = rVar;
        this.$failure = rVar2;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        Object obj = this.$imageModel;
        Object obj2 = obj;
        C35325c.m145644a(obj2, this.$modifier, this.$requestBuilder, this.$requestOptions, this.$requestListener, this.$alignment, this.$contentScale, this.$contentDescription, this.$alpha, this.$colorFilter, this.$circularReveal, this.$shimmerParams, this.$bitmapPalette, this.$previewPlaceholder, this.$success, this.$failure, oVar2, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
