package com.carrefour.fid.android.product.databinding;

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
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.product.C27609f;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.product.databinding.v */
public final class C27509v implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f66747a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f66748b;
    @C0359n0

    /* renamed from: c */
    public final NotificationComponent f66749c;
    @C0359n0

    /* renamed from: d */
    public final TextView f66750d;
    @C0359n0

    /* renamed from: e */
    public final ShimmerFrameLayout f66751e;

    public C27509v(@C0359n0 LinearLayout linearLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 NotificationComponent notificationComponent, @C0359n0 TextView textView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout) {
        this.f66747a = linearLayout;
        this.f66748b = recyclerView;
        this.f66749c = notificationComponent;
        this.f66750d = textView;
        this.f66751e = shimmerFrameLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C27509v m115755a(@C0359n0 View view) {
        int i = C27609f.C27619j.mixing_products_list_recyclerview;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
        if (recyclerView != null) {
            i = C27609f.C27619j.mixing_products_notification;
            NotificationComponent notificationComponent = (NotificationComponent) C20753c.m96463a(view, i);
            if (notificationComponent != null) {
                i = C27609f.C27619j.mixing_products_title_textview;
                TextView textView = (TextView) C20753c.m96463a(view, i);
                if (textView != null) {
                    i = C27609f.C27619j.product_list_loading;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, i);
                    if (shimmerFrameLayout != null) {
                        return new C27509v((LinearLayout) view, recyclerView, notificationComponent, textView, shimmerFrameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27509v m115756c(@C0359n0 LayoutInflater layoutInflater) {
        return m115757d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27509v m115757d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.mixing_products_bottom_sheet2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115755a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f66747a;
    }
}
