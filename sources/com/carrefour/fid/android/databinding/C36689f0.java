package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.counter.CountDownTimerComponent;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.f0 */
public final class C36689f0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90780a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f90781b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f90782c;
    @C0359n0

    /* renamed from: d */
    public final MaterialButton f90783d;
    @C0359n0

    /* renamed from: e */
    public final RecyclerView f90784e;
    @C0359n0

    /* renamed from: f */
    public final ShimmerFrameLayout f90785f;
    @C0359n0

    /* renamed from: g */
    public final ViewStub f90786g;
    @C0359n0

    /* renamed from: h */
    public final ViewStub f90787h;
    @C0359n0

    /* renamed from: i */
    public final CountDownTimerComponent f90788i;
    @C0359n0

    /* renamed from: j */
    public final FrameLayout f90789j;

    public C36689f0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 MaterialButton materialButton, @C0359n0 RecyclerView recyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2, @C0359n0 CountDownTimerComponent countDownTimerComponent, @C0359n0 FrameLayout frameLayout) {
        this.f90780a = constraintLayout;
        this.f90781b = composeView;
        this.f90782c = linearLayout;
        this.f90783d = materialButton;
        this.f90784e = recyclerView;
        this.f90785f = shimmerFrameLayout;
        this.f90786g = viewStub;
        this.f90787h = viewStub2;
        this.f90788i = countDownTimerComponent;
        this.f90789j = frameLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C36689f0 m150483a(@C0359n0 View view) {
        int i = R.id.additional_order_header;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.additional_order_header);
        if (composeView != null) {
            i = R.id.additional_order_header_layout;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.additional_order_header_layout);
            if (linearLayout != null) {
                i = R.id.button_show_basket_additional_order;
                MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, R.id.button_show_basket_additional_order);
                if (materialButton != null) {
                    i = R.id.list_additional_order;
                    RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_additional_order);
                    if (recyclerView != null) {
                        i = R.id.shimmer_additional_order;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_additional_order);
                        if (shimmerFrameLayout != null) {
                            i = R.id.stub_additional_order_empty;
                            ViewStub viewStub = (ViewStub) C20753c.m96463a(view, R.id.stub_additional_order_empty);
                            if (viewStub != null) {
                                i = R.id.stub_list_error;
                                ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view, R.id.stub_list_error);
                                if (viewStub2 != null) {
                                    i = R.id.timer_additional_order;
                                    CountDownTimerComponent countDownTimerComponent = (CountDownTimerComponent) C20753c.m96463a(view, R.id.timer_additional_order);
                                    if (countDownTimerComponent != null) {
                                        i = R.id.view_show_basket_additional_order;
                                        FrameLayout frameLayout = (FrameLayout) C20753c.m96463a(view, R.id.view_show_basket_additional_order);
                                        if (frameLayout != null) {
                                            return new C36689f0((ConstraintLayout) view, composeView, linearLayout, materialButton, recyclerView, shimmerFrameLayout, viewStub, viewStub2, countDownTimerComponent, frameLayout);
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
    public static C36689f0 m150484c(@C0359n0 LayoutInflater layoutInflater) {
        return m150485d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36689f0 m150485d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_additional_order, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150483a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90780a;
    }
}
