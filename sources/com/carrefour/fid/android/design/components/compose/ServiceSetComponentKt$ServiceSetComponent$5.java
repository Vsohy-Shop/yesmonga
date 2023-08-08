package com.carrefour.fid.android.design.components.compose;

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
public final class ServiceSetComponentKt$ServiceSetComponent$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $displayInfo;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ C11289a<C11079d2> $onInfoClicked;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ long $subtitleColor;
    final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSetComponentKt$ServiceSetComponent$5(String str, C8767m mVar, boolean z, boolean z2, String str2, long j, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, int i, int i2) {
        super(2);
        this.$title = str;
        this.$modifier = mVar;
        this.$isSelected = z;
        this.$displayInfo = z2;
        this.$subtitle = str2;
        this.$subtitleColor = j;
        this.$onClick = aVar;
        this.$onInfoClicked = aVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ServiceSetComponentKt.m151619a(this.$title, this.$modifier, this.$isSelected, this.$displayInfo, this.$subtitle, this.$subtitleColor, this.$onClick, this.$onInfoClicked, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
