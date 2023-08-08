package com.carrefour.fid.android.catalogs.data.api.datasources.extensions;

import com.carrefour.fid.android.catalogs.data.api.entities.responses.CatalogHeaderResponse;
import com.carrefour.fid.android.catalogs.data.api.entities.responses.CatalogResponse;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCatalogList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogList.kt\ncom/carrefour/fid/android/catalogs/data/api/datasources/extensions/CatalogListKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n1549#2:26\n1620#2,3:27\n*S KotlinDebug\n*F\n+ 1 CatalogList.kt\ncom/carrefour/fid/android/catalogs/data/api/datasources/extensions/CatalogListKt\n*L\n6#1:26\n6#1:27,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.data.api.datasources.extensions.b */
public final class C39396b {
    @C12580l
    /* renamed from: a */
    public static final List<Catalog> m161448a(@C12579k CatalogResponse catalogResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Intrinsics.checkNotNullParameter(catalogResponse, "<this>");
        List<CatalogHeaderResponse> data = catalogResponse.getData();
        if (data == null) {
            return null;
        }
        Iterable iterable = data;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            CatalogHeaderResponse catalogHeaderResponse = (CatalogHeaderResponse) it.next();
            String id = catalogHeaderResponse.getId();
            if (id == null) {
                str = "";
            } else {
                str = id;
            }
            List<String> displayTargets = catalogHeaderResponse.getDisplayTargets();
            if (displayTargets == null) {
                displayTargets = CollectionsKt__CollectionsKt.m40441E();
            }
            List<String> list = displayTargets;
            String name = catalogHeaderResponse.getName();
            if (name == null) {
                str2 = "";
            } else {
                str2 = name;
            }
            String validityStartDate = catalogHeaderResponse.getValidityStartDate();
            if (validityStartDate == null) {
                str3 = "";
            } else {
                str3 = validityStartDate;
            }
            List<String> stores = catalogHeaderResponse.getStores();
            if (stores == null) {
                stores = CollectionsKt__CollectionsKt.m40441E();
            }
            List<String> list2 = stores;
            String validityEndDate = catalogHeaderResponse.getValidityEndDate();
            if (validityEndDate == null) {
                str4 = "";
            } else {
                str4 = validityEndDate;
            }
            String startDate = catalogHeaderResponse.getStartDate();
            if (startDate == null) {
                str5 = "";
            } else {
                str5 = startDate;
            }
            String endDate = catalogHeaderResponse.getEndDate();
            if (endDate == null) {
                str6 = "";
            } else {
                str6 = endDate;
            }
            String speed = catalogHeaderResponse.getSpeed();
            if (speed == null) {
                str7 = "";
            } else {
                str7 = speed;
            }
            String storeFormat = catalogHeaderResponse.getStoreFormat();
            if (storeFormat == null) {
                str8 = "";
            } else {
                str8 = storeFormat;
            }
            String numberOfPage = catalogHeaderResponse.getNumberOfPage();
            if (numberOfPage == null) {
                str9 = "";
            } else {
                str9 = numberOfPage;
            }
            String slug = catalogHeaderResponse.getSlug();
            if (slug == null) {
                str10 = "";
            } else {
                str10 = slug;
            }
            String order = catalogHeaderResponse.getOrder();
            if (order == null) {
                str11 = "";
            } else {
                str11 = order;
            }
            String local = catalogHeaderResponse.getLocal();
            if (local == null) {
                str12 = "";
            } else {
                str12 = local;
            }
            String coverUrl = catalogHeaderResponse.getCoverUrl();
            if (coverUrl == null) {
                coverUrl = "";
            }
            Iterator it2 = it;
            Catalog catalog = r3;
            Catalog catalog2 = new Catalog(str, list, str2, str3, list2, str4, str5, str6, str7, str8, str9, str10, str11, str12, coverUrl);
            arrayList.add(catalog);
            it = it2;
        }
        return arrayList;
    }
}
