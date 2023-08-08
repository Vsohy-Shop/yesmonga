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

/* renamed from: com.carrefour.fid.android.databinding.n1 */
public final class C36770n1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91351a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91352b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91353c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91354d;
    @C0359n0

    /* renamed from: e */
    public final ConstraintLayout f91355e;

    public C36770n1(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 ImageView imageView, @C0359n0 TextView textView2, @C0359n0 ConstraintLayout constraintLayout2) {
        this.f91351a = constraintLayout;
        this.f91352b = textView;
        this.f91353c = imageView;
        this.f91354d = textView2;
        this.f91355e = constraintLayout2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36770n1 m150807a(@C0359n0 View view) {
        int i = R.id.fidTitle;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.fidTitle);
        if (textView != null) {
            i = R.id.fidView;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.fidView);
            if (imageView != null) {
                i = R.id.text_checkout_step_two_loyalty_secured_title;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_checkout_step_two_loyalty_secured_title);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new C36770n1(constraintLayout, textView, imageView, textView2, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36770n1 m150808c(@C0359n0 LayoutInflater layoutInflater) {
        return m150809d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36770n1 m150809d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_step_3_fidelity_secured, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150807a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91351a;
    }
}
