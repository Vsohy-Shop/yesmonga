package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwitchComponentKt$SwitchComponent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isOn;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onSwitch;
    final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchComponentKt$SwitchComponent$2(boolean z, String str, C11300l<? super Boolean, C11079d2> lVar, int i, int i2) {
        super(2);
        this.$isOn = z;
        this.$text = str;
        this.$onSwitch = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SwitchComponentKt.m151651a(this.$isOn, this.$text, this.$onSwitch, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}