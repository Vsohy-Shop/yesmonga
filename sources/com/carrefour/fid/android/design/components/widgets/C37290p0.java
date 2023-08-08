package com.carrefour.fid.android.design.components.widgets;

import android.view.View;
import kotlin.jvm.functions.C11289a;

/* renamed from: com.carrefour.fid.android.design.components.widgets.p0 */
public final /* synthetic */ class C37290p0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C11289a f93532a;

    /* renamed from: b */
    public final /* synthetic */ boolean f93533b;

    /* renamed from: c */
    public final /* synthetic */ ProductOverlayComponent f93534c;

    public /* synthetic */ C37290p0(C11289a aVar, boolean z, ProductOverlayComponent productOverlayComponent) {
        this.f93532a = aVar;
        this.f93533b = z;
        this.f93534c = productOverlayComponent;
    }

    public final void onClick(View view) {
        ProductOverlayComponent.m152472F(this.f93532a, this.f93533b, this.f93534c, view);
    }
}
