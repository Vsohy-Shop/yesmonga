package com.carrefour.fid.android.domain.extension;

import com.carrefour.fid.android.domain.models.FrequentSaleDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFrequentSalesProductsDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrequentSalesProductsDomain.kt\ncom/carrefour/fid/android/domain/extension/FrequentSalesProductsDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n766#2:23\n857#2,2:24\n1747#2,3:26\n819#2:29\n847#2,2:30\n1747#2,3:32\n*S KotlinDebug\n*F\n+ 1 FrequentSalesProductsDomain.kt\ncom/carrefour/fid/android/domain/extension/FrequentSalesProductsDomainKt\n*L\n8#1:23\n8#1:24,2\n14#1:26,3\n17#1:29\n17#1:30,2\n22#1:32,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.extension.g */
public final class C37506g {
    /* renamed from: a */
    public static final boolean m153947a(@C12579k List<FrequentSaleDomain> list, @C12579k OfferProductDomain offerProductDomain) {
        String str;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(offerProductDomain, C28547h2.f69318f);
        ArrayList<FrequentSaleDomain> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (C11622t.startsWith(((FrequentSaleDomain) next).mo115832o(), "00", true)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            for (FrequentSaleDomain l : arrayList) {
                String l2 = l.mo115829l();
                OfferIdentifierDomain I = offerProductDomain.mo116024I();
                if (I != null) {
                    str = I.mo115986f();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                if (Intrinsics.areEqual((Object) l2, (Object) str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m153948b(@C12579k List<FrequentSaleDomain> list, @C12579k OfferProductDomain offerProductDomain) {
        String str;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(offerProductDomain, C28547h2.f69318f);
        ArrayList<FrequentSaleDomain> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (!C11622t.startsWith(((FrequentSaleDomain) next).mo115832o(), "00", true)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            for (FrequentSaleDomain l : arrayList) {
                String l2 = l.mo115829l();
                OfferIdentifierDomain I = offerProductDomain.mo116024I();
                if (I != null) {
                    str = I.mo115986f();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                if (Intrinsics.areEqual((Object) l2, (Object) str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
