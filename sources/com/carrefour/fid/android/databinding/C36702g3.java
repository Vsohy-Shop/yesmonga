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
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.g3 */
public final class C36702g3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90882a;
    @C0359n0

    /* renamed from: b */
    public final Button f90883b;
    @C0359n0

    /* renamed from: c */
    public final MaterialButton f90884c;
    @C0359n0

    /* renamed from: d */
    public final RecyclerView f90885d;
    @C0359n0

    /* renamed from: e */
    public final ComposeView f90886e;
    @C0359n0

    /* renamed from: f */
    public final LinearLayout f90887f;
    @C0359n0

    /* renamed from: g */
    public final Group f90888g;
    @C0359n0

    /* renamed from: h */
    public final ProgressBar f90889h;
    @C0359n0

    /* renamed from: i */
    public final View f90890i;
    @C0359n0

    /* renamed from: j */
    public final TextView f90891j;

    public C36702g3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 MaterialButton materialButton, @C0359n0 RecyclerView recyclerView, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 Group group, @C0359n0 ProgressBar progressBar, @C0359n0 View view, @C0359n0 TextView textView) {
        this.f90882a = constraintLayout;
        this.f90883b = button;
        this.f90884c = materialButton;
        this.f90885d = recyclerView;
        this.f90886e = composeView;
        this.f90887f = linearLayout;
        this.f90888g = group;
        this.f90889h = progressBar;
        this.f90890i = view;
        this.f90891j = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36702g3 m150535a(@C0359n0 View view) {
        int i = R.id.button_product_search_clear;
        Button button = (Button) C20753c.m96463a(view, R.id.button_product_search_clear);
        if (button != null) {
            i = R.id.button_product_search_with_list;
            MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, R.id.button_product_search_with_list);
            if (materialButton != null) {
                i = R.id.list_product_search;
                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_product_search);
                if (recyclerView != null) {
                    i = R.id.product_search_header;
                    ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.product_search_header);
                    if (composeView != null) {
                        i = R.id.product_search_header_layout;
                        LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.product_search_header_layout);
                        if (linearLayout != null) {
                            i = R.id.product_search_with_list_view_group;
                            Group group = (Group) C20753c.m96463a(view, R.id.product_search_with_list_view_group);
                            if (group != null) {
                                i = R.id.progress_bar_product_search;
                                ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.progress_bar_product_search);
                                if (progressBar != null) {
                                    i = R.id.separator_product_search_with_list;
                                    View a = C20753c.m96463a(view, R.id.separator_product_search_with_list);
                                    if (a != null) {
                                        i = R.id.text_product_search_title;
                                        TextView textView = (TextView) C20753c.m96463a(view, R.id.text_product_search_title);
                                        if (textView != null) {
                                            return new C36702g3((ConstraintLayout) view, button, materialButton, recyclerView, composeView, linearLayout, group, progressBar, a, textView);
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
    public static C36702g3 m150536c(@C0359n0 LayoutInflater layoutInflater) {
        return m150537d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36702g3 m150537d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_product_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150535a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90882a;
    }
}
