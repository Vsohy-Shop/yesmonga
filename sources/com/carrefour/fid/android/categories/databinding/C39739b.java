package com.carrefour.fid.android.categories.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.categories.C39711b;
import com.carrefour.fid.android.design.components.widgets.list.ListItemRecyclerView;

/* renamed from: com.carrefour.fid.android.categories.databinding.b */
public final class C39739b implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f101390a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f101391b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f101392c;
    @C0359n0

    /* renamed from: d */
    public final ListItemRecyclerView f101393d;

    public C39739b(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 ListItemRecyclerView listItemRecyclerView) {
        this.f101390a = constraintLayout;
        this.f101391b = composeView;
        this.f101392c = linearLayout;
        this.f101393d = listItemRecyclerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C39739b m162175a(@C0359n0 View view) {
        int i = C39711b.C39721j.department_details_header;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, i);
        if (composeView != null) {
            i = C39711b.C39721j.department_details_header_layout;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, i);
            if (linearLayout != null) {
                i = C39711b.C39721j.department_details_list;
                ListItemRecyclerView listItemRecyclerView = (ListItemRecyclerView) C20753c.m96463a(view, i);
                if (listItemRecyclerView != null) {
                    return new C39739b((ConstraintLayout) view, composeView, linearLayout, listItemRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39739b m162176c(@C0359n0 LayoutInflater layoutInflater) {
        return m162177d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39739b m162177d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39711b.C39724m.fragment_department_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m162175a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f101390a;
    }
}
