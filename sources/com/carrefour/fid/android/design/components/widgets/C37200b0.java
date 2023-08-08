package com.carrefour.fid.android.design.components.widgets;

import android.view.View;

/* renamed from: com.carrefour.fid.android.design.components.widgets.b0 */
public final /* synthetic */ class C37200b0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ View.OnClickListener f93310a;

    /* renamed from: b */
    public final /* synthetic */ MessageComponent f93311b;

    public /* synthetic */ C37200b0(View.OnClickListener onClickListener, MessageComponent messageComponent) {
        this.f93310a = onClickListener;
        this.f93311b = messageComponent;
    }

    public final void onClick(View view) {
        MessageComponent.m152358E(this.f93310a, this.f93311b, view);
    }
}
