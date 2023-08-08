package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.q8 */
public final class C36807q8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91550a;
    @C0359n0

    /* renamed from: b */
    public final RadioButton f91551b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91552c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91553d;
    @C0359n0

    /* renamed from: e */
    public final ConstraintLayout f91554e;

    public C36807q8(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 RadioButton radioButton, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 ConstraintLayout constraintLayout2) {
        this.f91550a = constraintLayout;
        this.f91551b = radioButton;
        this.f91552c = textView;
        this.f91553d = textView2;
        this.f91554e = constraintLayout2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36807q8 m150951a(@C0359n0 View view) {
        int i = R.id.text_checkout_address_selection_check;
        RadioButton radioButton = (RadioButton) C20753c.m96463a(view, R.id.text_checkout_address_selection_check);
        if (radioButton != null) {
            i = R.id.text_checkout_address_selection_name;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_checkout_address_selection_name);
            if (textView != null) {
                i = R.id.text_checkout_address_selection_type;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_checkout_address_selection_type);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new C36807q8(constraintLayout, radioButton, textView, textView2, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36807q8 m150952c(@C0359n0 LayoutInflater layoutInflater) {
        return m150953d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36807q8 m150953d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_address_conflicts_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150951a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91550a;
    }
}
