package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.m7 */
public final class C36766m7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91326a;
    @C0359n0

    /* renamed from: b */
    public final LinearLayout f91327b;
    @C0359n0

    /* renamed from: c */
    public final View f91328c;
    @C0359n0

    /* renamed from: d */
    public final View f91329d;
    @C0359n0

    /* renamed from: e */
    public final View f91330e;
    @C0359n0

    /* renamed from: f */
    public final View f91331f;
    @C0359n0

    /* renamed from: g */
    public final View f91332g;
    @C0359n0

    /* renamed from: h */
    public final View f91333h;
    @C0359n0

    /* renamed from: i */
    public final View f91334i;

    public C36766m7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 LinearLayout linearLayout, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4, @C0359n0 View view5, @C0359n0 View view6, @C0359n0 View view7) {
        this.f91326a = constraintLayout;
        this.f91327b = linearLayout;
        this.f91328c = view;
        this.f91329d = view2;
        this.f91330e = view3;
        this.f91331f = view4;
        this.f91332g = view5;
        this.f91333h = view6;
        this.f91334i = view7;
    }

    @C0359n0
    /* renamed from: a */
    public static C36766m7 m150791a(@C0359n0 View view) {
        int i = R.id.loyaltyCguButtons;
        LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.loyaltyCguButtons);
        if (linearLayout != null) {
            i = R.id.view1;
            View a = C20753c.m96463a(view, R.id.view1);
            if (a != null) {
                i = R.id.view2;
                View a2 = C20753c.m96463a(view, R.id.view2);
                if (a2 != null) {
                    i = R.id.view3;
                    View a3 = C20753c.m96463a(view, R.id.view3);
                    if (a3 != null) {
                        i = R.id.view4;
                        View a4 = C20753c.m96463a(view, R.id.view4);
                        if (a4 != null) {
                            i = R.id.view5;
                            View a5 = C20753c.m96463a(view, R.id.view5);
                            if (a5 != null) {
                                i = R.id.view6;
                                View a6 = C20753c.m96463a(view, R.id.view6);
                                if (a6 != null) {
                                    i = R.id.view7;
                                    View a7 = C20753c.m96463a(view, R.id.view7);
                                    if (a7 != null) {
                                        return new C36766m7((ConstraintLayout) view, linearLayout, a, a2, a3, a4, a5, a6, a7);
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
    public static C36766m7 m150792c(@C0359n0 LayoutInflater layoutInflater) {
        return m150793d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36766m7 m150793d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_accept_loyalty_cgu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150791a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91326a;
    }
}
