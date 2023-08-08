package com.carrefour.fid.android.checkout.presentation.p071ui.basket.component;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16031g;
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
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.checkout.C39805b;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import com.carrefour.fid.android.shared.extension.C28782t;
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
@C11363r0({"SMAP\nCheckoutSummary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutSummary.kt\ncom/carrefour/fid/android/checkout/presentation/ui/basket/component/CheckoutSummaryKt$CheckoutSummary$2$7\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,327:1\n74#2,7:328\n81#2:361\n85#2:375\n75#3:335\n76#3,11:337\n89#3:374\n76#4:336\n460#5,13:348\n36#5:364\n473#5,3:371\n154#6:362\n154#6:363\n1114#7,6:365\n*S KotlinDebug\n*F\n+ 1 CheckoutSummary.kt\ncom/carrefour/fid/android/checkout/presentation/ui/basket/component/CheckoutSummaryKt$CheckoutSummary$2$7\n*L\n163#1:328,7\n163#1:361\n163#1:375\n163#1:335\n163#1:337,11\n163#1:374\n163#1:336\n163#1:348,13\n174#1:364\n163#1:371,3\n172#1:362\n173#1:363\n174#1:365,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$7 */
public final class CheckoutSummaryKt$CheckoutSummary$2$7 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ BasketReturnableBags $returnableBags;
    final /* synthetic */ C8700z0<Boolean> $showReturnableBagsInformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutSummaryKt$CheckoutSummary$2$7(BasketReturnableBags basketReturnableBags, C8700z0<Boolean> z0Var) {
        super(2);
        this.$returnableBags = basketReturnableBags;
        this.$showReturnableBagsInformation = z0Var;
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
                ComposerKt.m29845w0(-686930086, i2, -1, "com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummary.<anonymous>.<anonymous> (CheckoutSummary.kt:161)");
            }
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            C8700z0<Boolean> z0Var = this.$showReturnableBagsInformation;
            oVar2.mo14918M(693286680);
            C8767m.C8768a aVar = C8767m.f23478j;
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), q, oVar2, 48);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
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
            String d2 = C16018i.m71858d(C39805b.C39823r.checkout_summary_returnable_bags_title, oVar2, 0);
            C7933t0 t0Var = C7933t0.f19075a;
            int i3 = C7933t0.f19076b;
            C16361p0 C = C37477d.m153876C(t0Var.mo11077c(oVar2, i3));
            C37475b bVar = C37475b.f94185a;
            C7933t0 t0Var2 = t0Var;
            int i4 = i3;
            TextKt.m14196c(d2, (C8767m) null, bVar.mo114207D(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C, oVar, 0, 0, 65530);
            C8767m C2 = SizeKt.m10087C(PaddingKt.m10028o(aVar, C16483g.m74435M((float) 8), 0.0f, 0.0f, 0.0f, 14, (Object) null), C16483g.m74435M((float) 20));
            C8592o oVar3 = oVar;
            oVar3.mo14918M(1157296644);
            C8700z0<Boolean> z0Var2 = z0Var;
            boolean n0 = oVar3.mo15006n0(z0Var2);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new CheckoutSummaryKt$CheckoutSummary$2$7$1$1$1(z0Var2);
                oVar3.mo14893C(N);
            }
            oVar.mo15002m0();
            IconKt.m13539b(C16015f.m71849d(C39805b.C39813h.ic_info_blue, oVar3, 0), "Information", ClickableKt.m8878e(C2, false, (String) null, (C16031g) null, (C11289a) N, 7, (Object) null), bVar.mo114245m(), oVar, 56, 0);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            TextKt.m14196c(C16018i.m71859e(C39805b.C39823r.checkout_summary_returnable_bags_text, new Object[]{Integer.valueOf(this.$returnableBags.mo116962e()), C28782t.m119105b(Double.valueOf(this.$returnableBags.mo116964f()))}, oVar3, 64), (C8767m) null, bVar.mo114207D(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153876C(t0Var2.mo11077c(oVar3, i4)), oVar, 0, 0, 65530);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
