package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.adapter;

import android.view.View;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.C39513a;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.list.adapter.f */
public final /* synthetic */ class C39519f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C39513a f101041a;

    /* renamed from: b */
    public final /* synthetic */ CatalogProduct f101042b;

    public /* synthetic */ C39519f(C39513a aVar, CatalogProduct catalogProduct) {
        this.f101041a = aVar;
        this.f101042b = catalogProduct;
    }

    public final void onClick(View view) {
        C39520g.m161816j(this.f101041a, this.f101042b, view);
    }
}
