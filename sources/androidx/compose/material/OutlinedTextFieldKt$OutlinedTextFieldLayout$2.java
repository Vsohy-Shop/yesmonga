package androidx.compose.material;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OutlinedTextFieldKt$OutlinedTextFieldLayout$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $border;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leading;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<C15104m, C11079d2> $onLabelMeasured;
    final /* synthetic */ C2366i0 $paddingValues;
    final /* synthetic */ C11305q<C8767m, C8592o, Integer, C11079d2> $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $textField;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextFieldLayout$2(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C8767m, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, boolean z, float f, C11300l<? super C15104m, C11079d2> lVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar5, C2366i0 i0Var, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$textField = pVar;
        this.$placeholder = qVar;
        this.$label = pVar2;
        this.$leading = pVar3;
        this.$trailing = pVar4;
        this.$singleLine = z;
        this.$animationProgress = f;
        this.$onLabelMeasured = lVar;
        this.$border = pVar5;
        this.$paddingValues = i0Var;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        OutlinedTextFieldKt.m13662e(this.$modifier, this.$textField, this.$placeholder, this.$label, this.$leading, this.$trailing, this.$singleLine, this.$animationProgress, this.$onLabelMeasured, this.$border, this.$paddingValues, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1));
    }
}
