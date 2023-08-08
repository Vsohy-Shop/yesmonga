package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import android.content.Context;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.C3036d1;
import androidx.compose.material.C3044g0;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt;
import com.carrefour.fid.android.domain.interactors.basket.C37562d;
import com.carrefour.fid.android.domain.models.CategoryModel;
import com.carrefour.fid.android.domain.models.ProductPictureDomain;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.performance.C38334f;
import com.carrefour.fid.android.presentation.models.C38454b;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.C23547a;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.QuantityListBottomSheetComponentKt;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.C26144b;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;

@C11363r0({"SMAP\nNonFoodCheckoutStep1Stateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep1Stateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/NonFoodCheckoutStep1StatefulKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,600:1\n43#2,6:601\n45#3,3:607\n76#4:610\n76#4:639\n76#4:655\n25#5:611\n25#5:618\n25#5:625\n25#5:632\n25#5:644\n36#5:656\n36#5:663\n36#5:671\n36#5:678\n36#5:685\n36#5:692\n1114#6,6:612\n1114#6,6:619\n1114#6,6:626\n1114#6,6:633\n1114#6,3:645\n1117#6,3:651\n1114#6,6:657\n1114#6,6:664\n1114#6,6:672\n1114#6,6:679\n1114#6,6:686\n1114#6,6:693\n474#7,4:640\n478#7,2:648\n482#7:654\n474#8:650\n154#9:670\n154#9:700\n1#10:699\n76#11:701\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep1Stateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/NonFoodCheckoutStep1StatefulKt\n*L\n80#1:601,6\n80#1:607,3\n91#1:610\n96#1:639\n141#1:655\n92#1:611\n93#1:618\n94#1:625\n95#1:632\n97#1:644\n186#1:656\n260#1:663\n281#1:671\n309#1:678\n310#1:685\n318#1:692\n92#1:612,6\n93#1:619,6\n94#1:626,6\n95#1:633,6\n97#1:645,3\n97#1:651,3\n186#1:657,6\n260#1:664,6\n281#1:672,6\n309#1:679,6\n310#1:686,6\n318#1:693,6\n97#1:640,4\n97#1:648,2\n97#1:654\n97#1:650\n281#1:670\n453#1:700\n89#1:701\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt */
public final class NonFoodCheckoutStep1StatefulKt {
    @C3044g0
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104665a(C26144b bVar, boolean z, C23547a aVar, ModalBottomSheetState modalBottomSheetState, boolean z2, boolean z3, Throwable th, C11300l<? super C23520c, C11079d2> lVar, C8592o oVar, int i) {
        C28892e.C28895c cVar;
        C37562d dVar;
        Basket basket;
        C11300l<? super C23520c, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(450895240);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(450895240, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.CheckoutBasketDetailsScreen (NonFoodCheckoutStep1Stateful.kt:207)");
        }
        C28892e<C37562d> e = bVar.mo75964e();
        if (e instanceof C28892e.C28895c) {
            cVar = (C28892e.C28895c) e;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            dVar = (C37562d) cVar.mo84088d();
        } else {
            dVar = null;
        }
        if (dVar != null) {
            basket = dVar.mo114366g();
        } else {
            basket = null;
        }
        C8767m l = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
        C8552a b = C8553b.m31048b(o, -455231133, true, new NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$1(dVar, lVar2, i2));
        C26144b bVar2 = bVar;
        C8552a b2 = C8553b.m31048b(o, 203151746, true, new NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$2(bVar2, basket, z3, z, lVar, i));
        NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$3 nonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$3 = r0;
        NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$3 nonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$32 = new NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$3(bVar2, z, z2, th, lVar, i);
        ScaffoldKt.m13747a(l, (C3036d1) null, b, b2, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(o, -1012185974, true, nonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$3), o, 3462, 12582912, 131058);
        o.mo14918M(1157296644);
        boolean n0 = o.mo15006n0(lVar2);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$4$1(lVar2);
            o.mo14893C(N);
        }
        o.mo15002m0();
        QuantityListBottomSheetComponentKt.m104771a(modalBottomSheetState, aVar, (C11304p) N, o, ModalBottomSheetState.f7719e | 64 | ((i2 >> 9) & 14));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$5(bVar, z, aVar, modalBottomSheetState, z2, z3, th, lVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104666b(C8767m mVar, List<C38454b> list, Map<String, ? extends List<? extends OfferProductModel>> map, Basket basket, boolean z, C11300l<? super C23520c, C11079d2> lVar, C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1539668500);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1539668500, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.CheckoutBasketListDetails (NonFoodCheckoutStep1Stateful.kt:326)");
        } else {
            int i2 = i;
        }
        int i3 = 0;
        LazyListState a = LazyListStateKt.m10895a(0, 0, o, 0, 3);
        for (List size : map.values()) {
            i3 += size.size();
        }
        lVar.invoke(new C23520c.C23530e.C23531a(C38334f.f97092g, i3));
        LazyDslKt.m10737b(SizeKt.m10112l(mVar, 0.0f, 1, (Object) null), a, (C2366i0) null, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2(list, map, lVar, i, basket, z), o, 0, 252);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$3(mVar, list, map, basket, z, lVar, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104667c(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r36, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.analytics.C23516a r37, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.performance.C38326b r38, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r39, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r40, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super java.lang.String, ? super java.util.HashMap<java.lang.String, com.carrefour.fid.android.domain.models.CategoryModel>, kotlin.C11079d2> r41, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r42, int r43, int r44) {
        /*
            r14 = r37
            java.lang.String r0 = "analytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "performance"
            r15 = r38
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onBackPressed"
            r13 = r39
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onDisplayError"
            r12 = r40
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onNavigateToCheckoutStep2"
            r11 = r41
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1015884941(0x3c8d2c8d, float:0.017233158)
            r1 = r42
            androidx.compose.runtime.o r10 = r1.mo15009o(r0)
            r1 = r44 & 1
            r8 = 8
            if (r1 == 0) goto L_0x006b
            r1 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r10.mo14918M(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f49869a
            androidx.lifecycle.b1 r2 = r1.mo57681a(r10, r8)
            if (r2 == 0) goto L_0x005f
            androidx.lifecycle.x0$b r4 = androidx.hilt.navigation.compose.C19298a.m90444a(r2, r10, r8)
            r1 = 564614654(0x21a755fe, float:1.1339122E-18)
            r10.mo14918M(r1)
            r3 = 0
            java.lang.Class<com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel> r1 = com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel.class
            r6 = 4168(0x1048, float:5.84E-42)
            r7 = 0
            r5 = r10
            androidx.lifecycle.v0 r1 = androidx.lifecycle.viewmodel.compose.C19490c.m90838f(r1, r2, r3, r4, r5, r6, r7)
            r10.mo15002m0()
            r10.mo15002m0()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel) r1
            r9 = r1
            goto L_0x006d
        L_0x005f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x006b:
            r9 = r36
        L_0x006d:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x007c
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1Stateful (NonFoodCheckoutStep1Stateful.kt:78)"
            r7 = r43
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r1, r2)
            goto L_0x007e
        L_0x007c:
            r7 = r43
        L_0x007e:
            kotlinx.coroutines.flow.u r0 = r9.mo75945s0()
            r6 = 0
            r1 = 1
            androidx.compose.runtime.k2 r0 = androidx.compose.runtime.C8415c2.m30233b(r0, r6, r10, r8, r1)
            kotlinx.coroutines.flow.u r2 = r9.mo75944r0()
            androidx.compose.runtime.k2 r8 = androidx.compose.runtime.C8415c2.m30233b(r2, r6, r10, r8, r1)
            kotlinx.coroutines.flow.e r1 = r9.getSideEffect()
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r2 = r10.mo15032w(r2)
            androidx.lifecycle.w r2 = (androidx.lifecycle.C19499w) r2
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r3 = 0
            r5 = 72
            r16 = 4
            r4 = r10
            r7 = r6
            r6 = r16
            kotlinx.coroutines.flow.e r6 = com.carrefour.fid.android.shared.extension.FlowKt.m118809b(r1, r2, r3, r4, r5, r6)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo14918M(r1)
            java.lang.Object r2 = r10.mo14921N()
            androidx.compose.runtime.o$a r27 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r27.mo16277a()
            r4 = 2
            if (r2 != r3) goto L_0x00cf
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.a$a r2 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.C23547a.f59501f
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.a r2 = r2.mo69007a()
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r2, r7, r4, r7)
            r10.mo14893C(r2)
        L_0x00cf:
            r10.mo15002m0()
            r28 = r2
            androidx.compose.runtime.z0 r28 = (androidx.compose.runtime.C8700z0) r28
            r10.mo14918M(r1)
            java.lang.Object r2 = r10.mo14921N()
            java.lang.Object r3 = r27.mo16277a()
            if (r2 != r3) goto L_0x00ec
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r2, r7, r4, r7)
            r10.mo14893C(r2)
        L_0x00ec:
            r10.mo15002m0()
            r29 = r2
            androidx.compose.runtime.z0 r29 = (androidx.compose.runtime.C8700z0) r29
            r10.mo14918M(r1)
            java.lang.Object r2 = r10.mo14921N()
            java.lang.Object r3 = r27.mo16277a()
            if (r2 != r3) goto L_0x0107
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r7, r7, r4, r7)
            r10.mo14893C(r2)
        L_0x0107:
            r10.mo15002m0()
            r30 = r2
            androidx.compose.runtime.z0 r30 = (androidx.compose.runtime.C8700z0) r30
            r10.mo14918M(r1)
            java.lang.Object r2 = r10.mo14921N()
            java.lang.Object r3 = r27.mo16277a()
            if (r2 != r3) goto L_0x0124
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r2, r7, r4, r7)
            r10.mo14893C(r2)
        L_0x0124:
            r10.mo15002m0()
            r31 = r2
            androidx.compose.runtime.z0 r31 = (androidx.compose.runtime.C8700z0) r31
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70952g()
            java.lang.Object r2 = r10.mo15032w(r2)
            r32 = r2
            android.content.Context r32 = (android.content.Context) r32
            r2 = 773894976(0x2e20b340, float:3.6538994E-11)
            r10.mo14918M(r2)
            r10.mo14918M(r1)
            java.lang.Object r1 = r10.mo14921N()
            java.lang.Object r2 = r27.mo16277a()
            if (r1 != r2) goto L_0x0159
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r1 = androidx.compose.runtime.EffectsKt.m29901m(r1, r10)
            androidx.compose.runtime.w r2 = new androidx.compose.runtime.w
            r2.<init>(r1)
            r10.mo14893C(r2)
            r1 = r2
        L_0x0159:
            r10.mo15002m0()
            androidx.compose.runtime.w r1 = (androidx.compose.runtime.C8690w) r1
            kotlinx.coroutines.o0 r16 = r1.mo16831a()
            r10.mo15002m0()
            androidx.compose.material.ModalBottomSheetValue r1 = androidx.compose.material.ModalBottomSheetValue.Hidden
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 6
            r17 = 14
            r5 = r10
            r36 = r6
            r6 = r7
            r7 = r17
            androidx.compose.material.ModalBottomSheetState r17 = androidx.compose.material.ModalBottomSheetKt.m13595p(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = r0.getValue()
            r18 = r1
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.b r18 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.C26144b) r18
            boolean r19 = m104668d(r8)
            java.lang.Object r1 = r28.getValue()
            r20 = r1
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.a r20 = (com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.C23547a) r20
            java.lang.Object r1 = r29.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r21 = r1.booleanValue()
            java.lang.Object r1 = r31.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r22 = r1.booleanValue()
            java.lang.Object r1 = r30.getValue()
            r23 = r1
            java.lang.Throwable r23 = (java.lang.Throwable) r23
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$1 r24 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$1
            r8 = r0
            r0 = r24
            r1 = r39
            r2 = r30
            r3 = r9
            r4 = r29
            r5 = r16
            r6 = r37
            r7 = r38
            r42 = r8
            r8 = r28
            r13 = r9
            r9 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r33 = com.carrefour.fid.android.shared.type.C28892e.f70778a
            r0 = r33 | r33
            r1 = 2097664(0x200200, float:2.939453E-39)
            r0 = r0 | r1
            int r1 = androidx.compose.material.ModalBottomSheetState.f7719e
            int r1 = r1 << 9
            r0 = r0 | r1
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r17
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r10
            r15 = r10
            r10 = r0
            m104665a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r0 = r15.mo15032w(r0)
            r16 = r0
            androidx.lifecycle.w r16 = (androidx.lifecycle.C19499w) r16
            r17 = 0
            r18 = 0
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$2 r0 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$2
            r0.<init>(r13)
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$3 r1 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$3
            r1.<init>(r13)
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 8
            r26 = 230(0xe6, float:3.22E-43)
            r19 = r0
            r20 = r1
            r24 = r15
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt.m119612a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4 r10 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4
            r16 = 0
            r0 = r10
            r1 = r36
            r2 = r31
            r3 = r39
            r4 = r41
            r5 = r13
            r6 = r28
            r7 = r29
            r8 = r32
            r9 = r40
            r34 = r10
            r10 = r30
            r11 = r42
            r12 = r37
            r35 = r13
            r13 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = 72
            r2 = r34
            androidx.compose.runtime.EffectsKt.m29896h(r1, r2, r15, r0)
            java.lang.Object r0 = r42.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.b r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.C26144b) r0
            com.carrefour.fid.android.shared.type.e r1 = r0.mo75964e()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r0)
            r0 = r42
            boolean r2 = r15.mo15006n0(r0)
            java.lang.Object r3 = r15.mo14921N()
            if (r2 != 0) goto L_0x0261
            java.lang.Object r2 = r27.mo16277a()
            if (r3 != r2) goto L_0x0269
        L_0x0261:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$5$1 r3 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$5$1
            r3.<init>(r0)
            r15.mo14893C(r3)
        L_0x0269:
            r15.mo15002m0()
            r2 = r3
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$6 r3 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$6
            r7 = r35
            r3.<init>(r0, r7, r14)
            r6 = 0
            r4 = r15
            r5 = r33
            com.carrefour.fid.android.shared.util.events.SingleEventCoroutineLauncherKt.m119625a(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0286
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0286:
            androidx.compose.runtime.t1 r9 = r15.mo15020s()
            if (r9 != 0) goto L_0x028d
            goto L_0x02a5
        L_0x028d:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$7 r10 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$7
            r0 = r10
            r1 = r7
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r43
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x02a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt.m104667c(com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel, com.carrefour.fid.android.presentation.ui.checkout.nal.step1.analytics.a, com.carrefour.fid.android.performance.b, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: d */
    public static final boolean m104668d(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m104669e(OfferProductModel offerProductModel, C11300l<? super C23520c, C11079d2> lVar, C8592o oVar, int i) {
        String str;
        String str2;
        String str3;
        ProductPictureDomain productPictureDomain;
        OfferProductModel offerProductModel2 = offerProductModel;
        C11300l<? super C23520c, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(2031513187);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2031513187, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.OfferList (NonFoodCheckoutStep1Stateful.kt:406)");
        }
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 == null) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            C8678t1 s = o.mo15020s();
            if (s != null) {
                s.mo15202a(new NonFoodCheckoutStep1StatefulKt$OfferList$product$1(offerProductModel2, lVar2, i2));
                return;
            }
            return;
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
        String x = o0.mo121896x();
        if (x == null) {
            str = "";
        } else {
            str = x;
        }
        String z = o0.mo121898z();
        if (z == null) {
            str2 = "";
        } else {
            str2 = z;
        }
        List<ProductPictureDomain> u = o0.mo121892u();
        if (u == null || (productPictureDomain = (ProductPictureDomain) CollectionsKt___CollectionsKt.m40479B2(u)) == null) {
            str3 = null;
        } else {
            str3 = productPictureDomain.mo116585e();
        }
        if (str3 == null) {
            str3 = "";
        }
        NonFoodProductCardComponentKt.m151922a(n, str3, str2, str, offerProductModel.mo121519p0(), OfferProductModelKt.m159553B(offerProductModel), C8553b.m31048b(o, -655809700, true, new NonFoodCheckoutStep1StatefulKt$OfferList$1(offerProductModel2, o0)), C8553b.m31048b(o, -1071136517, true, new NonFoodCheckoutStep1StatefulKt$OfferList$2(offerProductModel2)), new NonFoodCheckoutStep1StatefulKt$OfferList$3(lVar2, o0), (C11289a<C11079d2>) null, new NonFoodCheckoutStep1StatefulKt$OfferList$4(lVar2, offerProductModel2, o0), o, 14155782, 0, 512);
        C8592o oVar2 = o;
        C2428y0.m10726a(SizeKt.m10115o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M((float) 2)), oVar2, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s2 = oVar2.mo15020s();
        if (s2 != null) {
            s2.mo15202a(new NonFoodCheckoutStep1StatefulKt$OfferList$5(offerProductModel2, lVar2, i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.carrefour.fid.android.shared.type.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104670f(androidx.compose.foundation.layout.C2366i0 r14, com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.C26144b r15, boolean r16, boolean r17, java.lang.Throwable r18, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c, kotlin.C11079d2> r19, androidx.compose.runtime.C8592o r20, int r21) {
        /*
            r8 = r19
            r9 = r21
            r0 = 1488048155(0x58b1d01b, float:1.56405891E15)
            r1 = r20
            androidx.compose.runtime.o r10 = r1.mo15009o(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0019
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.ScreenComportment (NonFoodCheckoutStep1Stateful.kt:270)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r9, r1, r2)
        L_0x0019:
            com.carrefour.fid.android.shared.type.e r0 = r15.mo75966f()
            com.carrefour.fid.android.shared.type.e$d r1 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x0027
            r1 = 1
            goto L_0x002d
        L_0x0027:
            com.carrefour.fid.android.shared.type.e$b r1 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
        L_0x002d:
            r11 = 0
            r12 = 1157296644(0x44faf204, float:2007.563)
            r13 = 0
            if (r1 == 0) goto L_0x0042
            r0 = 1871630206(0x6f8ecf7e, float:8.839543E28)
            r10.mo14918M(r0)
            com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.BasketLoaderComponentKt.m104740a(r10, r13)
            r10.mo15002m0()
            goto L_0x0159
        L_0x0042:
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28893a
            if (r1 == 0) goto L_0x0087
            r0 = 1871630262(0x6f8ecfb6, float:8.839596E28)
            r10.mo14918M(r0)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 16
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10024k(r0, r1)
            r2 = 0
            r10.mo14918M(r12)
            boolean r0 = r10.mo15006n0(r8)
            java.lang.Object r3 = r10.mo14921N()
            if (r0 != 0) goto L_0x006f
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r3 != r0) goto L_0x0077
        L_0x006f:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$1$1 r3 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$1$1
            r3.<init>(r8)
            r10.mo14893C(r3)
        L_0x0077:
            r10.mo15002m0()
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            r5 = 6
            r6 = 2
            r4 = r10
            com.carrefour.fid.android.design.components.compose.MessageComponentKt.m151549f(r1, r2, r3, r4, r5, r6)
            r10.mo15002m0()
            goto L_0x0159
        L_0x0087:
            boolean r0 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            if (r0 == 0) goto L_0x0150
            r0 = 1871630448(0x6f8ed070, float:8.839771E28)
            r10.mo14918M(r0)
            com.carrefour.fid.android.shared.type.e r0 = r15.mo75964e()
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            if (r1 == 0) goto L_0x009c
            com.carrefour.fid.android.shared.type.e$c r0 = (com.carrefour.fid.android.shared.type.C28892e.C28895c) r0
            goto L_0x009d
        L_0x009c:
            r0 = r11
        L_0x009d:
            if (r0 == 0) goto L_0x0127
            java.lang.Object r0 = r0.mo84088d()
            com.carrefour.fid.android.domain.interactors.basket.d r0 = (com.carrefour.fid.android.domain.interactors.basket.C37562d) r0
            if (r0 != 0) goto L_0x00a9
            goto L_0x0127
        L_0x00a9:
            java.util.Map r1 = r0.mo114370j()
            java.util.Collection r1 = r1.values()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00ef
            java.util.List r1 = r0.mo114367h()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00ef
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$b r0 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c.C23527b.f59451a
            r8.invoke(r0)
            r10.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00d2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00d2:
            androidx.compose.runtime.t1 r10 = r10.mo15020s()
            if (r10 != 0) goto L_0x00d9
            goto L_0x00ee
        L_0x00d9:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$2 r11 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$2
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.mo15202a(r11)
        L_0x00ee:
            return
        L_0x00ef:
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r2 = 0
            r3 = 0
            r4 = 0
            float r5 = r14.mo8090a()
            r6 = 7
            r7 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10028o(r1, r2, r3, r4, r5, r6, r7)
            java.util.List r2 = r0.mo114367h()
            java.util.Map r3 = r0.mo114370j()
            com.carrefour.fid.android.domain.models.basket.Basket r4 = r0.mo114366g()
            int r0 = r9 << 6
            r5 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r5
            r0 = r0 | 4672(0x1240, float:6.547E-42)
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r9
            r7 = r0 | r5
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r16
            r5 = r19
            r6 = r10
            m104666b(r0, r1, r2, r3, r4, r5, r6, r7)
            r10.mo15002m0()
            goto L_0x0159
        L_0x0127:
            r10.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0133
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0133:
            androidx.compose.runtime.t1 r10 = r10.mo15020s()
            if (r10 != 0) goto L_0x013a
            goto L_0x014f
        L_0x013a:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$basketAndOffers$1 r11 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$basketAndOffers$1
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.mo15202a(r11)
        L_0x014f:
            return
        L_0x0150:
            r0 = 1871631203(0x6f8ed363, float:8.840484E28)
            r10.mo14918M(r0)
            r10.mo15002m0()
        L_0x0159:
            r0 = 1871631209(0x6f8ed369, float:8.84049E28)
            r10.mo14918M(r0)
            if (r17 == 0) goto L_0x01ce
            r0 = 2131952004(0x7f130184, float:1.9540438E38)
            java.lang.String r2 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r10, r13)
            r0 = 2131952005(0x7f130185, float:1.954044E38)
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r10, r13)
            r0 = 2131952787(0x7f130493, float:1.9542027E38)
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r10, r13)
            r0 = 2131952781(0x7f13048d, float:1.9542014E38)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r10, r13)
            r10.mo14918M(r12)
            boolean r0 = r10.mo15006n0(r8)
            java.lang.Object r1 = r10.mo14921N()
            if (r0 != 0) goto L_0x0192
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x019a
        L_0x0192:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$3$1 r1 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$3$1
            r1.<init>(r8)
            r10.mo14893C(r1)
        L_0x019a:
            r10.mo15002m0()
            r6 = r1
            kotlin.jvm.functions.a r6 = (kotlin.jvm.functions.C11289a) r6
            r10.mo14918M(r12)
            boolean r0 = r10.mo15006n0(r8)
            java.lang.Object r1 = r10.mo14921N()
            if (r0 != 0) goto L_0x01b5
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x01bd
        L_0x01b5:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$4$1 r1 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$4$1
            r1.<init>(r8)
            r10.mo14893C(r1)
        L_0x01bd:
            r10.mo15002m0()
            r7 = r1
            kotlin.jvm.functions.a r7 = (kotlin.jvm.functions.C11289a) r7
            com.carrefour.fid.android.design.components.compose.f$b r0 = new com.carrefour.fid.android.design.components.compose.f$b
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            int r1 = com.carrefour.fid.android.design.components.compose.C36984f.C36986b.f92385g
            com.carrefour.fid.android.design.components.compose.DialogComponentKt.m151480c(r0, r10, r1)
        L_0x01ce:
            r10.mo15002m0()
            if (r18 == 0) goto L_0x022b
            r10.mo14918M(r12)
            boolean r0 = r10.mo15006n0(r8)
            java.lang.Object r1 = r10.mo14921N()
            if (r0 != 0) goto L_0x01e8
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x01f0
        L_0x01e8:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$5$1 r1 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$5$1
            r1.<init>(r8)
            r10.mo14893C(r1)
        L_0x01f0:
            r10.mo15002m0()
            kotlin.jvm.functions.a r1 = (kotlin.jvm.functions.C11289a) r1
            com.carrefour.fid.android.shared.type.e r0 = r15.mo75964e()
            boolean r2 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            if (r2 == 0) goto L_0x0200
            r11 = r0
            com.carrefour.fid.android.shared.type.e$c r11 = (com.carrefour.fid.android.shared.type.C28892e.C28895c) r11
        L_0x0200:
            if (r11 == 0) goto L_0x021b
            java.lang.Object r0 = r11.mo84088d()
            com.carrefour.fid.android.domain.interactors.basket.d r0 = (com.carrefour.fid.android.domain.interactors.basket.C37562d) r0
            if (r0 == 0) goto L_0x021b
            com.carrefour.fid.android.domain.models.basket.Basket r0 = r0.mo114366g()
            if (r0 == 0) goto L_0x021b
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r0 = r0.mo116855w()
            if (r0 == 0) goto L_0x021b
            double r2 = r0.mo116898z()
            goto L_0x021d
        L_0x021b:
            r2 = 0
        L_0x021d:
            int r0 = r9 >> 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r6 = r0 | 8
            r0 = r18
            r4 = r19
            r5 = r10
            com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.ValidationErrorDialogComponentKt.m104774a(r0, r1, r2, r4, r5, r6)
        L_0x022b:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0234
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0234:
            androidx.compose.runtime.t1 r10 = r10.mo15020s()
            if (r10 != 0) goto L_0x023b
            goto L_0x0250
        L_0x023b:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$6 r11 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$ScreenComportment$6
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.mo15202a(r11)
        L_0x0250:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt.m104670f(androidx.compose.foundation.layout.i0, com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.b, boolean, boolean, java.lang.Throwable, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: q */
    public static final void m104681q(C23520c.C23521a aVar, NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel, C8700z0<Boolean> z0Var) {
        if (Intrinsics.areEqual((Object) aVar, (Object) C23520c.C23521a.C23522a.f59441a)) {
            nonFoodCheckout1ViewModel.mo75948v0();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C23520c.C23521a.C23524c.f59445a)) {
            z0Var.setValue(Boolean.TRUE);
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C23520c.C23521a.C23523b.f59443a)) {
            z0Var.setValue(Boolean.FALSE);
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C23520c.C23521a.C23525d.f59447a)) {
            nonFoodCheckout1ViewModel.mo75941o0();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C23520c.C23521a.C23526e.f59449a)) {
            nonFoodCheckout1ViewModel.mo75951y0();
        }
    }

    /* renamed from: r */
    public static final void m104682r(Context context, C23563o oVar, C8700z0<Boolean> z0Var, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar, C8700z0<Throwable> z0Var2) {
        if (oVar instanceof C23556h) {
            String string = context.getResources().getString(R.string.basket_details_delete_basket_error);
            Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr…ails_delete_basket_error)");
            lVar.invoke(string);
        } else if (oVar instanceof C23559k) {
            String string2 = context.getResources().getString(R.string.basket_details_delete_product_error);
            Intrinsics.checkNotNullExpressionValue(string2, "context.resources.getStr…ils_delete_product_error)");
            lVar.invoke(string2);
        } else if (oVar instanceof C23566r) {
            String string3 = context.getResources().getString(R.string.basket_details_update_product_error);
            Intrinsics.checkNotNullExpressionValue(string3, "context.resources.getStr…ils_update_product_error)");
            lVar.invoke(string3);
        } else if (oVar instanceof C23562n) {
            aVar.invoke();
        } else if (oVar instanceof C23569u) {
            z0Var.setValue(Boolean.FALSE);
            z0Var2.setValue(((C23569u) oVar).mo69050d());
        }
    }

    /* renamed from: s */
    public static final void m104683s(C23564p pVar, C8700z0<C23547a> z0Var, C8700z0<Boolean> z0Var2, C8700z0<Boolean> z0Var3) {
        if (Intrinsics.areEqual((Object) pVar, (Object) C23557i.f59521a)) {
            z0Var3.setValue(Boolean.FALSE);
        } else if (Intrinsics.areEqual((Object) pVar, (Object) C23560l.f59527a)) {
        } else {
            if (Intrinsics.areEqual((Object) pVar, (Object) C23567s.f59535a)) {
                z0Var.setValue(C23547a.f59501f.mo69007a());
            } else if (Intrinsics.areEqual((Object) pVar, (Object) C23570v.f59541a)) {
                z0Var2.setValue(Boolean.TRUE);
            }
        }
    }

    /* renamed from: t */
    public static final void m104684t(C23520c.C23530e eVar, C38326b bVar) {
        if (eVar instanceof C23520c.C23530e.C23531a) {
            C23520c.C23530e.C23531a aVar = (C23520c.C23530e.C23531a) eVar;
            bVar.mo121195d(aVar.mo68916f());
            bVar.mo121184f(aVar.mo68914e());
        } else if (Intrinsics.areEqual((Object) eVar, (Object) C23520c.C23530e.C23532b.f59460a)) {
            bVar.mo121196e();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.compose.runtime.z0<com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m104685u(com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c.C23533f r6, com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r7, androidx.compose.runtime.C8700z0<com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.C23547a> r8, androidx.compose.material.ModalBottomSheetState r9, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            boolean r0 = r10 instanceof com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$handleProductCardAction$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$handleProductCardAction$1 r0 = (com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$handleProductCardAction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$handleProductCardAction$1 r0 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$handleProductCardAction$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r6 = r0.L$1
            r7 = r6
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r7 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel) r7
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$f r6 = (com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c.C23533f) r6
            kotlin.C11661u0.m45747n(r10)
            goto L_0x009d
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            java.lang.Object r6 = r0.L$1
            r8 = r6
            androidx.compose.runtime.z0 r8 = (androidx.compose.runtime.C8700z0) r8
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$f r6 = (com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c.C23533f) r6
            kotlin.C11661u0.m45747n(r10)
            goto L_0x005e
        L_0x004a:
            kotlin.C11661u0.m45747n(r10)
            boolean r10 = r6 instanceof com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c.C23533f.C23534a
            if (r10 == 0) goto L_0x007e
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r7 = r9.mo10296p(r0)
            if (r7 != r1) goto L_0x005e
            return r1
        L_0x005e:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$f$a r6 = (com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c.C23533f.C23534a) r6
            com.carrefour.fid.android.domain.models.product.Product r5 = r6.mo68931l()
            int r2 = r6.mo68929j()
            int r1 = r6.mo68926h()
            int r3 = r6.mo68930k()
            int r4 = r6.mo68928i()
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.a r6 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.a
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r8.setValue(r6)
            goto L_0x00aa
        L_0x007e:
            boolean r8 = r6 instanceof com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c.C23533f.C23535b
            if (r8 == 0) goto L_0x008c
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$f$b r6 = (com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c.C23533f.C23535b) r6
            com.carrefour.fid.android.domain.models.product.Product r6 = r6.mo68935d()
            r7.mo75942p0(r6)
            goto L_0x00aa
        L_0x008c:
            boolean r8 = r6 instanceof com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c.C23533f.C23536c
            if (r8 == 0) goto L_0x00aa
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r9.mo10291k(r0)
            if (r8 != r1) goto L_0x009d
            return r1
        L_0x009d:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$f$c r6 = (com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c.C23533f.C23536c) r6
            com.carrefour.fid.android.domain.models.product.Product r8 = r6.mo68944f()
            int r6 = r6.mo68942e()
            r7.mo75952z0(r6, r8)
        L_0x00aa:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt.m104685u(com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$f, com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel, androidx.compose.runtime.z0, androidx.compose.material.ModalBottomSheetState, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: v */
    public static final void m104686v(C23565q qVar, C8700z0<Boolean> z0Var, C11289a<C11079d2> aVar, C11304p<? super String, ? super HashMap<String, CategoryModel>, C11079d2> pVar, NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel, C11289a<C11079d2> aVar2) {
        if (Intrinsics.areEqual((Object) qVar, (Object) C23558j.f59523a)) {
            aVar.invoke();
        } else if (Intrinsics.areEqual((Object) qVar, (Object) C23561m.f59529a)) {
            nonFoodCheckout1ViewModel.mo75951y0();
        } else if (Intrinsics.areEqual((Object) qVar, (Object) C23568t.f59537a)) {
            nonFoodCheckout1ViewModel.mo75951y0();
        } else if (qVar instanceof C23571w) {
            aVar2.invoke();
            z0Var.setValue(Boolean.FALSE);
            C23571w wVar = (C23571w) qVar;
            pVar.invoke(wVar.mo69057e(), wVar.mo69059f());
        }
    }
}
