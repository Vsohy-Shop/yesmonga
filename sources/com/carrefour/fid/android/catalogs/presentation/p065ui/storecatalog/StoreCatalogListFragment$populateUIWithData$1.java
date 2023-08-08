package com.carrefour.fid.android.catalogs.presentation.p065ui.storecatalog;

import com.carrefour.fid.android.domain.models.catalog.Catalog;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "it", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/domain/models/catalog/Catalog;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.storecatalog.StoreCatalogListFragment$populateUIWithData$1 */
public final class StoreCatalogListFragment$populateUIWithData$1 extends Lambda implements C11300l<Catalog, C11079d2> {
    final /* synthetic */ StoreCatalogListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreCatalogListFragment$populateUIWithData$1(StoreCatalogListFragment storeCatalogListFragment) {
        super(1);
        this.this$0 = storeCatalogListFragment;
    }

    /* renamed from: a */
    public final void mo130810a(@C12579k Catalog catalog) {
        Intrinsics.checkNotNullParameter(catalog, "it");
        C11300l<Catalog, C11079d2> X0 = this.this$0.mo130793X0();
        if (X0 != null) {
            X0.invoke(catalog);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo130810a((Catalog) obj);
        return C11079d2.f28267a;
    }
}
