package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.h3 */
public final class C36712h3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90949a;
    @C0359n0

    /* renamed from: b */
    public final LinearLayout f90950b;
    @C0359n0

    /* renamed from: c */
    public final MaterialButton f90951c;
    @C0359n0

    /* renamed from: d */
    public final ComposeView f90952d;
    @C0359n0

    /* renamed from: e */
    public final LinearLayout f90953e;
    @C0359n0

    /* renamed from: f */
    public final MaterialButton f90954f;
    @C0359n0

    /* renamed from: g */
    public final LinearLayout f90955g;
    @C0359n0

    /* renamed from: h */
    public final ScrollView f90956h;

    public C36712h3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 LinearLayout linearLayout, @C0359n0 MaterialButton materialButton, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout2, @C0359n0 MaterialButton materialButton2, @C0359n0 LinearLayout linearLayout3, @C0359n0 ScrollView scrollView) {
        this.f90949a = constraintLayout;
        this.f90950b = linearLayout;
        this.f90951c = materialButton;
        this.f90952d = composeView;
        this.f90953e = linearLayout2;
        this.f90954f = materialButton2;
        this.f90955g = linearLayout3;
        this.f90956h = scrollView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36712h3 m150575a(@C0359n0 View view) {
        int i = R.id.product_search_with_list_buttons_layout;
        LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.product_search_with_list_buttons_layout);
        if (linearLayout != null) {
            i = R.id.product_search_with_list_delete_all_button;
            MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, R.id.product_search_with_list_delete_all_button);
            if (materialButton != null) {
                i = R.id.product_search_with_list_header;
                ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.product_search_with_list_header);
                if (composeView != null) {
                    i = R.id.product_search_with_list_header_layout;
                    LinearLayout linearLayout2 = (LinearLayout) C20753c.m96463a(view, R.id.product_search_with_list_header_layout);
                    if (linearLayout2 != null) {
                        i = R.id.product_search_with_list_see_results_button;
                        MaterialButton materialButton2 = (MaterialButton) C20753c.m96463a(view, R.id.product_search_with_list_see_results_button);
                        if (materialButton2 != null) {
                            i = R.id.search_item_container;
                            LinearLayout linearLayout3 = (LinearLayout) C20753c.m96463a(view, R.id.search_item_container);
                            if (linearLayout3 != null) {
                                i = R.id.search_item_scroll_view;
                                ScrollView scrollView = (ScrollView) C20753c.m96463a(view, R.id.search_item_scroll_view);
                                if (scrollView != null) {
                                    return new C36712h3((ConstraintLayout) view, linearLayout, materialButton, composeView, linearLayout2, materialButton2, linearLayout3, scrollView);
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
    public static C36712h3 m150576c(@C0359n0 LayoutInflater layoutInflater) {
        return m150577d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36712h3 m150577d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_product_search_with_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150575a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90949a;
    }
}
