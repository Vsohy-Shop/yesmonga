package com.carrefour.fid.android.catalogs.presentation.p065ui.adapter;

import com.carrefour.fid.android.catalogs.presentation.models.C39455h;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "it", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/domain/models/catalog/Catalog;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.StoreCatalogListViewHolder$bind$1 */
public final class StoreCatalogListViewHolder$bind$1 extends Lambda implements C11300l<Catalog, C11079d2> {
    final /* synthetic */ C39455h $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreCatalogListViewHolder$bind$1(C39455h hVar) {
        super(1);
        this.$model = hVar;
    }

    /* renamed from: a */
    public final void mo130594a(@C12579k Catalog catalog) {
        Intrinsics.checkNotNullParameter(catalog, "it");
        C11300l<Catalog, C11079d2> b = this.$model.mo130554b();
        if (b != null) {
            b.invoke(catalog);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo130594a((Catalog) obj);
        return C11079d2.f28267a;
    }
}
