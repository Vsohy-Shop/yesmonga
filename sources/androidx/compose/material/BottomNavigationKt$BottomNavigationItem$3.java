package androidx.compose.material;

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
public final class BottomNavigationKt$BottomNavigationItem$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $icon;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ long $selectedContentColor;
    final /* synthetic */ C2411u0 $this_BottomNavigationItem;
    final /* synthetic */ long $unselectedContentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigationItem$3(C2411u0 u0Var, boolean z, C11289a<C11079d2> aVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8767m mVar, boolean z2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, boolean z3, C2243g gVar, long j, long j2, int i, int i2, int i3) {
        super(2);
        this.$this_BottomNavigationItem = u0Var;
        this.$selected = z;
        this.$onClick = aVar;
        this.$icon = pVar;
        this.$modifier = mVar;
        this.$enabled = z2;
        this.$label = pVar2;
        this.$alwaysShowLabel = z3;
        this.$interactionSource = gVar;
        this.$selectedContentColor = j;
        this.$unselectedContentColor = j2;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C2411u0 u0Var = this.$this_BottomNavigationItem;
        boolean z = this.$selected;
        C11289a<C11079d2> aVar = this.$onClick;
        C11304p<C8592o, Integer, C11079d2> pVar = this.$icon;
        C8767m mVar = this.$modifier;
        boolean z2 = this.$enabled;
        C11304p<C8592o, Integer, C11079d2> pVar2 = this.$label;
        boolean z3 = this.$alwaysShowLabel;
        C2243g gVar = this.$interactionSource;
        long j = this.$selectedContentColor;
        long j2 = this.$unselectedContentColor;
        C2411u0 u0Var2 = u0Var;
        BottomNavigationKt.m13275b(u0Var2, z, aVar, pVar, mVar, z2, pVar2, z3, gVar, j, j2, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
