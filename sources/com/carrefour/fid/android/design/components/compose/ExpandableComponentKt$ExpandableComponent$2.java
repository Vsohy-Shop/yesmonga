package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ExpandableComponentKt$ExpandableComponent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $collapseButtonIcon;
    final /* synthetic */ C11306r<C2373k, Boolean, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ boolean $defaultExpandValue;
    final /* synthetic */ C8734c.C8736b $expandButtonHorizontalAlignment;
    final /* synthetic */ int $expandButtonIcon;
    final /* synthetic */ ExpandButtonPosition $expandButtonPosition;
    final /* synthetic */ String $labelLess;
    final /* synthetic */ String $labelMore;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onMoreOrLessComponentClicked;
    final /* synthetic */ boolean $shouldShowExpandButton;
    final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableComponentKt$ExpandableComponent$2(String str, String str2, String str3, C8767m mVar, boolean z, boolean z2, C8734c.C8736b bVar, ExpandButtonPosition expandButtonPosition, int i, int i2, C11300l<? super Boolean, C11079d2> lVar, C11306r<? super C2373k, ? super Boolean, ? super C8592o, ? super Integer, C11079d2> rVar, int i3, int i4, int i5) {
        super(2);
        this.$title = str;
        this.$labelMore = str2;
        this.$labelLess = str3;
        this.$modifier = mVar;
        this.$shouldShowExpandButton = z;
        this.$defaultExpandValue = z2;
        this.$expandButtonHorizontalAlignment = bVar;
        this.$expandButtonPosition = expandButtonPosition;
        this.$expandButtonIcon = i;
        this.$collapseButtonIcon = i2;
        this.$onMoreOrLessComponentClicked = lVar;
        this.$content = rVar;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ExpandableComponentKt.m151485a(this.$title, this.$labelMore, this.$labelLess, this.$modifier, this.$shouldShowExpandButton, this.$defaultExpandValue, this.$expandButtonHorizontalAlignment, this.$expandButtonPosition, this.$expandButtonIcon, this.$collapseButtonIcon, this.$onMoreOrLessComponentClicked, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
