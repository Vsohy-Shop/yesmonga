package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.b1 */
public final class C36650b1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90591a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f90592b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f90593c;
    @C0359n0

    /* renamed from: d */
    public final WebView f90594d;

    public C36650b1(@C0359n0 LinearLayout linearLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout2, @C0359n0 WebView webView) {
        this.f90591a = linearLayout;
        this.f90592b = composeView;
        this.f90593c = linearLayout2;
        this.f90594d = webView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36650b1 m150329a(@C0359n0 View view) {
        int i = R.id.challenge_fid_header;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.challenge_fid_header);
        if (composeView != null) {
            i = R.id.challenge_fid_header_layout;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.challenge_fid_header_layout);
            if (linearLayout != null) {
                i = R.id.webViewChallengeFid;
                WebView webView = (WebView) C20753c.m96463a(view, R.id.webViewChallengeFid);
                if (webView != null) {
                    return new C36650b1((LinearLayout) view, composeView, linearLayout, webView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36650b1 m150330c(@C0359n0 LayoutInflater layoutInflater) {
        return m150331d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36650b1 m150331d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_challenge_fid, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150329a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90591a;
    }
}
