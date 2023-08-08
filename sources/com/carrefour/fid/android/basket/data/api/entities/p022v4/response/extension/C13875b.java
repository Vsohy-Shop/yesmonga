package com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension;

import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketDiscountResponse;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketErrorResponse;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketLoyaltyCardResponse;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketOfferResponse;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketResponse;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketSlotResponse;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.DiscountArticleResponse;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.OfferPictureResponse;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.OfferPricePerMeasureResponse;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.OfferPricesResponse;
import com.carrefour.fid.android.domain.interactors.service.StoreId;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketErrorMessage;
import com.carrefour.fid.android.domain.models.basket.BasketLoyaltyCard;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReference;
import com.carrefour.fid.android.domain.models.basket.BasketServiceType;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.domain.models.basket.PickingEligibility;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferDiscount;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountArticle;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.offer.ProductEcoScore;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.domain.models.product.ProductReference;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.domain.models.slot.SlotId;
import com.carrefour.fid.android.shared.extension.C28782t;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nmappers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 mappers.kt\ncom/carrefour/fid/android/basket/data/api/entities/v4/response/extension/MappersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,258:1\n1#2:259\n1#2:274\n1549#3:260\n1620#3,3:261\n1603#3,9:264\n1855#3:273\n1856#3:275\n1612#3:276\n288#3,2:277\n1549#3:279\n1620#3,3:280\n1655#3,8:283\n1549#3:291\n1620#3,3:292\n1549#3:295\n1620#3,3:296\n766#3:299\n857#3,2:300\n766#3:302\n857#3,2:303\n766#3:305\n857#3,2:306\n1549#3:308\n1620#3,3:309\n1655#3,8:312\n1549#3:320\n1620#3,2:321\n1549#3:323\n1620#3,3:324\n1622#3:327\n1045#3:328\n1559#3:329\n1590#3,4:330\n288#3,2:334\n1179#3,2:336\n1253#3,4:338\n288#3,2:342\n*S KotlinDebug\n*F\n+ 1 mappers.kt\ncom/carrefour/fid/android/basket/data/api/entities/v4/response/extension/MappersKt\n*L\n65#1:274\n60#1:260\n60#1:261,3\n65#1:264,9\n65#1:273\n65#1:275\n65#1:276\n86#1:277,2\n97#1:279\n97#1:280,3\n99#1:283,8\n99#1:291\n99#1:292,3\n118#1:295\n118#1:296,3\n124#1:299\n124#1:300,2\n130#1:302\n130#1:303,2\n134#1:305\n134#1:306,2\n134#1:308\n134#1:309,3\n134#1:312,8\n137#1:320\n137#1:321,2\n157#1:323\n157#1:324,3\n137#1:327\n196#1:328\n196#1:329\n196#1:330,4\n228#1:334,2\n236#1:336,2\n236#1:338,4\n249#1:342,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.extension.b */
public final class C13875b {

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 mappers.kt\ncom/carrefour/fid/android/basket/data/api/entities/v4/response/extension/MappersKt\n*L\n1#1,328:1\n196#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.extension.b$a */
    public static final class C13876a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(((OfferPictureResponse) t).getOrder(), ((OfferPictureResponse) t2).getOrder());
        }
    }

    /* renamed from: a */
    public static final double m58862a(List<OfferDiscount> list, Long l) {
        boolean z;
        ArrayList<OfferDiscount> arrayList = new ArrayList<>();
        for (Object next : list) {
            long w = ((OfferDiscount) next).mo118083w();
            if (l != null && w == l.longValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        double d = 0.0d;
        for (OfferDiscount o : arrayList) {
            d += C28782t.m119111h(Double.valueOf(o.mo118074o()));
        }
        return d;
    }

    /* renamed from: b */
    public static final List<OfferDiscountArticle> m58863b(List<OfferDiscount> list, Long l) {
        boolean z;
        ArrayList<OfferDiscount> arrayList = new ArrayList<>();
        for (Object next : list) {
            long w = ((OfferDiscount) next).mo118083w();
            if (l != null && w == l.longValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (OfferDiscount y : arrayList) {
            arrayList2.add(y.mo118086y());
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : C10978t.m41497a0(arrayList2)) {
            if (hashSet.add(Gtin.m157307a(((OfferDiscountArticle) next2).mo118096e()))) {
                arrayList3.add(next2);
            }
        }
        return arrayList3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.basket.BasketAmounts m58864c(com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketResponse r31) {
        /*
            java.lang.Integer r0 = r31.getNextThresholdDeliveryLevel()
            if (r0 == 0) goto L_0x000b
            int r0 = r0.intValue()
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r2 = r0
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r0 = r31.getAmountToNextDeliveryThreshold()
            if (r0 == 0) goto L_0x0018
            java.lang.Double r0 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r0)
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            double r3 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r0)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r0 = r31.getTotalBundleDiscountAmount()
            if (r0 == 0) goto L_0x0028
            java.lang.Double r0 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r0)
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            double r5 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r0)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r0 = r31.getTotalServiceAmount()
            if (r0 == 0) goto L_0x0038
            java.lang.Double r0 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r0)
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            double r9 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r0)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r0 = r31.getTotalOffersMonetaryAmount()
            if (r0 == 0) goto L_0x0048
            java.lang.Double r0 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r0)
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            double r11 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r0)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r0 = r31.getTotalLoyaltyAmount()
            if (r0 == 0) goto L_0x0058
            java.lang.Double r0 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r0)
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            double r13 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r0)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r0 = r31.getNextThresholdDeliveryAmount()
            if (r0 == 0) goto L_0x0068
            java.lang.Double r0 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r0)
            goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            double r15 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r0)
            java.util.List r0 = r31.getServices()
            if (r0 == 0) goto L_0x00a7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0079:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0097
            java.lang.Object r7 = r0.next()
            r8 = r7
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketServiceInfo r8 = (com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketServiceInfo) r8
            java.lang.String r8 = r8.getId()
            com.carrefour.fid.android.domain.models.basket.BasketServiceType r17 = com.carrefour.fid.android.domain.models.basket.BasketServiceType.DELIVERY
            java.lang.String r1 = r17.name()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x0079
            goto L_0x0098
        L_0x0097:
            r7 = 0
        L_0x0098:
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketServiceInfo r7 = (com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketServiceInfo) r7
            if (r7 == 0) goto L_0x00a7
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r0 = r7.getServiceAmount()
            if (r0 == 0) goto L_0x00a7
            java.lang.Double r0 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r0)
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            double r19 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r0)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r0 = r31.getStoreRemainedAmount()
            if (r0 == 0) goto L_0x00b7
            java.lang.Double r0 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r0)
            goto L_0x00b8
        L_0x00b7:
            r0 = 0
        L_0x00b8:
            double r21 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r0)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r0 = r31.getTotalMonetaryAmountIncludingTaxes()
            if (r0 == 0) goto L_0x00c7
            java.lang.Double r0 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r0)
            goto L_0x00c8
        L_0x00c7:
            r0 = 0
        L_0x00c8:
            double r25 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r0)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r0 = r31.getTotalOffersMonetaryAmount()
            if (r0 == 0) goto L_0x00d7
            java.lang.Double r0 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r0)
            goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            double r27 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r0)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r0 = r31.getTotalCouponAmount()
            if (r0 == 0) goto L_0x00e7
            java.lang.Double r0 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r0)
            goto L_0x00e8
        L_0x00e7:
            r0 = 0
        L_0x00e8:
            double r29 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r0)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r0 = r31.getTotalInflatedMonetaryAmountIncludingTaxes()
            if (r0 == 0) goto L_0x00f7
            java.lang.Double r1 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r0)
            goto L_0x00f8
        L_0x00f7:
            r1 = 0
        L_0x00f8:
            double r23 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r1)
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r0 = new com.carrefour.fid.android.domain.models.basket.BasketAmounts
            r1 = r0
            r7 = 0
            r17 = r19
            r19 = r21
            r21 = r25
            r25 = r27
            r27 = r29
            r1.<init>(r2, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13875b.m58864c(com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketResponse):com.carrefour.fid.android.domain.models.basket.BasketAmounts");
    }

    /* renamed from: d */
    public static final List<OfferDiscount> m58865d(BasketResponse basketResponse) {
        ArrayList arrayList;
        List<BasketDiscountResponse> discounts = basketResponse.getDiscounts();
        ArrayList arrayList2 = null;
        if (discounts != null) {
            Iterable<BasketDiscountResponse> iterable = discounts;
            arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (BasketDiscountResponse p : iterable) {
                arrayList.add(m58877p(p));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            ArrayList<OfferDiscount> arrayList3 = new ArrayList<>();
            for (Object next : arrayList) {
                if (hashSet.add(Long.valueOf(((OfferDiscount) next).mo118083w()))) {
                    arrayList3.add(next);
                }
            }
            arrayList2 = new ArrayList(C10978t.m41495Y(arrayList3, 10));
            for (OfferDiscount offerDiscount : arrayList3) {
                arrayList2.add(OfferDiscount.m157060n(offerDiscount, m58862a(arrayList, Long.valueOf(offerDiscount.mo118083w())), 0, (String) null, (String) null, 0.0d, (String) null, (OfferDiscountType) null, false, (List) null, 0, m58875n(arrayList, Long.valueOf(offerDiscount.mo118083w())), m58863b(arrayList, Long.valueOf(offerDiscount.mo118083w())), 1022, (Object) null));
            }
        }
        if (arrayList2 == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return arrayList2;
    }

    /* renamed from: e */
    public static final List<BasketErrorMessage> m58866e(BasketResponse basketResponse) {
        ArrayList arrayList;
        List<BasketErrorResponse> errorMessages = basketResponse.getErrorMessages();
        if (errorMessages != null) {
            Iterable<BasketErrorResponse> iterable = errorMessages;
            arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (BasketErrorResponse basketErrorResponse : iterable) {
                String errorCode = basketErrorResponse.getErrorCode();
                String str = "";
                if (errorCode == null) {
                    errorCode = str;
                }
                String message = basketErrorResponse.getMessage();
                if (message == null) {
                    message = str;
                }
                String type = basketErrorResponse.getType();
                if (type != null) {
                    str = type;
                }
                arrayList.add(new BasketErrorMessage(errorCode, message, str));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: kotlin.jvm.internal.DefaultConstructorMarker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.jvm.internal.DefaultConstructorMarker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.carrefour.fid.android.domain.models.offer.CategoryLimit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.carrefour.fid.android.domain.models.offer.OfferDiscount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: kotlin.jvm.internal.DefaultConstructorMarker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v58, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.carrefour.fid.android.domain.models.offer.CategoryLimit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: com.carrefour.fid.android.domain.models.offer.CategoryLimit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v66, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v67, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v68, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.carrefour.fid.android.domain.models.offer.Offer> m58867f(com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketResponse r36) {
        /*
            java.util.List r0 = r36.getOffers()
            r1 = 0
            if (r0 == 0) goto L_0x0223
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.C10978t.m41495Y(r0, r3)
            r2.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0221
            java.lang.Object r4 = r0.next()
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketOfferResponse r4 = (com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketOfferResponse) r4
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r6 = new com.carrefour.fid.android.domain.models.offer.OfferIdentifier
            java.lang.String r5 = r4.getGtin()
            java.lang.String r5 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r5)
            java.lang.String r7 = r4.getCdbase()
            java.lang.String r8 = ""
            if (r7 != 0) goto L_0x0037
            r7 = r8
        L_0x0037:
            java.lang.String r7 = com.carrefour.fid.android.domain.models.product.ProductReference.m157466b(r7)
            r6.<init>(r5, r7, r1)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferCategoryLimitResponse r5 = r4.getCategoryLimit()
            if (r5 == 0) goto L_0x0066
            java.lang.String r7 = r5.getLabel()
            if (r7 != 0) goto L_0x004b
            r7 = r8
        L_0x004b:
            java.lang.String r9 = r5.getUnit()
            if (r9 != 0) goto L_0x0052
            r9 = r8
        L_0x0052:
            java.lang.Long r5 = r5.getValue()
            if (r5 == 0) goto L_0x005d
            long r10 = r5.longValue()
            goto L_0x005f
        L_0x005d:
            r10 = 0
        L_0x005f:
            com.carrefour.fid.android.domain.models.offer.CategoryLimit r5 = new com.carrefour.fid.android.domain.models.offer.CategoryLimit
            r5.<init>(r7, r10, r9)
            r7 = r5
            goto L_0x0067
        L_0x0066:
            r7 = r1
        L_0x0067:
            com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferPricesResponse r5 = r4.getPrices()
            if (r5 == 0) goto L_0x0081
            java.util.List r5 = r5.getDiscounts()
            if (r5 == 0) goto L_0x0081
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40677q3(r5)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketDiscountResponse r5 = (com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketDiscountResponse) r5
            if (r5 == 0) goto L_0x0081
            com.carrefour.fid.android.domain.models.offer.OfferDiscount r5 = m58877p(r5)
            r9 = r5
            goto L_0x0082
        L_0x0081:
            r9 = r1
        L_0x0082:
            r10 = 0
            java.lang.Integer r5 = r4.getPurchasingStep()
            if (r5 == 0) goto L_0x008f
            int r5 = r5.intValue()
            r12 = r5
            goto L_0x0090
        L_0x008f:
            r12 = 0
        L_0x0090:
            java.lang.Integer r5 = r4.getPurchasingMax()
            if (r5 != 0) goto L_0x009e
            java.lang.Integer r5 = r4.getQtyToSell()
            if (r5 != 0) goto L_0x009e
            r5 = r1
            goto L_0x00cc
        L_0x009e:
            java.lang.Integer r5 = r4.getPurchasingMax()
            if (r5 != 0) goto L_0x00a9
            java.lang.Integer r5 = r4.getQtyToSell()
            goto L_0x00cc
        L_0x00a9:
            java.lang.Integer r5 = r4.getQtyToSell()
            if (r5 != 0) goto L_0x00b4
            java.lang.Integer r5 = r4.getPurchasingMax()
            goto L_0x00cc
        L_0x00b4:
            java.lang.Integer r5 = r4.getPurchasingMax()
            int r5 = r5.intValue()
            java.lang.Integer r13 = r4.getQtyToSell()
            int r13 = r13.intValue()
            int r5 = java.lang.Integer.min(r5, r13)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x00cc:
            if (r5 == 0) goto L_0x00d4
            int r5 = r5.intValue()
            r13 = r5
            goto L_0x00d5
        L_0x00d4:
            r13 = 0
        L_0x00d5:
            java.lang.Integer r5 = r4.getPurchasingMin()
            if (r5 == 0) goto L_0x00e1
            int r5 = r5.intValue()
            r14 = r5
            goto L_0x00e2
        L_0x00e1:
            r14 = 0
        L_0x00e2:
            java.util.List r5 = r4.getMessages()
            if (r5 == 0) goto L_0x011f
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r15 = new java.util.ArrayList
            int r1 = kotlin.collections.C10978t.m41495Y(r5, r3)
            r15.<init>(r1)
            java.util.Iterator r1 = r5.iterator()
        L_0x00f7:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0120
            java.lang.Object r5 = r1.next()
            com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferMessageResponse r5 = (com.carrefour.fid.android.basket.data.api.entities.p022v4.response.OfferMessageResponse) r5
            com.carrefour.fid.android.domain.models.offer.OfferMessage r3 = new com.carrefour.fid.android.domain.models.offer.OfferMessage
            java.lang.String r16 = r5.getCode()
            if (r16 != 0) goto L_0x010d
            r11 = r8
            goto L_0x010f
        L_0x010d:
            r11 = r16
        L_0x010f:
            java.lang.String r5 = r5.getMessage()
            if (r5 != 0) goto L_0x0116
            r5 = r8
        L_0x0116:
            r3.<init>(r11, r5)
            r15.add(r3)
            r3 = 10
            goto L_0x00f7
        L_0x011f:
            r15 = 0
        L_0x0120:
            if (r15 != 0) goto L_0x0127
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r15 = r1
        L_0x0127:
            com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferPricesResponse r1 = r4.getPrices()
            if (r1 == 0) goto L_0x0199
            com.carrefour.fid.android.domain.models.offer.Prices r3 = new com.carrefour.fid.android.domain.models.offer.Prices
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r5 = r1.getLinePrice()
            if (r5 == 0) goto L_0x013a
            java.lang.Double r5 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r5)
            goto L_0x013b
        L_0x013a:
            r5 = 0
        L_0x013b:
            double r19 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r5)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r5 = r1.getSalePrice()
            if (r5 == 0) goto L_0x014a
            java.lang.Double r5 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r5)
            goto L_0x014b
        L_0x014a:
            r5 = 0
        L_0x014b:
            double r21 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r5)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r5 = r1.getUnitPrice()
            if (r5 == 0) goto L_0x015a
            java.lang.Double r5 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r5)
            goto L_0x015b
        L_0x015a:
            r5 = 0
        L_0x015b:
            double r23 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r5)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferPricePerMeasureResponse r5 = r1.getStandardPricePerMeasure()
            if (r5 == 0) goto L_0x016a
            java.lang.String r5 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13877c.m58878a(r5)
            goto L_0x016b
        L_0x016a:
            r5 = 0
        L_0x016b:
            if (r5 != 0) goto L_0x0170
            r25 = r8
            goto L_0x0172
        L_0x0170:
            r25 = r5
        L_0x0172:
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r5 = r1.getDiscountAmount()
            if (r5 == 0) goto L_0x017d
            java.lang.Double r5 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r5)
            goto L_0x017e
        L_0x017d:
            r5 = 0
        L_0x017e:
            double r26 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r5)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r1 = r1.getLoyaltyAmount()
            if (r1 == 0) goto L_0x018d
            java.lang.Double r1 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r1)
            goto L_0x018e
        L_0x018d:
            r1 = 0
        L_0x018e:
            double r28 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r1)
            r18 = r3
            r18.<init>(r19, r21, r23, r25, r26, r28)
            r1 = r3
            goto L_0x019d
        L_0x0199:
            com.carrefour.fid.android.domain.models.offer.Prices r1 = com.carrefour.fid.android.domain.models.offer.C38069e.m157183a()
        L_0x019d:
            r3 = 0
            com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferPricesResponse r5 = r4.getPrices()
            if (r5 == 0) goto L_0x01bf
            java.util.List r5 = r5.getDiscounts()
            if (r5 == 0) goto L_0x01bf
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40677q3(r5)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketDiscountResponse r5 = (com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketDiscountResponse) r5
            if (r5 == 0) goto L_0x01bf
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r5 = r5.getDiscountAmount()
            if (r5 == 0) goto L_0x01bf
            java.lang.Double r5 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r5)
            r16 = r5
            goto L_0x01c1
        L_0x01bf:
            r16 = 0
        L_0x01c1:
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r5 = r4.getOfferTotalAmount()
            if (r5 == 0) goto L_0x01ce
            java.lang.Double r5 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r5)
            r18 = r5
            goto L_0x01d0
        L_0x01ce:
            r18 = 0
        L_0x01d0:
            com.carrefour.fid.android.domain.models.product.Product r19 = m58868g(r4)
            java.lang.Integer r5 = r4.getQuantity()
            if (r5 == 0) goto L_0x01e1
            int r5 = r5.intValue()
            r35 = r5
            goto L_0x01e3
        L_0x01e1:
            r35 = 0
        L_0x01e3:
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r25 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            java.lang.String r30 = ""
            boolean r31 = r4.isDigitalCard()
            java.util.List r32 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r33 = 262144(0x40000, float:3.67342E-40)
            r34 = 0
            com.carrefour.fid.android.domain.models.offer.Offer r4 = new com.carrefour.fid.android.domain.models.offer.Offer
            r5 = r4
            r8 = r9
            r9 = r10
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r1
            r15 = r3
            r17 = r18
            r18 = r19
            r19 = r35
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r2.add(r4)
            r1 = 0
            r3 = 10
            goto L_0x0018
        L_0x0221:
            r1 = r2
            goto L_0x0224
        L_0x0223:
            r1 = 0
        L_0x0224:
            if (r1 != 0) goto L_0x022a
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x022a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13875b.m58867f(com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketResponse):java.util.List");
    }

    /* renamed from: g */
    public static final Product m58868g(BasketOfferResponse basketOfferResponse) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        Double d;
        String str2;
        OfferPricePerMeasureResponse standardPricePerMeasure;
        OfferPricePerMeasureResponse standardPricePerMeasure2;
        BasketAmountResponse pricePerUnitValue$basket_release;
        List p5;
        String b = Gtin.m157308b(basketOfferResponse.getGtin());
        List<OfferPictureResponse> pictures = basketOfferResponse.getPictures();
        String str3 = null;
        if (pictures == null || (p5 = CollectionsKt___CollectionsKt.m40675p5(pictures, new C13876a())) == null) {
            arrayList = null;
        } else {
            Iterable iterable = p5;
            arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            int i = 0;
            for (Object next : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                OfferPictureResponse offerPictureResponse = (OfferPictureResponse) next;
                String path = offerPictureResponse.getPath();
                if (path == null) {
                    path = "";
                }
                Integer order = offerPictureResponse.getOrder();
                if (order != null) {
                    i = order.intValue();
                }
                arrayList.add(new ProductPicture(path, i));
                i = i2;
            }
        }
        if (arrayList == null) {
            arrayList2 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            arrayList2 = arrayList;
        }
        String cdbase = basketOfferResponse.getCdbase();
        if (cdbase == null) {
            cdbase = "";
        }
        String b2 = ProductReference.m157466b(cdbase);
        String name = basketOfferResponse.getName();
        if (name == null) {
            str = "";
        } else {
            str = name;
        }
        List E = CollectionsKt__CollectionsKt.m40441E();
        OfferPricesResponse prices = basketOfferResponse.getPrices();
        if (prices == null || (standardPricePerMeasure2 = prices.getStandardPricePerMeasure()) == null || (pricePerUnitValue$basket_release = standardPricePerMeasure2.getPricePerUnitValue$basket_release()) == null) {
            d = null;
        } else {
            d = C13874a.m58861a(pricePerUnitValue$basket_release);
        }
        String valueOf = String.valueOf(d);
        OfferPricesResponse prices2 = basketOfferResponse.getPrices();
        if (!(prices2 == null || (standardPricePerMeasure = prices2.getStandardPricePerMeasure()) == null)) {
            str3 = standardPricePerMeasure.getUnitMeasure$basket_release();
        }
        if (str3 == null) {
            str2 = "";
        } else {
            str2 = str3;
        }
        return new Product(b, (ProductCategory) null, E, arrayList2, (ProductNutriScore) null, "", "", b2, str, valueOf, str2, "", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (ProductEcoScore) null, (String) null, CollectionsKt__CollectionsKt.m40441E(), (String) null, (List) null, (List) null, false, "", false, 25427968, (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    public static final int m58869h(BasketResponse basketResponse) {
        List<BasketOfferResponse> offers = basketResponse.getOffers();
        if (offers == null) {
            return 0;
        }
        int i = 0;
        for (BasketOfferResponse quantity : offers) {
            Integer quantity2 = quantity.getQuantity();
            i += quantity2 != null ? quantity2.intValue() : 0;
        }
        return i;
    }

    /* renamed from: i */
    public static final BasketPromotionCode m58870i(BasketResponse basketResponse) {
        Object obj;
        Double d;
        boolean z;
        List<BasketDiscountResponse> discounts = basketResponse.getDiscounts();
        Double d2 = null;
        if (discounts == null) {
            return null;
        }
        Iterator it = discounts.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            BasketDiscountResponse basketDiscountResponse = (BasketDiscountResponse) obj;
            BasketAmountResponse discountAmount = basketDiscountResponse.getDiscountAmount();
            if (discountAmount != null) {
                d = C13874a.m58861a(discountAmount);
            } else {
                d = null;
            }
            boolean z2 = false;
            if (!Intrinsics.areEqual(d, 0.0d)) {
                String promoCode = basketDiscountResponse.getPromoCode();
                if (promoCode == null || promoCode.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = true;
                    continue;
                } else {
                    continue;
                }
            }
            if (z2) {
                break;
            }
        }
        BasketDiscountResponse basketDiscountResponse2 = (BasketDiscountResponse) obj;
        if (basketDiscountResponse2 == null) {
            return null;
        }
        String promoCode2 = basketDiscountResponse2.getPromoCode();
        if (promoCode2 == null) {
            promoCode2 = "";
        }
        BasketAmountResponse discountAmount2 = basketDiscountResponse2.getDiscountAmount();
        if (discountAmount2 != null) {
            d2 = C13874a.m58861a(discountAmount2);
        }
        return new BasketPromotionCode(C28782t.m119111h(d2), promoCode2);
    }

    /* renamed from: j */
    public static final Map<String, Integer> m58871j(BasketResponse basketResponse) {
        LinkedHashMap linkedHashMap;
        int i;
        List<BasketOfferResponse> offers = basketResponse.getOffers();
        if (offers != null) {
            Iterable<BasketOfferResponse> iterable = offers;
            linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C10978t.m41495Y(iterable, 10)), 16));
            for (BasketOfferResponse basketOfferResponse : iterable) {
                String gtin = basketOfferResponse.getGtin();
                Integer quantity = basketOfferResponse.getQuantity();
                if (quantity != null) {
                    i = quantity.intValue();
                } else {
                    i = 0;
                }
                Pair a = C11078d1.m42659a(gtin, Integer.valueOf(i));
                linkedHashMap.put(a.mo21849e(), a.mo21851f());
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return C10977s0.m41492z();
        }
        return linkedHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x003b A[EDGE_INSN: B:30:0x003b->B:12:0x003b ?: BREAK  , SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.basket.BasketReturnableBags m58872k(com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketResponse r6) {
        /*
            java.util.List r6 = r6.getServices()
            r0 = 0
            if (r6 == 0) goto L_0x0079
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x000d:
            boolean r1 = r6.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r6.next()
            r3 = r1
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketServiceInfo r3 = (com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketServiceInfo) r3
            java.lang.String r4 = r3.getId()
            java.lang.String r5 = "RETURNABLE_BAGS"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0036
            java.util.List r3 = r3.getItems()
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r4 = r2
        L_0x0037:
            if (r4 == 0) goto L_0x000d
            goto L_0x003b
        L_0x003a:
            r1 = r0
        L_0x003b:
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketServiceInfo r1 = (com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketServiceInfo) r1
            if (r1 == 0) goto L_0x0079
            com.carrefour.fid.android.domain.models.basket.BasketReturnableBags r0 = new com.carrefour.fid.android.domain.models.basket.BasketReturnableBags
            java.util.List r6 = r1.getItems()
            java.lang.Object r6 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r6)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketServiceInfoItem r6 = (com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketServiceInfoItem) r6
            if (r6 == 0) goto L_0x0057
            java.lang.Integer r6 = r6.getQuantity()
            if (r6 == 0) goto L_0x0057
            int r2 = r6.intValue()
        L_0x0057:
            java.util.List r6 = r1.getItems()
            java.lang.Object r6 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r6)
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketServiceInfoItem r6 = (com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketServiceInfoItem) r6
            if (r6 == 0) goto L_0x0074
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse r6 = r6.getUnitPrice()
            if (r6 == 0) goto L_0x0074
            java.lang.Double r6 = com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13874a.m58861a(r6)
            if (r6 == 0) goto L_0x0074
            double r3 = r6.doubleValue()
            goto L_0x0076
        L_0x0074:
            r3 = 0
        L_0x0076:
            r0.<init>(r2, r3)
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13875b.m58872k(com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketResponse):com.carrefour.fid.android.domain.models.basket.BasketReturnableBags");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0012 A[SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.carrefour.fid.android.domain.models.basket.BasketService> m58873l(com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketResponse r5) {
        /*
            java.util.List r5 = r5.getServices()
            r0 = 0
            if (r5 == 0) goto L_0x0075
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0012:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0074
            java.lang.Object r2 = r5.next()
            com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketServiceInfo r2 = (com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketServiceInfo) r2
            java.lang.String r3 = r2.getId()
            com.carrefour.fid.android.domain.models.basket.BasketServiceType r4 = com.carrefour.fid.android.domain.models.basket.BasketServiceType.DELIVERY
            java.lang.String r4 = r4.name()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x006d
            java.lang.String r3 = r2.getLabel()
            if (r3 == 0) goto L_0x006d
            kotlin.Result$a r3 = kotlin.Result.f28060a     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = r2.getLabel()     // Catch:{ all -> 0x0043 }
            com.carrefour.fid.android.domain.models.delivery.DeliveryCode r3 = com.carrefour.fid.android.domain.models.delivery.DeliveryCode.valueOf(r3)     // Catch:{ all -> 0x0043 }
            java.lang.Object r3 = kotlin.Result.m38702b(r3)     // Catch:{ all -> 0x0043 }
            goto L_0x004e
        L_0x0043:
            r3 = move-exception
            kotlin.Result$a r4 = kotlin.Result.f28060a
            java.lang.Object r3 = kotlin.C11661u0.m45734a(r3)
            java.lang.Object r3 = kotlin.Result.m38702b(r3)
        L_0x004e:
            boolean r4 = kotlin.Result.m38709i(r3)
            if (r4 == 0) goto L_0x0055
            r3 = r0
        L_0x0055:
            com.carrefour.fid.android.domain.models.delivery.DeliveryCode r3 = (com.carrefour.fid.android.domain.models.delivery.DeliveryCode) r3
            if (r3 == 0) goto L_0x006d
            com.carrefour.fid.android.domain.models.basket.BasketService$BasketDeliveryService r3 = new com.carrefour.fid.android.domain.models.basket.BasketService$BasketDeliveryService
            com.carrefour.fid.android.domain.models.basket.BasketServiceType r4 = com.carrefour.fid.android.domain.models.basket.BasketServiceType.DELIVERY
            java.lang.String r4 = r4.name()
            java.lang.String r2 = r2.getLabel()
            com.carrefour.fid.android.domain.models.delivery.DeliveryCode r2 = com.carrefour.fid.android.domain.models.delivery.DeliveryCode.valueOf(r2)
            r3.<init>(r4, r2)
            goto L_0x006e
        L_0x006d:
            r3 = r0
        L_0x006e:
            if (r3 == 0) goto L_0x0012
            r1.add(r3)
            goto L_0x0012
        L_0x0074:
            r0 = r1
        L_0x0075:
            if (r0 != 0) goto L_0x007b
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13875b.m58873l(com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketResponse):java.util.List");
    }

    /* renamed from: m */
    public static final BasketSlot m58874m(BasketResponse basketResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        String str6;
        Boolean isSlotBooked;
        BasketSlotResponse slotInfo = basketResponse.getSlotInfo();
        String str7 = null;
        if (slotInfo != null) {
            str = slotInfo.getSlotId();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String b = SlotId.m158308b(str);
        BasketSlotResponse slotInfo2 = basketResponse.getSlotInfo();
        if (slotInfo2 != null) {
            str2 = slotInfo2.getSlotDateBegin();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        BasketSlotResponse slotInfo3 = basketResponse.getSlotInfo();
        if (slotInfo3 != null) {
            str4 = slotInfo3.getSlotDateEnd();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        BasketSlotResponse slotInfo4 = basketResponse.getSlotInfo();
        if (slotInfo4 == null || (isSlotBooked = slotInfo4.isSlotBooked()) == null) {
            z = false;
        } else {
            z = isSlotBooked.booleanValue();
        }
        boolean z2 = z;
        BasketSlotResponse slotInfo5 = basketResponse.getSlotInfo();
        if (slotInfo5 != null) {
            str7 = slotInfo5.getSlotSliceId();
        }
        if (str7 == null) {
            str6 = "";
        } else {
            str6 = str7;
        }
        return new BasketSlot(b, str3, str5, z2, str6, (DefaultConstructorMarker) null);
    }

    /* renamed from: n */
    public static final int m58875n(List<OfferDiscount> list, Long l) {
        int i;
        ArrayList<OfferDiscount> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            long w = ((OfferDiscount) next).mo118083w();
            if (l != null && w == l.longValue()) {
                i = 1;
            }
            if (i != 0) {
                arrayList.add(next);
            }
        }
        for (OfferDiscount x : arrayList) {
            i += x.mo118085x();
        }
        return i;
    }

    @C12579k
    /* renamed from: o */
    public static final Basket m58876o(@C12579k BasketResponse basketResponse) {
        boolean z;
        BasketLoyaltyCard basketLoyaltyCard;
        Intrinsics.checkNotNullParameter(basketResponse, "<this>");
        BasketAmounts c = m58864c(basketResponse);
        List<OfferDiscount> d = m58865d(basketResponse);
        List<BasketErrorMessage> e = m58866e(basketResponse);
        String facilityServiceId = basketResponse.getFacilityServiceId();
        String str = "";
        if (facilityServiceId == null) {
            facilityServiceId = str;
        }
        String b = FacilityServiceId.m157958b(facilityServiceId);
        Boolean isFullNonFood = basketResponse.isFullNonFood();
        if (isFullNonFood != null) {
            z = isFullNonFood.booleanValue();
        } else {
            z = false;
        }
        boolean z2 = z;
        BasketLoyaltyCardResponse loyaltyCard = basketResponse.getLoyaltyCard();
        String str2 = null;
        if (loyaltyCard != null) {
            String id = loyaltyCard.getId();
            if (id == null) {
                id = str;
            }
            String type = loyaltyCard.getType();
            if (type == null) {
                type = str;
            }
            basketLoyaltyCard = new BasketLoyaltyCard(id, type);
        } else {
            basketLoyaltyCard = null;
        }
        List<Offer> f = m58867f(basketResponse);
        String pickingEligibility = basketResponse.getPickingEligibility();
        if (pickingEligibility != null) {
            str2 = PickingEligibility.m156142b(pickingEligibility);
        }
        String str3 = str2;
        int h = m58869h(basketResponse);
        BasketPromotionCode i = m58870i(basketResponse);
        Map<String, Integer> j = m58871j(basketResponse);
        String id2 = basketResponse.getId();
        if (id2 == null) {
            id2 = str;
        }
        String b2 = BasketReference.m156093b(id2);
        BasketServiceType a = BasketServiceType.f95510a.mo116987a(basketResponse.getServiceType());
        BasketSlot m = m58874m(basketResponse);
        String storeId = basketResponse.getStoreId();
        if (storeId != null) {
            str = storeId;
        }
        return new Basket(c, d, e, b, z2, basketLoyaltyCard, f, str3, h, i, j, b2, a, m, StoreId.m154969b(str), BasketType.f95520a.mo117009a(basketResponse.getType()), basketResponse.getStampsCount(), m58873l(basketResponse), m58872k(basketResponse), (DefaultConstructorMarker) null);
    }

    /* renamed from: p */
    public static final OfferDiscount m58877p(BasketDiscountResponse basketDiscountResponse) {
        Double d;
        int i;
        Double d2;
        long j;
        int i2;
        List list;
        String str;
        int i3;
        DefaultConstructorMarker defaultConstructorMarker;
        BasketAmountResponse discountAmount = basketDiscountResponse.getDiscountAmount();
        if (discountAmount != null) {
            d = C13874a.m58861a(discountAmount);
        } else {
            d = null;
        }
        double h = C28782t.m119111h(d);
        Integer bundle = basketDiscountResponse.getBundle();
        if (bundle != null) {
            i = bundle.intValue();
        } else {
            i = 0;
        }
        String startDate = basketDiscountResponse.getStartDate();
        String str2 = "";
        if (startDate == null) {
            startDate = str2;
        }
        String endDate = basketDiscountResponse.getEndDate();
        if (endDate == null) {
            endDate = str2;
        }
        BasketAmountResponse forcedPrice = basketDiscountResponse.getForcedPrice();
        if (forcedPrice != null) {
            d2 = C13874a.m58861a(forcedPrice);
        } else {
            d2 = null;
        }
        double h2 = C28782t.m119111h(d2);
        String label = basketDiscountResponse.getLabel();
        if (label == null) {
            label = str2;
        }
        OfferDiscountType a = OfferDiscountType.f96009a.mo118124a(basketDiscountResponse.getType());
        Long mandateId = basketDiscountResponse.getMandateId();
        if (mandateId != null) {
            j = mandateId.longValue();
        } else {
            j = 0;
        }
        Integer quantityOfTriggeredDiscount = basketDiscountResponse.getQuantityOfTriggeredDiscount();
        if (quantityOfTriggeredDiscount != null) {
            i2 = quantityOfTriggeredDiscount.intValue();
        } else {
            i2 = 0;
        }
        List<DiscountArticleResponse> triggerArticles = basketDiscountResponse.getTriggerArticles();
        if (triggerArticles != null) {
            Iterable iterable = triggerArticles;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                DiscountArticleResponse discountArticleResponse = (DiscountArticleResponse) it.next();
                String gtin = discountArticleResponse.getGtin();
                Iterator it2 = it;
                if (gtin == null) {
                    gtin = str2;
                }
                String b = Gtin.m157308b(gtin);
                Integer quantity = discountArticleResponse.getQuantity();
                if (quantity != null) {
                    i3 = quantity.intValue();
                    str = str2;
                    defaultConstructorMarker = null;
                } else {
                    str = str2;
                    defaultConstructorMarker = null;
                    i3 = 0;
                }
                arrayList.add(new OfferDiscountArticle(b, i3, defaultConstructorMarker));
                it = it2;
                str2 = str;
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        return new OfferDiscount(h, i, startDate, endDate, h2, label, a, false, (List) null, j, i2, list, C22132b.f56831b, (DefaultConstructorMarker) null);
    }
}
