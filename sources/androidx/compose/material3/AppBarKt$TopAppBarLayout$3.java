package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AppBarKt$TopAppBarLayout$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ long $actionIconContentColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $actions;
    final /* synthetic */ float $heightPx;
    final /* synthetic */ boolean $hideTitleSemantics;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $navigationIcon;
    final /* synthetic */ long $navigationIconContentColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $title;
    final /* synthetic */ float $titleAlpha;
    final /* synthetic */ int $titleBottomPadding;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ Arrangement.C2269d $titleHorizontalArrangement;
    final /* synthetic */ C16361p0 $titleTextStyle;
    final /* synthetic */ Arrangement.C2279l $titleVerticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBarLayout$3(C8767m mVar, float f, long j, long j2, long j3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C16361p0 p0Var, float f2, Arrangement.C2279l lVar, Arrangement.C2269d dVar, int i, boolean z, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, int i2, int i3) {
        super(2);
        this.$modifier = mVar;
        this.$heightPx = f;
        this.$navigationIconContentColor = j;
        this.$titleContentColor = j2;
        this.$actionIconContentColor = j3;
        this.$title = pVar;
        this.$titleTextStyle = p0Var;
        this.$titleAlpha = f2;
        this.$titleVerticalArrangement = lVar;
        this.$titleHorizontalArrangement = dVar;
        this.$titleBottomPadding = i;
        this.$hideTitleSemantics = z;
        this.$navigationIcon = pVar2;
        this.$actions = pVar3;
        this.$$changed = i2;
        this.$$changed1 = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        C8767m mVar = this.$modifier;
        C8767m mVar2 = mVar;
        AppBarKt.m25390j(mVar2, this.$heightPx, this.$navigationIconContentColor, this.$titleContentColor, this.$actionIconContentColor, this.$title, this.$titleTextStyle, this.$titleAlpha, this.$titleVerticalArrangement, this.$titleHorizontalArrangement, this.$titleBottomPadding, this.$hideTitleSemantics, this.$navigationIcon, this.$actions, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1));
    }
}
