package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.a */
public final class C27476a implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f66610a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f66611b;

    public C27476a(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ComposeView composeView) {
        this.f66610a = constraintLayout;
        this.f66611b = composeView;
    }

    @C0359n0
    /* renamed from: a */
    public static C27476a m115629a(@C0359n0 View view) {
        int i = C27609f.C27619j.alternative_products_bottom_sheet_compose_view;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, i);
        if (composeView != null) {
            return new C27476a((ConstraintLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27476a m115630c(@C0359n0 LayoutInflater layoutInflater) {
        return m115631d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27476a m115631d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.fragment_alternative_products_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115629a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f66610a;
    }
}
