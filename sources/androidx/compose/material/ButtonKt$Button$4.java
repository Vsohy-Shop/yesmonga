package androidx.compose.material;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ButtonKt$Button$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C2223i $border;
    final /* synthetic */ C3046h $colors;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ C7870j $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ C15218g4 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonKt$Button$4(C11289a<C11079d2> aVar, C8767m mVar, boolean z, C2243g gVar, C7870j jVar, C15218g4 g4Var, C2223i iVar, C3046h hVar, C2366i0 i0Var, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$onClick = aVar;
        this.$modifier = mVar;
        this.$enabled = z;
        this.$interactionSource = gVar;
        this.$elevation = jVar;
        this.$shape = g4Var;
        this.$border = iVar;
        this.$colors = hVar;
        this.$contentPadding = i0Var;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ButtonKt.m13343a(this.$onClick, this.$modifier, this.$enabled, this.$interactionSource, this.$elevation, this.$shape, this.$border, this.$colors, this.$contentPadding, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
