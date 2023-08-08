package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.m3 */
public final class C36762m3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91271a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f91272b;
    @C0359n0

    /* renamed from: c */
    public final NotificationComponent f91273c;
    @C0359n0

    /* renamed from: d */
    public final RecyclerView f91274d;
    @C0359n0

    /* renamed from: e */
    public final ShimmerFrameLayout f91275e;
    @C0359n0

    /* renamed from: f */
    public final ViewStub f91276f;
    @C0359n0

    /* renamed from: g */
    public final ViewStub f91277g;

    public C36762m3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 NotificationComponent notificationComponent, @C0359n0 RecyclerView recyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2) {
        this.f91271a = constraintLayout;
        this.f91272b = materialButton;
        this.f91273c = notificationComponent;
        this.f91274d = recyclerView;
        this.f91275e = shimmerFrameLayout;
        this.f91276f = viewStub;
        this.f91277g = viewStub2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36762m3 m150775a(@C0359n0 View view) {
        int i = R.id.search_with_list_recommendation_results_add_all_button;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, R.id.search_with_list_recommendation_results_add_all_button);
        if (materialButton != null) {
            i = R.id.search_with_list_recommendation_results_error_notification;
            NotificationComponent notificationComponent = (NotificationComponent) C20753c.m96463a(view, R.id.search_with_list_recommendation_results_error_notification);
            if (notificationComponent != null) {
                i = R.id.search_with_list_recommendation_results_list;
                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.search_with_list_recommendation_results_list);
                if (recyclerView != null) {
                    i = R.id.search_with_list_recommendation_results_shimmer;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.search_with_list_recommendation_results_shimmer);
                    if (shimmerFrameLayout != null) {
                        i = R.id.stub_search_with_list_recommendation_results_empty;
                        ViewStub viewStub = (ViewStub) C20753c.m96463a(view, R.id.stub_search_with_list_recommendation_results_empty);
                        if (viewStub != null) {
                            i = R.id.stub_search_with_list_recommendation_results_error;
                            ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view, R.id.stub_search_with_list_recommendation_results_error);
                            if (viewStub2 != null) {
                                return new C36762m3((ConstraintLayout) view, materialButton, notificationComponent, recyclerView, shimmerFrameLayout, viewStub, viewStub2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36762m3 m150776c(@C0359n0 LayoutInflater layoutInflater) {
        return m150777d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36762m3 m150777d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_search_with_list_recommendation_results, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150775a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91271a;
    }
}
