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

/* renamed from: com.carrefour.fid.android.databinding.p6 */
public final class C36795p6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91492a;
    @C0359n0

    /* renamed from: b */
    public final LinearLayout f91493b;
    @C0359n0

    /* renamed from: c */
    public final View f91494c;
    @C0359n0

    /* renamed from: d */
    public final View f91495d;
    @C0359n0

    /* renamed from: e */
    public final View f91496e;
    @C0359n0

    /* renamed from: f */
    public final View f91497f;
    @C0359n0

    /* renamed from: g */
    public final View f91498g;
    @C0359n0

    /* renamed from: h */
    public final View f91499h;
    @C0359n0

    /* renamed from: i */
    public final View f91500i;

    public C36795p6(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 LinearLayout linearLayout, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4, @C0359n0 View view5, @C0359n0 View view6, @C0359n0 View view7) {
        this.f91492a = constraintLayout;
        this.f91493b = linearLayout;
        this.f91494c = view;
        this.f91495d = view2;
        this.f91496e = view3;
        this.f91497f = view4;
        this.f91498g = view5;
        this.f91499h = view6;
        this.f91500i = view7;
    }

    @C0359n0
    /* renamed from: a */
    public static C36795p6 m150907a(@C0359n0 View view) {
        int i = R.id.linearLayout4;
        LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.linearLayout4);
        if (linearLayout != null) {
            i = R.id.view10;
            View a = C20753c.m96463a(view, R.id.view10);
            if (a != null) {
                i = R.id.view11;
                View a2 = C20753c.m96463a(view, R.id.view11);
                if (a2 != null) {
                    i = R.id.view12;
                    View a3 = C20753c.m96463a(view, R.id.view12);
                    if (a3 != null) {
                        i = R.id.view13;
                        View a4 = C20753c.m96463a(view, R.id.view13);
                        if (a4 != null) {
                            i = R.id.view14;
                            View a5 = C20753c.m96463a(view, R.id.view14);
                            if (a5 != null) {
                                i = R.id.view15;
                                View a6 = C20753c.m96463a(view, R.id.view15);
                                if (a6 != null) {
                                    i = R.id.view9;
                                    View a7 = C20753c.m96463a(view, R.id.view9);
                                    if (a7 != null) {
                                        return new C36795p6((ConstraintLayout) view, linearLayout, a, a2, a3, a4, a5, a6, a7);
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
    public static C36795p6 m150908c(@C0359n0 LayoutInflater layoutInflater) {
        return m150909d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36795p6 m150909d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.loyalty_bonus_shimmer_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150907a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91492a;
    }
}
