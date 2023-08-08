package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.BottomNavigationComponent;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;

/* renamed from: com.carrefour.fid.android.databinding.b */
public final class C36648b implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90582a;
    @C0359n0

    /* renamed from: b */
    public final BottomNavigationComponent f90583b;
    @C0359n0

    /* renamed from: c */
    public final FragmentContainerView f90584c;
    @C0359n0

    /* renamed from: d */
    public final ToolBarDefaultView f90585d;

    public C36648b(@C0359n0 LinearLayout linearLayout, @C0359n0 BottomNavigationComponent bottomNavigationComponent, @C0359n0 FragmentContainerView fragmentContainerView, @C0359n0 ToolBarDefaultView toolBarDefaultView) {
        this.f90582a = linearLayout;
        this.f90583b = bottomNavigationComponent;
        this.f90584c = fragmentContainerView;
        this.f90585d = toolBarDefaultView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36648b m150321a(@C0359n0 View view) {
        int i = R.id.main_bottom_navigation;
        BottomNavigationComponent bottomNavigationComponent = (BottomNavigationComponent) C20753c.m96463a(view, R.id.main_bottom_navigation);
        if (bottomNavigationComponent != null) {
            i = R.id.nav_host_container;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C20753c.m96463a(view, R.id.nav_host_container);
            if (fragmentContainerView != null) {
                i = R.id.toolbar_home;
                ToolBarDefaultView toolBarDefaultView = (ToolBarDefaultView) C20753c.m96463a(view, R.id.toolbar_home);
                if (toolBarDefaultView != null) {
                    return new C36648b((LinearLayout) view, bottomNavigationComponent, fragmentContainerView, toolBarDefaultView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36648b m150322c(@C0359n0 LayoutInflater layoutInflater) {
        return m150323d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36648b m150323d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150321a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90582a;
    }
}
