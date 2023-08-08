package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.c */
public final class C36658c implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90622a;
    @C0359n0

    /* renamed from: b */
    public final FrameLayout f90623b;
    @C0359n0

    /* renamed from: c */
    public final C36797p8 f90624c;

    public C36658c(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 FrameLayout frameLayout, @C0359n0 C36797p8 p8Var) {
        this.f90622a = constraintLayout;
        this.f90623b = frameLayout;
        this.f90624c = p8Var;
    }

    @C0359n0
    /* renamed from: a */
    public static C36658c m150361a(@C0359n0 View view) {
        int i = R.id.frame_container_fragment;
        FrameLayout frameLayout = (FrameLayout) C20753c.m96463a(view, R.id.frame_container_fragment);
        if (frameLayout != null) {
            i = R.id.loyaltyToolbar;
            View a = C20753c.m96463a(view, R.id.loyaltyToolbar);
            if (a != null) {
                return new C36658c((ConstraintLayout) view, frameLayout, C36797p8.m150915a(a));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36658c m150362c(@C0359n0 LayoutInflater layoutInflater) {
        return m150363d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36658c m150363d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_landing_page, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150361a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90622a;
    }
}
