package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.c7 */
public final class C36666c7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90684a;
    @C0359n0

    /* renamed from: b */
    public final Guideline f90685b;
    @C0359n0

    /* renamed from: c */
    public final TextView f90686c;

    public C36666c7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Guideline guideline, @C0359n0 TextView textView) {
        this.f90684a = constraintLayout;
        this.f90685b = guideline;
        this.f90686c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36666c7 m150393a(@C0359n0 View view) {
        int i = R.id.guide_line_left;
        Guideline guideline = (Guideline) C20753c.m96463a(view, R.id.guide_line_left);
        if (guideline != null) {
            i = R.id.primeHeaderText;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.primeHeaderText);
            if (textView != null) {
                return new C36666c7((ConstraintLayout) view, guideline, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36666c7 m150394c(@C0359n0 LayoutInflater layoutInflater) {
        return m150395d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36666c7 m150395d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.prime_cell_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150393a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90684a;
    }
}
