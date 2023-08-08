package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.APIMOfflineOfferEntity;
import com.carrefour.fid.android.data.entities.Amount;
import com.carrefour.fid.android.data.entities.extension.C36449f;
import com.carrefour.fid.android.domain.models.OrdersOfflineDetailsProductDomain;
import com.carrefour.fid.android.shared.base.C28486g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.q */
public final class C36518q extends C28486g<APIMOfflineOfferEntity, OrdersOfflineDetailsProductDomain> {

    /* renamed from: b */
    public static final int f90209b = 0;

    @C12579k
    /* renamed from: d */
    public OrdersOfflineDetailsProductDomain mo72340a(@C12579k APIMOfflineOfferEntity aPIMOfflineOfferEntity) {
        double d;
        int i;
        int i2;
        double d2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        String str2;
        int i7;
        Long unscaledAmount;
        Long unscaledAmount2;
        Long unscaledAmount3;
        Intrinsics.checkNotNullParameter(aPIMOfflineOfferEntity, "entity");
        Amount offerAmount = aPIMOfflineOfferEntity.getOfferAmount();
        double d3 = 0.0d;
        if (offerAmount != null) {
            d = C36449f.m149518a(offerAmount);
        } else {
            d = 0.0d;
        }
        Amount offerAmount2 = aPIMOfflineOfferEntity.getOfferAmount();
        if (offerAmount2 == null || (unscaledAmount3 = offerAmount2.getUnscaledAmount()) == null) {
            i = 0;
        } else {
            i = (int) unscaledAmount3.longValue();
        }
        Amount offerAmount3 = aPIMOfflineOfferEntity.getOfferAmount();
        if (offerAmount3 != null) {
            i2 = offerAmount3.getScale();
        } else {
            i2 = 0;
        }
        Amount unitPrice = aPIMOfflineOfferEntity.getUnitPrice();
        if (unitPrice != null) {
            d2 = C36449f.m149518a(unitPrice);
        } else {
            d2 = 0.0d;
        }
        Amount unitPrice2 = aPIMOfflineOfferEntity.getUnitPrice();
        if (unitPrice2 == null || (unscaledAmount2 = unitPrice2.getUnscaledAmount()) == null) {
            i3 = 0;
        } else {
            i3 = (int) unscaledAmount2.longValue();
        }
        Amount unitPrice3 = aPIMOfflineOfferEntity.getUnitPrice();
        if (unitPrice3 != null) {
            i4 = unitPrice3.getScale();
        } else {
            i4 = 0;
        }
        Amount immediateDiscount = aPIMOfflineOfferEntity.getImmediateDiscount();
        if (immediateDiscount != null) {
            d3 = C36449f.m149518a(immediateDiscount);
        }
        double d4 = d3;
        Amount immediateDiscount2 = aPIMOfflineOfferEntity.getImmediateDiscount();
        if (immediateDiscount2 == null || (unscaledAmount = immediateDiscount2.getUnscaledAmount()) == null) {
            i5 = 0;
        } else {
            i5 = (int) unscaledAmount.longValue();
        }
        Amount immediateDiscount3 = aPIMOfflineOfferEntity.getImmediateDiscount();
        if (immediateDiscount3 != null) {
            i6 = immediateDiscount3.getScale();
        } else {
            i6 = 0;
        }
        String shortDescription = aPIMOfflineOfferEntity.getShortDescription();
        if (shortDescription == null) {
            str = "";
        } else {
            str = shortDescription;
        }
        String weight = aPIMOfflineOfferEntity.getWeight();
        if (weight == null) {
            str2 = "";
        } else {
            str2 = weight;
        }
        Integer quantity = aPIMOfflineOfferEntity.getQuantity();
        if (quantity != null) {
            i7 = quantity.intValue();
        } else {
            i7 = 0;
        }
        return new OrdersOfflineDetailsProductDomain(str, i, i2, d, i3, i4, d2, i5, i6, d4, str2, i7);
    }
}
