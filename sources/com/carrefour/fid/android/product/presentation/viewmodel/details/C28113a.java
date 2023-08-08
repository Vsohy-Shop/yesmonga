package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import com.carrefour.fid.android.product.presentation.models.C27647a;
import com.carrefour.fid.android.product.presentation.models.OfferAvailability;
import com.carrefour.fid.android.product.presentation.models.extensions.C27658b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.a */
public final class C28113a {
    @C12579k
    /* renamed from: a */
    public static final C27647a m117737a(int i, @C12580l OfferDetail offerDetail) {
        OfferAvailability offerAvailability;
        boolean z;
        if (offerDetail != null) {
            offerAvailability = C27658b.m116360a(offerDetail);
        } else {
            offerAvailability = null;
        }
        if (offerAvailability == OfferAvailability.Available) {
            z = true;
        } else {
            z = false;
        }
        if (i != 0) {
            return new C27647a.C27650c(i);
        }
        if (z) {
            return new C27647a.C27648a(0, 1, (DefaultConstructorMarker) null);
        }
        return C27647a.C27649b.f67173b;
    }
}
