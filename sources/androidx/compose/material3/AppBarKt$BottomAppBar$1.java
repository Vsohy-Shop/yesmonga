package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$BottomAppBar$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,1664:1\n68#2,5:1665\n73#2:1696\n77#2:1701\n75#3:1670\n76#3,11:1672\n89#3:1700\n76#4:1671\n460#5,13:1683\n473#5,3:1697\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$BottomAppBar$1\n*L\n415#1:1665,5\n415#1:1696\n415#1:1701\n415#1:1670\n415#1:1672,11\n415#1:1700\n415#1:1671\n415#1:1683,13\n415#1:1697,3\n*E\n"})
public final class AppBarKt$BottomAppBar$1 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $actions;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $floatingActionButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$1(C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        super(3);
        this.$actions = qVar;
        this.$$dirty = i;
        this.$floatingActionButton = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(u0Var, "$this$BottomAppBar");
        if ((i & 14) == 0) {
            i |= oVar.mo15006n0(u0Var) ? 4 : 2;
        }
        if ((i & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1974005449, i, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:410)");
            }
            this.$actions.invoke(u0Var, oVar, Integer.valueOf((i & 14) | ((this.$$dirty << 3) & 112)));
            if (this.$floatingActionButton != null) {
                C8767m.C8768a aVar = C8767m.f23478j;
                C2428y0.m10726a(u0Var.mo7842b(aVar, 1.0f, true), oVar, 0);
                C8767m o = PaddingKt.m10028o(SizeKt.m10110j(aVar, 0.0f, 1, (Object) null), 0.0f, AppBarKt.f19158d, AppBarKt.f19157c, 0.0f, 9, (Object) null);
                C8734c C = C8734c.f23406a.mo17061C();
                C11304p<C8592o, Integer, C11079d2> pVar = this.$floatingActionButton;
                int i2 = this.$$dirty;
                oVar.mo14918M(733328855);
                C15560f0 k = BoxKt.m9849k(C, false, oVar, 6);
                oVar.mo14918M(-1323940314);
                C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(o);
                if (!(oVar.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                oVar.mo14938T();
                if (oVar.mo14997l()) {
                    oVar.mo14947W(a);
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
                f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
                oVar.mo14918M(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                pVar.invoke(oVar, Integer.valueOf((i2 >> 6) & 14));
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
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
