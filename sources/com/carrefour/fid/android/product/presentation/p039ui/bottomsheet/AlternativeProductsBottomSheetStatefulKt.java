package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.C15867d1;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.p004ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.hilt.navigation.compose.C19298a;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.viewmodel.compose.C19490c;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.profileinstaller.C20022q;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.design.components.compose.ButtonColor;
import com.carrefour.fid.android.design.components.compose.ButtonComponentKt;
import com.carrefour.fid.android.design.components.compose.ButtonType;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.design.components.compose.MessageComponentKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.domain.models.product.detail.PictureSize;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.analytics.C27631a;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.C27728a;
import com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel;
import com.carrefour.fid.android.shared.extension.FlowKt;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt;
import com.carrefour.fid.android.shared.util.events.SingleEventCoroutineLauncherKt;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.glide.C35325c;
import com.skydoves.landscapist.glide.C35326d;
import com.skydoves.landscapist.palette.BitmapPalette;
import java.util.List;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAlternativeProductsBottomSheetStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlternativeProductsBottomSheetStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/bottomsheet/AlternativeProductsBottomSheetStatefulKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,485:1\n43#2,6:486\n45#3,3:492\n76#4:495\n76#4:496\n76#4:513\n76#4:553\n76#4:602\n76#4:649\n76#4:681\n154#5:497\n154#5:539\n154#5:540\n154#5:549\n154#5:579\n154#5:580\n154#5:581\n154#5:582\n154#5:628\n154#5:629\n154#5:630\n154#5:631\n154#5:632\n154#5:633\n154#5:639\n154#5:640\n154#5:641\n154#5:675\n154#5:676\n154#5:677\n154#5:707\n154#5:708\n154#5:709\n36#6:498\n460#6,13:525\n473#6,3:544\n460#6,13:565\n36#6:583\n473#6,3:590\n460#6,13:614\n473#6,3:634\n460#6,13:661\n460#6,13:693\n473#6,3:710\n473#6,3:715\n1114#7,6:499\n1114#7,6:584\n1#8:505\n74#9,6:506\n80#9:538\n84#9:548\n78#9,2:550\n80#9:578\n84#9:594\n74#9,6:595\n80#9:627\n84#9:638\n78#9,2:678\n80#9:706\n84#9:714\n75#10:512\n76#10,11:514\n89#10:547\n75#10:552\n76#10,11:554\n89#10:593\n75#10:601\n76#10,11:603\n89#10:637\n75#10:648\n76#10,11:650\n75#10:680\n76#10,11:682\n89#10:713\n89#10:718\n1864#11,3:541\n75#12,6:642\n81#12:674\n85#12:719\n*S KotlinDebug\n*F\n+ 1 AlternativeProductsBottomSheetStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/bottomsheet/AlternativeProductsBottomSheetStatefulKt\n*L\n72#1:486,6\n72#1:492,3\n83#1:495\n87#1:496\n174#1:513\n274#1:553\n311#1:602\n339#1:649\n357#1:681\n135#1:497\n181#1:539\n198#1:540\n235#1:549\n281#1:579\n290#1:580\n295#1:581\n302#1:582\n317#1:628\n318#1:629\n319#1:630\n325#1:631\n326#1:632\n327#1:633\n338#1:639\n341#1:640\n342#1:641\n347#1:675\n352#1:676\n361#1:677\n366#1:707\n367#1:708\n372#1:709\n136#1:498\n174#1:525,13\n174#1:544,3\n274#1:565,13\n303#1:583\n274#1:590,3\n311#1:614,13\n311#1:634,3\n339#1:661,13\n357#1:693,13\n357#1:710,3\n339#1:715,3\n136#1:499,6\n303#1:584,6\n174#1:506,6\n174#1:538\n174#1:548\n274#1:550,2\n274#1:578\n274#1:594\n311#1:595,6\n311#1:627\n311#1:638\n357#1:678,2\n357#1:706\n357#1:714\n174#1:512\n174#1:514,11\n174#1:547\n274#1:552\n274#1:554,11\n274#1:593\n311#1:601\n311#1:603,11\n311#1:637\n339#1:648\n339#1:650,11\n357#1:680\n357#1:682,11\n357#1:713\n339#1:718\n215#1:541,3\n339#1:642,6\n339#1:674\n339#1:719\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt */
public final class AlternativeProductsBottomSheetStatefulKt {

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$a */
    public /* synthetic */ class C27697a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.domain.models.product.UnitOfMeasure[] r0 = com.carrefour.fid.android.domain.models.product.UnitOfMeasure.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.product.UnitOfMeasure r1 = com.carrefour.fid.android.domain.models.product.UnitOfMeasure.Liter     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.product.UnitOfMeasure r1 = com.carrefour.fid.android.domain.models.product.UnitOfMeasure.Kilogram     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.product.UnitOfMeasure r1 = com.carrefour.fid.android.domain.models.product.UnitOfMeasure.Unit     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.product.UnitOfMeasure r1 = com.carrefour.fid.android.domain.models.product.UnitOfMeasure.Piece     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.product.UnitOfMeasure r1 = com.carrefour.fid.android.domain.models.product.UnitOfMeasure.Unknown     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt.C27697a.<clinit>():void");
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m116498a(C27631a aVar, List<C38114b> list, C11300l<? super C27728a, C11079d2> lVar, C8592o oVar, int i) {
        Object obj;
        C8592o o = oVar.mo15009o(-113112194);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-113112194, i, -1, "com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductBottomSheetScreen (AlternativeProductsBottomSheetStateful.kt:142)");
        }
        if (list.size() == 1) {
            o.mo14918M(-2122928814);
            List list2 = list.get(0).mo118842j().mo118857H().get(PictureSize.Small);
            if (list2 == null) {
                list2 = CollectionsKt__CollectionsKt.m40441E();
            }
            if (CollectionsKt__CollectionsKt.m40443G(list2) >= 0) {
                obj = list2.get(0);
            } else {
                obj = new ProductPicture("", 0);
            }
            m116503f((ProductPicture) obj, lVar, o, ((i >> 3) & 112) | 8);
            o.mo15002m0();
        } else {
            o.mo14918M(-2122928483);
            m116507j(aVar, list, lVar, o, (i & 896) | 72);
            o.mo15002m0();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C27698x7bf7dfc0(aVar, list, lVar, i));
        }
    }

    @C8540g
    /* renamed from: b */
    public static final void m116499b(C27631a aVar, C28892e<? extends List<C38114b>> eVar, String str, C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1331059017);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1331059017, i, -1, "com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsAnalyticsEvents (AlternativeProductsBottomSheetStateful.kt:379)");
        }
        C27699x487596c7 alternativeProductsBottomSheetStatefulKt$AlternativeProductsAnalyticsEvents$1 = new C27699x487596c7(eVar);
        C27700x487596c8 alternativeProductsBottomSheetStatefulKt$AlternativeProductsAnalyticsEvents$2 = new C27700x487596c8(aVar);
        int i2 = C28892e.f70778a;
        int i3 = (i >> 3) & 14;
        C28892e<? extends List<C38114b>> eVar2 = eVar;
        C8592o oVar2 = o;
        SingleEventCoroutineLauncherKt.m119625a(eVar2, alternativeProductsBottomSheetStatefulKt$AlternativeProductsAnalyticsEvents$1, alternativeProductsBottomSheetStatefulKt$AlternativeProductsAnalyticsEvents$2, oVar2, i2 | i3, 0);
        SingleEventCoroutineLauncherKt.m119625a(eVar2, new C27701x487596c9(eVar), new C27702x487596ca(eVar, aVar, str), oVar2, i2 | i3, 0);
        SingleEventCoroutineLauncherKt.m119625a(eVar2, new C27703x487596cb(eVar), new C27704x487596cc(aVar, str), oVar2, i2 | i3, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C27705x487596cd(aVar, eVar, str, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m116500c(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(1736205765);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1736205765, i2, -1, "com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetLoadingScreen (AlternativeProductsBottomSheetStateful.kt:309)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m l = SizeKt.m10112l(aVar, 0.0f, 1, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(l);
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
            float f2 = (float) 16;
            float f3 = (float) 8;
            float f4 = (float) 20;
            BoxKt.m9839a(C37019o.m151909b(SizeKt.m10115o(SizeKt.m10092H(PaddingKt.m10028o(aVar, C16483g.m74435M(f2), C16483g.m74435M((float) 24), 0.0f, C16483g.m74435M(f3), 4, (Object) null), C16483g.m74435M((float) 130)), C16483g.m74435M(f4)), true, (C15218g4) null, 2, (Object) null), o, 0);
            m116506i(o, 0);
            BoxKt.m9839a(C37019o.m151909b(SizeKt.m10115o(SizeKt.m10092H(PaddingKt.m10028o(aVar, C16483g.m74435M(f2), C16483g.m74435M(f2), 0.0f, C16483g.m74435M(f3), 4, (Object) null), C16483g.m74435M((float) 300)), C16483g.m74435M(f4)), true, (C15218g4) null, 2, (Object) null), o, 0);
            o.mo14918M(1834840193);
            for (int i3 = 0; i3 < 3; i3++) {
                m116506i(o, 0);
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
            s.mo15202a(new C27706xd7ac0767(i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m116501d(@C12580l AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel, @C12579k C27631a aVar, @C12579k String str, @C12579k C11306r<? super Gtin, ? super Integer, ? super Integer, ? super C38115c, C11079d2> rVar, @C12579k C11289a<C11079d2> aVar2, @C12579k C11300l<? super Throwable, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel2;
        int i3;
        boolean z;
        C27631a aVar3 = aVar;
        String str2 = str;
        Intrinsics.checkNotNullParameter(aVar3, "analytics");
        Intrinsics.checkNotNullParameter(str2, "initialProductGtin");
        Intrinsics.checkNotNullParameter(rVar, "onQuantityPress");
        Intrinsics.checkNotNullParameter(aVar2, "onResumeShoppingPress");
        Intrinsics.checkNotNullParameter(lVar, "onUpdateError");
        C8592o o = oVar.mo15009o(827241904);
        if ((i2 & 1) != 0) {
            o.mo14918M(-550968255);
            C19395b1 a = LocalViewModelStoreOwner.f49869a.mo57681a(o, 8);
            if (a != null) {
                C19502x0.C19506b a2 = C19298a.m90444a(a, o, 8);
                o.mo14918M(564614654);
                C19476v0 f = C19490c.m90838f(AlternativeProductsBottomSheetViewModel.class, a, (String) null, a2, o, 4168, 0);
                o.mo15002m0();
                o.mo15002m0();
                alternativeProductsBottomSheetViewModel2 = (AlternativeProductsBottomSheetViewModel) f;
                i3 = i & -15;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            alternativeProductsBottomSheetViewModel2 = alternativeProductsBottomSheetViewModel;
            i3 = i;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(827241904, i3, -1, "com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStateful (AlternativeProductsBottomSheetStateful.kt:70)");
        }
        C28892e value = C8415c2.m30233b(alternativeProductsBottomSheetViewModel2.mo81686k0(), (CoroutineContext) null, o, 8, 1).getValue();
        C11907e<C27739f> b = FlowKt.m118809b(alternativeProductsBottomSheetViewModel2.mo81687l0(), ((C19499w) o.mo15032w(AndroidCompositionLocals_androidKt.m70954i())).getLifecycle(), (Lifecycle.State) null, o, 72, 4);
        AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel3 = alternativeProductsBottomSheetViewModel2;
        EventLifecycleObserverKt.m119612a((C19499w) o.mo15032w(AndroidCompositionLocals_androidKt.m70954i()), (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, new C27707xce62a28(alternativeProductsBottomSheetViewModel2, str2), (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, o, 8, 246);
        C11907e<C27739f> eVar = b;
        C27712xfa3d2919 alternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$actioner$1 = new C27712xfa3d2919(alternativeProductsBottomSheetViewModel3, rVar, aVar2, str, lVar);
        EffectsKt.m29896h(eVar, new C27708xce62a29(eVar, alternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$actioner$1, (C11045c<? super C27708xce62a29>) null), o, 72);
        m116499b(aVar3, value, str2, o, (C28892e.f70778a << 3) | 8 | (i3 & 896));
        if (value instanceof C28892e.C28895c) {
            o.mo14918M(-1020983304);
            m116498a(aVar3, (List) ((C28892e.C28895c) value).mo84088d(), alternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$actioner$1, o, 72);
            o.mo15002m0();
        } else if (value instanceof C28892e.C28893a) {
            o.mo14918M(-1020983106);
            C8767m o2 = PaddingKt.m10028o(SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, C16483g.m74435M((float) 32), 7, (Object) null);
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(alternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$actioner$1);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new C27710x6c044c37(alternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$actioner$1);
                o.mo14893C(N);
            }
            o.mo15002m0();
            MessageComponentKt.m151549f(o2, (String) null, (C11289a) N, o, 6, 2);
            o.mo15002m0();
        } else {
            if (Intrinsics.areEqual((Object) value, (Object) C28892e.C28896d.f70785b)) {
                z = true;
            } else {
                z = Intrinsics.areEqual((Object) value, (Object) C28892e.C28894b.f70781b);
            }
            if (z) {
                o.mo14918M(-1020982825);
                m116500c(o, 0);
                o.mo15002m0();
            } else {
                o.mo14918M(-1020982774);
                o.mo15002m0();
            }
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C27711xce62a2b(alternativeProductsBottomSheetViewModel3, aVar, str, rVar, aVar2, lVar, i, i2));
        }
    }

    @C8540g
    @C16464c(backgroundColor = 4294967295L, showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m116502e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-426018962);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-426018962, i, -1, "com.carrefour.fid.android.product.presentation.ui.bottomsheet.LoadingScreenPreview (AlternativeProductsBottomSheetStateful.kt:466)");
            }
            ThemeKt.m153788a(ComposableSingletons$AlternativeProductsBottomSheetStatefulKt.f67225a.mo80488b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new AlternativeProductsBottomSheetStatefulKt$LoadingScreenPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m116503f(ProductPicture productPicture, C11300l<? super C27728a, C11079d2> lVar, C8592o oVar, int i) {
        C11300l<? super C27728a, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-1621652434);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1621652434, i2, -1, "com.carrefour.fid.android.product.presentation.ui.bottomsheet.NoAlternativeScreen (AlternativeProductsBottomSheetStateful.kt:269)");
        }
        C8734c.C8736b m = C8734c.f23406a.mo17068m();
        Arrangement.C2271e f = Arrangement.f6010a.mo7625f();
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m l = SizeKt.m10112l(aVar, 0.0f, 1, (Object) null);
        o.mo14918M(-483455358);
        C15560f0 b = ColumnKt.m9863b(f, m, o, 54);
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
        C8767m.C8768a aVar2 = aVar;
        C8592o oVar2 = o;
        C35325c.m145645b(productPicture.mo118573e(), SizeKt.m10087C(aVar, C16483g.m74435M((float) 100)), (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, C15541c.f38696a.mo44373i(), (String) null, 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, C27609f.C27617h.ds_ic_placeholder, (C11306r<? super C2362h, ? super C35326d.C35328b, ? super C8592o, ? super Integer, C11079d2>) null, (C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2>) null, ComposableSingletons$AlternativeProductsBottomSheetStatefulKt.f67225a.mo80487a(), oVar2, 1572912, C20022q.C20025c.f51280k, 28604);
        float f3 = (float) 16;
        C8592o oVar3 = oVar2;
        ImageKt.m8967b(C16015f.m71849d(C27609f.C27617h.ds_ic_anti_inflation, oVar3, 0), (String) null, PaddingKt.m10028o(aVar2, 0.0f, C16483g.m74435M(f3), 0.0f, 0.0f, 13, (Object) null), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar3, 440, 120);
        C8767m.C8768a aVar3 = aVar2;
        C8767m k = PaddingKt.m10024k(aVar3, C16483g.m74435M(f3));
        String d = C16018i.m71858d(C27609f.C27627r.alternative_products_no_alternative_title, oVar3, 0);
        int a2 = C16432i.f40718b.mo47667a();
        TextKt.m14196c(d, k, 0, 0, (C16190e0) null, C16209i0.f40292b.mo46947c(), (C16242u) null, 0, (C16434j) null, C16432i.m74172g(a2), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(oVar3, C7933t0.f19076b).mo11096i(), oVar2, 196656, 0, 64988);
        C8767m o2 = PaddingKt.m10028o(aVar3, 0.0f, C16483g.m74435M((float) 8), 0.0f, 0.0f, 13, (Object) null);
        C8592o oVar4 = oVar2;
        oVar4.mo14918M(1157296644);
        boolean n0 = oVar4.mo15006n0(lVar2);
        Object N = oVar4.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C27713x333cba33(lVar2);
            oVar4.mo14893C(N);
        }
        oVar4.mo15002m0();
        ButtonComponentKt.m151339f(o2, (C11289a) N, (ButtonType) null, (ButtonColor) null, false, C16018i.m71858d(C27609f.C27627r.alternative_products_no_alternative_button, oVar4, 0), false, (Integer) null, false, oVar4, 6, 476);
        oVar4.mo15002m0();
        oVar4.mo14896D();
        oVar4.mo15002m0();
        oVar4.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar4.mo15020s();
        if (s != null) {
            s.mo15202a(new AlternativeProductsBottomSheetStatefulKt$NoAlternativeScreen$2(productPicture, lVar2, i2));
        }
    }

    @C8540g
    @C16464c(backgroundColor = 4294967295L, showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m116504g(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1734658082);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1734658082, i, -1, "com.carrefour.fid.android.product.presentation.ui.bottomsheet.NoAlternativeScreenPreview (AlternativeProductsBottomSheetStateful.kt:474)");
            }
            ThemeKt.m153788a(ComposableSingletons$AlternativeProductsBottomSheetStatefulKt.f67225a.mo80489c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C27714x4bf0d869(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m116505h(C27631a aVar, C38114b bVar, C38114b bVar2, int i, C11300l<? super C27728a, C11079d2> lVar, C8592o oVar, int i2) {
        C8592o o = oVar.mo15009o(-1999976295);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1999976295, i2, -1, "com.carrefour.fid.android.product.presentation.ui.bottomsheet.ProductCardSAndroidView (AlternativeProductsBottomSheetStateful.kt:227)");
        }
        DividerKt.m13428a((C8767m) null, C37475b.f94185a.mo114206C(), C16483g.m74435M((float) 1), 0.0f, o, C22132b.f56831b, 9);
        AndroidView_androidKt.m74829a(C27715x4ab45fa1.f67224f, SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), new C27716x4ab45fa2(bVar2, aVar, bVar, i, lVar), o, 54, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C27719x4ab45fa3(aVar, bVar, bVar2, i, lVar, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m116506i(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(-40695019);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-40695019, i2, -1, "com.carrefour.fid.android.product.presentation.ui.bottomsheet.ShimmerProductCardS (AlternativeProductsBottomSheetStateful.kt:336)");
            }
            DividerKt.m13428a((C8767m) null, C37475b.f94185a.mo114206C(), C16483g.m74435M((float) 1), 0.0f, o, C22132b.f56831b, 9);
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 16;
            C8767m n = SizeKt.m10114n(SizeKt.m10115o(PaddingKt.m10024k(aVar, C16483g.m74435M(f)), C16483g.m74435M((float) 130)), 0.0f, 1, (Object) null);
            o.mo14918M(693286680);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2269d p = arrangement.mo7630p();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 d = RowKt.m10071d(p, aVar2.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(n);
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
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            BoxKt.m9839a(C37019o.m151909b(SizeKt.m10087C(aVar, C16483g.m74435M((float) 100)), true, (C15218g4) null, 2, (Object) null), o, 0);
            BoxKt.m9839a(C37019o.m151909b(C2411u0.m10660e(rowScopeInstance, SizeKt.m10112l(PaddingKt.m10026m(aVar, C16483g.m74435M(f), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), true, (C15218g4) null, 2, (Object) null), o, 0);
            C8734c.C8736b m = aVar2.mo17068m();
            Arrangement.C2279l d2 = arrangement.mo7624d();
            float f3 = (float) 40;
            C8767m j = SizeKt.m10110j(SizeKt.m10092H(aVar, C16483g.m74435M(f3)), 0.0f, 1, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b2 = ColumnKt.m9863b(d2, m, o, 54);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(j);
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
            Updater.m30188j(b3, b2, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            o.mo14972e();
            f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            BoxKt.m9839a(C37019o.m151909b(SizeKt.m10087C(PaddingKt.m10028o(aVar, 0.0f, 0.0f, 0.0f, C16483g.m74435M(f), 7, (Object) null), C16483g.m74435M(f3)), true, (C15218g4) null, 2, (Object) null), o, 0);
            BoxKt.m9839a(C37019o.m151909b(SizeKt.m10087C(aVar, C16483g.m74435M(f3)), true, (C15218g4) null, 2, (Object) null), o, 0);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
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
            s.mo15202a(new AlternativeProductsBottomSheetStatefulKt$ShimmerProductCardS$2(i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m116507j(C27631a aVar, List<C38114b> list, C11300l<? super C27728a, C11079d2> lVar, C8592o oVar, int i) {
        List<C38114b> list2 = list;
        int i2 = i;
        C8592o o = oVar.mo15009o(-424158636);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-424158636, i2, -1, "com.carrefour.fid.android.product.presentation.ui.bottomsheet.WithAlternativesScreen (AlternativeProductsBottomSheetStateful.kt:165)");
        }
        C38114b bVar = list2.get(0);
        List X1 = CollectionsKt___CollectionsKt.m40588X1(list2, 1);
        C8767m.C8768a aVar2 = C8767m.f23478j;
        C8767m f = ScrollKt.m9059f(NestedScrollModifierKt.m68305b(SizeKt.m10114n(aVar2, 0.0f, 1, (Object) null), C15867d1.m71320h((View) null, o, 0, 1), (NestedScrollDispatcher) null, 2, (Object) null), ScrollKt.m9056c(0, o, 0, 1), false, (C2195g) null, false, 14, (Object) null);
        o.mo14918M(-483455358);
        C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(f);
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
        float f3 = (float) 16;
        float f4 = (float) 8;
        C8767m o2 = PaddingKt.m10028o(aVar2, C16483g.m74435M(f3), C16483g.m74435M((float) 24), 0.0f, C16483g.m74435M(f4), 4, (Object) null);
        String d = C16018i.m71858d(C27609f.C27627r.alternative_products_initial_title, o, 0);
        C16449r.C16450a aVar3 = C16449r.f40760b;
        int c = aVar3.mo47727c();
        C16432i.C16433a aVar4 = C16432i.f40718b;
        int f5 = aVar4.mo47672f();
        float f6 = f3;
        C38114b bVar2 = bVar;
        C8592o oVar2 = o;
        C8592o oVar3 = oVar2;
        TextKt.m14196c(d, o2, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(f5), 0, c, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153894f(C37477d.m153887N()), oVar3, 48, 3120, 54780);
        int i3 = (i2 << 6) & 57344;
        m116505h(aVar, bVar2, bVar2, 1, lVar, oVar2, i3 | 3656);
        C8767m.C8768a aVar5 = aVar2;
        C8767m o3 = PaddingKt.m10028o(aVar5, C16483g.m74435M(f6), C16483g.m74435M(f6), 0.0f, C16483g.m74435M(f4), 4, (Object) null);
        C38114b bVar3 = bVar2;
        C8592o oVar4 = oVar2;
        int i4 = 0;
        String e = C16018i.m71859e(C27609f.C27627r.alternative_products_alternatives_title, new Object[]{m116518u(bVar3, oVar4, 8)}, oVar4, 64);
        int c2 = aVar3.mo47727c();
        int f7 = aVar4.mo47672f();
        C38114b bVar4 = bVar3;
        int i5 = i3;
        TextKt.m14196c(e, o3, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(f7), 0, c2, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153894f(C37477d.m153887N()), oVar3, 48, 3120, 54780);
        C8592o oVar5 = oVar2;
        oVar5.mo14918M(-1112769604);
        for (Object next : X1) {
            int i6 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            m116505h(aVar, bVar4, (C38114b) next, i4 + 2, lVar, oVar5, i5 | 584);
            i4 = i6;
        }
        oVar5.mo15002m0();
        oVar5.mo15002m0();
        oVar5.mo14896D();
        oVar5.mo15002m0();
        oVar5.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar5.mo15020s();
        if (s != null) {
            s.mo15202a(new C27720x15356052(aVar, list2, lVar, i2));
        }
    }

    @C8540g
    /* renamed from: u */
    public static final String m116518u(C38114b bVar, C8592o oVar, int i) {
        String str;
        oVar.mo14918M(674901366);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(674901366, i, -1, "com.carrefour.fid.android.product.presentation.ui.bottomsheet.alternativeProductsTitleEnd (AlternativeProductsBottomSheetStateful.kt:423)");
        }
        int i2 = C27697a.$EnumSwitchMapping$0[C27662e.m116391k(bVar.mo118842j()).ordinal()];
        if (i2 == 1) {
            oVar.mo14918M(-1252490019);
            str = C16018i.m71858d(C27609f.C27627r.alternative_products_liter_text, oVar, 0);
            oVar.mo15002m0();
        } else if (i2 == 2) {
            oVar.mo14918M(-1252489923);
            str = C16018i.m71858d(C27609f.C27627r.alternative_products_kg_text, oVar, 0);
            oVar.mo15002m0();
        } else if (i2 == 3) {
            oVar.mo14918M(-1252489834);
            str = C16018i.m71858d(C27609f.C27627r.alternative_products_unit_text, oVar, 0);
            oVar.mo15002m0();
        } else if (i2 == 4) {
            oVar.mo14918M(-1252489742);
            str = C16018i.m71858d(C27609f.C27627r.alternative_products_piece_text, oVar, 0);
            oVar.mo15002m0();
        } else if (i2 == 5) {
            oVar.mo14918M(-1252489647);
            oVar.mo15002m0();
            str = new String();
        } else {
            oVar.mo14918M(-1252506012);
            oVar.mo15002m0();
            throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return str;
    }

    /* renamed from: v */
    public static final void m116519v(C27631a aVar, C38114b bVar, C38114b bVar2, int i, C11300l<? super C27728a, C11079d2> lVar) {
        if (bVar2.mo118843k() == 0) {
            lVar.invoke(new C27728a.C27729a(bVar2.mo118842j()));
            aVar.mo80244e(bVar.mo118842j(), bVar2.mo118842j(), 1, i);
            return;
        }
        lVar.invoke(new C27728a.C27731c(bVar2.mo118842j().mo118850A(), bVar2.mo118843k(), i, bVar.mo118842j(), (DefaultConstructorMarker) null));
    }
}
