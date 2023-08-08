package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2366i0;
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
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.domain.interactors.coupons.C37643a;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CouponsEmptyViewComponentKt;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CouponsErrorComponentKt;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CouponsLoadingComponentKt;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.components.TabPage;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCouponsListStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/CouponsListStatefulKt$CouponsScreen$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,661:1\n68#2,5:662\n73#2:693\n77#2:698\n68#2,5:699\n73#2:730\n77#2:742\n68#2,5:743\n73#2:774\n77#2:786\n75#3:667\n76#3,11:669\n89#3:697\n75#3:704\n76#3,11:706\n89#3:741\n75#3:748\n76#3,11:750\n89#3:785\n76#4:668\n76#4:705\n76#4:749\n460#5,13:680\n473#5,3:694\n460#5,13:717\n36#5:731\n473#5,3:738\n460#5,13:761\n36#5:775\n473#5,3:782\n1114#6,6:732\n1114#6,6:776\n*S KotlinDebug\n*F\n+ 1 CouponsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/CouponsListStatefulKt$CouponsScreen$2\n*L\n243#1:662,5\n243#1:693\n243#1:698\n249#1:699,5\n249#1:730\n249#1:742\n285#1:743,5\n285#1:774\n285#1:786\n243#1:667\n243#1:669,11\n243#1:697\n249#1:704\n249#1:706,11\n249#1:741\n285#1:748\n285#1:750,11\n285#1:785\n243#1:668\n249#1:705\n285#1:749\n243#1:680,13\n243#1:694,3\n249#1:717,13\n250#1:731\n249#1:738,3\n285#1:761,13\n288#1:775\n285#1:782,3\n250#1:732,6\n288#1:776,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$2 */
public final class CouponsListStatefulKt$CouponsScreen$2 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C23843c, C11079d2> $actioner;
    final /* synthetic */ C28892e<C37643a> $couponContentState;
    final /* synthetic */ List<String> $filteredCouponsIdsSelected;
    final /* synthetic */ List<String> $loadingButtonIds;
    final /* synthetic */ C8700z0<TabPage> $selectedTab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$CouponsScreen$2(C28892e<C37643a> eVar, C8700z0<TabPage> z0Var, List<String> list, List<String> list2, C11300l<? super C23843c, C11079d2> lVar, int i) {
        super(3);
        this.$couponContentState = eVar;
        this.$selectedTab = z0Var;
        this.$filteredCouponsIdsSelected = list;
        this.$loadingButtonIds = list2;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(i0Var, "it");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-648460759, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.CouponsScreen.<anonymous> (CouponsListStateful.kt:239)");
            }
            C28892e<C37643a> eVar = this.$couponContentState;
            if (Intrinsics.areEqual((Object) eVar, (Object) C28892e.C28896d.f70785b) ? true : Intrinsics.areEqual((Object) eVar, (Object) C28892e.C28894b.f70781b)) {
                oVar2.mo14918M(-628847974);
                C8767m l = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
                C8734c i3 = C8734c.f23406a.mo17066i();
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
                CouponsLoadingComponentKt.m105651a(oVar2, 0);
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo15002m0();
            } else if (eVar instanceof C28892e.C28893a) {
                oVar2.mo14918M(-628847763);
                C8767m l2 = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
                C8734c i4 = C8734c.f23406a.mo17066i();
                C11300l<C23843c, C11079d2> lVar = this.$actioner;
                oVar2.mo14918M(733328855);
                C15560f0 k2 = BoxKt.m9849k(i4, false, oVar2, 6);
                oVar2.mo14918M(-1323940314);
                C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion2 = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a2 = companion2.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(l2);
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
                Updater.m30188j(b2, k2, companion2.mo44588d());
                Updater.m30188j(b2, dVar2, companion2.mo44586b());
                Updater.m30188j(b2, layoutDirection2, companion2.mo44587c());
                Updater.m30188j(b2, c4Var2, companion2.mo44590f());
                oVar.mo14972e();
                f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                oVar2.mo14918M(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f6046a;
                oVar2.mo14918M(1157296644);
                boolean n0 = oVar2.mo15006n0(lVar);
                Object N = oVar.mo14921N();
                if (n0 || N == C8592o.f23032a.mo16277a()) {
                    N = new CouponsListStatefulKt$CouponsScreen$2$2$1$1(lVar);
                    oVar2.mo14893C(N);
                }
                oVar.mo15002m0();
                CouponsErrorComponentKt.m105649a((C11289a) N, oVar2, 0, 0);
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo15002m0();
            } else if (eVar instanceof C28892e.C28895c) {
                oVar2.mo14918M(-628847495);
                boolean z = !((C37643a) ((C28892e.C28895c) this.$couponContentState).mo84088d()).mo114618i().isEmpty();
                boolean z2 = !((C37643a) ((C28892e.C28895c) this.$couponContentState).mo84088d()).mo114619j().isEmpty();
                boolean z3 = !((C37643a) ((C28892e.C28895c) this.$couponContentState).mo84088d()).mo114615g().isEmpty();
                if (!z || !z2) {
                    oVar2.mo14918M(-628846769);
                    if (z || z3) {
                        oVar2.mo14918M(-628846704);
                        CouponsListStatefulKt.m105536c(((C37643a) ((C28892e.C28895c) this.$couponContentState).mo84088d()).mo114618i(), ((C37643a) ((C28892e.C28895c) this.$couponContentState).mo84088d()).mo114615g(), this.$filteredCouponsIdsSelected, this.$loadingButtonIds, z3, this.$actioner, oVar, ((this.$$dirty >> 3) & 458752) | 4680);
                        oVar.mo15002m0();
                    } else if (z2) {
                        oVar2.mo14918M(-628846164);
                        CouponsListStatefulKt.m105538e(((C37643a) ((C28892e.C28895c) this.$couponContentState).mo84088d()).mo114619j(), this.$filteredCouponsIdsSelected, this.$loadingButtonIds, this.$actioner, oVar, ((this.$$dirty >> 9) & 7168) | 584);
                        oVar.mo15002m0();
                    } else {
                        oVar2.mo14918M(-628845795);
                        C8767m l3 = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
                        C8734c i5 = C8734c.f23406a.mo17066i();
                        C28892e<C37643a> eVar2 = this.$couponContentState;
                        C11300l<C23843c, C11079d2> lVar2 = this.$actioner;
                        oVar2.mo14918M(733328855);
                        C15560f0 k3 = BoxKt.m9849k(i5, false, oVar2, 6);
                        oVar2.mo14918M(-1323940314);
                        C16479d dVar3 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                        LayoutDirection layoutDirection3 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                        C15863c4 c4Var3 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.f38797m;
                        C11289a<ComposeUiNode> a3 = companion3.mo44585a();
                        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(l3);
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
                        Updater.m30188j(b3, k3, companion3.mo44588d());
                        Updater.m30188j(b3, dVar3, companion3.mo44586b());
                        Updater.m30188j(b3, layoutDirection3, companion3.mo44587c());
                        Updater.m30188j(b3, c4Var3, companion3.mo44590f());
                        oVar.mo14972e();
                        f3.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                        oVar2.mo14918M(2058660585);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f6046a;
                        boolean z4 = !((C37643a) ((C28892e.C28895c) eVar2).mo84088d()).mo114615g().isEmpty();
                        oVar2.mo14918M(1157296644);
                        boolean n02 = oVar2.mo15006n0(lVar2);
                        Object N2 = oVar.mo14921N();
                        if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                            N2 = new CouponsListStatefulKt$CouponsScreen$2$3$1$1(lVar2);
                            oVar2.mo14893C(N2);
                        }
                        oVar.mo15002m0();
                        CouponsEmptyViewComponentKt.m105646a(z4, (C11289a) N2, oVar2, 0);
                        oVar.mo15002m0();
                        oVar.mo14896D();
                        oVar.mo15002m0();
                        oVar.mo15002m0();
                        oVar.mo15002m0();
                    }
                    oVar.mo15002m0();
                } else {
                    oVar2.mo14918M(-628847161);
                    List<String> list = this.$filteredCouponsIdsSelected;
                    List<String> list2 = this.$loadingButtonIds;
                    C11300l<C23843c, C11079d2> lVar3 = this.$actioner;
                    int i6 = this.$$dirty;
                    CouponsListStatefulKt.m105537d(this.$selectedTab, (C28892e.C28895c) this.$couponContentState, list, list2, lVar3, oVar, ((i6 >> 3) & 14) | 4672 | ((i6 >> 6) & 57344));
                    oVar.mo15002m0();
                }
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(-628845292);
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
