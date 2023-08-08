package androidx.compose.foundation.lazy.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyLayoutKt$LazyLayout$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C2549h $itemProvider;
    final /* synthetic */ C11304p<C2552k, C16476b, C15564g0> $measurePolicy;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C2557o $prefetchState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$2(C2549h hVar, C8767m mVar, C2557o oVar, C11304p<? super C2552k, ? super C16476b, ? extends C15564g0> pVar, int i, int i2) {
        super(2);
        this.$itemProvider = hVar;
        this.$modifier = mVar;
        this.$prefetchState = oVar;
        this.$measurePolicy = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        LazyLayoutKt.m11349a(this.$itemProvider, this.$modifier, this.$prefetchState, this.$measurePolicy, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
