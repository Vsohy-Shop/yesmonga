package androidx.compose.material;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material.ripple.C7922j;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt$Surface$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,641:1\n76#2:642\n76#2:650\n67#3,6:643\n73#3:675\n77#3:680\n75#4:649\n76#4,11:651\n89#4:679\n460#5,13:662\n473#5,3:676\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt$Surface$4\n*L\n235#1:642\n228#1:650\n228#1:643,6\n228#1:675\n228#1:680\n228#1:649\n228#1:651,11\n228#1:679\n228#1:662,13\n228#1:676,3\n*E\n"})
public final class SurfaceKt$Surface$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ float $absoluteElevation;
    final /* synthetic */ C2223i $border;
    final /* synthetic */ long $color;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ float $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ C15218g4 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$4(C8767m mVar, C15218g4 g4Var, long j, float f, int i, C2223i iVar, float f2, C2243g gVar, boolean z, C11289a<C11079d2> aVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        super(2);
        this.$modifier = mVar;
        this.$shape = g4Var;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$$dirty = i;
        this.$border = iVar;
        this.$elevation = f2;
        this.$interactionSource = gVar;
        this.$enabled = z;
        this.$onClick = aVar;
        this.$content = pVar;
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
                ComposerKt.m29845w0(2031491085, i2, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:226)");
            }
            C8767m f = InteractiveComponentSizeKt.m13549f(this.$modifier);
            C15218g4 g4Var = this.$shape;
            C8767m mVar = f;
            C15218g4 g4Var2 = g4Var;
            C8767m c = ClickableKt.m8876c(SurfaceKt.m13885h(mVar, g4Var2, SurfaceKt.m13886i(this.$color, (C3041f0) oVar2.mo15032w(ElevationOverlayKt.m13498d()), this.$absoluteElevation, oVar, (this.$$dirty >> 12) & 14), this.$border, this.$elevation), this.$interactionSource, C7922j.m25285e(false, 0.0f, 0, oVar, 0, 7), this.$enabled, (String) null, (C16031g) null, this.$onClick, 24, (Object) null);
            C11304p<C8592o, Integer, C11079d2> pVar = this.$content;
            int i3 = this.$$dirty;
            oVar2.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), true, oVar2, 48);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(c);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b = Updater.m30180b(oVar);
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            pVar.invoke(oVar2, Integer.valueOf((i3 >> 27) & 14));
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
