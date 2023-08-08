package com.carrefour.fid.android.presentation.components.overlay;

import android.view.View;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25415d;

/* renamed from: com.carrefour.fid.android.presentation.components.overlay.b */
public final /* synthetic */ class C38389b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OverlayView f97210a;

    /* renamed from: b */
    public final /* synthetic */ OfferProductModel f97211b;

    /* renamed from: c */
    public final /* synthetic */ C25415d f97212c;

    public /* synthetic */ C38389b(OverlayView overlayView, OfferProductModel offerProductModel, C25415d dVar) {
        this.f97210a = overlayView;
        this.f97211b = offerProductModel;
        this.f97212c = dVar;
    }

    public final void onClick(View view) {
        OverlayView.m158913D(this.f97210a, this.f97211b, this.f97212c, view);
    }
}
