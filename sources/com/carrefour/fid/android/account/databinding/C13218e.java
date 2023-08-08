package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.account.C13144b;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.carrefour.fid.android.account.databinding.e */
public final class C13218e implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CoordinatorLayout f32435a;
    @C0359n0

    /* renamed from: b */
    public final C13215b f32436b;
    @C0359n0

    /* renamed from: c */
    public final AppBarLayout f32437c;
    @C0359n0

    /* renamed from: d */
    public final ComposeView f32438d;

    public C13218e(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 C13215b bVar, @C0359n0 AppBarLayout appBarLayout, @C0359n0 ComposeView composeView) {
        this.f32435a = coordinatorLayout;
        this.f32436b = bVar;
        this.f32437c = appBarLayout;
        this.f32438d = composeView;
    }

    @C0359n0
    /* renamed from: a */
    public static C13218e m57279a(@C0359n0 View view) {
        int i = C13144b.C13154j.forgot_password_content;
        View a = C20753c.m96463a(view, i);
        if (a != null) {
            C13215b a2 = C13215b.m57267a(a);
            int i2 = C13144b.C13154j.forgot_pwd_app_bar;
            AppBarLayout appBarLayout = (AppBarLayout) C20753c.m96463a(view, i2);
            if (appBarLayout != null) {
                i2 = C13144b.C13154j.forgot_pwd_header;
                ComposeView composeView = (ComposeView) C20753c.m96463a(view, i2);
                if (composeView != null) {
                    return new C13218e((CoordinatorLayout) view, a2, appBarLayout, composeView);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C13218e m57280c(@C0359n0 LayoutInflater layoutInflater) {
        return m57281d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13218e m57281d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.fragment_forgot_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57279a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f32435a;
    }
}
