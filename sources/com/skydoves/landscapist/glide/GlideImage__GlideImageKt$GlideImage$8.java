package com.skydoves.landscapist.glide;

import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import com.skydoves.landscapist.C35339i;
import com.skydoves.landscapist.glide.C35326d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class GlideImage__GlideImageKt$GlideImage$8 extends Lambda implements C11306r<C2362h, C35326d.C35327a, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8734c $alignment;
    final /* synthetic */ float $alpha;
    final /* synthetic */ C15249k2 $colorFilter;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ C15541c $contentScale;
    final /* synthetic */ Object $error;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlideImage__GlideImageKt$GlideImage$8(Object obj, C8734c cVar, C15541c cVar2, String str, C15249k2 k2Var, float f, int i) {
        super(4);
        this.$error = obj;
        this.$alignment = cVar;
        this.$contentScale = cVar2;
        this.$contentDescription = str;
        this.$colorFilter = k2Var;
        this.$alpha = f;
        this.$$dirty = i;
    }

    @C8540g
    /* renamed from: a */
    public final void mo105796a(@C12579k C2362h hVar, @C12579k C35326d.C35327a aVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(hVar, "$this$GlideImage");
        Intrinsics.checkNotNullParameter(aVar, "it");
        Object obj = this.$error;
        if (obj != null) {
            C8734c cVar = this.$alignment;
            C15541c cVar2 = this.$contentScale;
            String str = this.$contentDescription;
            C15249k2 k2Var = this.$colorFilter;
            float f = this.$alpha;
            int i2 = this.$$dirty;
            C8767m e = hVar.mo7702e(C8767m.f23478j);
            int i3 = i2 >> 9;
            C8592o oVar2 = oVar;
            C35339i.m145676a(obj, e, cVar, cVar2, str, k2Var, f, oVar2, (i3 & 57344) | (i3 & 896) | 8 | (i3 & 7168) | ((i2 >> 12) & 458752) | ((i2 >> 6) & 3670016), 0);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo105796a((C2362h) obj, (C35326d.C35327a) obj2, (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
