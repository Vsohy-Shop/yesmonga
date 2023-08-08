package androidx.compose.material;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BottomSheetScaffoldKt$BottomSheetScaffold$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $child;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ boolean $drawerGesturesEnabled;
    final /* synthetic */ long $drawerScrimColor;
    final /* synthetic */ C15218g4 $drawerShape;
    final /* synthetic */ C3043g $scaffoldState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$1(C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C3043g gVar, boolean z, C15218g4 g4Var, float f, long j, long j2, long j3, int i) {
        super(2);
        this.$drawerContent = qVar;
        this.$child = pVar;
        this.$scaffoldState = gVar;
        this.$drawerGesturesEnabled = z;
        this.$drawerShape = g4Var;
        this.$drawerElevation = f;
        this.$drawerBackgroundColor = j;
        this.$drawerContentColor = j2;
        this.$drawerScrimColor = j3;
        this.$$dirty1 = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1273816607, i2, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:379)");
            }
            if (this.$drawerContent == null) {
                oVar2.mo14918M(-249544811);
                this.$child.invoke(oVar2, 6);
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(-249544774);
                C11305q<C2373k, C8592o, Integer, C11079d2> qVar = this.$drawerContent;
                DrawerState b = this.$scaffoldState.mo10763b();
                boolean z = this.$drawerGesturesEnabled;
                C15218g4 g4Var = this.$drawerShape;
                float f = this.$drawerElevation;
                long j = this.$drawerBackgroundColor;
                long j2 = this.$drawerContentColor;
                long j3 = this.$drawerScrimColor;
                C11304p<C8592o, Integer, C11079d2> pVar = this.$child;
                int i3 = this.$$dirty1;
                DrawerKt.m13436d(qVar, (C8767m) null, b, z, g4Var, f, j, j2, j3, pVar, oVar, ((i3 >> 9) & 14) | 805306368 | ((i3 >> 3) & 7168) | ((i3 >> 3) & 57344) | ((i3 >> 3) & 458752) | ((i3 >> 3) & 3670016) | ((i3 >> 3) & 29360128) | ((i3 >> 3) & 234881024), 2);
                oVar.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
