package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.k */
public final class C36738k implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91102a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91103b;
    @C0359n0

    /* renamed from: c */
    public final ProgressBar f91104c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91105d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91106e;

    public C36738k(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91102a = constraintLayout;
        this.f91103b = imageView;
        this.f91104c = progressBar;
        this.f91105d = textView;
        this.f91106e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36738k m150679a(@C0359n0 View view) {
        int i = R.id.imgChannel;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.imgChannel);
        if (imageView != null) {
            i = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.progressBar);
            if (progressBar != null) {
                i = R.id.txtTypeChannel;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.txtTypeChannel);
                if (textView != null) {
                    i = R.id.txtValueChannel;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.txtValueChannel);
                    if (textView2 != null) {
                        return new C36738k((ConstraintLayout) view, imageView, progressBar, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36738k m150680c(@C0359n0 LayoutInflater layoutInflater) {
        return m150681d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36738k m150681d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.channel_card_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150679a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91102a;
    }
}
