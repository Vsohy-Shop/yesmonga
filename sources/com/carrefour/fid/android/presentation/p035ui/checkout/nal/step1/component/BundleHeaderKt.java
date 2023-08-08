package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
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
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBundleHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleHeader.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/BundleHeaderKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,101:1\n154#2:102\n154#2:103\n154#2:133\n154#2:134\n154#2:135\n154#2:136\n79#3,2:104\n81#3:132\n85#3:141\n75#4:106\n76#4,11:108\n89#4:140\n76#5:107\n460#6,13:119\n473#6,3:137\n*S KotlinDebug\n*F\n+ 1 BundleHeader.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/BundleHeaderKt\n*L\n37#1:102\n38#1:103\n46#1:133\n50#1:134\n65#1:135\n69#1:136\n33#1:104,2\n33#1:132\n33#1:141\n33#1:106\n33#1:108,11\n33#1:140\n33#1:107\n33#1:119,13\n33#1:137,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.BundleHeaderKt */
public final class BundleHeaderKt {

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.BundleHeaderKt$a */
    public /* synthetic */ class C23537a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType[] r0 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.RD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.RI     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.BundleHeaderKt.C23537a.<clinit>():void");
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104743a(@C12579k OfferDiscountType offerDiscountType, int i, double d, @C12580l C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        OfferDiscountType offerDiscountType2 = offerDiscountType;
        int i7 = i;
        int i8 = i2;
        Intrinsics.checkNotNullParameter(offerDiscountType2, "discountType");
        C8592o o = oVar.mo15009o(-2063169826);
        if ((i8 & 14) == 0) {
            if (o.mo15006n0(offerDiscountType2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i8;
        } else {
            i3 = i8;
        }
        if ((i8 & 112) == 0) {
            if (o.mo14976f(i7)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        double d2 = d;
        if ((i8 & 896) == 0) {
            if (o.mo14993k(d2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2063169826, i3, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.BundleHeader (BundleHeader.kt:31)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            C37475b bVar = C37475b.f94185a;
            float f = (float) 16;
            C8767m o2 = SizeKt.m10115o(PaddingKt.m10026m(BackgroundKt.m8825d(n, bVar.mo114208E(), (C15218g4) null, 2, (Object) null), C16483g.m74435M(f), 0.0f, 2, (Object) null), C16483g.m74435M((float) 40));
            Arrangement.C2269d p = Arrangement.f6010a.mo7630p();
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            o.mo14918M(693286680);
            C15560f0 d3 = RowKt.m10071d(p, q, o, 54);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(o2);
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
            Updater.m30188j(b, d3, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            int i9 = C23537a.$EnumSwitchMapping$0[offerDiscountType.ordinal()];
            if (i9 == 1) {
                boolean z = R.plurals.basket_bundle_discount_message;
                o.mo14918M(1664671045);
                IconKt.m13539b(C16015f.m71849d(R.drawable.ds_ic_diagonal_card_fid, o, 0), (String) null, SizeKt.m10087C(aVar, C16483g.m74435M(f)), bVar.mo114251s(), o, 440, 0);
                C2428y0.m10726a(SizeKt.m10092H(aVar, C16483g.m74435M((float) 8)), o, 6);
                TextKt.m14196c(C16018i.m71856b(R.plurals.basket_bundle_discount_message, i7, new Object[]{Integer.valueOf(i), C28782t.m119105b(Double.valueOf(d)), C16018i.m71858d(R.string.basket_bundle_rd_wording, o, 0)}, o, (i3 & 112) | 512), (C8767m) null, bVar.mo114251s(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11098k(), o, 0, 0, 65530);
                o.mo15002m0();
            } else if (i9 != 2) {
                o.mo14918M(1664672742);
                o.mo15002m0();
            } else {
                o.mo14918M(1664671900);
                IconKt.m13539b(C16015f.m71849d(R.drawable.ds_ic_promotion_percentage, o, 0), (String) null, SizeKt.m10087C(aVar, C16483g.m74435M(f)), bVar.mo114251s(), o, 440, 0);
                C2428y0.m10726a(SizeKt.m10092H(aVar, C16483g.m74435M((float) 8)), o, 6);
                TextKt.m14196c(C16018i.m71856b(R.plurals.basket_bundle_discount_message, i7, new Object[]{Integer.valueOf(i), C28782t.m119105b(Double.valueOf(d)), C16018i.m71858d(R.string.basket_bundle_ri_wording, o, 0)}, o, (i3 & 112) | 512), (C8767m) null, bVar.mo114251s(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11098k(), o, 0, 0, 65530);
                o.mo15002m0();
            }
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
            s.mo15202a(new BundleHeaderKt$BundleHeader$2(offerDiscountType, i, d, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104744b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1233106703);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1233106703, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.BundleHeaderPreview (BundleHeader.kt:87)");
            }
            ThemeKt.m153788a(ComposableSingletons$BundleHeaderKt.f59478a.mo68958a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BundleHeaderKt$BundleHeaderPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m104745c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(802487371);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(802487371, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.BundleHeaderPreview2 (BundleHeader.kt:95)");
            }
            ThemeKt.m153788a(ComposableSingletons$BundleHeaderKt.f59478a.mo68959b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BundleHeaderKt$BundleHeaderPreview2$1(i));
        }
    }
}
