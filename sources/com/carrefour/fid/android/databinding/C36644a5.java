package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.a5 */
public final class C36644a5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90556a;
    @C0359n0

    /* renamed from: b */
    public final Guideline f90557b;
    @C0359n0

    /* renamed from: c */
    public final TextView f90558c;
    @C0359n0

    /* renamed from: d */
    public final TextView f90559d;
    @C0359n0

    /* renamed from: e */
    public final RecyclerView f90560e;
    @C0359n0

    /* renamed from: f */
    public final TextView f90561f;
    @C0359n0

    /* renamed from: g */
    public final TextView f90562g;
    @C0359n0

    /* renamed from: h */
    public final TextView f90563h;
    @C0359n0

    /* renamed from: i */
    public final TextView f90564i;
    @C0359n0

    /* renamed from: j */
    public final View f90565j;
    @C0359n0

    /* renamed from: k */
    public final View f90566k;
    @C0359n0

    /* renamed from: l */
    public final View f90567l;
    @C0359n0

    /* renamed from: m */
    public final View f90568m;
    @C0359n0

    /* renamed from: n */
    public final View f90569n;

    public C36644a5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Guideline guideline, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 RecyclerView recyclerView, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4, @C0359n0 View view5) {
        this.f90556a = constraintLayout;
        this.f90557b = guideline;
        this.f90558c = textView;
        this.f90559d = textView2;
        this.f90560e = recyclerView;
        this.f90561f = textView3;
        this.f90562g = textView4;
        this.f90563h = textView5;
        this.f90564i = textView6;
        this.f90565j = view;
        this.f90566k = view2;
        this.f90567l = view3;
        this.f90568m = view4;
        this.f90569n = view5;
    }

    @C0359n0
    /* renamed from: a */
    public static C36644a5 m150305a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.offline_details_vat_amount_tax_guideline;
        Guideline guideline = (Guideline) C20753c.m96463a(view2, R.id.offline_details_vat_amount_tax_guideline);
        if (guideline != null) {
            i = R.id.text_holder_order_offline_details_vat_amount_tax_title;
            TextView textView = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_offline_details_vat_amount_tax_title);
            if (textView != null) {
                i = R.id.text_holder_order_offline_details_vat_amount_title;
                TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_offline_details_vat_amount_title);
                if (textView2 != null) {
                    i = R.id.text_holder_order_offline_details_vat_list;
                    RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view2, R.id.text_holder_order_offline_details_vat_list);
                    if (recyclerView != null) {
                        i = R.id.text_holder_order_offline_details_vat_percentage_title;
                        TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_offline_details_vat_percentage_title);
                        if (textView3 != null) {
                            i = R.id.text_holder_order_offline_details_vat_total_amount;
                            TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_offline_details_vat_total_amount);
                            if (textView4 != null) {
                                i = R.id.text_holder_order_offline_details_vat_total_amount_tax;
                                TextView textView5 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_offline_details_vat_total_amount_tax);
                                if (textView5 != null) {
                                    i = R.id.text_holder_order_offline_details_vat_total_title;
                                    TextView textView6 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_offline_details_vat_total_title);
                                    if (textView6 != null) {
                                        i = R.id.view_holder_order_offline_details_background;
                                        View a = C20753c.m96463a(view2, R.id.view_holder_order_offline_details_background);
                                        if (a != null) {
                                            i = R.id.view_holder_order_offline_details_divider;
                                            View a2 = C20753c.m96463a(view2, R.id.view_holder_order_offline_details_divider);
                                            if (a2 != null) {
                                                i = R.id.view_holder_order_offline_details_divider_bottom;
                                                View a3 = C20753c.m96463a(view2, R.id.view_holder_order_offline_details_divider_bottom);
                                                if (a3 != null) {
                                                    i = R.id.view_holder_order_offline_details_vat_title_divider;
                                                    View a4 = C20753c.m96463a(view2, R.id.view_holder_order_offline_details_vat_title_divider);
                                                    if (a4 != null) {
                                                        i = R.id.view_holder_order_offline_details_vat_total_divider;
                                                        View a5 = C20753c.m96463a(view2, R.id.view_holder_order_offline_details_vat_total_divider);
                                                        if (a5 != null) {
                                                            return new C36644a5((ConstraintLayout) view2, guideline, textView, textView2, recyclerView, textView3, textView4, textView5, textView6, a, a2, a3, a4, a5);
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
    public static C36644a5 m150306c(@C0359n0 LayoutInflater layoutInflater) {
        return m150307d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36644a5 m150307d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_offline_vat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150305a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90556a;
    }
}
