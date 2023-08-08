package com.carrefour.fid.android.design.components.widgets;

import android.view.View;

/* renamed from: com.carrefour.fid.android.design.components.widgets.i0 */
public final /* synthetic */ class C37240i0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ View.OnClickListener f93399a;

    /* renamed from: b */
    public final /* synthetic */ NotificationComponent f93400b;

    public /* synthetic */ C37240i0(View.OnClickListener onClickListener, NotificationComponent notificationComponent) {
        this.f93399a = onClickListener;
        this.f93400b = notificationComponent;
    }

    public final void onClick(View view) {
        NotificationComponent.m152403A(this.f93399a, this.f93400b, view);
    }
}
