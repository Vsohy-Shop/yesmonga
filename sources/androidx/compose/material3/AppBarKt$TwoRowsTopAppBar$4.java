package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AppBarKt$TwoRowsTopAppBar$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $actions;
    final /* synthetic */ C8270q3 $colors;
    final /* synthetic */ float $maxHeight;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $navigationIcon;
    final /* synthetic */ float $pinnedHeight;
    final /* synthetic */ C8275r3 $scrollBehavior;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $smallTitle;
    final /* synthetic */ C16361p0 $smallTitleTextStyle;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $title;
    final /* synthetic */ float $titleBottomPadding;
    final /* synthetic */ C16361p0 $titleTextStyle;
    final /* synthetic */ C2354e1 $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$4(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C16361p0 p0Var, float f, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C16361p0 p0Var2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, C2354e1 e1Var, C8270q3 q3Var, float f2, float f3, C8275r3 r3Var, int i, int i2, int i3) {
        super(2);
        this.$modifier = mVar;
        this.$title = pVar;
        this.$titleTextStyle = p0Var;
        this.$titleBottomPadding = f;
        this.$smallTitle = pVar2;
        this.$smallTitleTextStyle = p0Var2;
        this.$navigationIcon = pVar3;
        this.$actions = qVar;
        this.$windowInsets = e1Var;
        this.$colors = q3Var;
        this.$maxHeight = f2;
        this.$pinnedHeight = f3;
        this.$scrollBehavior = r3Var;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8767m mVar = this.$modifier;
        C11304p<C8592o, Integer, C11079d2> pVar = this.$title;
        C16361p0 p0Var = this.$titleTextStyle;
        float f = this.$titleBottomPadding;
        C11304p<C8592o, Integer, C11079d2> pVar2 = this.$smallTitle;
        C16361p0 p0Var2 = this.$smallTitleTextStyle;
        C11304p<C8592o, Integer, C11079d2> pVar3 = this.$navigationIcon;
        C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = this.$actions;
        C2354e1 e1Var = this.$windowInsets;
        C8270q3 q3Var = this.$colors;
        float f2 = this.$maxHeight;
        float f3 = this.$pinnedHeight;
        C8275r3 r3Var = this.$scrollBehavior;
        C8767m mVar2 = mVar;
        AppBarKt.m25391k(mVar2, pVar, p0Var, f, pVar2, p0Var2, pVar3, qVar, e1Var, q3Var, f2, f3, r3Var, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
