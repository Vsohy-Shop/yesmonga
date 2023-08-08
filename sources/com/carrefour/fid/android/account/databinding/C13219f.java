package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.account.C13144b;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: com.carrefour.fid.android.account.databinding.f */
public final class C13219f implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CoordinatorLayout f32439a;
    @C0359n0

    /* renamed from: b */
    public final AppBarLayout f32440b;
    @C0359n0

    /* renamed from: c */
    public final FloatingActionButton f32441c;
    @C0359n0

    /* renamed from: d */
    public final C13232s f32442d;

    public C13219f(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, @C0359n0 FloatingActionButton floatingActionButton, @C0359n0 C13232s sVar) {
        this.f32439a = coordinatorLayout;
        this.f32440b = appBarLayout;
        this.f32441c = floatingActionButton;
        this.f32442d = sVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = com.carrefour.fid.android.account.C13144b.C13154j.sign_in_content;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.account.databinding.C13219f m57283a(@androidx.annotation.C0359n0 android.view.View r4) {
        /*
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.forgot_pwd_app_bar
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r4, r0)
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            if (r1 == 0) goto L_0x0028
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.sign_in_close_button
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r4, r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            if (r2 == 0) goto L_0x0028
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.sign_in_content
            android.view.View r3 = androidx.viewbinding.C20753c.m96463a(r4, r0)
            if (r3 == 0) goto L_0x0028
            com.carrefour.fid.android.account.databinding.s r0 = com.carrefour.fid.android.account.databinding.C13232s.m57335a(r3)
            com.carrefour.fid.android.account.databinding.f r3 = new com.carrefour.fid.android.account.databinding.f
            androidx.coordinatorlayout.widget.CoordinatorLayout r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r4
            r3.<init>(r4, r1, r2, r0)
            return r3
        L_0x0028:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.databinding.C13219f.m57283a(android.view.View):com.carrefour.fid.android.account.databinding.f");
    }

    @C0359n0
    /* renamed from: c */
    public static C13219f m57284c(@C0359n0 LayoutInflater layoutInflater) {
        return m57285d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13219f m57285d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.fragment_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57283a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f32439a;
    }
}
