package com.carrefour.fid.android.product.presentation.p039ui.details;

import android.view.View;
import com.carrefour.fid.android.domain.models.offer.Offer;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.c */
public final /* synthetic */ class C27802c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ProductDetailsFragment f67392a;

    /* renamed from: b */
    public final /* synthetic */ Offer f67393b;

    public /* synthetic */ C27802c(ProductDetailsFragment productDetailsFragment, Offer offer) {
        this.f67392a = productDetailsFragment;
        this.f67393b = offer;
    }

    public final void onClick(View view) {
        ProductDetailsFragment.m116580O1(this.f67392a, this.f67393b, view);
    }
}
