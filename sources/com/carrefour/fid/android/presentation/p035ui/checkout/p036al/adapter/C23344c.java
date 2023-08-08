package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter;

import android.view.View;
import com.carrefour.fid.android.presentation.models.OfferProductModel;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.c */
public final /* synthetic */ class C23344c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ RecommendedProductViewHolder f59101a;

    /* renamed from: b */
    public final /* synthetic */ OfferProductModel f59102b;

    /* renamed from: c */
    public final /* synthetic */ int f59103c;

    public /* synthetic */ C23344c(RecommendedProductViewHolder recommendedProductViewHolder, OfferProductModel offerProductModel, int i) {
        this.f59101a = recommendedProductViewHolder;
        this.f59102b = offerProductModel;
        this.f59103c = i;
    }

    public final void onClick(View view) {
        RecommendedProductViewHolder.m104151i(this.f59101a, this.f59102b, this.f59103c, view);
    }
}
