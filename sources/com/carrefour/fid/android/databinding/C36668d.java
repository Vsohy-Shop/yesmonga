package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.d */
public final class C36668d implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f90697a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f90698b;
    @C0359n0

    /* renamed from: c */
    public final FrameLayout f90699c;
    @C0359n0

    /* renamed from: d */
    public final C36867w8 f90700d;

    public C36668d(@C0359n0 FrameLayout frameLayout, @C0359n0 ComposeView composeView, @C0359n0 FrameLayout frameLayout2, @C0359n0 C36867w8 w8Var) {
        this.f90697a = frameLayout;
        this.f90698b = composeView;
        this.f90699c = frameLayout2;
        this.f90700d = w8Var;
    }

    @C0359n0
    /* renamed from: a */
    public static C36668d m150401a(@C0359n0 View view) {
        int i = R.id.bottom_sheet_component;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.bottom_sheet_component);
        if (composeView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            View a = C20753c.m96463a(view, R.id.view_splash_content);
            if (a != null) {
                return new C36668d(frameLayout, composeView, frameLayout, C36867w8.m151183a(a));
            }
            i = R.id.view_splash_content;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36668d m150402c(@C0359n0 LayoutInflater layoutInflater) {
        return m150403d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36668d m150403d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_splash, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150401a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f90697a;
    }
}
