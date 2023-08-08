package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: com.carrefour.fid.android.databinding.t3 */
public final class C36832t3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CoordinatorLayout f91672a;
    @C0359n0

    /* renamed from: b */
    public final CoordinatorLayout f91673b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f91674c;
    @C0359n0

    /* renamed from: d */
    public final FloatingActionButton f91675d;
    @C0359n0

    /* renamed from: e */
    public final FragmentContainerView f91676e;

    public C36832t3(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 CoordinatorLayout coordinatorLayout2, @C0359n0 ComposeView composeView, @C0359n0 FloatingActionButton floatingActionButton, @C0359n0 FragmentContainerView fragmentContainerView) {
        this.f91672a = coordinatorLayout;
        this.f91673b = coordinatorLayout2;
        this.f91674c = composeView;
        this.f91675d = floatingActionButton;
        this.f91676e = fragmentContainerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36832t3 m151049a(@C0359n0 View view) {
        int i = R.id.bottom_sheet_container;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C20753c.m96463a(view, R.id.bottom_sheet_container);
        if (coordinatorLayout != null) {
            i = R.id.facility_search_header;
            ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.facility_search_header);
            if (composeView != null) {
                i = R.id.floating_button;
                FloatingActionButton floatingActionButton = (FloatingActionButton) C20753c.m96463a(view, R.id.floating_button);
                if (floatingActionButton != null) {
                    i = R.id.map;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) C20753c.m96463a(view, R.id.map);
                    if (fragmentContainerView != null) {
                        return new C36832t3((CoordinatorLayout) view, coordinatorLayout, composeView, floatingActionButton, fragmentContainerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36832t3 m151050c(@C0359n0 LayoutInflater layoutInflater) {
        return m151051d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36832t3 m151051d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_store_locator_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151049a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f91672a;
    }
}
