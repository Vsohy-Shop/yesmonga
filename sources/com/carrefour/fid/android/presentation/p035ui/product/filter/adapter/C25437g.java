package com.carrefour.fid.android.presentation.p035ui.product.filter.adapter;

import android.view.View;
import com.carrefour.fid.android.presentation.models.SortModel;

/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.adapter.g */
public final /* synthetic */ class C25437g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ProductListFiltersSortAdapter f62591a;

    /* renamed from: b */
    public final /* synthetic */ SortModel f62592b;

    public /* synthetic */ C25437g(ProductListFiltersSortAdapter productListFiltersSortAdapter, SortModel sortModel) {
        this.f62591a = productListFiltersSortAdapter;
        this.f62592b = sortModel;
    }

    public final void onClick(View view) {
        ProductListFiltersSortAdapter.m109765n(this.f62591a, this.f62592b, view);
    }
}
