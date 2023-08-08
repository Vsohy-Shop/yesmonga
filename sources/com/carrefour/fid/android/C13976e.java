package com.carrefour.fid.android;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.carrefour.fid.android.e */
public interface C13976e extends C34417m1 {
    String getBrand();

    ByteString getBrandBytes();

    String getCatalogEndData();

    ByteString getCatalogEndDataBytes();

    String getCatalogId();

    ByteString getCatalogIdBytes();

    CatalogProductDescription getDescriptions(int i);

    int getDescriptionsCount();

    List<CatalogProductDescription> getDescriptionsList();

    String getEan();

    ByteString getEanBytes();

    String getImageUrl();

    ByteString getImageUrlBytes();

    String getLegalInfo();

    ByteString getLegalInfoBytes();

    String getName();

    ByteString getNameBytes();

    long getPageNum();

    String getPrice();

    ByteString getPriceBytes();

    String getProductId();

    ByteString getProductIdBytes();

    String getPromoImage();

    ByteString getPromoImageBytes();

    String getShelf();

    ByteString getShelfBytes();

    String getSubShelf();

    ByteString getSubShelfBytes();

    String getUnitPrice();

    ByteString getUnitPriceBytes();
}
