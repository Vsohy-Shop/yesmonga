package com.carrefour.fid.android.design.components.compose.label;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LabelLinkComponentKt$LabelLinkSmall$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $imageRes;
    final /* synthetic */ long $imageTint;
    final /* synthetic */ C11289a<C11079d2> $onLinkClicked;
    final /* synthetic */ String $text;
    final /* synthetic */ long $textColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LabelLinkComponentKt$LabelLinkSmall$3(long j, int i, long j2, String str, C11289a<C11079d2> aVar, int i2) {
        super(2);
        this.$imageTint = j;
        this.$imageRes = i;
        this.$textColor = j2;
        this.$text = str;
        this.$onLinkClicked = aVar;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        LabelLinkComponentKt.m151864c(this.$imageTint, this.$imageRes, this.$textColor, this.$text, this.$onLinkClicked, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
