package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.w1 */
public final class C36860w1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91834a;
    @C0359n0

    /* renamed from: b */
    public final ShimmerFrameLayout f91835b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f91836c;
    @C0359n0

    /* renamed from: d */
    public final LinearLayout f91837d;
    @C0359n0

    /* renamed from: e */
    public final RecyclerView f91838e;

    public C36860w1(@C0359n0 LinearLayout linearLayout, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout2, @C0359n0 RecyclerView recyclerView) {
        this.f91834a = linearLayout;
        this.f91835b = shimmerFrameLayout;
        this.f91836c = composeView;
        this.f91837d = linearLayout2;
        this.f91838e = recyclerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36860w1 m151157a(@C0359n0 View view) {
        int i = R.id.couponShimmerViewContainer;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.couponShimmerViewContainer);
        if (shimmerFrameLayout != null) {
            i = R.id.coupons_barcodes_header;
            ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.coupons_barcodes_header);
            if (composeView != null) {
                i = R.id.coupons_barcodes_header_layout;
                LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.coupons_barcodes_header_layout);
                if (linearLayout != null) {
                    i = R.id.showBarcodesRecyclerView;
                    RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.showBarcodesRecyclerView);
                    if (recyclerView != null) {
                        return new C36860w1((LinearLayout) view, shimmerFrameLayout, composeView, linearLayout, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36860w1 m151158c(@C0359n0 LayoutInflater layoutInflater) {
        return m151159d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36860w1 m151159d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_coupon_show_barcodes, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151157a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91834a;
    }
}
