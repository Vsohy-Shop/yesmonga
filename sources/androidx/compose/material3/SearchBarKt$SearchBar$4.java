package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.C20022q;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$4\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,746:1\n73#2,7:747\n80#2:780\n74#2,6:802\n80#2:834\n84#2:839\n84#2:844\n75#3:754\n76#3,11:756\n75#3:808\n76#3,11:810\n89#3:838\n89#3:843\n76#4:755\n76#4:809\n460#5,13:767\n25#5:781\n25#5:788\n36#5:795\n460#5,13:821\n473#5,3:835\n473#5,3:840\n1114#6,6:782\n1114#6,6:789\n1114#6,6:796\n76#7:845\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$4\n*L\n252#1:747,7\n252#1:780\n275#1:802,6\n275#1:834\n275#1:839\n252#1:844\n252#1:754\n252#1:756,11\n275#1:808\n275#1:810,11\n275#1:838\n252#1:843\n252#1:755\n275#1:809\n252#1:767,13\n253#1:781\n271#1:788\n275#1:795\n275#1:821,13\n275#1:835,3\n252#1:840,3\n253#1:782,6\n271#1:789,6\n275#1:796,6\n271#1:845\n*E\n"})
public final class SearchBarKt$SearchBar$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ boolean $active;
    final /* synthetic */ C8578k2<Float> $animationProgress;
    final /* synthetic */ C8205g2 $colors;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onActiveChange;
    final /* synthetic */ C11300l<String, C11079d2> $onQueryChange;
    final /* synthetic */ C11300l<String, C11079d2> $onSearch;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $placeholder;
    final /* synthetic */ String $query;
    final /* synthetic */ C8578k2<C16483g> $topPadding;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$4(String str, C11300l<? super String, C11079d2> lVar, C11300l<? super String, C11079d2> lVar2, boolean z, C11300l<? super Boolean, C11079d2> lVar3, boolean z2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C8205g2 g2Var, C2243g gVar, int i, int i2, C8578k2<Float> k2Var, C8578k2<C16483g> k2Var2, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar) {
        super(2);
        this.$query = str;
        this.$onQueryChange = lVar;
        this.$onSearch = lVar2;
        this.$active = z;
        this.$onActiveChange = lVar3;
        this.$enabled = z2;
        this.$placeholder = pVar;
        this.$leadingIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$colors = g2Var;
        this.$interactionSource = gVar;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$animationProgress = k2Var;
        this.$topPadding = k2Var2;
        this.$content = qVar;
    }

    /* renamed from: a */
    public static final boolean m26108a(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8578k2<Float> k2Var;
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-867266817, i2, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.kt:250)");
            }
            String str = this.$query;
            C11300l<String, C11079d2> lVar = this.$onQueryChange;
            C11300l<String, C11079d2> lVar2 = this.$onSearch;
            boolean z = this.$active;
            C11300l<Boolean, C11079d2> lVar3 = this.$onActiveChange;
            boolean z2 = this.$enabled;
            C11304p<C8592o, Integer, C11079d2> pVar = this.$placeholder;
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$leadingIcon;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$trailingIcon;
            C8205g2 g2Var = this.$colors;
            C2243g gVar = this.$interactionSource;
            int i3 = this.$$dirty;
            int i4 = this.$$dirty1;
            C8578k2<Float> k2Var2 = this.$animationProgress;
            C2243g gVar2 = gVar;
            C8578k2<C16483g> k2Var3 = this.$topPadding;
            C11304p<C8592o, Integer, C11079d2> pVar4 = pVar3;
            C11305q<C2373k, C8592o, Integer, C11079d2> qVar = this.$content;
            oVar2.mo14918M(-483455358);
            C8767m.C8768a aVar = C8767m.f23478j;
            Arrangement arrangement = Arrangement.f6010a;
            C11305q<C2373k, C8592o, Integer, C11079d2> qVar2 = qVar;
            Arrangement.C2279l r = arrangement.mo7631r();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C11304p<C8592o, Integer, C11079d2> pVar5 = pVar2;
            C11304p<C8592o, Integer, C11079d2> pVar6 = pVar;
            C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            boolean z3 = z2;
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11300l<Boolean, C11079d2> lVar4 = lVar3;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            boolean z4 = z;
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
            C11300l<String, C11079d2> lVar5 = lVar2;
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
            C8592o b2 = Updater.m30180b(oVar);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            oVar2.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            C8592o.C8593a aVar3 = C8592o.f23032a;
            if (N == aVar3.mo16277a()) {
                N = new C8185d(k2Var2, k2Var3);
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            ColumnScopeInstance columnScopeInstance2 = columnScopeInstance;
            C11305q<C2373k, C8592o, Integer, C11079d2> qVar3 = qVar2;
            C11304p<C8592o, Integer, C11079d2> pVar7 = pVar4;
            C8767m.C8768a aVar4 = aVar;
            C8578k2<Float> k2Var4 = k2Var2;
            int i5 = i4;
            C8205g2 g2Var2 = g2Var;
            SearchBarKt.m26091c(str, lVar, lVar5, z4, lVar4, PaddingKt.m10023j(aVar, (C8185d) N), z3, pVar6, pVar5, pVar7, g2Var.mo12614c(), gVar2, oVar, (i3 & 14) | C20022q.C20025c.f51280k | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (1879048192 & i3), (i4 >> 9) & 112, 0);
            C8592o oVar3 = oVar;
            oVar3.mo14918M(-492369756);
            Object N2 = oVar.mo14921N();
            if (N2 == aVar3.mo16277a()) {
                k2Var = k2Var4;
                N2 = C8415c2.m30234c(C8415c2.m30254w(), new SearchBarKt$SearchBar$4$1$showResults$2$1(k2Var));
                oVar3.mo14893C(N2);
            } else {
                k2Var = k2Var4;
            }
            oVar.mo15002m0();
            oVar3.mo14918M(551421060);
            if (m26108a((C8578k2) N2)) {
                oVar3.mo14918M(1157296644);
                boolean n0 = oVar3.mo15006n0(k2Var);
                Object N3 = oVar.mo14921N();
                if (n0 || N3 == aVar3.mo16277a()) {
                    N3 = new SearchBarKt$SearchBar$4$1$1$1(k2Var);
                    oVar3.mo14893C(N3);
                }
                oVar.mo15002m0();
                C8767m a2 = C15320t2.m66557a(aVar4, (C11300l) N3);
                oVar3.mo14918M(-483455358);
                C15560f0 b3 = ColumnKt.m9863b(arrangement.mo7631r(), aVar2.mo17072u(), oVar3, 0);
                oVar3.mo14918M(-1323940314);
                C16479d dVar2 = (C16479d) oVar3.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) oVar3.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var2 = (C15863c4) oVar3.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a3 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(a2);
                if (!(oVar.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                oVar.mo14938T();
                if (oVar.mo14997l()) {
                    oVar3.mo14947W(a3);
                } else {
                    oVar.mo14888A();
                }
                oVar.mo14941U();
                C8592o b4 = Updater.m30180b(oVar);
                Updater.m30188j(b4, b3, companion.mo44588d());
                Updater.m30188j(b4, dVar2, companion.mo44586b());
                Updater.m30188j(b4, layoutDirection2, companion.mo44587c());
                Updater.m30188j(b4, c4Var2, companion.mo44590f());
                oVar.mo14972e();
                f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar3, 0);
                oVar3.mo14918M(2058660585);
                DividerKt.m25704a((C8767m) null, 0.0f, g2Var2.mo12613b(), oVar, 0, 3);
                C11305q<C2373k, C8592o, Integer, C11079d2> qVar4 = qVar3;
                qVar4.invoke(columnScopeInstance2, oVar3, Integer.valueOf(((i5 >> 12) & 112) | 6));
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
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
