package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.C8335r;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,619:1\n154#2:620\n154#2:621\n79#3,2:622\n81#3:650\n85#3:655\n75#4:624\n76#4,11:626\n89#4:654\n76#5:625\n460#6,13:637\n473#6,3:651\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5\n*L\n359#1:620\n360#1:621\n362#1:622,2\n362#1:650\n362#1:655\n362#1:624\n362#1:626,11\n362#1:654\n362#1:625\n362#1:637,13\n362#1:651,3\n*E\n"})
public final class FloatingActionButtonKt$ExtendedFloatingActionButton$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $icon;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$ExtendedFloatingActionButton$5(boolean z, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2) {
        super(2);
        this.$expanded = z;
        this.$icon = pVar;
        this.$$dirty = i;
        this.$text = pVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        float f;
        float f2;
        float f3;
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1172118032, i2, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:357)");
            }
            if (this.$expanded) {
                f = FloatingActionButtonKt.f19428a;
            } else {
                f = C16483g.m74435M((float) 0);
            }
            float f4 = f;
            if (this.$expanded) {
                f2 = FloatingActionButtonKt.f19430c;
            } else {
                f2 = C16483g.m74435M((float) 0);
            }
            float f5 = f2;
            C8767m.C8768a aVar = C8767m.f23478j;
            if (this.$expanded) {
                f3 = FloatingActionButtonKt.f19431d;
            } else {
                f3 = C8335r.f21976a.mo14329e();
            }
            C8767m o = PaddingKt.m10028o(SizeKt.m10091G(aVar, f3, 0.0f, 0.0f, 0.0f, 14, (Object) null), f4, 0.0f, f5, 0.0f, 10, (Object) null);
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            Arrangement.C2269d p = this.$expanded ? Arrangement.f6010a.mo7630p() : Arrangement.f6010a.mo7625f();
            C11304p<C8592o, Integer, C11079d2> pVar = this.$icon;
            int i3 = this.$$dirty;
            boolean z = this.$expanded;
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$text;
            oVar2.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(p, q, oVar2, 48);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(o);
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
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f6.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            pVar.invoke(oVar2, Integer.valueOf((i3 >> 3) & 14));
            AnimatedVisibilityKt.m7743h(rowScopeInstance, z, (C8767m) null, FloatingActionButtonKt.f19433f, FloatingActionButtonKt.f19432e, (String) null, C8553b.m31048b(oVar2, 176242764, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1(pVar2, i3)), oVar, 1600518 | ((i3 >> 9) & 112), 18);
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
