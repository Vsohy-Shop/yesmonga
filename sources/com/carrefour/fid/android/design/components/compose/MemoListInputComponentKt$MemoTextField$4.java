package com.carrefour.fid.android.design.components.compose;

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
public final class MemoListInputComponentKt$MemoTextField$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C36990j, C11079d2> $actioner;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ TextFieldValue $textFieldValue;
    final /* synthetic */ C2411u0 $this_MemoTextField;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoListInputComponentKt$MemoTextField$4(C2411u0 u0Var, boolean z, TextFieldValue textFieldValue, FocusRequester focusRequester, C11300l<? super C36990j, C11079d2> lVar, int i) {
        super(2);
        this.$this_MemoTextField = u0Var;
        this.$isEnabled = z;
        this.$textFieldValue = textFieldValue;
        this.$focusRequester = focusRequester;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        MemoListInputComponentKt.m151536f(this.$this_MemoTextField, this.$isEnabled, this.$textFieldValue, this.$focusRequester, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
