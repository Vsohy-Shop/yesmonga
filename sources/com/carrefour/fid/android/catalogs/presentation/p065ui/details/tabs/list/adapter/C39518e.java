package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.adapter;

import android.view.View;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.C39513a;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.list.adapter.e */
public final /* synthetic */ class C39518e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ boolean f101038a;

    /* renamed from: b */
    public final /* synthetic */ C39513a f101039b;

    /* renamed from: c */
    public final /* synthetic */ CatalogProduct f101040c;

    public /* synthetic */ C39518e(boolean z, C39513a aVar, CatalogProduct catalogProduct) {
        this.f101038a = z;
        this.f101039b = aVar;
        this.f101040c = catalogProduct;
    }

    public final void onClick(View view) {
        C39520g.m161815i(this.f101038a, this.f101039b, this.f101040c, view);
    }
}
