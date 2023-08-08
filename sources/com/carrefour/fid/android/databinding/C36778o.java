package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.o */
public final class C36778o implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91389a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91390b;
    @C0359n0

    /* renamed from: c */
    public final View f91391c;
    @C0359n0

    /* renamed from: d */
    public final View f91392d;
    @C0359n0

    /* renamed from: e */
    public final View f91393e;
    @C0359n0

    /* renamed from: f */
    public final View f91394f;
    @C0359n0

    /* renamed from: g */
    public final View f91395g;
    @C0359n0

    /* renamed from: h */
    public final Guideline f91396h;
    @C0359n0

    /* renamed from: i */
    public final Guideline f91397i;
    @C0359n0

    /* renamed from: j */
    public final Guideline f91398j;

    public C36778o(@C0359n0 LinearLayout linearLayout, @C0359n0 TextView textView, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4, @C0359n0 View view5, @C0359n0 Guideline guideline, @C0359n0 Guideline guideline2, @C0359n0 Guideline guideline3) {
        this.f91389a = linearLayout;
        this.f91390b = textView;
        this.f91391c = view;
        this.f91392d = view2;
        this.f91393e = view3;
        this.f91394f = view4;
        this.f91395g = view5;
        this.f91396h = guideline;
        this.f91397i = guideline2;
        this.f91398j = guideline3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36778o m150839a(@C0359n0 View view) {
        int i = R.id.couponAddRemoveTxt;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.couponAddRemoveTxt);
        if (textView != null) {
            i = R.id.couponDescriptionTxt;
            View a = C20753c.m96463a(view, R.id.couponDescriptionTxt);
            if (a != null) {
                i = R.id.couponHeaderLyt;
                View a2 = C20753c.m96463a(view, R.id.couponHeaderLyt);
                if (a2 != null) {
                    i = R.id.couponHyperFormatImg;
                    View a3 = C20753c.m96463a(view, R.id.couponHyperFormatImg);
                    if (a3 != null) {
                        i = R.id.couponThumbnail;
                        View a4 = C20753c.m96463a(view, R.id.couponThumbnail);
                        if (a4 != null) {
                            i = R.id.couponValiditydateTxt;
                            View a5 = C20753c.m96463a(view, R.id.couponValiditydateTxt);
                            if (a5 != null) {
                                i = R.id.guide_line_left;
                                Guideline guideline = (Guideline) C20753c.m96463a(view, R.id.guide_line_left);
                                if (guideline != null) {
                                    i = R.id.guide_line_right;
                                    Guideline guideline2 = (Guideline) C20753c.m96463a(view, R.id.guide_line_right);
                                    if (guideline2 != null) {
                                        i = R.id.guidelineBottom;
                                        Guideline guideline3 = (Guideline) C20753c.m96463a(view, R.id.guidelineBottom);
                                        if (guideline3 != null) {
                                            return new C36778o((LinearLayout) view, textView, a, a2, a3, a4, a5, guideline, guideline2, guideline3);
                                        }
                                    }
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
    public static C36778o m150840c(@C0359n0 LayoutInflater layoutInflater) {
        return m150841d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36778o m150841d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.coupon_row_placeholder_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150839a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91389a;
    }
}
