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

/* renamed from: com.carrefour.fid.android.databinding.z5 */
public final class C36892z5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f92025a;
    @C0359n0

    /* renamed from: b */
    public final View f92026b;
    @C0359n0

    /* renamed from: c */
    public final View f92027c;
    @C0359n0

    /* renamed from: d */
    public final View f92028d;
    @C0359n0

    /* renamed from: e */
    public final View f92029e;
    @C0359n0

    /* renamed from: f */
    public final View f92030f;
    @C0359n0

    /* renamed from: g */
    public final TextView f92031g;
    @C0359n0

    /* renamed from: h */
    public final TextView f92032h;
    @C0359n0

    /* renamed from: i */
    public final View f92033i;
    @C0359n0

    /* renamed from: j */
    public final View f92034j;
    @C0359n0

    /* renamed from: k */
    public final View f92035k;
    @C0359n0

    /* renamed from: l */
    public final View f92036l;

    public C36892z5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4, @C0359n0 View view5, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 View view6, @C0359n0 View view7, @C0359n0 View view8, @C0359n0 View view9) {
        this.f92025a = constraintLayout;
        this.f92026b = view;
        this.f92027c = view2;
        this.f92028d = view3;
        this.f92029e = view4;
        this.f92030f = view5;
        this.f92031g = textView;
        this.f92032h = textView2;
        this.f92033i = view6;
        this.f92034j = view7;
        this.f92035k = view8;
        this.f92036l = view9;
    }

    @C0359n0
    /* renamed from: a */
    public static C36892z5 m151281a(@C0359n0 View view) {
        int i = R.id.productIdPlaceholder;
        View a = C20753c.m96463a(view, R.id.productIdPlaceholder);
        if (a != null) {
            i = R.id.productIdPlaceholder2;
            View a2 = C20753c.m96463a(view, R.id.productIdPlaceholder2);
            if (a2 != null) {
                i = R.id.productIdPlaceholder3;
                View a3 = C20753c.m96463a(view, R.id.productIdPlaceholder3);
                if (a3 != null) {
                    i = R.id.productIdPlaceholder4;
                    View a4 = C20753c.m96463a(view, R.id.productIdPlaceholder4);
                    if (a4 != null) {
                        i = R.id.productIdPlaceholder5;
                        View a5 = C20753c.m96463a(view, R.id.productIdPlaceholder5);
                        if (a5 != null) {
                            i = R.id.productTitleBasketPlaceHolder;
                            TextView textView = (TextView) C20753c.m96463a(view, R.id.productTitleBasketPlaceHolder);
                            if (textView != null) {
                                i = R.id.productTitlePlaceHolder;
                                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.productTitlePlaceHolder);
                                if (textView2 != null) {
                                    i = R.id.view_sep_1;
                                    View a6 = C20753c.m96463a(view, R.id.view_sep_1);
                                    if (a6 != null) {
                                        i = R.id.view_sep_2;
                                        View a7 = C20753c.m96463a(view, R.id.view_sep_2);
                                        if (a7 != null) {
                                            i = R.id.view_sep_3;
                                            View a8 = C20753c.m96463a(view, R.id.view_sep_3);
                                            if (a8 != null) {
                                                i = R.id.view_sep_4;
                                                View a9 = C20753c.m96463a(view, R.id.view_sep_4);
                                                if (a9 != null) {
                                                    return new C36892z5((ConstraintLayout) view, a, a2, a3, a4, a5, textView, textView2, a6, a7, a8, a9);
                                                }
                                            }
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
    public static C36892z5 m151282c(@C0359n0 LayoutInflater layoutInflater) {
        return m151283d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36892z5 m151283d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.home_shop_details_place_holder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151281a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92025a;
    }
}
