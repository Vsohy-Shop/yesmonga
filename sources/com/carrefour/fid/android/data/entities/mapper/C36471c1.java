package com.carrefour.fid.android.data.entities.mapper;

import com.carrefour.fid.android.domain.models.FreshnessGuaranteeDomain;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.OfferPriceDomain;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.ProductDomain;
import com.carrefour.fid.android.domain.models.ProductPictureDomain;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.offer.C38064a;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscount;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountArticle;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountPromotionCode;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.shared.extension.C28746b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nRecommendedProductsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendedProductsMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/RecommendedProductsMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1549#2:89\n1620#2,3:90\n1549#2:93\n1620#2,3:94\n1549#2:97\n1620#2,3:98\n*S KotlinDebug\n*F\n+ 1 RecommendedProductsMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/RecommendedProductsMapperKt\n*L\n24#1:89\n24#1:90,3\n61#1:93\n61#1:94,3\n64#1:97\n64#1:98,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.mapper.c1 */
public final class C36471c1 {
    @C12579k
    /* renamed from: a */
    public static final OfferProductDomain m149605a(@C12579k C38064a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        Integer num2;
        Integer num3;
        String str5;
        String str6;
        Double d;
        Double d2;
        String str7;
        OfferDiscountType offerDiscountType;
        boolean z;
        ArrayList arrayList;
        Long l;
        Integer num4;
        ArrayList arrayList2;
        Double d3;
        String str8;
        Integer num5;
        List<OfferDiscountArticle> y;
        List<Gtin> t;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        OfferAvailability D = aVar.mo118196j().mo117995D();
        List<OfferFlag> M = aVar.mo118196j().mo118010S().mo118412M();
        OfferIdentifierDomain offerIdentifierDomain = new OfferIdentifierDomain(aVar.mo118196j().mo118001J().mo118136f(), aVar.mo118196j().mo118001J().mo118134e());
        String P = aVar.mo118196j().mo118010S().mo118415P();
        String e = aVar.mo118196j().mo118001J().mo118134e();
        String S = aVar.mo118196j().mo118010S().mo118418S();
        Iterable<ProductPicture> Q = aVar.mo118196j().mo118010S().mo118416Q();
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(Q, 10));
        for (ProductPicture productPicture : Q) {
            arrayList3.add(new ProductPictureDomain(productPicture.mo118573e(), productPicture.getOrder()));
        }
        List<OfferFlag> M2 = aVar.mo118196j().mo118010S().mo118412M();
        String W = aVar.mo118196j().mo118010S().mo118422W();
        String V = aVar.mo118196j().mo118010S().mo118421V();
        ProductCategory H = aVar.mo118196j().mo118010S().mo118407H();
        String str9 = null;
        if (H != null) {
            str = H.mo117294n();
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        ProductCategory H2 = aVar.mo118196j().mo118010S().mo118407H();
        if (H2 != null) {
            str3 = H2.mo117297q();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        ProductCategory H3 = aVar.mo118196j().mo118010S().mo118407H();
        if (H3 != null) {
            num = Integer.valueOf(H3.mo117296p());
        } else {
            num = null;
        }
        int g = C28746b0.m119036g(num);
        ProductCategory H4 = aVar.mo118196j().mo118010S().mo118407H();
        if (H4 != null) {
            num2 = Integer.valueOf(H4.mo117296p());
        } else {
            num2 = null;
        }
        ProductDomain productDomain = new ProductDomain(new ProductCategoryDomain(str2, str4, g, String.valueOf(num2), (ProductCategoryDomain) null), P, M2, arrayList3, aVar.mo118196j().mo118010S().mo118419T(), V, W, e, S, aVar.mo118196j().mo118028e0(), aVar.mo118196j().mo118010S().mo118436e0(), aVar.mo118196j().mo118010S().mo118406G(), aVar.mo118196j().mo118010S().mo118410K());
        OfferPriceDomain offerPriceDomain = new OfferPriceDomain(Double.valueOf(aVar.mo118196j().mo118009R().mo118172m()), Double.valueOf(aVar.mo118196j().mo118009R().mo118171l()), aVar.mo118196j().mo118009R().mo118170k(), Double.valueOf(aVar.mo118196j().mo118009R().mo118168i()), Double.valueOf(aVar.mo118196j().mo118009R().mo118169j()));
        Double Q2 = aVar.mo118196j().mo118008Q();
        Double P2 = aVar.mo118196j().mo118007P();
        OfferDiscount F = aVar.mo118196j().mo117997F();
        if (F != null) {
            num3 = Integer.valueOf(F.mo118075p());
        } else {
            num3 = null;
        }
        OfferDiscount F2 = aVar.mo118196j().mo117997F();
        if (F2 != null) {
            str5 = F2.mo118076q();
        } else {
            str5 = null;
        }
        OfferDiscount F3 = aVar.mo118196j().mo117997F();
        if (F3 != null) {
            str6 = F3.mo118077r();
        } else {
            str6 = null;
        }
        OfferDiscount F4 = aVar.mo118196j().mo117997F();
        if (F4 != null) {
            d = Double.valueOf(F4.mo118074o());
        } else {
            d = null;
        }
        OfferDiscount F5 = aVar.mo118196j().mo117997F();
        if (F5 != null) {
            d2 = Double.valueOf(F5.mo118078s());
        } else {
            d2 = null;
        }
        OfferDiscount F6 = aVar.mo118196j().mo117997F();
        if (F6 != null) {
            str7 = F6.mo118082v();
        } else {
            str7 = null;
        }
        OfferDiscount F7 = aVar.mo118196j().mo117997F();
        if (F7 != null) {
            offerDiscountType = F7.mo118087z();
        } else {
            offerDiscountType = null;
        }
        OfferDiscount F8 = aVar.mo118196j().mo117997F();
        if (F8 != null) {
            z = F8.mo118081u();
        } else {
            z = false;
        }
        boolean z2 = z;
        OfferDiscount F9 = aVar.mo118196j().mo117997F();
        if (F9 == null || (t = F9.mo118079t()) == null) {
            arrayList = null;
        } else {
            Iterable<Gtin> iterable = t;
            ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (Gtin i : iterable) {
                arrayList4.add(i.mo118380i());
            }
            arrayList = arrayList4;
        }
        OfferDiscount F10 = aVar.mo118196j().mo117997F();
        if (F10 != null) {
            l = Long.valueOf(F10.mo118083w());
        } else {
            l = null;
        }
        OfferDiscount F11 = aVar.mo118196j().mo117997F();
        if (F11 != null) {
            num4 = Integer.valueOf(F11.mo118085x());
        } else {
            num4 = null;
        }
        OfferDiscount F12 = aVar.mo118196j().mo117997F();
        if (F12 == null || (y = F12.mo118086y()) == null) {
            arrayList2 = null;
        } else {
            Iterable<OfferDiscountArticle> iterable2 = y;
            ArrayList arrayList5 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            for (OfferDiscountArticle offerDiscountArticle : iterable2) {
                arrayList5.add(new com.carrefour.fid.android.domain.models.OfferDiscountArticle(offerDiscountArticle.mo118096e(), Integer.valueOf(offerDiscountArticle.mo118098f())));
            }
            arrayList2 = arrayList5;
        }
        OfferDiscountDomain offerDiscountDomain = new OfferDiscountDomain(num3, str5, str6, d, d2, str7, offerDiscountType, z2, arrayList, l, num4, arrayList2);
        OfferDiscountPromotionCode G = aVar.mo118196j().mo117998G();
        if (G != null) {
            d3 = Double.valueOf(G.mo118112f());
        } else {
            d3 = null;
        }
        OfferDiscountPromotionCode G2 = aVar.mo118196j().mo117998G();
        if (G2 != null) {
            str8 = G2.mo118110e();
        } else {
            str8 = null;
        }
        OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain = new OfferDiscountPromoCodeDomain(d3, str8);
        int U = aVar.mo118196j().mo118012U();
        Integer valueOf = Integer.valueOf(aVar.mo118196j().mo118002K());
        Integer valueOf2 = Integer.valueOf(aVar.mo118196j().mo118004M());
        Integer valueOf3 = Integer.valueOf(aVar.mo118196j().mo118006O());
        boolean Y = aVar.mo118196j().mo118016Y();
        String n = aVar.mo118200n();
        Double valueOf4 = Double.valueOf(aVar.mo118198l());
        ProductCategory H5 = aVar.mo118196j().mo118010S().mo118407H();
        if (H5 != null) {
            num5 = Integer.valueOf(H5.mo117296p());
        } else {
            num5 = null;
        }
        ProductCategory H6 = aVar.mo118196j().mo118010S().mo118407H();
        if (H6 != null) {
            str9 = H6.mo117294n();
        }
        return new OfferProductDomain(D, M, offerIdentifierDomain, productDomain, offerPriceDomain, Q2, P2, offerDiscountDomain, offerDiscountPromoCodeDomain, U, valueOf, valueOf2, valueOf3, Y, (Double) null, n, valueOf4, num5, (Double) null, str9, (Double) null, (FreshnessGuaranteeDomain) null, aVar.mo118196j().mo118010S().mo118436e0(), false, 1048576, (DefaultConstructorMarker) null);
    }
}
