package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HeaderComponentKt$NavigationActionHeader$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $actions;
    final /* synthetic */ long $headerBackgroundColor;
    final /* synthetic */ long $headerContentColor;
    final /* synthetic */ long $headerIconColor;
    final /* synthetic */ String $navigationDescription;
    final /* synthetic */ C11289a<C11079d2> $onNavigationClicked;
    final /* synthetic */ String $title;
    final /* synthetic */ C16361p0 $titleStyle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderComponentKt$NavigationActionHeader$1(String str, C16361p0 p0Var, long j, long j2, long j3, String str2, C11289a<C11079d2> aVar, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$title = str;
        this.$titleStyle = p0Var;
        this.$headerBackgroundColor = j;
        this.$headerIconColor = j2;
        this.$headerContentColor = j3;
        this.$navigationDescription = str2;
        this.$onNavigationClicked = aVar;
        this.$actions = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        HeaderComponentKt.m151503h(this.$title, this.$titleStyle, this.$headerBackgroundColor, this.$headerIconColor, this.$headerContentColor, this.$navigationDescription, this.$onNavigationClicked, this.$actions, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
