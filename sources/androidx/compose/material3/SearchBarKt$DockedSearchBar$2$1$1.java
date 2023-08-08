package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
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
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$DockedSearchBar$2$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,746:1\n76#2:747\n76#2:771\n154#3:748\n36#4:749\n36#4:757\n460#4,13:783\n473#4,3:797\n1114#5,3:750\n1117#5,3:754\n1114#5,6:758\n88#6:753\n74#7,6:764\n80#7:796\n84#7:801\n75#8:770\n76#8,11:772\n89#8:800\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$DockedSearchBar$2$1$1\n*L\n391#1:747\n399#1:771\n391#1:748\n392#1:749\n395#1:757\n399#1:783,13\n399#1:797,3\n392#1:750,3\n392#1:754,3\n395#1:758,6\n393#1:753\n399#1:764,6\n399#1:796\n399#1:801\n399#1:770\n399#1:772,11\n399#1:800\n*E\n"})
public final class SearchBarKt$DockedSearchBar$2$1$1 extends Lambda implements C11305q<AnimatedVisibilityScope, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C8205g2 $colors;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$DockedSearchBar$2$1$1(C8205g2 g2Var, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, int i) {
        super(3);
        this.$colors = g2Var;
        this.$content = qVar;
        this.$$dirty1 = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo11820a(@C12579k AnimatedVisibilityScope animatedVisibilityScope, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(animatedVisibilityScope, "$this$AnimatedVisibility");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(393964167, i, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:389)");
        }
        float M = C16483g.m74435M((float) ((Configuration) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70951f())).screenHeightDp);
        C16483g w = C16483g.m74451w(M);
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(w);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = C16483g.m74451w(C16483g.m74435M(M * 0.6666667f));
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        float t0 = ((C16483g) N).mo47823t0();
        C16483g w2 = C16483g.m74451w(t0);
        oVar.mo14918M(1157296644);
        boolean n02 = oVar.mo15006n0(w2);
        Object N2 = oVar.mo14921N();
        if (n02 || N2 == C8592o.f23032a.mo16277a()) {
            N2 = C16483g.m74451w(((C16483g) C11479u.m44319D(C16483g.m74451w(SearchBarKt.m26100l()), C16483g.m74451w(t0))).mo47823t0());
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        C8767m p = SizeKt.m10116p(C8767m.f23478j, ((C16483g) N2).mo47823t0(), t0);
        C8205g2 g2Var = this.$colors;
        C11305q<C2373k, C8592o, Integer, C11079d2> qVar = this.$content;
        int i2 = this.$$dirty1;
        oVar.mo14918M(-483455358);
        C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar, 0);
        oVar.mo14918M(-1323940314);
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(p);
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
        C8592o b2 = Updater.m30180b(oVar);
        Updater.m30188j(b2, b, companion.mo44588d());
        Updater.m30188j(b2, dVar, companion.mo44586b());
        Updater.m30188j(b2, layoutDirection, companion.mo44587c());
        Updater.m30188j(b2, c4Var, companion.mo44590f());
        oVar.mo14972e();
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
        oVar.mo14918M(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
        DividerKt.m25704a((C8767m) null, 0.0f, g2Var.mo12613b(), oVar, 0, 3);
        qVar.invoke(columnScopeInstance, oVar, Integer.valueOf(((i2 >> 9) & 112) | 6));
        oVar.mo15002m0();
        oVar.mo14896D();
        oVar.mo15002m0();
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo11820a((AnimatedVisibilityScope) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
