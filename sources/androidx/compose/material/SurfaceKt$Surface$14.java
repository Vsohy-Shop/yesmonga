package androidx.compose.material;

import androidx.compose.foundation.C2104a0;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SurfaceKt$Surface$14 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C2223i $border;
    final /* synthetic */ long $color;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ float $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2104a0 $indication;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ C16031g $role;
    final /* synthetic */ C15218g4 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$14(C11289a<C11079d2> aVar, C8767m mVar, C15218g4 g4Var, long j, long j2, C2223i iVar, float f, C2243g gVar, C2104a0 a0Var, boolean z, String str, C16031g gVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, int i2, int i3) {
        super(2);
        this.$onClick = aVar;
        this.$modifier = mVar;
        this.$shape = g4Var;
        this.$color = j;
        this.$contentColor = j2;
        this.$border = iVar;
        this.$elevation = f;
        this.$interactionSource = gVar;
        this.$indication = a0Var;
        this.$enabled = z;
        this.$onClickLabel = str;
        this.$role = gVar2;
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
        C8592o oVar2 = oVar;
        C11289a<C11079d2> aVar = this.$onClick;
        C11289a<C11079d2> aVar2 = aVar;
        SurfaceKt.m13878a(aVar2, this.$modifier, this.$shape, this.$color, this.$contentColor, this.$border, this.$elevation, this.$interactionSource, this.$indication, this.$enabled, this.$onClickLabel, this.$role, this.$content, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
