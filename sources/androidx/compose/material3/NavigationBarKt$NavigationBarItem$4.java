package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NavigationBarKt$NavigationBarItem$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ C8252n1 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $icon;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ C2411u0 $this_NavigationBarItem;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$4(C2411u0 u0Var, boolean z, C11289a<C11079d2> aVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8767m mVar, boolean z2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, boolean z3, C8252n1 n1Var, C2243g gVar, int i, int i2) {
        super(2);
        this.$this_NavigationBarItem = u0Var;
        this.$selected = z;
        this.$onClick = aVar;
        this.$icon = pVar;
        this.$modifier = mVar;
        this.$enabled = z2;
        this.$label = pVar2;
        this.$alwaysShowLabel = z3;
        this.$colors = n1Var;
        this.$interactionSource = gVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        NavigationBarKt.m25911b(this.$this_NavigationBarItem, this.$selected, this.$onClick, this.$icon, this.$modifier, this.$enabled, this.$label, this.$alwaysShowLabel, this.$colors, this.$interactionSource, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
