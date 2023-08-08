package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.v1 */
public final class C36850v1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91788a;
    @C0359n0

    /* renamed from: b */
    public final NotificationComponent f91789b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91790c;
    @C0359n0

    /* renamed from: d */
    public final RecyclerView f91791d;
    @C0359n0

    /* renamed from: e */
    public final NotificationComponent f91792e;
    @C0359n0

    /* renamed from: f */
    public final ShimmerFrameLayout f91793f;

    public C36850v1(@C0359n0 LinearLayout linearLayout, @C0359n0 NotificationComponent notificationComponent, @C0359n0 TextView textView, @C0359n0 RecyclerView recyclerView, @C0359n0 NotificationComponent notificationComponent2, @C0359n0 ShimmerFrameLayout shimmerFrameLayout) {
        this.f91788a = linearLayout;
        this.f91789b = notificationComponent;
        this.f91790c = textView;
        this.f91791d = recyclerView;
        this.f91792e = notificationComponent2;
        this.f91793f = shimmerFrameLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C36850v1 m151117a(@C0359n0 View view) {
        int i = R.id.overlay_coupon_description_notification;
        NotificationComponent notificationComponent = (NotificationComponent) C20753c.m96463a(view, R.id.overlay_coupon_description_notification);
        if (notificationComponent != null) {
            i = R.id.overlay_coupon_title_textview;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.overlay_coupon_title_textview);
            if (textView != null) {
                i = R.id.overlay_products_list_recyclerview;
                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.overlay_products_list_recyclerview);
                if (recyclerView != null) {
                    i = R.id.overlay_products_notification;
                    NotificationComponent notificationComponent2 = (NotificationComponent) C20753c.m96463a(view, R.id.overlay_products_notification);
                    if (notificationComponent2 != null) {
                        i = R.id.overlay_products_shimmer;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.overlay_products_shimmer);
                        if (shimmerFrameLayout != null) {
                            return new C36850v1((LinearLayout) view, notificationComponent, textView, recyclerView, notificationComponent2, shimmerFrameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36850v1 m151118c(@C0359n0 LayoutInflater layoutInflater) {
        return m151119d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36850v1 m151119d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_coupon_products_overlay_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151117a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91788a;
    }
}
