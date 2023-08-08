package androidx.compose.material3;

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
@C11363r0({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,491:1\n67#2,6:492\n73#2:524\n77#2:529\n75#3:498\n76#3,11:500\n89#3:528\n76#4:499\n460#5,13:511\n473#5,3:525\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$3\n*L\n220#1:492,6\n220#1:524\n220#1:529\n220#1:498\n220#1:500,11\n220#1:528\n220#1:499\n220#1:511,13\n220#1:525,3\n*E\n"})
public final class SurfaceKt$Surface$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ float $absoluteElevation;
    final /* synthetic */ C2223i $border;
    final /* synthetic */ long $color;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ C15218g4 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$3(C8767m mVar, C15218g4 g4Var, long j, float f, int i, C2223i iVar, float f2, C2243g gVar, boolean z, C11289a<C11079d2> aVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$shape = g4Var;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$$changed = i;
        this.$border = iVar;
        this.$shadowElevation = f2;
        this.$interactionSource = gVar;
        this.$enabled = z;
        this.$onClick = aVar;
        this.$content = pVar;
        this.$$changed1 = i2;
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
                ComposerKt.m29845w0(1279702876, i2, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:218)");
            }
            C8767m c = ClickableKt.m8876c(SurfaceKt.m26359h(InteractiveComponentSizeKt.m25834f(this.$modifier), this.$shape, SurfaceKt.m26360i(this.$color, this.$absoluteElevation, oVar2, (this.$$changed >> 12) & 14), this.$border, this.$shadowElevation), this.$interactionSource, C7922j.m25285e(false, 0.0f, 0, oVar, 0, 7), this.$enabled, (String) null, (C16031g) null, this.$onClick, 24, (Object) null);
            C11304p<C8592o, Integer, C11079d2> pVar = this.$content;
            int i3 = this.$$changed1;
            oVar2.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), true, oVar2, 48);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(c);
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            pVar.invoke(oVar2, Integer.valueOf(i3 & 14));
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
