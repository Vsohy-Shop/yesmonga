package com.carrefour.fid.android.catalogs.data.local.mapper;

import com.carrefour.fid.android.CatalogProductPicto;
import com.carrefour.fid.android.FavoriteCatalogProductList;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductDescription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProtoToDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoToDomain.kt\ncom/carrefour/fid/android/catalogs/data/local/mapper/ProtoToDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1549#2:41\n1620#2,2:42\n1549#2:44\n1620#2,3:45\n1622#2:48\n1549#2:49\n1620#2,3:50\n*S KotlinDebug\n*F\n+ 1 ProtoToDomain.kt\ncom/carrefour/fid/android/catalogs/data/local/mapper/ProtoToDomainKt\n*L\n10#1:41\n10#1:42,2\n24#1:44\n24#1:45,3\n10#1:48\n33#1:49\n33#1:50,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.data.local.mapper.b */
public final class C39406b {
    @C12579k
    /* renamed from: a */
    public static final CatalogProductDescription m161516a(@C12579k com.carrefour.fid.android.CatalogProductDescription catalogProductDescription) {
        Intrinsics.checkNotNullParameter(catalogProductDescription, "<this>");
        String label = catalogProductDescription.getLabel();
        Intrinsics.checkNotNullExpressionValue(label, "label");
        String content = catalogProductDescription.getContent();
        Intrinsics.checkNotNullExpressionValue(content, "content");
        List<CatalogProductPicto> pictosList = catalogProductDescription.getPictosList();
        Intrinsics.checkNotNullExpressionValue(pictosList, "pictosList");
        Iterable<CatalogProductPicto> iterable = pictosList;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (CatalogProductPicto catalogProductPicto : iterable) {
            Intrinsics.checkNotNullExpressionValue(catalogProductPicto, "it");
            arrayList.add(m161517b(catalogProductPicto));
        }
        return new CatalogProductDescription(label, content, arrayList);
    }

    @C12579k
    /* renamed from: b */
    public static final com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto m161517b(@C12579k CatalogProductPicto catalogProductPicto) {
        Intrinsics.checkNotNullParameter(catalogProductPicto, "<this>");
        String pictoID = catalogProductPicto.getPictoID();
        Intrinsics.checkNotNullExpressionValue(pictoID, "pictoID");
        String pictoURL = catalogProductPicto.getPictoURL();
        Intrinsics.checkNotNullExpressionValue(pictoURL, "pictoURL");
        return new com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto(pictoID, pictoURL);
    }

    @C12579k
    /* renamed from: c */
    public static final List<CatalogProduct> m161518c(@C12579k FavoriteCatalogProductList favoriteCatalogProductList) {
        Intrinsics.checkNotNullParameter(favoriteCatalogProductList, "<this>");
        List<com.carrefour.fid.android.CatalogProduct> itemsList = favoriteCatalogProductList.getItemsList();
        Intrinsics.checkNotNullExpressionValue(itemsList, "itemsList");
        Iterable iterable = itemsList;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            com.carrefour.fid.android.CatalogProduct catalogProduct = (com.carrefour.fid.android.CatalogProduct) it.next();
            String productId = catalogProduct.getProductId();
            Intrinsics.checkNotNullExpressionValue(productId, "it.productId");
            String catalogId = catalogProduct.getCatalogId();
            Intrinsics.checkNotNullExpressionValue(catalogId, "it.catalogId");
            String ean = catalogProduct.getEan();
            Intrinsics.checkNotNullExpressionValue(ean, "it.ean");
            String name = catalogProduct.getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.name");
            String brand = catalogProduct.getBrand();
            Intrinsics.checkNotNullExpressionValue(brand, "it.brand");
            String price = catalogProduct.getPrice();
            Intrinsics.checkNotNullExpressionValue(price, "it.price");
            String promoImage = catalogProduct.getPromoImage();
            Intrinsics.checkNotNullExpressionValue(promoImage, "it.promoImage");
            String shelf = catalogProduct.getShelf();
            Intrinsics.checkNotNullExpressionValue(shelf, "it.shelf");
            int pageNum = (int) catalogProduct.getPageNum();
            String subShelf = catalogProduct.getSubShelf();
            Intrinsics.checkNotNullExpressionValue(subShelf, "it.subShelf");
            String unitPrice = catalogProduct.getUnitPrice();
            Intrinsics.checkNotNullExpressionValue(unitPrice, "it.unitPrice");
            String legalInfo = catalogProduct.getLegalInfo();
            Intrinsics.checkNotNullExpressionValue(legalInfo, "it.legalInfo");
            List<com.carrefour.fid.android.CatalogProductDescription> descriptionsList = catalogProduct.getDescriptionsList();
            Iterator it2 = it;
            Intrinsics.checkNotNullExpressionValue(descriptionsList, "it.descriptionsList");
            Iterable<com.carrefour.fid.android.CatalogProductDescription> iterable2 = descriptionsList;
            ArrayList arrayList2 = arrayList;
            String str = legalInfo;
            ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            for (com.carrefour.fid.android.CatalogProductDescription catalogProductDescription : iterable2) {
                Intrinsics.checkNotNullExpressionValue(catalogProductDescription, "description");
                arrayList3.add(m161516a(catalogProductDescription));
            }
            String catalogEndData = catalogProduct.getCatalogEndData();
            Intrinsics.checkNotNullExpressionValue(catalogEndData, "it.catalogEndData");
            String imageUrl = catalogProduct.getImageUrl();
            Intrinsics.checkNotNullExpressionValue(imageUrl, "it.imageUrl");
            ArrayList arrayList4 = arrayList2;
            arrayList4.add(new CatalogProduct(productId, catalogId, ean, name, brand, price, promoImage, shelf, pageNum, subShelf, unitPrice, str, arrayList3, catalogEndData, imageUrl));
            arrayList = arrayList4;
            it = it2;
        }
        return arrayList;
    }
}
