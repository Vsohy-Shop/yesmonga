package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.IconKt;
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
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.text.C16260h0;
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
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.compose.ActiveState;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37475b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSetServiceComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetServiceComponent.kt\ncom/carrefour/fid/android/design/components/compose/SetServiceComponentKt$ServiceComponent$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,529:1\n74#2,6:530\n80#2:562\n84#2:655\n75#3:536\n76#3,11:538\n75#3:567\n76#3,11:569\n89#3:608\n75#3:617\n76#3,11:619\n89#3:649\n89#3:654\n76#4:537\n76#4:568\n76#4:618\n460#5,13:549\n460#5,13:580\n36#5:596\n473#5,3:605\n460#5,13:630\n473#5,3:646\n473#5,3:651\n154#6:563\n154#6:564\n154#6:594\n154#6:595\n154#6:603\n154#6:604\n154#6:610\n154#6:644\n154#6:645\n79#7,2:565\n81#7:593\n85#7:609\n75#7,6:611\n81#7:643\n85#7:650\n1114#8,6:597\n*S KotlinDebug\n*F\n+ 1 SetServiceComponent.kt\ncom/carrefour/fid/android/design/components/compose/SetServiceComponentKt$ServiceComponent$2\n*L\n101#1:530,6\n101#1:562\n101#1:655\n101#1:536\n101#1:538,11\n104#1:567\n104#1:569,11\n104#1:608\n144#1:617\n144#1:619,11\n144#1:649\n101#1:654\n101#1:537\n104#1:568\n144#1:618\n101#1:549,13\n104#1:580,13\n122#1:596\n104#1:605,3\n144#1:630,13\n144#1:646,3\n101#1:651,3\n108#1:563\n109#1:564\n113#1:594\n121#1:595\n133#1:603\n134#1:604\n147#1:610\n159#1:644\n160#1:645\n104#1:565,2\n104#1:593\n104#1:609\n144#1:611,6\n144#1:643\n144#1:650\n122#1:597,6\n*E\n"})
public final class SetServiceComponentKt$ServiceComponent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C37014m, C11079d2> $actioner;
    final /* synthetic */ ActiveState $activeState;
    final /* synthetic */ int $basketProductCount;
    final /* synthetic */ C37018n $serviceInfo;
    final /* synthetic */ C37020p $serviceSlotState;
    final /* synthetic */ Service $serviceState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetServiceComponentKt$ServiceComponent$2(ActiveState activeState, C37018n nVar, Service service, C37020p pVar, int i, C11300l<? super C37014m, C11079d2> lVar, int i2) {
        super(2);
        this.$activeState = activeState;
        this.$serviceInfo = nVar;
        this.$serviceState = service;
        this.$serviceSlotState = pVar;
        this.$basketProductCount = i;
        this.$actioner = lVar;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        Service service;
        int i2;
        ActiveState.Error error;
        Object obj;
        ActiveState activeState;
        int i3;
        boolean z;
        C8592o oVar2 = oVar;
        int i4 = i;
        if ((i4 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1397698301, i4, -1, "com.carrefour.fid.android.design.components.compose.ServiceComponent.<anonymous> (SetServiceComponent.kt:99)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            ActiveState activeState2 = this.$activeState;
            C37018n nVar = this.$serviceInfo;
            Service service2 = this.$serviceState;
            C37020p pVar = this.$serviceSlotState;
            int i5 = this.$basketProductCount;
            C11300l<C37014m, C11079d2> lVar = this.$actioner;
            int i6 = this.$$dirty;
            oVar2.mo14918M(-483455358);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2279l r = arrangement.mo7631r();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            ActiveState activeState3 = activeState2;
            C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
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
            Arrangement.C2271e l = arrangement.mo7628l();
            float f2 = (float) 16;
            C8767m o = PaddingKt.m10028o(PaddingKt.m10026m(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(f2), 0.0f, 2, (Object) null), 0.0f, C16483g.m74435M(f2), 0.0f, 0.0f, 13, (Object) null);
            C8734c.C8737c q = aVar2.mo17070q();
            oVar2.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(l, q, oVar2, 54);
            oVar2.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(o);
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
            Updater.m30188j(b3, d, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            oVar.mo14972e();
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            int i7 = i6;
            C11300l<C37014m, C11079d2> lVar2 = lVar;
            int i8 = i5;
            C37020p pVar2 = pVar;
            Service service3 = service2;
            C37018n nVar2 = nVar;
            float f4 = f2;
            ActiveState activeState4 = activeState3;
            ImageKt.m8967b(C16015f.m71849d(nVar.mo112647f(), oVar2, 0), (String) null, SizeKt.m10087C(aVar, C16483g.m74435M((float) 32)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar, 440, 120);
            ActiveState.Error error2 = ActiveState.Error.f92084a;
            if (Intrinsics.areEqual((Object) activeState4, (Object) error2)) {
                oVar2.mo14918M(1139605190);
                C8767m C = SizeKt.m10087C(aVar, C16483g.m74435M(f4));
                oVar2.mo14918M(1157296644);
                boolean n0 = oVar2.mo15006n0(lVar2);
                Object N = oVar.mo14921N();
                if (n0 || N == C8592o.f23032a.mo16277a()) {
                    N = new SetServiceComponentKt$ServiceComponent$2$1$1$1$1(lVar2);
                    oVar2.mo14893C(N);
                }
                oVar.mo15002m0();
                IconKt.m13539b(C16015f.m71849d(C36896b.C36904h.ds_ic_refresh, oVar2, 0), (String) null, ClickableKt.m8878e(C, false, (String) null, (C16031g) null, (C11289a) N, 7, (Object) null), C37475b.f94185a.mo114218O(), oVar, 56, 0);
                oVar.mo15002m0();
                service = service3;
                i2 = 8;
                activeState = activeState4;
                error = error2;
                obj = null;
            } else {
                if (activeState4 instanceof ActiveState.ActiveDataStore) {
                    z = true;
                } else {
                    z = activeState4 instanceof ActiveState.ActiveData;
                }
                if (z) {
                    oVar2.mo14918M(1139605741);
                    service = service3;
                    ActiveState activeState5 = activeState4;
                    C8767m C2 = SizeKt.m10087C(PaddingKt.m10024k(ClickableKt.m8878e(aVar, false, (String) null, (C16031g) null, new SetServiceComponentKt$ServiceComponent$2$1$1$2(lVar2, service3), 7, (Object) null), C16483g.m74435M((float) 8)), C16483g.m74435M(f4));
                    error = error2;
                    activeState = activeState5;
                    i2 = 8;
                    obj = null;
                    IconKt.m13539b(C16015f.m71849d(C36896b.C36904h.ds_ic_edit, oVar2, 0), (String) null, C2, C37475b.f94185a.mo114218O(), oVar, 56, 0);
                    oVar.mo15002m0();
                } else {
                    service = service3;
                    i2 = 8;
                    activeState = activeState4;
                    error = error2;
                    obj = null;
                    if (Intrinsics.areEqual((Object) activeState, (Object) ActiveState.Steady.f92086a)) {
                        oVar2.mo14918M(1139606303);
                        oVar.mo15002m0();
                    } else {
                        oVar2.mo14918M(1139606323);
                        oVar.mo15002m0();
                    }
                }
            }
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            float f5 = (float) i2;
            C8767m o2 = PaddingKt.m10028o(SizeKt.m10114n(aVar, 0.0f, 1, obj), C16483g.m74435M(f4), C16483g.m74435M(f5), 0.0f, 0.0f, 12, (Object) null);
            C8734c.C8737c a3 = aVar2.mo17062a();
            oVar2.mo14918M(693286680);
            C15560f0 d2 = RowKt.m10071d(arrangement.mo7630p(), a3, oVar2, 48);
            oVar2.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a4 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(o2);
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
            Updater.m30188j(b4, d2, companion.mo44588d());
            Updater.m30188j(b4, dVar3, companion.mo44586b());
            Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
            Updater.m30188j(b4, c4Var3, companion.mo44590f());
            oVar.mo14972e();
            f6.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            C37475b bVar = C37475b.f94185a;
            ActiveState.Error error3 = error;
            float f7 = f5;
            Service service4 = service;
            C8767m.C8768a aVar3 = aVar;
            TextKt.m14196c(nVar2.mo112649h(), (C8767m) null, bVar.mo114205B(), C37474a.f94133a.mo114183f(), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b).mo11098k(), oVar, 0, 0, 65522);
            C8592o oVar3 = oVar;
            oVar3.mo14918M(1424497919);
            ActiveState activeState6 = activeState;
            boolean z2 = activeState6 instanceof ActiveState.ActiveData;
            if (z2) {
                i3 = 0;
                IconKt.m13539b(C16015f.m71849d(C36896b.C36904h.ds_ic_circle_check, oVar3, 0), (String) null, SizeKt.m10087C(PaddingKt.m10028o(aVar3, C16483g.m74435M(f7), 0.0f, 0.0f, 0.0f, 14, (Object) null), C16483g.m74435M(f4)), bVar.mo114250r(), oVar, 440, 0);
            } else {
                i3 = 0;
            }
            oVar.mo15002m0();
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            if (Intrinsics.areEqual((Object) activeState6, (Object) ActiveState.Steady.f92086a)) {
                oVar3.mo14918M(1424498437);
                SetServiceComponentKt.m151632h(nVar2.mo112648g(), oVar3, i3);
                oVar.mo15002m0();
            } else if (Intrinsics.areEqual((Object) activeState6, (Object) error3)) {
                oVar3.mo14918M(1424498574);
                SetServiceComponentKt.m151633i(oVar3, i3);
                oVar.mo15002m0();
            } else if (z2) {
                oVar3.mo14918M(1424498677);
                ActiveState.ActiveData activeData = (ActiveState.ActiveData) activeState6;
                SetServiceComponentKt.m151630f(activeData.mo111926f(), activeData.mo111924e(), service4, pVar2, i8, lVar2, oVar, ((i7 << 6) & 896) | 64 | ((i7 << 3) & 7168) | (i7 & 57344) | (i7 & 458752));
                oVar.mo15002m0();
            } else if (activeState6 instanceof ActiveState.ActiveDataStore) {
                oVar3.mo14918M(1424499152);
                ActiveState.ActiveDataStore activeDataStore = (ActiveState.ActiveDataStore) activeState6;
                SetServiceComponentKt.m151628d(activeDataStore.mo111934f(), activeDataStore.mo111932e(), oVar3, i3);
                oVar.mo15002m0();
            } else {
                oVar3.mo14918M(1424499391);
                oVar.mo15002m0();
            }
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
