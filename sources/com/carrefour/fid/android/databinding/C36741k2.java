package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.k2 */
public final class C36741k2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final SwipeRefreshLayout f91117a;
    @C0359n0

    /* renamed from: b */
    public final ConstraintLayout f91118b;
    @C0359n0

    /* renamed from: c */
    public final ExpandableListView f91119c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f91120d;
    @C0359n0

    /* renamed from: e */
    public final RelativeLayout f91121e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91122f;
    @C0359n0

    /* renamed from: g */
    public final ShimmerFrameLayout f91123g;
    @C0359n0

    /* renamed from: h */
    public final RecyclerView f91124h;
    @C0359n0

    /* renamed from: i */
    public final View f91125i;
    @C0359n0

    /* renamed from: j */
    public final NotificationComponent f91126j;
    @C0359n0

    /* renamed from: k */
    public final SwipeRefreshLayout f91127k;
    @C0359n0

    /* renamed from: l */
    public final TextView f91128l;
    @C0359n0

    /* renamed from: m */
    public final TextView f91129m;
    @C0359n0

    /* renamed from: n */
    public final ImageView f91130n;
    @C0359n0

    /* renamed from: o */
    public final ConstraintLayout f91131o;
    @C0359n0

    /* renamed from: p */
    public final TextView f91132p;
    @C0359n0

    /* renamed from: q */
    public final TextView f91133q;
    @C0359n0

    /* renamed from: r */
    public final TextView f91134r;

    public C36741k2(@C0359n0 SwipeRefreshLayout swipeRefreshLayout, @C0359n0 ConstraintLayout constraintLayout, @C0359n0 ExpandableListView expandableListView, @C0359n0 ImageView imageView, @C0359n0 RelativeLayout relativeLayout, @C0359n0 TextView textView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 View view, @C0359n0 NotificationComponent notificationComponent, @C0359n0 SwipeRefreshLayout swipeRefreshLayout2, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 ImageView imageView2, @C0359n0 ConstraintLayout constraintLayout2, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6) {
        this.f91117a = swipeRefreshLayout;
        this.f91118b = constraintLayout;
        this.f91119c = expandableListView;
        this.f91120d = imageView;
        this.f91121e = relativeLayout;
        this.f91122f = textView;
        this.f91123g = shimmerFrameLayout;
        this.f91124h = recyclerView;
        this.f91125i = view;
        this.f91126j = notificationComponent;
        this.f91127k = swipeRefreshLayout2;
        this.f91128l = textView2;
        this.f91129m = textView3;
        this.f91130n = imageView2;
        this.f91131o = constraintLayout2;
        this.f91132p = textView4;
        this.f91133q = textView5;
        this.f91134r = textView6;
    }

    @C0359n0
    /* renamed from: a */
    public static C36741k2 m150691a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.cl_header_loyalty_amount;
        ConstraintLayout constraintLayout = (ConstraintLayout) C20753c.m96463a(view2, R.id.cl_header_loyalty_amount);
        if (constraintLayout != null) {
            i = R.id.expandable_history_date;
            ExpandableListView expandableListView = (ExpandableListView) C20753c.m96463a(view2, R.id.expandable_history_date);
            if (expandableListView != null) {
                i = R.id.iv_history_unavailable;
                ImageView imageView = (ImageView) C20753c.m96463a(view2, R.id.iv_history_unavailable);
                if (imageView != null) {
                    i = R.id.linear_header;
                    RelativeLayout relativeLayout = (RelativeLayout) C20753c.m96463a(view2, R.id.linear_header);
                    if (relativeLayout != null) {
                        i = R.id.loyalty_amount_history;
                        TextView textView = (TextView) C20753c.m96463a(view2, R.id.loyalty_amount_history);
                        if (textView != null) {
                            i = R.id.loyaltyAmountHistoryShimmerViewContainer;
                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view2, R.id.loyaltyAmountHistoryShimmerViewContainer);
                            if (shimmerFrameLayout != null) {
                                i = R.id.loyalty_history_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view2, R.id.loyalty_history_recycler_view);
                                if (recyclerView != null) {
                                    i = R.id.loyalty_line_separator;
                                    View a = C20753c.m96463a(view2, R.id.loyalty_line_separator);
                                    if (a != null) {
                                        i = R.id.loyalty_negative_amount_notification;
                                        NotificationComponent notificationComponent = (NotificationComponent) C20753c.m96463a(view2, R.id.loyalty_negative_amount_notification);
                                        if (notificationComponent != null) {
                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view2;
                                            i = R.id.transactionTitle;
                                            TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.transactionTitle);
                                            if (textView2 != null) {
                                                i = R.id.transactionsAmount;
                                                TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.transactionsAmount);
                                                if (textView3 != null) {
                                                    i = R.id.transactionsExpendable;
                                                    ImageView imageView2 = (ImageView) C20753c.m96463a(view2, R.id.transactionsExpendable);
                                                    if (imageView2 != null) {
                                                        i = R.id.transactionsLayout;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) C20753c.m96463a(view2, R.id.transactionsLayout);
                                                        if (constraintLayout2 != null) {
                                                            i = R.id.transactionsMoreDescription;
                                                            TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.transactionsMoreDescription);
                                                            if (textView4 != null) {
                                                                i = R.id.transactionsMoreDetails;
                                                                TextView textView5 = (TextView) C20753c.m96463a(view2, R.id.transactionsMoreDetails);
                                                                if (textView5 != null) {
                                                                    i = R.id.txt_history_unavailable;
                                                                    TextView textView6 = (TextView) C20753c.m96463a(view2, R.id.txt_history_unavailable);
                                                                    if (textView6 != null) {
                                                                        return new C36741k2(swipeRefreshLayout, constraintLayout, expandableListView, imageView, relativeLayout, textView, shimmerFrameLayout, recyclerView, a, notificationComponent, swipeRefreshLayout, textView2, textView3, imageView2, constraintLayout2, textView4, textView5, textView6);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
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
    public static C36741k2 m150692c(@C0359n0 LayoutInflater layoutInflater) {
        return m150693d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36741k2 m150693d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_loyalty_amount_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150691a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public SwipeRefreshLayout getRoot() {
        return this.f91117a;
    }
}
