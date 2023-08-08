package com.carrefour.fid.android.catalogs.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.catalogs.core.type.CatalogStoreFormat;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28562m;
import com.carrefour.fid.android.shared.constant.C28565n;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.usabilla.sdk.ubform.net.C9851c;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.analytics.d */
public final class C39441d {
    @C12579k

    /* renamed from: a */
    public final C13783a f100921a;

    @Inject
    public C39441d(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f100921a = aVar;
    }

    /* renamed from: a */
    public final void mo130525a(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        String str6;
        Intrinsics.checkNotNullParameter(str, "catalogID");
        Intrinsics.checkNotNullParameter(str2, "opKey");
        Intrinsics.checkNotNullParameter(str3, "catalogVersion");
        Intrinsics.checkNotNullParameter(str4, "storeFormat");
        Intrinsics.checkNotNullParameter(str5, "pageNumber");
        if (Intrinsics.areEqual((Object) str4, (Object) CatalogStoreFormat.HYPER.mo130269q())) {
            str6 = "hyper";
        } else {
            str6 = StringKt.m118908Q(str4);
        }
        String replace$default = C11622t.replace$default(StringKt.m118908Q(str3), C9851c.f26937h, "", false, 4, (Object) null);
        String a = C28565n.C28566a.f69612a.mo83493a(str5);
        C13783a.m58667i(this.f100921a, "catalogues", "page-catalogue", C10977s0.m41456W(C11078d1.m42659a("catalogue_op_key", str2), C11078d1.m42659a("catalogue_id", str), C11078d1.m42659a("catalogue_version", replace$default), C11078d1.m42659a("catalogue_store_fomat", str6), C11078d1.m42659a("catalogue_page_number", a)), false, false, false, 56, (Object) null);
    }

    /* renamed from: b */
    public final void mo130526b(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        String str6;
        Intrinsics.checkNotNullParameter(str, "catalogID");
        Intrinsics.checkNotNullParameter(str2, "opKey");
        Intrinsics.checkNotNullParameter(str3, "catalogVersion");
        Intrinsics.checkNotNullParameter(str4, "storeFormat");
        Intrinsics.checkNotNullParameter(str5, "catalogName");
        if (Intrinsics.areEqual((Object) str4, (Object) CatalogStoreFormat.HYPER.mo130269q())) {
            str6 = "hyper";
        } else {
            str6 = StringKt.m118908Q(str4);
        }
        String replace$default = C11622t.replace$default(StringKt.m118908Q(str3), C9851c.f26937h, "", false, 4, (Object) null);
        C13783a.m58667i(this.f100921a, "catalogues", "page-catalogue-liste", C10977s0.m41456W(C11078d1.m42659a("catalogue_op_key", str2), C11078d1.m42659a("catalogue_id", str), C11078d1.m42659a("catalogue_version", replace$default), C11078d1.m42659a("catalogue_store_fomat", str6), C11078d1.m42659a("catalogue_name", StringKt.m118908Q(str5))), false, false, false, 56, (Object) null);
    }

    /* renamed from: c */
    public final void mo130527c(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "opKey");
        Intrinsics.checkNotNullParameter(str2, "catalogId");
        Intrinsics.checkNotNullParameter(str3, "catalogName");
        C13783a.m58668o(this.f100921a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "catalogues"), C11078d1.m42659a("screen_name", "page-catalogue-liste"), C11078d1.m42659a(C28526d.f68929i, "catalogues"), C11078d1.m42659a(C28526d.f68933j, C28562m.f69548o), C11078d1.m42659a("catalogue_op_key", str), C11078d1.m42659a("catalogue_id", str2), C11078d1.m42659a("catalogue_name", StringKt.m118908Q(str3))), false, 2, (Object) null);
    }

    /* renamed from: d */
    public final void mo130528d(boolean z, @C12579k CatalogProduct catalogProduct, @C12579k String str) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(catalogProduct, "catalogProduct");
        Intrinsics.checkNotNullParameter(str, "opKey");
        C13783a aVar = this.f100921a;
        Pair[] pairArr = new Pair[11];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "catalogues");
        pairArr[2] = C11078d1.m42659a("screen_name", "page-catalogue-liste");
        if (z) {
            str2 = "add";
        } else {
            str2 = "remove";
        }
        pairArr[3] = C11078d1.m42659a("ecommerce_action", str2);
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", "catalogues");
        pairArr[5] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        if (z) {
            str3 = C28526d.f68837M1;
        } else {
            str3 = C28526d.f68841N1;
        }
        pairArr[6] = C11078d1.m42659a(C28526d.f68933j, str3);
        pairArr[7] = C11078d1.m42659a("catalogue_op_key", str);
        pairArr[8] = C11078d1.m42659a("product_name", StringKt.m118908Q(catalogProduct.mo117243z()));
        pairArr[9] = C11078d1.m42659a("product_EAN", catalogProduct.mo117238v());
        pairArr[10] = C11078d1.m42659a(C28526d.f68907d0, catalogProduct.mo117209B());
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }
}
