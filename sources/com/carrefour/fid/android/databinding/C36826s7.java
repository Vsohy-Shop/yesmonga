package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.s7 */
public final class C36826s7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91641a;
    @C0359n0

    /* renamed from: b */
    public final View f91642b;
    @C0359n0

    /* renamed from: c */
    public final View f91643c;
    @C0359n0

    /* renamed from: d */
    public final View f91644d;
    @C0359n0

    /* renamed from: e */
    public final View f91645e;
    @C0359n0

    /* renamed from: f */
    public final View f91646f;
    @C0359n0

    /* renamed from: g */
    public final View f91647g;
    @C0359n0

    /* renamed from: h */
    public final View f91648h;

    public C36826s7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4, @C0359n0 View view5, @C0359n0 View view6, @C0359n0 View view7) {
        this.f91641a = constraintLayout;
        this.f91642b = view;
        this.f91643c = view2;
        this.f91644d = view3;
        this.f91645e = view4;
        this.f91646f = view5;
        this.f91647g = view6;
        this.f91648h = view7;
    }

    @C0359n0
    /* renamed from: a */
    public static C36826s7 m151025a(@C0359n0 View view) {
        int i = R.id.shimmerImgfs;
        View a = C20753c.m96463a(view, R.id.shimmerImgfs);
        if (a != null) {
            i = R.id.shimmerLibelle2fs;
            View a2 = C20753c.m96463a(view, R.id.shimmerLibelle2fs);
            if (a2 != null) {
                i = R.id.shimmerLibelle3fs;
                View a3 = C20753c.m96463a(view, R.id.shimmerLibelle3fs);
                if (a3 != null) {
                    i = R.id.shimmerLibelle4fs;
                    View a4 = C20753c.m96463a(view, R.id.shimmerLibelle4fs);
                    if (a4 != null) {
                        i = R.id.shimmerLibelle5fs;
                        View a5 = C20753c.m96463a(view, R.id.shimmerLibelle5fs);
                        if (a5 != null) {
                            i = R.id.shimmerLibelle7fs;
                            View a6 = C20753c.m96463a(view, R.id.shimmerLibelle7fs);
                            if (a6 != null) {
                                i = R.id.shimmerLibellefs;
                                View a7 = C20753c.m96463a(view, R.id.shimmerLibellefs);
                                if (a7 != null) {
                                    return new C36826s7((ConstraintLayout) view, a, a2, a3, a4, a5, a6, a7);
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
    public static C36826s7 m151026c(@C0359n0 LayoutInflater layoutInflater) {
        return m151027d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36826s7 m151027d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_cell_listes, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151025a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91641a;
    }
}
