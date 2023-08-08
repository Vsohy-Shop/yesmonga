package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: com.carrefour.fid.android.databinding.b3 */
public final class C36652b3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90598a;
    @C0359n0

    /* renamed from: b */
    public final FloatingActionButton f90599b;
    @C0359n0

    /* renamed from: c */
    public final FragmentContainerView f90600c;
    @C0359n0

    /* renamed from: d */
    public final ComposeView f90601d;
    @C0359n0

    /* renamed from: e */
    public final ComposeView f90602e;
    @C0359n0

    /* renamed from: f */
    public final ComposeView f90603f;

    public C36652b3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 FloatingActionButton floatingActionButton, @C0359n0 FragmentContainerView fragmentContainerView, @C0359n0 ComposeView composeView, @C0359n0 ComposeView composeView2, @C0359n0 ComposeView composeView3) {
        this.f90598a = constraintLayout;
        this.f90599b = floatingActionButton;
        this.f90600c = fragmentContainerView;
        this.f90601d = composeView;
        this.f90602e = composeView2;
        this.f90603f = composeView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36652b3 m150337a(@C0359n0 View view) {
        int i = R.id.center_on_location_fab;
        FloatingActionButton floatingActionButton = (FloatingActionButton) C20753c.m96463a(view, R.id.center_on_location_fab);
        if (floatingActionButton != null) {
            i = R.id.map;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C20753c.m96463a(view, R.id.map);
            if (fragmentContainerView != null) {
                i = R.id.pickup_carousel;
                ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.pickup_carousel);
                if (composeView != null) {
                    i = R.id.pickup_header;
                    ComposeView composeView2 = (ComposeView) C20753c.m96463a(view, R.id.pickup_header);
                    if (composeView2 != null) {
                        i = R.id.search_pickup;
                        ComposeView composeView3 = (ComposeView) C20753c.m96463a(view, R.id.search_pickup);
                        if (composeView3 != null) {
                            return new C36652b3((ConstraintLayout) view, floatingActionButton, fragmentContainerView, composeView, composeView2, composeView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36652b3 m150338c(@C0359n0 LayoutInflater layoutInflater) {
        return m150339d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36652b3 m150339d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_pickup_map, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150337a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90598a;
    }
}
