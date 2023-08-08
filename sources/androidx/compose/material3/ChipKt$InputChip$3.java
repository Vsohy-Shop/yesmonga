package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ChipKt$InputChip$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $avatar;
    final /* synthetic */ C8216i2 $border;
    final /* synthetic */ C8229j2 $colors;
    final /* synthetic */ SelectableChipElevation $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$InputChip$3(boolean z, C11289a<C11079d2> aVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8767m mVar, boolean z2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, C15218g4 g4Var, C8229j2 j2Var, SelectableChipElevation selectableChipElevation, C8216i2 i2Var, C2243g gVar, int i, int i2, int i3) {
        super(2);
        this.$selected = z;
        this.$onClick = aVar;
        this.$label = pVar;
        this.$modifier = mVar;
        this.$enabled = z2;
        this.$leadingIcon = pVar2;
        this.$avatar = pVar3;
        this.$trailingIcon = pVar4;
        this.$shape = g4Var;
        this.$colors = j2Var;
        this.$elevation = selectableChipElevation;
        this.$border = i2Var;
        this.$interactionSource = gVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        boolean z = this.$selected;
        C11289a<C11079d2> aVar = this.$onClick;
        C11304p<C8592o, Integer, C11079d2> pVar = this.$label;
        C8767m mVar = this.$modifier;
        boolean z2 = this.$enabled;
        C11304p<C8592o, Integer, C11079d2> pVar2 = this.$leadingIcon;
        C11304p<C8592o, Integer, C11079d2> pVar3 = this.$avatar;
        C11304p<C8592o, Integer, C11079d2> pVar4 = this.$trailingIcon;
        C15218g4 g4Var = this.$shape;
        C8229j2 j2Var = this.$colors;
        SelectableChipElevation selectableChipElevation = this.$elevation;
        C8216i2 i2Var = this.$border;
        C2243g gVar = this.$interactionSource;
        boolean z3 = z;
        ChipKt.m25504h(z3, aVar, pVar, mVar, z2, pVar2, pVar3, pVar4, g4Var, j2Var, selectableChipElevation, i2Var, gVar, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
