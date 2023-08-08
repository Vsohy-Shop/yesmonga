package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.components.compose.label.LabelComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.offer.C38067d;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.product.presentation.models.OfferAvailability;
import com.carrefour.fid.android.product.presentation.models.extensions.C27659c;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.PromoComponentKt */
public final class PromoComponentKt {

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.PromoComponentKt$a */
    public /* synthetic */ class C27848a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
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
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.PromoComponentKt.C27848a.<clinit>():void");
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m116897a(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(1535209822);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1535209822, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.PriceComponentPreview (PromoComponent.kt:45)");
            }
            int b = C38067d.m157175b(5999);
            int b2 = C38067d.m157175b(2999);
            DateTime J2 = DateTime.m51192J2();
            DateTime S2 = DateTime.m51192J2().mo27726S2(10);
            PromoType promoType = PromoType.PROMO;
            List E = CollectionsKt__CollectionsKt.m40441E();
            C38067d a = C38067d.m157174a(b);
            Intrinsics.checkNotNullExpressionValue(J2, "now()");
            Intrinsics.checkNotNullExpressionValue(S2, "plusDays(10)");
            ThemeKt.m153788a(C8553b.m31048b(o, 682422075, true, new PromoComponentKt$PriceComponentPreview$1(new Discount(promoType, "PROMO : 20%", (Integer) null, (C38067d) null, a, b2, (C38067d) null, (C38067d) null, (C38067d) null, J2, S2, false, E, (DefaultConstructorMarker) null))), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PromoComponentKt$PriceComponentPreview$2(i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m116898b(@C12580l Discount discount, @C12579k OfferAvailability offerAvailability, @C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(offerAvailability, C28534f.f69157h0);
        C8592o o = oVar.mo15009o(-1136077209);
        if ((i2 & 4) != 0) {
            mVar = C8767m.f23478j;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1136077209, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.PromoComponent (PromoComponent.kt:18)");
        }
        if (offerAvailability == OfferAvailability.Available) {
            z = true;
        } else {
            z = false;
        }
        if (discount != null) {
            int i3 = C27848a.$EnumSwitchMapping$0[C27659c.m116373k(discount.mo117953A()).ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
                o.mo14918M(1441433928);
                LabelComponentKt.m151835h(discount.mo117986x(), z, mVar, o, i & 896, 0);
                o.mo15002m0();
            } else if (i3 != 5) {
                o.mo14918M(1441434343);
                o.mo15002m0();
            } else {
                o.mo14918M(1441434142);
                LabelComponentKt.m151834g(discount.mo117986x(), z, mVar, o, i & 896, 0);
                o.mo15002m0();
            }
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PromoComponentKt$PromoComponent$2(discount, offerAvailability, mVar, i, i2));
        }
    }
}
