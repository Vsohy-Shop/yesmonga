package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.w5 */
public final class C36864w5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f91856a;
    @C0359n0

    /* renamed from: b */
    public final ShimmerFrameLayout f91857b;
    @C0359n0

    /* renamed from: c */
    public final RelativeLayout f91858c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91859d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91860e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91861f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91862g;

    public C36864w5(@C0359n0 View view, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 RelativeLayout relativeLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4) {
        this.f91856a = view;
        this.f91857b = shimmerFrameLayout;
        this.f91858c = relativeLayout;
        this.f91859d = textView;
        this.f91860e = textView2;
        this.f91861f = textView3;
        this.f91862g = textView4;
    }

    @C0359n0
    /* renamed from: a */
    public static C36864w5 m151173a(@C0359n0 View view) {
        int i = R.id.cagnotteShimmerContainer;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.cagnotteShimmerContainer);
        if (shimmerFrameLayout != null) {
            i = R.id.couponNumberContainer;
            RelativeLayout relativeLayout = (RelativeLayout) C20753c.m96463a(view, R.id.couponNumberContainer);
            if (relativeLayout != null) {
                i = R.id.dateSolde;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.dateSolde);
                if (textView != null) {
                    i = R.id.emptyCouponTextView;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.emptyCouponTextView);
                    if (textView2 != null) {
                        i = R.id.errorCouponRetry;
                        TextView textView3 = (TextView) C20753c.m96463a(view, R.id.errorCouponRetry);
                        if (textView3 != null) {
                            i = R.id.numberOfCoupon;
                            TextView textView4 = (TextView) C20753c.m96463a(view, R.id.numberOfCoupon);
                            if (textView4 != null) {
                                return new C36864w5(view, shimmerFrameLayout, relativeLayout, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C36864w5 m151174b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.home_coupon_card_layout, viewGroup);
            return m151173a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f91856a;
    }
}
