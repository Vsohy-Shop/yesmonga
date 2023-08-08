package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import android.view.View;
import com.carrefour.fid.android.presentation.models.CriteoFlagshipModel;

/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.d */
public final /* synthetic */ class C25463d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CriteoFlagshipViewHolder f62683a;

    /* renamed from: b */
    public final /* synthetic */ CriteoFlagshipModel f62684b;

    public /* synthetic */ C25463d(CriteoFlagshipViewHolder criteoFlagshipViewHolder, CriteoFlagshipModel criteoFlagshipModel) {
        this.f62683a = criteoFlagshipViewHolder;
        this.f62684b = criteoFlagshipModel;
    }

    public final void onClick(View view) {
        CriteoFlagshipViewHolder.m109823g(this.f62683a, this.f62684b, view);
    }
}
