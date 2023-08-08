package com.carrefour.fid.android.design.components.widgets;

import android.view.View;

/* renamed from: com.carrefour.fid.android.design.components.widgets.a0 */
public final /* synthetic */ class C37188a0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ View.OnClickListener f93283a;

    /* renamed from: b */
    public final /* synthetic */ MessageComponent f93284b;

    public /* synthetic */ C37188a0(View.OnClickListener onClickListener, MessageComponent messageComponent) {
        this.f93283a = onClickListener;
        this.f93284b = messageComponent;
    }

    public final void onClick(View view) {
        MessageComponent.m152357D(this.f93283a, this.f93284b, view);
    }
}
