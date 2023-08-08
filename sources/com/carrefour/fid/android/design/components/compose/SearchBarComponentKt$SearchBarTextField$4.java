package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SearchBarComponentKt$SearchBarTextField$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C36995l, C11079d2> $actioner;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ String $hint;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ boolean $searchBarEnabled;
    final /* synthetic */ TextFieldValue $textFieldValue;
    final /* synthetic */ C2411u0 $this_SearchBarTextField;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarComponentKt$SearchBarTextField$4(C2411u0 u0Var, TextFieldValue textFieldValue, String str, boolean z, FocusRequester focusRequester, C2243g gVar, C11300l<? super C36995l, C11079d2> lVar, int i) {
        super(2);
        this.$this_SearchBarTextField = u0Var;
        this.$textFieldValue = textFieldValue;
        this.$hint = str;
        this.$searchBarEnabled = z;
        this.$focusRequester = focusRequester;
        this.$interactionSource = gVar;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SearchBarComponentKt.m151602h(this.$this_SearchBarTextField, this.$textFieldValue, this.$hint, this.$searchBarEnabled, this.$focusRequester, this.$interactionSource, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
