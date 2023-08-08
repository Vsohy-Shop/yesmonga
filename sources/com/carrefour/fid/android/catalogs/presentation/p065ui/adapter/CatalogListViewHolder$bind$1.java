package com.carrefour.fid.android.catalogs.presentation.p065ui.adapter;

import com.carrefour.fid.android.catalogs.presentation.models.C39448a;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "it", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/domain/models/catalog/Catalog;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.CatalogListViewHolder$bind$1 */
public final class CatalogListViewHolder$bind$1 extends Lambda implements C11300l<Catalog, C11079d2> {
    final /* synthetic */ C39448a $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogListViewHolder$bind$1(C39448a aVar) {
        super(1);
        this.$model = aVar;
    }

    /* renamed from: a */
    public final void mo130587a(@C12579k Catalog catalog) {
        Intrinsics.checkNotNullParameter(catalog, "it");
        C11300l<Catalog, C11079d2> c = this.$model.mo130537c();
        if (c != null) {
            c.invoke(catalog);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo130587a((Catalog) obj);
        return C11079d2.f28267a;
    }
}
