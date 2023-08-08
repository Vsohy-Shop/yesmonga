package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.account.C13144b;

/* renamed from: com.carrefour.fid.android.account.databinding.a */
public final class C13214a implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f32392a;
    @C0359n0

    /* renamed from: b */
    public final FragmentContainerView f32393b;

    public C13214a(@C0359n0 FrameLayout frameLayout, @C0359n0 FragmentContainerView fragmentContainerView) {
        this.f32392a = frameLayout;
        this.f32393b = fragmentContainerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C13214a m57263a(@C0359n0 View view) {
        int i = C13144b.C13154j.nav_host_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C20753c.m96463a(view, i);
        if (fragmentContainerView != null) {
            return new C13214a((FrameLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C13214a m57264c(@C0359n0 LayoutInflater layoutInflater) {
        return m57265d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13214a m57265d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.activity_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57263a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f32392a;
    }
}
