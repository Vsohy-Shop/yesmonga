package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import android.view.View;
import com.carrefour.fid.android.presentation.models.OfferProductModel;

/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.j */
public final /* synthetic */ class C25472j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OfferProductViewHolder f62701a;

    /* renamed from: b */
    public final /* synthetic */ OfferProductModel f62702b;

    /* renamed from: c */
    public final /* synthetic */ int f62703c;

    public /* synthetic */ C25472j(OfferProductViewHolder offerProductViewHolder, OfferProductModel offerProductModel, int i) {
        this.f62701a = offerProductViewHolder;
        this.f62702b = offerProductModel;
        this.f62703c = i;
    }

    public final void onClick(View view) {
        OfferProductViewHolder.m109866k(this.f62701a, this.f62702b, this.f62703c, view);
    }
}
