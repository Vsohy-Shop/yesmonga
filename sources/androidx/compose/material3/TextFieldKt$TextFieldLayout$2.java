package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TextFieldKt$TextFieldLayout$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $container;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leading;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C2366i0 $paddingValues;
    final /* synthetic */ C11305q<C8767m, C8592o, Integer, C11079d2> $placeholder;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $prefix;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $suffix;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $supporting;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $textField;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextFieldLayout$2(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11305q<? super C8767m, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, C11304p<? super C8592o, ? super Integer, C11079d2> pVar5, C11304p<? super C8592o, ? super Integer, C11079d2> pVar6, boolean z, float f, C11304p<? super C8592o, ? super Integer, C11079d2> pVar7, C11304p<? super C8592o, ? super Integer, C11079d2> pVar8, C2366i0 i0Var, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$textField = pVar;
        this.$label = pVar2;
        this.$placeholder = qVar;
        this.$leading = pVar3;
        this.$trailing = pVar4;
        this.$prefix = pVar5;
        this.$suffix = pVar6;
        this.$singleLine = z;
        this.$animationProgress = f;
        this.$container = pVar7;
        this.$supporting = pVar8;
        this.$paddingValues = i0Var;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        TextFieldKt.m26656e(this.$modifier, this.$textField, this.$label, this.$placeholder, this.$leading, this.$trailing, this.$prefix, this.$suffix, this.$singleLine, this.$animationProgress, this.$container, this.$supporting, this.$paddingValues, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1));
    }
}
