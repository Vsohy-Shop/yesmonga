package androidx.compose.material;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BackdropScaffoldKt$BackdropStack$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $backLayer;
    final /* synthetic */ C11300l<C16476b, C16476b> $calculateBackLayerConstraints;
    final /* synthetic */ C11306r<C16476b, Float, C8592o, Integer, C11079d2> $frontLayer;
    final /* synthetic */ C8767m $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropStack$2(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11300l<? super C16476b, C16476b> lVar, C11306r<? super C16476b, ? super Float, ? super C8592o, ? super Integer, C11079d2> rVar, int i) {
        super(2);
        this.$modifier = mVar;
        this.$backLayer = pVar;
        this.$calculateBackLayerConstraints = lVar;
        this.$frontLayer = rVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        BackdropScaffoldKt.m13223d(this.$modifier, this.$backLayer, this.$calculateBackLayerConstraints, this.$frontLayer, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
