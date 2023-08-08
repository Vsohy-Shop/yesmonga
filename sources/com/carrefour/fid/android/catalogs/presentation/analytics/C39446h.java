package com.carrefour.fid.android.catalogs.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.extension.StringKt;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.analytics.h */
public final class C39446h {
    @C12579k

    /* renamed from: a */
    public final C13783a f100928a;

    @Inject
    public C39446h(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f100928a = aVar;
    }

    /* renamed from: a */
    public final void mo130533a(boolean z, @C12579k CatalogProduct catalogProduct) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(catalogProduct, "catalogProduct");
        C13783a aVar = this.f100928a;
        Pair[] pairArr = new Pair[10];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "catalogues");
        pairArr[2] = C11078d1.m42659a("screen_name", "page-catalogue-liste");
        if (z) {
            str = "add";
        } else {
            str = "remove";
        }
        pairArr[3] = C11078d1.m42659a("ecommerce_action", str);
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", "catalogues");
        pairArr[5] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        if (z) {
            str2 = C28526d.f68837M1;
        } else {
            str2 = C28526d.f68841N1;
        }
        pairArr[6] = C11078d1.m42659a(C28526d.f68933j, str2);
        pairArr[7] = C11078d1.m42659a("product_name", StringKt.m118908Q(catalogProduct.mo117243z()));
        pairArr[8] = C11078d1.m42659a("product_EAN", catalogProduct.mo117238v());
        pairArr[9] = C11078d1.m42659a(C28526d.f68907d0, catalogProduct.mo117209B());
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }
}
