package com.carrefour.fid.android.shared.extension;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FlowKt$LaunchedEffectWithLifecycle$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11908f<T> $collector;
    final /* synthetic */ C11907e<T> $flow;
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt$LaunchedEffectWithLifecycle$2(C11907e<? extends T> eVar, Lifecycle lifecycle, Lifecycle.State state, C11908f<? super T> fVar, int i, int i2) {
        super(2);
        this.$flow = eVar;
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$collector = fVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        FlowKt.m118808a(this.$flow, this.$lifecycle, this.$minActiveState, this.$collector, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
