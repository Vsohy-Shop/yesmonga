package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HeaderComponentKt$NavigationHeaderSubtitle$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $headerBackgroundColor;
    final /* synthetic */ long $headerContentColor;
    final /* synthetic */ long $headerIconColor;
    final /* synthetic */ String $navigationDescription;
    final /* synthetic */ C11289a<C11079d2> $onNavigationClicked;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ String $title;
    final /* synthetic */ C16361p0 $titleStyle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderComponentKt$NavigationHeaderSubtitle$1(String str, String str2, C16361p0 p0Var, long j, long j2, long j3, String str3, C11289a<C11079d2> aVar, int i, int i2) {
        super(2);
        this.$title = str;
        this.$subtitle = str2;
        this.$titleStyle = p0Var;
        this.$headerBackgroundColor = j;
        this.$headerIconColor = j2;
        this.$headerContentColor = j3;
        this.$navigationDescription = str3;
        this.$onNavigationClicked = aVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        HeaderComponentKt.m151507l(this.$title, this.$subtitle, this.$titleStyle, this.$headerBackgroundColor, this.$headerIconColor, this.$headerContentColor, this.$navigationDescription, this.$onNavigationClicked, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
