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
public final class FlowLayoutKt$FlowRow$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ Arrangement.C2269d $horizontalArrangement;
    final /* synthetic */ int $maxItemsInEachRow;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C8734c.C8737c $verticalAlignment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$FlowRow$2(C8767m mVar, Arrangement.C2269d dVar, C8734c.C8737c cVar, int i, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, int i2, int i3) {
        super(2);
        this.$modifier = mVar;
        this.$horizontalArrangement = dVar;
        this.$verticalAlignment = cVar;
        this.$maxItemsInEachRow = i;
        this.$content = qVar;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        FlowLayoutKt.m9894b(this.$modifier, this.$horizontalArrangement, this.$verticalAlignment, this.$maxItemsInEachRow, this.$content, oVar, this.$$changed | 1, this.$$default);
    }
}
