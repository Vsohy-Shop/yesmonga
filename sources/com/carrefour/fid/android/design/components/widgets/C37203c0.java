package com.carrefour.fid.android.design.components.widgets;

import android.view.View;

/* renamed from: com.carrefour.fid.android.design.components.widgets.c0 */
public final /* synthetic */ class C37203c0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ View.OnClickListener f93314a;

    /* renamed from: b */
    public final /* synthetic */ MessageComponent f93315b;

    public /* synthetic */ C37203c0(View.OnClickListener onClickListener, MessageComponent messageComponent) {
        this.f93314a = onClickListener;
        this.f93315b = messageComponent;
    }

    public final void onClick(View view) {
        MessageComponent.m152359F(this.f93314a, this.f93315b, view);
    }
}
