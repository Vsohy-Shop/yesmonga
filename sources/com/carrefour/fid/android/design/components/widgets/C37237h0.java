package com.carrefour.fid.android.design.components.widgets;

import android.view.View;

/* renamed from: com.carrefour.fid.android.design.components.widgets.h0 */
public final /* synthetic */ class C37237h0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ View.OnClickListener f93395a;

    /* renamed from: b */
    public final /* synthetic */ NotificationComponent f93396b;

    public /* synthetic */ C37237h0(View.OnClickListener onClickListener, NotificationComponent notificationComponent) {
        this.f93395a = onClickListener;
        this.f93396b = notificationComponent;
    }

    public final void onClick(View view) {
        NotificationComponent.m152406z(this.f93395a, this.f93396b, view);
    }
}
