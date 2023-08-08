package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.components.compose.PriceComponentKt;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.shared.extension.C28782t;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.NalPriceComponentKt */
public final class NalPriceComponentKt {

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.NalPriceComponentKt$a */
    public /* synthetic */ class C23541a {
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
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.RD     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.TA     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.RI     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.NalPriceComponentKt.C23541a.<clinit>():void");
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104768a(@C12580l OfferDiscountType offerDiscountType, @C12580l Double d, @C12580l Double d2, boolean z, boolean z2, int i, @C12580l C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        OfferDiscountType offerDiscountType2 = offerDiscountType;
        boolean z3 = z;
        boolean z4 = z2;
        int i10 = i;
        int i11 = i2;
        C8592o o = oVar.mo15009o(1181490383);
        if ((i11 & 14) == 0) {
            if (o.mo15006n0(offerDiscountType2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i11;
        } else {
            i3 = i11;
        }
        Double d3 = d;
        if ((i11 & 112) == 0) {
            if (o.mo15006n0(d3)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        Double d4 = d2;
        if ((i11 & 896) == 0) {
            if (o.mo15006n0(d4)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i11 & 7168) == 0) {
            if (o.mo14961b(z3)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((57344 & i11) == 0) {
            if (o.mo14961b(z4)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((458752 & i11) == 0) {
            if (o.mo14976f(i10)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((374491 & i3) != 74898 || !o.mo15011p()) {
            int i12 = -1;
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1181490383, i3, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.NalPriceComponent (NalPriceComponent.kt:11)");
            }
            if (offerDiscountType2 != null) {
                i12 = C23541a.$EnumSwitchMapping$0[offerDiscountType.ordinal()];
            }
            if (i12 == 1 || i12 == 2) {
                o.mo14918M(-1935548289);
                int i13 = i3 >> 3;
                PriceComponentKt.m151577n(C28782t.m119105b(d), C28782t.m119105b(Double.valueOf(C28782t.m119111h(d2) * ((double) i10))), z, z2, o, (i13 & 896) | (i13 & 7168));
                o.mo15002m0();
            } else if (i12 == 3) {
                o.mo14918M(-1935547983);
                PriceComponentKt.m151568e(C28782t.m119105b(d), z3, o, (i3 >> 6) & 112);
                o.mo15002m0();
            } else if (i12 == 4 || i12 == 5) {
                o.mo14918M(-1935547767);
                int i14 = i3 >> 3;
                PriceComponentKt.m151577n(C28782t.m119105b(d), (String) null, z, z2, o, (i14 & 896) | 48 | (i14 & 7168));
                o.mo15002m0();
            } else {
                o.mo14918M(-1935547519);
                int i15 = i3 >> 6;
                PriceComponentKt.m151564a(C28782t.m119105b(d), z3, z4, o, (i15 & 896) | (i15 & 112));
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
            s.mo15202a(new NalPriceComponentKt$NalPriceComponent$1(offerDiscountType, d, d2, z, z2, i, i2));
        }
    }
}
