package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
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
import com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.SpacedItemsRowKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDetailedPriceComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailedPriceComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/DetailedPriceComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,161:1\n154#2:162\n154#2:196\n154#2:197\n154#2:198\n154#2:199\n154#2:200\n154#2:201\n154#2:202\n74#3,6:163\n80#3:195\n84#3:207\n75#4:169\n76#4,11:171\n89#4:206\n76#5:170\n460#6,13:182\n473#6,3:203\n*S KotlinDebug\n*F\n+ 1 DetailedPriceComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/DetailedPriceComponentKt\n*L\n35#1:162\n37#1:196\n52#1:197\n68#1:198\n84#1:199\n95#1:200\n112#1:201\n116#1:202\n31#1:163,6\n31#1:195\n31#1:207\n31#1:169\n31#1:171,11\n31#1:206\n31#1:170\n31#1:182,13\n31#1:203,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.DetailedPriceComponentKt */
public final class DetailedPriceComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104761a(@C12579k BasketAmounts basketAmounts, @C12580l BasketPromotionCode basketPromotionCode, int i, @C12580l C8592o oVar, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        BasketAmounts basketAmounts2 = basketAmounts;
        BasketPromotionCode basketPromotionCode2 = basketPromotionCode;
        int i3 = i;
        int i4 = i2;
        Intrinsics.checkNotNullParameter(basketAmounts2, "basketAmount");
        C8592o o = oVar.mo15009o(-1591733481);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1591733481, i4, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.DetailedPriceComponent (DetailedPriceComponent.kt:28)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
        C37475b bVar = C37475b.f94185a;
        C8767m k = PaddingKt.m10024k(BackgroundKt.m8825d(n, bVar.mo114231a0(), (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 16));
        o.mo14918M(-483455358);
        C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
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
        float f3 = (float) 4;
        SpacedItemsRowKt.m162561a(PaddingKt.m10026m(aVar, 0.0f, C16483g.m74435M(f3), 1, (Object) null), C8553b.m31048b(o, -1007929005, true, new DetailedPriceComponentKt$DetailedPriceComponent$1$1(basketAmounts2)), o, 54, 0);
        o.mo14918M(19125355);
        if (basketAmounts.mo116888r() == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            SpacedItemsRowKt.m162561a(PaddingKt.m10026m(aVar, 0.0f, C16483g.m74435M(f3), 1, (Object) null), C8553b.m31048b(o, 1136638702, true, new DetailedPriceComponentKt$DetailedPriceComponent$1$2(basketAmounts2)), o, 54, 0);
        }
        o.mo15002m0();
        o.mo14918M(19125957);
        if (basketAmounts.mo116866B() == 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            z3 = true;
            SpacedItemsRowKt.m162561a(PaddingKt.m10026m(aVar, 0.0f, C16483g.m74435M(f3), 1, (Object) null), C8553b.m31048b(o, 1141272229, true, new DetailedPriceComponentKt$DetailedPriceComponent$1$3(basketAmounts2)), o, 54, 0);
        } else {
            z3 = true;
        }
        o.mo15002m0();
        o.mo14918M(19126543);
        if (basketPromotionCode2 != null) {
            f = 0.0f;
            SpacedItemsRowKt.m162561a(PaddingKt.m10026m(aVar, 0.0f, C16483g.m74435M(f3), z3, (Object) null), C8553b.m31048b(o, -1600607706, z3, new DetailedPriceComponentKt$DetailedPriceComponent$1$4(basketPromotionCode2)), o, 54, 0);
        } else {
            f = 0.0f;
        }
        o.mo15002m0();
        SpacedItemsRowKt.m162561a(PaddingKt.m10026m(aVar, f, C16483g.m74435M(f3), z3 ? 1 : 0, (Object) null), C8553b.m31048b(o, 1796007882, z3, new DetailedPriceComponentKt$DetailedPriceComponent$1$5(basketAmounts2)), o, 54, 0);
        C2428y0.m10726a(BackgroundKt.m8825d(SizeKt.m10115o(SizeKt.m10114n(aVar, f, z3, (Object) null), C16483g.m74435M(z3 ? 1.0f : 0.0f)), bVar.mo114206C(), (C15218g4) null, 2, (Object) null), o, 0);
        SpacedItemsRowKt.m162561a(PaddingKt.m10026m(aVar, 0.0f, C16483g.m74435M(f3), 1, (Object) null), C8553b.m31048b(o, -945872053, true, new DetailedPriceComponentKt$DetailedPriceComponent$1$6(i3, basketAmounts2)), o, 54, 0);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DetailedPriceComponentKt$DetailedPriceComponent$2(basketAmounts2, basketPromotionCode2, i3, i4));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104762b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-274025883);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-274025883, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.DetailedPriceComponentPreview (DetailedPriceComponent.kt:137)");
            }
            ThemeKt.m153788a(ComposableSingletons$DetailedPriceComponentKt.f59489a.mo68966a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DetailedPriceComponentKt$DetailedPriceComponentPreview$1(i));
        }
    }
}
