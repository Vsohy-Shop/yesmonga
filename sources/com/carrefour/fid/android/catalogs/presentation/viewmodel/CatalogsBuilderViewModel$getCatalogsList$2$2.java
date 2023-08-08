package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39675d;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "catalog", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/domain/models/catalog/Catalog;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CatalogsBuilderViewModel$getCatalogsList$2$2 extends Lambda implements C11300l<Catalog, C11079d2> {
    final /* synthetic */ CatalogsBuilderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogsBuilderViewModel$getCatalogsList$2$2(CatalogsBuilderViewModel catalogsBuilderViewModel) {
        super(1);
        this.this$0 = catalogsBuilderViewModel;
    }

    /* renamed from: a */
    public final void mo130853a(@C12579k Catalog catalog) {
        Intrinsics.checkNotNullParameter(catalog, "catalog");
        this.this$0.emitEvent(new C39675d.C39676a.C39679c(catalog));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo130853a((Catalog) obj);
        return C11079d2.f28267a;
    }
}
