package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.o4 */
public final class C36783o4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91434a;
    @C0359n0

    /* renamed from: b */
    public final Button f91435b;
    @C0359n0

    /* renamed from: c */
    public final Group f91436c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f91437d;
    @C0359n0

    /* renamed from: e */
    public final RecyclerView f91438e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91439f;

    public C36783o4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 Group group, @C0359n0 ImageView imageView, @C0359n0 RecyclerView recyclerView, @C0359n0 TextView textView) {
        this.f91434a = constraintLayout;
        this.f91435b = button;
        this.f91436c = group;
        this.f91437d = imageView;
        this.f91438e = recyclerView;
        this.f91439f = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36783o4 m150859a(@C0359n0 View view) {
        int i = R.id.button_offer_product_unavailable_basket;
        Button button = (Button) C20753c.m96463a(view, R.id.button_offer_product_unavailable_basket);
        if (button != null) {
            i = R.id.group_offer_product_unavailable_basket;
            Group group = (Group) C20753c.m96463a(view, R.id.group_offer_product_unavailable_basket);
            if (group != null) {
                i = R.id.image_offer_product_unavailable_basket_icon;
                ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_offer_product_unavailable_basket_icon);
                if (imageView != null) {
                    i = R.id.list_offer_product_unavailable_basket;
                    RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_offer_product_unavailable_basket);
                    if (recyclerView != null) {
                        i = R.id.text_offer_product_unavailable_basket_description;
                        TextView textView = (TextView) C20753c.m96463a(view, R.id.text_offer_product_unavailable_basket_description);
                        if (textView != null) {
                            return new C36783o4((ConstraintLayout) view, button, group, imageView, recyclerView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36783o4 m150860c(@C0359n0 LayoutInflater layoutInflater) {
        return m150861d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36783o4 m150861d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_offer_product_unavailable_basket, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150859a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91434a;
    }
}
