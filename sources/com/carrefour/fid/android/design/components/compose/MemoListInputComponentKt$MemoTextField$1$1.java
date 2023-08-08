package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.text.C2775j;
import androidx.compose.p004ui.text.input.TextFieldValue;
import com.carrefour.fid.android.design.components.compose.C36990j;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MemoListInputComponentKt$MemoTextField$1$1 extends Lambda implements C11300l<C2775j, C11079d2> {
    final /* synthetic */ C11300l<C36990j, C11079d2> $actioner;
    final /* synthetic */ TextFieldValue $textFieldValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoListInputComponentKt$MemoTextField$1$1(C11300l<? super C36990j, C11079d2> lVar, TextFieldValue textFieldValue) {
        super(1);
        this.$actioner = lVar;
        this.$textFieldValue = textFieldValue;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C2775j) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C2775j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "$this$$receiver");
        this.$actioner.invoke(new C36990j.C36991a(this.$textFieldValue.mo47115i()));
    }
}
