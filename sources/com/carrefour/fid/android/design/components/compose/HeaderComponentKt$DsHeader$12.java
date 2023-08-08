package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HeaderComponentKt$DsHeader$12 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $actions;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ String $initText;
    final /* synthetic */ String $navigationDescription;
    final /* synthetic */ Painter $navigationIcon;
    final /* synthetic */ C11289a<C11079d2> $onNavigationClicked;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarClick;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarLongClick;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarScanClick;
    final /* synthetic */ C11300l<String, C11079d2> $onValidSearch;
    final /* synthetic */ C11300l<String, C11079d2> $onValueChange;
    final /* synthetic */ boolean $searchBarEnabled;
    final /* synthetic */ String $searchBarHint;
    final /* synthetic */ boolean $shouldFocusOnInit;
    final /* synthetic */ boolean $shouldShowScanIcon;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ String $title;
    final /* synthetic */ C16361p0 $titleStyle;
    final /* synthetic */ TopBarType $type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderComponentKt$DsHeader$12(String str, TopBarType topBarType, long j, long j2, long j3, C16361p0 p0Var, Painter painter, C11289a<C11079d2> aVar, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, C11300l<? super String, C11079d2> lVar, C11300l<? super String, C11079d2> lVar2, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, String str5, int i, int i2, int i3, int i4) {
        super(2);
        this.$title = str;
        this.$type = topBarType;
        this.$backgroundColor = j;
        this.$iconColor = j2;
        this.$contentColor = j3;
        this.$titleStyle = p0Var;
        this.$navigationIcon = painter;
        this.$onNavigationClicked = aVar;
        this.$navigationDescription = str2;
        this.$searchBarHint = str3;
        this.$initText = str4;
        this.$searchBarEnabled = z;
        this.$shouldFocusOnInit = z2;
        this.$shouldShowScanIcon = z3;
        this.$onValueChange = lVar;
        this.$onValidSearch = lVar2;
        this.$onSearchBarClick = aVar2;
        this.$onSearchBarLongClick = aVar3;
        this.$onSearchBarScanClick = aVar4;
        this.$actions = qVar;
        this.$subtitle = str5;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$changed2 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        String str = this.$title;
        String str2 = str;
        HeaderComponentKt.m151499d(str2, this.$type, this.$backgroundColor, this.$iconColor, this.$contentColor, this.$titleStyle, this.$navigationIcon, this.$onNavigationClicked, this.$navigationDescription, this.$searchBarHint, this.$initText, this.$searchBarEnabled, this.$shouldFocusOnInit, this.$shouldShowScanIcon, this.$onValueChange, this.$onValidSearch, this.$onSearchBarClick, this.$onSearchBarLongClick, this.$onSearchBarScanClick, this.$actions, this.$subtitle, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), C8590n1.m31123a(this.$$changed2), this.$$default);
    }
}
