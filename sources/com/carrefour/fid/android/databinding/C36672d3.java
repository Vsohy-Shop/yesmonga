package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.d3 */
public final class C36672d3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90717a;
    @C0359n0

    /* renamed from: b */
    public final FrameLayout f90718b;
    @C0359n0

    /* renamed from: c */
    public final C36787o8 f90719c;

    public C36672d3(@C0359n0 LinearLayout linearLayout, @C0359n0 FrameLayout frameLayout, @C0359n0 C36787o8 o8Var) {
        this.f90717a = linearLayout;
        this.f90718b = frameLayout;
        this.f90719c = o8Var;
    }

    @C0359n0
    /* renamed from: a */
    public static C36672d3 m150417a(@C0359n0 View view) {
        int i = R.id.layout_product_list_filter;
        FrameLayout frameLayout = (FrameLayout) C20753c.m96463a(view, R.id.layout_product_list_filter);
        if (frameLayout != null) {
            i = R.id.toolbar_product_list_filter;
            View a = C20753c.m96463a(view, R.id.toolbar_product_list_filter);
            if (a != null) {
                return new C36672d3((LinearLayout) view, frameLayout, C36787o8.m150875a(a));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36672d3 m150418c(@C0359n0 LayoutInflater layoutInflater) {
        return m150419d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36672d3 m150419d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_product_list_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150417a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90717a;
    }
}
