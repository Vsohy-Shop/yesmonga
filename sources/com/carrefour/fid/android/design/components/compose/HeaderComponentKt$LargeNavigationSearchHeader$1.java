package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HeaderComponentKt$LargeNavigationSearchHeader$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $headerBackgroundColor;
    final /* synthetic */ long $headerContentColor;
    final /* synthetic */ long $headerIconColor;
    final /* synthetic */ String $initText;
    final /* synthetic */ String $navigationDescription;
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
    final /* synthetic */ String $title;
    final /* synthetic */ C16361p0 $titleStyle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderComponentKt$LargeNavigationSearchHeader$1(String str, C16361p0 p0Var, String str2, String str3, boolean z, boolean z2, boolean z3, long j, long j2, long j3, String str4, C11289a<C11079d2> aVar, C11300l<? super String, C11079d2> lVar, C11300l<? super String, C11079d2> lVar2, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, int i, int i2, int i3) {
        super(2);
        this.$title = str;
        this.$titleStyle = p0Var;
        this.$searchBarHint = str2;
        this.$initText = str3;
        this.$searchBarEnabled = z;
        this.$shouldFocusOnInit = z2;
        this.$shouldShowScanIcon = z3;
        this.$headerBackgroundColor = j;
        this.$headerIconColor = j2;
        this.$headerContentColor = j3;
        this.$navigationDescription = str4;
        this.$onNavigationClicked = aVar;
        this.$onValueChange = lVar;
        this.$onValidSearch = lVar2;
        this.$onSearchBarClick = aVar2;
        this.$onSearchBarLongClick = aVar3;
        this.$onSearchBarScanClick = aVar4;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        String str = this.$title;
        String str2 = str;
        HeaderComponentKt.m151500e(str2, this.$titleStyle, this.$searchBarHint, this.$initText, this.$searchBarEnabled, this.$shouldFocusOnInit, this.$shouldShowScanIcon, this.$headerBackgroundColor, this.$headerIconColor, this.$headerContentColor, this.$navigationDescription, this.$onNavigationClicked, this.$onValueChange, this.$onValidSearch, this.$onSearchBarClick, this.$onSearchBarLongClick, this.$onSearchBarScanClick, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
