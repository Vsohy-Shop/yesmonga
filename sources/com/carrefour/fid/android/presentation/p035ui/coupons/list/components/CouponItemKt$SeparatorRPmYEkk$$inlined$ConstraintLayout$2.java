package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
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
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.compose.C16591e;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.shared.presentation.components.shape.C28853a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$2\n+ 2 CouponItem.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponItemKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1524:1\n351#2,5:1525\n363#2,2:1563\n365#2,3:1566\n362#2:1576\n376#2:1577\n380#2:1583\n379#2:1584\n387#2:1593\n389#2,2:1627\n391#2,2:1630\n388#2,7:1633\n398#2:1645\n397#2:1646\n405#2,2:1680\n407#2,4:1683\n404#2:1694\n419#2:1695\n420#2:1701\n67#3,6:1530\n73#3:1562\n77#3:1582\n67#3,6:1594\n73#3:1626\n77#3:1644\n67#3,6:1647\n73#3:1679\n77#3:1700\n75#4:1536\n76#4,11:1538\n89#4:1581\n75#4:1600\n76#4,11:1602\n89#4:1643\n75#4:1653\n76#4,11:1655\n89#4:1699\n76#5:1537\n76#5:1601\n76#5:1654\n460#6,13:1549\n36#6:1569\n473#6,3:1578\n50#6:1585\n49#6:1586\n460#6,13:1613\n473#6,3:1640\n460#6,13:1666\n36#6:1687\n473#6,3:1696\n154#7:1565\n154#7:1629\n154#7:1632\n154#7:1682\n1114#8,6:1570\n1114#8,6:1587\n1114#8,6:1688\n*S KotlinDebug\n*F\n+ 1 CouponItem.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponItemKt\n*L\n353#1:1530,6\n353#1:1562\n353#1:1582\n379#1:1594,6\n379#1:1626\n379#1:1644\n397#1:1647,6\n397#1:1679\n397#1:1700\n353#1:1536\n353#1:1538,11\n353#1:1581\n379#1:1600\n379#1:1602,11\n379#1:1643\n397#1:1653\n397#1:1655,11\n397#1:1699\n353#1:1537\n379#1:1601\n397#1:1654\n353#1:1549,13\n367#1:1569\n353#1:1578,3\n380#1:1585\n380#1:1586\n379#1:1613,13\n379#1:1640,3\n397#1:1666,13\n410#1:1687\n397#1:1696,3\n364#1:1565\n390#1:1629\n392#1:1632\n406#1:1682\n367#1:1570,6\n380#1:1587,6\n410#1:1688,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$Separator-RPmYEkk$$inlined$ConstraintLayout$2  reason: invalid class name */
public final class CouponItemKt$SeparatorRPmYEkk$$inlined$ConstraintLayout$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ long $borderColor$inlined;
    final /* synthetic */ C11289a $onHelpersChanged;
    final /* synthetic */ ConstraintLayoutScope $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponItemKt$SeparatorRPmYEkk$$inlined$ConstraintLayout$2(ConstraintLayoutScope constraintLayoutScope, int i, C11289a aVar, long j, int i2) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$onHelpersChanged = aVar;
        this.$borderColor$inlined = j;
        this.$$dirty$inlined = i2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        float f;
        C8592o oVar2 = oVar;
        if (((i & 11) ^ 2) != 0 || !oVar.mo15011p()) {
            int G = this.$scope.mo48254G();
            this.$scope.mo48256J();
            ConstraintLayoutScope constraintLayoutScope = this.$scope;
            ConstraintLayoutScope.C16574a O = constraintLayoutScope.mo48332O();
            C16591e a = O.mo48336a();
            C16591e i2 = O.mo48344i();
            C16591e j = O.mo48345j();
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m M = constraintLayoutScope.mo48330M(aVar, a, CouponItemKt$Separator$1$1.f60031f);
            oVar2.mo14918M(733328855);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(M);
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
            C8592o b = Updater.m30180b(oVar);
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            float f3 = (float) 16;
            C8767m C = SizeKt.m10087C(aVar, C16483g.m74435M(f3));
            C37475b bVar = C37475b.f94185a;
            C8767m b2 = C8744d.m32515b(BackgroundKt.m8825d(C, bVar.mo114208E(), (C15218g4) null, 2, (Object) null));
            C15240j2 n = C15240j2.m66071n(this.$borderColor$inlined);
            oVar2.mo14918M(1157296644);
            boolean n0 = oVar2.mo15006n0(n);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                f = f3;
                N = new CouponItemKt$Separator$1$2$1$1(this.$borderColor$inlined);
                oVar2.mo14893C(N);
            } else {
                f = f3;
            }
            oVar.mo15002m0();
            CanvasKt.m8873b(b2, (C11300l) N, oVar2, 0);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            oVar2.mo14918M(511388516);
            boolean n02 = oVar2.mo15006n0(a) | oVar2.mo15006n0(j);
            Object N2 = oVar.mo14921N();
            if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                N2 = new CouponItemKt$Separator$1$3$1(a, j);
                oVar2.mo14893C(N2);
            }
            oVar.mo15002m0();
            C8767m d = BackgroundKt.m8825d(constraintLayoutScope.mo48330M(aVar, i2, (C11300l) N2), bVar.mo114231a0(), (C15218g4) null, 2, (Object) null);
            oVar2.mo14918M(733328855);
            C15560f0 k2 = BoxKt.m9849k(aVar2.mo17061C(), false, oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(d);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a3);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b3 = Updater.m30180b(oVar);
            Updater.m30188j(b3, k2, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            oVar.mo14972e();
            f4.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            BoxKt.m9839a(BackgroundKt.m8824c(SizeKt.m10114n(SizeKt.m10115o(aVar, C16483g.m74435M((float) 1)), 0.0f, 1, (Object) null), this.$borderColor$inlined, new C28853a(C16483g.m74435M((float) 12), (DefaultConstructorMarker) null)), oVar2, 0);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            C8767m M2 = constraintLayoutScope.mo48330M(aVar, j, CouponItemKt$Separator$1$5.f60032f);
            oVar2.mo14918M(733328855);
            C15560f0 k3 = BoxKt.m9849k(aVar2.mo17061C(), false, oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a4 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(M2);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a4);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b4 = Updater.m30180b(oVar);
            Updater.m30188j(b4, k3, companion.mo44588d());
            Updater.m30188j(b4, dVar3, companion.mo44586b());
            Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
            Updater.m30188j(b4, c4Var3, companion.mo44590f());
            oVar.mo14972e();
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            C8767m b5 = C8744d.m32515b(BackgroundKt.m8825d(SizeKt.m10087C(aVar, C16483g.m74435M(f)), bVar.mo114208E(), (C15218g4) null, 2, (Object) null));
            C15240j2 n2 = C15240j2.m66071n(this.$borderColor$inlined);
            oVar2.mo14918M(1157296644);
            boolean n03 = oVar2.mo15006n0(n2);
            Object N3 = oVar.mo14921N();
            if (n03 || N3 == C8592o.f23032a.mo16277a()) {
                N3 = new CouponItemKt$Separator$1$6$1$1(this.$borderColor$inlined);
                oVar2.mo14893C(N3);
            }
            oVar.mo15002m0();
            CanvasKt.m8873b(b5, (C11300l) N3, oVar2, 0);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            if (this.$scope.mo48254G() != G) {
                this.$onHelpersChanged.invoke();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
