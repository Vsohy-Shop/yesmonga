package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.Amount;
import com.carrefour.fid.android.data.entities.DigitalItemEntity;
import com.carrefour.fid.android.data.entities.OHMOffersEntity;
import com.carrefour.fid.android.data.entities.extension.C36449f;
import com.carrefour.fid.android.domain.models.C38121s;
import com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain;
import com.carrefour.fid.android.shared.base.C28486g;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.r0 */
public final class C36522r0 extends C28486g<OHMOffersEntity, C38121s> {

    /* renamed from: b */
    public static final int f90216b = 0;

    @C12579k
    /* renamed from: d */
    public C38121s mo72340a(@C12579k OHMOffersEntity oHMOffersEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        double d;
        double d2;
        double d3;
        double d4;
        String str5;
        String str6;
        int i;
        double d5;
        String str7;
        double d6;
        int i2;
        boolean z;
        boolean z2;
        String str8;
        DigitalItemEntity digitalItemEntity;
        String url;
        Intrinsics.checkNotNullParameter(oHMOffersEntity, "entity");
        String brandName = oHMOffersEntity.getBrandName();
        if (brandName == null) {
            str = "";
        } else {
            str = brandName;
        }
        String category = oHMOffersEntity.getCategory();
        String cdBase = oHMOffersEntity.getCdBase();
        if (cdBase == null) {
            str2 = "";
        } else {
            str2 = cdBase;
        }
        String gtin = oHMOffersEntity.getGtin();
        if (gtin == null) {
            str3 = "";
        } else {
            str3 = gtin;
        }
        String name = oHMOffersEntity.getName();
        if (name == null) {
            str4 = "";
        } else {
            str4 = name;
        }
        Amount offerPreparedTotalAmount = oHMOffersEntity.getOfferPreparedTotalAmount();
        if (offerPreparedTotalAmount != null) {
            d = C36449f.m149518a(offerPreparedTotalAmount);
        } else {
            d = 0.0d;
        }
        Amount offerTotalAmount = oHMOffersEntity.getOfferTotalAmount();
        if (offerTotalAmount != null) {
            d2 = C36449f.m149518a(offerTotalAmount);
        } else {
            d2 = 0.0d;
        }
        Amount offerTotalImmediateDiscountAmount = oHMOffersEntity.getOfferTotalImmediateDiscountAmount();
        if (offerTotalImmediateDiscountAmount != null) {
            d3 = C36449f.m149518a(offerTotalImmediateDiscountAmount);
        } else {
            d3 = 0.0d;
        }
        Amount offerTotalPaidAmount = oHMOffersEntity.getOfferTotalPaidAmount();
        if (offerTotalPaidAmount != null) {
            d4 = C36449f.m149518a(offerTotalPaidAmount);
        } else {
            d4 = 0.0d;
        }
        String offerUnit = oHMOffersEntity.getOfferUnit();
        String originalCdBase = oHMOffersEntity.getOriginalCdBase();
        String packaging = oHMOffersEntity.getPackaging();
        if (packaging == null) {
            str5 = "";
        } else {
            str5 = packaging;
        }
        String picturePath = oHMOffersEntity.getPicturePath();
        if (picturePath == null) {
            str6 = "";
        } else {
            str6 = picturePath;
        }
        Integer preparedQuantity = oHMOffersEntity.getPreparedQuantity();
        if (preparedQuantity != null) {
            i = preparedQuantity.intValue();
        } else {
            i = 0;
        }
        Amount salePrice = oHMOffersEntity.getPrices().getSalePrice();
        if (salePrice != null) {
            d5 = C36449f.m149518a(salePrice);
        } else {
            d5 = 0.0d;
        }
        Amount standardPrice = oHMOffersEntity.getPrices().getStandardPrice();
        if (standardPrice != null) {
            double a = C36449f.m149518a(standardPrice);
            str7 = "";
            d6 = a;
        } else {
            str7 = "";
            d6 = 0.0d;
        }
        OrdersOnlineDetailsProductPriceDomain ordersOnlineDetailsProductPriceDomain = new OrdersOnlineDetailsProductPriceDomain(d5, d6);
        Integer quantity = oHMOffersEntity.getQuantity();
        if (quantity != null) {
            i2 = quantity.intValue();
        } else {
            i2 = 0;
        }
        Boolean isReturnableBag = oHMOffersEntity.isReturnableBag();
        if (isReturnableBag != null) {
            z = isReturnableBag.booleanValue();
        } else {
            z = false;
        }
        Boolean isDigitalItem = oHMOffersEntity.isDigitalItem();
        if (isDigitalItem != null) {
            z2 = isDigitalItem.booleanValue();
        } else {
            z2 = false;
        }
        List<DigitalItemEntity> digitalItem = oHMOffersEntity.getDigitalItem();
        if (digitalItem == null || (digitalItemEntity = (DigitalItemEntity) CollectionsKt___CollectionsKt.m40479B2(digitalItem)) == null || (url = digitalItemEntity.getUrl()) == null) {
            str8 = str7;
        } else {
            str8 = url;
        }
        return new C38121s(str, category, str2, str3, str4, d, d2, d3, d4, offerUnit, originalCdBase, str5, str6, i, ordersOnlineDetailsProductPriceDomain, i2, z2, str8, (String) null, (Double) null, (Double) null, z, 1835008, (DefaultConstructorMarker) null);
    }
}
