package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.view.View;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.c */
public final /* synthetic */ class C25113c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CheckoutConfirmationFragment f61911a;

    /* renamed from: b */
    public final /* synthetic */ OrderConfirmationModel f61912b;

    public /* synthetic */ C25113c(CheckoutConfirmationFragment checkoutConfirmationFragment, OrderConfirmationModel orderConfirmationModel) {
        this.f61911a = checkoutConfirmationFragment;
        this.f61912b = orderConfirmationModel;
    }

    public final void onClick(View view) {
        CheckoutConfirmationFragment.m108464A1(this.f61911a, this.f61912b, view);
    }
}
