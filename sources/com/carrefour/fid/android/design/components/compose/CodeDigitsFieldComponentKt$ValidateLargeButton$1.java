package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.focus.C15068j;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CodeDigitsFieldComponentKt$ValidateLargeButton$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C15068j $focusManager;
    final /* synthetic */ C11289a<C11079d2> $onClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$ValidateLargeButton$1(C15068j jVar, C11289a<C11079d2> aVar) {
        super(0);
        this.$focusManager = jVar;
        this.$onClicked = aVar;
    }

    public final void invoke() {
        C15068j.m64745h(this.$focusManager, false, 1, (Object) null);
        this.$onClicked.invoke();
    }
}
