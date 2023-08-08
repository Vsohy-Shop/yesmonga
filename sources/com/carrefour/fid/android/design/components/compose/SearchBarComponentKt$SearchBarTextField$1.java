package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.text.C2775j;
import androidx.compose.p004ui.focus.C15068j;
import androidx.compose.p004ui.text.input.TextFieldValue;
import com.carrefour.fid.android.design.components.compose.C36995l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SearchBarComponentKt$SearchBarTextField$1 extends Lambda implements C11300l<C2775j, C11079d2> {
    final /* synthetic */ C11300l<C36995l, C11079d2> $actioner;
    final /* synthetic */ C15068j $focusManager;
    final /* synthetic */ TextFieldValue $textFieldValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarComponentKt$SearchBarTextField$1(C11300l<? super C36995l, C11079d2> lVar, TextFieldValue textFieldValue, C15068j jVar) {
        super(1);
        this.$actioner = lVar;
        this.$textFieldValue = textFieldValue;
        this.$focusManager = jVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C2775j) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C2775j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "$this$$receiver");
        this.$actioner.invoke(new C36995l.C37000e(this.$textFieldValue.mo47115i()));
        C15068j.m64745h(this.$focusManager, false, 1, (Object) null);
    }
}
