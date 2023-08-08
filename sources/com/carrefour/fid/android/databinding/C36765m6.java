package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.m6 */
public final class C36765m6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91316a;
    @C0359n0

    /* renamed from: b */
    public final Group f91317b;
    @C0359n0

    /* renamed from: c */
    public final RecyclerView f91318c;
    @C0359n0

    /* renamed from: d */
    public final ShimmerFrameLayout f91319d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91320e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91321f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91322g;
    @C0359n0

    /* renamed from: h */
    public final TextView f91323h;
    @C0359n0

    /* renamed from: i */
    public final Button f91324i;
    @C0359n0

    /* renamed from: j */
    public final TextView f91325j;

    public C36765m6(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Group group, @C0359n0 RecyclerView recyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 Button button, @C0359n0 TextView textView5) {
        this.f91316a = constraintLayout;
        this.f91317b = group;
        this.f91318c = recyclerView;
        this.f91319d = shimmerFrameLayout;
        this.f91320e = textView;
        this.f91321f = textView2;
        this.f91322g = textView3;
        this.f91323h = textView4;
        this.f91324i = button;
        this.f91325j = textView5;
    }

    @C0359n0
    /* renamed from: a */
    public static C36765m6 m150787a(@C0359n0 View view) {
        int i = R.id.basket_group;
        Group group = (Group) C20753c.m96463a(view, R.id.basket_group);
        if (group != null) {
            i = R.id.basket_list;
            RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.basket_list);
            if (recyclerView != null) {
                i = R.id.shimmer_layout_home_online_shop;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_layout_home_online_shop);
                if (shimmerFrameLayout != null) {
                    i = R.id.text_online_shop_details_basket_count;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.text_online_shop_details_basket_count);
                    if (textView != null) {
                        i = R.id.text_online_shop_details_basket_discount;
                        TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_online_shop_details_basket_discount);
                        if (textView2 != null) {
                            i = R.id.text_online_shop_details_basket_label;
                            TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_online_shop_details_basket_label);
                            if (textView3 != null) {
                                i = R.id.text_online_shop_details_basket_price;
                                TextView textView4 = (TextView) C20753c.m96463a(view, R.id.text_online_shop_details_basket_price);
                                if (textView4 != null) {
                                    i = R.id.text_online_shop_details_basket_redirect;
                                    Button button = (Button) C20753c.m96463a(view, R.id.text_online_shop_details_basket_redirect);
                                    if (button != null) {
                                        i = R.id.text_online_shop_details_title;
                                        TextView textView5 = (TextView) C20753c.m96463a(view, R.id.text_online_shop_details_title);
                                        if (textView5 != null) {
                                            return new C36765m6((ConstraintLayout) view, group, recyclerView, shimmerFrameLayout, textView, textView2, textView3, textView4, button, textView5);
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
    public static C36765m6 m150788c(@C0359n0 LayoutInflater layoutInflater) {
        return m150789d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36765m6 m150789d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_online_shop_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150787a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91316a;
    }
}
