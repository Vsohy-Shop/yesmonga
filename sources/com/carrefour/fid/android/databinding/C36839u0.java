package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.StepBarView;
import com.carrefour.fid.android.design.components.widgets.counter.CountDownTimerComponent;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: com.carrefour.fid.android.databinding.u0 */
public final class C36839u0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayoutCompat f91726a;
    @C0359n0

    /* renamed from: b */
    public final AppBarLayout f91727b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f91728c;
    @C0359n0

    /* renamed from: d */
    public final LinearLayout f91729d;
    @C0359n0

    /* renamed from: e */
    public final CollapsingToolbarLayout f91730e;
    @C0359n0

    /* renamed from: f */
    public final FragmentContainerView f91731f;
    @C0359n0

    /* renamed from: g */
    public final StepBarView f91732g;
    @C0359n0

    /* renamed from: h */
    public final CountDownTimerComponent f91733h;

    public C36839u0(@C0359n0 LinearLayoutCompat linearLayoutCompat, @C0359n0 AppBarLayout appBarLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 CollapsingToolbarLayout collapsingToolbarLayout, @C0359n0 FragmentContainerView fragmentContainerView, @C0359n0 StepBarView stepBarView, @C0359n0 CountDownTimerComponent countDownTimerComponent) {
        this.f91726a = linearLayoutCompat;
        this.f91727b = appBarLayout;
        this.f91728c = composeView;
        this.f91729d = linearLayout;
        this.f91730e = collapsingToolbarLayout;
        this.f91731f = fragmentContainerView;
        this.f91732g = stepBarView;
        this.f91733h = countDownTimerComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C36839u0 m151077a(@C0359n0 View view) {
        int i = R.id.additional_order_app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) C20753c.m96463a(view, R.id.additional_order_app_bar);
        if (appBarLayout != null) {
            i = R.id.basket_additional_order_header;
            ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.basket_additional_order_header);
            if (composeView != null) {
                i = R.id.basket_additional_order_header_layout;
                LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.basket_additional_order_header_layout);
                if (linearLayout != null) {
                    i = R.id.collapsing_toolbar_layout;
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) C20753c.m96463a(view, R.id.collapsing_toolbar_layout);
                    if (collapsingToolbarLayout != null) {
                        i = R.id.fragment_basket_additional_order_container;
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) C20753c.m96463a(view, R.id.fragment_basket_additional_order_container);
                        if (fragmentContainerView != null) {
                            i = R.id.step_indicator;
                            StepBarView stepBarView = (StepBarView) C20753c.m96463a(view, R.id.step_indicator);
                            if (stepBarView != null) {
                                i = R.id.timer_additional_order;
                                CountDownTimerComponent countDownTimerComponent = (CountDownTimerComponent) C20753c.m96463a(view, R.id.timer_additional_order);
                                if (countDownTimerComponent != null) {
                                    return new C36839u0((LinearLayoutCompat) view, appBarLayout, composeView, linearLayout, collapsingToolbarLayout, fragmentContainerView, stepBarView, countDownTimerComponent);
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
    public static C36839u0 m151078c(@C0359n0 LayoutInflater layoutInflater) {
        return m151079d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36839u0 m151079d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basket_additional_order, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151077a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayoutCompat getRoot() {
        return this.f91726a;
    }
}
