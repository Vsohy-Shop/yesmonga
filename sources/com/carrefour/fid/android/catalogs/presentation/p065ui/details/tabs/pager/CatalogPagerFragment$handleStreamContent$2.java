package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager;

import com.carrefour.fid.android.catalogs.presentation.p065ui.details.C39492c;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "it", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.CatalogPagerFragment$handleStreamContent$2 */
public final class CatalogPagerFragment$handleStreamContent$2 extends Lambda implements C11300l<CatalogProduct, C11079d2> {
    final /* synthetic */ CatalogPagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogPagerFragment$handleStreamContent$2(CatalogPagerFragment catalogPagerFragment) {
        super(1);
        this.this$0 = catalogPagerFragment;
    }

    /* renamed from: a */
    public final void mo130708a(@C12579k CatalogProduct catalogProduct) {
        Intrinsics.checkNotNullParameter(catalogProduct, "it");
        FragmentKt.m118823k(this.this$0, C39492c.f101005a.mo130654a(catalogProduct));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo130708a((CatalogProduct) obj);
        return C11079d2.f28267a;
    }
}
