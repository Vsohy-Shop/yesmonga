package androidx.compose.material;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$SliderThumb$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C3045g1 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ float $offset;
    final /* synthetic */ C2362h $this_SliderThumb;
    final /* synthetic */ float $thumbSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderThumb$2(C2362h hVar, C8767m mVar, float f, C2243g gVar, C3045g1 g1Var, boolean z, float f2, int i) {
        super(2);
        this.$this_SliderThumb = hVar;
        this.$modifier = mVar;
        this.$offset = f;
        this.$interactionSource = gVar;
        this.$colors = g1Var;
        this.$enabled = z;
        this.$thumbSize = f2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SliderKt.m13787f(this.$this_SliderThumb, this.$modifier, this.$offset, this.$interactionSource, this.$colors, this.$enabled, this.$thumbSize, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
