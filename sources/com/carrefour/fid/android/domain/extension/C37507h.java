package com.carrefour.fid.android.domain.extension;

import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketOfferDomain;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.OfferPriceDomain;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.ProductDomain;
import com.carrefour.fid.android.domain.models.ProductPictureDomain;
import com.carrefour.fid.android.domain.models.ValidFreshnessGuaranteeDomain;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import com.carrefour.fid.android.presentation.models.OfferNotificationType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nOfferProductDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferProductDomain.kt\ncom/carrefour/fid/android/domain/extension/OfferProductDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1549#2:239\n1620#2,3:240\n1747#2,3:243\n766#2:246\n857#2,2:247\n1549#2:249\n1620#2,3:250\n1549#2:253\n1620#2,2:254\n1622#2:257\n1549#2:258\n1620#2,3:259\n1549#2:262\n1620#2,3:263\n1549#2:266\n1620#2,3:267\n1#3:256\n*S KotlinDebug\n*F\n+ 1 OfferProductDomain.kt\ncom/carrefour/fid/android/domain/extension/OfferProductDomainKt\n*L\n79#1:239\n79#1:240,3\n85#1:243,3\n88#1:246\n88#1:247,2\n91#1:249\n91#1:250,3\n97#1:253\n97#1:254,2\n97#1:257\n137#1:258\n137#1:259,3\n140#1:262\n140#1:263,3\n182#1:266\n182#1:267,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.extension.h */
public final class C37507h {
    @C12579k
    /* renamed from: a */
    public static final List<OfferProductDomain> m153949a(@C12579k List<OfferProductDomain> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((OfferProductDomain) next).mo116016A() == OfferAvailability.AVAILABLE) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final float m153950b(@C12579k OfferProductDomain offerProductDomain) {
        OfferDiscountType offerDiscountType;
        OfferDiscountType offerDiscountType2;
        double d;
        Double l;
        Double k;
        Double k2;
        Double l2;
        Intrinsics.checkNotNullParameter(offerProductDomain, "<this>");
        OfferDiscountDomain D = offerProductDomain.mo116019D();
        OfferDiscountType offerDiscountType3 = null;
        if (D != null) {
            offerDiscountType = D.mo115961z();
        } else {
            offerDiscountType = null;
        }
        double d2 = 0.0d;
        if (offerDiscountType == OfferDiscountType.PF) {
            Double s = offerProductDomain.mo116019D().mo115952s();
            if (s != null) {
                d2 = s.doubleValue();
            }
        } else {
            OfferDiscountDomain D2 = offerProductDomain.mo116019D();
            if (D2 != null) {
                offerDiscountType2 = D2.mo115961z();
            } else {
                offerDiscountType2 = null;
            }
            if (offerDiscountType2 == OfferDiscountType.RD) {
                Double s2 = offerProductDomain.mo116019D().mo115952s();
                if (s2 != null) {
                    d2 = s2.doubleValue();
                }
            } else {
                OfferDiscountDomain D3 = offerProductDomain.mo116019D();
                if (D3 != null) {
                    offerDiscountType3 = D3.mo115961z();
                }
                if (offerDiscountType3 == OfferDiscountType.RI) {
                    OfferPriceDomain O = offerProductDomain.mo116030O();
                    if (!(O == null || (l2 = O.mo116007l()) == null)) {
                        d2 = l2.doubleValue();
                    }
                } else {
                    OfferPriceDomain O2 = offerProductDomain.mo116030O();
                    if (O2 == null || (k2 = O2.mo116006k()) == null) {
                        d = 0.0d;
                    } else {
                        d = k2.doubleValue();
                    }
                    if (d > 0.0d) {
                        OfferPriceDomain O3 = offerProductDomain.mo116030O();
                        if (!(O3 == null || (k = O3.mo116006k()) == null)) {
                            d2 = k.doubleValue();
                        }
                    } else {
                        OfferPriceDomain O4 = offerProductDomain.mo116030O();
                        if (!(O4 == null || (l = O4.mo116007l()) == null)) {
                            d2 = l.doubleValue();
                        }
                    }
                }
            }
        }
        return (float) d2;
    }

    /* renamed from: c */
    public static final boolean m153951c(@C12579k OfferProductDomain offerProductDomain) {
        Intrinsics.checkNotNullParameter(offerProductDomain, "<this>");
        if (!offerProductDomain.mo116037V() || offerProductDomain.mo116019D() != null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m153952d(@C12579k OfferProductDomain offerProductDomain, @C12579k List<? extends C38033d> list) {
        String str;
        Intrinsics.checkNotNullParameter(offerProductDomain, "<this>");
        Intrinsics.checkNotNullParameter(list, "shoppingList");
        Iterable<C38033d> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C38033d a : iterable) {
            String a2 = a.mo117724a();
            ProductDomain Q = offerProductDomain.mo116032Q();
            if (Q != null) {
                str = Q.mo116544s();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual((Object) a2, (Object) str)) {
                return true;
            }
        }
        return false;
    }

    @C12579k
    /* renamed from: e */
    public static final List<OfferProductDomain> m153953e(@C12579k List<OfferProductDomain> list, @C12580l BasketDomain basketDomain) {
        BasketOfferDomain basketOfferDomain;
        List<BasketOfferDomain> B;
        Object obj;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<OfferProductDomain> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (OfferProductDomain offerProductDomain : iterable) {
            if (basketDomain == null || (B = basketDomain.mo115459B()) == null) {
                basketOfferDomain = null;
            } else {
                Iterator it = B.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    OfferIdentifierDomain s = ((BasketOfferDomain) obj).mo115567s();
                    if (s != null) {
                        str = s.mo115986f();
                    } else {
                        str = null;
                    }
                    OfferIdentifierDomain I = offerProductDomain.mo116024I();
                    if (I != null) {
                        str2 = I.mo115986f();
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.areEqual((Object) str, (Object) str2)) {
                        break;
                    }
                }
                basketOfferDomain = (BasketOfferDomain) obj;
            }
            if (basketOfferDomain != null) {
                offerProductDomain.mo116057g0(basketOfferDomain.mo115541B());
                offerProductDomain.mo116045b0(basketOfferDomain.mo115568t());
                offerProductDomain.mo116049d0(basketOfferDomain.mo115570u());
                offerProductDomain.mo116052e0(basketOfferDomain.mo115572w());
                offerProductDomain.mo116055f0(basketOfferDomain.mo115576z());
            } else {
                offerProductDomain.mo116057g0(0);
                offerProductDomain.mo116045b0(offerProductDomain.mo116025J());
                offerProductDomain.mo116049d0(offerProductDomain.mo116027L());
                offerProductDomain.mo116052e0(offerProductDomain.mo116028M());
                offerProductDomain.mo116055f0((Double) null);
            }
            arrayList.add(offerProductDomain);
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: f */
    public static final List<OfferProductDomain> m153954f(@C12579k List<OfferProductDomain> list, @C12579k List<? extends C38033d> list2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(list2, "list");
        Iterable<OfferProductDomain> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (OfferProductDomain offerProductDomain : iterable) {
            offerProductDomain.mo116043a0(m153952d(offerProductDomain, list2));
            arrayList.add(offerProductDomain);
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: com.carrefour.fid.android.domain.models.category.ProductCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.carrefour.fid.android.domain.models.offer.OfferDiscountPromotionCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: com.carrefour.fid.android.domain.models.category.ProductCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v52, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v54, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v57, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: com.carrefour.fid.android.domain.models.category.ProductCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v63, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.offer.Offer m153955g(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.OfferProductDomain r62) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r62
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r2 = new com.carrefour.fid.android.domain.models.offer.OfferIdentifier
            com.carrefour.fid.android.domain.models.OfferIdentifierDomain r0 = r62.mo116024I()
            r3 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.mo115986f()
            goto L_0x0016
        L_0x0015:
            r0 = r3
        L_0x0016:
            java.lang.String r4 = ""
            if (r0 != 0) goto L_0x001b
            r0 = r4
        L_0x001b:
            java.lang.String r0 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r0)
            com.carrefour.fid.android.domain.models.OfferIdentifierDomain r5 = r62.mo116024I()
            if (r5 == 0) goto L_0x002a
            java.lang.String r5 = r5.mo115984e()
            goto L_0x002b
        L_0x002a:
            r5 = r3
        L_0x002b:
            if (r5 != 0) goto L_0x002e
            r5 = r4
        L_0x002e:
            java.lang.String r5 = com.carrefour.fid.android.domain.models.product.ProductReference.m157466b(r5)
            r2.<init>(r0, r5, r3)
            com.carrefour.fid.android.domain.models.OfferDiscountDomain r5 = r62.mo116019D()
            r6 = 10
            if (r5 == 0) goto L_0x0125
            java.lang.Double r7 = r5.mo115951r()
            double r9 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r7)
            java.lang.Integer r7 = r5.mo115948o()
            if (r7 == 0) goto L_0x0054
            int r7 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            int r11 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r7)
            java.lang.String r7 = r5.mo115949p()
            if (r7 != 0) goto L_0x0061
            r12 = r4
            goto L_0x0062
        L_0x0061:
            r12 = r7
        L_0x0062:
            java.lang.String r7 = r5.mo115950q()
            if (r7 != 0) goto L_0x006a
            r13 = r4
            goto L_0x006b
        L_0x006a:
            r13 = r7
        L_0x006b:
            java.lang.Double r7 = r5.mo115952s()
            double r14 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r7)
            java.lang.String r7 = r5.mo115956v()
            if (r7 != 0) goto L_0x007c
            r16 = r4
            goto L_0x007e
        L_0x007c:
            r16 = r7
        L_0x007e:
            com.carrefour.fid.android.domain.models.offer.OfferDiscountType r7 = r5.mo115961z()
            if (r7 != 0) goto L_0x0086
            com.carrefour.fid.android.domain.models.offer.OfferDiscountType r7 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.PF
        L_0x0086:
            r17 = r7
            boolean r18 = r5.mo115955u()
            java.util.List r7 = r5.mo115953t()
            if (r7 != 0) goto L_0x0096
            java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0096:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = kotlin.collections.C10978t.m41495Y(r7, r6)
            r8.<init>(r0)
            java.util.Iterator r0 = r7.iterator()
        L_0x00a5:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x00bd
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r7)
            com.carrefour.fid.android.domain.models.product.Gtin r7 = com.carrefour.fid.android.domain.models.product.Gtin.m157307a(r7)
            r8.add(r7)
            goto L_0x00a5
        L_0x00bd:
            java.lang.Long r0 = r5.mo115957w()
            long r20 = com.carrefour.fid.android.shared.extension.C28750d0.m119041c(r0)
            java.lang.Integer r0 = r5.mo115959x()
            int r22 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r0)
            java.util.List r0 = r5.mo115960y()
            if (r0 != 0) goto L_0x00d7
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00d7:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = kotlin.collections.C10978t.m41495Y(r0, r6)
            r5.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x00e6:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0117
            java.lang.Object r7 = r0.next()
            com.carrefour.fid.android.domain.models.OfferDiscountArticle r7 = (com.carrefour.fid.android.domain.models.OfferDiscountArticle) r7
            com.carrefour.fid.android.domain.models.offer.OfferDiscountArticle r6 = new com.carrefour.fid.android.domain.models.offer.OfferDiscountArticle
            java.lang.String r19 = r7.mo115922e()
            if (r19 != 0) goto L_0x00fc
            r19 = r4
        L_0x00fc:
            java.lang.String r3 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r19)
            java.lang.Integer r7 = r7.mo115924f()
            int r7 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r7)
            r19 = r0
            r0 = 0
            r6.<init>(r3, r7, r0)
            r5.add(r6)
            r3 = r0
            r0 = r19
            r6 = 10
            goto L_0x00e6
        L_0x0117:
            r0 = r3
            com.carrefour.fid.android.domain.models.offer.OfferDiscount r3 = new com.carrefour.fid.android.domain.models.offer.OfferDiscount
            r6 = r8
            r8 = r3
            r19 = r6
            r23 = r5
            r8.<init>(r9, r11, r12, r13, r14, r16, r17, r18, r19, r20, r22, r23)
            r5 = r3
            goto L_0x0127
        L_0x0125:
            r0 = r3
            r5 = r0
        L_0x0127:
            com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain r3 = r62.mo116020E()
            if (r3 == 0) goto L_0x0142
            com.carrefour.fid.android.domain.models.offer.OfferDiscountPromotionCode r6 = new com.carrefour.fid.android.domain.models.offer.OfferDiscountPromotionCode
            java.lang.String r7 = r3.mo115970e()
            if (r7 != 0) goto L_0x0136
            r7 = r4
        L_0x0136:
            java.lang.Double r3 = r3.mo115972f()
            double r8 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            r6.<init>(r7, r8)
            goto L_0x0143
        L_0x0142:
            r6 = r0
        L_0x0143:
            java.lang.Integer r3 = r62.mo116025J()
            int r7 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r3)
            java.lang.Integer r3 = r62.mo116027L()
            int r8 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r3)
            java.lang.Integer r3 = r62.mo116028M()
            int r9 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r3)
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            com.carrefour.fid.android.domain.models.offer.Prices r23 = new com.carrefour.fid.android.domain.models.offer.Prices
            com.carrefour.fid.android.domain.models.OfferPriceDomain r3 = r62.mo116030O()
            if (r3 == 0) goto L_0x0176
            java.lang.Double r3 = r3.mo116007l()
            if (r3 == 0) goto L_0x0176
            double r11 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r11)
            goto L_0x0177
        L_0x0176:
            r3 = r0
        L_0x0177:
            double r12 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            com.carrefour.fid.android.domain.models.OfferPriceDomain r3 = r62.mo116030O()
            if (r3 == 0) goto L_0x0190
            java.lang.Double r3 = r3.mo116006k()
            if (r3 == 0) goto L_0x0190
            double r14 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r14)
            goto L_0x0191
        L_0x0190:
            r3 = r0
        L_0x0191:
            double r14 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            r16 = 0
            com.carrefour.fid.android.domain.models.OfferPriceDomain r3 = r62.mo116030O()
            if (r3 == 0) goto L_0x01a2
            java.lang.String r3 = r3.mo116005j()
            goto L_0x01a3
        L_0x01a2:
            r3 = r0
        L_0x01a3:
            if (r3 != 0) goto L_0x01a8
            r18 = r4
            goto L_0x01aa
        L_0x01a8:
            r18 = r3
        L_0x01aa:
            com.carrefour.fid.android.domain.models.OfferPriceDomain r3 = r62.mo116030O()
            if (r3 == 0) goto L_0x01b5
            java.lang.Double r3 = r3.mo116002h()
            goto L_0x01b6
        L_0x01b5:
            r3 = r0
        L_0x01b6:
            double r19 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            com.carrefour.fid.android.domain.models.OfferPriceDomain r3 = r62.mo116030O()
            if (r3 == 0) goto L_0x01c5
            java.lang.Double r3 = r3.mo116004i()
            goto L_0x01c6
        L_0x01c5:
            r3 = r0
        L_0x01c6:
            double r21 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            r11 = r23
            r11.<init>(r12, r14, r16, r18, r19, r21)
            java.lang.Double r3 = r62.mo116031P()
            if (r3 == 0) goto L_0x01df
            double r12 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r12)
            r12 = r3
            goto L_0x01e0
        L_0x01df:
            r12 = r0
        L_0x01e0:
            java.lang.Double r3 = r62.mo116029N()
            if (r3 == 0) goto L_0x01f0
            double r13 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r13)
            r13 = r3
            goto L_0x01f1
        L_0x01f0:
            r13 = r0
        L_0x01f1:
            com.carrefour.fid.android.domain.models.ProductDomain r3 = r62.mo116032Q()
            if (r3 == 0) goto L_0x01fc
            java.lang.String r3 = r3.mo116544s()
            goto L_0x01fd
        L_0x01fc:
            r3 = r0
        L_0x01fd:
            if (r3 != 0) goto L_0x0200
            r3 = r4
        L_0x0200:
            java.lang.String r32 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r3)
            com.carrefour.fid.android.domain.models.ProductDomain r3 = r62.mo116032Q()
            if (r3 == 0) goto L_0x024b
            com.carrefour.fid.android.domain.models.ProductCategoryDomain r3 = r3.mo116542q()
            if (r3 == 0) goto L_0x024b
            java.lang.String r34 = r3.mo116510h()
            java.lang.String r35 = r3.mo116513j()
            int r36 = r3.mo116512i()
            java.lang.String r37 = r3.mo116514k()
            java.util.List r41 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            java.lang.String r38 = new java.lang.String
            r38.<init>()
            com.carrefour.fid.android.domain.models.category.CategoryType r39 = com.carrefour.fid.android.domain.models.category.CategoryType.RAYON
            java.util.List r40 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            int r14 = r3.mo116512i()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r3 = r3.mo116513j()
            kotlin.Pair r3 = kotlin.C11078d1.m42659a(r14, r3)
            java.util.Map r42 = kotlin.collections.C10975r0.m41401k(r3)
            com.carrefour.fid.android.domain.models.category.ProductCategory r3 = new com.carrefour.fid.android.domain.models.category.ProductCategory
            r33 = r3
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42)
            goto L_0x024d
        L_0x024b:
            r33 = r0
        L_0x024d:
            java.util.List r3 = r62.mo116022G()
            if (r3 != 0) goto L_0x0257
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0257:
            r34 = r3
            com.carrefour.fid.android.domain.models.ProductDomain r3 = r62.mo116032Q()
            if (r3 == 0) goto L_0x0264
            java.util.List r3 = r3.mo116547u()
            goto L_0x0265
        L_0x0264:
            r3 = r0
        L_0x0265:
            if (r3 != 0) goto L_0x026b
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x026b:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r14 = new java.util.ArrayList
            r15 = 10
            int r15 = kotlin.collections.C10978t.m41495Y(r3, r15)
            r14.<init>(r15)
            java.util.Iterator r3 = r3.iterator()
        L_0x027c:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L_0x029a
            java.lang.Object r15 = r3.next()
            com.carrefour.fid.android.domain.models.ProductPictureDomain r15 = (com.carrefour.fid.android.domain.models.ProductPictureDomain) r15
            com.carrefour.fid.android.domain.models.product.ProductPicture r0 = new com.carrefour.fid.android.domain.models.product.ProductPicture
            java.lang.String r11 = r15.mo116585e()
            int r15 = r15.getOrder()
            r0.<init>(r11, r15)
            r14.add(r0)
            r0 = 0
            goto L_0x027c
        L_0x029a:
            com.carrefour.fid.android.domain.models.ProductDomain r0 = r62.mo116032Q()
            if (r0 == 0) goto L_0x02a7
            com.carrefour.fid.android.domain.models.offer.ProductNutriScore r0 = r0.mo116548v()
            r36 = r0
            goto L_0x02a9
        L_0x02a7:
            r36 = 0
        L_0x02a9:
            com.carrefour.fid.android.domain.models.ProductDomain r0 = r62.mo116032Q()
            if (r0 == 0) goto L_0x02b4
            java.lang.String r0 = r0.mo116549w()
            goto L_0x02b5
        L_0x02b4:
            r0 = 0
        L_0x02b5:
            if (r0 != 0) goto L_0x02ba
            r37 = r4
            goto L_0x02bc
        L_0x02ba:
            r37 = r0
        L_0x02bc:
            com.carrefour.fid.android.domain.models.ProductDomain r0 = r62.mo116032Q()
            if (r0 == 0) goto L_0x02c7
            java.lang.String r0 = r0.mo116551x()
            goto L_0x02c8
        L_0x02c7:
            r0 = 0
        L_0x02c8:
            if (r0 != 0) goto L_0x02cd
            r38 = r4
            goto L_0x02cf
        L_0x02cd:
            r38 = r0
        L_0x02cf:
            com.carrefour.fid.android.domain.models.ProductDomain r0 = r62.mo116032Q()
            if (r0 == 0) goto L_0x02da
            java.lang.String r0 = r0.mo116552y()
            goto L_0x02db
        L_0x02da:
            r0 = 0
        L_0x02db:
            if (r0 != 0) goto L_0x02de
            r0 = r4
        L_0x02de:
            java.lang.String r39 = com.carrefour.fid.android.domain.models.product.ProductReference.m157466b(r0)
            com.carrefour.fid.android.domain.models.ProductDomain r0 = r62.mo116032Q()
            if (r0 == 0) goto L_0x02ed
            java.lang.String r3 = r0.mo116553z()
            goto L_0x02ee
        L_0x02ed:
            r3 = 0
        L_0x02ee:
            if (r3 != 0) goto L_0x02f3
            r40 = r4
            goto L_0x02f5
        L_0x02f3:
            r40 = r3
        L_0x02f5:
            java.lang.String r41 = new java.lang.String
            r41.<init>()
            java.lang.String r42 = new java.lang.String
            r42.<init>()
            java.lang.String r43 = new java.lang.String
            r43.<init>()
            java.util.List r53 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            com.carrefour.fid.android.domain.models.ProductDomain r0 = r62.mo116032Q()
            r3 = 0
            if (r0 == 0) goto L_0x0316
            boolean r0 = r0.mo116522A()
            r57 = r0
            goto L_0x0318
        L_0x0316:
            r57 = r3
        L_0x0318:
            com.carrefour.fid.android.domain.models.ProductDomain r0 = r62.mo116032Q()
            if (r0 == 0) goto L_0x0325
            boolean r0 = r0.mo116543r()
            r59 = r0
            goto L_0x0327
        L_0x0325:
            r59 = r3
        L_0x0327:
            com.carrefour.fid.android.domain.models.ProductDomain r0 = r62.mo116032Q()
            if (r0 == 0) goto L_0x0337
            java.lang.String r0 = r0.mo116541p()
            if (r0 != 0) goto L_0x0334
            goto L_0x0337
        L_0x0334:
            r58 = r0
            goto L_0x0339
        L_0x0337:
            r58 = r4
        L_0x0339:
            com.carrefour.fid.android.domain.models.product.Product r0 = new com.carrefour.fid.android.domain.models.product.Product
            r31 = r0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r60 = 25165824(0x1800000, float:4.7019774E-38)
            r61 = 0
            r35 = r14
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            int r15 = r62.mo116033R()
            r17 = 0
            boolean r18 = r62.mo116038W()
            r19 = 0
            com.carrefour.fid.android.domain.models.ProductDomain r4 = r62.mo116032Q()
            if (r4 == 0) goto L_0x0377
            boolean r4 = r4.mo116523B()
            r20 = r4
            goto L_0x0379
        L_0x0377:
            r20 = r3
        L_0x0379:
            r21 = 0
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r22 = r62.mo116016A()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r4 = r62.mo116016A()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r11 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            r14 = 1
            if (r4 != r11) goto L_0x038b
            r31 = r14
            goto L_0x038d
        L_0x038b:
            r31 = r3
        L_0x038d:
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r1 = r62.mo116016A()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r4 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.NOT_IN_STORE
            if (r1 != r4) goto L_0x0398
            r32 = r14
            goto L_0x039a
        L_0x0398:
            r32 = r3
        L_0x039a:
            r24 = 0
            r25 = 0
            java.lang.String r26 = ""
            r27 = 0
            java.util.List r28 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r29 = 33816576(0x2040000, float:9.697828E-38)
            r30 = 0
            com.carrefour.fid.android.domain.models.offer.Offer r33 = new com.carrefour.fid.android.domain.models.offer.Offer
            r1 = r33
            r3 = 0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r23
            r11 = 0
            r14 = r0
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r31
            r23 = r32
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.extension.C37507h.m153955g(com.carrefour.fid.android.domain.models.OfferProductDomain):com.carrefour.fid.android.domain.models.offer.Offer");
    }

    @C12579k
    /* renamed from: h */
    public static final OfferProductModel m153956h(@C12579k OfferProductDomain offerProductDomain) {
        ProductCategoryDomain productCategoryDomain;
        String str;
        String str2;
        String str3;
        List<ProductPictureDomain> list;
        List<OfferFlag> list2;
        String str4;
        String str5;
        ProductNutriScore productNutriScore;
        boolean z;
        boolean z2;
        String str6;
        boolean z3;
        ValidFreshnessGuaranteeDomain validFreshnessGuaranteeDomain;
        Intrinsics.checkNotNullParameter(offerProductDomain, "<this>");
        OfferAvailability A = offerProductDomain.mo116016A();
        List<OfferFlag> G = offerProductDomain.mo116022G();
        OfferIdentifierDomain I = offerProductDomain.mo116024I();
        ProductDomain Q = offerProductDomain.mo116032Q();
        if (Q != null) {
            productCategoryDomain = Q.mo116542q();
        } else {
            productCategoryDomain = null;
        }
        ProductDomain Q2 = offerProductDomain.mo116032Q();
        if (Q2 != null) {
            str = Q2.mo116544s();
        } else {
            str = null;
        }
        ProductDomain Q3 = offerProductDomain.mo116032Q();
        if (Q3 != null) {
            str2 = Q3.mo116552y();
        } else {
            str2 = null;
        }
        ProductDomain Q4 = offerProductDomain.mo116032Q();
        if (Q4 != null) {
            str3 = Q4.mo116553z();
        } else {
            str3 = null;
        }
        ProductDomain Q5 = offerProductDomain.mo116032Q();
        if (Q5 != null) {
            list = Q5.mo116547u();
        } else {
            list = null;
        }
        ProductDomain Q6 = offerProductDomain.mo116032Q();
        if (Q6 != null) {
            list2 = Q6.mo116545t();
        } else {
            list2 = null;
        }
        ProductDomain Q7 = offerProductDomain.mo116032Q();
        if (Q7 != null) {
            str4 = Q7.mo116551x();
        } else {
            str4 = null;
        }
        ProductDomain Q8 = offerProductDomain.mo116032Q();
        if (Q8 != null) {
            str5 = Q8.mo116549w();
        } else {
            str5 = null;
        }
        ProductDomain Q9 = offerProductDomain.mo116032Q();
        if (Q9 != null) {
            productNutriScore = Q9.mo116548v();
        } else {
            productNutriScore = null;
        }
        ProductDomain Q10 = offerProductDomain.mo116032Q();
        if (Q10 != null) {
            z = Q10.mo116523B();
        } else {
            z = false;
        }
        ProductDomain Q11 = offerProductDomain.mo116032Q();
        if (Q11 != null) {
            z2 = Q11.mo116522A();
        } else {
            z2 = false;
        }
        ProductDomain Q12 = offerProductDomain.mo116032Q();
        if (Q12 == null || (str6 = Q12.mo116541p()) == null) {
            str6 = "";
        }
        String str7 = str6;
        ProductDomain Q13 = offerProductDomain.mo116032Q();
        if (Q13 != null) {
            z3 = Q13.mo116543r();
        } else {
            z3 = false;
        }
        ProductModel productModel = new ProductModel(productCategoryDomain, str, list2, list, productNutriScore, str5, str4, str2, str3, z, z2, str7, z3);
        OfferPriceDomain O = offerProductDomain.mo116030O();
        Double P = offerProductDomain.mo116031P();
        Double N = offerProductDomain.mo116029N();
        OfferDiscountDomain D = offerProductDomain.mo116019D();
        OfferDiscountPromoCodeDomain E = offerProductDomain.mo116020E();
        int R = offerProductDomain.mo116033R();
        Integer J = offerProductDomain.mo116025J();
        Integer L = offerProductDomain.mo116027L();
        Integer M = offerProductDomain.mo116028M();
        boolean W = offerProductDomain.mo116038W();
        Double F = offerProductDomain.mo116021F();
        if (offerProductDomain.mo116023H() instanceof ValidFreshnessGuaranteeDomain) {
            validFreshnessGuaranteeDomain = (ValidFreshnessGuaranteeDomain) offerProductDomain.mo116023H();
        } else {
            validFreshnessGuaranteeDomain = null;
        }
        String U = offerProductDomain.mo116036U();
        if (U == null) {
            U = "undefined";
        }
        return new OfferProductModel(A, G, I, productModel, O, P, N, D, E, R, J, L, M, W, F, (OfferNotificationType) null, validFreshnessGuaranteeDomain, (String) null, U, offerProductDomain.mo116034S(), offerProductDomain.mo116017B(), offerProductDomain.mo116018C(), offerProductDomain.mo116026K(), offerProductDomain.mo116035T(), m153951c(offerProductDomain), (Boolean) null, (Boolean) null, false, false, false, false, 2114093056, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: i */
    public static final List<OfferProductModel> m153957i(@C12579k List<OfferProductDomain> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<OfferProductDomain> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (OfferProductDomain h : iterable) {
            arrayList.add(m153956h(h));
        }
        return arrayList;
    }
}
