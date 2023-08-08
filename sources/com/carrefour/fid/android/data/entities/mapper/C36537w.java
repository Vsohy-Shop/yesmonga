package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.extension.C36304c;
import com.carrefour.fid.android.data.entities.APIMDeal;
import com.carrefour.fid.android.data.entities.APIMDiscount;
import com.carrefour.fid.android.data.entities.APIMFood;
import com.carrefour.fid.android.data.entities.APIMFoodIngredients;
import com.carrefour.fid.android.data.entities.APIMNode;
import com.carrefour.fid.android.data.entities.APIMPicture;
import com.carrefour.fid.android.data.entities.APIMProduct;
import com.carrefour.fid.android.data.entities.APIMProducts;
import com.carrefour.fid.android.data.entities.APIMTerm;
import com.carrefour.fid.android.data.entities.Facet;
import com.carrefour.fid.android.data.entities.Flags;
import com.carrefour.fid.android.data.entities.Hit;
import com.carrefour.fid.android.data.entities.Offer;
import com.carrefour.fid.android.data.entities.Products;
import com.carrefour.fid.android.data.entities.extension.C36445d;
import com.carrefour.fid.android.data.entities.extension.C36451h;
import com.carrefour.fid.android.data.entities.extension.C36452i;
import com.carrefour.fid.android.data.entities.mapper.C36494i;
import com.carrefour.fid.android.data.entities.mapper.C36529u;
import com.carrefour.fid.android.domain.models.C37954b0;
import com.carrefour.fid.android.domain.models.C38040j;
import com.carrefour.fid.android.domain.models.C38182t;
import com.carrefour.fid.android.domain.models.C38185w;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.OfferPriceDomain;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.ProductDomain;
import com.carrefour.fid.android.domain.models.ProductPictureDomain;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.PriorityFlag;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import com.carrefour.fid.android.shared.base.C28486g;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAPIMProductsApiMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APIMProductsApiMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMProductsApiMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n766#2:148\n857#2,2:149\n766#2:151\n857#2,2:152\n1549#2:154\n1620#2,2:155\n1549#2:157\n1620#2,3:158\n1622#2:161\n1549#2:162\n1620#2,2:163\n1549#2:166\n1620#2,3:167\n1045#2:170\n1622#2:171\n1#3:165\n*S KotlinDebug\n*F\n+ 1 APIMProductsApiMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMProductsApiMapper\n*L\n35#1:148\n35#1:149,2\n41#1:151\n41#1:152,2\n44#1:154\n44#1:155,2\n49#1:157\n49#1:158,3\n44#1:161\n60#1:162\n60#1:163,2\n84#1:166\n84#1:167,3\n87#1:170\n60#1:171\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.mapper.w */
public final class C36537w extends C28486g<C36538a, C38185w> {

    /* renamed from: e */
    public static final int f90232e = 0;
    @C12579k

    /* renamed from: b */
    public final C36487g f90233b;
    @C12579k

    /* renamed from: c */
    public final C36494i f90234c;
    @C12579k

    /* renamed from: d */
    public final C36529u f90235d;

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 APIMProductsApiMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMProductsApiMapper\n*L\n1#1,328:1\n87#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.w$b */
    public static final class C36539b<T> implements Comparator {
        public final int compare(T t, T t2) {
            Integer num;
            PriorityFlag r = ((OfferFlag) t).mo118126r();
            Integer num2 = null;
            if (r != null) {
                num = Integer.valueOf(r.mo118181r());
            } else {
                num = null;
            }
            PriorityFlag r2 = ((OfferFlag) t2).mo118126r();
            if (r2 != null) {
                num2 = Integer.valueOf(r2.mo118181r());
            }
            return C11006g.m42424l(num, num2);
        }
    }

    @Inject
    public C36537w(@C12579k C36487g gVar, @C12579k C36494i iVar, @C12579k C36529u uVar) {
        Intrinsics.checkNotNullParameter(gVar, "apimNodeDataMapper");
        Intrinsics.checkNotNullParameter(iVar, "offerAvailabilityMapper");
        Intrinsics.checkNotNullParameter(uVar, "pageMapper");
        this.f90233b = gVar;
        this.f90234c = iVar;
        this.f90235d = uVar;
    }

    /* renamed from: d */
    public final String mo111342d(APIMProduct aPIMProduct) {
        boolean z;
        if (C36452i.m149524a(aPIMProduct)) {
            String shortTitle = aPIMProduct.getShortTitle();
            if (shortTitle == null || shortTitle.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String shortTitle2 = aPIMProduct.getShortTitle();
                String productBrand = aPIMProduct.getProductBrand();
                return shortTitle2 + " " + productBrand;
            }
        }
        return aPIMProduct.getName();
    }

    @C12579k
    /* renamed from: e */
    public C38185w mo72340a(@C12579k C36538a aVar) {
        Integer num;
        ArrayList arrayList;
        ArrayList arrayList2;
        Products products;
        List<Hit> hits;
        List<OfferFlag> list;
        ProductCategoryDomain productCategoryDomain;
        String str;
        List list2;
        String str2;
        boolean z;
        String str3;
        boolean z2;
        OfferDiscountDomain offerDiscountDomain;
        Iterator it;
        int i;
        Double d;
        APIMDeal aPIMDeal;
        APIMDeal aPIMDeal2;
        Integer bundle;
        APIMFoodIngredients ingredients;
        List<OfferFlag> a;
        APIMNode aPIMNode;
        Products products2;
        List<Facet> facets;
        boolean z3;
        Products products3;
        Intrinsics.checkNotNullParameter(aVar, "entity");
        C36529u uVar = this.f90235d;
        APIMProducts g = aVar.mo111350g();
        if (g == null || (products3 = g.getProducts()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(products3.getTotalHits());
        }
        C38182t d2 = uVar.mo72340a(new C36529u.C36530a(num));
        APIMProducts g2 = aVar.mo111350g();
        int i2 = 10;
        if (g2 == null || (products2 = g2.getProducts()) == null || (facets = products2.getFacets()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = facets.iterator();
            while (true) {
                boolean z4 = true;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Facet facet = (Facet) next;
                if (!Intrinsics.areEqual((Object) facet.getType(), (Object) "checkbox") && !Intrinsics.areEqual((Object) facet.getType(), (Object) "allergobox")) {
                    z4 = false;
                }
                if (z4) {
                    arrayList3.add(next);
                }
            }
            ArrayList<Facet> arrayList4 = new ArrayList<>();
            for (Object next2 : arrayList3) {
                Facet facet2 = (Facet) next2;
                if (!aVar.mo111354j() || !C11622t.equals("Code rayon", facet2.getName(), true)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    arrayList4.add(next2);
                }
            }
            arrayList = new ArrayList(C10978t.m41495Y(arrayList4, 10));
            for (Facet facet3 : arrayList4) {
                String name = facet3.getName();
                String type = facet3.getType();
                int totalTerms = facet3.getTotalTerms();
                Iterable<APIMTerm> topTerms = facet3.getTopTerms();
                ArrayList arrayList5 = new ArrayList(C10978t.m41495Y(topTerms, 10));
                for (APIMTerm aPIMTerm : topTerms) {
                    arrayList5.add(new C37954b0(aPIMTerm.getTerm(), aPIMTerm.getCount(), aPIMTerm.getSelected()));
                }
                arrayList.add(new C38040j(name, type, totalTerms, arrayList5, facet3.getField(), facet3.getSelected()));
            }
        }
        APIMProducts g3 = aVar.mo111350g();
        if (g3 == null || (products = g3.getProducts()) == null || (hits = products.getHits()) == null) {
            arrayList2 = null;
        } else {
            Iterable iterable = hits;
            arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                Hit hit = (Hit) it3.next();
                Offer offer = (Offer) CollectionsKt___CollectionsKt.m40706w2(hit.getOffers());
                APIMDiscount discount = offer.getPrices().getDiscount();
                OfferAvailability d3 = this.f90234c.mo72340a(new C36494i.C36495a(offer, aVar.mo111353i()));
                Flags flags = offer.getFlags();
                if (flags != null) {
                    list = C36451h.m149523a(flags);
                } else {
                    list = null;
                }
                String gtin = offer.getGtin();
                String cdbase = offer.getCdbase();
                if (cdbase == null && (cdbase = hit.getProduct().getCdbase()) == null) {
                    cdbase = "";
                }
                OfferIdentifierDomain offerIdentifierDomain = new OfferIdentifierDomain(gtin, cdbase);
                List<APIMNode> categories = hit.getProduct().getCategories();
                if (categories == null || (aPIMNode = (APIMNode) CollectionsKt___CollectionsKt.m40479B2(categories)) == null) {
                    productCategoryDomain = null;
                } else {
                    productCategoryDomain = this.f90233b.mo72340a(aPIMNode);
                }
                String productId = hit.getProductId();
                String cdbase2 = offer.getCdbase();
                if (cdbase2 == null && (cdbase2 = hit.getProduct().getCdbase()) == null) {
                    str = "";
                } else {
                    str = cdbase2;
                }
                String d4 = mo111342d(hit.getProduct());
                String packaging = hit.getProduct().getPackaging();
                String origin = offer.getOrigin();
                Iterable<APIMPicture> pictures = hit.getProduct().getPictures();
                ArrayList arrayList6 = new ArrayList(C10978t.m41495Y(pictures, i2));
                for (APIMPicture aPIMPicture : pictures) {
                    arrayList6.add(new ProductPictureDomain(aPIMPicture.getPath(), aPIMPicture.getOrder()));
                }
                Flags flags2 = hit.getProduct().getFlags();
                if (flags2 == null || (a = C36451h.m149523a(flags2)) == null) {
                    list2 = null;
                } else {
                    list2 = CollectionsKt___CollectionsKt.m40675p5(a, new C36539b());
                }
                ProductNutriScore.C38063a aVar2 = ProductNutriScore.f96151a;
                APIMFood food = hit.getProduct().getFood();
                if (food == null || (ingredients = food.getIngredients()) == null) {
                    str2 = null;
                } else {
                    str2 = ingredients.getNutriscore();
                }
                ProductNutriScore a2 = aVar2.mo118185a(str2);
                Boolean isVariableWeight = offer.isVariableWeight();
                if (isVariableWeight != null) {
                    z = isVariableWeight.booleanValue();
                } else {
                    z = false;
                }
                boolean a3 = C36452i.m149524a(hit.getProduct());
                String productBrand = hit.getProduct().getProductBrand();
                if (productBrand == null) {
                    str3 = "";
                } else {
                    str3 = productBrand;
                }
                Boolean containAlcohol = hit.getProduct().getContainAlcohol();
                if (containAlcohol != null) {
                    z2 = containAlcohol.booleanValue();
                } else {
                    z2 = false;
                }
                ProductDomain productDomain = new ProductDomain(productCategoryDomain, productId, list2, arrayList6, a2, origin, packaging, str, d4, z, a3, str3, z2);
                double d5 = (double) 100;
                OfferPriceDomain offerPriceDomain = new OfferPriceDomain(Double.valueOf(((double) offer.getPrices().getStartingPrice()) / d5), Double.valueOf(((double) offer.getPrices().getSalePrice()) / d5), C36445d.m149514a(offer.getPrices().getStandardPricePerUnit()), (Double) null, (Double) null);
                if (discount != null) {
                    List<APIMDeal> deals = discount.getDeals();
                    if (deals == null || (aPIMDeal2 = (APIMDeal) CollectionsKt___CollectionsKt.m40479B2(deals)) == null || (bundle = aPIMDeal2.getBundle()) == null) {
                        i = 0;
                    } else {
                        i = bundle.intValue();
                    }
                    Integer valueOf = Integer.valueOf(i);
                    String startDate = discount.getStartDate();
                    String endDate = discount.getEndDate();
                    List<APIMDeal> deals2 = discount.getDeals();
                    if (deals2 == null || (aPIMDeal = (APIMDeal) CollectionsKt___CollectionsKt.m40479B2(deals2)) == null) {
                        it = it3;
                        d = null;
                    } else {
                        it = it3;
                        d = Double.valueOf(((double) aPIMDeal.getDiscountAmount()) / d5);
                    }
                    offerDiscountDomain = new OfferDiscountDomain(valueOf, startDate, endDate, d, Double.valueOf(((double) discount.getForcedPrice()) / d5), discount.getLabel(), OfferDiscountType.f96009a.mo118124a(discount.getType()), aVar.mo111351h(), discount.getGtins(), (Long) null, (Integer) null, (List) null, 3584, (DefaultConstructorMarker) null);
                } else {
                    it = it3;
                    offerDiscountDomain = null;
                }
                int purchasingMax = offer.getPurchasingMax();
                int purchasingMin = offer.getPurchasingMin();
                OfferIdentifierDomain offerIdentifierDomain2 = offerIdentifierDomain;
                ProductDomain productDomain2 = productDomain;
                arrayList2.add(new OfferProductDomain(d3, list, offerIdentifierDomain2, productDomain2, offerPriceDomain, (Double) null, (Double) null, offerDiscountDomain, (OfferDiscountPromoCodeDomain) null, 0, Integer.valueOf(offer.getPurchasingStep()), Integer.valueOf(purchasingMax), Integer.valueOf(purchasingMin), false, (Double) null, (String) null, (Double) null, (Integer) null, (Double) null, (String) null, (Double) null, C36304c.m148947a(offer), C36452i.m149524a(hit.getProduct()), false, 10452992, (DefaultConstructorMarker) null));
                C36538a aVar3 = aVar;
                it3 = it;
                i2 = 10;
            }
        }
        return new C38185w(d2, arrayList, arrayList2);
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.w$a */
    public static final class C36538a {

        /* renamed from: e */
        public static final int f90236e = 8;
        @C12580l

        /* renamed from: a */
        public final APIMProducts f90237a;

        /* renamed from: b */
        public final boolean f90238b;

        /* renamed from: c */
        public final boolean f90239c;
        @C12579k

        /* renamed from: d */
        public final String f90240d;

        public C36538a(@C12580l APIMProducts aPIMProducts, boolean z, boolean z2, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
            this.f90237a = aPIMProducts;
            this.f90238b = z;
            this.f90239c = z2;
            this.f90240d = str;
        }

        /* renamed from: f */
        public static /* synthetic */ C36538a m149787f(C36538a aVar, APIMProducts aPIMProducts, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                aPIMProducts = aVar.f90237a;
            }
            if ((i & 2) != 0) {
                z = aVar.f90238b;
            }
            if ((i & 4) != 0) {
                z2 = aVar.f90239c;
            }
            if ((i & 8) != 0) {
                str = aVar.f90240d;
            }
            return aVar.mo111348e(aPIMProducts, z, z2, str);
        }

        @C12580l
        /* renamed from: a */
        public final APIMProducts mo111344a() {
            return this.f90237a;
        }

        /* renamed from: b */
        public final boolean mo111345b() {
            return this.f90238b;
        }

        /* renamed from: c */
        public final boolean mo111346c() {
            return this.f90239c;
        }

        @C12579k
        /* renamed from: d */
        public final String mo111347d() {
            return this.f90240d;
        }

        @C12579k
        /* renamed from: e */
        public final C36538a mo111348e(@C12580l APIMProducts aPIMProducts, boolean z, boolean z2, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
            return new C36538a(aPIMProducts, z, z2, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36538a)) {
                return false;
            }
            C36538a aVar = (C36538a) obj;
            return Intrinsics.areEqual((Object) this.f90237a, (Object) aVar.f90237a) && this.f90238b == aVar.f90238b && this.f90239c == aVar.f90239c && Intrinsics.areEqual((Object) this.f90240d, (Object) aVar.f90240d);
        }

        @C12580l
        /* renamed from: g */
        public final APIMProducts mo111350g() {
            return this.f90237a;
        }

        /* renamed from: h */
        public final boolean mo111351h() {
            return this.f90238b;
        }

        public int hashCode() {
            APIMProducts aPIMProducts = this.f90237a;
            int hashCode = (aPIMProducts == null ? 0 : aPIMProducts.hashCode()) * 31;
            boolean z = this.f90238b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f90239c;
            if (!z3) {
                z2 = z3;
            }
            return ((i + (z2 ? 1 : 0)) * 31) + this.f90240d.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final String mo111353i() {
            return this.f90240d;
        }

        /* renamed from: j */
        public final boolean mo111354j() {
            return this.f90239c;
        }

        @C12579k
        public String toString() {
            APIMProducts aPIMProducts = this.f90237a;
            boolean z = this.f90238b;
            boolean z2 = this.f90239c;
            String str = this.f90240d;
            return "Param(entity=" + aPIMProducts + ", hasFidCard=" + z + ", isPromo=" + z2 + ", slotId=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C36538a(APIMProducts aPIMProducts, boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(aPIMProducts, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? new String() : str);
        }
    }
}
