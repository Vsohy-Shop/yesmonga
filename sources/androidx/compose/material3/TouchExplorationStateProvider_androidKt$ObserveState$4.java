package androidx.compose.material3;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TouchExplorationStateProvider_androidKt$ObserveState$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11300l<Lifecycle.C19372Event, C11079d2> $handleEvent;
    final /* synthetic */ C11289a<C11079d2> $onDispose;
    final /* synthetic */ Lifecycle $this_ObserveState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchExplorationStateProvider_androidKt$ObserveState$4(Lifecycle lifecycle, C11300l<? super Lifecycle.C19372Event, C11079d2> lVar, C11289a<C11079d2> aVar, int i, int i2) {
        super(2);
        this.$this_ObserveState = lifecycle;
        this.$handleEvent = lVar;
        this.$onDispose = aVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        TouchExplorationStateProvider_androidKt.m26906a(this.$this_ObserveState, this.$handleEvent, this.$onDispose, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
