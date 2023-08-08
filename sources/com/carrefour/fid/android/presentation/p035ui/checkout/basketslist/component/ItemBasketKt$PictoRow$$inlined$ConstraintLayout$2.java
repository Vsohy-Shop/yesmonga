package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
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
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.compose.C16591e;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.profileinstaller.C20022q;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.C23454a;
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
@C11363r0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$2\n+ 2 ItemBasket.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/component/ItemBasketKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,1524:1\n94#2,4:1525\n102#2:1536\n103#2,7:1538\n116#2:1553\n117#2:1555\n107#2:1556\n119#2,14:1590\n136#2:1609\n135#2:1610\n141#2:1618\n142#2,2:1620\n134#2:1622\n147#2,5:1655\n146#2,8:1660\n154#2:1673\n36#3:1529\n50#3:1545\n49#3:1546\n460#3,13:1576\n473#3,3:1604\n36#3:1611\n460#3,13:1641\n473#3,3:1668\n1114#4,6:1530\n1114#4,6:1547\n1114#4,6:1612\n154#5:1537\n154#5:1554\n154#5:1619\n74#6,6:1557\n80#6:1589\n84#6:1608\n75#7:1563\n76#7,11:1565\n89#7:1607\n75#7:1628\n76#7,11:1630\n89#7:1671\n76#8:1564\n76#8:1629\n68#9,5:1623\n73#9:1654\n77#9:1672\n*S KotlinDebug\n*F\n+ 1 ItemBasket.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/component/ItemBasketKt\n*L\n97#1:1529\n109#1:1545\n109#1:1546\n107#1:1576,13\n107#1:1604,3\n136#1:1611\n134#1:1641,13\n134#1:1668,3\n97#1:1530,6\n109#1:1547,6\n136#1:1612,6\n102#1:1537\n116#1:1554\n141#1:1619\n107#1:1557,6\n107#1:1589\n107#1:1608\n107#1:1563\n107#1:1565,11\n107#1:1607\n134#1:1628\n134#1:1630,11\n134#1:1671\n107#1:1564\n134#1:1629\n134#1:1623,5\n134#1:1654\n134#1:1672\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasketKt$PictoRow$$inlined$ConstraintLayout$2 */
public final class ItemBasketKt$PictoRow$$inlined$ConstraintLayout$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C23454a $config$inlined;
    final /* synthetic */ boolean $isLoading$inlined;
    final /* synthetic */ C11289a $onHelpersChanged;
    final /* synthetic */ int $productCount$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemBasketKt$PictoRow$$inlined$ConstraintLayout$2(ConstraintLayoutScope constraintLayoutScope, int i, C11289a aVar, C23454a aVar2, boolean z, int i2) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$onHelpersChanged = aVar;
        this.$config$inlined = aVar2;
        this.$isLoading$inlined = z;
        this.$productCount$inlined = i2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2;
        C8767m.C8768a aVar;
        ConstraintLayoutScope constraintLayoutScope;
        C16591e eVar;
        C16591e eVar2;
        C8592o oVar2 = oVar;
        if (((i & 11) ^ 2) != 0 || !oVar.mo15011p()) {
            int G = this.$scope.mo48254G();
            this.$scope.mo48256J();
            ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
            ConstraintLayoutScope.C16574a O = constraintLayoutScope2.mo48332O();
            C16591e a = O.mo48336a();
            C16591e i3 = O.mo48344i();
            C16591e j = O.mo48345j();
            C8767m.C8768a aVar2 = C8767m.f23478j;
            oVar2.mo14918M(1157296644);
            boolean n0 = oVar2.mo15006n0(i3);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new ItemBasketKt$PictoRow$1$1$1(i3);
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            int i4 = G;
            C8767m.C8768a aVar3 = aVar2;
            C16591e eVar3 = j;
            C16591e eVar4 = i3;
            ImageKt.m8967b(C16015f.m71849d(this.$config$inlined.mo68695g(), oVar2, 0), (String) null, SizeKt.m10087C(constraintLayoutScope2.mo48330M(aVar2, a, (C11300l) N), C16483g.m74435M((float) 40)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar, 56, 120);
            oVar2.mo14918M(511388516);
            boolean n02 = oVar2.mo15006n0(a) | oVar2.mo15006n0(eVar3);
            Object N2 = oVar.mo14921N();
            if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                N2 = new ItemBasketKt$PictoRow$1$2$1(a, eVar3);
                oVar2.mo14893C(N2);
            }
            oVar.mo15002m0();
            C16591e eVar5 = eVar4;
            C8767m b = C37019o.m151909b(PaddingKt.m10024k(constraintLayoutScope2.mo48330M(aVar3, eVar4, (C11300l) N2), C16483g.m74435M((float) 16)), this.$isLoading$inlined, (C15218g4) null, 2, (Object) null);
            oVar2.mo14918M(-483455358);
            Arrangement.C2279l r = Arrangement.f6010a.mo7631r();
            C8734c.C8735a aVar4 = C8734c.f23406a;
            C15560f0 b2 = ColumnKt.m9863b(r, aVar4.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(b);
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
            C8592o b3 = Updater.m30180b(oVar);
            Updater.m30188j(b3, b2, companion.mo44588d());
            Updater.m30188j(b3, dVar, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection, companion.mo44587c());
            Updater.m30188j(b3, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            String i5 = this.$config$inlined.mo68698i();
            oVar2.mo14918M(-1471664635);
            if (i5 == null) {
                i2 = i4;
                eVar2 = eVar3;
                eVar = eVar5;
                constraintLayoutScope = constraintLayoutScope2;
                aVar = aVar3;
            } else {
                eVar2 = eVar3;
                eVar = eVar5;
                constraintLayoutScope = constraintLayoutScope2;
                i2 = i4;
                aVar = aVar3;
                String str = i5;
                TextKt.m14196c(str, (C8767m) null, C37475b.f94185a.mo114257y(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b)), oVar, 0, 0, 65530);
                C11079d2 d2Var = C11079d2.f28267a;
            }
            oVar.mo15002m0();
            String h = this.$config$inlined.mo68696h();
            C7933t0 t0Var = C7933t0.f19075a;
            int i6 = C7933t0.f19076b;
            C16361p0 k = t0Var.mo11077c(oVar, i6).mo11098k();
            C37475b bVar = C37475b.f94185a;
            C7933t0 t0Var2 = t0Var;
            int i7 = i6;
            TextKt.m14196c(h, (C8767m) null, bVar.mo114205B(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, k, oVar, 0, 0, 65530);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            C8592o oVar3 = oVar;
            oVar3.mo14918M(1157296644);
            C16591e eVar6 = eVar;
            boolean n03 = oVar3.mo15006n0(eVar6);
            Object N3 = oVar.mo14921N();
            if (n03 || N3 == C8592o.f23032a.mo16277a()) {
                N3 = new ItemBasketKt$PictoRow$1$4$1(eVar6);
                oVar3.mo14893C(N3);
            }
            oVar.mo15002m0();
            ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
            C8767m.C8768a aVar5 = aVar;
            C8767m c = BackgroundKt.m8824c(SizeKt.m10089E(constraintLayoutScope3.mo48330M(aVar5, eVar2, (C11300l) N3), C16483g.m74435M((float) 26), C16483g.m74435M((float) 18)), bVar.mo114206C(), C2694o.m12169k());
            C8734c i8 = aVar4.mo17066i();
            oVar3.mo14918M(733328855);
            C15560f0 k2 = BoxKt.m9849k(i8, false, oVar3, 6);
            oVar3.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar3.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar3.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar3.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(c);
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
            Updater.m30188j(b4, k2, companion.mo44588d());
            Updater.m30188j(b4, dVar2, companion.mo44586b());
            Updater.m30188j(b4, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b4, c4Var2, companion.mo44590f());
            oVar.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar3, 0);
            oVar3.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            TextKt.m14196c(String.valueOf(this.$productCount$inlined), (C8767m) null, bVar.mo114257y(), 0, (C16190e0) null, C16209i0.f40292b.mo46947c(), (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var2.mo11077c(oVar3, i7).mo11099l(), oVar, C20022q.C20025c.f51280k, 0, 64986);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            if (this.$scope.mo48254G() != i2) {
                this.$onHelpersChanged.invoke();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
