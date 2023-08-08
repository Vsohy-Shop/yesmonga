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

/* renamed from: com.carrefour.fid.android.databinding.s6 */
public final class C36825s6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91636a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f91637b;
    @C0359n0

    /* renamed from: c */
    public final NotificationComponent f91638c;
    @C0359n0

    /* renamed from: d */
    public final ShimmerFrameLayout f91639d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91640e;

    public C36825s6(@C0359n0 LinearLayout linearLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 NotificationComponent notificationComponent, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 TextView textView) {
        this.f91636a = linearLayout;
        this.f91637b = recyclerView;
        this.f91638c = notificationComponent;
        this.f91639d = shimmerFrameLayout;
        this.f91640e = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36825s6 m151021a(@C0359n0 View view) {
        int i = R.id.mixing_products_list_recyclerview;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.mixing_products_list_recyclerview);
        if (recyclerView != null) {
            i = R.id.mixing_products_notification;
            NotificationComponent notificationComponent = (NotificationComponent) C20753c.m96463a(view, R.id.mixing_products_notification);
            if (notificationComponent != null) {
                i = R.id.mixing_products_shimmer;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.mixing_products_shimmer);
                if (shimmerFrameLayout != null) {
                    i = R.id.mixing_products_title_textview;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.mixing_products_title_textview);
                    if (textView != null) {
                        return new C36825s6((LinearLayout) view, recyclerView, notificationComponent, shimmerFrameLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36825s6 m151022c(@C0359n0 LayoutInflater layoutInflater) {
        return m151023d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36825s6 m151023d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mixing_products_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151021a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91636a;
    }
}
