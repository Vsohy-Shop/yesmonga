package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.l0 */
public final class C36749l0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91163a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f91164b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f91165c;
    @C0359n0

    /* renamed from: d */
    public final Button f91166d;
    @C0359n0

    /* renamed from: e */
    public final RecyclerView f91167e;
    @C0359n0

    /* renamed from: f */
    public final ProgressBar f91168f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91169g;

    public C36749l0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 Button button, @C0359n0 RecyclerView recyclerView, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView) {
        this.f91163a = constraintLayout;
        this.f91164b = composeView;
        this.f91165c = linearLayout;
        this.f91166d = button;
        this.f91167e = recyclerView;
        this.f91168f = progressBar;
        this.f91169g = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36749l0 m150723a(@C0359n0 View view) {
        int i = R.id.additional_order_srp_header;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.additional_order_srp_header);
        if (composeView != null) {
            i = R.id.additional_order_srp_header_layout;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.additional_order_srp_header_layout);
            if (linearLayout != null) {
                i = R.id.button_product_search_clear;
                Button button = (Button) C20753c.m96463a(view, R.id.button_product_search_clear);
                if (button != null) {
                    i = R.id.list_product_search;
                    RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_product_search);
                    if (recyclerView != null) {
                        i = R.id.progress_bar_product_search;
                        ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.progress_bar_product_search);
                        if (progressBar != null) {
                            i = R.id.text_product_search_title;
                            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_product_search_title);
                            if (textView != null) {
                                return new C36749l0((ConstraintLayout) view, composeView, linearLayout, button, recyclerView, progressBar, textView);
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
    public static C36749l0 m150724c(@C0359n0 LayoutInflater layoutInflater) {
        return m150725d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36749l0 m150725d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_additional_order_product_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150723a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91163a;
    }
}
