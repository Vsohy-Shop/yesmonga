package androidx.compose.material;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwitchKt$SwitchImpl$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ C7892p1 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2241e $interactionSource;
    final /* synthetic */ C2362h $this_SwitchImpl;
    final /* synthetic */ C8578k2<Float> $thumbValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$4(C2362h hVar, boolean z, boolean z2, C7892p1 p1Var, C8578k2<Float> k2Var, C2241e eVar, int i) {
        super(2);
        this.$this_SwitchImpl = hVar;
        this.$checked = z;
        this.$enabled = z2;
        this.$colors = p1Var;
        this.$thumbValue = k2Var;
        this.$interactionSource = eVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SwitchKt.m14059b(this.$this_SwitchImpl, this.$checked, this.$enabled, this.$colors, this.$thumbValue, this.$interactionSource, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
