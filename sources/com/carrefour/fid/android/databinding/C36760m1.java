package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.m1 */
public final class C36760m1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91248a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91249b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91250c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f91251d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91252e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91253f;
    @C0359n0

    /* renamed from: g */
    public final ConstraintLayout f91254g;

    public C36760m1(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 ConstraintLayout constraintLayout2) {
        this.f91248a = constraintLayout;
        this.f91249b = textView;
        this.f91250c = imageView;
        this.f91251d = imageView2;
        this.f91252e = textView2;
        this.f91253f = textView3;
        this.f91254g = constraintLayout2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36760m1 m150767a(@C0359n0 View view) {
        int i = R.id.fidTitle;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.fidTitle);
        if (textView != null) {
            i = R.id.fidView;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.fidView);
            if (imageView != null) {
                i = R.id.imageView;
                ImageView imageView2 = (ImageView) C20753c.m96463a(view, R.id.imageView);
                if (imageView2 != null) {
                    i = R.id.text_checkout_step_two_card_fid_retry;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_checkout_step_two_card_fid_retry);
                    if (textView2 != null) {
                        i = R.id.text_checkout_step_two_error;
                        TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_checkout_step_two_error);
                        if (textView3 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            return new C36760m1(constraintLayout, textView, imageView, imageView2, textView2, textView3, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36760m1 m150768c(@C0359n0 LayoutInflater layoutInflater) {
        return m150769d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36760m1 m150769d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_step_3_card_fidelity_retry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150767a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91248a;
    }
}
