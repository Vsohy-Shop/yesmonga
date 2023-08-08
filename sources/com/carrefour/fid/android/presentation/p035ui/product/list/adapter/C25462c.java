package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import android.view.View;
import com.carrefour.fid.android.presentation.models.CriteoButterFlyModel;

/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.c */
public final /* synthetic */ class C25462c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CriteoButterflyViewHolder f62681a;

    /* renamed from: b */
    public final /* synthetic */ CriteoButterFlyModel f62682b;

    public /* synthetic */ C25462c(CriteoButterflyViewHolder criteoButterflyViewHolder, CriteoButterFlyModel criteoButterFlyModel) {
        this.f62681a = criteoButterflyViewHolder;
        this.f62682b = criteoButterFlyModel;
    }

    public final void onClick(View view) {
        CriteoButterflyViewHolder.m109811g(this.f62681a, this.f62682b, view);
    }
}
