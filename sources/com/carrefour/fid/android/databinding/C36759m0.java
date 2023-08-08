package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.counter.CountDownTimerComponent;
import com.carrefour.fid.android.design.components.widgets.infinitelist.InfiniteListRecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.m0 */
public final class C36759m0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91233a;
    @C0359n0

    /* renamed from: b */
    public final ConstraintLayout f91234b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f91235c;
    @C0359n0

    /* renamed from: d */
    public final LinearLayout f91236d;
    @C0359n0

    /* renamed from: e */
    public final MaterialButton f91237e;
    @C0359n0

    /* renamed from: f */
    public final ImageButton f91238f;
    @C0359n0

    /* renamed from: g */
    public final ConstraintLayout f91239g;
    @C0359n0

    /* renamed from: h */
    public final InfiniteListRecyclerView f91240h;
    @C0359n0

    /* renamed from: i */
    public final ShimmerFrameLayout f91241i;
    @C0359n0

    /* renamed from: j */
    public final ViewStub f91242j;
    @C0359n0

    /* renamed from: k */
    public final ViewStub f91243k;
    @C0359n0

    /* renamed from: l */
    public final TextView f91244l;
    @C0359n0

    /* renamed from: m */
    public final TextView f91245m;
    @C0359n0

    /* renamed from: n */
    public final CountDownTimerComponent f91246n;
    @C0359n0

    /* renamed from: o */
    public final FrameLayout f91247o;

    public C36759m0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ConstraintLayout constraintLayout2, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 MaterialButton materialButton, @C0359n0 ImageButton imageButton, @C0359n0 ConstraintLayout constraintLayout3, @C0359n0 InfiniteListRecyclerView infiniteListRecyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 CountDownTimerComponent countDownTimerComponent, @C0359n0 FrameLayout frameLayout) {
        this.f91233a = constraintLayout;
        this.f91234b = constraintLayout2;
        this.f91235c = composeView;
        this.f91236d = linearLayout;
        this.f91237e = materialButton;
        this.f91238f = imageButton;
        this.f91239g = constraintLayout3;
        this.f91240h = infiniteListRecyclerView;
        this.f91241i = shimmerFrameLayout;
        this.f91242j = viewStub;
        this.f91243k = viewStub2;
        this.f91244l = textView;
        this.f91245m = textView2;
        this.f91246n = countDownTimerComponent;
        this.f91247o = frameLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C36759m0 m150763a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.additional_order_app_bar_search_list;
        ConstraintLayout constraintLayout = (ConstraintLayout) C20753c.m96463a(view2, R.id.additional_order_app_bar_search_list);
        if (constraintLayout != null) {
            i = R.id.additional_order_search_result_header;
            ComposeView composeView = (ComposeView) C20753c.m96463a(view2, R.id.additional_order_search_result_header);
            if (composeView != null) {
                i = R.id.additional_order_search_result_header_layout;
                LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view2, R.id.additional_order_search_result_header_layout);
                if (linearLayout != null) {
                    i = R.id.button_show_basket_additional_order;
                    MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view2, R.id.button_show_basket_additional_order);
                    if (materialButton != null) {
                        i = R.id.button_toolbar_search_filters;
                        ImageButton imageButton = (ImageButton) C20753c.m96463a(view2, R.id.button_toolbar_search_filters);
                        if (imageButton != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view2;
                            i = R.id.search_list;
                            InfiniteListRecyclerView infiniteListRecyclerView = (InfiniteListRecyclerView) C20753c.m96463a(view2, R.id.search_list);
                            if (infiniteListRecyclerView != null) {
                                i = R.id.shimmer_product_list;
                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view2, R.id.shimmer_product_list);
                                if (shimmerFrameLayout != null) {
                                    i = R.id.stub_additional_order_search_empty;
                                    ViewStub viewStub = (ViewStub) C20753c.m96463a(view2, R.id.stub_additional_order_search_empty);
                                    if (viewStub != null) {
                                        i = R.id.stub_list_error;
                                        ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view2, R.id.stub_list_error);
                                        if (viewStub2 != null) {
                                            i = R.id.text_toolbar_search_filters;
                                            TextView textView = (TextView) C20753c.m96463a(view2, R.id.text_toolbar_search_filters);
                                            if (textView != null) {
                                                i = R.id.text_toolbar_search_title;
                                                TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.text_toolbar_search_title);
                                                if (textView2 != null) {
                                                    i = R.id.timer_additional_order_search_result;
                                                    CountDownTimerComponent countDownTimerComponent = (CountDownTimerComponent) C20753c.m96463a(view2, R.id.timer_additional_order_search_result);
                                                    if (countDownTimerComponent != null) {
                                                        i = R.id.view_bottom_basket_button;
                                                        FrameLayout frameLayout = (FrameLayout) C20753c.m96463a(view2, R.id.view_bottom_basket_button);
                                                        if (frameLayout != null) {
                                                            return new C36759m0(constraintLayout2, constraintLayout, composeView, linearLayout, materialButton, imageButton, constraintLayout2, infiniteListRecyclerView, shimmerFrameLayout, viewStub, viewStub2, textView, textView2, countDownTimerComponent, frameLayout);
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
    public static C36759m0 m150764c(@C0359n0 LayoutInflater layoutInflater) {
        return m150765d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36759m0 m150765d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_additional_order_search_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150763a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91233a;
    }
}
