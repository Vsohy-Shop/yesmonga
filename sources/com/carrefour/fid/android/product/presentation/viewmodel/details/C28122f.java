package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import com.carrefour.fid.android.product.presentation.mapper.C27641a;
import com.carrefour.fid.android.product.presentation.models.extensions.C27658b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.f */
public final class C28122f {
    @C12579k
    /* renamed from: a */
    public final String mo81735a(@C12580l OfferDetail offerDetail) {
        PromoType promoType;
        PromoType promoType2;
        PromoType promoType3;
        if (offerDetail == null) {
            return new String();
        }
        Discount b = C27658b.m116361b(offerDetail);
        Double d = null;
        if (b != null) {
            promoType = b.mo117953A();
        } else {
            promoType = null;
        }
        if (promoType != PromoType.PF) {
            Discount b2 = C27658b.m116361b(offerDetail);
            if (b2 != null) {
                promoType2 = b2.mo117953A();
            } else {
                promoType2 = null;
            }
            if (promoType2 != PromoType.RD) {
                Discount b3 = C27658b.m116361b(offerDetail);
                if (b3 != null) {
                    promoType3 = b3.mo117953A();
                } else {
                    promoType3 = null;
                }
                if (promoType3 != PromoType.RI) {
                    if (offerDetail.mo118708z().mo118171l() > 0.0d) {
                        return String.valueOf(offerDetail.mo118708z().mo118171l());
                    }
                    if (offerDetail.mo118708z().mo118172m() > 0.0d) {
                        return String.valueOf(offerDetail.mo118708z().mo118172m());
                    }
                    return new String();
                }
            }
        }
        Discount b4 = C27658b.m116361b(offerDetail);
        if (b4 != null) {
            d = Double.valueOf(C27641a.m116297b(b4.mo117980t()));
        }
        return String.valueOf(d);
    }
}
