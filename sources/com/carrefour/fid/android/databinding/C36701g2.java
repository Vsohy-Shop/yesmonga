package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: com.carrefour.fid.android.databinding.g2 */
public final class C36701g2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CoordinatorLayout f90876a;
    @C0359n0

    /* renamed from: b */
    public final AppBarLayout f90877b;
    @C0359n0

    /* renamed from: c */
    public final CollapsingToolbarLayout f90878c;
    @C0359n0

    /* renamed from: d */
    public final C36695f6 f90879d;
    @C0359n0

    /* renamed from: e */
    public final Toolbar f90880e;
    @C0359n0

    /* renamed from: f */
    public final ComposeView f90881f;

    public C36701g2(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, @C0359n0 CollapsingToolbarLayout collapsingToolbarLayout, @C0359n0 C36695f6 f6Var, @C0359n0 Toolbar toolbar, @C0359n0 ComposeView composeView) {
        this.f90876a = coordinatorLayout;
        this.f90877b = appBarLayout;
        this.f90878c = collapsingToolbarLayout;
        this.f90879d = f6Var;
        this.f90880e = toolbar;
        this.f90881f = composeView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36701g2 m150531a(@C0359n0 View view) {
        int i = R.id.app_bar_view;
        AppBarLayout appBarLayout = (AppBarLayout) C20753c.m96463a(view, R.id.app_bar_view);
        if (appBarLayout != null) {
            i = R.id.collapsing_toolbar_layout;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) C20753c.m96463a(view, R.id.collapsing_toolbar_layout);
            if (collapsingToolbarLayout != null) {
                i = R.id.layout_home_content;
                View a = C20753c.m96463a(view, R.id.layout_home_content);
                if (a != null) {
                    C36695f6 a2 = C36695f6.m150507a(a);
                    i = R.id.toolbar_home;
                    Toolbar toolbar = (Toolbar) C20753c.m96463a(view, R.id.toolbar_home);
                    if (toolbar != null) {
                        i = R.id.toolbar_home_content;
                        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.toolbar_home_content);
                        if (composeView != null) {
                            return new C36701g2((CoordinatorLayout) view, appBarLayout, collapsingToolbarLayout, a2, toolbar, composeView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36701g2 m150532c(@C0359n0 LayoutInflater layoutInflater) {
        return m150533d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36701g2 m150533d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150531a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f90876a;
    }
}
