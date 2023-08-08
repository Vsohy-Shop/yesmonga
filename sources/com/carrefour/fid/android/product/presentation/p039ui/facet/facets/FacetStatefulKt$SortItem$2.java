package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
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
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.domain.models.product.Sort;
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
@C11363r0({"SMAP\nFacetStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/facets/FacetStatefulKt$SortItem$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,429:1\n68#2,5:430\n73#2:461\n77#2:467\n75#3:435\n76#3,11:437\n89#3:466\n76#4:436\n460#5,13:448\n473#5,3:463\n154#6:462\n*S KotlinDebug\n*F\n+ 1 FacetStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/facets/FacetStatefulKt$SortItem$2\n*L\n293#1:430,5\n293#1:461\n293#1:467\n293#1:435\n293#1:437,11\n293#1:466\n293#1:436\n293#1:448,13\n293#1:463,3\n295#1:462\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$SortItem$2 */
public final class FacetStatefulKt$SortItem$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ Sort $sort;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetStatefulKt$SortItem$2(Sort sort) {
        super(2);
        this.$sort = sort;
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
                ComposerKt.m29845w0(-806998658, i2, -1, "com.carrefour.fid.android.product.presentation.ui.facet.facets.SortItem.<anonymous> (FacetStateful.kt:291)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m l = SizeKt.m10112l(aVar, 0.0f, 1, (Object) null);
            C8734c i3 = C8734c.f23406a.mo17066i();
            Sort sort = this.$sort;
            oVar2.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(i3, false, oVar2, 6);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(l);
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
            C8767m m = PaddingKt.m10026m(aVar, C16483g.m74435M((float) 4), 0.0f, 2, (Object) null);
            TextKt.m14196c(sort.mo118612g(), m, C37475b.f94185a.mo114257y(), C37474a.f94133a.mo114182e(), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 48, 0, 130544);
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
