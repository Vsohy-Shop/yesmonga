package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyGridKt$ScrollPositionUpdater$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C2495j $itemProvider;
    final /* synthetic */ LazyGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridKt$ScrollPositionUpdater$1(C2495j jVar, LazyGridState lazyGridState, int i) {
        super(2);
        this.$itemProvider = jVar;
        this.$state = lazyGridState;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        LazyGridKt.m11035b(this.$itemProvider, this.$state, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
