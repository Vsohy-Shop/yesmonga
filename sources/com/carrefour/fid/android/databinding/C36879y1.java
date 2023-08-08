package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.SwitchComponent;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.y1 */
public final class C36879y1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91950a;
    @C0359n0

    /* renamed from: b */
    public final SwipeRefreshLayout f91951b;
    @C0359n0

    /* renamed from: c */
    public final SwitchComponent f91952c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91953d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91954e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91955f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91956g;
    @C0359n0

    /* renamed from: h */
    public final MaterialButton f91957h;
    @C0359n0

    /* renamed from: i */
    public final LinearLayoutCompat f91958i;
    @C0359n0

    /* renamed from: j */
    public final RecyclerView f91959j;
    @C0359n0

    /* renamed from: k */
    public final TextView f91960k;
    @C0359n0

    /* renamed from: l */
    public final MaterialButton f91961l;
    @C0359n0

    /* renamed from: m */
    public final LinearLayoutCompat f91962m;
    @C0359n0

    /* renamed from: n */
    public final ViewStub f91963n;
    @C0359n0

    /* renamed from: o */
    public final ViewStub f91964o;

    public C36879y1(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 SwipeRefreshLayout swipeRefreshLayout, @C0359n0 SwitchComponent switchComponent, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 MaterialButton materialButton, @C0359n0 LinearLayoutCompat linearLayoutCompat, @C0359n0 RecyclerView recyclerView, @C0359n0 TextView textView5, @C0359n0 MaterialButton materialButton2, @C0359n0 LinearLayoutCompat linearLayoutCompat2, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2) {
        this.f91950a = constraintLayout;
        this.f91951b = swipeRefreshLayout;
        this.f91952c = switchComponent;
        this.f91953d = textView;
        this.f91954e = textView2;
        this.f91955f = textView3;
        this.f91956g = textView4;
        this.f91957h = materialButton;
        this.f91958i = linearLayoutCompat;
        this.f91959j = recyclerView;
        this.f91960k = textView5;
        this.f91961l = materialButton2;
        this.f91962m = linearLayoutCompat2;
        this.f91963n = viewStub;
        this.f91964o = viewStub2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36879y1 m151231a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.coupon_list_swiperefresh;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C20753c.m96463a(view2, R.id.coupon_list_swiperefresh);
        if (swipeRefreshLayout != null) {
            i = R.id.coupons_activate_all_switch;
            SwitchComponent switchComponent = (SwitchComponent) C20753c.m96463a(view2, R.id.coupons_activate_all_switch);
            if (switchComponent != null) {
                i = R.id.coupons_activated_count_text_view;
                TextView textView = (TextView) C20753c.m96463a(view2, R.id.coupons_activated_count_text_view);
                if (textView != null) {
                    i = R.id.coupons_activated_text_view;
                    TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.coupons_activated_text_view);
                    if (textView2 != null) {
                        i = R.id.coupons_available_count_text_view;
                        TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.coupons_available_count_text_view);
                        if (textView3 != null) {
                            i = R.id.coupons_available_text_view;
                            TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.coupons_available_text_view);
                            if (textView4 != null) {
                                i = R.id.coupons_convert_to_barcode_button;
                                MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view2, R.id.coupons_convert_to_barcode_button);
                                if (materialButton != null) {
                                    i = R.id.coupons_extra_features_layout;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C20753c.m96463a(view2, R.id.coupons_extra_features_layout);
                                    if (linearLayoutCompat != null) {
                                        i = R.id.coupons_recycler_view;
                                        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view2, R.id.coupons_recycler_view);
                                        if (recyclerView != null) {
                                            i = R.id.coupons_reminder;
                                            TextView textView5 = (TextView) C20753c.m96463a(view2, R.id.coupons_reminder);
                                            if (textView5 != null) {
                                                i = R.id.coupons_see_my_card_button;
                                                MaterialButton materialButton2 = (MaterialButton) C20753c.m96463a(view2, R.id.coupons_see_my_card_button);
                                                if (materialButton2 != null) {
                                                    i = R.id.coupons_stat_layout;
                                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) C20753c.m96463a(view2, R.id.coupons_stat_layout);
                                                    if (linearLayoutCompat2 != null) {
                                                        i = R.id.stub_coupons_list_empty;
                                                        ViewStub viewStub = (ViewStub) C20753c.m96463a(view2, R.id.stub_coupons_list_empty);
                                                        if (viewStub != null) {
                                                            i = R.id.stub_coupons_list_error;
                                                            ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view2, R.id.stub_coupons_list_error);
                                                            if (viewStub2 != null) {
                                                                return new C36879y1((ConstraintLayout) view2, swipeRefreshLayout, switchComponent, textView, textView2, textView3, textView4, materialButton, linearLayoutCompat, recyclerView, textView5, materialButton2, linearLayoutCompat2, viewStub, viewStub2);
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
    public static C36879y1 m151232c(@C0359n0 LayoutInflater layoutInflater) {
        return m151233d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36879y1 m151233d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_coupons_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151231a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91950a;
    }
}
