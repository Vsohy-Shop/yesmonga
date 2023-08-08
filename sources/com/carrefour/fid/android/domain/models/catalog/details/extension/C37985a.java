package com.carrefour.fid.android.domain.models.catalog.details.extension;

import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogArea;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogDoublePage;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogHeaderDetails;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogPage;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCatalogFullDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogFullDetails.kt\ncom/carrefour/fid/android/domain/models/catalog/details/extension/CatalogFullDetailsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1360#2:36\n1446#2,2:37\n1549#2:39\n1620#2,3:40\n1549#2:43\n1620#2,3:44\n1448#2,3:47\n*S KotlinDebug\n*F\n+ 1 CatalogFullDetails.kt\ncom/carrefour/fid/android/domain/models/catalog/details/extension/CatalogFullDetailsKt\n*L\n30#1:36\n30#1:37,2\n31#1:39\n31#1:40,3\n32#1:43\n32#1:44,3\n30#1:47,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.models.catalog.details.extension.a */
public final class C37985a {
    @C12579k
    /* renamed from: a */
    public static final List<CatalogProduct> m156311a(@C12579k CatalogFullDetails catalogFullDetails) {
        List list;
        List<CatalogArea> f;
        List<CatalogArea> f2;
        Intrinsics.checkNotNullParameter(catalogFullDetails, "<this>");
        ArrayList arrayList = new ArrayList();
        for (CatalogDoublePage catalogDoublePage : catalogFullDetails.mo117138i()) {
            CatalogPage e = catalogDoublePage.mo117118e();
            List list2 = null;
            if (e == null || (f2 = e.mo117192f()) == null) {
                list = null;
            } else {
                Iterable<CatalogArea> iterable = f2;
                list = new ArrayList(C10978t.m41495Y(iterable, 10));
                for (CatalogArea h : iterable) {
                    list.add(h.mo117104h());
                }
            }
            if (list == null) {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
            Collection collection = list;
            CatalogPage f3 = catalogDoublePage.mo117120f();
            if (!(f3 == null || (f = f3.mo117192f()) == null)) {
                Iterable<CatalogArea> iterable2 = f;
                list2 = new ArrayList(C10978t.m41495Y(iterable2, 10));
                for (CatalogArea h2 : iterable2) {
                    list2.add(h2.mo117104h());
                }
            }
            if (list2 == null) {
                list2 = CollectionsKt__CollectionsKt.m40441E();
            }
            C10994x.m42360n0(arrayList, CollectionsKt___CollectionsKt.m40718y4(collection, list2));
        }
        return arrayList;
    }

    @C12580l
    /* renamed from: b */
    public static final Catalog m156312b(@C12579k CatalogFullDetails catalogFullDetails) {
        Intrinsics.checkNotNullParameter(catalogFullDetails, "<this>");
        CatalogHeaderDetails g = catalogFullDetails.mo117135g();
        if (g == null) {
            return null;
        }
        return new Catalog(g.mo117173t(), g.mo117171r(), g.mo117177w(), g.mo117151F(), g.mo117149D(), g.mo117150E(), g.mo117147B(), g.mo117172s(), g.mo117146A(), g.mo117148C(), g.mo117179x(), g.mo117181z(), g.mo117180y(), g.mo117176v(), (String) null, 16384, (DefaultConstructorMarker) null);
    }
}
