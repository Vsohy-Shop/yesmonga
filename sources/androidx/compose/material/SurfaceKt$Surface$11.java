package androidx.compose.material;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SurfaceKt$Surface$11 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C2223i $border;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ long $color;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ float $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onCheckedChange;
    final /* synthetic */ C15218g4 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$11(boolean z, C11300l<? super Boolean, C11079d2> lVar, C8767m mVar, boolean z2, C15218g4 g4Var, long j, long j2, C2223i iVar, float f, C2243g gVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, int i2, int i3) {
        super(2);
        this.$checked = z;
        this.$onCheckedChange = lVar;
        this.$modifier = mVar;
        this.$enabled = z2;
        this.$shape = g4Var;
        this.$color = j;
        this.$contentColor = j2;
        this.$border = iVar;
        this.$elevation = f;
        this.$interactionSource = gVar;
        this.$content = pVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        boolean z = this.$checked;
        C11300l<Boolean, C11079d2> lVar = this.$onCheckedChange;
        C8767m mVar = this.$modifier;
        boolean z2 = this.$enabled;
        C15218g4 g4Var = this.$shape;
        long j = this.$color;
        long j2 = this.$contentColor;
        C2223i iVar = this.$border;
        float f = this.$elevation;
        C2243g gVar = this.$interactionSource;
        C11304p<C8592o, Integer, C11079d2> pVar = this.$content;
        boolean z3 = z;
        SurfaceKt.m13882e(z3, lVar, mVar, z2, g4Var, j, j2, iVar, f, gVar, pVar, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
