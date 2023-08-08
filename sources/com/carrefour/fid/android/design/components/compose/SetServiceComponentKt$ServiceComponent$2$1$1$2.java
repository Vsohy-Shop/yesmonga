package com.carrefour.fid.android.design.components.compose;

import com.carrefour.fid.android.design.components.compose.C37014m;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SetServiceComponentKt$ServiceComponent$2$1$1$2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C37014m, C11079d2> $actioner;
    final /* synthetic */ Service $serviceState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetServiceComponentKt$ServiceComponent$2$1$1$2(C11300l<? super C37014m, C11079d2> lVar, Service service) {
        super(0);
        this.$actioner = lVar;
        this.$serviceState = service;
    }

    public final void invoke() {
        this.$actioner.invoke(new C37014m.C37016b(this.$serviceState));
    }
}
