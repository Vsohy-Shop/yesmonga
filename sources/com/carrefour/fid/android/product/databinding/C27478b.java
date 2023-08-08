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

/* renamed from: com.carrefour.fid.android.product.databinding.b */
public final class C27478b implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f66617a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f66618b;

    public C27478b(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ComposeView composeView) {
        this.f66617a = constraintLayout;
        this.f66618b = composeView;
    }

    @C0359n0
    /* renamed from: a */
    public static C27478b m115637a(@C0359n0 View view) {
        int i = C27609f.C27619j.compose_view;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, i);
        if (composeView != null) {
            return new C27478b((ConstraintLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27478b m115638c(@C0359n0 LayoutInflater layoutInflater) {
        return m115639d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27478b m115639d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.fragment_facet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115637a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f66617a;
    }
}
