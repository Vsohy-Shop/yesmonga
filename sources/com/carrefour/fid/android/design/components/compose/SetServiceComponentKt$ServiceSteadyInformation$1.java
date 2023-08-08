package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SetServiceComponentKt$ServiceSteadyInformation$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $serviceSubTitle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetServiceComponentKt$ServiceSteadyInformation$1(String str, int i) {
        super(2);
        this.$serviceSubTitle = str;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SetServiceComponentKt.m151632h(this.$serviceSubTitle, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
