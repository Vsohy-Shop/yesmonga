package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.text.input.TextFieldValue;
import com.carrefour.fid.android.design.components.compose.C36995l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SearchBarComponentKt$SearchBarTextField$2$1 extends Lambda implements C11300l<TextFieldValue, C11079d2> {
    final /* synthetic */ C11300l<C36995l, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarComponentKt$SearchBarTextField$2$1(C11300l<? super C36995l, C11079d2> lVar) {
        super(1);
        this.$actioner = lVar;
    }

    /* renamed from: a */
    public final void mo112287a(@C12579k TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "newTextFieldValue");
        this.$actioner.invoke(new C36995l.C37001f(textFieldValue));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo112287a((TextFieldValue) obj);
        return C11079d2.f28267a;
    }
}
