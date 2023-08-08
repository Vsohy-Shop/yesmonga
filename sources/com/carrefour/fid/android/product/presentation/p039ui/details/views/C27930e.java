package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import android.view.View;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.ProductFlagListView;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.e */
public final /* synthetic */ class C27930e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ProductFlagListView.C27921a f67755a;

    /* renamed from: b */
    public final /* synthetic */ OfferFlag f67756b;

    public /* synthetic */ C27930e(ProductFlagListView.C27921a aVar, OfferFlag offerFlag) {
        this.f67755a = aVar;
        this.f67756b = offerFlag;
    }

    public final void onClick(View view) {
        ProductFlagListView.m117233d(this.f67755a, this.f67756b, view);
    }
}
