package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.C3036d1;
import androidx.compose.material.DrawerState;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.design.components.compose.Variant;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketLoyaltyCard;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import com.carrefour.fid.android.domain.models.basket.BasketServiceType;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.domain.models.service.models.StoreAddress;
import com.carrefour.fid.android.domain.models.service.models.StoreCoordinates;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.BlockDividerKt;
import com.carrefour.fid.android.presentation.p035ui.home.shop.OnlineStoreShopFragment;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.CheckoutStep2ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.analytics.C26092a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.event.C26099a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.state.C26102a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.state.C26105b;
import com.carrefour.fid.android.shared.extension.FlowKt;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.type.C28897f;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.C28950r;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;
import p073j$.time.LocalDateTime;
import p073j$.time.ZoneId;
import p073j$.util.DesugarDate;

@C11363r0({"SMAP\nCheckoutStep2Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep2ScreenKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,739:1\n25#2:740\n460#2,13:767\n460#2,13:802\n473#2,3:816\n473#2,3:821\n1114#3,6:741\n1#4:747\n74#5,6:748\n80#5:780\n84#5:825\n75#6:754\n76#6,11:756\n75#6:789\n76#6,11:791\n89#6:819\n89#6:824\n76#7:755\n76#7:790\n154#8:781\n154#8:782\n75#9,6:783\n81#9:815\n85#9:820\n76#10:826\n76#10:827\n76#10:828\n76#10:829\n76#10:830\n76#10:831\n76#10:832\n76#10:833\n76#10:834\n102#10,2:835\n*S KotlinDebug\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep2ScreenKt\n*L\n107#1:740\n518#1:767,13\n521#1:802,13\n521#1:816,3\n518#1:821,3\n107#1:741,6\n518#1:748,6\n518#1:780\n518#1:825\n518#1:754\n518#1:756,11\n521#1:789\n521#1:791,11\n521#1:819\n518#1:824\n518#1:755\n521#1:790\n523#1:781\n525#1:782\n521#1:783,6\n521#1:815\n521#1:820\n91#1:826\n92#1:827\n93#1:828\n94#1:829\n95#1:830\n96#1:831\n97#1:832\n98#1:833\n107#1:834\n107#1:835,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt */
public final class CheckoutStep2ScreenKt {

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$a */
    public static final class C23387a implements C11908f<C26099a> {

        /* renamed from: a */
        public final /* synthetic */ C3036d1 f59205a;

        /* renamed from: b */
        public final /* synthetic */ String f59206b;

        /* renamed from: c */
        public final /* synthetic */ String f59207c;

        /* renamed from: d */
        public final /* synthetic */ C8700z0<Variant> f59208d;

        public C23387a(C3036d1 d1Var, String str, String str2, C8700z0<Variant> z0Var) {
            this.f59205a = d1Var;
            this.f59206b = str;
            this.f59207c = str2;
            this.f59208d = z0Var;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C26099a aVar, @C12579k C11045c<? super C11079d2> cVar) {
            if (Intrinsics.areEqual((Object) aVar, (Object) C26099a.C26100a.f63781a)) {
                CheckoutStep2ScreenKt.m104368e(this.f59208d, Variant.Success);
                Object e = SnackbarHostState.m13855e(this.f59205a.mo10747b(), this.f59206b, (String) null, (SnackbarDuration) null, cVar, 6, (Object) null);
                if (e == C11063b.m42612h()) {
                    return e;
                }
                return C11079d2.f28267a;
            } else if (!Intrinsics.areEqual((Object) aVar, (Object) C26099a.C26101b.f63783a)) {
                return C11079d2.f28267a;
            } else {
                CheckoutStep2ScreenKt.m104368e(this.f59208d, Variant.Error);
                Object e2 = SnackbarHostState.m13855e(this.f59205a.mo10747b(), this.f59207c, (String) null, (SnackbarDuration) null, cVar, 6, (Object) null);
                if (e2 == C11063b.m42612h()) {
                    return e2;
                }
                return C11079d2.f28267a;
            }
        }
    }

    /* renamed from: H */
    public static final void m104353H(LazyListScope lazyListScope, Basket basket, boolean z) {
        LazyListScope.m10824g(lazyListScope, "basket-summary", (Object) null, C8553b.m31049c(1617812931, true, new CheckoutStep2ScreenKt$basketSummarySection$1(basket, z)), 2, (Object) null);
    }

    /* renamed from: I */
    public static final void m104354I(LazyListScope lazyListScope, Address address) {
        LazyListScope.m10824g(lazyListScope, "billing-address", (Object) null, C8553b.m31049c(1594774166, true, new CheckoutStep2ScreenKt$billingAddressSection$1(address)), 2, (Object) null);
    }

    /* renamed from: J */
    public static final void m104355J(LazyListScope lazyListScope, C26105b bVar) {
        if (bVar instanceof C26105b.C26108c) {
            LazyListScope.m10824g(lazyListScope, "express-pickup", (Object) null, C8553b.m31049c(888746762, true, new CheckoutStep2ScreenKt$expressPickupBanner$1(bVar)), 2, (Object) null);
        }
    }

    @C8540g
    /* renamed from: K */
    public static final String m104356K(Slot slot, C8592o oVar, int i) {
        Object obj;
        oVar.mo14918M(304630349);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(304630349, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.formatSlot (CheckoutStep2Screen.kt:502)");
        }
        try {
            Result.C10852a aVar = Result.f28060a;
            Date O0 = DateTime.m51195N2(slot.mo119504p()).mo28744O0();
            Date O02 = DateTime.m51195N2(slot.mo119505q()).mo28744O0();
            String format = new SimpleDateFormat(C28932h.f70939z, Locale.FRANCE).format(O0);
            Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"EEE dd…ale.FRANCE).format(start)");
            String format2 = new SimpleDateFormat("HH'h'mm", Locale.FRANCE).format(O0);
            Intrinsics.checkNotNullExpressionValue(format2, "SimpleDateFormat(\"HH'h'm…ale.FRANCE).format(start)");
            String format3 = new SimpleDateFormat("HH'h'mm", Locale.FRANCE).format(O02);
            Intrinsics.checkNotNullExpressionValue(format3, "SimpleDateFormat(\"HH'h'm…ocale.FRANCE).format(end)");
            obj = Result.m38702b(C28950r.m119748b(C16018i.m71859e(R.string.slot_date_time, new Object[]{format, format2, format3}, oVar, 64), (Locale) null, 1, (Object) null));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        if (Result.m38705e(obj) != null) {
            obj = "";
        }
        String str = (String) obj;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return str;
    }

    /* renamed from: L */
    public static final boolean m104357L(C28892e<? extends C26102a> eVar, C28892e<Address> eVar2, C28892e<Basket> eVar3) {
        if ((eVar instanceof C28892e.C28893a) || (eVar2 instanceof C28892e.C28893a) || (eVar3 instanceof C28892e.C28893a)) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public static final void m104358M(LazyListScope lazyListScope) {
        LazyListScope.m10824g(lazyListScope, "legal", (Object) null, ComposableSingletons$CheckoutStep2ScreenKt.f59242a.mo68602a(), 2, (Object) null);
    }

    /* renamed from: N */
    public static final void m104359N(LazyListScope lazyListScope, C26102a aVar) {
        if ((aVar instanceof C26102a.C26103a) && ((C26102a.C26103a) aVar).mo75796f() != null) {
            LazyListScope.m10824g(lazyListScope, "telephone", (Object) null, C8553b.m31049c(1015746438, true, new CheckoutStep2ScreenKt$phoneSection$1(aVar)), 2, (Object) null);
        }
    }

    /* renamed from: O */
    public static final void m104360O(LazyListScope lazyListScope, boolean z, boolean z2, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2) {
        if (z) {
            LazyListScope.m10824g(lazyListScope, "post-order-substitution", (Object) null, C8553b.m31049c(262674910, true, new CheckoutStep2ScreenKt$postOrderSubstitutionSection$1(z2, aVar, aVar2)), 2, (Object) null);
        }
    }

    /* renamed from: P */
    public static final void m104361P(LazyListScope lazyListScope, LazyListState lazyListState, C28892e<String> eVar, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar) {
        LazyListScope.m10824g(lazyListScope, "promo-code", (Object) null, C8553b.m31049c(-1775581967, true, new CheckoutStep2ScreenKt$promoCodeSection$1(eVar, lVar, aVar, lazyListState, "promo-code")), 2, (Object) null);
    }

    /* renamed from: Q */
    public static final void m104362Q(LazyListScope lazyListScope, C26102a aVar) {
        LazyListScope.m10824g(lazyListScope, "service", (Object) null, C8553b.m31049c(454849970, true, new CheckoutStep2ScreenKt$serviceSection$1(aVar)), 2, (Object) null);
    }

    /* renamed from: R */
    public static final void m104363R(LazyListScope lazyListScope, C26105b bVar, C11289a<C11079d2> aVar) {
        LazyListScope.m10824g(lazyListScope, OnlineStoreShopFragment.f60516Z, (Object) null, C8553b.m31049c(-1935544953, true, new CheckoutStep2ScreenKt$slotSection$1(bVar, aVar)), 2, (Object) null);
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104364a(C3036d1 d1Var, Variant variant, Basket basket, boolean z, C26102a aVar, Address address, C26105b bVar, C28892e<String> eVar, boolean z2, boolean z3, C11289a<C11079d2> aVar2, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, C11289a<C11079d2> aVar7, C8592o oVar, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        C8592o o = oVar.mo15009o(-2097433194);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2097433194, i3, i4, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2Screen (CheckoutStep2Screen.kt:180)");
        }
        C3036d1 d1Var2 = d1Var;
        C8592o oVar2 = o;
        ScaffoldKt.m13747a((C8767m) null, d1Var2, C8553b.m31048b(o, -1826117135, true, new CheckoutStep2ScreenKt$CheckoutStep2Screen$1(aVar6, i4)), C8553b.m31048b(o, -1481553776, true, new CheckoutStep2ScreenKt$CheckoutStep2Screen$2(basket, aVar7, i4)), C8553b.m31048b(o, 1068856189, true, new CheckoutStep2ScreenKt$CheckoutStep2Screen$3(variant, i3)), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(o, -137969768, true, new CheckoutStep2ScreenKt$CheckoutStep2Screen$4(LazyListStateKt.m10895a(0, 0, o, 0, 3), bVar, aVar, aVar2, address, eVar, lVar, aVar3, basket, z, z2, z3, aVar4, aVar5)), oVar2, ((i3 << 3) & 112) | 28032, 12582912, 131041);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            CheckoutStep2ScreenKt$CheckoutStep2Screen$5 checkoutStep2ScreenKt$CheckoutStep2Screen$5 = r0;
            CheckoutStep2ScreenKt$CheckoutStep2Screen$5 checkoutStep2ScreenKt$CheckoutStep2Screen$52 = new CheckoutStep2ScreenKt$CheckoutStep2Screen$5(d1Var, variant, basket, z, aVar, address, bVar, eVar, z2, z3, aVar2, lVar, aVar3, aVar4, aVar5, aVar6, aVar7, i, i2);
            s.mo15202a(checkoutStep2ScreenKt$CheckoutStep2Screen$5);
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104365b(@C12579k CheckoutStep2ViewModel checkoutStep2ViewModel, @C12579k C26092a aVar, @C12579k C11289a<C11079d2> aVar2, @C12579k C11289a<C11079d2> aVar3, @C12579k C11300l<? super Boolean, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        C8700z0 z0Var;
        C3036d1 d1Var;
        C8592o oVar2;
        CheckoutStep2ViewModel checkoutStep2ViewModel2 = checkoutStep2ViewModel;
        C26092a aVar4 = aVar;
        C11300l<? super Boolean, C11079d2> lVar2 = lVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(checkoutStep2ViewModel2, "viewModel");
        Intrinsics.checkNotNullParameter(aVar4, "analytics");
        Intrinsics.checkNotNullParameter(aVar2, "onSlotEdit");
        Intrinsics.checkNotNullParameter(aVar3, "onBackPressed");
        Intrinsics.checkNotNullParameter(lVar2, "onValidate");
        C8592o o = oVar.mo15009o(592248224);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(592248224, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2Stateful (CheckoutStep2Screen.kt:83)");
        }
        C8578k2 b = C8415c2.m30233b(checkoutStep2ViewModel.mo75746A0(), (CoroutineContext) null, o, 8, 1);
        C8578k2 b2 = C8415c2.m30233b(checkoutStep2ViewModel.mo75763v0(), (CoroutineContext) null, o, 8, 1);
        C8578k2<C26105b> b3 = C8415c2.m30233b(checkoutStep2ViewModel.mo75748C0(), (CoroutineContext) null, o, 8, 1);
        C8578k2<C28892e<String>> b4 = C8415c2.m30233b(checkoutStep2ViewModel.mo75767z0(), (CoroutineContext) null, o, 8, 1);
        C8578k2 b5 = C8415c2.m30233b(checkoutStep2ViewModel.mo75762u0(), (CoroutineContext) null, o, 8, 1);
        C8578k2<Boolean> b6 = C8415c2.m30233b(checkoutStep2ViewModel.mo75747B0(), (CoroutineContext) null, o, 8, 1);
        C8578k2<Boolean> b7 = C8415c2.m30233b(checkoutStep2ViewModel.mo75765x0(), (CoroutineContext) null, o, 8, 1);
        C8578k2<Boolean> b8 = C8415c2.m30233b(checkoutStep2ViewModel.mo75766y0(), (CoroutineContext) null, o, 8, 1);
        C26102a aVar5 = (C26102a) C28897f.m119478b(m104366c(b));
        Basket basket = (Basket) C28897f.m119478b(m104371h(b5));
        Address address = (Address) C28897f.m119478b(m104367d(b2));
        boolean L = m104357L(m104366c(b), m104367d(b2), m104371h(b5));
        C3036d1 f = ScaffoldKt.m13752f((DrawerState) null, (SnackbarHostState) null, o, 0, 3);
        o.mo14918M(-492369756);
        Object N = o.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = C8539f2.m30981g(Variant.Success, (C8410b2) null, 2, (Object) null);
            o.mo14893C(N);
        }
        o.mo15002m0();
        C8700z0 z0Var2 = (C8700z0) N;
        if (aVar5 == null || basket == null || address == null) {
            oVar2 = o;
            d1Var = f;
            z0Var = z0Var2;
            oVar2.mo14918M(888084991);
            ScaffoldKt.m13747a((C8767m) null, (C3036d1) null, C8553b.m31048b(oVar2, -1125755392, true, new CheckoutStep2ScreenKt$CheckoutStep2Stateful$1(aVar3, i2)), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(oVar2, -1686278663, true, new CheckoutStep2ScreenKt$CheckoutStep2Stateful$2(L)), oVar2, C22132b.f56831b, 12582912, 131067);
            oVar2.mo15002m0();
        } else {
            o.mo14918M(888085571);
            Variant l = m104375l(z0Var2);
            boolean i3 = m104372i(b6);
            Basket basket2 = basket;
            boolean z = i3;
            C3036d1 d1Var2 = f;
            C26105b f2 = m104369f(b3);
            C28892e<String> g = m104370g(b4);
            boolean j = m104373j(b7);
            C3036d1 d1Var3 = d1Var2;
            boolean k = m104374k(b8);
            C8592o oVar3 = o;
            Basket basket3 = basket2;
            CheckoutStep2ScreenKt$CheckoutStep2Stateful$3 checkoutStep2ScreenKt$CheckoutStep2Stateful$3 = r3;
            CheckoutStep2ScreenKt$CheckoutStep2Stateful$3 checkoutStep2ScreenKt$CheckoutStep2Stateful$32 = new CheckoutStep2ScreenKt$CheckoutStep2Stateful$3(checkoutStep2ViewModel2);
            z0Var = z0Var2;
            CheckoutStep2ScreenKt$CheckoutStep2Stateful$4 checkoutStep2ScreenKt$CheckoutStep2Stateful$4 = r3;
            CheckoutStep2ScreenKt$CheckoutStep2Stateful$4 checkoutStep2ScreenKt$CheckoutStep2Stateful$42 = new CheckoutStep2ScreenKt$CheckoutStep2Stateful$4(checkoutStep2ViewModel2);
            CheckoutStep2ScreenKt$CheckoutStep2Stateful$5 checkoutStep2ScreenKt$CheckoutStep2Stateful$5 = r3;
            CheckoutStep2ScreenKt$CheckoutStep2Stateful$5 checkoutStep2ScreenKt$CheckoutStep2Stateful$52 = new CheckoutStep2ScreenKt$CheckoutStep2Stateful$5(checkoutStep2ViewModel2);
            CheckoutStep2ScreenKt$CheckoutStep2Stateful$6 checkoutStep2ScreenKt$CheckoutStep2Stateful$6 = r3;
            CheckoutStep2ScreenKt$CheckoutStep2Stateful$6 checkoutStep2ScreenKt$CheckoutStep2Stateful$62 = new CheckoutStep2ScreenKt$CheckoutStep2Stateful$6(checkoutStep2ViewModel2);
            CheckoutStep2ScreenKt$CheckoutStep2Stateful$7 checkoutStep2ScreenKt$CheckoutStep2Stateful$7 = r3;
            CheckoutStep2ScreenKt$CheckoutStep2Stateful$7 checkoutStep2ScreenKt$CheckoutStep2Stateful$72 = new CheckoutStep2ScreenKt$CheckoutStep2Stateful$7(aVar4, basket3, lVar2, b8);
            oVar2 = oVar3;
            d1Var = d1Var3;
            int i4 = i2;
            m104364a(d1Var3, l, basket3, z, aVar5, address, f2, g, j, k, aVar2, checkoutStep2ScreenKt$CheckoutStep2Stateful$3, checkoutStep2ScreenKt$CheckoutStep2Stateful$4, checkoutStep2ScreenKt$CheckoutStep2Stateful$5, checkoutStep2ScreenKt$CheckoutStep2Stateful$6, aVar3, checkoutStep2ScreenKt$CheckoutStep2Stateful$7, oVar2, (C28892e.f70778a << 21) | 262656, ((i2 >> 6) & 14) | ((i2 << 6) & 458752));
            oVar2.mo15002m0();
        }
        String d = C16018i.m71858d(R.string.checkout_book_slot_reserved, oVar2, 0);
        String d2 = C16018i.m71858d(R.string.checkout_step2_promo_code_delete_error, oVar2, 0);
        FlowKt.m118808a(checkoutStep2ViewModel.mo75764w0(), (Lifecycle) null, (Lifecycle.State) null, new C23387a(d1Var, d, d2, z0Var), oVar2, 8, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutStep2ScreenKt$CheckoutStep2Stateful$9(checkoutStep2ViewModel, aVar, aVar2, aVar3, lVar, i));
        }
    }

    /* renamed from: c */
    public static final C28892e<C26102a> m104366c(C8578k2<? extends C28892e<? extends C26102a>> k2Var) {
        return (C28892e) k2Var.getValue();
    }

    /* renamed from: d */
    public static final C28892e<Address> m104367d(C8578k2<? extends C28892e<Address>> k2Var) {
        return (C28892e) k2Var.getValue();
    }

    /* renamed from: e */
    public static final void m104368e(C8700z0<Variant> z0Var, Variant variant) {
        z0Var.setValue(variant);
    }

    /* renamed from: f */
    public static final C26105b m104369f(C8578k2<? extends C26105b> k2Var) {
        return (C26105b) k2Var.getValue();
    }

    /* renamed from: g */
    public static final C28892e<String> m104370g(C8578k2<? extends C28892e<String>> k2Var) {
        return (C28892e) k2Var.getValue();
    }

    /* renamed from: h */
    public static final C28892e<Basket> m104371h(C8578k2<? extends C28892e<Basket>> k2Var) {
        return (C28892e) k2Var.getValue();
    }

    /* renamed from: i */
    public static final boolean m104372i(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    /* renamed from: j */
    public static final boolean m104373j(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    /* renamed from: k */
    public static final boolean m104374k(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    /* renamed from: l */
    public static final Variant m104375l(C8700z0<Variant> z0Var) {
        return z0Var.getValue();
    }

    @C8540g
    @C16464c(showBackground = true, widthDp = 450)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: m */
    public static final void m104376m(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(-1097523175);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1097523175, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.DeliveryPreview (CheckoutStep2Screen.kt:533)");
            }
            Address address = new Address("FRANCE", (String) null, (String) null, "Paris", "1 Rue Rivoli", "75001", (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, AddressCategory.DELIVERY, 0, false, 0.0d, 0.0d, (Boolean) null, (String) null, 1040326, (DefaultConstructorMarker) null);
            C26102a.C26103a aVar = new C26102a.C26103a(address, "0612234556");
            BasketAmounts basketAmounts = r6;
            BasketAmounts basketAmounts2 = new BasketAmounts(0, 3.5d, 11.0d, 0.49d, 10.1d, 12.0d, 3.0d, 8.0d, 10.1d, 14.0d, 164.41d, 11.8d, 10.0d, 2.34d, 1, (DefaultConstructorMarker) null);
            BasketPromotionCode basketPromotionCode = r8;
            BasketPromotionCode basketPromotionCode2 = new BasketPromotionCode(5.0d, "NOEL10");
            ThemeKt.m153788a(C8553b.m31048b(o, 1297117494, true, new CheckoutStep2ScreenKt$DeliveryPreview$1(new Basket(basketAmounts, (List) null, (List) null, (String) null, false, (BasketLoyaltyCard) null, (List) null, (String) null, 3, basketPromotionCode, (Map) null, (String) null, (BasketServiceType) null, (BasketSlot) null, (String) null, (BasketType) null, (Integer) null, (List) null, (BasketReturnableBags) null, 523518, (DefaultConstructorMarker) null), aVar, address, new C26105b.C26107b(new Slot((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (Double) null, (String) null, false, 2047, (DefaultConstructorMarker) null), true), basketPromotionCode2)), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutStep2ScreenKt$DeliveryPreview$2(i2));
        }
    }

    @C8540g
    @C16464c(showBackground = true, widthDp = 450)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: n */
    public static final void m104377n(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(-1796754797);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1796754797, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.DrivePreview (CheckoutStep2Screen.kt:671)");
            }
            Address address = new Address("FRANCE", (String) null, (String) null, "Paris", "1 Rue Rivoli", "75001", (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, AddressCategory.DELIVERY, 0, false, 0.0d, 0.0d, (Boolean) null, (String) null, 1040326, (DefaultConstructorMarker) null);
            C26102a.C26104b bVar = new C26102a.C26104b(new StoreAddress((StoreCoordinates) null, "1 Rue Rivoli", (String) null, "Paris", "75001", 5, (DefaultConstructorMarker) null));
            BasketAmounts basketAmounts = r6;
            BasketAmounts basketAmounts2 = new BasketAmounts(0, 3.5d, 11.0d, 0.49d, 10.1d, 12.0d, 3.0d, 8.0d, 10.1d, 14.0d, 164.41d, 11.8d, 10.0d, 2.34d, 1, (DefaultConstructorMarker) null);
            BasketPromotionCode basketPromotionCode = r8;
            BasketPromotionCode basketPromotionCode2 = new BasketPromotionCode(5.0d, "NOEL10");
            ThemeKt.m153788a(C8553b.m31048b(o, -1919795562, true, new CheckoutStep2ScreenKt$DrivePreview$1(new Basket(basketAmounts, (List) null, (List) null, (String) null, false, (BasketLoyaltyCard) null, (List) null, (String) null, 3, basketPromotionCode, (Map) null, (String) null, (BasketServiceType) null, (BasketSlot) null, (String) null, (BasketType) null, (Integer) null, (List) null, (BasketReturnableBags) null, 523518, (DefaultConstructorMarker) null), bVar, address, new C26105b.C26107b(new Slot((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (Double) null, (String) null, false, 2047, (DefaultConstructorMarker) null), true), basketPromotionCode2)), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutStep2ScreenKt$DrivePreview$2(i2));
        }
    }

    @C8540g
    @C16464c(showBackground = true, widthDp = 450)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: o */
    public static final void m104378o(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(842162339);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(842162339, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.DriveWithExpressSlotPreview (CheckoutStep2Screen.kt:596)");
            }
            Address address = new Address("FRANCE", (String) null, (String) null, "Paris", "1 Rue Rivoli", "75001", (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, AddressCategory.DELIVERY, 0, false, 0.0d, 0.0d, (Boolean) null, (String) null, 1040326, (DefaultConstructorMarker) null);
            C26102a.C26104b bVar = new C26102a.C26104b(new StoreAddress((StoreCoordinates) null, "1 Rue Rivoli", (String) null, "Paris", "75001", 5, (DefaultConstructorMarker) null));
            BasketAmounts basketAmounts = r6;
            BasketAmounts basketAmounts2 = new BasketAmounts(0, 3.5d, 11.0d, 0.49d, 10.1d, 12.0d, 3.0d, 8.0d, 10.1d, 14.0d, 164.41d, 11.8d, 10.0d, 2.34d, 1, (DefaultConstructorMarker) null);
            BasketPromotionCode basketPromotionCode = r8;
            BasketPromotionCode basketPromotionCode2 = new BasketPromotionCode(5.0d, "NOEL10");
            Basket basket = new Basket(basketAmounts, (List) null, (List) null, (String) null, false, (BasketLoyaltyCard) null, (List) null, (String) null, 3, basketPromotionCode, (Map) null, (String) null, (BasketServiceType) null, (BasketSlot) null, (String) null, (BasketType) null, (Integer) null, (List) null, (BasketReturnableBags) null, 523518, (DefaultConstructorMarker) null);
            LocalDateTime now = LocalDateTime.now();
            Address address2 = address;
            ThemeKt.m153788a(C8553b.m31048b(o, -95162816, true, new CheckoutStep2ScreenKt$DriveWithExpressSlotPreview$1(basket, bVar, address2, new C26105b.C26108c(new SlotExpress("id", DesugarDate.from(now.mo137951J(ZoneId.systemDefault()).toInstant()), DesugarDate.from(now.plusHours(2).mo137951J(ZoneId.systemDefault()).toInstant()))), basketPromotionCode2)), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutStep2ScreenKt$DriveWithExpressSlotPreview$2(i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: p */
    public static final void m104379p(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(974946181);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(974946181, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.LoadingScreen (CheckoutStep2Screen.kt:516)");
            }
            float f = 0.0f;
            C8767m l = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(l);
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
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            o.mo14918M(-518585090);
            int i3 = 0;
            while (i3 < 5) {
                BlockDividerKt.m104587a(o, 0);
                C8767m b3 = C37019o.m151909b(SizeKt.m10115o(SizeKt.m10114n(PaddingKt.m10026m(C8767m.f23478j, C16483g.m74435M((float) 16), f, 2, (Object) null), f, 1, (Object) null), C16483g.m74435M((float) 85)), true, (C15218g4) null, 2, (Object) null);
                o.mo14918M(693286680);
                C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion2 = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a2 = companion2.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(b3);
                if (!(o.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                o.mo14938T();
                if (o.mo14997l()) {
                    o.mo14947W(a2);
                } else {
                    o.mo14888A();
                }
                o.mo14941U();
                C8592o b4 = Updater.m30180b(o);
                Updater.m30188j(b4, d, companion2.mo44588d());
                Updater.m30188j(b4, dVar2, companion2.mo44586b());
                Updater.m30188j(b4, layoutDirection2, companion2.mo44587c());
                Updater.m30188j(b4, c4Var2, companion2.mo44590f());
                o.mo14972e();
                f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
                i3++;
                f = 0.0f;
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
            s.mo15202a(new CheckoutStep2ScreenKt$LoadingScreen$2(i2));
        }
    }
}
