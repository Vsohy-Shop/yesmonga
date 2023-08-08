package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SelectionContainerKt$SelectionContainer$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $children;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<C2830i, C11079d2> $onSelectionChange;
    final /* synthetic */ C2830i $selection;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$5(C8767m mVar, C2830i iVar, C11300l<? super C2830i, C11079d2> lVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$selection = iVar;
        this.$onSelectionChange = lVar;
        this.$children = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SelectionContainerKt.m12696b(this.$modifier, this.$selection, this.$onSelectionChange, this.$children, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
