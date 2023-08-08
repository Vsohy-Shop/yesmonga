package com.carrefour.fid.android;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.carrefour.fid.android.d */
public interface C13974d extends C34417m1 {
    String getContent();

    ByteString getContentBytes();

    String getLabel();

    ByteString getLabelBytes();

    CatalogProductPicto getPictos(int i);

    int getPictosCount();

    List<CatalogProductPicto> getPictosList();
}
