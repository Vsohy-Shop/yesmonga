package androidx.compose.material;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DrawerKt$BottomDrawer$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ C15218g4 $drawerShape;
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ long $scrimColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$2(C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, C8767m mVar, BottomDrawerState bottomDrawerState, boolean z, C15218g4 g4Var, float f, long j, long j2, long j3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, int i2) {
        super(2);
        this.$drawerContent = qVar;
        this.$modifier = mVar;
        this.$drawerState = bottomDrawerState;
        this.$gesturesEnabled = z;
        this.$drawerShape = g4Var;
        this.$drawerElevation = f;
        this.$drawerBackgroundColor = j;
        this.$drawerContentColor = j2;
        this.$scrimColor = j3;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DrawerKt.m13433a(this.$drawerContent, this.$modifier, this.$drawerState, this.$gesturesEnabled, this.$drawerShape, this.$drawerElevation, this.$drawerBackgroundColor, this.$drawerContentColor, this.$scrimColor, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
