package com.usabilla.sdk.ubform.screenshot.annotation;

import android.view.View;
import android.widget.ImageView;

/* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.g */
public final /* synthetic */ class C9897g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ UbAnnotationView f27157a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f27158b;

    /* renamed from: c */
    public final /* synthetic */ C9893d f27159c;

    public /* synthetic */ C9897g(UbAnnotationView ubAnnotationView, ImageView imageView, C9893d dVar) {
        this.f27157a = ubAnnotationView;
        this.f27158b = imageView;
        this.f27159c = dVar;
    }

    public final void onClick(View view) {
        UbAnnotationView.m37082l(this.f27157a, this.f27158b, this.f27159c, view);
    }
}
