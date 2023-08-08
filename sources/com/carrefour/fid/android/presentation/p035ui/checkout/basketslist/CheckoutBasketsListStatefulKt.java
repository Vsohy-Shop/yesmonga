package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.DrawerState;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
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
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.components.compose.MessageComponentKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.domain.exceptions.ExpiredBasketThrowable;
import com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketLoyaltyCard;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import com.carrefour.fid.android.domain.models.basket.BasketServiceType;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.analytics.C23456a;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.component.ItemBasketKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.screen.CheckoutEmptyBasketComponentKt;
import com.carrefour.fid.android.shared.p046io.EmptyBasketThrowable;
import com.carrefour.fid.android.shared.p046io.RequireSignInThrowable;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C11363r0({"SMAP\nCheckoutBasketsListStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutBasketsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/CheckoutBasketsListStatefulKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,187:1\n43#2,6:188\n45#3,3:194\n76#4:197\n76#4:213\n36#5:198\n460#5,13:225\n473#5,3:239\n36#5:245\n36#5:253\n1114#6,6:199\n1114#6,6:246\n1114#6,6:254\n154#7:205\n154#7:244\n154#7:252\n74#8,6:206\n80#8:238\n84#8:243\n75#9:212\n76#9,11:214\n89#9:242\n*S KotlinDebug\n*F\n+ 1 CheckoutBasketsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/CheckoutBasketsListStatefulKt\n*L\n42#1:188,6\n42#1:194,3\n71#1:197\n127#1:213\n75#1:198\n127#1:225,13\n127#1:239,3\n179#1:245\n182#1:253\n75#1:199,6\n179#1:246,6\n182#1:254,6\n130#1:205\n148#1:244\n182#1:252\n127#1:206,6\n127#1:238\n127#1:243\n127#1:212\n127#1:214,11\n127#1:242\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt */
public final class CheckoutBasketsListStatefulKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104515a(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(432956900);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(432956900, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.BasketsLoader (CheckoutBasketsListStateful.kt:125)");
            }
            C8767m k = PaddingKt.m10024k(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C16483g.m74435M((float) 16));
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(k);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            o.mo14918M(-58723803);
            for (int i3 = 0; i3 < 3; i3++) {
                ItemBasketKt.m104560a(new Basket((BasketAmounts) null, (List) null, (List) null, (String) null, false, (BasketLoyaltyCard) null, (List) null, (String) null, 0, (BasketPromotionCode) null, (Map) null, (String) null, (BasketServiceType) null, (BasketSlot) null, (String) null, (BasketType) null, (Integer) null, (List) null, (BasketReturnableBags) null, 524287, (DefaultConstructorMarker) null), true, CheckoutBasketsListStatefulKt$BasketsLoader$1$1$1.f59309f, o, 440, 0);
            }
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutBasketsListStatefulKt$BasketsLoader$2(i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104516b(List<Basket> list, C11300l<? super C23460b, C11079d2> lVar, C8592o oVar, int i) {
        List<Basket> list2 = list;
        C11300l<? super C23460b, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(848570986);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(848570986, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsList (CheckoutBasketsListStateful.kt:141)");
        }
        C8592o oVar2 = o;
        LazyDslKt.m10737b(PaddingKt.m10024k(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C16483g.m74435M((float) 16)), LazyListStateKt.m10895a(0, 0, o, 0, 3), (C2366i0) null, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new CheckoutBasketsListStatefulKt$CheckoutBasketsList$1(list2, lVar2), o, 6, 252);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutBasketsListStatefulKt$CheckoutBasketsList$2(list2, lVar2, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m104517c(C28892e<? extends List<Basket>> eVar, C23456a aVar, C11300l<? super C23460b, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        int i5;
        C28892e<? extends List<Basket>> eVar2 = eVar;
        C23456a aVar2 = aVar;
        C11300l<? super C23460b, C11079d2> lVar2 = lVar;
        int i6 = i;
        C8592o o = oVar.mo15009o(-1356756000);
        if ((i6 & 14) == 0) {
            if (o.mo15006n0(eVar2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo15006n0(aVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14927P(lVar2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1356756000, i7, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListScreen (CheckoutBasketsListStateful.kt:82)");
            }
            C8592o oVar3 = o;
            oVar2 = oVar3;
            ScaffoldKt.m13747a(BackgroundKt.m8825d(SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null), C37475b.f94185a.mo114220Q(), (C15218g4) null, 2, (Object) null), ScaffoldKt.m13752f((DrawerState) null, (SnackbarHostState) null, o, 0, 3), C8553b.m31048b(o, 1746277221, true, new CheckoutBasketsListStatefulKt$CheckoutBasketsListScreen$1(eVar2)), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(oVar3, -182176482, true, new CheckoutBasketsListStatefulKt$CheckoutBasketsListScreen$2(eVar2, aVar2, lVar2, i7)), oVar3, C22132b.f56831b, 12582912, 131064);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutBasketsListStatefulKt$CheckoutBasketsListScreen$3(eVar2, aVar2, lVar2, i6));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a0  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104518d(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.CheckoutBasketsListViewModel r22, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.analytics.C23456a r23, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r24, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Boolean, ? super com.carrefour.fid.android.domain.models.basket.BasketType, ? super java.lang.String, kotlin.C11079d2> r25, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r26, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r27, int r28, int r29) {
        /*
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            java.lang.String r0 = "analytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onBackClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onNavigateToDetailedBasket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onNavigateToDepartments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 1369301775(0x519de30f, float:8.476491E10)
            r1 = r27
            androidx.compose.runtime.o r5 = r1.mo15009o(r0)
            r1 = r29 & 1
            if (r1 == 0) goto L_0x002e
            r2 = r10 | 2
            goto L_0x002f
        L_0x002e:
            r2 = r10
        L_0x002f:
            r3 = r29 & 2
            if (r3 == 0) goto L_0x0036
            r2 = r2 | 48
            goto L_0x0046
        L_0x0036:
            r3 = r10 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0046
            boolean r3 = r5.mo15006n0(r6)
            if (r3 == 0) goto L_0x0043
            r3 = 32
            goto L_0x0045
        L_0x0043:
            r3 = 16
        L_0x0045:
            r2 = r2 | r3
        L_0x0046:
            r3 = r29 & 4
            if (r3 == 0) goto L_0x004d
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005d
        L_0x004d:
            r3 = r10 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005d
            boolean r3 = r5.mo14927P(r7)
            if (r3 == 0) goto L_0x005a
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r3 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r2 = r2 | r3
        L_0x005d:
            r3 = r29 & 8
            if (r3 == 0) goto L_0x0064
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0074
        L_0x0064:
            r3 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0074
            boolean r3 = r5.mo14927P(r8)
            if (r3 == 0) goto L_0x0071
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r2 = r2 | r3
        L_0x0074:
            r3 = r29 & 16
            if (r3 == 0) goto L_0x007b
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008d
        L_0x007b:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r10
            if (r3 != 0) goto L_0x008d
            boolean r3 = r5.mo14927P(r9)
            if (r3 == 0) goto L_0x008a
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x008a:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r2 = r2 | r3
        L_0x008d:
            r3 = 1
            if (r1 != r3) goto L_0x00a7
            r4 = 46811(0xb6db, float:6.5596E-41)
            r4 = r4 & r2
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r11) goto L_0x00a7
            boolean r4 = r5.mo15011p()
            if (r4 != 0) goto L_0x009f
            goto L_0x00a7
        L_0x009f:
            r5.mo14958a0()
            r1 = r22
            r7 = r5
            goto L_0x01a4
        L_0x00a7:
            r5.mo14930Q()
            r4 = r10 & 1
            r15 = 8
            if (r4 == 0) goto L_0x00c3
            boolean r4 = r5.mo14977f0()
            if (r4 == 0) goto L_0x00b7
            goto L_0x00c3
        L_0x00b7:
            r5.mo14958a0()
            if (r1 == 0) goto L_0x0103
            r2 = r2 & -15
            r11 = r2
            r1 = r15
            r15 = r22
            goto L_0x0107
        L_0x00c3:
            if (r1 == 0) goto L_0x0103
            r1 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r5.mo14918M(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f49869a
            androidx.lifecycle.b1 r12 = r1.mo57681a(r5, r15)
            if (r12 == 0) goto L_0x00f7
            androidx.lifecycle.x0$b r14 = androidx.hilt.navigation.compose.C19298a.m90444a(r12, r5, r15)
            r1 = 564614654(0x21a755fe, float:1.1339122E-18)
            r5.mo14918M(r1)
            r13 = 0
            java.lang.Class<com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.CheckoutBasketsListViewModel> r11 = com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.CheckoutBasketsListViewModel.class
            r16 = 4168(0x1048, float:5.84E-42)
            r17 = 0
            r1 = r15
            r15 = r5
            androidx.lifecycle.v0 r4 = androidx.lifecycle.viewmodel.compose.C19490c.m90838f(r11, r12, r13, r14, r15, r16, r17)
            r5.mo15002m0()
            r5.mo15002m0()
            com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.CheckoutBasketsListViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.CheckoutBasketsListViewModel) r4
            r2 = r2 & -15
            r11 = r2
            r15 = r4
            goto L_0x0107
        L_0x00f7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0103:
            r1 = r15
            r15 = r22
            r11 = r2
        L_0x0107:
            r5.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0116
            r2 = -1
            java.lang.String r4 = "com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStateful (CheckoutBasketsListStateful.kt:40)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r11, r2, r4)
        L_0x0116:
            kotlinx.coroutines.flow.u r0 = r15.getState()
            r2 = 0
            androidx.compose.runtime.k2 r14 = androidx.compose.runtime.C8415c2.m30233b(r0, r2, r5, r1, r3)
            java.lang.Object r0 = r14.getValue()
            r12 = r0
            com.carrefour.fid.android.shared.type.e r12 = (com.carrefour.fid.android.shared.type.C28892e) r12
            com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$1 r13 = new com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$1
            r0 = r13
            r1 = r15
            r2 = r24
            r3 = r23
            r4 = r25
            r7 = r5
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            int r0 = com.carrefour.fid.android.shared.type.C28892e.f70778a
            r1 = r11 & 112(0x70, float:1.57E-43)
            r1 = r1 | r0
            m104517c(r12, r6, r13, r7, r1)
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r1 = r7.mo15032w(r1)
            r11 = r1
            androidx.lifecycle.w r11 = (androidx.lifecycle.C19499w) r11
            r12 = 0
            r13 = 0
            com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$2 r1 = new com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$2
            r1.<init>(r15)
            r2 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 8
            r21 = 246(0xf6, float:3.45E-43)
            r3 = r14
            r14 = r1
            r4 = r15
            r15 = r2
            r19 = r7
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt.m119612a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r11 = r3.getValue()
            r1 = 1157296644(0x44faf204, float:2007.563)
            r7.mo14918M(r1)
            boolean r1 = r7.mo15006n0(r3)
            java.lang.Object r2 = r7.mo14921N()
            if (r1 != 0) goto L_0x0180
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x0188
        L_0x0180:
            com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$3$1 r2 = new com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$3$1
            r2.<init>(r3)
            r7.mo14893C(r2)
        L_0x0188:
            r7.mo15002m0()
            r12 = r2
            kotlin.jvm.functions.a r12 = (kotlin.jvm.functions.C11289a) r12
            com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$4 r13 = new com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$4
            r13.<init>(r6, r4)
            r16 = 0
            r14 = r7
            r15 = r0
            com.carrefour.fid.android.shared.util.events.SingleEventCoroutineLauncherKt.m119625a(r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01a3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01a3:
            r1 = r4
        L_0x01a4:
            androidx.compose.runtime.t1 r11 = r7.mo15020s()
            if (r11 != 0) goto L_0x01ab
            goto L_0x01c0
        L_0x01ab:
            com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$5 r12 = new com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$5
            r0 = r12
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r28
            r7 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.mo15202a(r12)
        L_0x01c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.CheckoutBasketsListStatefulKt.m104518d(com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.CheckoutBasketsListViewModel, com.carrefour.fid.android.presentation.ui.checkout.basketslist.analytics.a, kotlin.jvm.functions.a, kotlin.jvm.functions.q, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m104519e(C28892e.C28893a aVar, C23456a aVar2, C11300l<? super C23460b, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(423770999);
        if ((i & 14) == 0) {
            if (o.mo15006n0(aVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(aVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (o.mo14927P(lVar)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(423770999, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.ErrorScreen (CheckoutBasketsListStateful.kt:168)");
            }
            Throwable d = aVar.mo84083d();
            if (d instanceof EmptyBasketThrowable) {
                z = true;
            } else {
                z = d instanceof ExpiredBasketThrowable;
            }
            if (z) {
                z2 = true;
            } else {
                z2 = d instanceof RequireSignInThrowable;
            }
            if (z2) {
                z3 = true;
            } else {
                z3 = d instanceof RequireServiceSelectionThrowable;
            }
            if (z3) {
                o.mo14918M(1673099725);
                aVar2.mo68703c();
                C8767m l = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
                o.mo14918M(1157296644);
                boolean n0 = o.mo15006n0(lVar);
                Object N = o.mo14921N();
                if (n0 || N == C8592o.f23032a.mo16277a()) {
                    N = new CheckoutBasketsListStatefulKt$ErrorScreen$1$1(lVar);
                    o.mo14893C(N);
                }
                o.mo15002m0();
                CheckoutEmptyBasketComponentKt.m104583a(l, (C11289a) N, o, 6);
                o.mo15002m0();
            } else {
                o.mo14918M(1673100001);
                C8767m k = PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 16));
                o.mo14918M(1157296644);
                boolean n02 = o.mo15006n0(lVar);
                Object N2 = o.mo14921N();
                if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                    N2 = new CheckoutBasketsListStatefulKt$ErrorScreen$2$1(lVar);
                    o.mo14893C(N2);
                }
                o.mo15002m0();
                MessageComponentKt.m151549f(k, (String) null, (C11289a) N2, o, 6, 2);
                o.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutBasketsListStatefulKt$ErrorScreen$3(aVar, aVar2, lVar, i));
        }
    }
}
