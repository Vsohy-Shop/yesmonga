package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16479d;
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
import com.carrefour.fid.android.R;
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
@C11363r0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$2\n+ 2 CouponsEmptyViewComponent.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponsEmptyViewComponentKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1524:1\n31#2,11:1525\n43#2,7:1565\n51#2,8:1577\n60#2,2:1617\n59#2,5:1626\n65#2:1636\n78#3,2:1536\n80#3:1564\n84#3:1576\n75#4:1538\n76#4,11:1540\n89#4:1575\n75#4:1590\n76#4,11:1592\n89#4:1634\n76#5:1539\n76#5:1591\n460#6,13:1551\n473#6,3:1572\n460#6,13:1603\n36#6:1619\n473#6,3:1631\n68#7,5:1585\n73#7:1616\n77#7:1635\n1114#8,6:1620\n*S KotlinDebug\n*F\n+ 1 CouponsEmptyViewComponent.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponsEmptyViewComponentKt\n*L\n32#1:1536,2\n32#1:1564\n32#1:1576\n32#1:1538\n32#1:1540,11\n32#1:1575\n52#1:1590\n52#1:1592,11\n52#1:1634\n32#1:1539\n52#1:1591\n32#1:1551,13\n32#1:1572,3\n52#1:1603,13\n61#1:1619\n52#1:1631,3\n52#1:1585,5\n52#1:1616\n52#1:1635\n61#1:1620,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsEmptyViewComponentKt$CouponsEmptyViewComponent$$inlined$ConstraintLayout$2 */
public final class C23873x853503 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ boolean $isShowBarCodeButtonEnabled$inlined;
    final /* synthetic */ C11289a $onHelpersChanged;
    final /* synthetic */ C11289a $onShowBarCodeClicked$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23873x853503(ConstraintLayoutScope constraintLayoutScope, int i, C11289a aVar, boolean z, C11289a aVar2, int i2) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$onHelpersChanged = aVar;
        this.$isShowBarCodeButtonEnabled$inlined = z;
        this.$onShowBarCodeClicked$inlined = aVar2;
        this.$$dirty$inlined = i2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        if (((i & 11) ^ 2) != 0 || !oVar.mo15011p()) {
            int G = this.$scope.mo48254G();
            this.$scope.mo48256J();
            ConstraintLayoutScope constraintLayoutScope = this.$scope;
            ConstraintLayoutScope.C16574a O = constraintLayoutScope.mo48332O();
            C16591e a = O.mo48336a();
            C16591e i2 = O.mo48344i();
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m M = constraintLayoutScope.mo48330M(aVar, a, CouponsEmptyViewComponentKt$CouponsEmptyViewComponent$1$1.f60033f);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C8734c.C8736b m = aVar2.mo17068m();
            Arrangement.C2271e f = Arrangement.f6010a.mo7625f();
            oVar2.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(f, m, oVar2, 54);
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
            C8592o b2 = Updater.m30180b(oVar);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_il_catalog_without_result, oVar2, 0), (String) null, (C8767m) null, (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar, 56, 124);
            C8767m.C8768a aVar3 = aVar;
            C16591e eVar = i2;
            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
            int i3 = G;
            TextKt.m14196c(C16018i.m71858d(R.string.coupons_empty_title, oVar2, 0), (C8767m) null, 0, 0, (C16190e0) null, C16209i0.f40292b.mo46948e(), (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, C20022q.C20025c.f51280k, 0, 130526);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            C8592o oVar3 = oVar;
            oVar3.mo14918M(1595967181);
            if (this.$isShowBarCodeButtonEnabled$inlined) {
                ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
                C8767m M2 = constraintLayoutScope3.mo48330M(SizeKt.m10114n(aVar3, 0.0f, 1, (Object) null), eVar, CouponsEmptyViewComponentKt$CouponsEmptyViewComponent$1$3.f60034f);
                C8734c c = aVar2.mo17063c();
                oVar3.mo14918M(733328855);
                C15560f0 k = BoxKt.m9849k(c, false, oVar3, 6);
                oVar3.mo14918M(-1323940314);
                C16479d dVar2 = (C16479d) oVar3.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) oVar3.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var2 = (C15863c4) oVar3.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a3 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(M2);
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
                C8592o b3 = Updater.m30180b(oVar);
                Updater.m30188j(b3, k, companion.mo44588d());
                Updater.m30188j(b3, dVar2, companion.mo44586b());
                Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
                Updater.m30188j(b3, c4Var2, companion.mo44590f());
                oVar.mo14972e();
                f3.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar3, 0);
                oVar3.mo14918M(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                oVar3.mo14918M(1157296644);
                boolean n0 = oVar3.mo15006n0(this.$onShowBarCodeClicked$inlined);
                Object N = oVar.mo14921N();
                if (n0 || N == C8592o.f23032a.mo16277a()) {
                    N = new CouponsEmptyViewComponentKt$CouponsEmptyViewComponent$1$4$1$1(this.$onShowBarCodeClicked$inlined);
                    oVar3.mo14893C(N);
                }
                oVar.mo15002m0();
                ShowBarCodeKt.m105664a(true, (C11289a) N, oVar3, 6);
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
            }
            oVar.mo15002m0();
            if (this.$scope.mo48254G() != i3) {
                this.$onHelpersChanged.invoke();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
