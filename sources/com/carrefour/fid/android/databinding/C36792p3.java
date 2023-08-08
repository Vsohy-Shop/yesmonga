package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: com.carrefour.fid.android.databinding.p3 */
public final class C36792p3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CoordinatorLayout f91481a;
    @C0359n0

    /* renamed from: b */
    public final CoordinatorLayout f91482b;
    @C0359n0

    /* renamed from: c */
    public final AppBarLayout f91483c;
    @C0359n0

    /* renamed from: d */
    public final CollapsingToolbarLayout f91484d;
    @C0359n0

    /* renamed from: e */
    public final ImageView f91485e;
    @C0359n0

    /* renamed from: f */
    public final C36736j7 f91486f;
    @C0359n0

    /* renamed from: g */
    public final View f91487g;

    public C36792p3(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 CoordinatorLayout coordinatorLayout2, @C0359n0 AppBarLayout appBarLayout, @C0359n0 CollapsingToolbarLayout collapsingToolbarLayout, @C0359n0 ImageView imageView, @C0359n0 C36736j7 j7Var, @C0359n0 View view) {
        this.f91481a = coordinatorLayout;
        this.f91482b = coordinatorLayout2;
        this.f91483c = appBarLayout;
        this.f91484d = collapsingToolbarLayout;
        this.f91485e = imageView;
        this.f91486f = j7Var;
        this.f91487g = view;
    }

    @C0359n0
    /* renamed from: a */
    public static C36792p3 m150895a(@C0359n0 View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.forgot_pwd_app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) C20753c.m96463a(view, R.id.forgot_pwd_app_bar);
        if (appBarLayout != null) {
            i = R.id.forgotPwdToolbarLayout;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) C20753c.m96463a(view, R.id.forgotPwdToolbarLayout);
            if (collapsingToolbarLayout != null) {
                i = R.id.imageView;
                ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.imageView);
                if (imageView != null) {
                    i = R.id.service_station_content;
                    View a = C20753c.m96463a(view, R.id.service_station_content);
                    if (a != null) {
                        C36736j7 a2 = C36736j7.m150671a(a);
                        i = R.id.subtitleView;
                        View a3 = C20753c.m96463a(view, R.id.subtitleView);
                        if (a3 != null) {
                            return new C36792p3(coordinatorLayout, coordinatorLayout, appBarLayout, collapsingToolbarLayout, imageView, a2, a3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36792p3 m150896c(@C0359n0 LayoutInflater layoutInflater) {
        return m150897d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36792p3 m150897d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_service_stations, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150895a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f91481a;
    }
}
