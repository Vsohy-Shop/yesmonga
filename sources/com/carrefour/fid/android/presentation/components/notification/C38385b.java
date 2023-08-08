package com.carrefour.fid.android.presentation.components.notification;

import android.view.View;
import kotlin.jvm.functions.C11289a;

/* renamed from: com.carrefour.fid.android.presentation.components.notification.b */
public final /* synthetic */ class C38385b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationView f97199a;

    /* renamed from: b */
    public final /* synthetic */ C11289a f97200b;

    public /* synthetic */ C38385b(NotificationView notificationView, C11289a aVar) {
        this.f97199a = notificationView;
        this.f97200b = aVar;
    }

    public final void onClick(View view) {
        NotificationView.m158899C(this.f97199a, this.f97200b, view);
    }
}
