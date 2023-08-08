package com.carrefour.fid.android.catalogs.presentation.p065ui.adapter;

import com.carrefour.fid.android.domain.models.catalog.Catalog;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.CatalogListAdapter$onBindViewHolder$1$1 */
public final class CatalogListAdapter$onBindViewHolder$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ int $position;
    final /* synthetic */ CatalogListAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogListAdapter$onBindViewHolder$1$1(CatalogListAdapter catalogListAdapter, int i) {
        super(0);
        this.this$0 = catalogListAdapter;
        this.$position = i;
    }

    public final void invoke() {
        C11300l<Catalog, C11079d2> k = this.this$0.mo130581k();
        if (k != null) {
            k.invoke(this.this$0.getList().get(this.$position));
        }
    }
}
