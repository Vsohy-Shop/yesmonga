package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.account.C13144b;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.carrefour.fid.android.account.databinding.d */
public final class C13217d implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CoordinatorLayout f32428a;
    @C0359n0

    /* renamed from: b */
    public final AppBarLayout f32429b;
    @C0359n0

    /* renamed from: c */
    public final TextView f32430c;
    @C0359n0

    /* renamed from: d */
    public final TextView f32431d;
    @C0359n0

    /* renamed from: e */
    public final Button f32432e;
    @C0359n0

    /* renamed from: f */
    public final TextView f32433f;
    @C0359n0

    /* renamed from: g */
    public final View f32434g;

    public C13217d(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 Button button, @C0359n0 TextView textView3, @C0359n0 View view) {
        this.f32428a = coordinatorLayout;
        this.f32429b = appBarLayout;
        this.f32430c = textView;
        this.f32431d = textView2;
        this.f32432e = button;
        this.f32433f = textView3;
        this.f32434g = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = com.carrefour.fid.android.account.C13144b.C13154j.view;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.account.databinding.C13217d m57275a(@androidx.annotation.C0359n0 android.view.View r10) {
        /*
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.accountCreationSuccessAppBarLyt
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r10, r0)
            r4 = r1
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            if (r4 == 0) goto L_0x0049
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.accountSuccessSubtitle
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r10, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0049
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.accountSuccessTitle
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r10, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0049
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.btnSuccessMeConnecter
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r10, r0)
            r7 = r1
            android.widget.Button r7 = (android.widget.Button) r7
            if (r7 == 0) goto L_0x0049
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.successOpenMailTxt
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r10, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0049
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.view
            android.view.View r9 = androidx.viewbinding.C20753c.m96463a(r10, r0)
            if (r9 == 0) goto L_0x0049
            com.carrefour.fid.android.account.databinding.d r0 = new com.carrefour.fid.android.account.databinding.d
            r3 = r10
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0049:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.databinding.C13217d.m57275a(android.view.View):com.carrefour.fid.android.account.databinding.d");
    }

    @C0359n0
    /* renamed from: c */
    public static C13217d m57276c(@C0359n0 LayoutInflater layoutInflater) {
        return m57277d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13217d m57277d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.fragment_account_update_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57275a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f32428a;
    }
}
