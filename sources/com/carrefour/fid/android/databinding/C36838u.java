package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.u */
public final class C36838u implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91717a;
    @C0359n0

    /* renamed from: b */
    public final Group f91718b;
    @C0359n0

    /* renamed from: c */
    public final WebView f91719c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91720d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91721e;
    @C0359n0

    /* renamed from: f */
    public final ImageButton f91722f;
    @C0359n0

    /* renamed from: g */
    public final ShimmerFrameLayout f91723g;
    @C0359n0

    /* renamed from: h */
    public final Button f91724h;
    @C0359n0

    /* renamed from: i */
    public final Button f91725i;

    public C36838u(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Group group, @C0359n0 WebView webView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 ImageButton imageButton, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 Button button, @C0359n0 Button button2) {
        this.f91717a = constraintLayout;
        this.f91718b = group;
        this.f91719c = webView;
        this.f91720d = textView;
        this.f91721e = textView2;
        this.f91722f = imageButton;
        this.f91723g = shimmerFrameLayout;
        this.f91724h = button;
        this.f91725i = button2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36838u m151073a(@C0359n0 View view) {
        int i = R.id.groupContent;
        Group group = (Group) C20753c.m96463a(view, R.id.groupContent);
        if (group != null) {
            i = R.id.loyaltyCguContent;
            WebView webView = (WebView) C20753c.m96463a(view, R.id.loyaltyCguContent);
            if (webView != null) {
                i = R.id.loyaltyCguDescription;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.loyaltyCguDescription);
                if (textView != null) {
                    i = R.id.loyaltyCguTitle;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.loyaltyCguTitle);
                    if (textView2 != null) {
                        i = R.id.loyaltyIvGoToBottom;
                        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, R.id.loyaltyIvGoToBottom);
                        if (imageButton != null) {
                            i = R.id.loyaltyShimmerContent;
                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.loyaltyShimmerContent);
                            if (shimmerFrameLayout != null) {
                                i = R.id.tvAcceptCgu;
                                Button button = (Button) C20753c.m96463a(view, R.id.tvAcceptCgu);
                                if (button != null) {
                                    i = R.id.tvCancelCgu;
                                    Button button2 = (Button) C20753c.m96463a(view, R.id.tvCancelCgu);
                                    if (button2 != null) {
                                        return new C36838u((ConstraintLayout) view, group, webView, textView, textView2, imageButton, shimmerFrameLayout, button, button2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36838u m151074c(@C0359n0 LayoutInflater layoutInflater) {
        return m151075d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36838u m151075d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_accept_loyality_cgu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151073a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91717a;
    }
}
