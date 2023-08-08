package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.r7 */
public final class C36816r7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91586a;
    @C0359n0

    /* renamed from: b */
    public final View f91587b;
    @C0359n0

    /* renamed from: c */
    public final View f91588c;
    @C0359n0

    /* renamed from: d */
    public final View f91589d;
    @C0359n0

    /* renamed from: e */
    public final View f91590e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91591f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91592g;
    @C0359n0

    /* renamed from: h */
    public final View f91593h;

    public C36816r7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 View view5) {
        this.f91586a = constraintLayout;
        this.f91587b = view;
        this.f91588c = view2;
        this.f91589d = view3;
        this.f91590e = view4;
        this.f91591f = textView;
        this.f91592g = textView2;
        this.f91593h = view5;
    }

    @C0359n0
    /* renamed from: a */
    public static C36816r7 m150987a(@C0359n0 View view) {
        int i = R.id.blankPlaceholder;
        View a = C20753c.m96463a(view, R.id.blankPlaceholder);
        if (a != null) {
            i = R.id.btnAddProductBasketPlaceholder;
            View a2 = C20753c.m96463a(view, R.id.btnAddProductBasketPlaceholder);
            if (a2 != null) {
                i = R.id.productIdPlaceholder;
                View a3 = C20753c.m96463a(view, R.id.productIdPlaceholder);
                if (a3 != null) {
                    i = R.id.productPricePlaceholder;
                    View a4 = C20753c.m96463a(view, R.id.productPricePlaceholder);
                    if (a4 != null) {
                        i = R.id.productSubtitlePlaceholder;
                        TextView textView = (TextView) C20753c.m96463a(view, R.id.productSubtitlePlaceholder);
                        if (textView != null) {
                            i = R.id.productTitlePlaceHolder;
                            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.productTitlePlaceHolder);
                            if (textView2 != null) {
                                i = R.id.promotionPlaceholder;
                                View a5 = C20753c.m96463a(view, R.id.promotionPlaceholder);
                                if (a5 != null) {
                                    return new C36816r7((ConstraintLayout) view, a, a2, a3, a4, textView, textView2, a5);
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
    public static C36816r7 m150988c(@C0359n0 LayoutInflater layoutInflater) {
        return m150989d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36816r7 m150989d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_basket_builder_reco_cell, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150987a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91586a;
    }
}
