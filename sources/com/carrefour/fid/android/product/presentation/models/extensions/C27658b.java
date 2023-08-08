package com.carrefour.fid.android.product.presentation.models.extensions;

import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import com.carrefour.fid.android.product.presentation.mapper.C27641a;
import com.carrefour.fid.android.product.presentation.models.OfferAvailability;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.models.extensions.b */
public final class C27658b {
    @C12579k
    /* renamed from: a */
    public static final OfferAvailability m116360a(@C12579k OfferDetail offerDetail) {
        Intrinsics.checkNotNullParameter(offerDetail, "<this>");
        if (offerDetail.mo118679E()) {
            return OfferAvailability.Available;
        }
        if (offerDetail.mo118679E() || !offerDetail.mo118678D()) {
            return OfferAvailability.Unavailable;
        }
        return OfferAvailability.SoonAvailable;
    }

    @C12580l
    /* renamed from: b */
    public static final Discount m116361b(@C12579k OfferDetail offerDetail) {
        Intrinsics.checkNotNullParameter(offerDetail, "<this>");
        return (Discount) CollectionsKt___CollectionsKt.m40479B2(offerDetail.mo118704v());
    }

    @C12580l
    /* renamed from: c */
    public static final Double m116362c(@C12579k OfferDetail offerDetail) {
        PromoType promoType;
        PromoType promoType2;
        PromoType promoType3;
        Intrinsics.checkNotNullParameter(offerDetail, "<this>");
        Discount b = m116361b(offerDetail);
        if (b != null) {
            promoType = b.mo117953A();
        } else {
            promoType = null;
        }
        if (promoType != PromoType.PF) {
            Discount b2 = m116361b(offerDetail);
            if (b2 != null) {
                promoType2 = b2.mo117953A();
            } else {
                promoType2 = null;
            }
            if (promoType2 != PromoType.RD) {
                Discount b3 = m116361b(offerDetail);
                if (b3 != null) {
                    promoType3 = b3.mo117953A();
                } else {
                    promoType3 = null;
                }
                if (promoType3 != PromoType.RI) {
                    if (offerDetail.mo118708z().mo118171l() > 0.0d) {
                        return Double.valueOf(offerDetail.mo118708z().mo118171l());
                    }
                    if (offerDetail.mo118708z().mo118172m() > 0.0d) {
                        return Double.valueOf(offerDetail.mo118708z().mo118172m());
                    }
                    return Double.valueOf(0.0d);
                }
            }
        }
        Discount b4 = m116361b(offerDetail);
        if (b4 != null) {
            return Double.valueOf(C27641a.m116297b(b4.mo117980t()));
        }
        return null;
    }
}
