package com.usabilla.sdk.ubform.screenshot.annotation.paint;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.paint.b */
public final /* synthetic */ class C9903b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ UbPaintMenu f27190a;

    /* renamed from: b */
    public final /* synthetic */ C9900a f27191b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f27192c;

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f27193d;

    public /* synthetic */ C9903b(UbPaintMenu ubPaintMenu, C9900a aVar, ImageView imageView, ViewGroup viewGroup) {
        this.f27190a = ubPaintMenu;
        this.f27191b = aVar;
        this.f27192c = imageView;
        this.f27193d = viewGroup;
    }

    public final void onClick(View view) {
        UbPaintMenu.m37171g(this.f27190a, this.f27191b, this.f27192c, this.f27193d, view);
    }
}
