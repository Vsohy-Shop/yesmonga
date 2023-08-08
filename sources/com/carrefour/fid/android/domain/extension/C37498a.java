package com.carrefour.fid.android.domain.extension;

import com.carrefour.fid.android.core.type.BasketService;
import com.carrefour.fid.android.core.type.BasketType;
import com.carrefour.fid.android.domain.models.BasketAmounts;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketOfferDomain;
import com.carrefour.fid.android.domain.models.BasketOfferMessage;
import com.carrefour.fid.android.domain.models.BasketOfferPriceDomain;
import com.carrefour.fid.android.domain.models.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.BasketServiceType;
import com.carrefour.fid.android.domain.models.CategoryLimitDomain;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.ProductDomain;
import com.carrefour.fid.android.domain.models.ProductPictureDomain;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketErrorMessage;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.offer.CategoryLimit;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferDiscount;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountArticle;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountPromotionCode;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.offer.OfferMessage;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBasketDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketDomain.kt\ncom/carrefour/fid/android/domain/extension/BasketDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1549#2:170\n1620#2,3:171\n1549#2:174\n1620#2,3:175\n1549#2:178\n1620#2,3:179\n1549#2:182\n1620#2,3:183\n1549#2:186\n1620#2,3:187\n1549#2:190\n1620#2,3:191\n1549#2:194\n1620#2,3:195\n*S KotlinDebug\n*F\n+ 1 BasketDomain.kt\ncom/carrefour/fid/android/domain/extension/BasketDomainKt\n*L\n47#1:170\n47#1:171,3\n50#1:174\n50#1:175,3\n73#1:178\n73#1:179,3\n104#1:182\n104#1:183,3\n107#1:186\n107#1:187,3\n130#1:190\n130#1:191,3\n164#1:194\n164#1:195,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.extension.a */
public final class C37498a {

    /* renamed from: com.carrefour.fid.android.domain.extension.a$a */
    public /* synthetic */ class C37499a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0055 */
        static {
            /*
                com.carrefour.fid.android.domain.models.basket.BasketServiceType[] r0 = com.carrefour.fid.android.domain.models.basket.BasketServiceType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.carrefour.fid.android.domain.models.basket.BasketServiceType r2 = com.carrefour.fid.android.domain.models.basket.BasketServiceType.DELIVERY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.carrefour.fid.android.domain.models.basket.BasketServiceType r3 = com.carrefour.fid.android.domain.models.basket.BasketServiceType.DRIVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.carrefour.fid.android.domain.models.basket.BasketServiceType r4 = com.carrefour.fid.android.domain.models.basket.BasketServiceType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                com.carrefour.fid.android.domain.models.basket.BasketType[] r0 = com.carrefour.fid.android.domain.models.basket.BasketType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.basket.BasketType r4 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_ADDITIONAL_ORDER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_DRIVE     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_EXPRESS_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_MARKETPLACE     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.NONE     // Catch:{ NoSuchFieldError -> 0x0055 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0055 }
            L_0x0055:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_HOME_DELIVERY_NAL     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.extension.C37498a.C37499a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final BasketType m153931a(@C12580l com.carrefour.fid.android.domain.models.basket.BasketType basketType) {
        int i;
        if (basketType == null) {
            i = -1;
        } else {
            i = C37499a.$EnumSwitchMapping$1[basketType.ordinal()];
        }
        switch (i) {
            case -1:
                return BasketType.BASKET_V4_TYPE_DRIVE;
            case 1:
                return BasketType.BASKET_V4_TYPE_ADDITIONAL_ORDER;
            case 2:
                return BasketType.BASKET_V4_TYPE_DRIVE;
            case 3:
                return BasketType.BASKET_V4_EXPRESS_DELIVERY;
            case 4:
                return BasketType.BASKET_V4_TYPE_MARKETPLACE;
            case 5:
                return BasketType.NONE;
            case 6:
                return BasketType.BASKET_V4_HOME_DELIVERY_NAL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @C12579k
    /* renamed from: b */
    public static final BasketDomain m153932b(@C12579k Basket basket) {
        BasketPromotionCode basketPromotionCode;
        BasketService basketService;
        Intrinsics.checkNotNullParameter(basket, "<this>");
        BasketDomain a = BasketDomain.f95021H0.mo115504a();
        BasketAmounts basketAmounts = new BasketAmounts(basket.mo116855w().mo116865A(), basket.mo116855w().mo116889s(), basket.mo116855w().mo116888r(), basket.mo116855w().mo116892u(), basket.mo116855w().mo116890t(), basket.mo116855w().mo116868D(), basket.mo116855w().mo116893v(), basket.mo116855w().mo116887q(), basket.mo116855w().mo116894w(), basket.mo116855w().mo116898z(), basket.mo116855w().mo116866B(), basket.mo116855w().mo116897y(), basket.mo116855w().mo116867C());
        Iterable<BasketErrorMessage> y = basket.mo116858y();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(y, 10));
        for (BasketErrorMessage basketErrorMessage : y) {
            arrayList.add(new com.carrefour.fid.android.domain.models.BasketErrorMessage(basketErrorMessage.mo116909f(), basketErrorMessage.mo116910g(), basketErrorMessage.mo116911h()));
        }
        String z = basket.mo116859z();
        boolean O = basket.mo116830O();
        Iterable<Offer> B = basket.mo116817B();
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(B, 10));
        for (Offer c : B) {
            arrayList2.add(m153933c(c));
        }
        String C = basket.mo116818C();
        if (C == null) {
            C = new String();
        }
        String str = C;
        int D = basket.mo116819D();
        com.carrefour.fid.android.domain.models.basket.BasketPromotionCode E = basket.mo116820E();
        if (E != null) {
            basketPromotionCode = new BasketPromotionCode(E.mo116939f(), E.mo116937e());
        } else {
            basketPromotionCode = null;
        }
        BasketReturnableBags H = basket.mo116823H();
        Map<String, Integer> F = basket.mo116821F();
        String G = basket.mo116822G();
        int i = C37499a.$EnumSwitchMapping$0[basket.mo116824I().ordinal()];
        if (i == 1) {
            basketService = BasketService.DELIVERY;
        } else if (i == 2) {
            basketService = BasketService.DRIVE;
        } else if (i == 3) {
            basketService = BasketService.UNKNOWN;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        BasketServiceType basketServiceType = new BasketServiceType(basketService);
        BasketSlot K = basket.mo116826K();
        com.carrefour.fid.android.domain.models.BasketSlot basketSlot = new com.carrefour.fid.android.domain.models.BasketSlot(K.mo116999j(), K.mo116996h(), K.mo116998i(), Boolean.valueOf(K.mo117001l()), K.mo117000k());
        Iterable<OfferDiscount> x = basket.mo116857x();
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(x, 10));
        for (OfferDiscount e : x) {
            arrayList3.add(m153935e(e));
        }
        return BasketDomain.m155187u(a, basketAmounts, arrayList, z, O, (String) null, arrayList2, str, D, basketPromotionCode, H, F, G, basketServiceType, basketSlot, arrayList3, m153931a(basket.mo116829N()), basket.mo116828M(), basket.mo116827L(), 16, (Object) null);
    }

    /* renamed from: c */
    public static final BasketOfferDomain m153933c(Offer offer) {
        ProductCategoryDomain productCategoryDomain;
        ProductNutriScore productNutriScore;
        OfferDiscountDomain offerDiscountDomain;
        OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain;
        CategoryLimitDomain categoryLimitDomain;
        OfferIdentifierDomain f = m153936f(offer.mo118001J());
        Product S = offer.mo118010S();
        ProductCategory H = S.mo118407H();
        if (H != null) {
            String n = H.mo117294n();
            String q = H.mo117297q();
            int p = H.mo117296p();
            String s = H.mo117299s();
            if (s == null) {
                s = "";
            }
            productCategoryDomain = new ProductCategoryDomain(n, q, p, s, (ProductCategoryDomain) null);
        } else {
            productCategoryDomain = null;
        }
        String P = S.mo118415P();
        List<OfferFlag> M = S.mo118412M();
        Iterable<ProductPicture> Q = S.mo118416Q();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(Q, 10));
        for (ProductPicture productPicture : Q) {
            arrayList.add(new ProductPictureDomain(productPicture.mo118573e(), productPicture.getOrder()));
        }
        ProductNutriScore T = S.mo118419T();
        if (T != null) {
            productNutriScore = ProductNutriScore.valueOf(T.name());
        } else {
            productNutriScore = null;
        }
        ProductDomain productDomain = new ProductDomain(productCategoryDomain, P, M, arrayList, productNutriScore, S.mo118421V(), S.mo118422W(), S.mo118425Z(), S.mo118418S(), offer.mo118028e0(), S.mo118436e0(), S.mo118406G(), S.mo118410K());
        Prices R = offer.mo118009R();
        BasketOfferPriceDomain basketOfferPriceDomain = new BasketOfferPriceDomain(Double.valueOf(R.mo118172m()), Double.valueOf(R.mo118171l()), Double.valueOf(R.mo118173n()), R.mo118170k(), Double.valueOf(R.mo118168i()), Double.valueOf(R.mo118169j()));
        Double Q2 = offer.mo118008Q();
        Double P2 = offer.mo118007P();
        OfferDiscount F = offer.mo117997F();
        if (F != null) {
            offerDiscountDomain = m153935e(F);
        } else {
            offerDiscountDomain = null;
        }
        OfferDiscountPromotionCode G = offer.mo117998G();
        if (G != null) {
            offerDiscountPromoCodeDomain = new OfferDiscountPromoCodeDomain(Double.valueOf(G.mo118112f()), G.mo118110e());
        } else {
            offerDiscountPromoCodeDomain = null;
        }
        int U = offer.mo118012U();
        Integer valueOf = Integer.valueOf(offer.mo118002K());
        Integer valueOf2 = Integer.valueOf(offer.mo118004M());
        Integer valueOf3 = Integer.valueOf(offer.mo118006O());
        Iterable<OfferMessage> N = offer.mo118005N();
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(N, 10));
        for (OfferMessage offerMessage : N) {
            arrayList2.add(new BasketOfferMessage(offerMessage.mo118148e(), offerMessage.mo118150f()));
        }
        CategoryLimit E = offer.mo117996E();
        if (E != null) {
            categoryLimitDomain = m153934d(E);
        } else {
            categoryLimitDomain = null;
        }
        return new BasketOfferDomain(f, productDomain, basketOfferPriceDomain, Q2, P2, offerDiscountDomain, offerDiscountPromoCodeDomain, U, valueOf, valueOf2, valueOf3, arrayList2, categoryLimitDomain);
    }

    @C12579k
    /* renamed from: d */
    public static final CategoryLimitDomain m153934d(@C12579k CategoryLimit categoryLimit) {
        Intrinsics.checkNotNullParameter(categoryLimit, "<this>");
        return new CategoryLimitDomain(categoryLimit.mo117943f(), categoryLimit.mo117944g(), Long.valueOf(categoryLimit.mo117945h()));
    }

    /* renamed from: e */
    public static final OfferDiscountDomain m153935e(OfferDiscount offerDiscount) {
        Integer valueOf = Integer.valueOf(offerDiscount.mo118075p());
        String q = offerDiscount.mo118076q();
        String r = offerDiscount.mo118077r();
        Double valueOf2 = Double.valueOf(offerDiscount.mo118074o());
        Double valueOf3 = Double.valueOf(offerDiscount.mo118078s());
        String v = offerDiscount.mo118082v();
        OfferDiscountType z = offerDiscount.mo118087z();
        boolean u = offerDiscount.mo118081u();
        Iterable<Gtin> t = offerDiscount.mo118079t();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(t, 10));
        for (Gtin i : t) {
            arrayList.add(i.mo118380i());
        }
        Long valueOf4 = Long.valueOf(offerDiscount.mo118083w());
        Integer valueOf5 = Integer.valueOf(offerDiscount.mo118085x());
        Iterable<OfferDiscountArticle> y = offerDiscount.mo118086y();
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(y, 10));
        for (OfferDiscountArticle offerDiscountArticle : y) {
            arrayList2.add(new com.carrefour.fid.android.domain.models.OfferDiscountArticle(offerDiscountArticle.mo118096e(), Integer.valueOf(offerDiscountArticle.mo118098f())));
        }
        return new OfferDiscountDomain(valueOf, q, r, valueOf2, valueOf3, v, z, u, arrayList, valueOf4, valueOf5, arrayList2);
    }

    /* renamed from: f */
    public static final OfferIdentifierDomain m153936f(OfferIdentifier offerIdentifier) {
        return new OfferIdentifierDomain(offerIdentifier.mo118136f(), offerIdentifier.mo118134e());
    }
}
