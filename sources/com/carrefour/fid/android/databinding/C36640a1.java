package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.a1 */
public final class C36640a1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90542a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f90543b;
    @C0359n0

    /* renamed from: c */
    public final TextView f90544c;
    @C0359n0

    /* renamed from: d */
    public final Button f90545d;
    @C0359n0

    /* renamed from: e */
    public final ProgressBar f90546e;
    @C0359n0

    /* renamed from: f */
    public final TextView f90547f;
    @C0359n0

    /* renamed from: g */
    public final TextView f90548g;

    public C36640a1(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 Button button, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f90542a = constraintLayout;
        this.f90543b = imageView;
        this.f90544c = textView;
        this.f90545d = button;
        this.f90546e = progressBar;
        this.f90547f = textView2;
        this.f90548g = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36640a1 m150289a(@C0359n0 View view) {
        int i = R.id.blockedCardFid;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.blockedCardFid);
        if (imageView != null) {
            i = R.id.blockedCardFidTitle;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.blockedCardFidTitle);
            if (textView != null) {
                i = R.id.blockedCardInitSecretCode;
                Button button = (Button) C20753c.m96463a(view, R.id.blockedCardInitSecretCode);
                if (button != null) {
                    i = R.id.blockedCardProgressBar;
                    ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.blockedCardProgressBar);
                    if (progressBar != null) {
                        i = R.id.blockedCardSubTitle;
                        TextView textView2 = (TextView) C20753c.m96463a(view, R.id.blockedCardSubTitle);
                        if (textView2 != null) {
                            i = R.id.blockedCardTryLater;
                            TextView textView3 = (TextView) C20753c.m96463a(view, R.id.blockedCardTryLater);
                            if (textView3 != null) {
                                return new C36640a1((ConstraintLayout) view, imageView, textView, button, progressBar, textView2, textView3);
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
    public static C36640a1 m150290c(@C0359n0 LayoutInflater layoutInflater) {
        return m150291d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36640a1 m150291d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_blocked_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150289a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90542a;
    }
}
