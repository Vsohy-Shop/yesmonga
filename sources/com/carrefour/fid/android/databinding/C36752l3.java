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

/* renamed from: com.carrefour.fid.android.databinding.l3 */
public final class C36752l3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91197a;
    @C0359n0

    /* renamed from: b */
    public final NotificationComponent f91198b;
    @C0359n0

    /* renamed from: c */
    public final RecyclerView f91199c;
    @C0359n0

    /* renamed from: d */
    public final ShimmerFrameLayout f91200d;
    @C0359n0

    /* renamed from: e */
    public final ViewStub f91201e;
    @C0359n0

    /* renamed from: f */
    public final ViewStub f91202f;

    public C36752l3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 NotificationComponent notificationComponent, @C0359n0 RecyclerView recyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2) {
        this.f91197a = constraintLayout;
        this.f91198b = notificationComponent;
        this.f91199c = recyclerView;
        this.f91200d = shimmerFrameLayout;
        this.f91201e = viewStub;
        this.f91202f = viewStub2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36752l3 m150735a(@C0359n0 View view) {
        int i = R.id.search_with_list_all_results_error_notification;
        NotificationComponent notificationComponent = (NotificationComponent) C20753c.m96463a(view, R.id.search_with_list_all_results_error_notification);
        if (notificationComponent != null) {
            i = R.id.search_with_list_all_results_offer_list;
            RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.search_with_list_all_results_offer_list);
            if (recyclerView != null) {
                i = R.id.search_with_list_all_results_shimmer;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.search_with_list_all_results_shimmer);
                if (shimmerFrameLayout != null) {
                    i = R.id.stub_search_with_list_all_results_empty;
                    ViewStub viewStub = (ViewStub) C20753c.m96463a(view, R.id.stub_search_with_list_all_results_empty);
                    if (viewStub != null) {
                        i = R.id.stub_search_with_list_all_results_error;
                        ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view, R.id.stub_search_with_list_all_results_error);
                        if (viewStub2 != null) {
                            return new C36752l3((ConstraintLayout) view, notificationComponent, recyclerView, shimmerFrameLayout, viewStub, viewStub2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36752l3 m150736c(@C0359n0 LayoutInflater layoutInflater) {
        return m150737d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36752l3 m150737d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_search_with_list_all_results, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150735a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91197a;
    }
}
