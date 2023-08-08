package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderDefaults$Thumb$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8258o2 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ long $thumbSize;
    final /* synthetic */ SliderDefaults $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Thumb$2(SliderDefaults sliderDefaults, C2243g gVar, C8767m mVar, C8258o2 o2Var, boolean z, long j, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = sliderDefaults;
        this.$interactionSource = gVar;
        this.$modifier = mVar;
        this.$colors = o2Var;
        this.$enabled = z;
        this.$thumbSize = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        this.$tmp0_rcvr.mo11876a(this.$interactionSource, this.$modifier, this.$colors, this.$enabled, this.$thumbSize, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
