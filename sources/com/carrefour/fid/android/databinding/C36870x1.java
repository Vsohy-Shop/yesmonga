package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.filter.FilterItemRecyclerView;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.x1 */
public final class C36870x1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91889a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f91890b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f91891c;
    @C0359n0

    /* renamed from: d */
    public final LinearLayout f91892d;
    @C0359n0

    /* renamed from: e */
    public final FilterItemRecyclerView f91893e;
    @C0359n0

    /* renamed from: f */
    public final Guideline f91894f;
    @C0359n0

    /* renamed from: g */
    public final MaterialButton f91895g;

    public C36870x1(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 FilterItemRecyclerView filterItemRecyclerView, @C0359n0 Guideline guideline, @C0359n0 MaterialButton materialButton2) {
        this.f91889a = constraintLayout;
        this.f91890b = materialButton;
        this.f91891c = composeView;
        this.f91892d = linearLayout;
        this.f91893e = filterItemRecyclerView;
        this.f91894f = guideline;
        this.f91895g = materialButton2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36870x1 m151195a(@C0359n0 View view) {
        int i = R.id.apply_button;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, R.id.apply_button);
        if (materialButton != null) {
            i = R.id.coupons_filter_header;
            ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.coupons_filter_header);
            if (composeView != null) {
                i = R.id.coupons_filter_header_layout;
                LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.coupons_filter_header_layout);
                if (linearLayout != null) {
                    i = R.id.filters_list;
                    FilterItemRecyclerView filterItemRecyclerView = (FilterItemRecyclerView) C20753c.m96463a(view, R.id.filters_list);
                    if (filterItemRecyclerView != null) {
                        i = R.id.guideline;
                        Guideline guideline = (Guideline) C20753c.m96463a(view, R.id.guideline);
                        if (guideline != null) {
                            i = R.id.reset_button;
                            MaterialButton materialButton2 = (MaterialButton) C20753c.m96463a(view, R.id.reset_button);
                            if (materialButton2 != null) {
                                return new C36870x1((ConstraintLayout) view, materialButton, composeView, linearLayout, filterItemRecyclerView, guideline, materialButton2);
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
    public static C36870x1 m151196c(@C0359n0 LayoutInflater layoutInflater) {
        return m151197d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36870x1 m151197d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_coupons_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151195a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91889a;
    }
}
