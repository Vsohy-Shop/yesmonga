package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FlowLayoutKt$FlowColumn$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C8734c.C8736b $horizontalAlignment;
    final /* synthetic */ int $maxItemsInEachColumn;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ Arrangement.C2279l $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$FlowColumn$2(C8767m mVar, Arrangement.C2279l lVar, C8734c.C8736b bVar, int i, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, int i2, int i3) {
        super(2);
        this.$modifier = mVar;
        this.$verticalArrangement = lVar;
        this.$horizontalAlignment = bVar;
        this.$maxItemsInEachColumn = i;
        this.$content = qVar;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        FlowLayoutKt.m9893a(this.$modifier, this.$verticalArrangement, this.$horizontalAlignment, this.$maxItemsInEachColumn, this.$content, oVar, this.$$changed | 1, this.$$default);
    }
}
