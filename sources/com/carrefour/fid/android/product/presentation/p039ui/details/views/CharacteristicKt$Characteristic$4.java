package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.CharacteristicKt$Characteristic$4 */
public final class CharacteristicKt$Characteristic$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ List<Pair<String, String>> $data;
    final /* synthetic */ String $labelLess;
    final /* synthetic */ String $labelMore;
    final /* synthetic */ int $maxElementsWhenNotExpanded;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<Float, C11079d2> $onScrollPositionKnown;
    final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CharacteristicKt$Characteristic$4(List<Pair<String, String>> list, String str, String str2, String str3, C8767m mVar, int i, C11300l<? super Float, C11079d2> lVar, int i2, int i3) {
        super(2);
        this.$data = list;
        this.$title = str;
        this.$labelMore = str2;
        this.$labelLess = str3;
        this.$modifier = mVar;
        this.$maxElementsWhenNotExpanded = i;
        this.$onScrollPositionKnown = lVar;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CharacteristicKt.m117108a(this.$data, this.$title, this.$labelMore, this.$labelLess, this.$modifier, this.$maxElementsWhenNotExpanded, this.$onScrollPositionKnown, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
