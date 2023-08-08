package com.carrefour.fid.android.design.components.compose;

import com.carrefour.fid.android.design.components.compose.C36965b;
import com.carrefour.fid.android.design.components.utils.C37139f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CodeDigitsFieldComponentKt$CodeInput$1$1$4 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C36965b, C11079d2> $actioner;
    final /* synthetic */ List<String> $digitList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$CodeInput$1$1$4(C11300l<? super C36965b, C11079d2> lVar, List<String> list) {
        super(0);
        this.$actioner = lVar;
        this.$digitList = list;
    }

    public final void invoke() {
        this.$actioner.invoke(new C36965b.C36970e(C37139f.m152215c(CollectionsKt___CollectionsKt.m40557Q5(this.$digitList).toString())));
    }
}
