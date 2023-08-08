package com.carrefour.fid.android.checkout.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.checkout.C39805b;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;

/* renamed from: com.carrefour.fid.android.checkout.databinding.e */
public final class C39845e implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f101638a;
    @C0359n0

    /* renamed from: b */
    public final NotificationComponent f101639b;

    public C39845e(@C0359n0 FrameLayout frameLayout, @C0359n0 NotificationComponent notificationComponent) {
        this.f101638a = frameLayout;
        this.f101639b = notificationComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C39845e m162445a(@C0359n0 View view) {
        int i = C39805b.C39815j.holder_service_slot_header_notification;
        NotificationComponent notificationComponent = (NotificationComponent) C20753c.m96463a(view, i);
        if (notificationComponent != null) {
            return new C39845e((FrameLayout) view, notificationComponent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39845e m162446c(@C0359n0 LayoutInflater layoutInflater) {
        return m162447d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39845e m162447d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39805b.C39818m.holder_service_slot_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m162445a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f101638a;
    }
}
