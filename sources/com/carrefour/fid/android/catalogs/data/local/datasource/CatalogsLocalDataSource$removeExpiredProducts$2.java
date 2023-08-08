package com.carrefour.fid.android.catalogs.data.local.datasource;

import com.carrefour.fid.android.CatalogProduct;
import com.carrefour.fid.android.shared.util.C28932h;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/CatalogProduct;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lcom/carrefour/fid/android/CatalogProduct;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CatalogsLocalDataSource$removeExpiredProducts$2 extends Lambda implements C11300l<CatalogProduct, Boolean> {

    /* renamed from: f */
    public static final CatalogsLocalDataSource$removeExpiredProducts$2 f100777f = new CatalogsLocalDataSource$removeExpiredProducts$2();

    public CatalogsLocalDataSource$removeExpiredProducts$2() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(CatalogProduct catalogProduct) {
        String catalogEndData = catalogProduct.getCatalogEndData();
        Intrinsics.checkNotNullExpressionValue(catalogEndData, "it.catalogEndData");
        boolean z = true;
        if (!C11622t.isBlank(catalogEndData)) {
            C28932h.C28933a aVar = C28932h.f70914a;
            String catalogEndData2 = catalogProduct.getCatalogEndData();
            Intrinsics.checkNotNullExpressionValue(catalogEndData2, "it.catalogEndData");
            if (aVar.mo84235e(catalogEndData2)) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
