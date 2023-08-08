package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwitchKt$SwitchImpl$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ C8379z2 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2241e $interactionSource;
    final /* synthetic */ float $maxBound;
    final /* synthetic */ float $minBound;
    final /* synthetic */ C2362h $this_SwitchImpl;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $thumbContent;
    final /* synthetic */ C15218g4 $thumbShape;
    final /* synthetic */ C8578k2<Float> $thumbValue;
    final /* synthetic */ float $uncheckedThumbDiameter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$2(C2362h hVar, boolean z, boolean z2, C8379z2 z2Var, C8578k2<Float> k2Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C2241e eVar, C15218g4 g4Var, float f, float f2, float f3, int i, int i2) {
        super(2);
        this.$this_SwitchImpl = hVar;
        this.$checked = z;
        this.$enabled = z2;
        this.$colors = z2Var;
        this.$thumbValue = k2Var;
        this.$thumbContent = pVar;
        this.$interactionSource = eVar;
        this.$thumbShape = g4Var;
        this.$uncheckedThumbDiameter = f;
        this.$minBound = f2;
        this.$maxBound = f3;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SwitchKt.m26539b(this.$this_SwitchImpl, this.$checked, this.$enabled, this.$colors, this.$thumbValue, this.$thumbContent, this.$interactionSource, this.$thumbShape, this.$uncheckedThumbDiameter, this.$minBound, this.$maxBound, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1));
    }
}
