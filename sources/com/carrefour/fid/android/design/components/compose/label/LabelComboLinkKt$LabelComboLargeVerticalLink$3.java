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
public final class LabelComboLinkKt$LabelComboLargeVerticalLink$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ int $imageRes;
    final /* synthetic */ long $imageTint;
    final /* synthetic */ long $linkColor;
    final /* synthetic */ Integer $linkImageRes;
    final /* synthetic */ long $linkImageTint;
    final /* synthetic */ String $linkText;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onLinkClicked;
    final /* synthetic */ String $text;
    final /* synthetic */ long $textColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LabelComboLinkKt$LabelComboLargeVerticalLink$3(long j, long j2, long j3, long j4, int i, Integer num, String str, String str2, long j5, C8767m mVar, C11289a<C11079d2> aVar, int i2, int i3, int i4) {
        super(2);
        this.$color = j;
        this.$textColor = j2;
        this.$imageTint = j3;
        this.$linkImageTint = j4;
        this.$imageRes = i;
        this.$linkImageRes = num;
        this.$text = str;
        this.$linkText = str2;
        this.$linkColor = j5;
        this.$modifier = mVar;
        this.$onLinkClicked = aVar;
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
        long j = this.$color;
        long j2 = j;
        LabelComboLinkKt.m151807d(j2, this.$textColor, this.$imageTint, this.$linkImageTint, this.$imageRes, this.$linkImageRes, this.$text, this.$linkText, this.$linkColor, this.$modifier, this.$onLinkClicked, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
