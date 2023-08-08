package com.carrefour.fid.android.design.components.compose.label;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LabelComboLinkKt$LabelComboLargeHorizontalLinkUnavailable$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $imageRes;
    final /* synthetic */ int $linkImageRes;
    final /* synthetic */ String $linkText;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onLinkClicked;
    final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LabelComboLinkKt$LabelComboLargeHorizontalLinkUnavailable$1(int i, int i2, String str, String str2, C8767m mVar, C11289a<C11079d2> aVar, int i3, int i4) {
        super(2);
        this.$imageRes = i;
        this.$linkImageRes = i2;
        this.$text = str;
        this.$linkText = str2;
        this.$modifier = mVar;
        this.$onLinkClicked = aVar;
        this.$$changed = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        LabelComboLinkKt.m151805b(this.$imageRes, this.$linkImageRes, this.$text, this.$linkText, this.$modifier, this.$onLinkClicked, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
