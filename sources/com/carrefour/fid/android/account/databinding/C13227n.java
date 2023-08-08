package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.account.C13144b;

/* renamed from: com.carrefour.fid.android.account.databinding.n */
public final class C13227n implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f32539a;
    @C0359n0

    /* renamed from: b */
    public final TextView f32540b;
    @C0359n0

    /* renamed from: c */
    public final TextView f32541c;

    public C13227n(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f32539a = constraintLayout;
        this.f32540b = textView;
        this.f32541c = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C13227n m57315a(@C0359n0 View view) {
        int i = C13144b.C13154j.holder_account_address_verification_title_textview;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C13144b.C13154j.holder_account_address_verification_value_textview;
            TextView textView2 = (TextView) C20753c.m96463a(view, i);
            if (textView2 != null) {
                return new C13227n((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C13227n m57316c(@C0359n0 LayoutInflater layoutInflater) {
        return m57317d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13227n m57317d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.holder_verify_user_address_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57315a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f32539a;
    }
}
