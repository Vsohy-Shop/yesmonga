package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

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
import androidx.compose.p004ui.res.C16018i;
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
import com.carrefour.fid.android.design.components.compose.MessageComponentKt;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummaryAction;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryState;
import com.carrefour.fid.android.shared.type.C28892e;
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
@C11363r0({"SMAP\nDeliverySummaryStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliverySummaryStateful.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/DeliverySummaryStatefulKt$DeliverySummaryScreen$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,298:1\n36#2:299\n460#2,13:325\n473#2,3:339\n1114#3,6:300\n67#4,6:306\n73#4:338\n77#4:343\n75#5:312\n76#5,11:314\n89#5:342\n76#6:313\n*S KotlinDebug\n*F\n+ 1 DeliverySummaryStateful.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/DeliverySummaryStatefulKt$DeliverySummaryScreen$3\n*L\n153#1:299\n165#1:325,13\n165#1:339,3\n153#1:300,6\n165#1:306,6\n165#1:338\n165#1:343\n165#1:312\n165#1:314,11\n165#1:342\n165#1:313\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryScreen$3 */
public final class DeliverySummaryStatefulKt$DeliverySummaryScreen$3 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<DeliverySummaryAction, C11079d2> $actioner;
    final /* synthetic */ Address $address;
    final /* synthetic */ DeliveryType $deliveryType;
    final /* synthetic */ boolean $displayExitDialog;
    final /* synthetic */ C28892e<String> $minOrderAmountState;
    final /* synthetic */ DeliverySummaryState $state;
    final /* synthetic */ C28892e<StoreService> $storeServiceState;
    final /* synthetic */ C28892e<C11079d2> $validationState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryStatefulKt$DeliverySummaryScreen$3(DeliverySummaryState deliverySummaryState, C11300l<? super DeliverySummaryAction, C11079d2> lVar, int i, C28892e<StoreService> eVar, C28892e<String> eVar2, C28892e<C11079d2> eVar3, DeliveryType deliveryType, Address address, boolean z) {
        super(3);
        this.$state = deliverySummaryState;
        this.$actioner = lVar;
        this.$$dirty = i;
        this.$storeServiceState = eVar;
        this.$minOrderAmountState = eVar2;
        this.$validationState = eVar3;
        this.$deliveryType = deliveryType;
        this.$address = address;
        this.$displayExitDialog = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(i0Var, "it");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-532624141, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryScreen.<anonymous> (DeliverySummaryStateful.kt:147)");
            }
            C28892e<C11079d2> globalState = this.$state.getGlobalState();
            if (globalState instanceof C28892e.C28893a) {
                oVar.mo14918M(-801373639);
                C28892e<C11079d2> globalState2 = this.$state.getGlobalState();
                Intrinsics.checkNotNull(globalState2, "null cannot be cast to non-null type com.carrefour.fid.android.shared.type.ResultState.Error");
                if (((C28892e.C28893a) globalState2).mo84083d() instanceof IllegalArgumentException) {
                    oVar.mo14918M(-801373510);
                    MessageComponentKt.m151549f((C8767m) null, C16018i.m71858d(C28330R.string.general_error_parameters_server_not_responding_01, oVar, 0), (C11289a<C11079d2>) null, oVar, 0, 5);
                    oVar.mo15002m0();
                } else {
                    oVar.mo14918M(-801373372);
                    C11300l<DeliverySummaryAction, C11079d2> lVar = this.$actioner;
                    oVar.mo14918M(1157296644);
                    boolean n0 = oVar.mo15006n0(lVar);
                    Object N = oVar.mo14921N();
                    if (n0 || N == C8592o.f23032a.mo16277a()) {
                        N = new DeliverySummaryStatefulKt$DeliverySummaryScreen$3$1$1(lVar);
                        oVar.mo14893C(N);
                    }
                    oVar.mo15002m0();
                    MessageComponentKt.m151549f((C8767m) null, (String) null, (C11289a) N, oVar, 0, 3);
                    oVar.mo15002m0();
                }
                oVar.mo15002m0();
            } else if (globalState instanceof C28892e.C28895c) {
                oVar.mo14918M(-801373239);
                C28892e<StoreService> eVar = this.$storeServiceState;
                Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type com.carrefour.fid.android.shared.type.ResultState.Success<com.carrefour.fid.android.domain.models.service.models.StoreService?>");
                C28892e<String> eVar2 = this.$minOrderAmountState;
                Intrinsics.checkNotNull(eVar2, "null cannot be cast to non-null type com.carrefour.fid.android.shared.type.ResultState.Success<kotlin.String>");
                C28892e<C11079d2> eVar3 = this.$validationState;
                DeliveryType deliveryType = this.$deliveryType;
                Address address = this.$address;
                boolean z = this.$displayExitDialog;
                C11300l<DeliverySummaryAction, C11079d2> lVar2 = this.$actioner;
                int i2 = this.$$dirty;
                DeliverySummaryStatefulKt.Summary((StoreService) ((C28892e.C28895c) eVar).mo84088d(), (String) ((C28892e.C28895c) eVar2).mo84088d(), eVar3, deliveryType, address, z, lVar2, oVar, (C28892e.f70778a << 6) | 32776 | ((i2 << 3) & 7168) | ((i2 << 6) & 458752) | ((i2 << 3) & 3670016));
                oVar.mo15002m0();
            } else {
                if (Intrinsics.areEqual((Object) globalState, (Object) C28892e.C28896d.f70785b) ? true : Intrinsics.areEqual((Object) globalState, (Object) C28892e.C28894b.f70781b)) {
                    oVar.mo14918M(-801372874);
                    C8767m l = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
                    oVar.mo14918M(733328855);
                    C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar, 0);
                    oVar.mo14918M(-1323940314);
                    C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
                    LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
                    C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
                    ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                    C11289a<ComposeUiNode> a = companion.mo44585a();
                    C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(l);
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
                    C8592o b = Updater.m30180b(oVar);
                    Updater.m30188j(b, k, companion.mo44588d());
                    Updater.m30188j(b, dVar, companion.mo44586b());
                    Updater.m30188j(b, layoutDirection, companion.mo44587c());
                    Updater.m30188j(b, c4Var, companion.mo44590f());
                    oVar.mo14972e();
                    f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
                    oVar.mo14918M(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                    DeliverySummaryStatefulKt.LoadingScreen(oVar, 0);
                    oVar.mo15002m0();
                    oVar.mo14896D();
                    oVar.mo15002m0();
                    oVar.mo15002m0();
                    oVar.mo15002m0();
                } else {
                    oVar.mo14918M(-801372778);
                    oVar.mo15002m0();
                }
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
