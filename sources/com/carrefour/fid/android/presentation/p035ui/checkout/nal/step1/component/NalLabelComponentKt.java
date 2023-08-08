package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.components.compose.label.LabelComponentKt;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.NalLabelComponentKt */
public final class NalLabelComponentKt {

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.NalLabelComponentKt$a */
    public /* synthetic */ class C23540a {
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
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.RD     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.TA     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.NalLabelComponentKt.C23540a.<clinit>():void");
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104767a(@C12579k OfferProductModel offerProductModel, @C12580l C8592o oVar, int i) {
        OfferDiscountType offerDiscountType;
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C8592o o = oVar.mo15009o(-2139085101);
        int i2 = -1;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2139085101, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.NalLabelComponent (NalLabelComponent.kt:11)");
        }
        OfferDiscountDomain w = offerProductModel.mo121523w();
        String str = null;
        if (w != null) {
            offerDiscountType = w.mo115961z();
        } else {
            offerDiscountType = null;
        }
        if (offerDiscountType != null) {
            i2 = C23540a.$EnumSwitchMapping$0[offerDiscountType.ordinal()];
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            o.mo14918M(-1047997387);
            OfferDiscountDomain w2 = offerProductModel.mo121523w();
            if (w2 != null) {
                str = w2.mo115956v();
            }
            if (str == null) {
                str = "";
            }
            if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
                z = true;
            } else {
                z = false;
            }
            LabelComponentKt.m151847t(str, z, (C8767m) null, o, 0, 4);
            o.mo15002m0();
        } else if (i2 == 4) {
            o.mo14918M(-1047997201);
            OfferDiscountDomain w3 = offerProductModel.mo121523w();
            if (w3 != null) {
                str = w3.mo115956v();
            }
            if (str == null) {
                str = "";
            }
            if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
                z2 = true;
            } else {
                z2 = false;
            }
            LabelComponentKt.m151846s(str, z2, (C8767m) null, o, 0, 4);
            o.mo15002m0();
        } else if (i2 != 5) {
            o.mo14918M(-1047996841);
            o.mo15002m0();
        } else {
            o.mo14918M(-1047997013);
            OfferDiscountDomain w4 = offerProductModel.mo121523w();
            if (w4 != null) {
                str = w4.mo115956v();
            }
            if (str == null) {
                str = "";
            }
            if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
                z3 = true;
            } else {
                z3 = false;
            }
            LabelComponentKt.m151839l(str, z3, (C8767m) null, o, 0, 4);
            o.mo15002m0();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NalLabelComponentKt$NalLabelComponent$1(offerProductModel, i));
        }
    }
}
