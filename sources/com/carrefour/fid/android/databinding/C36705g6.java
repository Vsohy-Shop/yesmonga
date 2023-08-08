package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.g6 */
public final class C36705g6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90897a;
    @C0359n0

    /* renamed from: b */
    public final LinearLayout f90898b;
    @C0359n0

    /* renamed from: c */
    public final RecyclerView f90899c;
    @C0359n0

    /* renamed from: d */
    public final TextView f90900d;

    public C36705g6(@C0359n0 LinearLayout linearLayout, @C0359n0 LinearLayout linearLayout2, @C0359n0 RecyclerView recyclerView, @C0359n0 TextView textView) {
        this.f90897a = linearLayout;
        this.f90898b = linearLayout2;
        this.f90899c = recyclerView;
        this.f90900d = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36705g6 m150547a(@C0359n0 View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.home_promo_banners;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.home_promo_banners);
        if (recyclerView != null) {
            i = R.id.home_promo_title;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.home_promo_title);
            if (textView != null) {
                return new C36705g6(linearLayout, linearLayout, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36705g6 m150548c(@C0359n0 LayoutInflater layoutInflater) {
        return m150549d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36705g6 m150549d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_home_promo_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150547a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90897a;
    }
}
