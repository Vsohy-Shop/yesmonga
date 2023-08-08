package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.d8 */
public final class C36677d8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90736a;
    @C0359n0

    /* renamed from: b */
    public final Guideline f90737b;
    @C0359n0

    /* renamed from: c */
    public final Guideline f90738c;
    @C0359n0

    /* renamed from: d */
    public final Guideline f90739d;
    @C0359n0

    /* renamed from: e */
    public final Guideline f90740e;
    @C0359n0

    /* renamed from: f */
    public final Guideline f90741f;
    @C0359n0

    /* renamed from: g */
    public final View f90742g;
    @C0359n0

    /* renamed from: h */
    public final View f90743h;
    @C0359n0

    /* renamed from: i */
    public final View f90744i;
    @C0359n0

    /* renamed from: j */
    public final View f90745j;

    public C36677d8(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Guideline guideline, @C0359n0 Guideline guideline2, @C0359n0 Guideline guideline3, @C0359n0 Guideline guideline4, @C0359n0 Guideline guideline5, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4) {
        this.f90736a = constraintLayout;
        this.f90737b = guideline;
        this.f90738c = guideline2;
        this.f90739d = guideline3;
        this.f90740e = guideline4;
        this.f90741f = guideline5;
        this.f90742g = view;
        this.f90743h = view2;
        this.f90744i = view3;
        this.f90745j = view4;
    }

    @C0359n0
    /* renamed from: a */
    public static C36677d8 m150437a(@C0359n0 View view) {
        int i = R.id.guide_line_left;
        Guideline guideline = (Guideline) C20753c.m96463a(view, R.id.guide_line_left);
        if (guideline != null) {
            i = R.id.guidelineTop;
            Guideline guideline2 = (Guideline) C20753c.m96463a(view, R.id.guidelineTop);
            if (guideline2 != null) {
                i = R.id.guidelineTop2;
                Guideline guideline3 = (Guideline) C20753c.m96463a(view, R.id.guidelineTop2);
                if (guideline3 != null) {
                    i = R.id.guidelineTop3;
                    Guideline guideline4 = (Guideline) C20753c.m96463a(view, R.id.guidelineTop3);
                    if (guideline4 != null) {
                        i = R.id.guidelineTop4;
                        Guideline guideline5 = (Guideline) C20753c.m96463a(view, R.id.guidelineTop4);
                        if (guideline5 != null) {
                            i = R.id.shimmerSecretCode;
                            View a = C20753c.m96463a(view, R.id.shimmerSecretCode);
                            if (a != null) {
                                i = R.id.shimmerSecretCode1;
                                View a2 = C20753c.m96463a(view, R.id.shimmerSecretCode1);
                                if (a2 != null) {
                                    i = R.id.shimmerSecretCode3;
                                    View a3 = C20753c.m96463a(view, R.id.shimmerSecretCode3);
                                    if (a3 != null) {
                                        i = R.id.shimmerSecretCode4;
                                        View a4 = C20753c.m96463a(view, R.id.shimmerSecretCode4);
                                        if (a4 != null) {
                                            return new C36677d8((ConstraintLayout) view, guideline, guideline2, guideline3, guideline4, guideline5, a, a2, a3, a4);
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
    public static C36677d8 m150438c(@C0359n0 LayoutInflater layoutInflater) {
        return m150439d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36677d8 m150439d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_secret_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150437a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90736a;
    }
}
