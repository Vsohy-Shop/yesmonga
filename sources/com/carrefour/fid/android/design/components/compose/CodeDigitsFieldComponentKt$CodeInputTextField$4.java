package com.carrefour.fid.android.design.components.compose;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CodeDigitsFieldComponentKt$CodeInputTextField$4 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ C36988h $focusRequesterDetail;
    final /* synthetic */ C11300l<String, C11079d2> $onValueChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$CodeInputTextField$4(C36988h hVar, C11300l<? super String, C11079d2> lVar) {
        super(1);
        this.$focusRequesterDetail = hVar;
        this.$onValueChange = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "number");
        C36988h hVar = this.$focusRequesterDetail;
        C11300l<String, C11079d2> lVar = this.$onValueChange;
        boolean z = true;
        if (str.length() == 1 || str.length() == 2) {
            lVar.invoke(String.valueOf(StringsKt___StringsKt.last(str)));
            if (hVar.mo112413f() != hVar.mo112411e().size() - 1) {
                hVar.mo112411e().get(hVar.mo112413f() + 1).mo42129h();
                return;
            }
            return;
        }
        if (str.length() != 0) {
            z = false;
        }
        if (z) {
            lVar.invoke(str);
        }
    }
}
