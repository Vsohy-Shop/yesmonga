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
public final class SetServiceComponentKt$ServiceComponent$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C37014m, C11079d2> $actioner;
    final /* synthetic */ ActiveState $activeState;
    final /* synthetic */ int $basketProductCount;
    final /* synthetic */ C37018n $serviceInfo;
    final /* synthetic */ C37020p $serviceSlotState;
    final /* synthetic */ Service $serviceState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetServiceComponentKt$ServiceComponent$3(Service service, ActiveState activeState, C37020p pVar, C37018n nVar, int i, C11300l<? super C37014m, C11079d2> lVar, int i2) {
        super(2);
        this.$serviceState = service;
        this.$activeState = activeState;
        this.$serviceSlotState = pVar;
        this.$serviceInfo = nVar;
        this.$basketProductCount = i;
        this.$actioner = lVar;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SetServiceComponentKt.m151631g(this.$serviceState, this.$activeState, this.$serviceSlotState, this.$serviceInfo, this.$basketProductCount, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
