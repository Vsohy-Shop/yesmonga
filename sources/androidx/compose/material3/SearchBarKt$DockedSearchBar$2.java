package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.runtime.internal.C8553b;
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
@C11363r0({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$DockedSearchBar$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,746:1\n73#2,7:747\n80#2:780\n84#2:785\n75#3:754\n76#3,11:756\n89#3:784\n76#4:755\n460#5,13:767\n473#5,3:781\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$DockedSearchBar$2\n*L\n371#1:747,7\n371#1:780\n371#1:785\n371#1:754\n371#1:756,11\n371#1:784\n371#1:755\n371#1:767,13\n371#1:781,3\n*E\n"})
public final class SearchBarKt$DockedSearchBar$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ boolean $active;
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
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$DockedSearchBar$2(String str, C11300l<? super String, C11079d2> lVar, C11300l<? super String, C11079d2> lVar2, boolean z, C11300l<? super Boolean, C11079d2> lVar3, boolean z2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C8205g2 g2Var, C2243g gVar, int i, int i2, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar) {
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
        this.$content = qVar;
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
                ComposerKt.m29845w0(-1764436203, i2, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.kt:369)");
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
            C11305q<C2373k, C8592o, Integer, C11079d2> qVar = this.$content;
            oVar2.mo14918M(-483455358);
            C8767m.C8768a aVar = C8767m.f23478j;
            C11305q<C2373k, C8592o, Integer, C11079d2> qVar2 = qVar;
            C2243g gVar2 = gVar;
            C11304p<C8592o, Integer, C11079d2> pVar4 = pVar3;
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C11304p<C8592o, Integer, C11079d2> pVar5 = pVar2;
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11304p<C8592o, Integer, C11079d2> pVar6 = pVar;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
            boolean z3 = z2;
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
            int i5 = i3;
            SearchBarKt.m26091c(str, lVar, lVar2, z, lVar3, (C8767m) null, z3, pVar6, pVar5, pVar4, g2Var.mo12614c(), gVar2, oVar, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (1879048192 & i3), (i4 >> 6) & 112, 32);
            C11305q<C2373k, C8592o, Integer, C11079d2> qVar3 = qVar2;
            C8205g2 g2Var2 = g2Var;
            C8592o oVar3 = oVar;
            AnimatedVisibilityKt.m7741f(ColumnScopeInstance.f6049a, z, (C8767m) null, SearchBarKt.f19628q, SearchBarKt.f19629r, (String) null, C8553b.m31048b(oVar3, 393964167, true, new SearchBarKt$DockedSearchBar$2$1$1(g2Var2, qVar3, i4)), oVar, 1600518 | ((i5 >> 6) & 112), 18);
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
