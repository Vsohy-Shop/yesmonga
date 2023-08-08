package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.f3 */
public final class C36692f3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90800a;
    @C0359n0

    /* renamed from: b */
    public final Button f90801b;
    @C0359n0

    /* renamed from: c */
    public final RecyclerView f90802c;
    @C0359n0

    /* renamed from: d */
    public final RecyclerView f90803d;
    @C0359n0

    /* renamed from: e */
    public final ProgressBar f90804e;
    @C0359n0

    /* renamed from: f */
    public final NestedScrollView f90805f;
    @C0359n0

    /* renamed from: g */
    public final TextView f90806g;
    @C0359n0

    /* renamed from: h */
    public final TextView f90807h;

    public C36692f3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView recyclerView2, @C0359n0 ProgressBar progressBar, @C0359n0 NestedScrollView nestedScrollView, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f90800a = constraintLayout;
        this.f90801b = button;
        this.f90802c = recyclerView;
        this.f90803d = recyclerView2;
        this.f90804e = progressBar;
        this.f90805f = nestedScrollView;
        this.f90806g = textView;
        this.f90807h = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36692f3 m150495a(@C0359n0 View view) {
        int i = R.id.button_product_list_filters_submit;
        Button button = (Button) C20753c.m96463a(view, R.id.button_product_list_filters_submit);
        if (button != null) {
            i = R.id.list_product_list_filters_facet;
            RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_product_list_filters_facet);
            if (recyclerView != null) {
                i = R.id.list_product_list_filters_sort;
                RecyclerView recyclerView2 = (RecyclerView) C20753c.m96463a(view, R.id.list_product_list_filters_sort);
                if (recyclerView2 != null) {
                    i = R.id.progress_bar_product_list_filters;
                    ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.progress_bar_product_list_filters);
                    if (progressBar != null) {
                        i = R.id.scroll_product_list_filters;
                        NestedScrollView nestedScrollView = (NestedScrollView) C20753c.m96463a(view, R.id.scroll_product_list_filters);
                        if (nestedScrollView != null) {
                            i = R.id.text_product_list_filters_facet;
                            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_product_list_filters_facet);
                            if (textView != null) {
                                i = R.id.text_product_list_filters_sort;
                                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_product_list_filters_sort);
                                if (textView2 != null) {
                                    return new C36692f3((ConstraintLayout) view, button, recyclerView, recyclerView2, progressBar, nestedScrollView, textView, textView2);
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
    public static C36692f3 m150496c(@C0359n0 LayoutInflater layoutInflater) {
        return m150497d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36692f3 m150497d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_product_list_filters_sort_and_facet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150495a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90800a;
    }
}
