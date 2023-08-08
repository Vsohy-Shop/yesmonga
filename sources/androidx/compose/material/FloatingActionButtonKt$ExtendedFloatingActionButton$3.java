package androidx.compose.material;

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
public final class FloatingActionButtonKt$ExtendedFloatingActionButton$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C7884n0 $elevation;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $icon;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$ExtendedFloatingActionButton$3(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11289a<C11079d2> aVar, C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C2243g gVar, C15218g4 g4Var, long j, long j2, C7884n0 n0Var, int i, int i2) {
        super(2);
        this.$text = pVar;
        this.$onClick = aVar;
        this.$modifier = mVar;
        this.$icon = pVar2;
        this.$interactionSource = gVar;
        this.$shape = g4Var;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$elevation = n0Var;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        FloatingActionButtonKt.m13531a(this.$text, this.$onClick, this.$modifier, this.$icon, this.$interactionSource, this.$shape, this.$backgroundColor, this.$contentColor, this.$elevation, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
