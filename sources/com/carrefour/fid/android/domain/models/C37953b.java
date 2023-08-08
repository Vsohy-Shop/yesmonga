package com.carrefour.fid.android.domain.models;

import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.b */
public final class C37953b {
    /* renamed from: a */
    public static final float m155979a(@C12579k BasketOfferDomain basketOfferDomain) {
        OfferDiscountType offerDiscountType;
        OfferDiscountType offerDiscountType2;
        double d;
        Double m;
        Double l;
        Double l2;
        Double m2;
        Intrinsics.checkNotNullParameter(basketOfferDomain, "<this>");
        OfferDiscountDomain q = basketOfferDomain.mo115565q();
        OfferDiscountType offerDiscountType3 = null;
        if (q != null) {
            offerDiscountType = q.mo115961z();
        } else {
            offerDiscountType = null;
        }
        double d2 = 0.0d;
        if (offerDiscountType == OfferDiscountType.PF) {
            Double s = basketOfferDomain.mo115565q().mo115952s();
            if (s != null) {
                d2 = s.doubleValue();
            }
        } else {
            OfferDiscountDomain q2 = basketOfferDomain.mo115565q();
            if (q2 != null) {
                offerDiscountType2 = q2.mo115961z();
            } else {
                offerDiscountType2 = null;
            }
            if (offerDiscountType2 == OfferDiscountType.RD) {
                Double s2 = basketOfferDomain.mo115565q().mo115952s();
                if (s2 != null) {
                    d2 = s2.doubleValue();
                }
            } else {
                OfferDiscountDomain q3 = basketOfferDomain.mo115565q();
                if (q3 != null) {
                    offerDiscountType3 = q3.mo115961z();
                }
                if (offerDiscountType3 == OfferDiscountType.RI) {
                    BasketOfferPriceDomain y = basketOfferDomain.mo115575y();
                    if (!(y == null || (m2 = y.mo115609m()) == null)) {
                        d2 = m2.doubleValue();
                    }
                } else {
                    BasketOfferPriceDomain y2 = basketOfferDomain.mo115575y();
                    if (y2 == null || (l2 = y2.mo115608l()) == null) {
                        d = 0.0d;
                    } else {
                        d = l2.doubleValue();
                    }
                    if (d > 0.0d) {
                        BasketOfferPriceDomain y3 = basketOfferDomain.mo115575y();
                        if (!(y3 == null || (l = y3.mo115608l()) == null)) {
                            d2 = l.doubleValue();
                        }
                    } else {
                        BasketOfferPriceDomain y4 = basketOfferDomain.mo115575y();
                        if (!(y4 == null || (m = y4.mo115609m()) == null)) {
                            d2 = m.doubleValue();
                        }
                    }
                }
            }
        }
        return (float) d2;
    }

    @C12580l
    /* renamed from: b */
    public static final BasketAmounts m155980b(@C12580l BasketAmounts basketAmounts) {
        if (basketAmounts != null) {
            return new BasketAmounts(0, basketAmounts.mo115441p(), basketAmounts.mo115442q(), basketAmounts.mo115443r(), basketAmounts.mo115444s(), basketAmounts.mo115445t(), basketAmounts.mo115447u(), basketAmounts.mo115448v(), basketAmounts.mo115449w(), basketAmounts.mo115451x(), basketAmounts.mo115452y(), basketAmounts.mo115423B(), basketAmounts.mo115453z(), basketAmounts.mo115422A(), 1, (DefaultConstructorMarker) null);
        }
        return null;
    }

    @C12580l
    /* renamed from: c */
    public static final BasketPromotionCode m155981c(@C12580l BasketPromotionCode basketPromotionCode) {
        if (basketPromotionCode != null) {
            return new BasketPromotionCode(basketPromotionCode.mo115621e(), basketPromotionCode.mo115623f());
        }
        return null;
    }
}
