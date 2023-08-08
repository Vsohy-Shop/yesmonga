package com.carrefour.fid.android.domain.models.basket.extension;

import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketErrorMessage;
import com.carrefour.fid.android.domain.models.offer.Offer;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Basket.kt\ncom/carrefour/fid/android/domain/models/basket/extension/BasketKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1747#2,3:70\n1549#2:73\n1620#2,3:74\n1603#2,9:78\n1855#2:87\n1856#2:89\n1612#2:90\n1#3:77\n1#3:88\n*S KotlinDebug\n*F\n+ 1 Basket.kt\ncom/carrefour/fid/android/domain/models/basket/extension/BasketKt\n*L\n10#1:70,3\n22#1:73\n22#1:74,3\n31#1:78,9\n31#1:87\n31#1:89\n31#1:90\n31#1:88\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.models.basket.extension.a */
public final class C37972a {
    @C12579k

    /* renamed from: a */
    public static final String f95533a = "FAILURE_CASE_SLOT_NOT_BOOKED";
    @C12579k

    /* renamed from: b */
    public static final String f95534b = "FAILURE_CASE_SLOT_INVALID_DATE";
    @C12579k

    /* renamed from: c */
    public static final String f95535c = "FAILURE_CASE_SLOT_CLOSE";
    @C12579k

    /* renamed from: d */
    public static final String f95536d = "SLOT_INFO_NOT_AVAILABLE";
    @C12579k

    /* renamed from: e */
    public static final String f95537e = "FAILURE_CASE_NO_SLOT";
    @C12579k

    /* renamed from: f */
    public static final String f95538f = "BASKET_HAS_NO_SLOT";
    @C12579k

    /* renamed from: g */
    public static final String f95539g = "QUANTITY_REQUESTED_HIGHER_THAN_AVAILABLE";
    @C12579k

    /* renamed from: h */
    public static final String f95540h = "QUANTITY_REQUESTED_HIGHER_THAN_MAX_POSSIBLE";
    @C12579k

    /* renamed from: i */
    public static final String f95541i = "QUANTITY_REQUESTED_RELATED_TO_PRODUCT_CATEGORY_HAS_EXCEEDED_THE_LIMIT";
    @C12579k

    /* renamed from: j */
    public static final String f95542j = "NOT_ADDED";
    @C12579k

    /* renamed from: k */
    public static final String f95543k = "NOT_AVAILABLE";

    /* renamed from: a */
    public static final int m156170a(@C12579k Basket basket) {
        Intrinsics.checkNotNullParameter(basket, "<this>");
        int i = 0;
        for (Offer U : basket.mo116817B()) {
            i += U.mo118012U();
        }
        return i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
        if (r3.equals("QUANTITY_REQUESTED_HIGHER_THAN_MAX_POSSIBLE") == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        if (r3.equals("QUANTITY_REQUESTED_HIGHER_THAN_AVAILABLE") != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00af, code lost:
        if (r0.mo118004M() > r7) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b1, code lost:
        r3 = new com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable(r6.mo118136f(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
     */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.lang.Throwable> m156171b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.basket.Basket r5, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.offer.OfferIdentifier r6, int r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.List r5 = r5.mo116817B()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r5.next()
            r2 = r0
            com.carrefour.fid.android.domain.models.offer.Offer r2 = (com.carrefour.fid.android.domain.models.offer.Offer) r2
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r2 = r2.mo118001J()
            java.lang.String r2 = r2.mo118136f()
            java.lang.String r3 = r6.mo118136f()
            boolean r2 = com.carrefour.fid.android.domain.models.product.Gtin.m157311e(r2, r3)
            if (r2 == 0) goto L_0x0014
            goto L_0x0036
        L_0x0035:
            r0 = r1
        L_0x0036:
            com.carrefour.fid.android.domain.models.offer.Offer r0 = (com.carrefour.fid.android.domain.models.offer.Offer) r0
            if (r0 != 0) goto L_0x003b
            return r1
        L_0x003b:
            java.util.List r5 = r0.mo118005N()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x004a:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x00c2
            java.lang.Object r3 = r5.next()
            com.carrefour.fid.android.domain.models.offer.OfferMessage r3 = (com.carrefour.fid.android.domain.models.offer.OfferMessage) r3
            java.lang.String r3 = r3.mo118148e()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1688620010: goto L_0x00a3;
                case -1015848577: goto L_0x009a;
                case 140722205: goto L_0x0089;
                case 935189964: goto L_0x0073;
                case 1018325076: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x00bb
        L_0x0062:
            java.lang.String r4 = "NOT_ADDED"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x006b
            goto L_0x00bb
        L_0x006b:
            com.carrefour.fid.android.domain.exceptions.BasketThrowable r3 = new com.carrefour.fid.android.domain.exceptions.BasketThrowable
            com.carrefour.fid.android.domain.exceptions.BasketErrorType r4 = com.carrefour.fid.android.domain.exceptions.BasketErrorType.BasketNotAdded
            r3.<init>(r4)
            goto L_0x00bc
        L_0x0073:
            java.lang.String r4 = "QUANTITY_REQUESTED_RELATED_TO_PRODUCT_CATEGORY_HAS_EXCEEDED_THE_LIMIT"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x007c
            goto L_0x00bb
        L_0x007c:
            com.carrefour.fid.android.domain.models.offer.CategoryLimit r3 = r0.mo117996E()
            if (r3 == 0) goto L_0x00bb
            com.carrefour.fid.android.domain.exceptions.CategoryLimitationExceededThrowable r4 = new com.carrefour.fid.android.domain.exceptions.CategoryLimitationExceededThrowable
            r4.<init>(r3)
            r3 = r4
            goto L_0x00bc
        L_0x0089:
            java.lang.String r4 = "NOT_AVAILABLE"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0092
            goto L_0x00bb
        L_0x0092:
            com.carrefour.fid.android.domain.exceptions.BasketThrowable r3 = new com.carrefour.fid.android.domain.exceptions.BasketThrowable
            com.carrefour.fid.android.domain.exceptions.BasketErrorType r4 = com.carrefour.fid.android.domain.exceptions.BasketErrorType.ProductNotAvailable
            r3.<init>(r4)
            goto L_0x00bc
        L_0x009a:
            java.lang.String r4 = "QUANTITY_REQUESTED_HIGHER_THAN_MAX_POSSIBLE"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ab
            goto L_0x00bb
        L_0x00a3:
            java.lang.String r4 = "QUANTITY_REQUESTED_HIGHER_THAN_AVAILABLE"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bb
        L_0x00ab:
            int r3 = r0.mo118004M()
            if (r3 > r7) goto L_0x00bb
            com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable r3 = new com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable
            java.lang.String r4 = r6.mo118136f()
            r3.<init>(r4, r1)
            goto L_0x00bc
        L_0x00bb:
            r3 = r1
        L_0x00bc:
            if (r3 == 0) goto L_0x004a
            r2.add(r3)
            goto L_0x004a
        L_0x00c2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.basket.extension.C37972a.m156171b(com.carrefour.fid.android.domain.models.basket.Basket, com.carrefour.fid.android.domain.models.offer.OfferIdentifier, int):java.util.List");
    }

    /* renamed from: c */
    public static final boolean m156172c(@C12579k Basket basket) {
        Intrinsics.checkNotNullParameter(basket, "<this>");
        Iterable<BasketErrorMessage> y = basket.mo116858y();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(y, 10));
        for (BasketErrorMessage f : y) {
            arrayList.add(f.mo116909f());
        }
        return arrayList.contains("FAILURE_CASE_SLOT_CLOSE");
    }

    /* renamed from: d */
    public static final boolean m156173d(@C12579k Basket basket) {
        Intrinsics.checkNotNullParameter(basket, "<this>");
        Iterable<BasketErrorMessage> y = basket.mo116858y();
        if ((y instanceof Collection) && ((Collection) y).isEmpty()) {
            return false;
        }
        for (BasketErrorMessage f : y) {
            if (CollectionsKt__CollectionsKt.m40448L("FAILURE_CASE_SLOT_INVALID_DATE", "FAILURE_CASE_SLOT_NOT_BOOKED", "FAILURE_CASE_SLOT_CLOSE", "SLOT_INFO_NOT_AVAILABLE", "FAILURE_CASE_NO_SLOT", "BASKET_HAS_NO_SLOT").contains(f.mo116909f())) {
                return true;
            }
        }
        return false;
    }
}
