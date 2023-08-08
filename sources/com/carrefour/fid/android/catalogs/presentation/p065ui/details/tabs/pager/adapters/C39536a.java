package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager.adapters;

import android.view.MotionEvent;
import android.view.View;
import com.ortiz.touchview.TouchImageView;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.adapters.a */
public final /* synthetic */ class C39536a implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ TouchImageView f101068a;

    public /* synthetic */ C39536a(TouchImageView touchImageView) {
        this.f101068a = touchImageView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return CatalogPageAdapter.m161842p(this.f101068a, view, motionEvent);
    }
}
