package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.C8767m;
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
public final class SearchBarComponentKt$SearchBar$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $hint;
    final /* synthetic */ String $initText;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarClick;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarLongClick;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarScanClick;
    final /* synthetic */ C11300l<String, C11079d2> $onValidSearch;
    final /* synthetic */ C11300l<String, C11079d2> $onValueChange;
    final /* synthetic */ boolean $searchBarEnabled;
    final /* synthetic */ boolean $shouldFocusOnInit;
    final /* synthetic */ boolean $shouldShowScanIcon;
    final /* synthetic */ SearchBarVariant $variant;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarComponentKt$SearchBar$4(C8767m mVar, SearchBarVariant searchBarVariant, String str, String str2, boolean z, boolean z2, boolean z3, C11300l<? super String, C11079d2> lVar, C11300l<? super String, C11079d2> lVar2, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, int i, int i2, int i3) {
        super(2);
        this.$modifier = mVar;
        this.$variant = searchBarVariant;
        this.$hint = str;
        this.$initText = str2;
        this.$searchBarEnabled = z;
        this.$shouldFocusOnInit = z2;
        this.$shouldShowScanIcon = z3;
        this.$onValueChange = lVar;
        this.$onValidSearch = lVar2;
        this.$onSearchBarClick = aVar;
        this.$onSearchBarLongClick = aVar2;
        this.$onSearchBarScanClick = aVar3;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SearchBarComponentKt.m151597c(this.$modifier, this.$variant, this.$hint, this.$initText, this.$searchBarEnabled, this.$shouldFocusOnInit, this.$shouldShowScanIcon, this.$onValueChange, this.$onValidSearch, this.$onSearchBarClick, this.$onSearchBarLongClick, this.$onSearchBarScanClick, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
