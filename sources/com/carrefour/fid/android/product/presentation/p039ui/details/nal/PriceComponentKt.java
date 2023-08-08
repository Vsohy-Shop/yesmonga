package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
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
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.offer.C38067d;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.mapper.C27641a;
import com.carrefour.fid.android.product.presentation.models.OfferAvailability;
import com.carrefour.fid.android.product.presentation.models.extensions.C27659c;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.util.C28932h;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;

@C11363r0({"SMAP\nPriceComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PriceComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/PriceComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,149:1\n74#2,6:150\n80#2:182\n84#2:187\n75#3:156\n76#3,11:158\n89#3:186\n76#4:157\n460#5,13:169\n473#5,3:183\n*S KotlinDebug\n*F\n+ 1 PriceComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/PriceComponentKt\n*L\n44#1:150,6\n44#1:182\n44#1:187\n44#1:156\n44#1:158,11\n44#1:186\n44#1:157\n44#1:169,13\n44#1:183,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.PriceComponentKt */
public final class PriceComponentKt {

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.PriceComponentKt$a */
    public /* synthetic */ class C27847a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType[] r0 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.PROMO     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.PF     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.RI     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.TA     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.RD     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.BUNDLE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.PriceComponentKt.C27847a.<clinit>():void");
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m116894a(@C12580l Prices prices, @C12580l Discount discount, @C12579k String str, @C12579k OfferAvailability offerAvailability, @C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        boolean z;
        OfferDiscountType offerDiscountType;
        int i3;
        int i4;
        double d;
        PromoType A;
        OfferAvailability offerAvailability2 = offerAvailability;
        int i5 = i;
        Intrinsics.checkNotNullParameter(str, "taxeMessage");
        Intrinsics.checkNotNullParameter(offerAvailability2, C28534f.f69157h0);
        C8592o o = oVar.mo15009o(-218936434);
        if ((i2 & 16) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-218936434, i5, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.PriceComponent (PriceComponent.kt:33)");
        }
        if (offerAvailability2 == OfferAvailability.Available) {
            z = true;
        } else {
            z = false;
        }
        if (prices != null) {
            int i6 = (i5 >> 12) & 14;
            o.mo14918M(-483455358);
            int i7 = i6 >> 3;
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, (i7 & 112) | (i7 & 14));
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
            int i8 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i8 >> 3) & 112));
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            if (discount == null || (A = discount.mo117953A()) == null) {
                offerDiscountType = null;
            } else {
                offerDiscountType = C27659c.m116373k(A);
            }
            if (offerDiscountType == null) {
                i3 = -1;
            } else {
                i3 = C27847a.$EnumSwitchMapping$0[offerDiscountType.ordinal()];
            }
            switch (i3) {
                case -1:
                    o.mo14918M(-1904789142);
                    if (prices.mo118171l() > 0.0d) {
                        d = prices.mo118171l();
                    } else {
                        d = prices.mo118172m();
                    }
                    com.carrefour.fid.android.design.components.compose.PriceComponentKt.m151564a(C28782t.m119105b(Double.valueOf(d)), false, z, o, 48);
                    o.mo15002m0();
                    break;
                case 1:
                case 2:
                    o.mo14918M(-1904790513);
                    com.carrefour.fid.android.design.components.compose.PriceComponentKt.m151577n(C27641a.m116296a(discount.mo117980t()), C28782t.m119105b(Double.valueOf(prices.mo118172m())), false, z, o, C22132b.f56831b);
                    o.mo15002m0();
                    break;
                case 3:
                case 4:
                    o.mo14918M(-1904790058);
                    com.carrefour.fid.android.design.components.compose.PriceComponentKt.m151577n(C27641a.m116296a(discount.mo117980t()), (String) null, false, z, o, 432);
                    o.mo15002m0();
                    break;
                case 5:
                    o.mo14918M(-1904789657);
                    com.carrefour.fid.android.design.components.compose.PriceComponentKt.m151568e(C27641a.m116296a(discount.mo117980t()), false, o, 48);
                    o.mo15002m0();
                    break;
                case 6:
                    o.mo14918M(-1904789419);
                    String a2 = C27641a.m116296a(discount.mo117980t());
                    if (a2 == null) {
                        a2 = "";
                    }
                    com.carrefour.fid.android.design.components.compose.PriceComponentKt.m151564a(a2, false, z, o, 48);
                    o.mo15002m0();
                    break;
                default:
                    o.mo14918M(-1904788721);
                    o.mo15002m0();
                    break;
            }
            C2428y0.m10726a(SizeKt.m10115o(C8767m.f23478j, C37474a.f94133a.mo114177C()), o, 0);
            o.mo14918M(-1904788639);
            if (discount == null) {
                i4 = 0;
            } else {
                i4 = 0;
                TextKt.m14196c(C16018i.m71859e(C27609f.C27627r.pdp_label_discount_offer_available, new Object[]{C28932h.f70914a.mo84243m(discount.mo117982u())}, o, 64), (C8767m) null, C16009b.m71825a(C27609f.C27615f.ds_grey_10, o, 0), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153893e(C7933t0.f19075a.mo11077c(o, C7933t0.f19076b)), o, 0, 0, 65530);
            }
            o.mo15002m0();
            o.mo14918M(1949763135);
            if (!C11622t.isBlank(str)) {
                TextKt.m14196c(str, (C8767m) null, C16009b.m71825a(C27609f.C27615f.ds_grey_10, o, i4), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153893e(C7933t0.f19075a.mo11077c(o, C7933t0.f19076b)), o, (i5 >> 6) & 14, 0, 65530);
            }
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceComponent$2(prices, discount, str, offerAvailability, aVar, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m116895b(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(479515288);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(479515288, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.PriceComponentPreview (PriceComponent.kt:112)");
            }
            Prices prices = new Prices(59.99d, 29.99d, 29.99d, "29.99€/U", 0.0d, 0.0d);
            int b = C38067d.m157175b(5999);
            int b2 = C38067d.m157175b(2999);
            DateTime J2 = DateTime.m51192J2();
            DateTime S2 = DateTime.m51192J2().mo27726S2(10);
            PromoType promoType = PromoType.PROMO;
            List E = CollectionsKt__CollectionsKt.m40441E();
            C38067d a = C38067d.m157174a(b);
            Intrinsics.checkNotNullExpressionValue(J2, "now()");
            Intrinsics.checkNotNullExpressionValue(S2, "plusDays(10)");
            Discount discount = r5;
            Discount discount2 = new Discount(promoType, "PROMO : 20%", (Integer) null, (C38067d) null, a, b2, (C38067d) null, (C38067d) null, (C38067d) null, J2, S2, false, E, (DefaultConstructorMarker) null);
            ThemeKt.m153788a(C8553b.m31048b(o, -373272459, true, new PriceComponentKt$PriceComponentPreview$1(prices, discount, "Dont 0.01€ écoParticipation")), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceComponentPreview$2(i2));
        }
    }
}
