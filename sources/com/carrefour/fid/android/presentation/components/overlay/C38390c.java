package com.carrefour.fid.android.presentation.components.overlay;

import android.view.View;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25415d;

/* renamed from: com.carrefour.fid.android.presentation.components.overlay.c */
public final /* synthetic */ class C38390c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OverlayView f97213a;

    /* renamed from: b */
    public final /* synthetic */ OfferProductModel f97214b;

    /* renamed from: c */
    public final /* synthetic */ C25415d f97215c;

    public /* synthetic */ C38390c(OverlayView overlayView, OfferProductModel offerProductModel, C25415d dVar) {
        this.f97213a = overlayView;
        this.f97214b = offerProductModel;
        this.f97215c = dVar;
    }

    public final void onClick(View view) {
        OverlayView.m158914E(this.f97213a, this.f97214b, this.f97215c, view);
    }
}
