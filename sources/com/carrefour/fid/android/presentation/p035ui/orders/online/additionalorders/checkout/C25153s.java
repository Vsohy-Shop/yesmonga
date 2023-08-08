package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.view.View;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.s */
public final /* synthetic */ class C25153s implements View.OnScrollChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f61983a;

    /* renamed from: b */
    public final /* synthetic */ CheckoutStepOneAdditionalOrderFragment f61984b;

    public /* synthetic */ C25153s(int i, CheckoutStepOneAdditionalOrderFragment checkoutStepOneAdditionalOrderFragment) {
        this.f61983a = i;
        this.f61984b = checkoutStepOneAdditionalOrderFragment;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        CheckoutStepOneAdditionalOrderFragment.m108573o1(this.f61983a, this.f61984b, view, i, i2, i3, i4);
    }
}
