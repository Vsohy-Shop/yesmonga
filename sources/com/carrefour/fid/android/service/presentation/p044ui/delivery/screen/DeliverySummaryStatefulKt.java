package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.autofill.C0861a;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.C3036d1;
import androidx.compose.material.DrawerState;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Measurer;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.gifdecoder.C22073d;
import com.carrefour.fid.android.design.components.compose.BackHandlerComponentKt;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.service.presentation.analytics.delivery.DeliverySummaryAnalyticsReporter;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliveryErrorMessageFormatter;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliveryErrorMessageFormatterKt;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummaryAction;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummarySideEffect;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryState;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.NavArgumentsKt;
import com.carrefour.fid.android.shared.extension.FlowKt;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11620r;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ag\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aU\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u000ej\u0002`\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a_\u0010#\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0!2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u000ej\u0002`\u001aH\u0003¢\u0006\u0004\b#\u0010$\u001a\u000f\u0010%\u001a\u00020\u000bH\u0003¢\u0006\u0004\b%\u0010&*$\b\u0002\u0010'\"\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u000e2\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u000e¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryViewModel;", "viewModel", "Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliverySummaryAnalyticsReporter;", "analytics", "Lcom/carrefour/fid/android/domain/models/account/Address;", "address", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "deliveryType", "", "phone", "Lkotlin/Function0;", "Lkotlin/d2;", "onBackPressed", "onNavigateToHome", "Lkotlin/Function1;", "onValidationError", "DeliverySummaryStateful", "(Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryViewModel;Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliverySummaryAnalyticsReporter;Lcom/carrefour/fid/android/domain/models/account/Address;Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;Ljava/lang/String;Lkotlin/jvm/functions/a;Lkotlin/jvm/functions/a;Lkotlin/jvm/functions/l;Landroidx/compose/runtime/o;I)V", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryState;", "state", "", "displayExitDialog", "Lkotlinx/coroutines/flow/e;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummarySideEffect;", "sideEffect", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummaryAction;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/screen/DeliverySummaryActioner;", "actioner", "DeliverySummaryScreen", "(Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryState;Lcom/carrefour/fid/android/domain/models/account/Address;Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;ZLkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/l;Landroidx/compose/runtime/o;I)V", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "storeService", "minOrderAmount", "Lcom/carrefour/fid/android/shared/type/e;", "validationState", "Summary", "(Lcom/carrefour/fid/android/domain/models/service/models/StoreService;Ljava/lang/String;Lcom/carrefour/fid/android/shared/type/e;Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;Lcom/carrefour/fid/android/domain/models/account/Address;ZLkotlin/jvm/functions/l;Landroidx/compose/runtime/o;I)V", "LoadingScreen", "(Landroidx/compose/runtime/o;I)V", "DeliverySummaryActioner", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeliverySummaryStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliverySummaryStateful.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/DeliverySummaryStatefulKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n*L\n1#1,298:1\n76#2:299\n76#2:329\n25#3:300\n36#3:307\n25#3:318\n25#3:335\n1114#4,6:301\n1114#4,6:308\n1114#4,3:319\n1117#4,3:325\n955#4,6:336\n474#5,4:314\n478#5,2:322\n482#5:328\n474#6:324\n154#7:330\n73#8,4:331\n77#8,20:342\n*S KotlinDebug\n*F\n+ 1 DeliverySummaryStateful.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/DeliverySummaryStatefulKt\n*L\n69#1:299\n115#1:329\n70#1:300\n96#1:307\n114#1:318\n186#1:335\n70#1:301,6\n96#1:308,6\n114#1:319,3\n114#1:325,3\n186#1:336,6\n114#1:314,4\n114#1:322,2\n114#1:328\n114#1:324\n189#1:330\n186#1:331,4\n186#1:342,20\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt */
public final class DeliverySummaryStatefulKt {
    /* access modifiers changed from: private */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void DeliverySummaryScreen(DeliverySummaryState deliverySummaryState, Address address, DeliveryType deliveryType, boolean z, C11907e<? extends DeliverySummarySideEffect> eVar, C11300l<? super DeliverySummaryAction, C11079d2> lVar, C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(217233205);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(217233205, i2, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryScreen (DeliverySummaryStateful.kt:101)");
        }
        C28892e<StoreService> storeService = deliverySummaryState.getStoreService();
        C28892e<String> minimumAmountOrder = deliverySummaryState.getMinimumAmountOrder();
        C28892e<C11079d2> validate = deliverySummaryState.getValidate();
        C3036d1 f = ScaffoldKt.m13752f((DrawerState) null, (SnackbarHostState) null, o, 0, 3);
        o.mo14918M(773894976);
        o.mo14918M(-492369756);
        Object N = o.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, o));
            o.mo14893C(wVar);
            N = wVar;
        }
        o.mo15002m0();
        C12074o0 a = ((C8690w) N).mo16831a();
        o.mo15002m0();
        C11907e<? extends DeliverySummarySideEffect> eVar2 = eVar;
        EffectsKt.m29896h(eVar2, new DeliverySummaryStatefulKt$DeliverySummaryScreen$1(eVar, a, lVar, (DeliveryErrorMessageFormatter) o.mo15032w(DeliveryErrorMessageFormatterKt.getLocalDeliveryErrorMessageFormatter()), (C11045c<? super DeliverySummaryStatefulKt$DeliverySummaryScreen$1>) null), o, 72);
        C8767m l = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
        DeliveryType deliveryType2 = deliveryType;
        C8552a b = C8553b.m31048b(o, -1544009862, true, new DeliverySummaryStatefulKt$DeliverySummaryScreen$2(deliveryType2, lVar, i2));
        DeliverySummaryStatefulKt$DeliverySummaryScreen$3 deliverySummaryStatefulKt$DeliverySummaryScreen$3 = r0;
        DeliverySummaryStatefulKt$DeliverySummaryScreen$3 deliverySummaryStatefulKt$DeliverySummaryScreen$32 = new DeliverySummaryStatefulKt$DeliverySummaryScreen$3(deliverySummaryState, lVar, i, storeService, minimumAmountOrder, validate, deliveryType2, address, z);
        C8592o oVar2 = o;
        ScaffoldKt.m13747a(l, f, b, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(o, -532624141, true, deliverySummaryStatefulKt$DeliverySummaryScreen$3), oVar2, 390, 12582912, 131064);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new DeliverySummaryStatefulKt$DeliverySummaryScreen$4(deliverySummaryState, address, deliveryType, z, eVar, lVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void DeliverySummaryStateful(@C12579k DeliverySummaryViewModel deliverySummaryViewModel, @C12579k DeliverySummaryAnalyticsReporter deliverySummaryAnalyticsReporter, @C12579k Address address, @C12579k DeliveryType deliveryType, @C12579k String str, @C12579k C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2, @C12579k C11300l<? super String, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        C11045c cVar;
        DeliverySummaryAnalyticsReporter deliverySummaryAnalyticsReporter2 = deliverySummaryAnalyticsReporter;
        DeliveryType deliveryType2 = deliveryType;
        C11289a<C11079d2> aVar3 = aVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(deliverySummaryViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(deliverySummaryAnalyticsReporter2, "analytics");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
        Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
        Intrinsics.checkNotNullParameter(aVar3, "onBackPressed");
        Intrinsics.checkNotNullParameter(aVar2, "onNavigateToHome");
        Intrinsics.checkNotNullParameter(lVar, "onValidationError");
        C8592o o = oVar.mo15009o(866166878);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(866166878, i2, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStateful (DeliverySummaryStateful.kt:56)");
        }
        C8578k2<DeliverySummaryState> b = C8415c2.m30233b(deliverySummaryViewModel.getState(), (CoroutineContext) null, o, 8, 1);
        C8592o oVar2 = o;
        C11907e<DeliverySummarySideEffect> b2 = FlowKt.m118809b(deliverySummaryViewModel.getSideEffect(), ((C19499w) o.mo15032w(AndroidCompositionLocals_androidKt.m70954i())).getLifecycle(), (Lifecycle.State) null, o, 72, 4);
        oVar2.mo14918M(-492369756);
        Object N = oVar2.mo14921N();
        C8592o.C8593a aVar4 = C8592o.f23032a;
        if (N == aVar4.mo16277a()) {
            cVar = null;
            N = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
            oVar2.mo14893C(N);
        } else {
            cVar = null;
        }
        oVar2.mo15002m0();
        C8700z0 z0Var = (C8700z0) N;
        DeliverySummaryScreen(b.getValue(), address, deliveryType, ((Boolean) z0Var.getValue()).booleanValue(), b2, new DeliverySummaryStatefulKt$DeliverySummaryStateful$1(deliverySummaryViewModel, aVar, aVar2, z0Var, deliverySummaryAnalyticsReporter, address, str, lVar), oVar2, ((i2 >> 3) & 896) | 32840);
        EffectsKt.m29896h(C11079d2.f28267a, new DeliverySummaryStatefulKt$DeliverySummaryStateful$2(deliverySummaryAnalyticsReporter2, deliveryType2, cVar), oVar2, 70);
        oVar2.mo14918M(1157296644);
        boolean n0 = oVar2.mo15006n0(aVar3);
        Object N2 = oVar2.mo14921N();
        if (n0 || N2 == aVar4.mo16277a()) {
            N2 = new DeliverySummaryStatefulKt$DeliverySummaryStateful$3$1(aVar3);
            oVar2.mo14893C(N2);
        }
        oVar2.mo15002m0();
        BackHandlerComponentKt.m151319a(false, (C11289a) N2, oVar2, 0, 1);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new DeliverySummaryStatefulKt$DeliverySummaryStateful$4(deliverySummaryViewModel, deliverySummaryAnalyticsReporter, address, deliveryType, str, aVar, aVar2, lVar, i));
        }
    }

    /* access modifiers changed from: private */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void LoadingScreen(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1859942679);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1859942679, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.LoadingScreen (DeliverySummaryStateful.kt:279)");
            }
            LazyDslKt.m10737b(SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null), (LazyListState) null, (C2366i0) null, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, DeliverySummaryStatefulKt$LoadingScreen$1.INSTANCE, o, 100663302, C22073d.f56678l);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DeliverySummaryStatefulKt$LoadingScreen$2(i));
        }
    }

    /* access modifiers changed from: private */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void Summary(StoreService storeService, String str, C28892e<C11079d2> eVar, DeliveryType deliveryType, Address address, boolean z, C11300l<? super DeliverySummaryAction, C11079d2> lVar, C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1303337605);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1303337605, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.Summary (DeliverySummaryStateful.kt:172)");
        } else {
            int i2 = i;
        }
        boolean z2 = eVar instanceof C28892e.C28894b;
        Double doubleOrNull = C11620r.toDoubleOrNull(str);
        LazyListState a = LazyListStateKt.m10895a(0, 0, o, 0, 3);
        C8767m k = PaddingKt.m10024k(SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null), C16483g.m74435M((float) 16));
        o.mo14918M(-270267587);
        o.mo14918M(-3687241);
        Object N = o.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = new Measurer();
            o.mo14893C(N);
        }
        o.mo15002m0();
        Measurer measurer = (Measurer) N;
        o.mo14918M(-3687241);
        Object N2 = o.mo14921N();
        if (N2 == aVar.mo16277a()) {
            N2 = new ConstraintLayoutScope();
            o.mo14893C(N2);
        }
        o.mo15002m0();
        ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) N2;
        o.mo14918M(-3687241);
        Object N3 = o.mo14921N();
        if (N3 == aVar.mo16277a()) {
            N3 = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
            o.mo14893C(N3);
        }
        o.mo15002m0();
        Pair<C15560f0, C11289a<C11079d2>> E = ConstraintLayoutKt.m75199E(257, constraintLayoutScope, (C8700z0) N3, measurer, o, 4544);
        LayoutKt.m68906d(SemanticsModifierKt.m71868c(k, false, new DeliverySummaryStatefulKt$Summary$$inlined$ConstraintLayout$1(measurer), 1, (Object) null), C8553b.m31048b(o, -819894182, true, new DeliverySummaryStatefulKt$Summary$$inlined$ConstraintLayout$2(constraintLayoutScope, 6, E.mo21847b(), a, z, lVar, i, address, doubleOrNull, deliveryType, storeService, z2)), E.mo21846a(), o, 48, 0);
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DeliverySummaryStatefulKt$Summary$2(storeService, str, eVar, deliveryType, address, z, lVar, i));
        }
    }
}
