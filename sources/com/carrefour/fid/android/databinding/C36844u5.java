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

/* renamed from: com.carrefour.fid.android.databinding.u5 */
public final class C36844u5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f91759a;
    @C0359n0

    /* renamed from: b */
    public final ShimmerFrameLayout f91760b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91761c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91762d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91763e;
    @C0359n0

    /* renamed from: f */
    public final RelativeLayout f91764f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91765g;

    public C36844u5(@C0359n0 View view, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 RelativeLayout relativeLayout, @C0359n0 TextView textView4) {
        this.f91759a = view;
        this.f91760b = shimmerFrameLayout;
        this.f91761c = textView;
        this.f91762d = textView2;
        this.f91763e = textView3;
        this.f91764f = relativeLayout;
        this.f91765g = textView4;
    }

    @C0359n0
    /* renamed from: a */
    public static C36844u5 m151097a(@C0359n0 View view) {
        int i = R.id.cagnotteShimmerContainer;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.cagnotteShimmerContainer);
        if (shimmerFrameLayout != null) {
            i = R.id.dateSolde;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.dateSolde);
            if (textView != null) {
                i = R.id.emptySoldeTextView;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.emptySoldeTextView);
                if (textView2 != null) {
                    i = R.id.errorCagnotteRetry;
                    TextView textView3 = (TextView) C20753c.m96463a(view, R.id.errorCagnotteRetry);
                    if (textView3 != null) {
                        i = R.id.soldeContainer;
                        RelativeLayout relativeLayout = (RelativeLayout) C20753c.m96463a(view, R.id.soldeContainer);
                        if (relativeLayout != null) {
                            i = R.id.soldeTextView;
                            TextView textView4 = (TextView) C20753c.m96463a(view, R.id.soldeTextView);
                            if (textView4 != null) {
                                return new C36844u5(view, shimmerFrameLayout, textView, textView2, textView3, relativeLayout, textView4);
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
    public static C36844u5 m151098b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.home_cagnotte_card_layout, viewGroup);
            return m151097a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f91759a;
    }
}
