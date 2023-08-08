package com.carrefour.fid.android.presentation.p035ui.product.filter.adapter;

import android.view.View;
import com.carrefour.fid.android.presentation.models.FacetModel;

/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.adapter.a */
public final /* synthetic */ class C25430a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FacetModel f62575a;

    /* renamed from: b */
    public final /* synthetic */ C25431b f62576b;

    /* renamed from: c */
    public final /* synthetic */ int f62577c;

    public /* synthetic */ C25430a(FacetModel facetModel, C25431b bVar, int i) {
        this.f62575a = facetModel;
        this.f62576b = bVar;
        this.f62577c = i;
    }

    public final void onClick(View view) {
        C25431b.m109773m(this.f62575a, this.f62576b, this.f62577c, view);
    }
}
