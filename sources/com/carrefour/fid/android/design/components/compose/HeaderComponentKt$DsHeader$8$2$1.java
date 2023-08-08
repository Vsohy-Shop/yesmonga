package com.carrefour.fid.android.design.components.compose;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HeaderComponentKt$DsHeader$8$2$1 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ C11300l<String, C11079d2> $onValidSearch;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderComponentKt$DsHeader$8$2$1(C11300l<? super String, C11079d2> lVar) {
        super(1);
        this.$onValidSearch = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        C11300l<String, C11079d2> lVar = this.$onValidSearch;
        if (lVar != null) {
            lVar.invoke(str);
        }
    }
}
