package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
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
@C11363r0({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt$BottomNavigation$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,400:1\n76#2,5:401\n81#2:432\n85#2:437\n75#3:406\n76#3,11:408\n89#3:436\n76#4:407\n460#5,13:419\n473#5,3:433\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt$BottomNavigation$1\n*L\n103#1:401,5\n103#1:432\n103#1:437\n103#1:406\n103#1:408,11\n103#1:436\n103#1:407\n103#1:419,13\n103#1:433,3\n*E\n"})
public final class BottomNavigationKt$BottomNavigation$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigation$1(C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, int i) {
        super(2);
        this.$content = qVar;
        this.$$dirty = i;
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
                ComposerKt.m29845w0(678339930, i, -1, "androidx.compose.material.BottomNavigation.<anonymous> (BottomNavigation.kt:101)");
            }
            C8767m a = SelectableGroupKt.m12057a(SizeKt.m10115o(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), BottomNavigationKt.f7540b));
            Arrangement.C2271e l = Arrangement.f6010a.mo7628l();
            C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = this.$content;
            int i2 = ((this.$$dirty >> 3) & 7168) | 48;
            oVar.mo14918M(693286680);
            int i3 = i2 >> 3;
            C15560f0 d = RowKt.m10071d(l, C8734c.f23406a.mo17073w(), oVar, (i3 & 112) | (i3 & 14));
            oVar.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(a);
            int i4 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
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
            C8592o b = Updater.m30180b(oVar);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, Integer.valueOf((i4 >> 3) & 112));
            oVar.mo14918M(2058660585);
            qVar.invoke(RowScopeInstance.f6147a, oVar, Integer.valueOf(((i2 >> 6) & 112) | 6));
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
