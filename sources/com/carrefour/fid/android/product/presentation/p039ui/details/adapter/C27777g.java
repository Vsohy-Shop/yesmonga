package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ortiz.touchview.TouchImageView;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.g */
public final /* synthetic */ class C27777g implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ TouchImageView f67350a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f67351b;

    public /* synthetic */ C27777g(TouchImageView touchImageView, ViewGroup viewGroup) {
        this.f67350a = touchImageView;
        this.f67351b = viewGroup;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return C27778h.m116725o(this.f67350a, this.f67351b, view, motionEvent);
    }
}
