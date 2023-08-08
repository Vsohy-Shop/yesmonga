package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ListItemKt$ListItem$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8187d1 $colors;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $headlineContent;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingContent;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $overlineContent;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $supportingContent;
    final /* synthetic */ float $tonalElevation;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$2(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, C11304p<? super C8592o, ? super Integer, C11079d2> pVar5, C8187d1 d1Var, float f, float f2, int i, int i2) {
        super(2);
        this.$headlineContent = pVar;
        this.$modifier = mVar;
        this.$overlineContent = pVar2;
        this.$supportingContent = pVar3;
        this.$leadingContent = pVar4;
        this.$trailingContent = pVar5;
        this.$colors = d1Var;
        this.$tonalElevation = f;
        this.$shadowElevation = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ListItemKt.m25852b(this.$headlineContent, this.$modifier, this.$overlineContent, this.$supportingContent, this.$leadingContent, this.$trailingContent, this.$colors, this.$tonalElevation, this.$shadowElevation, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
