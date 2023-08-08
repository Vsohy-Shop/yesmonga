package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.infinitelist.InfiniteListRecyclerView;
import com.carrefour.fid.android.design.components.widgets.swipetorefresh.PullToRefreshLayout;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.w2 */
public final class C36861w2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f91839a;
    @C0359n0

    /* renamed from: b */
    public final PullToRefreshLayout f91840b;
    @C0359n0

    /* renamed from: c */
    public final FrameLayout f91841c;
    @C0359n0

    /* renamed from: d */
    public final InfiniteListRecyclerView f91842d;
    @C0359n0

    /* renamed from: e */
    public final ShimmerFrameLayout f91843e;
    @C0359n0

    /* renamed from: f */
    public final ShimmerFrameLayout f91844f;
    @C0359n0

    /* renamed from: g */
    public final ViewStub f91845g;
    @C0359n0

    /* renamed from: h */
    public final ViewStub f91846h;

    public C36861w2(@C0359n0 FrameLayout frameLayout, @C0359n0 PullToRefreshLayout pullToRefreshLayout, @C0359n0 FrameLayout frameLayout2, @C0359n0 InfiniteListRecyclerView infiniteListRecyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ShimmerFrameLayout shimmerFrameLayout2, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2) {
        this.f91839a = frameLayout;
        this.f91840b = pullToRefreshLayout;
        this.f91841c = frameLayout2;
        this.f91842d = infiniteListRecyclerView;
        this.f91843e = shimmerFrameLayout;
        this.f91844f = shimmerFrameLayout2;
        this.f91845g = viewStub;
        this.f91846h = viewStub2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36861w2 m151161a(@C0359n0 View view) {
        int i = R.id.order_online_swipe_refresh;
        PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) C20753c.m96463a(view, R.id.order_online_swipe_refresh);
        if (pullToRefreshLayout != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i = R.id.recycler_fragment_orders_online;
            InfiniteListRecyclerView infiniteListRecyclerView = (InfiniteListRecyclerView) C20753c.m96463a(view, R.id.recycler_fragment_orders_online);
            if (infiniteListRecyclerView != null) {
                i = R.id.shimmer_fragment_orders_offline_list;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_fragment_orders_offline_list);
                if (shimmerFrameLayout != null) {
                    i = R.id.shimmer_fragment_orders_online_list;
                    ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_fragment_orders_online_list);
                    if (shimmerFrameLayout2 != null) {
                        i = R.id.stub_fragment_orders_online_empty;
                        ViewStub viewStub = (ViewStub) C20753c.m96463a(view, R.id.stub_fragment_orders_online_empty);
                        if (viewStub != null) {
                            i = R.id.stub_fragment_orders_online_error;
                            ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view, R.id.stub_fragment_orders_online_error);
                            if (viewStub2 != null) {
                                return new C36861w2(frameLayout, pullToRefreshLayout, frameLayout, infiniteListRecyclerView, shimmerFrameLayout, shimmerFrameLayout2, viewStub, viewStub2);
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
    public static C36861w2 m151162c(@C0359n0 LayoutInflater layoutInflater) {
        return m151163d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36861w2 m151163d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_orders_online, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151161a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f91839a;
    }
}
