package com.carrefour.fid.android.presentation.components.image;

import android.view.View;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.presentation.components.image.OfferFlagListView;

/* renamed from: com.carrefour.fid.android.presentation.components.image.a */
public final /* synthetic */ class C38374a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OfferFlagListView.C38373a f97172a;

    /* renamed from: b */
    public final /* synthetic */ OfferFlag f97173b;

    public /* synthetic */ C38374a(OfferFlagListView.C38373a aVar, OfferFlag offerFlag) {
        this.f97172a = aVar;
        this.f97173b = offerFlag;
    }

    public final void onClick(View view) {
        OfferFlagListView.m158881d(this.f97172a, this.f97173b, view);
    }
}
