package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$1$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,770:1\n36#2:771\n1114#3,6:772\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$1$2\n*L\n266#1:771\n266#1:772,6\n*E\n"})
public final class TooltipKt$TooltipBox$1$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ float $elevation;
    final /* synthetic */ float $maxWidth;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $tooltipContent;
    final /* synthetic */ String $tooltipPaneDescription;
    final /* synthetic */ Transition<Boolean> $transition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipKt$TooltipBox$1$2(C8767m mVar, float f, Transition<Boolean> transition, String str, C15218g4 g4Var, long j, float f2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i) {
        super(2);
        this.$modifier = mVar;
        this.$maxWidth = f;
        this.$transition = transition;
        this.$tooltipPaneDescription = str;
        this.$shape = g4Var;
        this.$containerColor = j;
        this.$elevation = f2;
        this.$tooltipContent = pVar;
        this.$$dirty = i;
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
                ComposerKt.m29845w0(-442150991, i2, -1, "androidx.compose.material3.TooltipBox.<anonymous>.<anonymous> (Tooltip.kt:256)");
            }
            C8767m i3 = TooltipKt.m26863j(SizeKt.m10091G(this.$modifier, TooltipKt.m26866m(), TooltipKt.m26865l(), this.$maxWidth, 0.0f, 8, (Object) null), this.$transition);
            String str = this.$tooltipPaneDescription;
            oVar2.mo14918M(1157296644);
            boolean n0 = oVar2.mo15006n0(str);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new TooltipKt$TooltipBox$1$2$1$1(str);
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            C8767m c = SemanticsModifierKt.m71868c(i3, false, (C11300l) N, 1, (Object) null);
            C15218g4 g4Var = this.$shape;
            long j = this.$containerColor;
            float f = this.$elevation;
            C11304p<C8592o, Integer, C11079d2> pVar = this.$tooltipContent;
            int i4 = this.$$dirty;
            SurfaceKt.m26352a(c, g4Var, j, 0, f, f, (C2223i) null, pVar, oVar, ((i4 >> 6) & 112) | ((i4 >> 9) & 896) | (57344 & (i4 >> 6)) | ((i4 >> 3) & 458752) | ((i4 << 21) & 29360128), 72);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
