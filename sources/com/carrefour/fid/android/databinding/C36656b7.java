package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.b7 */
public final class C36656b7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90615a;
    @C0359n0

    /* renamed from: b */
    public final TextView f90616b;
    @C0359n0

    /* renamed from: c */
    public final TextView f90617c;

    public C36656b7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f90615a = constraintLayout;
        this.f90616b = textView;
        this.f90617c = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36656b7 m150353a(@C0359n0 View view) {
        int i = R.id.prime_cgu_text;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.prime_cgu_text);
        if (textView != null) {
            i = R.id.prime_text;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.prime_text);
            if (textView2 != null) {
                return new C36656b7((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36656b7 m150354c(@C0359n0 LayoutInflater layoutInflater) {
        return m150355d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36656b7 m150355d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.prime_cell_footer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150353a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90615a;
    }
}
