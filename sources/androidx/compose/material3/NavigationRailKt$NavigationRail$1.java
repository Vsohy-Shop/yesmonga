package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.C8314j0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
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
@C11363r0({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRail$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,668:1\n78#2,2:669\n80#2:697\n84#2:702\n75#3:671\n76#3,11:673\n89#3:701\n76#4:672\n460#5,13:684\n473#5,3:698\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRail$1\n*L\n114#1:669,2\n114#1:697\n114#1:702\n114#1:671\n114#1:673,11\n114#1:701\n114#1:672\n114#1:684,13\n114#1:698,3\n*E\n"})
public final class NavigationRailKt$NavigationRail$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $header;
    final /* synthetic */ C2354e1 $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRail$1(C2354e1 e1Var, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, int i, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar2) {
        super(2);
        this.$windowInsets = e1Var;
        this.$header = qVar;
        this.$$dirty = i;
        this.$content = qVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2092683357, i, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:112)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m a = SelectableGroupKt.m12057a(PaddingKt.m10026m(SizeKt.m10094J(WindowInsetsPaddingKt.m10247g(SizeKt.m10110j(aVar, 0.0f, 1, (Object) null), this.$windowInsets), C8314j0.f21426a.mo13833p(), 0.0f, 2, (Object) null), 0.0f, NavigationRailKt.m25975p(), 1, (Object) null));
            C8734c.C8736b m = C8734c.f23406a.mo17068m();
            Arrangement.C2271e z = Arrangement.f6010a.mo7638z(NavigationRailKt.m25975p());
            C11305q<C2373k, C8592o, Integer, C11079d2> qVar = this.$header;
            int i2 = this.$$dirty;
            C11305q<C2373k, C8592o, Integer, C11079d2> qVar2 = this.$content;
            oVar.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(z, m, oVar, 54);
            oVar.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(a);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar.mo14947W(a2);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b2 = Updater.m30180b(oVar);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
            oVar.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            oVar.mo14918M(716053607);
            if (qVar != null) {
                qVar.invoke(columnScopeInstance, oVar, Integer.valueOf(((i2 >> 6) & 112) | 6));
                C2428y0.m10726a(SizeKt.m10115o(aVar, NavigationRailKt.f19518f), oVar, 6);
            }
            oVar.mo15002m0();
            qVar2.invoke(columnScopeInstance, oVar, Integer.valueOf(((i2 >> 12) & 112) | 6));
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
