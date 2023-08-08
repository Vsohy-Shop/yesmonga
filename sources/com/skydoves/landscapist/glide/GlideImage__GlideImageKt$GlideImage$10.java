package com.skydoves.landscapist.glide;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import com.bumptech.glide.C22090i;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class GlideImage__GlideImageKt$GlideImage$10 extends Lambda implements C11304p<C8592o, Integer, C22090i<Drawable>> {
    final /* synthetic */ Object $imageModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlideImage__GlideImageKt$GlideImage$10(Object obj) {
        super(2);
        this.$imageModel = obj;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C22090i<Drawable> mo105777a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-293004234);
        C22090i<Drawable> a = C35332f.f86814a.mo105821a(this.$imageModel, oVar, 56);
        oVar.mo15002m0();
        return a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo105777a((C8592o) obj, ((Number) obj2).intValue());
    }
}
