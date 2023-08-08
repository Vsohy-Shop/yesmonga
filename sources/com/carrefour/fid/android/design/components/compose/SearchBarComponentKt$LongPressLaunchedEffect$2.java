package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SearchBarComponentKt$LongPressLaunchedEffect$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C36995l, C11079d2> $actioner;
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ C2243g $interactionSource;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarComponentKt$LongPressLaunchedEffect$2(C12074o0 o0Var, C2243g gVar, C11300l<? super C36995l, C11079d2> lVar, int i) {
        super(2);
        this.$coroutineScope = o0Var;
        this.$interactionSource = gVar;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SearchBarComponentKt.m151595a(this.$coroutineScope, this.$interactionSource, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
