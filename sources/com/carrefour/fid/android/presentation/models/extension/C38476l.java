package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.viewmodels.offer.state.C26631b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10998z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOfferModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferModel.kt\ncom/carrefour/fid/android/presentation/models/extension/OfferModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n800#2,11:65\n1855#2,2:76\n800#2,11:78\n1855#2,2:89\n800#2,11:91\n800#2,11:102\n1855#2:113\n766#2:114\n857#2,2:115\n1856#2:117\n*S KotlinDebug\n*F\n+ 1 OfferModel.kt\ncom/carrefour/fid/android/presentation/models/extension/OfferModelKt\n*L\n15#1:65,11\n15#1:76,2\n25#1:78,11\n25#1:89,2\n38#1:91,11\n39#1:102,11\n41#1:113\n43#1:114\n43#1:115,2\n41#1:117\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.models.extension.l */
public final class C38476l {
    /* renamed from: a */
    public static final double m159638a(@C12579k Offer offer) {
        PromoType promoType;
        PromoType promoType2;
        Intrinsics.checkNotNullParameter(offer, "<this>");
        Discount T = offer.mo118011T();
        PromoType promoType3 = null;
        if (T != null) {
            promoType = T.mo117953A();
        } else {
            promoType = null;
        }
        if (promoType != PromoType.PF) {
            Discount T2 = offer.mo118011T();
            if (T2 != null) {
                promoType2 = T2.mo117953A();
            } else {
                promoType2 = null;
            }
            if (promoType2 != PromoType.RD) {
                Discount T3 = offer.mo118011T();
                if (T3 != null) {
                    promoType3 = T3.mo117953A();
                }
                if (promoType3 != PromoType.RI) {
                    if (offer.mo118009R().mo118171l() > 0.0d) {
                        return offer.mo118009R().mo118171l();
                    }
                    if (offer.mo118009R().mo118172m() > 0.0d) {
                        return offer.mo118009R().mo118172m();
                    }
                    return 0.0d;
                }
            }
        }
        Discount T4 = offer.mo118011T();
        if (T4 != null) {
            return ((double) T4.mo117980t()) / ((double) 100);
        }
        return 0.0d;
    }

    @C12579k
    /* renamed from: b */
    public static final C26631b.C26635d m159639b(@C12579k List<? extends OfferModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List T5 = CollectionsKt___CollectionsKt.m40572T5(list);
        Iterable iterable = T5;
        ArrayList<OfferProductModel> arrayList = new ArrayList<>();
        for (Object next : iterable) {
            if (next instanceof OfferProductModel) {
                arrayList.add(next);
            }
        }
        for (OfferProductModel offerProductModel : arrayList) {
            if (!offerProductModel.mo121497A1()) {
                T5.remove(offerProductModel);
            }
        }
        m159640c(T5);
        ArrayList<OfferDepartmentModel> arrayList2 = new ArrayList<>();
        for (Object next2 : iterable) {
            if (next2 instanceof OfferDepartmentModel) {
                arrayList2.add(next2);
            }
        }
        for (OfferDepartmentModel offerDepartmentModel : arrayList2) {
            if (offerDepartmentModel.mo121688M() == 0) {
                T5.remove(offerDepartmentModel);
            }
        }
        if (C10998z.m42387a1(iterable, OfferProductModel.class).size() <= 0) {
            T5 = CollectionsKt__CollectionsKt.m40441E();
        }
        return new C26631b.C26635d(T5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r6.mo121509g() != com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        if (r6.mo121509g() == com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE) goto L_0x00a0;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.carrefour.fid.android.presentation.models.OfferModel> m159640c(@org.jetbrains.annotations.C12579k java.util.List<? extends com.carrefour.fid.android.presentation.models.OfferModel> r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = r11
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0011:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r2.next()
            boolean r4 = r3 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r4 == 0) goto L_0x0011
            r1.add(r3)
            goto L_0x0011
        L_0x0023:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r0.next()
            boolean r4 = r3 instanceof com.carrefour.fid.android.presentation.models.OfferDepartmentModel
            if (r4 == 0) goto L_0x002c
            r2.add(r3)
            goto L_0x002c
        L_0x003e:
            java.util.Iterator r0 = r2.iterator()
        L_0x0042:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00ae
            java.lang.Object r2 = r0.next()
            com.carrefour.fid.android.presentation.models.OfferDepartmentModel r2 = (com.carrefour.fid.android.presentation.models.OfferDepartmentModel) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x0057:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a6
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.carrefour.fid.android.presentation.models.OfferProductModel r6 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r6
            java.lang.String r7 = r2.mo121690W()
            r8 = 1
            r9 = 0
            if (r7 != 0) goto L_0x0077
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r6 = r6.mo121509g()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r7 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            if (r6 == r7) goto L_0x0075
            goto L_0x00a0
        L_0x0075:
            r8 = r9
            goto L_0x00a0
        L_0x0077:
            com.carrefour.fid.android.presentation.models.ProductModel r7 = r6.mo121517o0()
            if (r7 == 0) goto L_0x0089
            com.carrefour.fid.android.domain.models.ProductCategoryDomain r7 = r7.mo121887q()
            if (r7 == 0) goto L_0x0089
            java.lang.String r7 = r7.mo116510h()
            if (r7 != 0) goto L_0x008e
        L_0x0089:
            java.lang.String r7 = new java.lang.String
            r7.<init>()
        L_0x008e:
            java.lang.String r10 = r2.mo121690W()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r10)
            if (r7 == 0) goto L_0x0075
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r6 = r6.mo121509g()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r7 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            if (r6 != r7) goto L_0x0075
        L_0x00a0:
            if (r8 == 0) goto L_0x0057
            r3.add(r5)
            goto L_0x0057
        L_0x00a6:
            int r3 = r3.size()
            r2.mo121692Z(r3)
            goto L_0x0042
        L_0x00ae:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.extension.C38476l.m159640c(java.util.List):java.util.List");
    }
}
