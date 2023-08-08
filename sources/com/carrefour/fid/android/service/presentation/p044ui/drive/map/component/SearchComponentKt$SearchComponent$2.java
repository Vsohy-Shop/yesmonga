package com.carrefour.fid.android.service.presentation.p044ui.drive.map.component;

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
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.component.SearchComponentKt$SearchComponent$2 */
public final class SearchComponentKt$SearchComponent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11289a<C11079d2> $onClearInput;
    final /* synthetic */ C11300l<String, C11079d2> $onConfirm;
    final /* synthetic */ C11300l<String, C11079d2> $onTextChange;
    final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchComponentKt$SearchComponent$2(String str, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar, C11300l<? super String, C11079d2> lVar2, int i) {
        super(2);
        this.$text = str;
        this.$onTextChange = lVar;
        this.$onClearInput = aVar;
        this.$onConfirm = lVar2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SearchComponentKt.SearchComponent(this.$text, this.$onTextChange, this.$onClearInput, this.$onConfirm, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
