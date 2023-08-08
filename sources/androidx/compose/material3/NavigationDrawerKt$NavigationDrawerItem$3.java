package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
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
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
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
@C11363r0({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$NavigationDrawerItem$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,876:1\n154#2:877\n154#2:911\n154#2:950\n75#3,6:878\n81#3:910\n85#3:955\n75#4:884\n76#4,11:886\n75#4:918\n76#4,11:920\n89#4:948\n89#4:954\n76#5:885\n76#5:919\n460#6,13:897\n460#6,13:931\n473#6,3:945\n473#6,3:951\n67#7,6:912\n73#7:944\n77#7:949\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$NavigationDrawerItem$3\n*L\n673#1:877\n679#1:911\n686#1:950\n672#1:878,6\n672#1:910\n672#1:955\n672#1:884\n672#1:886,11\n681#1:918\n681#1:920,11\n681#1:948\n672#1:954\n672#1:885\n681#1:919\n672#1:897,13\n681#1:931,13\n681#1:945,3\n672#1:951,3\n681#1:912,6\n681#1:944\n681#1:949\n*E\n"})
public final class NavigationDrawerKt$NavigationDrawerItem$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $badge;
    final /* synthetic */ C8263p1 $colors;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $icon;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ boolean $selected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$NavigationDrawerItem$3(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8263p1 p1Var, boolean z, int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3) {
        super(2);
        this.$icon = pVar;
        this.$colors = p1Var;
        this.$selected = z;
        this.$$dirty = i;
        this.$badge = pVar2;
        this.$label = pVar3;
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
                ComposerKt.m29845w0(191488423, i2, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:670)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m o = PaddingKt.m10028o(aVar, C16483g.m74435M((float) 16), 0.0f, C16483g.m74435M((float) 24), 0.0f, 10, (Object) null);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C8734c.C8737c q = aVar2.mo17070q();
            C11304p<C8592o, Integer, C11079d2> pVar = this.$icon;
            C8263p1 p1Var = this.$colors;
            boolean z = this.$selected;
            int i3 = this.$$dirty;
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$badge;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$label;
            oVar2.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), q, oVar2, 48);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(o);
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            oVar2.mo14918M(-1538531918);
            if (pVar != null) {
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(p1Var.mo12577b(z, oVar2, ((i3 >> 3) & 14) | ((i3 >> 18) & 112)).getValue().mo42833M()))}, pVar, oVar2, ((i3 >> 9) & 112) | 8);
                C2428y0.m10726a(SizeKt.m10092H(aVar, C16483g.m74435M((float) 12)), oVar2, 6);
            }
            oVar.mo15002m0();
            C11304p<C8592o, Integer, C11079d2> pVar4 = pVar3;
            C8767m e = C2411u0.m10660e(rowScopeInstance, aVar, 1.0f, false, 2, (Object) null);
            oVar2.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(e);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a2);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b2 = Updater.m30180b(oVar);
            Updater.m30188j(b2, k, companion.mo44588d());
            Updater.m30188j(b2, dVar2, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b2, c4Var2, companion.mo44590f());
            oVar.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            int i4 = ((i3 >> 3) & 14) | ((i3 >> 18) & 112);
            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(p1Var.mo12578c(z, oVar2, i4).getValue().mo42833M()))}, pVar4, oVar2, ((i3 << 3) & 112) | 8);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            oVar2.mo14918M(-533539227);
            if (pVar2 != null) {
                C2428y0.m10726a(SizeKt.m10092H(aVar, C16483g.m74435M((float) 12)), oVar2, 6);
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(p1Var.mo12579d(z, oVar2, i4).getValue().mo42833M()))}, pVar2, oVar2, ((i3 >> 12) & 112) | 8);
            }
            oVar.mo15002m0();
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
