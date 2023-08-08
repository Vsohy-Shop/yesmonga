package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.domain.extension.C37507h;
import com.carrefour.fid.android.domain.models.OfferDiscountArticle;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.models.ProductDomain;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.presentation.models.OfferMixingModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOfferDiscountModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferDiscountModel.kt\ncom/carrefour/fid/android/presentation/models/extension/OfferDiscountModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1549#2:39\n1620#2,3:40\n1855#2:43\n1856#2:45\n766#2:46\n857#2:47\n1549#2:48\n1620#2,3:49\n858#2:52\n1#3:44\n*S KotlinDebug\n*F\n+ 1 OfferDiscountModel.kt\ncom/carrefour/fid/android/presentation/models/extension/OfferDiscountModelKt\n*L\n10#1:39\n10#1:40,3\n13#1:43\n13#1:45\n28#1:46\n28#1:47\n29#1:48\n29#1:49,3\n28#1:52\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.models.extension.j */
public final class C38474j {
    /* renamed from: a */
    public static final boolean m159634a(@C12579k OfferDiscountDomain offerDiscountDomain, @C12579k List<OfferProductDomain> list) {
        boolean z;
        Object obj;
        OfferAvailability offerAvailability;
        String str;
        Intrinsics.checkNotNullParameter(offerDiscountDomain, "<this>");
        Intrinsics.checkNotNullParameter(list, "offers");
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            ProductDomain Q = ((OfferProductDomain) it.next()).mo116032Q();
            if (Q != null) {
                str2 = Q.mo116544s();
            }
            arrayList.add(str2);
        }
        Collection y = offerDiscountDomain.mo115960y();
        if (y == null || y.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        for (OfferDiscountArticle offerDiscountArticle : offerDiscountDomain.mo115960y()) {
            if (arrayList.contains(offerDiscountArticle.mo115922e())) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    String e = offerDiscountArticle.mo115922e();
                    ProductDomain Q2 = ((OfferProductDomain) obj).mo116032Q();
                    if (Q2 != null) {
                        str = Q2.mo116544s();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual((Object) e, (Object) str)) {
                        break;
                    }
                }
                OfferProductDomain offerProductDomain = (OfferProductDomain) obj;
                if (offerProductDomain != null) {
                    offerAvailability = offerProductDomain.mo116016A();
                } else {
                    offerAvailability = null;
                }
                if (offerAvailability != OfferAvailability.AVAILABLE) {
                }
            }
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: b */
    public static final OfferMixingModel m159635b(@C12579k OfferDiscountDomain offerDiscountDomain, @C12579k List<OfferProductDomain> list) {
        String str;
        Intrinsics.checkNotNullParameter(offerDiscountDomain, "<this>");
        Intrinsics.checkNotNullParameter(list, "entity");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            OfferProductDomain offerProductDomain = (OfferProductDomain) next;
            List<OfferDiscountArticle> y = offerDiscountDomain.mo115960y();
            boolean z = false;
            if (y != null) {
                Iterable<OfferDiscountArticle> iterable = y;
                ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
                for (OfferDiscountArticle e : iterable) {
                    arrayList2.add(e.mo115922e());
                }
                ProductDomain Q = offerProductDomain.mo116032Q();
                if (Q != null) {
                    str = Q.mo116544s();
                } else {
                    str = null;
                }
                if (arrayList2.contains(str)) {
                    z = true;
                }
            }
            if (z) {
                arrayList.add(next);
            }
        }
        list.removeAll(arrayList);
        return new OfferMixingModel(offerDiscountDomain, C37507h.m153957i(arrayList));
    }
}
