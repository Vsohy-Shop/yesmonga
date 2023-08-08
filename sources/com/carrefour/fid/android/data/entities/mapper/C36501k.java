package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.APIMProductDetails;
import com.carrefour.fid.android.data.entities.Product;
import com.carrefour.fid.android.data.entities.extension.C36452i;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.shared.base.C28486g;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.Comparator;
import javax.inject.Inject;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAPIMOfferProductApiMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APIMOfferProductApiMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMOfferProductApiMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1549#2:111\n1620#2,3:112\n1045#2:115\n1#3:116\n*S KotlinDebug\n*F\n+ 1 APIMOfferProductApiMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMOfferProductApiMapper\n*L\n39#1:111\n39#1:112,3\n43#1:115\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.mapper.k */
public final class C36501k extends C28486g<C36502a, OfferProductDomain> {

    /* renamed from: d */
    public static final int f90189d = 0;
    @C12579k

    /* renamed from: b */
    public final C36457a f90190b;
    @C12579k

    /* renamed from: c */
    public final C36494i f90191c;

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 APIMOfferProductApiMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMOfferProductApiMapper\n*L\n1#1,328:1\n43#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.k$b */
    public static final class C36503b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Integer.valueOf(((OfferFlag) t).mo118126r().mo118181r()), Integer.valueOf(((OfferFlag) t2).mo118126r().mo118181r()));
        }
    }

    @Inject
    public C36501k(@C12579k C36457a aVar, @C12579k C36494i iVar) {
        Intrinsics.checkNotNullParameter(aVar, "apimCategoryDataMapper");
        Intrinsics.checkNotNullParameter(iVar, "apimOfferAvailabilityMapper");
        this.f90190b = aVar;
        this.f90191c = iVar;
    }

    /* renamed from: d */
    public final String mo111289d(Product product) {
        boolean z;
        if (C36452i.m149525b(product)) {
            String shortTitle = product.getShortTitle();
            if (shortTitle == null || shortTitle.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String shortTitle2 = product.getShortTitle();
                String productBrand = product.getProductBrand();
                return shortTitle2 + " " + productBrand;
            }
        }
        return product.getName();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: com.carrefour.fid.android.data.entities.Category} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.domain.models.OfferProductDomain mo72340a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.data.entities.mapper.C36501k.C36502a r35) {
        /*
            r34 = this;
            r0 = r34
            java.lang.String r1 = "entity"
            r2 = r35
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            com.carrefour.fid.android.data.entities.mapper.i r1 = r0.f90191c
            com.carrefour.fid.android.data.entities.mapper.i$a r3 = new com.carrefour.fid.android.data.entities.mapper.i$a
            com.carrefour.fid.android.data.entities.APIMProductDetails r4 = r35.mo111297g()
            java.util.List r4 = r4.getOffers()
            if (r4 == 0) goto L_0x001e
            java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r4)
            com.carrefour.fid.android.data.entities.Offer r4 = (com.carrefour.fid.android.data.entities.Offer) r4
            goto L_0x001f
        L_0x001e:
            r4 = 0
        L_0x001f:
            java.lang.String r6 = r35.mo111298h()
            r3.<init>(r4, r6)
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r8 = r1.mo72340a(r3)
            com.carrefour.fid.android.data.entities.APIMProductDetails r1 = r35.mo111297g()
            java.util.List r1 = r1.getOffers()
            if (r1 == 0) goto L_0x0048
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r1)
            com.carrefour.fid.android.data.entities.Offer r1 = (com.carrefour.fid.android.data.entities.Offer) r1
            if (r1 == 0) goto L_0x0048
            com.carrefour.fid.android.data.entities.Flags r1 = r1.getFlags()
            if (r1 == 0) goto L_0x0048
            java.util.List r1 = com.carrefour.fid.android.data.entities.extension.C36451h.m149523a(r1)
            r9 = r1
            goto L_0x0049
        L_0x0048:
            r9 = 0
        L_0x0049:
            com.carrefour.fid.android.domain.models.OfferIdentifierDomain r10 = new com.carrefour.fid.android.domain.models.OfferIdentifierDomain
            com.carrefour.fid.android.data.entities.APIMProductDetails r1 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r1 = r1.getProduct()
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = r1.getGtin()
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            java.lang.String r3 = ""
            if (r1 != 0) goto L_0x0060
            r1 = r3
        L_0x0060:
            com.carrefour.fid.android.data.entities.APIMProductDetails r4 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r4 = r4.getProduct()
            if (r4 == 0) goto L_0x006f
            java.lang.String r4 = r4.getCdbase()
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            if (r4 != 0) goto L_0x0073
            r4 = r3
        L_0x0073:
            r10.<init>(r1, r4)
            com.carrefour.fid.android.data.entities.APIMProductDetails r1 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r1 = r1.getProduct()
            if (r1 == 0) goto L_0x0086
            java.lang.String r1 = r1.getGtin()
            r13 = r1
            goto L_0x0087
        L_0x0086:
            r13 = 0
        L_0x0087:
            com.carrefour.fid.android.data.entities.APIMProductDetails r1 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r1 = r1.getProduct()
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = r1.getCdbase()
            r19 = r1
            goto L_0x009a
        L_0x0098:
            r19 = 0
        L_0x009a:
            com.carrefour.fid.android.data.entities.APIMProductDetails r1 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r1 = r1.getProduct()
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = r0.mo111289d(r1)
            r20 = r1
            goto L_0x00ad
        L_0x00ab:
            r20 = 0
        L_0x00ad:
            com.carrefour.fid.android.data.entities.APIMProductDetails r1 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r1 = r1.getProduct()
            if (r1 == 0) goto L_0x00ed
            java.util.List r1 = r1.getPictures()
            if (r1 == 0) goto L_0x00ed
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r1, r6)
            r4.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x00ce:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00eb
            java.lang.Object r6 = r1.next()
            com.carrefour.fid.android.data.entities.APIMPicture r6 = (com.carrefour.fid.android.data.entities.APIMPicture) r6
            com.carrefour.fid.android.domain.models.ProductPictureDomain r7 = new com.carrefour.fid.android.domain.models.ProductPictureDomain
            java.lang.String r11 = r6.getPath()
            int r6 = r6.getOrder()
            r7.<init>(r11, r6)
            r4.add(r7)
            goto L_0x00ce
        L_0x00eb:
            r15 = r4
            goto L_0x00ee
        L_0x00ed:
            r15 = 0
        L_0x00ee:
            com.carrefour.fid.android.data.entities.APIMProductDetails r1 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r1 = r1.getProduct()
            if (r1 == 0) goto L_0x0111
            com.carrefour.fid.android.data.entities.Flags r1 = r1.getFlags()
            if (r1 == 0) goto L_0x0111
            java.util.List r1 = com.carrefour.fid.android.data.entities.extension.C36451h.m149523a(r1)
            if (r1 == 0) goto L_0x0111
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.carrefour.fid.android.data.entities.mapper.k$b r4 = new com.carrefour.fid.android.data.entities.mapper.k$b
            r4.<init>()
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40675p5(r1, r4)
            r14 = r1
            goto L_0x0112
        L_0x0111:
            r14 = 0
        L_0x0112:
            com.carrefour.fid.android.data.entities.APIMProductDetails r1 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r1 = r1.getProduct()
            if (r1 == 0) goto L_0x0123
            java.lang.String r1 = r1.getPackaging()
            r18 = r1
            goto L_0x0125
        L_0x0123:
            r18 = 0
        L_0x0125:
            com.carrefour.fid.android.data.entities.APIMProductDetails r1 = r35.mo111297g()
            java.util.List r1 = r1.getOffers()
            if (r1 == 0) goto L_0x013e
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r1)
            com.carrefour.fid.android.data.entities.Offer r1 = (com.carrefour.fid.android.data.entities.Offer) r1
            if (r1 == 0) goto L_0x013e
            java.lang.String r1 = r1.getOrigin()
            r17 = r1
            goto L_0x0140
        L_0x013e:
            r17 = 0
        L_0x0140:
            com.carrefour.fid.android.data.entities.mapper.a r1 = r0.f90190b
            com.carrefour.fid.android.data.entities.APIMProductDetails r4 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r4 = r4.getProduct()
            if (r4 == 0) goto L_0x0180
            java.util.List r4 = r4.getCategories()
            if (r4 == 0) goto L_0x0180
            r6 = r4
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0159:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0173
            java.lang.Object r7 = r6.next()
            r11 = r7
            com.carrefour.fid.android.data.entities.Category r11 = (com.carrefour.fid.android.data.entities.Category) r11
            java.lang.Boolean r11 = r11.isMainLink()
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x0159
            goto L_0x0174
        L_0x0173:
            r7 = 0
        L_0x0174:
            com.carrefour.fid.android.data.entities.Category r7 = (com.carrefour.fid.android.data.entities.Category) r7
            if (r7 != 0) goto L_0x0181
            java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r4)
            r7 = r4
            com.carrefour.fid.android.data.entities.Category r7 = (com.carrefour.fid.android.data.entities.Category) r7
            goto L_0x0181
        L_0x0180:
            r7 = 0
        L_0x0181:
            com.carrefour.fid.android.domain.models.ProductCategoryDomain r12 = r1.mo72340a(r7)
            com.carrefour.fid.android.domain.models.offer.ProductNutriScore$a r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.f96151a
            com.carrefour.fid.android.data.entities.APIMProductDetails r4 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r4 = r4.getProduct()
            if (r4 == 0) goto L_0x01a2
            com.carrefour.fid.android.data.entities.Food r4 = r4.getFood()
            if (r4 == 0) goto L_0x01a2
            com.carrefour.fid.android.data.entities.Ingredients r4 = r4.getIngredients()
            if (r4 == 0) goto L_0x01a2
            java.lang.String r4 = r4.getNutriscore()
            goto L_0x01a3
        L_0x01a2:
            r4 = 0
        L_0x01a3:
            com.carrefour.fid.android.domain.models.offer.ProductNutriScore r16 = r1.mo118185a(r4)
            com.carrefour.fid.android.data.entities.APIMProductDetails r1 = r35.mo111297g()
            java.util.List r1 = r1.getOffers()
            if (r1 == 0) goto L_0x01c6
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r1)
            com.carrefour.fid.android.data.entities.Offer r1 = (com.carrefour.fid.android.data.entities.Offer) r1
            if (r1 == 0) goto L_0x01c6
            java.lang.Boolean r1 = r1.isVariableWeight()
            if (r1 == 0) goto L_0x01c6
            boolean r1 = r1.booleanValue()
            r21 = r1
            goto L_0x01c8
        L_0x01c6:
            r21 = 0
        L_0x01c8:
            com.carrefour.fid.android.data.entities.APIMProductDetails r1 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r1 = r1.getProduct()
            if (r1 == 0) goto L_0x01d9
            boolean r1 = com.carrefour.fid.android.data.entities.extension.C36452i.m149525b(r1)
            r22 = r1
            goto L_0x01db
        L_0x01d9:
            r22 = 0
        L_0x01db:
            com.carrefour.fid.android.data.entities.APIMProductDetails r1 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r1 = r1.getProduct()
            if (r1 == 0) goto L_0x01f2
            java.lang.Boolean r1 = r1.getContainAlcohol()
            if (r1 == 0) goto L_0x01f2
            boolean r1 = r1.booleanValue()
            r24 = r1
            goto L_0x01f4
        L_0x01f2:
            r24 = 0
        L_0x01f4:
            com.carrefour.fid.android.data.entities.APIMProductDetails r1 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r1 = r1.getProduct()
            if (r1 == 0) goto L_0x0208
            java.lang.String r1 = r1.getProductBrand()
            if (r1 != 0) goto L_0x0205
            goto L_0x0208
        L_0x0205:
            r23 = r1
            goto L_0x020a
        L_0x0208:
            r23 = r3
        L_0x020a:
            com.carrefour.fid.android.domain.models.ProductDomain r1 = new com.carrefour.fid.android.domain.models.ProductDomain
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.carrefour.fid.android.data.entities.APIMProductDetails r3 = r35.mo111297g()
            java.util.List r3 = r3.getOffers()
            r6 = 100
            if (r3 == 0) goto L_0x0252
            java.lang.Object r3 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r3)
            com.carrefour.fid.android.data.entities.Offer r3 = (com.carrefour.fid.android.data.entities.Offer) r3
            if (r3 == 0) goto L_0x0252
            com.carrefour.fid.android.data.entities.Prices r3 = r3.getPrices()
            if (r3 == 0) goto L_0x0252
            com.carrefour.fid.android.domain.models.OfferPriceDomain r7 = new com.carrefour.fid.android.domain.models.OfferPriceDomain
            int r11 = r3.getStartingPrice()
            double r11 = (double) r11
            double r13 = (double) r6
            double r11 = r11 / r13
            java.lang.Double r12 = java.lang.Double.valueOf(r11)
            int r11 = r3.getSalePrice()
            double r4 = (double) r11
            double r4 = r4 / r13
            java.lang.Double r13 = java.lang.Double.valueOf(r4)
            com.carrefour.fid.android.data.entities.APIMPricePerUnit r3 = r3.getStandardPricePerUnit()
            java.lang.String r14 = com.carrefour.fid.android.data.entities.extension.C36445d.m149514a(r3)
            r15 = 0
            r16 = 0
            r11 = r7
            r11.<init>(r12, r13, r14, r15, r16)
            r12 = r7
            goto L_0x0253
        L_0x0252:
            r12 = 0
        L_0x0253:
            r13 = 0
            com.carrefour.fid.android.data.entities.APIMProductDetails r3 = r35.mo111297g()
            java.util.List r3 = r3.getOffers()
            if (r3 == 0) goto L_0x02ec
            java.lang.Object r3 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r3)
            com.carrefour.fid.android.data.entities.Offer r3 = (com.carrefour.fid.android.data.entities.Offer) r3
            if (r3 == 0) goto L_0x02ec
            com.carrefour.fid.android.data.entities.Prices r3 = r3.getPrices()
            if (r3 == 0) goto L_0x02ec
            com.carrefour.fid.android.data.entities.APIMDiscount r3 = r3.getDiscount()
            if (r3 == 0) goto L_0x02ec
            com.carrefour.fid.android.domain.models.OfferDiscountDomain r4 = new com.carrefour.fid.android.domain.models.OfferDiscountDomain
            java.util.List r5 = r3.getDeals()
            if (r5 == 0) goto L_0x028d
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r5)
            com.carrefour.fid.android.data.entities.APIMDeal r5 = (com.carrefour.fid.android.data.entities.APIMDeal) r5
            if (r5 == 0) goto L_0x028d
            java.lang.Integer r5 = r5.getBundle()
            if (r5 == 0) goto L_0x028d
            int r5 = r5.intValue()
            goto L_0x028e
        L_0x028d:
            r5 = 0
        L_0x028e:
            java.lang.Integer r20 = java.lang.Integer.valueOf(r5)
            java.lang.String r21 = r3.getStartDate()
            java.lang.String r22 = r3.getEndDate()
            java.util.List r5 = r3.getDeals()
            if (r5 == 0) goto L_0x02b7
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r5)
            com.carrefour.fid.android.data.entities.APIMDeal r5 = (com.carrefour.fid.android.data.entities.APIMDeal) r5
            if (r5 == 0) goto L_0x02b7
            int r5 = r5.getDiscountAmount()
            double r14 = (double) r5
            r5 = r12
            double r11 = (double) r6
            double r14 = r14 / r11
            java.lang.Double r7 = java.lang.Double.valueOf(r14)
            r23 = r7
            goto L_0x02ba
        L_0x02b7:
            r5 = r12
            r23 = 0
        L_0x02ba:
            int r7 = r3.getForcedPrice()
            double r11 = (double) r7
            double r6 = (double) r6
            double r11 = r11 / r6
            java.lang.Double r24 = java.lang.Double.valueOf(r11)
            java.lang.String r25 = r3.getLabel()
            com.carrefour.fid.android.domain.models.offer.OfferDiscountType$a r6 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.f96009a
            java.lang.String r7 = r3.getType()
            com.carrefour.fid.android.domain.models.offer.OfferDiscountType r26 = r6.mo118124a(r7)
            boolean r27 = r35.mo111296f()
            java.util.List r28 = r3.getGtins()
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 3584(0xe00, float:5.022E-42)
            r33 = 0
            r19 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r15 = r4
            goto L_0x02ee
        L_0x02ec:
            r5 = r12
            r15 = 0
        L_0x02ee:
            r3 = 0
            r4 = 0
            com.carrefour.fid.android.data.entities.APIMProductDetails r6 = r35.mo111297g()
            java.util.List r6 = r6.getOffers()
            if (r6 == 0) goto L_0x030b
            java.lang.Object r6 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r6)
            com.carrefour.fid.android.data.entities.Offer r6 = (com.carrefour.fid.android.data.entities.Offer) r6
            if (r6 == 0) goto L_0x030b
            int r6 = r6.getPurchasingStep()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x030c
        L_0x030b:
            r6 = 0
        L_0x030c:
            com.carrefour.fid.android.data.entities.APIMProductDetails r7 = r35.mo111297g()
            java.util.List r7 = r7.getOffers()
            if (r7 == 0) goto L_0x0329
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r7)
            com.carrefour.fid.android.data.entities.Offer r7 = (com.carrefour.fid.android.data.entities.Offer) r7
            if (r7 == 0) goto L_0x0329
            int r7 = r7.getPurchasingMax()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r19 = r7
            goto L_0x032b
        L_0x0329:
            r19 = 0
        L_0x032b:
            com.carrefour.fid.android.data.entities.APIMProductDetails r7 = r35.mo111297g()
            java.util.List r7 = r7.getOffers()
            if (r7 == 0) goto L_0x0348
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r7)
            com.carrefour.fid.android.data.entities.Offer r7 = (com.carrefour.fid.android.data.entities.Offer) r7
            if (r7 == 0) goto L_0x0348
            int r7 = r7.getPurchasingMin()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r20 = r7
            goto L_0x034a
        L_0x0348:
            r20 = 0
        L_0x034a:
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            com.carrefour.fid.android.data.entities.APIMProductDetails r7 = r35.mo111297g()
            com.carrefour.fid.android.data.entities.Product r7 = r7.getProduct()
            if (r7 == 0) goto L_0x036d
            boolean r7 = com.carrefour.fid.android.data.entities.extension.C36452i.m149525b(r7)
            r30 = r7
            goto L_0x036f
        L_0x036d:
            r30 = 0
        L_0x036f:
            com.carrefour.fid.android.data.entities.APIMProductDetails r2 = r35.mo111297g()
            java.util.List r2 = r2.getOffers()
            if (r2 == 0) goto L_0x038e
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r2)
            com.carrefour.fid.android.data.entities.Offer r2 = (com.carrefour.fid.android.data.entities.Offer) r2
            if (r2 == 0) goto L_0x038e
            java.lang.Boolean r2 = r2.isAlternativeCheaper()
            if (r2 == 0) goto L_0x038e
            boolean r2 = r2.booleanValue()
            r31 = r2
            goto L_0x0390
        L_0x038e:
            r31 = 0
        L_0x0390:
            r32 = 2064384(0x1f8000, float:2.892818E-39)
            r33 = 0
            com.carrefour.fid.android.domain.models.OfferProductDomain r2 = new com.carrefour.fid.android.domain.models.OfferProductDomain
            r7 = r2
            r11 = r1
            r12 = r5
            r1 = 0
            r14 = r1
            r16 = r3
            r17 = r4
            r18 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.mapper.C36501k.mo72340a(com.carrefour.fid.android.data.entities.mapper.k$a):com.carrefour.fid.android.domain.models.OfferProductDomain");
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.k$a */
    public static final class C36502a {

        /* renamed from: d */
        public static final int f90192d = 8;
        @C12579k

        /* renamed from: a */
        public final APIMProductDetails f90193a;

        /* renamed from: b */
        public final boolean f90194b;
        @C12579k

        /* renamed from: c */
        public final String f90195c;

        public C36502a(@C12579k APIMProductDetails aPIMProductDetails, boolean z, @C12579k String str) {
            Intrinsics.checkNotNullParameter(aPIMProductDetails, "productDetails");
            Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
            this.f90193a = aPIMProductDetails;
            this.f90194b = z;
            this.f90195c = str;
        }

        /* renamed from: e */
        public static /* synthetic */ C36502a m149696e(C36502a aVar, APIMProductDetails aPIMProductDetails, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                aPIMProductDetails = aVar.f90193a;
            }
            if ((i & 2) != 0) {
                z = aVar.f90194b;
            }
            if ((i & 4) != 0) {
                str = aVar.f90195c;
            }
            return aVar.mo111294d(aPIMProductDetails, z, str);
        }

        @C12579k
        /* renamed from: a */
        public final APIMProductDetails mo111291a() {
            return this.f90193a;
        }

        /* renamed from: b */
        public final boolean mo111292b() {
            return this.f90194b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo111293c() {
            return this.f90195c;
        }

        @C12579k
        /* renamed from: d */
        public final C36502a mo111294d(@C12579k APIMProductDetails aPIMProductDetails, boolean z, @C12579k String str) {
            Intrinsics.checkNotNullParameter(aPIMProductDetails, "productDetails");
            Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
            return new C36502a(aPIMProductDetails, z, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36502a)) {
                return false;
            }
            C36502a aVar = (C36502a) obj;
            return Intrinsics.areEqual((Object) this.f90193a, (Object) aVar.f90193a) && this.f90194b == aVar.f90194b && Intrinsics.areEqual((Object) this.f90195c, (Object) aVar.f90195c);
        }

        /* renamed from: f */
        public final boolean mo111296f() {
            return this.f90194b;
        }

        @C12579k
        /* renamed from: g */
        public final APIMProductDetails mo111297g() {
            return this.f90193a;
        }

        @C12579k
        /* renamed from: h */
        public final String mo111298h() {
            return this.f90195c;
        }

        public int hashCode() {
            int hashCode = this.f90193a.hashCode() * 31;
            boolean z = this.f90194b;
            if (z) {
                z = true;
            }
            return ((hashCode + (z ? 1 : 0)) * 31) + this.f90195c.hashCode();
        }

        @C12579k
        public String toString() {
            APIMProductDetails aPIMProductDetails = this.f90193a;
            boolean z = this.f90194b;
            String str = this.f90195c;
            return "Param(productDetails=" + aPIMProductDetails + ", hasFidCard=" + z + ", slotId=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C36502a(APIMProductDetails aPIMProductDetails, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(aPIMProductDetails, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new String() : str);
        }
    }
}
