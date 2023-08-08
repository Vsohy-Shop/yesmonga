package com.carrefour.fid.android.presentation.models.mapper;

import com.carrefour.fid.android.domain.models.CriteoFormatRenderingDomain;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.OfferPriceDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.ProductPictureDomain;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.criteo.C37999a;
import com.carrefour.fid.android.domain.models.criteo.C38000b;
import com.carrefour.fid.android.domain.models.criteo.C38002d;
import com.carrefour.fid.android.domain.models.criteo.C38012n;
import com.carrefour.fid.android.domain.models.criteo.C38013o;
import com.carrefour.fid.android.domain.models.criteo.CriteoFormatRendering;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscount;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountArticle;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountPromotionCode;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.presentation.models.C38456d;
import com.carrefour.fid.android.presentation.models.CriteoButterFlyModel;
import com.carrefour.fid.android.presentation.models.CriteoFlagshipModel;
import com.carrefour.fid.android.presentation.models.CriteoProductModel;
import com.carrefour.fid.android.presentation.models.OfferNotificationType;
import com.carrefour.fid.android.presentation.models.ProductModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCriteoProductModelDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CriteoProductModelDataMapper.kt\ncom/carrefour/fid/android/presentation/models/mapper/CriteoProductModelDataMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1549#2:156\n1620#2,2:157\n1549#2:160\n1620#2,3:161\n1549#2:164\n1620#2,3:165\n1549#2:168\n1620#2,3:169\n1622#2:172\n766#2:173\n857#2,2:174\n1#3:159\n*S KotlinDebug\n*F\n+ 1 CriteoProductModelDataMapper.kt\ncom/carrefour/fid/android/presentation/models/mapper/CriteoProductModelDataMapperKt\n*L\n24#1:156\n24#1:157,2\n48#1:160\n48#1:161,3\n83#1:164\n83#1:165,3\n86#1:168\n86#1:169,3\n24#1:172\n113#1:173\n113#1:174,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.models.mapper.a */
public final class C38498a {
    @C12579k
    /* renamed from: a */
    public static final CriteoFormatRenderingDomain m159739a(@C12579k CriteoFormatRendering criteoFormatRendering) {
        Intrinsics.checkNotNullParameter(criteoFormatRendering, "<this>");
        return new CriteoFormatRenderingDomain(criteoFormatRendering.mo117355r(), criteoFormatRendering.mo117351n(), criteoFormatRendering.mo117350m(), criteoFormatRendering.mo117352o(), criteoFormatRendering.mo117353p(), criteoFormatRendering.mo117359u(), criteoFormatRendering.mo117354q(), criteoFormatRendering.mo117360v(), criteoFormatRendering.mo117356s(), criteoFormatRendering.mo117357t());
    }

    @C12579k
    /* renamed from: b */
    public static final List<CriteoProductModel> m159740b(@C12579k C38013o oVar) {
        boolean z;
        Object obj;
        OfferAvailability offerAvailability;
        List<OfferFlag> list;
        OfferIdentifier offerIdentifier;
        String str;
        String str2;
        ProductCategoryDomain productCategoryDomain;
        String str3;
        String str4;
        String str5;
        String str6;
        List<ProductPicture> list2;
        List<OfferFlag> list3;
        String str7;
        String str8;
        ProductNutriScore productNutriScore;
        boolean z2;
        boolean z3;
        String str9;
        boolean z4;
        OfferPriceDomain offerPriceDomain;
        Double d;
        Iterator it;
        OfferDiscountDomain offerDiscountDomain;
        OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain;
        Integer num;
        Integer num2;
        Integer num3;
        boolean z5;
        OfferDiscountPromotionCode G;
        OfferDiscount F;
        Prices R;
        Product S;
        Product S2;
        String G2;
        Product S3;
        Product S4;
        Product S5;
        Product S6;
        Product S7;
        Product S8;
        Product S9;
        Product S10;
        Product S11;
        Product S12;
        ProductCategory H;
        String str10;
        Product S13;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Iterable a = oVar.mo117385a();
        int i = 10;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(a, 10));
        Iterator it2 = a.iterator();
        while (it2.hasNext()) {
            C38012n nVar = (C38012n) it2.next();
            Iterator it3 = oVar.mo117386b().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (Intrinsics.areEqual((Object) nVar.mo117559o(), (Object) ((Offer) obj).mo118001J().mo118136f())) {
                    break;
                }
            }
            Offer offer = (Offer) obj;
            if (offer == null || (offerAvailability = offer.mo117995D()) == null) {
                offerAvailability = OfferAvailability.UNKNOWN;
            }
            OfferAvailability offerAvailability2 = offerAvailability;
            if (offer == null || (S13 = offer.mo118010S()) == null) {
                list = null;
            } else {
                list = S13.mo118412M();
            }
            if (offer != null) {
                offerIdentifier = offer.mo118001J();
            } else {
                offerIdentifier = null;
            }
            if (offerIdentifier != null) {
                str = offerIdentifier.mo118136f();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (offerIdentifier != null) {
                str2 = offerIdentifier.mo118134e();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            OfferIdentifierDomain offerIdentifierDomain = new OfferIdentifierDomain(str, str2);
            if (offer == null || (S12 = offer.mo118010S()) == null || (H = S12.mo118407H()) == null) {
                productCategoryDomain = null;
            } else {
                String n = H.mo117294n();
                String q = H.mo117297q();
                int p = H.mo117296p();
                String s = H.mo117299s();
                if (s == null) {
                    str10 = "";
                } else {
                    str10 = s;
                }
                productCategoryDomain = new ProductCategoryDomain(n, q, p, str10, (ProductCategoryDomain) null);
            }
            if (offer == null || (S11 = offer.mo118010S()) == null) {
                str3 = null;
            } else {
                str3 = S11.mo118415P();
            }
            if (offer == null || (S10 = offer.mo118010S()) == null) {
                str4 = null;
            } else {
                str4 = S10.mo118425Z();
            }
            if (str4 == null) {
                str5 = "";
            } else {
                str5 = str4;
            }
            if (offer == null || (S9 = offer.mo118010S()) == null) {
                str6 = null;
            } else {
                str6 = S9.mo118418S();
            }
            if (offer == null || (S8 = offer.mo118010S()) == null) {
                list2 = null;
            } else {
                list2 = S8.mo118416Q();
            }
            if (list2 == null) {
                list2 = CollectionsKt__CollectionsKt.m40441E();
            }
            Iterable<ProductPicture> iterable = list2;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, i));
            for (ProductPicture productPicture : iterable) {
                arrayList2.add(new ProductPictureDomain(productPicture.mo118573e(), productPicture.getOrder()));
            }
            if (offer == null || (S7 = offer.mo118010S()) == null) {
                list3 = null;
            } else {
                list3 = S7.mo118412M();
            }
            if (offer == null || (S6 = offer.mo118010S()) == null) {
                str7 = null;
            } else {
                str7 = S6.mo118422W();
            }
            if (offer == null || (S5 = offer.mo118010S()) == null) {
                str8 = null;
            } else {
                str8 = S5.mo118421V();
            }
            if (offer == null || (S4 = offer.mo118010S()) == null) {
                productNutriScore = null;
            } else {
                productNutriScore = S4.mo118419T();
            }
            if (offer != null) {
                z2 = offer.mo118028e0();
            } else {
                z2 = false;
            }
            if (offer == null || (S3 = offer.mo118010S()) == null) {
                z3 = false;
            } else {
                z3 = S3.mo118436e0();
            }
            if (offer == null || (S2 = offer.mo118010S()) == null || (G2 = S2.mo118406G()) == null) {
                str9 = "";
            } else {
                str9 = G2;
            }
            if (offer == null || (S = offer.mo118010S()) == null) {
                z4 = false;
            } else {
                z4 = S.mo118410K();
            }
            ProductModel productModel = new ProductModel(productCategoryDomain, str3, list3, arrayList2, productNutriScore, str8, str7, str5, str6, z2, z3, str9, z4);
            if (offer == null || (R = offer.mo118009R()) == null) {
                offerPriceDomain = null;
            } else {
                offerPriceDomain = new OfferPriceDomain(Double.valueOf(R.mo118172m()), Double.valueOf(R.mo118171l()), R.mo118170k(), Double.valueOf(R.mo118168i()), Double.valueOf(R.mo118169j()));
            }
            if (offer != null) {
                d = offer.mo118008Q();
            } else {
                d = null;
            }
            if (offer == null || (F = offer.mo117997F()) == null) {
                it = it2;
                offerDiscountDomain = null;
            } else {
                Integer valueOf = Integer.valueOf(F.mo118075p());
                String q2 = F.mo118076q();
                String r = F.mo118077r();
                Double valueOf2 = Double.valueOf(F.mo118074o());
                Double valueOf3 = Double.valueOf(F.mo118078s());
                String v = F.mo118082v();
                OfferDiscountType z6 = F.mo118087z();
                boolean u = F.mo118081u();
                Iterable<Gtin> t = F.mo118079t();
                ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(t, i));
                for (Gtin i2 : t) {
                    arrayList3.add(i2.mo118380i());
                }
                Long valueOf4 = Long.valueOf(F.mo118083w());
                Integer valueOf5 = Integer.valueOf(F.mo118085x());
                Iterable<OfferDiscountArticle> y = F.mo118086y();
                ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(y, i));
                for (OfferDiscountArticle offerDiscountArticle : y) {
                    arrayList4.add(new com.carrefour.fid.android.domain.models.OfferDiscountArticle(offerDiscountArticle.mo118096e(), Integer.valueOf(offerDiscountArticle.mo118098f())));
                    it2 = it2;
                }
                it = it2;
                offerDiscountDomain = new OfferDiscountDomain(valueOf, q2, r, valueOf2, valueOf3, v, z6, u, arrayList3, valueOf4, valueOf5, arrayList4);
            }
            if (offer == null || (G = offer.mo117998G()) == null) {
                offerDiscountPromoCodeDomain = null;
            } else {
                offerDiscountPromoCodeDomain = new OfferDiscountPromoCodeDomain(Double.valueOf(G.mo118112f()), G.mo118110e());
            }
            if (offer != null) {
                num = Integer.valueOf(offer.mo118002K());
            } else {
                num = null;
            }
            if (offer != null) {
                num2 = Integer.valueOf(offer.mo118004M());
            } else {
                num2 = null;
            }
            if (offer != null) {
                num3 = Integer.valueOf(offer.mo118006O());
            } else {
                num3 = null;
            }
            if (offer != null) {
                z5 = offer.mo118016Y();
            } else {
                z5 = false;
            }
            OfferDiscountDomain offerDiscountDomain2 = offerDiscountDomain;
            arrayList.add(new CriteoProductModel(offerAvailability2, list, offerIdentifierDomain, productModel, offerPriceDomain, d, offerDiscountDomain2, offerDiscountPromoCodeDomain, 0, num, num2, num3, z5, (Double) null, (OfferNotificationType) null, (String) null, "undefined", nVar.mo117560p(), nVar.mo117557m(), nVar.mo117555k(), nVar.mo117554j(), nVar.mo117558n(), 49152, (DefaultConstructorMarker) null));
            it2 = it;
            i = 10;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object next : arrayList) {
            if (((CriteoProductModel) next).mo121502W() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList5.add(next);
            }
        }
        return arrayList5;
    }

    @C12579k
    /* renamed from: c */
    public static final C38456d m159741c(@C12579k C37999a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new C38456d(aVar.mo117377j(), aVar.mo117379l(), aVar.mo117378k(), aVar.mo117383p(), aVar.mo117381n(), aVar.mo117382o(), aVar.mo117380m(), false);
    }

    @C12579k
    /* renamed from: d */
    public static final CriteoButterFlyModel m159742d(@C12579k C38000b bVar) {
        CriteoFormatRenderingDomain criteoFormatRenderingDomain;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List<CriteoProductModel> b = m159740b(bVar);
        List<String> p = bVar.mo117400p();
        CriteoFormatRendering s = bVar.mo117403s();
        if (s != null) {
            criteoFormatRenderingDomain = m159739a(s);
        } else {
            criteoFormatRenderingDomain = null;
        }
        return new CriteoButterFlyModel(b, p, criteoFormatRenderingDomain, bVar.mo117388d(), bVar.mo117401q(), bVar.mo117402r(), 0, 64, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: e */
    public static final CriteoFlagshipModel m159743e(@C12579k C38002d dVar) {
        CriteoFormatRenderingDomain criteoFormatRenderingDomain;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List<CriteoProductModel> b = m159740b(dVar);
        CriteoFormatRendering q = dVar.mo117430q();
        if (q != null) {
            criteoFormatRenderingDomain = m159739a(q);
        } else {
            criteoFormatRenderingDomain = null;
        }
        return new CriteoFlagshipModel(b, criteoFormatRenderingDomain, dVar.mo117388d(), dVar.mo117428o(), dVar.mo117429p(), 0, 32, (DefaultConstructorMarker) null);
    }
}
