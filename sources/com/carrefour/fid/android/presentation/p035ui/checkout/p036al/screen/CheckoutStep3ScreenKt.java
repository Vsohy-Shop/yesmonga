package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.foundation.text.C2762c;
import androidx.compose.material.C3036d1;
import androidx.compose.material.C7933t0;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
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
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.design.components.compose.Variant;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.BlockDividerKt;
import com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.event.C26122a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.C26132a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.PaymentType;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
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

@C11363r0({"SMAP\nCheckoutStep3Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep3Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep3ScreenKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,650:1\n25#2:651\n25#2:658\n25#2:665\n36#2:672\n460#2,13:698\n460#2,13:733\n473#2,3:747\n473#2,3:752\n460#2,13:776\n473#2,3:792\n460#2,13:817\n460#2,13:858\n473#2,3:872\n460#2,13:901\n473#2,3:915\n473#2,3:920\n1114#3,6:652\n1114#3,6:659\n1114#3,6:666\n1114#3,6:673\n74#4,6:679\n80#4:711\n84#4:756\n74#4,6:757\n80#4:789\n84#4:796\n74#4,6:798\n80#4:830\n84#4:924\n75#5:685\n76#5,11:687\n75#5:720\n76#5,11:722\n89#5:750\n89#5:755\n75#5:763\n76#5,11:765\n89#5:795\n75#5:804\n76#5,11:806\n75#5:845\n76#5,11:847\n89#5:875\n75#5:888\n76#5,11:890\n89#5:918\n89#5:923\n76#6:686\n76#6:721\n76#6:764\n76#6:805\n76#6:846\n76#6:889\n154#7:712\n154#7:713\n154#7:790\n154#7:791\n154#7:797\n154#7:877\n154#7:878\n154#7:879\n154#7:880\n75#8,6:714\n81#8:746\n85#8:751\n74#8,7:838\n81#8:871\n85#8:876\n74#8,7:881\n81#8:914\n85#8:919\n1098#9:831\n927#9,6:832\n76#10:925\n76#10:926\n76#10:927\n76#10:928\n76#10:929\n76#10:930\n76#10:931\n76#10:932\n76#10:933\n102#10,2:934\n76#10:936\n102#10,2:937\n76#10:939\n102#10,2:940\n*S KotlinDebug\n*F\n+ 1 CheckoutStep3Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep3ScreenKt\n*L\n107#1:651\n108#1:658\n156#1:665\n229#1:672\n433#1:698,13\n436#1:733,13\n436#1:747,3\n433#1:752,3\n454#1:776,13\n454#1:792,3\n521#1:817,13\n538#1:858,13\n538#1:872,3\n557#1:901,13\n557#1:915,3\n521#1:920,3\n107#1:652,6\n108#1:659,6\n156#1:666,6\n229#1:673,6\n433#1:679,6\n433#1:711\n433#1:756\n454#1:757,6\n454#1:789\n454#1:796\n521#1:798,6\n521#1:830\n521#1:924\n433#1:685\n433#1:687,11\n436#1:720\n436#1:722,11\n436#1:750\n433#1:755\n454#1:763\n454#1:765,11\n454#1:795\n521#1:804\n521#1:806,11\n538#1:845\n538#1:847,11\n538#1:875\n557#1:888\n557#1:890,11\n557#1:918\n521#1:923\n433#1:686\n436#1:721\n454#1:764\n521#1:805\n538#1:846\n557#1:889\n438#1:712\n440#1:713\n463#1:790\n468#1:791\n524#1:797\n541#1:877\n548#1:878\n556#1:879\n558#1:880\n436#1:714,6\n436#1:746\n436#1:751\n538#1:838,7\n538#1:871\n538#1:876\n557#1:881,7\n557#1:914\n557#1:919\n527#1:831\n530#1:832,6\n93#1:925\n94#1:926\n95#1:927\n96#1:928\n97#1:929\n98#1:930\n99#1:931\n100#1:932\n107#1:933\n107#1:934,2\n108#1:936\n108#1:937,2\n156#1:939\n156#1:940,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt */
public final class CheckoutStep3ScreenKt {

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$a */
    public static final class C23418a implements C11908f<C26122a> {

        /* renamed from: a */
        public final /* synthetic */ C11300l<String, C11079d2> f59231a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<String, C11079d2> f59232b;

        /* renamed from: c */
        public final /* synthetic */ C3036d1 f59233c;

        /* renamed from: d */
        public final /* synthetic */ String f59234d;

        /* renamed from: e */
        public final /* synthetic */ C11289a<C11079d2> f59235e;

        /* renamed from: f */
        public final /* synthetic */ C11300l<C26122a.C26126d, C11079d2> f59236f;

        /* renamed from: g */
        public final /* synthetic */ String f59237g;

        /* renamed from: v */
        public final /* synthetic */ String f59238v;

        /* renamed from: w */
        public final /* synthetic */ C8700z0<String> f59239w;

        /* renamed from: x */
        public final /* synthetic */ C8700z0<Variant> f59240x;

        public C23418a(C11300l<? super String, C11079d2> lVar, C11300l<? super String, C11079d2> lVar2, C3036d1 d1Var, String str, C11289a<C11079d2> aVar, C11300l<? super C26122a.C26126d, C11079d2> lVar3, String str2, String str3, C8700z0<String> z0Var, C8700z0<Variant> z0Var2) {
            this.f59231a = lVar;
            this.f59232b = lVar2;
            this.f59233c = d1Var;
            this.f59234d = str;
            this.f59235e = aVar;
            this.f59236f = lVar3;
            this.f59237g = str2;
            this.f59238v = str3;
            this.f59239w = z0Var;
            this.f59240x = z0Var2;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C26122a aVar, @C12579k C11045c<? super C11079d2> cVar) {
            if (aVar instanceof C26122a.C26123a) {
                CheckoutStep3ScreenKt.m104418j(this.f59239w, ((C26122a.C26123a) aVar).mo75882d());
            } else if (aVar instanceof C26122a.C26124b) {
                this.f59231a.invoke(((C26122a.C26124b) aVar).mo75888d());
            } else if (Intrinsics.areEqual((Object) aVar, (Object) C26122a.C26125c.f63867a)) {
                CheckoutStep3ScreenKt.m104418j(this.f59239w, (String) null);
            } else if (aVar instanceof C26122a.C26130h) {
                this.f59232b.invoke(((C26122a.C26130h) aVar).mo75902d());
            } else if (Intrinsics.areEqual((Object) aVar, (Object) C26122a.C26128f.f63874a)) {
                CheckoutStep3ScreenKt.m104414f(this.f59240x, Variant.Error);
                Object e = SnackbarHostState.m13855e(this.f59233c.mo10747b(), this.f59234d, (String) null, (SnackbarDuration) null, cVar, 6, (Object) null);
                if (e == C11063b.m42612h()) {
                    return e;
                }
                return C11079d2.f28267a;
            } else if (Intrinsics.areEqual((Object) aVar, (Object) C26122a.C26131i.f63880a)) {
                this.f59235e.invoke();
            } else if (aVar instanceof C26122a.C26126d) {
                this.f59236f.invoke(aVar);
            } else if (Intrinsics.areEqual((Object) aVar, (Object) C26122a.C26127e.f63872a)) {
                CheckoutStep3ScreenKt.m104414f(this.f59240x, Variant.Error);
                Object e2 = SnackbarHostState.m13855e(this.f59233c.mo10747b(), this.f59237g, (String) null, (SnackbarDuration) null, cVar, 6, (Object) null);
                if (e2 == C11063b.m42612h()) {
                    return e2;
                }
                return C11079d2.f28267a;
            } else if (Intrinsics.areEqual((Object) aVar, (Object) C26122a.C26129g.f63876a)) {
                CheckoutStep3ScreenKt.m104414f(this.f59240x, Variant.Error);
                Object e3 = SnackbarHostState.m13855e(this.f59233c.mo10747b(), this.f59238v, (String) null, (SnackbarDuration) null, cVar, 6, (Object) null);
                if (e3 == C11063b.m42612h()) {
                    return e3;
                }
                return C11079d2.f28267a;
            }
            return C11079d2.f28267a;
        }
    }

    /* renamed from: J */
    public static final void m104402J(LazyListScope lazyListScope) {
        LazyListScope.m10824g(lazyListScope, "alcohol", (Object) null, ComposableSingletons$CheckoutStep3ScreenKt.f59245a.mo68606c(), 2, (Object) null);
    }

    /* renamed from: K */
    public static final boolean m104403K(C28892e<Basket> eVar) {
        return eVar instanceof C28892e.C28893a;
    }

    /* renamed from: L */
    public static final void m104404L(LazyListScope lazyListScope, C26132a aVar, PaymentType paymentType, C11300l<? super Boolean, C11079d2> lVar, C11300l<? super Double, C11079d2> lVar2) {
        if (aVar != null) {
            LazyListScope.m10824g(lazyListScope, aVar.mo75917k(), (Object) null, C8553b.m31049c(1892430047, true, new CheckoutStep3ScreenKt$loyaltySection$1(aVar, paymentType, lVar, lVar2)), 2, (Object) null);
        }
    }

    /* renamed from: M */
    public static final void m104405M(LazyListScope lazyListScope, PaymentType paymentType, String str) {
        LazyListScope.m10824g(lazyListScope, "payment-methods", (Object) null, C8553b.m31049c(-656649573, true, new CheckoutStep3ScreenKt$paymentMethodsSection$1(paymentType, str)), 2, (Object) null);
    }

    /* renamed from: N */
    public static final void m104406N(LazyListScope lazyListScope, boolean z, PaymentType paymentType, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2) {
        if (z) {
            LazyListScope.m10824g(lazyListScope, "payment-type", (Object) null, C8553b.m31049c(919895845, true, new CheckoutStep3ScreenKt$paymentTypeSection$1(paymentType, aVar, aVar2)), 2, (Object) null);
        }
    }

    /* renamed from: O */
    public static final void m104407O(LazyListScope lazyListScope, LazyListState lazyListState, C28892e<String> eVar, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar) {
        LazyListScope.m10824g(lazyListScope, "promo-code", (Object) null, C8553b.m31049c(-1972095472, true, new CheckoutStep3ScreenKt$promoCodeSection$1(eVar, lVar, aVar, lazyListState, "promo-code")), 2, (Object) null);
    }

    /* renamed from: P */
    public static final void m104408P(LazyListScope lazyListScope) {
        LazyListScope.m10824g(lazyListScope, "3d-secure", (Object) null, ComposableSingletons$CheckoutStep3ScreenKt.f59245a.mo68605b(), 2, (Object) null);
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104409a(C3036d1 d1Var, Variant variant, boolean z, PaymentType paymentType, C26132a aVar, String str, Basket basket, C28892e<String> eVar, boolean z2, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11300l<? super Boolean, C11079d2> lVar, C11300l<? super Double, C11079d2> lVar2, C11300l<? super String, C11079d2> lVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, C11289a<C11079d2> aVar7, C8592o oVar, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        C8592o o = oVar.mo15009o(-19408710);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-19408710, i3, i4, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3Screen (CheckoutStep3Screen.kt:241)");
        }
        C3036d1 d1Var2 = d1Var;
        C8592o oVar2 = o;
        ScaffoldKt.m13747a((C8767m) null, d1Var2, C8553b.m31048b(o, 1091820757, true, new CheckoutStep3ScreenKt$CheckoutStep3Screen$1(aVar6, i4)), C8553b.m31048b(o, -26359756, true, new CheckoutStep3ScreenKt$CheckoutStep3Screen$2(basket, z2, aVar7, aVar5, i, i2)), C8553b.m31048b(o, 1112493409, true, new CheckoutStep3ScreenKt$CheckoutStep3Screen$3(variant, i3)), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(o, -679487172, true, new CheckoutStep3ScreenKt$CheckoutStep3Screen$4(LazyListStateKt.m10895a(0, 0, o, 0, 3), z, paymentType, aVar2, aVar3, eVar, lVar3, aVar4, aVar, lVar, lVar2, str)), oVar2, ((i3 << 3) & 112) | 28032, 12582912, 131041);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            CheckoutStep3ScreenKt$CheckoutStep3Screen$5 checkoutStep3ScreenKt$CheckoutStep3Screen$5 = r0;
            CheckoutStep3ScreenKt$CheckoutStep3Screen$5 checkoutStep3ScreenKt$CheckoutStep3Screen$52 = new CheckoutStep3ScreenKt$CheckoutStep3Screen$5(d1Var, variant, z, paymentType, aVar, str, basket, eVar, z2, aVar2, aVar3, lVar, lVar2, lVar3, aVar4, aVar5, aVar6, aVar7, i, i2);
            s.mo15202a(checkoutStep3ScreenKt$CheckoutStep3Screen$5);
        }
    }

    @C8540g
    @C16464c(heightDp = 900, showBackground = true, widthDp = 400)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104410b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-122740747);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-122740747, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenPreview (CheckoutStep3Screen.kt:582)");
            }
            ThemeKt.m153788a(ComposableSingletons$CheckoutStep3ScreenKt.f59245a.mo68607d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutStep3ScreenKt$CheckoutStep3ScreenPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104411c(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel r46, boolean r47, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r48, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r49, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r50, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r51, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r52, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.event.C26122a.C26126d, kotlin.C11079d2> r53, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r54, int r55) {
        /*
            r6 = r46
            r7 = r47
            r5 = r48
            r4 = r55
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onBackPressed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onFidCardBlocked"
            r3 = r49
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "onResetSecretCode"
            r2 = r50
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "onCgvClicked"
            r1 = r51
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onSlotError"
            r14 = r52
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "onNextStepNavigation"
            r12 = r53
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 1366121897(0x516d5da9, float:6.3717413E10)
            r8 = r54
            androidx.compose.runtime.o r8 = r8.mo15009o(r0)
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x004a
            r9 = -1
            java.lang.String r10 = "com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3Stateful (CheckoutStep3Screen.kt:82)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r9, r10)
        L_0x004a:
            kotlinx.coroutines.flow.u r0 = r46.mo75821C0()
            r13 = 0
            r9 = 8
            r11 = 1
            androidx.compose.runtime.k2 r0 = androidx.compose.runtime.C8415c2.m30233b(r0, r13, r8, r9, r11)
            kotlinx.coroutines.flow.u r10 = r46.mo75848y0()
            androidx.compose.runtime.k2 r10 = androidx.compose.runtime.C8415c2.m30233b(r10, r13, r8, r9, r11)
            kotlinx.coroutines.flow.u r15 = r46.mo75819A0()
            androidx.compose.runtime.k2 r15 = androidx.compose.runtime.C8415c2.m30233b(r15, r13, r8, r9, r11)
            kotlinx.coroutines.flow.u r1 = r46.mo75849z0()
            androidx.compose.runtime.k2 r1 = androidx.compose.runtime.C8415c2.m30233b(r1, r13, r8, r9, r11)
            kotlinx.coroutines.flow.u r2 = r46.mo75824F0()
            androidx.compose.runtime.k2 r42 = androidx.compose.runtime.C8415c2.m30233b(r2, r13, r8, r9, r11)
            kotlinx.coroutines.flow.u r2 = r46.mo75822D0()
            androidx.compose.runtime.k2 r2 = androidx.compose.runtime.C8415c2.m30233b(r2, r13, r8, r9, r11)
            kotlinx.coroutines.flow.u r3 = r46.mo75847x0()
            androidx.compose.runtime.k2 r3 = androidx.compose.runtime.C8415c2.m30233b(r3, r13, r8, r9, r11)
            kotlinx.coroutines.flow.u r12 = r46.mo75820B0()
            androidx.compose.runtime.k2 r12 = androidx.compose.runtime.C8415c2.m30233b(r12, r13, r8, r9, r11)
            com.carrefour.fid.android.shared.type.e r1 = m104420l(r1)
            java.lang.Object r1 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r1)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.a r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.C26132a) r1
            com.carrefour.fid.android.shared.type.e r9 = m104423o(r3)
            java.lang.Object r9 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r9)
            r23 = r9
            com.carrefour.fid.android.domain.models.basket.Basket r23 = (com.carrefour.fid.android.domain.models.basket.Basket) r23
            com.carrefour.fid.android.shared.type.e r3 = m104423o(r3)
            boolean r3 = m104403K(r3)
            r9 = 3
            r11 = 0
            androidx.compose.material.d1 r43 = androidx.compose.material.ScaffoldKt.m13752f(r13, r13, r8, r11, r9)
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.mo14918M(r9)
            java.lang.Object r11 = r8.mo14921N()
            androidx.compose.runtime.o$a r44 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r44.mo16277a()
            r16 = r15
            r15 = 2
            if (r11 != r9) goto L_0x00d0
            com.carrefour.fid.android.design.components.compose.Variant r9 = com.carrefour.fid.android.design.components.compose.Variant.Success
            androidx.compose.runtime.z0 r11 = androidx.compose.runtime.C8539f2.m30981g(r9, r13, r15, r13)
            r8.mo14893C(r11)
        L_0x00d0:
            r8.mo15002m0()
            r45 = r11
            androidx.compose.runtime.z0 r45 = (androidx.compose.runtime.C8700z0) r45
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.mo14918M(r9)
            java.lang.Object r11 = r8.mo14921N()
            java.lang.Object r9 = r44.mo16277a()
            if (r11 != r9) goto L_0x00f0
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r11 = androidx.compose.runtime.C8539f2.m30981g(r9, r13, r15, r13)
            r8.mo14893C(r11)
        L_0x00f0:
            r8.mo15002m0()
            androidx.compose.runtime.z0 r11 = (androidx.compose.runtime.C8700z0) r11
            if (r23 != 0) goto L_0x014e
            r0 = 691571454(0x29388afe, float:4.0976764E-14)
            r8.mo14918M(r0)
            r0 = 0
            r9 = r15
            r15 = r0
            r16 = 0
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$1 r0 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$1
            r0.<init>(r5, r4)
            r1 = -307480247(0xffffffffedac3949, float:-6.6625844E27)
            r2 = 1
            androidx.compose.runtime.internal.a r17 = androidx.compose.runtime.internal.C8553b.m31048b(r8, r1, r2, r0)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$2 r0 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$2
            r0.<init>(r3)
            r1 = -1341845456(0xffffffffb0051030, float:-4.840812E-10)
            r3 = 1
            androidx.compose.runtime.internal.a r37 = androidx.compose.runtime.internal.C8553b.m31048b(r8, r1, r3, r0)
            r39 = 384(0x180, float:5.38E-43)
            r40 = 12582912(0xc00000, float:1.7632415E-38)
            r41 = 131067(0x1fffb, float:1.83664E-40)
            r38 = r8
            androidx.compose.material.ScaffoldKt.m13747a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40, r41)
            r8.mo15002m0()
            r0 = r8
            r2 = r11
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            goto L_0x01cd
        L_0x014e:
            r9 = r15
            r3 = 1
            r15 = 691572036(0x29388d44, float:4.0978736E-14)
            r8.mo14918M(r15)
            com.carrefour.fid.android.design.components.compose.Variant r15 = m104425q(r45)
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9 = r15
            boolean r10 = m104413e(r10)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.PaymentType r0 = m104412d(r0)
            r15 = r11
            r11 = r0
            java.lang.String r0 = m104419k(r16)
            r13 = r0
            com.carrefour.fid.android.shared.type.e r0 = m104422n(r2)
            r2 = r15
            r15 = r0
            boolean r16 = m104424p(r12)
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$3 r0 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$3
            r17 = r0
            r0.<init>(r6)
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$4 r0 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$4
            r18 = r0
            r0.<init>(r6)
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$5 r0 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$5
            r19 = r0
            r0.<init>(r6)
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$6 r0 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$6
            r20 = r0
            r0.<init>(r6)
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$7 r0 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$7
            r21 = r0
            r0.<init>(r6)
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$8 r0 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$8
            r22 = r0
            r0.<init>(r6)
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$9 r0 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$9
            r25 = r0
            r0.<init>(r6, r7, r2)
            int r0 = com.carrefour.fid.android.shared.type.C28892e.f70778a
            int r0 = r0 << 21
            r12 = 2097152(0x200000, float:2.938736E-39)
            r27 = r0 | r12
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r4
            int r12 = r4 << 12
            r24 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r24
            r28 = r0 | r12
            r0 = r8
            r8 = r43
            r12 = r1
            r14 = r23
            r23 = r51
            r24 = r48
            r26 = r0
            m104409a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0.mo15002m0()
        L_0x01cd:
            r0.mo14918M(r3)
            java.lang.Object r1 = r0.mo14921N()
            java.lang.Object r3 = r44.mo16277a()
            if (r1 != r3) goto L_0x01e3
            r3 = 2
            r8 = 0
            androidx.compose.runtime.z0 r1 = androidx.compose.runtime.C8539f2.m30981g(r8, r8, r3, r8)
            r0.mo14893C(r1)
        L_0x01e3:
            r0.mo15002m0()
            androidx.compose.runtime.z0 r1 = (androidx.compose.runtime.C8700z0) r1
            r3 = 2131952233(0x7f130269, float:1.9540903E38)
            r15 = 0
            java.lang.String r12 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r0, r15)
            r3 = 2131952134(0x7f130206, float:1.9540702E38)
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r0, r15)
            r8 = 2131952106(0x7f1301ea, float:1.9540645E38)
            java.lang.String r16 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r0, r15)
            kotlinx.coroutines.flow.e r19 = r46.getEvents()
            r20 = 0
            r21 = 0
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$a r22 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$a
            r8 = r22
            r9 = r49
            r10 = r50
            r11 = r43
            r13 = r52
            r14 = r53
            r7 = r15
            r15 = r3
            r17 = r1
            r18 = r45
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r13 = 8
            r14 = 6
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r0
            com.carrefour.fid.android.shared.extension.FlowKt.m118808a(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r3 = m104417i(r1)
            r8 = 691575098(0x2938993a, float:4.098911E-14)
            r0.mo14918M(r8)
            if (r3 == 0) goto L_0x0271
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$11 r8 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$11
            r8.<init>(r6, r1)
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.ComposableSingletons$CheckoutStep3ScreenKt r1 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.ComposableSingletons$CheckoutStep3ScreenKt.f59245a
            kotlin.jvm.functions.p r9 = r1.mo68604a()
            r10 = 0
            r11 = 0
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$12 r12 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$12
            r14 = r0
            r0 = r12
            r1 = r46
            r15 = r2
            r2 = r50
            r4 = r55
            r5 = r42
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -188532510(0xfffffffff4c338e2, float:-1.2373677E32)
            r1 = 1
            androidx.compose.runtime.internal.a r12 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r0, r1, r12)
            r13 = 0
            r0 = 0
            r16 = 0
            r18 = 0
            r20 = 24624(0x6030, float:3.4506E-41)
            r21 = 492(0x1ec, float:6.9E-43)
            r2 = r14
            r3 = r15
            r14 = r0
            r19 = r2
            androidx.compose.material.AndroidAlertDialog_androidKt.m13201b(r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21)
            goto L_0x0273
        L_0x0271:
            r3 = r2
            r2 = r0
        L_0x0273:
            r2.mo15002m0()
            boolean r0 = m104415g(r3)
            if (r0 == 0) goto L_0x02cf
            r0 = 2131952130(0x7f130202, float:1.9540694E38)
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r2, r7)
            r0 = 2131952129(0x7f130201, float:1.9540692E38)
            java.lang.String r10 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r2, r7)
            r0 = 2131952815(0x7f1304af, float:1.9542083E38)
            java.lang.String r11 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r2, r7)
            r0 = 2131952781(0x7f13048d, float:1.9542014E38)
            java.lang.String r12 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r2, r7)
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$13 r13 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$13
            r4 = r47
            r13.<init>(r6, r4, r3)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r0)
            boolean r0 = r2.mo15006n0(r3)
            java.lang.Object r1 = r2.mo14921N()
            if (r0 != 0) goto L_0x02b5
            java.lang.Object r0 = r44.mo16277a()
            if (r1 != r0) goto L_0x02bd
        L_0x02b5:
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$14$1 r1 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$14$1
            r1.<init>(r3)
            r2.mo14893C(r1)
        L_0x02bd:
            r2.mo15002m0()
            r14 = r1
            kotlin.jvm.functions.a r14 = (kotlin.jvm.functions.C11289a) r14
            com.carrefour.fid.android.design.components.compose.f$b r0 = new com.carrefour.fid.android.design.components.compose.f$b
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            int r1 = com.carrefour.fid.android.design.components.compose.C36984f.C36986b.f92385g
            com.carrefour.fid.android.design.components.compose.DialogComponentKt.m151480c(r0, r2, r1)
            goto L_0x02d1
        L_0x02cf:
            r4 = r47
        L_0x02d1:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02da
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02da:
            androidx.compose.runtime.t1 r10 = r2.mo15020s()
            if (r10 != 0) goto L_0x02e1
            goto L_0x02fc
        L_0x02e1:
            com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$15 r11 = new com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$15
            r0 = r11
            r1 = r46
            r2 = r47
            r3 = r48
            r4 = r49
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
            r9 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x02fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.CheckoutStep3ScreenKt.m104411c(com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel, boolean, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: d */
    public static final PaymentType m104412d(C8578k2<? extends PaymentType> k2Var) {
        return (PaymentType) k2Var.getValue();
    }

    /* renamed from: e */
    public static final boolean m104413e(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    /* renamed from: f */
    public static final void m104414f(C8700z0<Variant> z0Var, Variant variant) {
        z0Var.setValue(variant);
    }

    /* renamed from: g */
    public static final boolean m104415g(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: h */
    public static final void m104416h(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* renamed from: i */
    public static final String m104417i(C8700z0<String> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: j */
    public static final void m104418j(C8700z0<String> z0Var, String str) {
        z0Var.setValue(str);
    }

    /* renamed from: k */
    public static final String m104419k(C8578k2<String> k2Var) {
        return k2Var.getValue();
    }

    /* renamed from: l */
    public static final C28892e<C26132a> m104420l(C8578k2<? extends C28892e<C26132a>> k2Var) {
        return (C28892e) k2Var.getValue();
    }

    /* renamed from: m */
    public static final C26141a m104421m(C8578k2<C26141a> k2Var) {
        return k2Var.getValue();
    }

    /* renamed from: n */
    public static final C28892e<String> m104422n(C8578k2<? extends C28892e<String>> k2Var) {
        return (C28892e) k2Var.getValue();
    }

    /* renamed from: o */
    public static final C28892e<Basket> m104423o(C8578k2<? extends C28892e<Basket>> k2Var) {
        return (C28892e) k2Var.getValue();
    }

    /* renamed from: p */
    public static final boolean m104424p(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    /* renamed from: q */
    public static final Variant m104425q(C8700z0<Variant> z0Var) {
        return z0Var.getValue();
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: r */
    public static final void m104426r(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(778432676);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(778432676, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.LoadingScreen (CheckoutStep3Screen.kt:431)");
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
            o.mo14918M(-518588056);
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
            s.mo15202a(new CheckoutStep3ScreenKt$LoadingScreen$2(i2));
        }
    }

    /* JADX INFO: finally extract failed */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: s */
    public static final void m104427s(String str, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        String str2 = str;
        int i4 = i;
        C8592o o = oVar.mo15009o(1706086380);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(str2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1706086380, i4, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.PaymentMethodsComponent (CheckoutStep3Screen.kt:519)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 16;
            C8767m k = PaddingKt.m10024k(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(f));
            o.mo14918M(-483455358);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2279l r = arrangement.mo7631r();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(k);
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
            String d = C16018i.m71858d(R.string.checkout_step_three_on_site_to, o, 0);
            C16156d.C16157a aVar3 = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
            aVar3.mo46707l(d);
            aVar3.mo46707l(" : ");
            C16209i0.C16210a aVar4 = C16209i0.f40292b;
            int r2 = aVar3.mo46713r(new C16151c0(0, 0, aVar4.mo46947c(), (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16379, (DefaultConstructorMarker) null));
            try {
                aVar3.mo46707l(str2);
                C11079d2 d2Var = C11079d2.f28267a;
                aVar3.mo46710o(r2);
                C16156d u = aVar3.mo46716u();
                o.mo14918M(693286680);
                C15560f0 d2 = RowKt.m10071d(arrangement.mo7630p(), aVar2.mo17073w(), o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a2 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(aVar);
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
                C8592o b3 = Updater.m30180b(o);
                Updater.m30188j(b3, d2, companion.mo44588d());
                Updater.m30188j(b3, dVar2, companion.mo44586b());
                Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
                Updater.m30188j(b3, c4Var2, companion.mo44590f());
                o.mo14972e();
                f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
                long m = C16506u.m74712m(14);
                C16242u J = C37477d.m153883J();
                C37475b bVar = C37475b.f94185a;
                Arrangement arrangement2 = arrangement;
                float f4 = f;
                C8592o oVar3 = o;
                TextKt.m14197d(u, (C8767m) null, bVar.mo114207D(), m, (C16190e0) null, (C16209i0) null, J, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (Map<String, C2762c>) null, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar3, 3072, 0, 262066);
                oVar3.mo15002m0();
                oVar3.mo14896D();
                oVar3.mo15002m0();
                oVar3.mo15002m0();
                C8592o oVar4 = oVar3;
                C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M((float) 8)), oVar4, 6);
                C8592o oVar5 = oVar3;
                TextKt.m14196c(C16018i.m71858d(R.string.checkout_step_three_on_site_advice, oVar4, 0), (C8767m) null, bVar.mo114207D(), C16506u.m74712m(14), (C16190e0) null, (C16209i0) null, C37477d.m153883J(), 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar5, 3072, 0, 130994);
                C8592o oVar6 = oVar3;
                C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f4)), oVar6, 6);
                TextKt.m14196c(C16018i.m71858d(R.string.checkout_step_three_on_site_accepted, oVar6, 0), (C8767m) null, bVar.mo114207D(), C16506u.m74712m(14), (C16190e0) null, aVar4.mo46947c(), C37477d.m153883J(), 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar5, 199680, 0, 130962);
                oVar2 = oVar3;
                C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f4)), oVar2, 6);
                Arrangement.C2271e z = arrangement2.mo7638z(C16483g.m74435M((float) 10));
                C8734c.C8737c q = aVar2.mo17070q();
                oVar2.mo14918M(693286680);
                C15560f0 d3 = RowKt.m10071d(z, q, oVar2, 54);
                oVar2.mo14918M(-1323940314);
                C16479d dVar3 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection3 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var3 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a3 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(aVar);
                if (!(oVar2.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                oVar2.mo14938T();
                if (oVar2.mo14997l()) {
                    oVar2.mo14947W(a3);
                } else {
                    oVar2.mo14888A();
                }
                oVar2.mo14941U();
                C8592o b4 = Updater.m30180b(oVar2);
                Updater.m30188j(b4, d3, companion.mo44588d());
                Updater.m30188j(b4, dVar3, companion.mo44586b());
                Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
                Updater.m30188j(b4, c4Var3, companion.mo44590f());
                oVar2.mo14972e();
                f5.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar2)), oVar2, 0);
                oVar2.mo14918M(2058660585);
                C8592o oVar7 = oVar2;
                ImageKt.m8967b(C16015f.m71849d(R.drawable.ic_cb_mini, oVar2, 0), C16018i.m71858d(R.string.a11y_checkout_step_3_cb, oVar2, 0), (C8767m) null, (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar7, 8, 124);
                ImageKt.m8967b(C16015f.m71849d(R.drawable.ic_pass_card_mini, oVar2, 0), C16018i.m71858d(R.string.a11y_checkout_step_3_pass, oVar2, 0), (C8767m) null, (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar7, 8, 124);
                ImageKt.m8967b(C16015f.m71849d(R.drawable.ic_visa_mini, oVar2, 0), C16018i.m71858d(R.string.a11y_checkout_step_3_visa, oVar2, 0), (C8767m) null, (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar7, 8, 124);
                ImageKt.m8967b(C16015f.m71849d(R.drawable.ic_mastercard_mini, oVar2, 0), C16018i.m71858d(R.string.a11y_checkout_step_3_mastercard, oVar2, 0), (C8767m) null, (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar7, 8, 124);
                oVar2.mo15002m0();
                oVar2.mo14896D();
                oVar2.mo15002m0();
                oVar2.mo15002m0();
                oVar2.mo15002m0();
                oVar2.mo14896D();
                oVar2.mo15002m0();
                oVar2.mo15002m0();
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
            } catch (Throwable th) {
                aVar3.mo46710o(r2);
                throw th;
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutStep3ScreenKt$PaymentMethodsComponent$2(str2, i4));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: t */
    public static final void m104428t(C8767m mVar, boolean z, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8767m mVar3;
        C8767m.C8768a aVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2 = z;
        C11289a<C11079d2> aVar4 = aVar;
        C11289a<C11079d2> aVar5 = aVar2;
        int i8 = i;
        C8592o o = oVar.mo15009o(451199326);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i8 | 6;
            mVar2 = mVar;
        } else if ((i8 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i8;
        } else {
            mVar2 = mVar;
            i3 = i8;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i8 & 112) == 0) {
            if (o.mo14961b(z2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i8 & 896) == 0) {
            if (o.mo14927P(aVar4)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (o.mo14927P(aVar5)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 5851) != 1170 || !o.mo15011p()) {
            if (i9 != 0) {
                aVar3 = C8767m.f23478j;
            } else {
                aVar3 = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(451199326, i8, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.PaymentTypeComponent (CheckoutStep3Screen.kt:447)");
            }
            C8767m n = SizeKt.m10114n(aVar3, 0.0f, 1, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
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
            mVar3 = aVar3;
            TextKt.m14196c(C16018i.m71858d(R.string.checkout_payment_title, o, 0), (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11097j(), o, 0, 0, 65534);
            C8767m.C8768a aVar6 = C8767m.f23478j;
            C2428y0.m10726a(SizeKt.m10115o(aVar6, C16483g.m74435M((float) 8)), o, 6);
            BoxWithConstraintsKt.m9860a(C8744d.m32514a(SizeKt.m10114n(aVar6, 0.0f, 1, (Object) null), C2694o.m12166h(C16483g.m74435M((float) 5))), (C8734c) null, false, C8553b.m31048b(o, -48836054, true, new CheckoutStep3ScreenKt$PaymentTypeComponent$1$1(z2, aVar4, aVar5)), o, 3072, 6);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            mVar3 = mVar2;
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutStep3ScreenKt$PaymentTypeComponent$2(mVar3, z, aVar, aVar2, i, i2));
        }
    }
}
