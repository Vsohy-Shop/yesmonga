package com.carrefour.fid.android.catalogs.utils;

import com.carrefour.fid.android.domain.models.catalog.details.CatalogDoublePage;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogPage;
import com.urbanairship.iam.C9259x;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCatalogsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogsHelper.kt\ncom/carrefour/fid/android/catalogs/utils/CatalogsHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,18:1\n1855#2,2:19\n*S KotlinDebug\n*F\n+ 1 CatalogsHelper.kt\ncom/carrefour/fid/android/catalogs/utils/CatalogsHelperKt\n*L\n8#1:19,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.utils.a */
public final class C39708a {
    @C12580l
    /* renamed from: a */
    public static final CatalogPage m162160a(@C12579k List<CatalogDoublePage> list, @C12579k String str) {
        String str2;
        CatalogDoublePage catalogDoublePage;
        String str3;
        Intrinsics.checkNotNullParameter(list, "listPages");
        Intrinsics.checkNotNullParameter(str, C9259x.f25239v);
        Iterator it = list.iterator();
        do {
            str2 = null;
            if (!it.hasNext()) {
                return null;
            }
            catalogDoublePage = (CatalogDoublePage) it.next();
            CatalogPage e = catalogDoublePage.mo117118e();
            if (e != null) {
                str3 = e.mo117193g();
            } else {
                str3 = null;
            }
            if (Intrinsics.areEqual((Object) str3, (Object) str)) {
                return catalogDoublePage.mo117118e();
            }
            CatalogPage f = catalogDoublePage.mo117120f();
            if (f != null) {
                str2 = f.mo117193g();
            }
        } while (!Intrinsics.areEqual((Object) str2, (Object) str));
        return catalogDoublePage.mo117120f();
    }
}
