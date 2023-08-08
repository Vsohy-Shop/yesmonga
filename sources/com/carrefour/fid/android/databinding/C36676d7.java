package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.d7 */
public final class C36676d7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90727a;
    @C0359n0

    /* renamed from: b */
    public final Guideline f90728b;
    @C0359n0

    /* renamed from: c */
    public final Guideline f90729c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f90730d;
    @C0359n0

    /* renamed from: e */
    public final ConstraintLayout f90731e;
    @C0359n0

    /* renamed from: f */
    public final SwitchCompat f90732f;
    @C0359n0

    /* renamed from: g */
    public final TextView f90733g;
    @C0359n0

    /* renamed from: h */
    public final TextView f90734h;
    @C0359n0

    /* renamed from: i */
    public final TextView f90735i;

    public C36676d7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Guideline guideline, @C0359n0 Guideline guideline2, @C0359n0 ImageView imageView, @C0359n0 ConstraintLayout constraintLayout2, @C0359n0 SwitchCompat switchCompat, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f90727a = constraintLayout;
        this.f90728b = guideline;
        this.f90729c = guideline2;
        this.f90730d = imageView;
        this.f90731e = constraintLayout2;
        this.f90732f = switchCompat;
        this.f90733g = textView;
        this.f90734h = textView2;
        this.f90735i = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36676d7 m150433a(@C0359n0 View view) {
        int i = R.id.guide_line_left;
        Guideline guideline = (Guideline) C20753c.m96463a(view, R.id.guide_line_left);
        if (guideline != null) {
            i = R.id.guide_line_right;
            Guideline guideline2 = (Guideline) C20753c.m96463a(view, R.id.guide_line_right);
            if (guideline2 != null) {
                i = R.id.imgPrimeCellIcon;
                ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.imgPrimeCellIcon);
                if (imageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.primeSwitch;
                    SwitchCompat switchCompat = (SwitchCompat) C20753c.m96463a(view, R.id.primeSwitch);
                    if (switchCompat != null) {
                        i = R.id.txtPrimeCellDescription;
                        TextView textView = (TextView) C20753c.m96463a(view, R.id.txtPrimeCellDescription);
                        if (textView != null) {
                            i = R.id.txtPrimeCellRedudction;
                            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.txtPrimeCellRedudction);
                            if (textView2 != null) {
                                i = R.id.txtPrimeCellTitle;
                                TextView textView3 = (TextView) C20753c.m96463a(view, R.id.txtPrimeCellTitle);
                                if (textView3 != null) {
                                    return new C36676d7(constraintLayout, guideline, guideline2, imageView, constraintLayout, switchCompat, textView, textView2, textView3);
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
    public static C36676d7 m150434c(@C0359n0 LayoutInflater layoutInflater) {
        return m150435d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36676d7 m150435d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.prime_fid_cell, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150433a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90727a;
    }
}
